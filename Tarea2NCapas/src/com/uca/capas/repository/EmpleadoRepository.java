package com.uca.capas.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uca.capas.domain.Empleado;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {

}
