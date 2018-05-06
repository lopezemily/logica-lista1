package media;

import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        float nota1, nota2, mediafinal;
        
        System.out.println("Qual foi sua nota 1?");
        nota1 = leia.nextFloat();
        
        System.out.println("Qual foi a sua nota 2?");
        nota2 = leia.nextFloat();
        
        mediafinal = (nota1 + nota2) / 2;
        System.out.println("Sua média final é " + mediafinal);
        
        if (mediafinal > 5){
            System.out.println("Parabéns! Você foi aprovado!");            
        } else{
            System.out.println("Que pena! Você foi reprovado!");
        }
    }
}
