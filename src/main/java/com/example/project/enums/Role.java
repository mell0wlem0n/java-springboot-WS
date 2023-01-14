package com.example.project.enums;

public enum Role {
    ADMIN("Admin"),
    USER("User");

    private final String value;

    Role(final String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }
}
