package ciudadInteligente;

public class Automovil extends Vehiculo {
	
	public Automovil() {
		super("El automovil se esta dirigiendo hacia el oeste cerca del Centro Comercial.");
	}
	
        @Override
	public void patronMovimiento() {
		System.out.println(this.getEstado());
	}

}
