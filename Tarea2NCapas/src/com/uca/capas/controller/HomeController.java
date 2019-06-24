package com.uca.capas.controller;

import java.io.Console;
import java.util.List;

import javax.validation.Valid;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.service.EmpleadoService;
import com.uca.capas.service.SucursalService;
import com.uca.capas.domain.Empleado;
import com.uca.capas.domain.Sucursal;

@Controller
public class HomeController {

	static Logger log = Logger.getLogger(LoginController.class.getName());

	@Autowired
	SucursalService sucursalService;
	
	@Autowired
	EmpleadoService empleadoService;

	@RequestMapping("/home")
	public ModelAndView initHome() {
		ModelAndView mav = new ModelAndView();
		List<Sucursal> sucursales = null;
		try {
			sucursales = sucursalService.getAllSucursales();
			mav.addObject("sucursales", sucursales);
			mav.setViewName("home");
		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("message", "No se pudo obtener las sucursales");
		}

		return mav;
	}

	@RequestMapping("/guardar")
	public ModelAndView save(@Valid @ModelAttribute Sucursal sucursal, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		if (result.hasErrors()) {
			mav.setViewName("agregar");
			mav.addObject("message", "Ocurrio un problema para agregar sucursal");
		} else {
			sucursalService.saveSucursal(sucursal);
			mav.setViewName("redirect:/home");
			return mav;
		}
		return mav;
	}

	@RequestMapping("/agregar")
	public ModelAndView agregar() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("sucursal", new Sucursal());
		mav.setViewName("agregar");
		return mav;
	}
	
	@RequestMapping("/eliminar")
	public ModelAndView eliminar(@RequestParam("id") Long id) {
		try {
			sucursalService.deleteSucursal(id);
		} catch (Exception e) {
			log.info("No se borro");
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/eliminado");
	}
	
	@RequestMapping("/eliminado")
	public ModelAndView eliminado() {
		ModelAndView mav = new ModelAndView();
		List<Sucursal> sucursales = null;
		try {
			sucursales = sucursalService.getAllSucursales();
		}catch (Exception e){
			
		}
		mav.addObject("message", "Sucursal eliminada.");
		mav.addObject("sucursales", sucursales);
		mav.setViewName("home");
		return mav;
	}
	
	@RequestMapping("/editar")
	public ModelAndView editar(@RequestParam("id") Long id) {
		ModelAndView mav = new ModelAndView();
		Sucursal sucursal = null;
		try {
			sucursal = sucursalService.getSucursalById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mav.addObject("sucursal", sucursal);
		mav.setViewName("editar");
		return mav;
	}
	
	@RequestMapping("/actualizar")
	public ModelAndView actualizar(@ModelAttribute Sucursal sucursal) {
		ModelAndView mav = new ModelAndView();
		try {
			sucursalService.saveSucursal(sucursal);
		} catch(Exception e) {
			e.printStackTrace();
			mav.addObject("message", "La sucursal no pudo ser editada.");
		}
		List<Sucursal> sucursales = null;
		try {
			sucursales = sucursalService.getAllSucursales();
		}catch (Exception e){
			e.printStackTrace();
		}
		mav.addObject("sucursales", sucursales);
		mav.addObject("message", "Sucursal editada.");
		mav.setViewName("home");
		return mav;
	}
	@RequestMapping("/verPerfil")
	public ModelAndView verPerfil(@RequestParam("id") Long id) {
		ModelAndView mav = new ModelAndView();
		try {
			Sucursal sucursal = new Sucursal();
			List<Empleado> empleados = null;
			sucursal = sucursalService.getSucursalById(id);
			empleados = sucursal.getsEmpleados();
			mav.addObject("sucursal", sucursal);
			mav.addObject("empleados", empleados);
			mav.setViewName("verPerfil");
		} catch (Exception e) {
			mav.addObject("message", "No se pudo recuperar la sucursal solicitada");
			mav.setViewName("redirect:/home");
		}
		return mav;
	}
	
	@RequestMapping("/editarEmpleado")
	public ModelAndView editarEmpleado(@RequestParam(value = "id") Long sId,
			@RequestParam(value = "eid") Integer eId) {
		ModelAndView mav = new ModelAndView();
		Empleado empleado = new Empleado();
		try {
			empleado = empleadoService.getEmpleadoById(eId);
		} catch (Exception e) {
			mav.addObject("message", "No se pudo recuperar la sucursal solicitada");
			mav.setViewName("redirect:/home");
		}
		mav.addObject("Sucursal", sId);
		mav.addObject("empleado", empleado);
		mav.setViewName("editarEmpleado");
		return mav;
	}
	
	@RequestMapping("/actualizarEmpleado")
	public ModelAndView actualizarEmpleado(@ModelAttribute Empleado empleado) {
		ModelAndView mav = new ModelAndView();
		try {
			empleadoService.saveEmpleado(empleado);
		} catch(Exception e) {
			e.printStackTrace();
			mav.addObject("message", "El empleado no pudo ser editado.");
		}
		List<Sucursal> sucursales = null;
		try {
			sucursales = sucursalService.getAllSucursales();
		}catch (Exception e){
			e.printStackTrace();
		}
		mav.addObject("sucursales", sucursales);
		mav.addObject("message", "Empleado editado.");
		mav.setViewName("home");
		return mav;
	}

}
