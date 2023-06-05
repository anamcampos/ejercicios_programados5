package ejercicio.ejerciciocuenta;
import java.util.Scanner;

public class EjercicioCuenta {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Buenas, por favor, ingrese su nombre");
        String nombre = input.next();
         System.out.println("Por favor, ingrese una cantidad inicial en la cuenta");
        double cant = input.nextDouble();
        while (cant<=0){
        System.out.println("Por favor, ingrese una cantidad válida");
        cant = input.nextDouble();
        }
        Cuenta persona1 = new Cuenta(nombre,cant);
        //PARA DEJAR QUE LA PERSONA INGRESE Y RETIRE DINERO LA CANTIDAD DE VECES QUE DESEE
        int op;
        do {
        System.out.println("||DE LAS SIGUIENTE OPCIONES, DIGITE||");
        System.out.println("|| 1- INGRESAR DINERO A LA CUENTA ||");
        System.out.println("|| 2- RETIRAR DINERO DE LA CUENTA ||");
        System.out.println("||3- CONOCER LA CANTIDAD DE SU CUENTA||");
        System.out.println("||           4- SALIR               ||");
        System.out.println(" ");
        op = input.nextInt();
        switch (op){
            case 1:
                System.out.println("Ingrese la cantidad que desea ingresar a su cuenta");
                double ingreso= input.nextDouble();
                while (ingreso<=0){
                System.out.println("Ingrese una cantidad válida");
                ingreso= input.nextDouble();
                }
                persona1.ingresar(ingreso);
                break;
            case 2:
                System.out.println("Ingrese la cantidad que desea retirar de su cuenta");
                double retiro= input.nextDouble();
                while (retiro<=0){
                System.out.println("Ingrese una cantidad válida");
                retiro= input.nextDouble();
                }
                persona1.retirar(retiro);
                break;
            case 3:
                System.out.println(persona1.imprimir());
                break;
            case 4:
                 System.out.println("Muchas gracias por utilizar el programa...");
                 System.out.println("Saliendo...");
                break;
            default:
                
                break;
        }  
        } while(op!=4);
    }
}
