/*Figura 2.15 Comparación
 * Compara enteros utilizando instrucciones if, operadores relacionales y de igualdad
 * Como programar en Java Deitel & Deitel 7ma Edición
 * */

import java.util.Arrays;
import java.util.Scanner; //El programa utiliza la clase Scanner

public class Comparacion {

    //El método main empieza la ejecución de la aplicación Java
    public static void main(String[] args) {

        //Se crea el objeto de tipo scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);

        int numero1; //Primer número entero a comparar
        int numero2; //segundo número entero a comparar

        System.out.print("Escriba el primer entero: "); //indicador
        numero1 = entrada.nextInt(); //Lee el primer número del usuario

        System.out.print("Escriba el segundo entero: "); //indicador
        numero2 = entrada.nextInt(); //Lee el segundo numero entero

        if (numero1 == numero2)
            System.out.printf("%d == %d%n", numero1, numero2);
        if (numero1 != numero2)
            System.out.printf("%d != %d%n", numero1, numero2);
        if (numero1 < numero2)
            System.out.printf("%d < %d%n", numero1, numero2);
        if (numero1 > numero2)
            System.out.printf("%d > %d%n",numero1, numero2);
        if (numero1 <= numero2)
            System.out.printf("%d <= %d%n",numero1,numero2);
        if (numero1 >= numero2)
            System.out.printf("%d >= %d%n",numero1,numero2);
    }//Fin del método main

}//Fin de la clase Comparacion
