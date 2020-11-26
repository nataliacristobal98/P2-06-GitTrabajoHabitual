import java.util.Scanner;
public class Practica4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int estructura;

         /* Primero abrimos un bucle do-while para comprobar si el número de ejercicio, si no es
        correcto hara la pregunta en bucle hasta que se de una respuesta válida */

        do {

            /* El DO nos indica que hay que hacer tales operaciones mientras la estructura sea igual a
            1 o 2 (WHILE) */

            System.out.println("Introduce el ejercicio que quieras resolver:");
            System.out.println("1-For");
            System.out.println("2-While");
            estructura = sc.nextInt();

             /* Usamos un if-else para comprobar la variable, mientras sea 1 o 2 se ejecutara la opción
            si no se imprimira el mensaje "Opción incorrecta" y se volverá a preguntar lo anterior */

            if (estructura == 1) {
                System.out.println("Lado a:");
                int a = sc.nextInt();
                System.out.println("Lado b:");
                int b = sc.nextInt();
                System.out.println("Introduce un carácter:");
                char c = sc.next().charAt(0);

                /* En este ejercicio se usa el blucle for. Lo primero es introducir una estructura
                if para comprobar si las variables son mayor o menor entre ellas, ya que la variable
                j tiene que ser la mayor, al ser la base del cuadrado */

                if (a<b) {

                    /* Anidamos un bucle for dentro de otro para que se cree la forma del cuadrado,
                    es decir, hasta que j no se ejecute las veces que indica i no parará */

                    for (int i = 1; i <= a; i++) {
                        for (int j = 1; j <= b; j++) {
                            System.out.print(c + " ");
                        }
                        System.out.println();
                    }
                } else {
                    for (int i = 1; i <= b; i++) {
                        for (int j = 1; j <= a; j++) {
                            System.out.print(c + " ");
                        }
                        System.out.println();
                    }
                }


            } else if (estructura == 2) {

                 /*En este ejercicio se usa el blucle while. Primero declaramos una variable aleatoria
                y escaneamos la que introduciomos*/

                System.out.println("Vamos a encontrar un número elegido al azar entre 1 y 100.");
                System.out.println("Si quieres rendirte introduce un 0");
                System.out.println("Introduce un número del 1 al 100");
                int numAleatorio = (int) (Math.random() * 100 + 1);
                int numero;

                /* Introducimos una estructura do-while para indicar que mientras el número
                introducido se diferente a la variable aleatoria o sea 0 se ejecute una estructura
                if, que dependiendo de la variable dará la pista de si el numAleatorio es mayor
                o menor que esta. En caso de que sea la respuesta correcta se parará el bucle */

                do {
                    numero = sc.nextInt();
                    if (numero > numAleatorio && numero !=0) {
                        System.out.println("El número es menor que " + numero);
                    } else if (numero == numAleatorio) {
                        System.out.println("Felicidades, has encontrado el número. Era " +numAleatorio);
                    }else if (numero < numAleatorio && numero !=0) {
                        System.out.println("El número es mayor que " + numero);
                    }
                } while (numero != numAleatorio && numero != 0);

            } else{
                System.out.println("Opción incorrecta");
            }



        } while (estructura != 1 && estructura != 2);


    }
}