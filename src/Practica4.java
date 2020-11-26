import java.util.Scanner;
public class Practica4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int estructura;
        do {
            System.out.println("Introduce el ejercicio que quieras resolver:");
            System.out.println("1-For");
            System.out.println("2-While");
            estructura = sc.nextInt();

            if (estructura == 1) {
                System.out.println("Lado a:");
                int a = sc.nextInt();
                System.out.println("Lado b:");
                int b = sc.nextInt();
                System.out.println("Introduce un carácter:");
                char c = sc.next().charAt(0);


                if (a<b) {

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
                System.out.println("Vamos a encontrar un número elegido al azar entre 1 y 100.");
                System.out.println("Si quieres rendirte introduce un 0");
                System.out.println("Introduce un número del 1 al 100");
                int numAleatorio = (int) (Math.random() * 100 + 1);
                int numero;

                boolean seguir = true;

                do {
                    numero = sc.nextInt();
                    if (numero > numAleatorio && numero != 0) {
                        System.out.println("El número es menor que " + numero);
                    } else {
                        System.out.println("El número es mayor que " + numero);
                }

            } while (numero != numAleatorio) ;
                System.out.println("Felicidades, has encontrado el número. Era " + numAleatorio);
                seguir = false;

            } else {
                System.out.println("Opción incorrecta");
            }

        } while (estructura != 1 && estructura != 2);


    }
}