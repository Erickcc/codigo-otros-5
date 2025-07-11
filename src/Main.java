//Agregamos el paquete de Scanner
import java.util.Scanner;

/*
Descripcion del codig
Se le pide un numero al usuario y se evalua si el numero es afortunado o no en base a la sumatoria de sus sus digitos
afortunados y desafortunados
Digitos que se consideran afortunados: 3, 7, 8, 9
Digitos que se consideran desafortunados: 1, 2, 4, 5, 6

Input: 123;
Output: El 123 es un numero desafortunado
Explicacion: tenemos 2 numeros desafortunados (1 y 2) y solo tenemos un numero afortunado.
Para que el numero sea afortunado la sumatoria de numeros afortunados tiene que ser mayor que la de desafortunados

Input: 33312;
Output: El 33312 es un numero afortunado
 */


public class Main {
    public static void main(String[] args) {
        Codigo5 numero = new Codigo5();
        numero.numeroAfortunado();
    }

}

//Se le quito modificador de acceso publico a la clase Codigo5
class Codigo5 {
    public void numeroAfortunado () {
        //Se agrego el (Syste.in) en Scanner
        Scanner s = new Scanner(System.in);
        //Sout usaba una comilla simple y unas comillas dobles, se cambio la comilla simple a comilla doble
        System.out.print("Introduzca un número: ");
        //Se cambio el tipo de ni a int
        int ni = s.nextInt();
        int c = ni;

        int afo = 0;
        int noAfo = 0;
        while (ni > 0) {
            //Se elimino el casteo a int de la siguiente evaluacion
            int digito = (ni % 10);
            if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
                afo++;
                //Se agrega division de ni para que ciclo no sea infinito
                ni /= 10;
            } else {
                noAfo++;
                ni /= 10;
            }
        }
        //Se condicional del ciclo while para que se imprima solo el resultado final
        if (afo > noAfo) {
            //Se corrigio la palabara prinln a println
            System.out.println("El " + c + " es un número afortunado.");
        } else {
            System.out.println("El " + c + " no es un número afortunado.");
        }
        s.close();
    }
}
//Se identa el codigo de manera apropiada