package ciudadInteligente;

public class DronTransporte extends Vehiculo {
	
	public DronTransporte() {
		super("Despegue vertical, navegación por coordenadas de altitud y aterrizaje en puntos de entrega.");
	}

	@Override
	public void patronMovimiento() {
		System.out.println(this.getPatron());
	}
}

