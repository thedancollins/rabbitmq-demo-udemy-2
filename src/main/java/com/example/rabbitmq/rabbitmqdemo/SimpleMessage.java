package com.example.rabbitmq.rabbitmqdemo;

import java.io.Serializable;

public class SimpleMessage  implements Serializable {

    private String name;
    private String Description;

    public SimpleMessage() {}

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return Description;
    }

    @Override
    public String toString() {
        return "SimpleMessage{" +
                "name='" + name + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }
}
