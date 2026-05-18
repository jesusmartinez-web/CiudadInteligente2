package ciudadInteligente;

public class CamionAutonomo extends Vehiculo implements IConectable {
	
	
	public CamionAutonomo() {
		super();
	}
	

	@Override
	public void patronMovimiento() {
		System.out.println("Manteniendo siempre la derecha \n Frenado cuando el vehiculo del frente esta a menos de 4 metros.");
		
	}

	@Override
	public void sincronizarGPS() {
		System.out.println("Enlazando con el satelite para obtener ubicacion actual.");
	
		
	}
	

}
