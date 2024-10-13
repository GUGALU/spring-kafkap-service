package com.example.kafka_project.payload;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Student {

    private int id;
    private String name;
    private String course;
}
