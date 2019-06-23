package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Sucursal;
import com.uca.capas.repository.SucursalRepository;

@Service
public class SucursalServiceImpl implements SucursalService {

	@Autowired
	SucursalRepository sucursalRepository;

	@Override
	public List<Sucursal> getAllSucursales() {
		return sucursalRepository.findAll();
	}

	@Override
	public Sucursal getSucursalById(Integer id) {
		return sucursalRepository.findOne(id);
	}

	@Override
	public Sucursal saveSucursal(Sucursal sucursal) {
		return sucursalRepository.save(sucursal);
	}

	@Override
	public void deleteSucursal(Integer id) {
		sucursalRepository.delete(id);
	}

}
