package org.dmz.studio.WoWConn;

import org.apache.commons.lang3.StringUtils;
import org.dmz.studio.WoWConn.constants.Locale;
import org.dmz.studio.WoWConn.constants.Region;
import org.dmz.studio.WoWConn.response.AbstractResponse;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import org.stringtemplate.v4.ST;

import java.io.UnsupportedEncodingException;
import java.util.concurrent.ConcurrentHashMap;

public class Connection {
    
    private static final String API_BASE_URL = "https://<region>.api.battle.net/";
    private static final ConcurrentHashMap<String, Connection> CONNECTION_INSTANCES = new ConcurrentHashMap<>();

    private final String apiKey;
    private final Region region;
    private final Locale locale;

    private Connection(String apiKey, Region region, Locale locale) {
        this.apiKey = apiKey;
        this.region = region;
        this.locale = locale;
    }

    public static synchronized Connection getInstance(String apiKey, Region region, Locale locale) {
        if (StringUtils.isBlank(apiKey)) {
            throw new IllegalArgumentException("apiKey cannot be null or empty");
        }

        if (region == null) {
            throw new IllegalArgumentException("region cannot be null or empty");
        }

        String hashKey = apiKey + region.getRegion();

        return CONNECTION_INSTANCES.computeIfAbsent(hashKey, key -> new Connection(apiKey, region, locale == null ? Locale.EN_US : locale));
    }

    public static synchronized void flushConnections() {
        CONNECTION_INSTANCES.clear();
    }

    public static synchronized int availableConnections() {
        return CONNECTION_INSTANCES.size();
    }

    public synchronized <T extends AbstractResponse> T getRequestData(Request request) throws UnsupportedEncodingException {
        
        RestTemplate restTemplate = new RestTemplate();
        String url = getRequestUrl(request);
        
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<String>("RequestData", headers);
        
        return restTemplate.exchange(url, HttpMethod.GET, entity, (Class<T>) request.getRequestType().getResponseType()).getBody();
    }

    private String getRequestUrl(Request request) {
        String requestUrl = new ST(API_BASE_URL).add("region", this.region.getRegion()).render() + request.getGeneratedUrl();
        String apiKeyAndLocale = "";

        if (!request.hasApiKey()) {
            apiKeyAndLocale += "apiKey=" + this.apiKey;
        }

        if (!request.hasLocale()) {
            if (apiKeyAndLocale.length() != 0) {
                apiKeyAndLocale += "&";
            }

            apiKeyAndLocale += "locale=" + this.locale.getLocale();
        }

        if (!requestUrl.endsWith("?")) {
            requestUrl += "&";
        }

        return requestUrl + apiKeyAndLocale;
    }
}
