package ciudadInteligente;

abstract class Vehiculo {

	private int id = 0;
	private static int contador = 0;

	public Vehiculo() {
		this.id = contador++;
	}

	public int getId() {
		return this.id;
	}

        public static int getContador() {
            return contador;
        }

        public static void setContador(int contador) {
            Vehiculo.contador = contador;
        }

	public abstract void patronMovimiento();

}
