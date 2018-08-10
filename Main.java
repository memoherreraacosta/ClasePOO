
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Usuario usuario = new Usuario();
        PeliculasMayores pMa= new PeliculasMayores();
        PeliculasMenores pMe= new PeliculasMenores();
        
        System.out.println("Bienvenido a Blockbuster, donde puedes encontrar todas tus peliculas. " +
                "Presiona cualquier tecla para ingresar tus datos");

        System.out.println("¿Cuál es tu nombre?");
        usuario.set_nombre(sc.nextLine());

        System.out.println("¿Cuál es tu apellido?");
        usuario.set_apellido(sc.nextLine());

        System.out.println("¿Cuál es tu edad?");
        usuario.set_edad(Integer.parseInt(sc.nextLine()));

        System.out.println("¿Cuál es tu dirección?");
        usuario.set_direccion(sc.nextLine());
        
        System.out.println("¿Cuál es tu telefono?");
        usuario.set_telefono(Integer.parseInt(sc.nextLine()));

        if(usuario.get_edad() <= 18){
        		double contadorPeliculas=0;
        		
        		while(true) {
        			
        			System.out.println("Menu de peliculas a rentar: \n");
        			
        			pMe.Pelicula1();
        			System.out.println(pMe.toString());
        			System.out.println("Si deseas rentar esta pelicula escribe alguna letra, sino no escribas nada"); 
        			if(sc.nextLine()!=null) {
        				contadorPeliculas+=pMe.get_precio();
        				
        			}
        			
        			pMe.Pelicula2();
        			System.out.println(pMe.toString());
        			System.out.println("Si deseas rentar esta pelicula escribe alguna letra, sino no escribas nada");
        			if(sc.nextLine()!=null) {
        				contadorPeliculas+=pMe.get_precio();
        			}
        			
        			pMe.Pelicula3();
        			System.out.println(pMe.toString());        			
        			System.out.println("Si deseas rentar esta pelicula escribe alguna letra, sino no escribas nada");
        			if(sc.nextLine()!=null) {
        				contadorPeliculas+=pMe.get_precio();
        			}
        			
        			
        			System.out.println("Si deseas rentar alguna otra pelicula escribe alguna letra, sino no escribas nada");
        			if(sc.nextLine()!=null) {
        				break;
        			}	
        		}
        		System.out.println(usuario.get_nombre()+" "+usuario.get_apellido() +", el total de la renta es: "+contadorPeliculas);
        		
        }else {
        	
        }

    }

}
