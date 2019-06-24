package com.uca.capas.controller;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Usuario;
import com.uca.capas.service.UsuarioService;

@Controller
public class LoginController {
	

static Logger log = Logger.getLogger(LoginController.class.getName());

	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping("/")
	public ModelAndView initLogin() {
		return new ModelAndView("redirect:/login");
	}
	
	@GetMapping("/login")
	public ModelAndView initLoginOficial() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		return mav;
	}
	
	@PostMapping(value = "/validate")
	public ModelAndView validate(@RequestParam(value = "username") String username,
			@RequestParam(value = "password") String password) {
		ModelAndView mav = new ModelAndView();
		Usuario usuarioLogin = usuarioService.findByUserAndPass(username, password);
		if (usuarioLogin != null) {
			if (usuarioLogin.getuNombre() != null) {
				if (usuarioLogin.getuNombre().equals(username)) {
					if (usuarioLogin.getuContra().equals(password)) {
						mav.setViewName("home");
						return new ModelAndView("redirect:/home");
					}
				}
			}
		}
		return new ModelAndView("redirect:/login");
}
}
