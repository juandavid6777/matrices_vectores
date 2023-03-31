import java.util.Scanner;
public class array2() {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Cuanto competidores participan?:");
    int n_competidores = teclado.nextInt();
    competidor competidores[]= new competidor[n_competidores];
    competidor p=null;
    for (int i = 0; i < n_competidores; i++) {
    
    System.out.println("¿Cual es tu nombre?");
    var nombre = teclado.next();
    System.out.println("¿Cuál es tu edad?");
    var edad = teclado.nextInt();
    System.out.println("¿Cuál es tu tiempo?");
    var tiempo = teclado.nextDouble();
    p = new competidor(nombre, edad, tiempo,);
    competidores[i]=p;
    }
    for (int i = 0; i < n_competidores; i++) {
        System.out.println(competidores[i]);
        input.close();
    }
}











//En una competencia de natación se desea implementar una aplicación para almacenar el tiempo por cada competidor. El usuario debe especificar cuantos competidores participarán en la competencia y digitar los nombres y tiempos de cada uno. Muestre en pantalla cada nadador con su respectivo tiempo. Plantee de qué forma podría determinar quien es el ganador//