
import java.util.Scanner;

public class valores {
    public static void main(String[] args) {
        int dato;
        Scanner entrada = new Scanner(System.in);
        System.out.printf("bienvenido por favor  selecccione una de las siguientes opciones");
        System.out.printf(" 1.digitar dos valores 2.digitar nombre y edad 3.sacar el area de un triangulo");
        dato = entrada.nextInt();
        switch (dato) {
            case 1:
                System.out.printf("opcion 1");
                System.out.printf("por favor digite dos valores");
                Scanner valores = new Scanner(System.in);
                int n1 = 0;
                int n2 = 0;
                n1=valores.nextInt();
                n2= valores.nextInt();
                int multiplicacion = n1 * n2;
                System.out.printf("el resultado de la multiplicacion es" + multiplicacion);
                int resta = n1 - n2;
                System.out.printf("el resultado de la resta es" + resta);
                break;
            case 2:
                System.out.printf("opcion 2");
                System.out.printf("por favor digite su nombre y edad");
                Scanner item = new Scanner(System.in);
                String nombre;
                int edad = 0;
                int valor = 10000;
                nombre= item.next();
                edad= item.nextInt();
                if (edad >= 18) {
                    int cobro = edad * valor;
                    System.out.printf("usted genera un cobro de" +cobro);
                    System.out.printf(" y su nombre es"+ nombre);

                } else {
                    System.out.printf("usted no genera cobro");

                }
                break;
            case 3:
                System.out.printf("opcion 3");
                System.out.printf("por favor digite la base y la altura de un triangulo");
                Scanner option = new Scanner(System.in);
                int B = 0;
                int h = 0;
                B=option.nextInt();
                h= option.nextInt();
                int operacion = B * h / 2;
                System.out.printf("el area del triangulo es" + operacion);
                break;
            default:
                System.out.printf("la opcion seleccionada no existe");
        }

        }
    }
