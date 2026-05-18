package ciudadInteligente;

import java.util.ArrayList;

public class CentroControl {
	private static ArrayList<Vehiculo> vehiculos = new ArrayList<>();

	public static void crearVehiculo(Vehiculo v) {

		vehiculos.add(v);

	}
        
        public void listarVehiculos(){
        
        System.out.printf("");
        
        }

	public static void monitorearFlota() {
		for (int i = 0; i < vehiculos.size(); i++) {
			vehiculos.get(i).patronMovimiento();

		}
	}
        
}
