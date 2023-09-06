import java.util.Locale;
import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        System.out.println("Vaz a ingresar el nombre de tres familiares");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el nombre de tu primer familiar!");
        String nombre1 = scanner.nextLine();

        System.out.println("Ingresa el nombre de tu segundo familiar!");
        String nombre2 = scanner.nextLine();

        System.out.println("Ingresa el nombre de tu tercer familiar!");
        String nombre3 = scanner.nextLine();

        String resultado1 = nombre1.substring(1,2).toUpperCase();
        String resultado2 = nombre1.substring(nombre1.length()-2);
        String acabado1 = resultado1.concat(".").concat(resultado2);

        String resultado3 = nombre2.substring(1,2).toUpperCase();
        String resultado4 = nombre2.substring(nombre2.length()-2);
        String acabado2 = resultado3.concat(".").concat(resultado4);

        String resultado5 = nombre3.substring(1,2).toUpperCase();
        String resultado6 = nombre3.substring(nombre3.length()-2);
        String acabado3 = resultado5.concat(".").concat(resultado6);

        String global = acabado1.concat("_").concat(acabado2).concat("_").concat(acabado3);
        System.out.println(global);



    }
}
