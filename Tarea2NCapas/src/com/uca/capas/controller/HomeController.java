package com.uca.capas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.service.SucursalService;
import com.uca.capas.domain.Sucursal;

@Controller
public class HomeController {

	@Autowired
	SucursalService sucursalService;
	
	@RequestMapping("/home")
	public ModelAndView initHome() {
		ModelAndView mav = new ModelAndView();
		List<Sucursal> sucursales = null;
		try {
			sucursales = sucursalService.getAllSucursales();
		} catch (Exception e) {
			mav.addObject("message", "No se pudo obtener las sucursales");
		}
		mav.addObject("sucursales", sucursales);
		mav.setViewName("home");
		return mav;
	}
}
