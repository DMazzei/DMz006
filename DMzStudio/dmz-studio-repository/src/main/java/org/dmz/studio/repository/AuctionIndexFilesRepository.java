package org.dmz.studio.repository;

import java.util.List;

import org.dmz.studio.repository.model.AuctionFile;
import org.dmz.studio.repository.model.AuctionIndexFiles;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;

@Component
@RepositoryRestResource(collectionResourceRel = "auctionIndexFiles", path = "auctionIndexFiles")
public interface AuctionIndexFilesRepository extends MongoRepository<AuctionIndexFiles, String> {

    public AuctionIndexFiles findByRealm(@Param("realm") String realm);
    public List<AuctionIndexFiles> findAll();
    
    public AuctionFile findByRealmLastMod(@Param("realm") String realm, @Param("lastModified") Long lastModified);
}