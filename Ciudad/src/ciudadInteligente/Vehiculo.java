package ciudadInteligente;

abstract class Vehiculo {

    private int id = 0;
    private static int contador = 0;
    private String estado = null;

    public Vehiculo(String patron) {
        this.id = contador++;
        this.estado = patron;
    }
        
    public String getEstado(){
        return this.estado;
    }
        
    public void setEstado(String patron){
        this.estado = patron;
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
