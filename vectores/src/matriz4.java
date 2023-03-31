import java.util.Scanner;

public class matriz4 {
    public static void main(String[] args) {

        String [][]emojis;
        int x,y;
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de filas");
        x = lector.nextInt();

        System.out.print("Ingresa la cantidad de columnas");
        y = lector.nextInt();
        emojis = new String [x] [y];

        for(int i=0;i<x;i++){
            for(int d=0;d<y;d++){
                System.out.print("lngrese emoji: " + emojis[i] [d]) ;
                emojis[i][d] = lector.next();
        
            }
        }

    for(int i=0;i<x;i++){
        for(int w=0;w<y;w++){
        System.out.print("los emojis son: " + emojis[i] [w]) ;
        }

}
lector.close();
}
}
