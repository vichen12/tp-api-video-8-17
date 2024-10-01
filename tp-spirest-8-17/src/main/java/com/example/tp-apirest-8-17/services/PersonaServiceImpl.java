package com.example.tp_apirest_dsw.services;

import com.example.tp_apirest_dsw.entities.Persona;
import com.example.tp_apirest_dsw.repositories.BaseRepository;
import com.example.tp_apirest_dsw.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaServices{

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository) {
        super(baseRepository);
    }
}
