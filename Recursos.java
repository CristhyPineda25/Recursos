
package recursos;

/**
 *
 *Crear el código en Java para:

Crear una clase que se llame Recursos con 4 métodos diferentes.
Instanciar la clase en el programa principal y llamar a los métodos con diferentes operaciones:
 

Los métodos debe retornar los siguientes tipos de valor, colocar nombres descriptivos para cada uno de ellos: 

Primer método: Retornar un mensaje que diga: "Programación Orientada a Objetos 2021".

Segundo método: Declarar una variable de tipo entero y asignarle un número X que represente la edad del estudiante. Retornar un mensaje dependiendo de esa variable si es mayor o igual a 21, el mensaje debe decir Mayor de edad, de lo contrario Menor de edad.

Tercer método: Retornar el resultado de una Multiplicación de dos enteros que proporcionemos como parámetros.

Cuarto método:  Debe retornar una lista de numeros del 1 al X. Donde X es un parámetro de entrada del método a crear.
 */

public class Recursos {
    // Método 1: Retorna un mensaje 
    public String mensajePOO() {
        return "Programación Orientada a Objetos 2021";
    }

    // Método 2: Verifica si la edad es mayor o igual a 21
    public String verificarEdad(int edad) {
        if (edad >= 18) {
            return "Mayor de edad";
        } else {
            return "Menor de edad";
        }
    }

    // Método 3: Multiplicación de dos enteros
    public int mult(int a, int b) {
        return a * b;
    }

    // Método 4: Genera una lista de números del 1 al X
    public int[] generarListaNumeros(int X) {
        int[] listaNumeros = new int[X];
        for (int i = 0; i < X; i++) {
            listaNumeros[i] = i + 1;
        }
        return listaNumeros;
    }

    public static void main(String[] args) {
        Recursos recursos = new Recursos();

        // Llamada a los métodos
        System.out.println(recursos.mensajePOO());

        int edadEstudiante = 19; // Cambia este valor según la edad del estudiante
        System.out.println(recursos.verificarEdad(edadEstudiante));

        int resultadoMultiplicacion = recursos.mult(5, 3);
        System.out.println("Resultado de la multiplicación: " + resultadoMultiplicacion);

        int X = 10; // Cambia este valor para generar una lista de números diferente
        int[] listaNumeros = recursos.generarListaNumeros(X);
        System.out.print("Lista de números del 1 al " + X + ": ");
        for (int num : listaNumeros) {
            System.out.print(num + " ");
        }
    }
}
