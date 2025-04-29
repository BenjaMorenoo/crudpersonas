package com.crudS5.crudpersonas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudS5.crudpersonas.model.Persona;
import com.crudS5.crudpersonas.service.PersonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;





@RestController
@RequestMapping("/api/personas")
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @GetMapping
    public String saludar() {
        return "api funcionando";
    }

    @PostMapping
    public Persona agregar(@RequestBody Persona persona){
        return personaService.guardarPersona(persona);
    }
    
    

}


