public class Libro{

	private String titulo="";
	private String autor="";
	private String editorial="";
	private String isbn="";
	
	public Libro(){

		this.titulo="Aura";
		this.autor="Carlos Fuentes";
		this.editorial="Biblioteca Era";
		this.isbn="a01400835";
	}
	public Libro(String titulo, String autor, String editorial, String isbn){
		this.titulo=titulo;
		this.autor=autor;
		this.editorial=editorial;
		this.isbn=isbn;
	}

	public void setTitulo(String titulo){
		this.titulo=titulo;
	}

	public void setAutor(String autor){
		this.autor=autor;
	}

	public void setEditorial(String editorial){
		this.editorial=editorial;
	}

	public void setIsbn(String isbn){
		this.isbn=isbn;
	}

	public String getAutor(){
		return this.autor;
	}

	public String getTitulo(){
		return this.titulo;
	}
	public String getEditorial(){
		return this.editorial;
	}
	public String getIsbn(){
		return this.isbn;
	}

	public String toString(){
		return "Título: "+this.titulo+" ,Autor: "+this.autor +", Editorial: "+this.editorial+" ,isbn: "+this.isbn;
	}

	public static void main(String []args){

		Libro libroDefault= new Libro();
		Libro libroValores= new Libro("Fundamentos de Java","Luis Joyanes","McMillian","123492");

		System.out.println("");
		System.out.println("Datos sin cambiar");

		System.out.println(libroDefault.toString());
		System.out.println(libroValores.toString());

		libroDefault.setAutor("Vicente Fernandez");
		libroDefault.setEditorial("Óceano");

		libroValores.setIsbn("3333333");
		libroValores.setTitulo("Cien años de soledad");

		System.out.println("");
		System.out.println("Datos cambiados");

		System.out.println(libroDefault.toString());
		System.out.println(libroValores.toString());

	}
}