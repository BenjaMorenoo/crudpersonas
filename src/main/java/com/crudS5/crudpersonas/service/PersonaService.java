package com.crudS5.crudpersonas.service;

import java.util.List;

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

    public List<Persona> listarTodas(){
        return personaRepostory.readAll();
    }

    public Persona buscarxId(int id){
        return personaRepostory.read(id);
    }

    public Persona modificarPersona(int id, Persona pmodificada){
        return personaRepostory.update(id, pmodificada);
    }

    public String eliminarPersona(int id){
        return personaRepostory.delete(id);
    }
}
