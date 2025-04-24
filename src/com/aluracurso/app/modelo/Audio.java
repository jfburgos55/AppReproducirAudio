package com.aluracurso.app.modelo;
/**
*
* @author jfburgos55
*/
public class Audio {
	private String titulo;
	private int duracion;
	private int totalDeReproducciones;
	private int totalDeMeGusta;
	private int clasificacion;
	
	public void meGusta() {
		this.setTotalDeMeGusta(this.getTotalDeMeGusta() + 1);
	}
	
	public void reproducir() {
		this.totalDeReproducciones++;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public int getTotalDeReproducciones() {
		return totalDeReproducciones;
	}
	public void setTotalDeReproducciones(int totalDeReproducciones) {
		this.totalDeReproducciones = totalDeReproducciones;
	}

	public int getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(int clasificacion) {
		this.clasificacion = clasificacion;
	}

	public int getTotalDeMeGusta() {
		return totalDeMeGusta;
	}

	public void setTotalDeMeGusta(int totalDeMeGusta) {
		this.totalDeMeGusta = totalDeMeGusta;
	}
}
