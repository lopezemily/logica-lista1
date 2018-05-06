package media.parcial;

import java.util.Scanner;

public class MediaParcial {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        float nota1, nota2, notaparcial;
        Scanner status;

        System.out.println("Qual foi sua nota da N1?");
        nota1 = leia.nextFloat();

        System.out.println("Qual foi sua nota da N2?");
        nota2 = leia.nextFloat();

        notaparcial = (nota1 + nota2) / 2;
        System.out.println("Sua nota parcial é: " + notaparcial);

        if (notaparcial >= 10) {
            System.out.println("PARABÉNS! Você foi aprovado com honra! :D");
        } else if (notaparcial >= 7) {
            System.out.println("Muito bem! Você está aprovado! :)");
        } else if (notaparcial >= 5) {
            System.out.println("Cuidado! Você fidcou de exame...");
        } else {
            System.out.println("Que pena! Você foi reprovado! :(");
        }
    }   
}