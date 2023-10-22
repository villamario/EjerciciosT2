import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //nombre
        System.out.println("Escribe tu nombre completo ");
        String NombreCompleto = teclado.nextLine();
        //calle
        System.out.println("Escribe tu calle, número del portal, el piso y la letra del piso ");
        String calle = teclado.nextLine();
        //codigo
        System.out.println("Escribe el código postal, la localidad y la provincia ");
        String CP = teclado.nextLine();
        //pais
        System.out.println("Ecribe tu pais ");
        String pais = teclado.nextLine();
        //OUTS total
        System.out.println("Tu apellido es: " +NombreCompleto);
        System.out.println("Tu calle es: " +calle);
        System.out.println("Tu código postal es: " +CP);
        System.out.println("Tu pais es: " +pais);
    }
}

