import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int minId = 111;
        final int maxId = 999;
        final int minEdad = 14;
        final int maxEdad = 120;
        final int minTipoVenta = 0;
        final int maxTipoVenta = 3;
        final int minCompra = 0;
        final int maxCompra = 1000;
        final int minTelefono = 111111111;
        final int maxTelefono = 999999999;

        Scanner teclado = new Scanner(System.in);

        boolean error = false;


        System.out.println("Introduce tu ID: ");
        int id = teclado.nextInt();
        if (id < minId || id > maxId) {
            error = true;
            mensajeError();
        }


        int edad = 0;
        if (!error) {
            System.out.println("Introduce tu edad: ");
            edad = teclado.nextInt();
            if (edad < minEdad || edad > maxEdad) {
                error = true;
                mensajeError();
            }
        }


        int tipoVenta = 0;
        if (!error) {
            System.out.println("Introduce el código del tipo de venta (venta libre: 0; pensionista: 1; carnet joven: 2; socio: 3): ");
            tipoVenta = teclado.nextInt();
            if (tipoVenta < minTipoVenta || tipoVenta > maxTipoVenta) {
                error = true;
                mensajeError();
            }
        }


        int importeCompra = 0;
        if (!error) {
            System.out.println("Introduce el importe de compra: ");
            importeCompra = teclado.nextInt();
            if (importeCompra < minCompra || importeCompra > maxCompra) {
                error = true;
                mensajeError();
            }
        }


        int telefono = 0;
        if (!error) {
            System.out.println("Introduce un teléfono de contacto: ");
            telefono = teclado.nextInt();
            if (telefono < minTelefono || telefono > maxTelefono) {
                error = true;
                mensajeError();
            }
        }


        if (!error) {
            String tipoVentaTexto = switch (tipoVenta) {
                case 0 -> "venta libre";
                case 1 -> "pensionista";
                case 2 -> "carnet joven";
                case 3 -> "socio";
                default -> "Tipo de venta desconocido.";
            };

            System.out.println("Los datos introducidos son válidos.");

            System.out.println("ID " + id + ", edad " + edad + ", tipo de venta " +tipoVentaTexto + ", importe de compra " + importeCompra +" €" + ", teléfono de contacto: " + telefono);

        }


    }

    private static void mensajeError() {
        System.out.println("Datos inválidos. Por favor, verifica tus datos.");
    }
}
