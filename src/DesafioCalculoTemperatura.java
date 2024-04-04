import java.util.Scanner;

public class DesafioCalculoTemperatura {
    public static void main(String[] args) {

        /*Consejo: La fórmula para convertir temperaturas de grados Celsius a Fahrenheit es: (temperatura * 1.8) + 32.*/

        System.out.println("Conversor de temperatura en grados Celsius a Fahrenheit.\nIngrese la temperatura en grados Celsius: ");
        Scanner s = new Scanner(System.in);
        int temperaturaEnCelsius = s.nextInt();
        double resultadoFormula = temperaturaEnCelsius * 1.8 + 32;

        System.out.println( temperaturaEnCelsius+ " grados Celsius corresponden a " + resultadoFormula + " grados Fahrenheit.");

    }
}
