package ciudadInteligente;

import java.util.ArrayList;

public class CentroControl {
	private static ArrayList<Vehiculo> vehiculos = new ArrayList<>();

	public static void registrarUnidad(Vehiculo vehiculo) {

		vehiculos.add(vehiculo);

	}

	public static void monitorearFlota() {
		for (int i = 0; i < vehiculos.size(); i++) {
			vehiculos.get(i).patronMovimiento();

		}
	}
}
