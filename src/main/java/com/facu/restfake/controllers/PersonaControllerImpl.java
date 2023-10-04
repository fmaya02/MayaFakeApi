package com.facu.restfake.controllers;

import com.facu.restfake.entities.Libro;
import com.facu.restfake.entities.Persona;
import com.facu.restfake.services.PersonaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "MayaFakeApi.com/personas")
public class PersonaControllerImpl extends BaseControllerImpl<Persona, PersonaServiceImpl> {
    //@PostMapping("/addlibro{id}")
    //public ResponseEntity<?> addLibro(@PathVariable Long id, @RequestBody Libro libro){
    //    try {
    //        return ResponseEntity.status(HttpStatus.OK).body(servicio.addLibro(id, //libro));
    //    }catch (Exception e) {
    //        String strErr = e.getMessage();
    //        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":"+strErr+"}");
    //    }
    //}
}
