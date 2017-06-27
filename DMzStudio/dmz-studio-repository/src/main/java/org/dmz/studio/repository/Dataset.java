package org.dmz.studio.repository;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Dataset {

    @Id
    public String id;
    
    public String apiMethod;
    public String description;
    public List<Fields> fields;
    
    public Dataset() {}

    public Dataset(String apiMethod, String description, List<Fields> fields) {
        this.apiMethod = apiMethod;
        this.description = description;
        this.fields = fields;
    }
}
