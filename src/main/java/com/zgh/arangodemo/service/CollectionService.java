package com.zgh.arangodemo.service;

import com.zgh.arangodemo.model.Collection;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CollectionService {

    public List<Collection> getCollection() {
        List<Collection> collections = new ArrayList<>();
        collections.add(new Collection("building"));
        collections.add(new Collection("city"));
        return collections;
    }
}
