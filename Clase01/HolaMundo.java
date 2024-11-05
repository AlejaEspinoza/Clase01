import java.util.Scanner;
/**
 * HolaMundo
 */
public class HolaMundo {
    public static void main(String[] args) {
        //Imprimir datos en pantalla /consola / terminal
        System.out.println("10");

        System.out.print("Como van las cosas");
        System.out.print(10);
        System.out.print(10.5);
        System.out.print('a');
        System.out.println("Mi nombre es " + "Alejandra" + "y tengo" + 27 + "años");
        
        System.out.printf("Aqui va una cadena: %s%n", "Alejandra");
        System.out.printf("Aqui va un entero: %d%n", 10);
        System.out.printf("Mi nombre es %s y tengo %d años%n", "Alejandra Espinoza", 10);

        var entrada = new Scanner(System.in);

        System.out.print("Por favor ingrese su nombre: ");
        var entero = entrada.nextInt();

        System.out.println(entero);

        entrada.close();

           
    }

}