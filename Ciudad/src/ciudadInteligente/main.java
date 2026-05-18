package ciudadInteligente;
public class main {
    public static void main(String[] args) {

        Automovil auto = new Automovil();
        Motoneta moto = new Motoneta();
        CamionAutonomo camion = new CamionAutonomo();
        DronTransporte dron = new DronTransporte();
        


        CentroControl.registrarUnidad(auto);
        CentroControl.registrarUnidad(moto);
        CentroControl.registrarUnidad(camion);
        CentroControl.registrarUnidad(dron);
        CentroControl.monitorearFlota();

    }
}