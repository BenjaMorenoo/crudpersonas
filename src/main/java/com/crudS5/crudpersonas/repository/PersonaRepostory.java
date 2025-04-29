package com.crudS5.crudpersonas.repository;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.crudS5.crudpersonas.model.Persona;


@Repository
public class PersonaRepostory {
    List<Persona> personas = new ArrayList<>();

    public Persona create(Persona persona){
        personas.add(persona);
        System.out.println(personas.toString());
        return persona;
    }
}
