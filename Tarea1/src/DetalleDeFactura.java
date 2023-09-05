import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cual es el nombre de la factura?");
        String nombreFactura = scanner.nextLine();;

        System.out.println("Cual es el precio del primer producto?");
        double precioProducto1 = scanner.nextDouble();


        System.out.println("Cual es precio del segundo producto?");
        double precioProducto2 = scanner.nextDouble();

        double resultadoSumaProductos = precioProducto1 + precioProducto2;
        double impuesto = resultadoSumaProductos * 0.19;
        double productosConImpuesto = resultadoSumaProductos + impuesto;

        System.out.println("La Factura " + nombreFactura + " tiene un total bruto de " + resultadoSumaProductos +
                " pesos, con un impuesto de " + impuesto + " pesos, y el monto total es de " + productosConImpuesto + " pesos.");

        System.out.println("Probando repositorio");
    }
}
