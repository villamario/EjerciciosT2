import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el primer número: ");
        int PrimerNumero = teclado.nextInt();

        System.out.println("Escribe el segundo número: ");
        int SegundoNumero = teclado.nextInt();

        System.out.println("Escribe el tercer número: ");
        int TercerNumero = teclado.nextInt();

        System.out.println("Escribe el cuarto número: ");
        int CuartoNumero = teclado.nextInt();

        System.out.println("Escribe el quinto número: ");
        int QuintoNumero = teclado.nextInt();

        System.out.println(PrimerNumero + " " + SegundoNumero + " " + TercerNumero + " " + CuartoNumero + " " + QuintoNumero);

        int aux = PrimerNumero;
        PrimerNumero=SegundoNumero;
        SegundoNumero=TercerNumero;
        TercerNumero=CuartoNumero;
        CuartoNumero=QuintoNumero;
        QuintoNumero = aux;

        System.out.println(PrimerNumero + " " + SegundoNumero + " " + TercerNumero + " " + CuartoNumero + " " + QuintoNumero);



    }

}
