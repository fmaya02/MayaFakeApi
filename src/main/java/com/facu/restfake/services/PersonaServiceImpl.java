package com.facu.restfake.services;

import com.facu.restfake.entities.Persona;
import com.facu.restfake.repositories.BaseRepository;
import com.facu.restfake.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonaServiceImpl extends BaseServiceImpl<Persona,Long> implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl (BaseRepository<Persona,Long> baseRepository, PersonaRepository personaRepository){
        super(baseRepository);
        this.personaRepository = personaRepository;
    }
}
