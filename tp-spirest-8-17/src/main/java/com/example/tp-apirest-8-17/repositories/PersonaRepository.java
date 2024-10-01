package com.example.tp_apirest_dsw.repositories;

import com.example.tp_apirest_dsw.entities.Persona;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
}
