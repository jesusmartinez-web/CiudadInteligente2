package ciudadInteligente;

abstract class Vehiculo {

	private int id = 0;
	private static int contador = 0;
        private String patron;

	public Vehiculo(String patron) {
		this.id = contador++;
                this.patron = patron;
	}
        
        public String getPatron(){
            return this.patron;
        }
        
        public void setPatron(String patron){
            this.patron = patron;
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
