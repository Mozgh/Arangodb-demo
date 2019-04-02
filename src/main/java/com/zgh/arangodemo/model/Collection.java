package com.zgh.arangodemo.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Collection {

    private String collection;

    private List<String> index;

    public Collection(String collection) {
        this.collection = collection;
    }

}
