import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
Ejercicio propuesto 7.3.2.1: Crea un programa que pida su nombre al usuario
y lo escriba con al revés, usando un StringBuilder. Por ejemplo, a partir de
"Nacho" escribiría "ohcaN".
        */

        System.out.println("Escribe el nombre que quieres ver revertido"); //pido la accion al usuario

        Scanner teclado = new Scanner (System.in); // declaro el scanner que va a leer lo que introduzca el user
        StringBuilder nombre = new StringBuilder(teclado.nextLine()); // declaro un strinbuilder para guardar ahí el texto que ha introducido (no en string porque seria inmutable, en builder para poder modificar y jugar con esa cadena)

        System.out.println("El nombre que has introducido en orden inverso es:" + nombre.reverse());

    }
}