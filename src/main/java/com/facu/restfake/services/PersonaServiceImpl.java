package com.facu.restfake.services;

import com.facu.restfake.entities.Libro;
import com.facu.restfake.entities.Persona;
import com.facu.restfake.repositories.BaseRepository;
import com.facu.restfake.repositories.PersonaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona,Long> implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    //@Autowired
    //private LibroServiceImpl libroService;

    public PersonaServiceImpl (BaseRepository<Persona,Long> baseRepository, PersonaRepository personaRepository){
        super(baseRepository);
        this.personaRepository = personaRepository;
    }

   // @Transactional
   // public Libro addLibro(Long id, Libro libro) throws Exception {
   //     try{
   //         libroService.save(libro);
   //         Optional<Persona> personaOptional = personaRepository.findById(id);
   //         Persona per = //personaOptional.get();
   //         per.addLibro(libro);
   //         return libro;
   //     } catch (Exception e){
   //         throw new Exception(e.getMessage());
   //     }
   // }
}
