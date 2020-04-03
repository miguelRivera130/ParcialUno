package Model;

import java.util.Comparator;

public class NetflixFechaEstrenoCompare implements Comparator<Netflix> {

	public NetflixFechaEstrenoCompare() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Netflix o1, Netflix o2) {
		return o1.getFechaEstreno().compareTo(o2.getFechaEstreno());
	}

}
