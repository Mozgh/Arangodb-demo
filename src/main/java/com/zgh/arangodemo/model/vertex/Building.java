package com.zgh.arangodemo.model.vertex;

import com.arangodb.springframework.annotation.Document;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@Document("Building")
public class Building {

    @Id
    private String id;

    private String address;

    private String name;

    private String floor;

}
