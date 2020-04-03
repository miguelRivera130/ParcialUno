package Model;

import java.util.Comparator;

public class NetflixNombreCompare implements Comparator<Netflix> {

	public NetflixNombreCompare() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Netflix o1, Netflix o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
