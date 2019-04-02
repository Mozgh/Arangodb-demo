package com.zgh.arangodemo.controller;

import com.zgh.arangodemo.model.Collection;
import com.zgh.arangodemo.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CollectionController {

    @Autowired
    private CollectionService collectionService;

    @GetMapping("/collection")
    public List<Collection> getCollections() {
        return collectionService.getCollection();
    }

}
