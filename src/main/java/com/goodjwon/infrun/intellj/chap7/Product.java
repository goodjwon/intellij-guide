package com.goodjwon.infrun.intellj.chap7;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@NoArgsConstructor
@Document
public class Product {

    @Id
    private ObjectId id;

    private long amount;

    private String name;


    @Builder
    public Product(long amount, String name) {
        this.amount = amount;
        this.name = name;
    }

    public ObjectId getId() {
        return id;
    }

    public long getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }
}
