package com.facu.restfake.controllers;

import com.facu.restfake.entities.Persona;
import com.facu.restfake.services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "MayaFakeApi.com/personas")
public class PersonaControllerImpl extends BaseControllerImpl<Persona, PersonaServiceImpl> {
}
