package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Empleado;
import com.uca.capas.repository.EmpleadoRepository;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

	@Autowired
	EmpleadoRepository empleadoRepository;

	@Override
	public List<Empleado> getAllEmpleados() {
		return empleadoRepository.findAll();
	}

	@Override
	public Empleado getEmpleadoById(Integer id) {
		return empleadoRepository.findOne(id);
	}

	@Override
	public Empleado saveEmpleado(Empleado empleado) {
		return empleadoRepository.save(empleado);
	}

	@Override
	public void deleteEmpleado(Integer id) {
		empleadoRepository.delete(id);
	}

}
