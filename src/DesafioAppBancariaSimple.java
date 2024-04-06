import java.util.Scanner;

public class DesafioAppBancariaSimple {
    public static void main(String[] args) {
        //variables
        String cliente = "Shiv Roy";
        String tipoCuenta = "Corriente";
       /* double saldo = 10000000000d;*/
        double saldo = 1000000d;
        boolean salir = false;
        Scanner sOpciones = new Scanner(System.in);
        Scanner movimientoBancarioCliente = new Scanner(System.in);

        //ui
        System.out.println("##################### MAZE XLURX BANK #########################");
        System.out.println("Cliente = " + cliente);
        System.out.println("Tipo de cuenta = " + tipoCuenta);
        System.out.println("Saldo = " + "$" + saldo);
        System.out.println("##################################################################");


        //operaciones app

        while (!salir) {

            System.out.println("**Seleccione una opción**\n1.- Saldo\n2.- Depositar\n3.- Retirar\n4.- Salir\n");

            int opcionCliente = sOpciones.nextInt();


            switch (opcionCliente) {
                case 1 -> System.out.println("Su saldo actual es de " + "$" + saldo);
                case 2 -> {
                    System.out.println("¿Cuánto desea depositar?");
                    int cantidadDepositada = movimientoBancarioCliente.nextInt();
                    saldo = saldo + cantidadDepositada;
                }
                case 3 -> {
                    boolean cantidadValida = false;
                    System.out.println("¿Cuánto desea retirar?");
                    while (!cantidadValida) {
                        int cantidadRetirada = movimientoBancarioCliente.nextInt();
                        if (cantidadRetirada > saldo) {
                            System.out.println("Excede el máximo\nSu saldo actual es de = " + "$" + saldo);
                            System.out.println("Ingrese otro valor");
                        } else {
                            saldo = saldo - cantidadRetirada;
                            cantidadValida = true;
                        }
                    }
                }
                case 4 -> {
                    System.out.println("Cerrando Sesión...");
                    salir = true;
                }
                default -> System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
}




