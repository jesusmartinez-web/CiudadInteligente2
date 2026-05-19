package ciudadInteligente;

abstract class Vehiculo {

    private int id = 0;
    private static int contador = 0;
    private String estado = null;

    public Vehiculo(String estado) {
        this.id = contador++;
        this.estado = estado;
    }
        
    public String getEstado(){
        if(estado == null){
            return "Inactivo";
        }
        else return this.estado;
    }
        
    public void setEstado(String estado){
        this.estado = estado;
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
