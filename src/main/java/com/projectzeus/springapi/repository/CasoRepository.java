package com.projectzeus.springapi.repository;

import com.projectzeus.springapi.models.Caso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CasoRepository extends JpaRepository<Caso, Long> {
    Caso findOneById(Long id);
}
