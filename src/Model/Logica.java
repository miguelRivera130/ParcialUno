package Model;

import java.util.Collections;
import java.util.LinkedList;
import processing.core.PApplet;
import Model.Netflix;

public class Logica extends PApplet {

	String[] txt;

	private LinkedList<Netflix> listaNetflix;
	private PApplet app;
	private NetflixNombreCompare netflixNombreCompare;
	private NetflixFechaEstrenoCompare netflixFechaEstrenoCompare;
	private NetflixTipoCompare netflixTipoCompare;

	public Logica(PApplet app) {

		netflixTipoCompare = new NetflixTipoCompare();
		netflixFechaEstrenoCompare = new NetflixFechaEstrenoCompare();
		netflixNombreCompare = new NetflixNombreCompare();

		this.app = app;
		listaNetflix = new LinkedList<Netflix>();

		txt = app.loadStrings("../data/netflix.txt");
	}

	public void listaNetflix() {
		for (int i = 0; i < txt.length; i++) {
			String[] lista = txt[i].split(",");
			int rating = Integer.parseInt(lista[2]);

			listaNetflix.add(new Netflix(100, 75 * i + 15, g, lista[0], rating, lista[1], lista[3], app));

		}
	}

	public void pintar() {
		for (int i = 0; i < listaNetflix.size(); i++) {
			listaNetflix.get(i).pintar();

		}
	}

	public void sortList(char c) {
		switch (c) {

		case 'i':
			Collections.sort(listaNetflix);
			app.saveStrings("../data", txt);
			break;

		case 'n':
			Collections.sort(listaNetflix, netflixNombreCompare);
			break;

		case 'f':
			Collections.sort(listaNetflix, netflixFechaEstrenoCompare);
			break;

		case 't':
			Collections.sort(listaNetflix, netflixTipoCompare);
			break;

		}

	}
}
