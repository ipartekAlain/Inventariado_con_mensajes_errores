package com.ipartek.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="inventarios")
public class Inventario {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@ManyToOne
	private Producto productoInventario;
	
	@Column(name="cantidad")
	private int cantidad;

	public Inventario(int id, Producto productoInventario, int cantidad) {
		super();
		this.id = id;
		this.productoInventario = productoInventario;
		this.cantidad = cantidad;
	}

	public Inventario() {
		super();
		this.id = 0;
		this.productoInventario = new Producto();
		this.cantidad = 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Producto getProductoInventario() {
		return productoInventario;
	}

	public void setProductoInventario(Producto productoInventario) {
		this.productoInventario = productoInventario;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Inventario [id=" + id + ", productoInventario=" + productoInventario + ", cantidad=" + cantidad + "]";
	}
	
	
	
	
}
