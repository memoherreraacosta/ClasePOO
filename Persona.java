
public class Persona {
	//Atributos de la clase persona 
		private String Nombre,Apellido,Pasaporte,Ojos;
		private int Edad;
		private char Sexo; 
	
	public String getApellido(){
		return Apellido;
	}
	public void setApellido(String Apellido){
		this.Apellido= Apellido; 
	}
	public String getNombre(){
		return Nombre; 
	}
	public void setNombre(String Nombre){
		this.Nombre=Nombre; 
	}
	public String getPasaporte(){
		return Pasaporte;
	}
	public void setPasaporte(String Pasaporte){
		this.Pasaporte=Pasaporte;
	}
	public char getSexo(){
		return Sexo;
	}
	public void setSexo(char Sexo){
		this.Sexo=Sexo;
	}
	public String getOjos(){
		return Ojos;
	}
	public void setOjos(String Ojos){
		this.Ojos=Ojos;
	}
	public int getEdad(){
		return Edad;
	}
	public void setEdad(int Edad){
		this.Edad=Edad;
	}
	
	public static void main(String[] args){
		
		Persona persona= new Persona();
		
		persona.setApellido("Herrera");
		persona.setNombre("Guillermo");
		persona.setPasaporte("G14420448");
		persona.setEdad(19);
		persona.setOjos("Castaño");
		persona.setSexo('M');
		
		Persona otraPersona= new Persona();
		
		otraPersona.setApellido("Santos");
		otraPersona.setNombre("Alejandra");
		otraPersona.setPasaporte("G12330667");
		otraPersona.setOjos("Verde");
		otraPersona.setEdad(19);
		otraPersona.setSexo('F');
		
		System.out.println(persona.getNombre()+" "+persona.getApellido()+" tiene "+persona.getEdad()+" años, tiene ojos color "+persona.getOjos()+", el número de pasaporte es: "+persona.getPasaporte()+" es de sexo "+persona.getSexo()+".");
		System.out.println(otraPersona.getNombre()+" "+otraPersona.getApellido()+" tiene "+otraPersona.getEdad()+" años, tiene ojos color "+otraPersona.getOjos()+", el número de pasaporte es: "+otraPersona.getPasaporte()+" es de sexo "+otraPersona.getSexo()+".");
	}
	
}
