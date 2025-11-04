package com.example.tp8_spring_jpa.repositories;

import com.example.tp8_spring_jpa.entities.Client;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "clientDetails", types = Client.class)
public interface ClientProjection {
    public String getNom();
    public String getEmail();
}