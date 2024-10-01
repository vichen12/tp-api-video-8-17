package com.example.tp_apirest_dsw.services;

import com.example.tp_apirest_dsw.entities.Localidad;
import com.example.tp_apirest_dsw.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public abstract class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadServices{
    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}
