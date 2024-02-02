package com.ipartek.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipartek.model.Producto;
import com.ipartek.repository.ProductoRepository;

import jakarta.annotation.PostConstruct;
import jakarta.transaction.Transactional;

@Service
public class CargarDatos {

	
	@Autowired
	private ProductoRepository productoRepo;
	
	@PostConstruct
	@Transactional
	public void cargarDatosBD(){
		
		productoRepo.save(new Producto(1, "Lechugas"));
		productoRepo.save(new Producto(2, "Esparragos"));
		productoRepo.save(new Producto(3, "Pimientos del padron"));
		productoRepo.save(new Producto(4, "Piparras"));
		productoRepo.save(new Producto(5, "Pepinos"));
		productoRepo.save(new Producto(6, "Tomates"));
		productoRepo.save(new Producto(7, "Calabacines"));
			
	}
	
}
