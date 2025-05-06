package com.crudS5.crudpersonas.repository;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.crudS5.crudpersonas.model.Persona;


@Repository
public class PersonaRepostory {
    List<Persona> personas = new ArrayList<>();

    /*
     * 
     *  SOLO PRUEBAS
     * 
     */

    public PersonaRepostory(){
        personas.add(new Persona(1, "12345678-9", "Juan", "Pérez", 30));
        personas.add(new Persona(2, "98765432-1", "María", "González", 25));
        personas.add(new Persona(3, "45678912-3", "Carlos", "Ramírez", 40));
        personas.add(new Persona(4, "32165498-7", "Sofía", "Martínez", 22));
        personas.add(new Persona(5, "74125896-4", "Andrés", "Fernández", 35));
    }

    /*
     * 
     * 
     * 
     */

    public Persona create(Persona persona){
        personas.add(persona);
        System.out.println(personas.toString());
        return persona;
    }

    public List<Persona> readAll(){
        return personas;
    }

    public Persona read(int id){
        for (Persona persona : personas) {
            if(persona.getId()==id){
                return persona;
            }
        }
        return null;
    }

    public Persona update(int id, Persona pmodificada){
        Persona per = read(id);
        if (per != null){
            per.setNombre(pmodificada.getNombre());
            per.setApellido(pmodificada.getApellido());
            per.setEdad(pmodificada.getEdad());
            return per;
        }
        return null;
    }

    public String delete(int id){
        Persona kill = read(id);
        if(kill!=null){
            personas.remove(kill);
            return "GG papito, " + kill.getNombre() +" te eliminaron";
        }
        return "Persona no encontrada";
    }

    public Persona readxRut(String rut){
        for (Persona persona : personas) {
            if(persona.getRut().equals(rut)){
                return persona;
            }
        }
        return null;
    }

}
