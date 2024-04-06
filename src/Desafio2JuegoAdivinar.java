import java.util.Scanner;

public class Desafio2JuegoAdivinar {
    public static void main(String[] args) {
        /*
        Practica los conceptos que se enseñaron durante esta clase con el siguiente desafío:
        Crea un programa que simule un juego de adivinanzas. El programa debe generar un número
        aleatorio entre 0 y 100, y pedir al usuario que intente adivinar ese número en un máximo de 5 intentos.
        En cada intento, el programa debe informar si el número ingresado por el usuario es mayor o menor que
        el número generado.
         */

        int numeroRandom = (int)(Math.random() * 100) + 1;
        int vidas = 5;
        for (int i = 0 ; i < 5 ;i++){
            System.out.println("Ingrese un numero: ");
            Scanner scanNumeroUsuario = new Scanner(System.in);
            int numeroUsuario = scanNumeroUsuario.nextInt();

            if (numeroRandom == numeroUsuario){
                System.out.println("Acertaste el número");
                break;

            } else{
                String mensajePista  = (numeroRandom>numeroUsuario)? "El número es mayor":"El número es menor";
                System.out.println(mensajePista);

            }
            vidas --;
            String mensajeVidas = (vidas == 0)? "Fin del Juego" : "Vidas restantes = " + vidas;
            System.out.println(mensajeVidas);


        }

    }
}
