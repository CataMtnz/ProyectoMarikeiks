package com.generation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.models.DespachoRetiro;

@Repository
public interface DespachoRetiroRepository extends JpaRepository <DespachoRetiro, Long> {
    
}
