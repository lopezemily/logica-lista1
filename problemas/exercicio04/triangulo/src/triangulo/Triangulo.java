package triangulo;

import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        float lado1, lado2, lado3, soma;

        System.out.println("Qual o valor do lado 1 do triângulo?");
        lado1 = leia.nextFloat();
        System.out.println("Qual o valor do lado 2 do triângulo?");
        lado2 = leia.nextFloat();
        System.out.println("Qual o valor do lado 3 do triângulo?");
        lado3 = leia.nextFloat();

        if (lado1 + lado2 > lado3 || lado1 + lado3 > lado2 || lado2 + lado3 > lado1) {
            System.out.println("É um triangulo! :D");
            if (lado1 == lado2 && lado2 == lado3 && lado1 == lado3) {
                System.out.println("Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Isósceles");
            } else {
                System.out.println("Escaleno");
            }
        } else {
            System.out.println("Não é um triângulo! D:");
        }
    }
}
