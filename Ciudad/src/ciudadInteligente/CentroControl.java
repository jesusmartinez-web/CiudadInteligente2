package ciudadInteligente;

import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.toList;

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
            vehiculos.forEach(v-> v.patronMovimiento());
	}
        
        public static Vehiculo buscarVehiculoID(int ID){
            return vehiculos.stream().filter(v -> v.getId() == ID)
                    .findFirst().orElse(null);
            
        }
        public static List<Vehiculo> vehiculosIConectables(){
            return vehiculos.stream().filter(v -> v instanceof IConectable).toList();
        }
        
        public static List<Integer> listaDeId(){
            return vehiculos.stream().map(v -> v.getId()).toList();
        }
        
        public static List<Vehiculo> ordenarPorTipo() {
            return vehiculos.stream()
            .sorted((v1, v2) -> v1.getClass().getSimpleName().compareTo(v2.getClass().getSimpleName()))
            .toList(); 
        }
        
        public static void eliminarVehiculo(int ID){
           vehiculos.removeIf(v -> v.getId() == ID);
        }
        
        public static void modificarVehiculo(int ID, String nuevoPatron) {
            Vehiculo v = buscarVehiculoID(ID);
            if (v != null) {
                v.setPatron(nuevoPatron);
               System.out.println("Patrón del vehículo " + ID + " modificado con éxito.");
            } else {
                System.out.println("Vehículo con ID " + ID + " no encontrado.");
            }
        }
       
        public static long contarVehiculos() {
            return vehiculos.stream().count();
        }
        
        public static List<Vehiculo> buscarVehiculoTipo(String tipo) {
            return vehiculos.stream()
                .filter(v -> v.getClass().getSimpleName().equalsIgnoreCase(tipo))
                .toList();
        }
        
        public static List<Vehiculo> ordenarPorId() {
            return vehiculos.stream()
                .sorted((v1, v2) -> Integer.compare(v1.getId(), v2.getId()))
                .toList();
        }
        
}
