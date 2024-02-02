package com.ipartek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ipartek.messages.GestorMensajes;
import com.ipartek.model.Inventario;
import com.ipartek.repository.ProductoRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {

	@Autowired
	private ProductoRepository productoRepo;
	
	@RequestMapping("/")
	public String inicio(@ModelAttribute Inventario objeto_entidad, Model model,HttpSession session) {
		GestorMensajes.borrarMensaje(session);
		
		model.addAttribute("atr_lista_productos", productoRepo.findAll());

		model.addAttribute("objeto_entidad", new Inventario());

		return "home";
	}

}
