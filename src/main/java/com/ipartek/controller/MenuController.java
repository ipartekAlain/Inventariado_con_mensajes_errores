package com.ipartek.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ipartek.messages.GestorMensajes;
import com.ipartek.model.Inventario;
import com.ipartek.model.Producto;
import com.ipartek.repository.InventarioRepository;
import com.ipartek.repository.ProductoRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class MenuController {
	
	@Autowired
	private ProductoRepository productoRepo;
	
	@Autowired
	private InventarioRepository inventarioRepo;

	@RequestMapping("/menu_inventario")
	public String menuInventario(HttpSession session, Model model) {

		GestorMensajes.borrarMensaje(session);

		model.addAttribute("atr_lista_productos", productoRepo.findAll());
		model.addAttribute("objeto_entidad", new Inventario());

		return "home";
	}

	@RequestMapping("/menu_detalles")
	public String menuDetalles(HttpSession session, Model model) {
		
		GestorMensajes.borrarMensaje(session);

		model.addAttribute("atr_lista_productos", inventarioRepo.findAll());

		return "detalles";
	}

}
