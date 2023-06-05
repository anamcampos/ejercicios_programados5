package ejercicio.ejerciciopersona;
import java.util.Scanner;

public class EjercicioPersona {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Para la variable que captura el valor del método mayorDeEdad
        boolean v;
        Persona persona1 = new Persona();
        System.out.println("Bievenidx! Digite su nombre");
        persona1.setNombre(input.next());
         System.out.println("Digite su edad");
         persona1.setEdad(input.nextInt());
        while (persona1.getEdad()<=0){
         System.out.println("Digite una edad válida");
          persona1.setEdad(input.nextInt());
        }
         System.out.println("Digite su sexo como H o M");
        char sexo = input.next().charAt(0);
        persona1.setSexo(sexo);
        persona1.comprobarSexo();
        System.out.println("Digite su peso en Kg como 58,2");
        persona1.setPeso(input.nextDouble());
         while (persona1.getPeso()<=0){
        System.out.println("Digite peso válido");
           persona1.setPeso(input.nextDouble());
        }
         System.out.println("Digite su altura en metros, ejemplo: 1,80");
         persona1.setAltura(input.nextDouble());
         while (persona1.getAltura()<=0){
        System.out.println("Digite una altura válida");
        persona1.setAltura(input.nextDouble());
         }
        System.out.println("Imprimiendo información...");
        System.out.println( persona1.imprimir());
        v = persona1.mayorDeEdad();
        if (v == true){
            System.out.println("Usted es mayor de edad");
        } else {
            System.out.println("Usted es menor de edad");
        }
        System.out.println("Calculando su IMC...");
        persona1.calcImc();          
    }
}
