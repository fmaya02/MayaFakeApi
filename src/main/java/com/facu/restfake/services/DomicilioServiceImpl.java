package com.facu.restfake.services;

import com.facu.restfake.entities.Domicilio;
import com.facu.restfake.repositories.BaseRepository;
import com.facu.restfake.repositories.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio,Long> implements DomicilioService {

    @Autowired
    private DomicilioRepository domicilioRepository;

    public DomicilioServiceImpl (BaseRepository<Domicilio,Long> baseRepository, DomicilioRepository domicilioRepository){
        super(baseRepository);
        this.domicilioRepository = domicilioRepository;
    }
}
