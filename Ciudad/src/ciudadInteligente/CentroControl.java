package ciudadInteligente;

import java.util.ArrayList;

public class CentroControl {
	private static ArrayList<Vehiculo> vehiculos = new ArrayList<>();

	public static void crearVehiculo(Vehiculo v) {

		vehiculos.add(v);

	}
        
        public void listarVehiculos(){
        
        System.out.printf("|%-25s |%-10s |%n", "Tipo de Vehiculo","ID");
        System.out.println("-----------------------------------------");
        
        vehiculos.forEach(v -> System.out.printf("|%-25s |%-10s |%n",v.getClass().getSimpleName(),v.getId()));
            
            
        }

	public static void monitorearFlota() {
		for (int i = 0; i < vehiculos.size(); i++) {
			vehiculos.get(i).patronMovimiento();

		}
	}
        
        public static void eliminarVehiculo(int ID){
            for(int i=0; i<vehiculos.size();i++){
                int tempID = vehiculos.get(i).getId();
                if(ID == tempID){
                    vehiculos.remove(i);
                    break;
                }
            }
        }
        
}
