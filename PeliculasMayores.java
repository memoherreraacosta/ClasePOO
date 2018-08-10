
public class PeliculasMayores {
    private String nombre;
    private String clasif;
    private double precio;

    public PeliculasMayores(){
    } //constructor sin parametros (todas las clases lo tienen por default, se puede omitir aquí)

    public PeliculasMayores (String nombre, String clasif, double precio) { //constructor con parametros
        this.nombre = nombre;
        this.clasif = clasif;
        this.precio = precio;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClasif() {
        return clasif;
    }

    public void setClasif(String clasif) {
        this.clasif = clasif;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    } 
    public String toString() {
		return "Nombre de la película: "+this.getNombre()+
				"\nClasificacion: "+this.getClasif()+
				"\nPrecio: "+this.getPrecio()+"\n";
}
}

