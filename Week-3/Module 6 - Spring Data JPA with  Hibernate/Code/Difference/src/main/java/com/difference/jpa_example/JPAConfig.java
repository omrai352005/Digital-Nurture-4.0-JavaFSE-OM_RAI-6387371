package com.difference.jpa_example;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAConfig {
    public static EntityManagerFactory getEntityManagerFactory() {
        return Persistence.createEntityManagerFactory("my-unit");
    }
}