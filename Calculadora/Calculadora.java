package calculadora;
import calculadora.Logica.Operaciones;
import java.util.Scanner; 

public class Calculadora {
    public static void Calculadora(String[] args) {
        Scanner leer = new Scanner(System.in);
        char r = 'm';
        int numero = 0;
        int contador=0;

        Operaciones op = new Operaciones();


        while (r == 'm' && numero != 5) {
            System.out.println("-----¿QUE OPERACION DESEA REALIZAR?----- \n[1] sumar\n[2]Restar\n[3]multiplicar\n[4]dividir\n[5] salir");
            numero = leer.nextInt();
            switch (numero) {
                case 1:
                    double a, b;
                    System.out.println("Ingrese el primer numero");
                    a = leer.nextDouble();
                    System.out.println("Ingresa el segundo numero");
                    b = leer.nextDouble();
                    System.out.println("El resultado de la suma es: " + Operaciones.sum(a, b));
                    contador++;
                    break;
                case 2:
                    System.out.println("Ingrese el primer numero");
                    a = leer.nextDouble();
                    System.out.println("Ingresa el segundo numero");
                    b = leer.nextDouble();
                    System.out.println("El resultado de su resta es: " + Operaciones.res(a, b));
                    contador++;
                    break;
                case 3:
                    System.out.println("Ingrese el primero numero");
                    a = leer.nextDouble();
                    System.out.println("Ingresa el segundo numero");
                    b = leer.nextDouble();
                    System.out.println("El resultado de su multiplicacion es: " + Operaciones.mul(a, b));
                    contador++;
                    break;
                case 4:
                    System.out.println("Ingrese el primer numero");
                    a = leer.nextDouble();
                    System.out.println("Ingresa el segundo numero2");
                    b = leer.nextDouble();
                    System.out.println("El resultado de su division es: " + Operaciones.div(a, b));
                    contador++;
                    break;
                case 5:
                    System.out.println("");
                    break;
                default:
                    System.out.println("valor incorrector, ingrese un numero nuevamente ");
            }
            if (numero != 5) {
                System.out.println("¿Desea realizar otra operacion?\nsi \nno");
                r = leer.next().charAt(0);
            } else {
                System.out.println("adios");
            }
        }

    }
}
