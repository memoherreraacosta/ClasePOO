
public class PeliculasMenores {
    private String _nombre;
    private String _clasif;
    private double _precio;
    
    public void Pelicula1(){
        this.set_nombre("Barbie y las princesas");
        this.set_clasif("AA");
        this.set_precio(23.5);
    }
    
    public void Pelicula2(){
        this.set_nombre("High School Musical");
        this.set_clasif("A");
        this.set_precio(22.4);
    }
   
    public void Pelicula3(){
        this.set_nombre("Mulan");
        this.set_clasif("AA");
        this.set_precio(30.2);
    }

    public String get_nombre() {
        return this._nombre;
    }

    public void set_nombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String get_clasif() {
        return this._clasif;
    }

    public void set_clasif(String _clasif) {
        this._clasif = _clasif;
    }

    public double get_precio() {
        return this._precio;
    }

    public void set_precio(double _precio) {
        this._precio = _precio;
    }
    
    public String toString() {
    		return "Nombre de la pelicula: "+this.get_nombre()+
    				"\nClasificacion: "+this.get_clasif()+
    				"\nPrecio: "+this.get_precio();
    }
}
