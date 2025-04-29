package com.crudS5.crudpersonas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudS5.crudpersonas.model.Persona;
import com.crudS5.crudpersonas.repository.PersonaRepostory;

@Service
public class PersonaService {
    @Autowired
    private PersonaRepostory personaRepostory;

    public Persona guardarPersona(Persona persona){
        return personaRepostory.create(persona);
    }
}
