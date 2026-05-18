package ciudadInteligente;
public class main {
    public static void main(String[] args) {

        Automovil auto = new Automovil();
        Motoneta moto = new Motoneta();
        CamionAutonomo camion = new CamionAutonomo();
        DronTransporte dron = new DronTransporte();
        


        CentroControl.crearVehiculo(auto);
        CentroControl.crearVehiculo(moto);
        CentroControl.crearVehiculo(camion);
        CentroControl.crearVehiculo(dron);
        CentroControl.monitorearFlota();

    }
}