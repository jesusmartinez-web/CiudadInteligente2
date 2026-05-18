package ciudadInteligente;

public class Motoneta extends Vehiculo implements IConectable{
	
	public Motoneta() {
		super();
	}

	@Override
	public void sincronizarGPS() {
		System.out.println("Enlazando con el satelite para obtener ubicacion actual");
		
	}

	@Override
	public void patronMovimiento() {
		System.out.println("La motoneta se dirige al centro de la ciudad");
		
	}

	

}
