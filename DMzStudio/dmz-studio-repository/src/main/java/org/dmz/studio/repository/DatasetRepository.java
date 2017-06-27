package org.dmz.studio.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;

@Component
@RepositoryRestResource(collectionResourceRel = "dataset", path = "dataset")
public interface DatasetRepository extends MongoRepository<Dataset, String> {

    public Dataset findByApiMethod(@Param("apiMethod") String apiMethod);
    public List<Dataset> findAll();
}