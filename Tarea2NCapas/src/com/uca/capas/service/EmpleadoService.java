package com.uca.capas.service;

import java.util.List;

import com.uca.capas.domain.Empleado;

public interface EmpleadoService {

	public List<Empleado> getAllEmpleados();

	public Empleado getEmpleadoById(Integer id);

	public Empleado saveEmpleado(Empleado empleado);

	public void deleteEmpleado(Integer id);
}
