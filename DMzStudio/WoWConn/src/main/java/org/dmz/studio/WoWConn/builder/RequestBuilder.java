package org.dmz.studio.WoWConn.builder;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.dmz.studio.WoWConn.Request;
import org.dmz.studio.WoWConn.constants.RequestParams;
import org.dmz.studio.WoWConn.constants.RequestType;

public class RequestBuilder {
    private RequestType requestType;
    private Map<RequestParams, String> requiredParamValues;
    private Map<String, String> optionalParamValues;

    private RequestBuilder() {
        this.requestType = null;
        this.requiredParamValues = new HashMap<>();
        this.optionalParamValues = new HashMap<>();
    }

    public static RequestBuilder create() {
        return new RequestBuilder();
    }

    public Request build() {
        if (!isComplete()) {
            throw new IllegalStateException("Request is not in bulidable state");
        }

        return new Request(requestType, requiredParamValues, optionalParamValues);
    }

    public boolean isComplete() {
        if (requestType == null) {
            return false;
        }

        if (requestType.getRequiredParams().size() > requiredParamValues.size()) {
            return false;
        }

        for (RequestParams requestParams : requestType.getRequiredParams()) {
            if (!requiredParamValues.containsKey(requestParams)) {
                return false;
            }

            if (StringUtils.isBlank(requiredParamValues.get(requestParams))) {
                return false;
            }
        }

        return true;
    }

    public RequestBuilder setRequestType(RequestType requestType) {
        this.requestType = requestType;
        return this;
    }

    public RequestBuilder addRequiredParamValue(RequestParams requestParams, String value) {
        if (this.requiredParamValues == null) {
            this.requiredParamValues = new HashMap<>();
        }

        this.requiredParamValues.put(requestParams, value);
        return this;
    }

    public RequestBuilder addOptionalParamValues(String key, String value) {
        if (this.optionalParamValues == null) {
            this.optionalParamValues = new HashMap<>();
        }

        if (this.optionalParamValues.containsKey(key)) {
            value = this.optionalParamValues.get(key) + "," + value;
        }

        this.optionalParamValues.put(key, value);

        return this;
    }
}