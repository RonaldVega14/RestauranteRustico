package com.uca.capas.service;

import java.util.List;

import com.uca.capas.domain.Sucursal;

public interface SucursalService {

	public List<Sucursal> getAllSucursales();

	public Sucursal getSucursalById(Long id);

	public Sucursal saveSucursal(Sucursal sucursal);

	public void deleteSucursal(Long id);
}
