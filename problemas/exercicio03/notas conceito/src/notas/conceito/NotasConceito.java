package notas.conceito;

import java.util.Scanner;

public class NotasConceito {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        float nota1, nota2, media;
        String conceito;
        
        System.out.println("Qual foi sua nota da N1?");
        nota1 = leia.nextFloat();
        
        System.out.println("Qual foi sua nota da N2?");
        nota2 = leia.nextFloat();
        
        media = (nota1 + nota2) / 2;
        System.out.println("Sua média é " + media);
        
        if (media >= 9){
            conceito = "A";
        } else if (media >= 7.5){
            conceito = "B";
        } else if (media >=6){
            conceito = "C";
        } else if (media >= 4){
            conceito = "D";
        } else{
            conceito = "F";
        }

        System.out.println("Seu conceito é " + conceito);
        
        if (conceito == "A" || conceito == "B" || conceito == "C"){
            System.out.println("Parabéns, você está APROVADO!");
        } else {
            System.out.println("Que pena, você está REPROVADO!");
        }
    }
}
