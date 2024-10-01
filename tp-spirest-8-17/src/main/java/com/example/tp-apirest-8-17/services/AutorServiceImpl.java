package com.example.tp_apirest_dsw.services;

import com.example.tp_apirest_dsw.entities.Autor;
import com.example.tp_apirest_dsw.repositories.AutorRepository;
import com.example.tp_apirest_dsw.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorServices{

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}
