package com.aluracurso.app.reproductor.principal;

import com.aluracurso.app.modelo.Cancion;
import com.aluracurso.app.modelo.MisFavoritos;
import com.aluracurso.app.modelo.Podcast;

/**
*
* @author jfburgos55
*/
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------------------------------------------");
		System.out.println("- Inicio reproductor audio");
		System.out.println("--------------------------------------------");
		
		Cancion miCancion = new Cancion();
		miCancion.setTitulo("Forever");
		miCancion.setCantante("Kiss");
		
		Podcast miPodcast = new Podcast();
		miPodcast.setPresentador("Gabriela Aguilar");
		miPodcast.setTitulo("Cafe.Tech");
		
		for(int i = 0; i < 100; i++) {
			miCancion.meGusta();
		}
		
		for(int i =  0; i < 5000; i++) {
			miCancion.reproducir();
		}
		
		
		System.out.println("--------------------------------------------");
		System.out.println("Titulo Cancion: " + miCancion.getTitulo());
		System.out.println("Total reproducciones: " + miCancion.getTotalDeReproducciones());
		System.out.println("Total me gusta: " + miCancion.getTotalDeMeGusta());
		System.out.println("--------------------------------------------");
		
		for(int i = 0; i < 200; i++) {
			miPodcast.meGusta();
		}
		
		for(int i =  0; i < 3000; i++) {
			miPodcast.reproducir();
		}
		
		System.out.println("Titulo Cancion: " + miPodcast.getTitulo());
		System.out.println("Total reproducciones: " + miPodcast.getTotalDeReproducciones());
		System.out.println("Total me gusta: " + miPodcast.getTotalDeMeGusta());
		System.out.println("--------------------------------------------");
		
		MisFavoritos favoritos = new MisFavoritos();
		favoritos.adicione(miCancion);
		favoritos.adicione(miPodcast);
	}

}
