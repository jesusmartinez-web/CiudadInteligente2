package ciudadInteligente;

import java.util.ArrayList;

public class CentroControl {
	private static ArrayList<Vehiculo> vehiculos = new ArrayList<>();

	public static void crearVehiculo(Vehiculo v) {

		vehiculos.add(v);

	}
        
        public void listarVehiculos(){
        
        System.out.printf("|-10%s |-10%s", "Vehiculo","ID");
        System.out.println("-----------------------------------------");
        
        for(Vehiculo v : vehiculos){
            System.out.printf("|-10%s |-10%s ",v.getClass().getSimpleName(),v.getId());
            
            
            
        }
        
        }

	public static void monitorearFlota() {
		for (int i = 0; i < vehiculos.size(); i++) {
			vehiculos.get(i).patronMovimiento();

		}
	}
        
}
