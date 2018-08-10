
public class Usuario {
    private String _nombre;
    private String _apellido;
    private int _edad;
    private String _direccion;
    private int _telefono;

    public String get_nombre() {
        return this._nombre;
    }

    public void set_nombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String get_apellido() {
        return _apellido;
    }

    public void set_apellido(String _apellido) {
        this._apellido = _apellido;
    }

    public int get_edad() {
        return this._edad;
    }

    public void set_edad(int _edad) {
        this._edad = _edad;
    }

    public String get_direccion() {
        return this._direccion;
    }

    public void set_direccion(String _direccion) {
        this._direccion = _direccion;
    }

    public int get_telefono() {
        return this._telefono;
    }

    public void set_telefono(int _telefono) {
        this._telefono = _telefono;
    }
}
