package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class Netflix implements Comparable<Netflix> {

	private PApplet app;
	private int posX, posY;
	private int rating;
	private String nombre, fechaEstreno, tipo;
	private PImage poster;

	public Netflix(int posX, int posY, PImage poster, String nombre, int rating, String fechaEstreno, String tipo,
			PApplet app) {

		this.app = app;

		this.posX = posX;
		this.posY = posY;

		this.poster = poster;
		this.nombre = nombre;
		this.rating = rating;
		this.fechaEstreno = fechaEstreno;
		this.tipo = tipo;

		switch (this.nombre) {
		case "Breaking Bad":
			this.poster = app.loadImage("../data/breakingbad.jpg");
			break;
		case "Dark":
			this.poster = app.loadImage("../data/dark.jpg");
			break;
		case "The Irishman":
			this.poster = app.loadImage("../data/theirishman.jpg");
			break;
		case "Ozark":
			this.poster = app.loadImage("../data/ozark.jpg");
			break;
		case "Star":
			this.poster = app.loadImage("../data/startrek.jpg");
			break;
		case "Mindhunter":
			this.poster = app.loadImage("../data/mindhunter.jpg");
			break;
		}
	}

	public void pintar() {
		app.image(poster, posX, posY);
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaEstreno() {
		return fechaEstreno;
	}

	public void setFechaEstreno(String fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public PImage getPoster() {
		return poster;
	}

	public void setPoster(PImage poster) {
		this.poster = poster;
	}

	@Override
	public int compareTo(Netflix proxNetflix) {
		return this.rating - proxNetflix.getRating();
	}

}
