/*Ejemplo 2.6 Producto en Java
 * Calcular el producto de 3 números ingresados por el usuario
 * Como programar en Java Deitel & Deitel 7ma Edición
 * */


import java.util.Scanner; //Utilizamos la clase Scanner para leer los numeros

public class Producto {
        //El método main inicia la ejecución de la aplicación Java
    public static void main(String[] args) {

        //Creamos objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);

        //Declaramos las variables x,y,z,producto
        int x; //Primer número introducido por el usuario
        int y; //Segundo número introducido por el usuario
        int z; //tercer número introducido por el usuario
        int resultado; //producto de los 3 números introducidos


        //Solicitamos y leemos los números introducidos por el usuario
        System.out.print("Introduce el primer número entero: ");
        x = entrada.nextInt();
        System.out.print("Introduce el segundo número entero: ");
        y = entrada.nextInt();
        System.out.println("Introduce el tercer número entero");
        z = entrada.nextInt();
        //Calculamos el producto de los números
        resultado = x * y * z;

        //Se imprime el resultado del producto de los tres números
        System.out.printf("El producto es: %d",resultado);

    }//Fin del método main
} //Fin de la clase Producto
