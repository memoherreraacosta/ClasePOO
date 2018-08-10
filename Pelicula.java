
public class Pelicula {
	
	private String titulo,genero;
	private int duracion;
	
	public Pelicula(String titulo, String genero, int duracion){
		this.titulo=titulo;
		this.genero=genero;
		this.duracion=duracion;
	}
	public String getTitulo(){
		return this.titulo;
	}
	public String getGenero(){
		return this.genero;
	}
	public int getDuracion(){
		return this.duracion;
	}
	public void setTitulo(String titulo){
		this.titulo=titulo;
	}
	public void setGenero(String genero){
		this.genero=genero;
	}
	public void setDuracion(int duracion){
		this.duracion=duracion;
	}
	public String toString(){
		return "Título de la película: "+this.titulo+
				"\nGenero de la película: "+this.genero+
				"\nDuración de la película: "+this.duracion+" minutos";
	}
}
