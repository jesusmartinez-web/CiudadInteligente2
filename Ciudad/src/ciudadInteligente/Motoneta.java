package ciudadInteligente;

public class Motoneta extends Vehiculo implements IConectable{
	
	public Motoneta() {
		super("La motoneta se dirige al centro de la ciudad");
	}

	@Override
	public void sincronizarGPS() {
		System.out.println("Enlazando con el satelite para obtener ubicacion actual");
		
	}

	@Override
	public void patronMovimiento() {
		System.out.println(this.getPatron());
	}

	

}
