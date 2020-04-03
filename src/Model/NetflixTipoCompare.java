package Model;

import java.util.Comparator;

public class NetflixTipoCompare implements Comparator<Netflix> {

	public NetflixTipoCompare() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Netflix o1, Netflix o2) {
		return o1.getTipo().compareTo(o2.getTipo());
	}

}
