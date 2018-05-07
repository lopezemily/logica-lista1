package crime;

import java.util.Scanner;

public class Crime {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
           
        String p1, p2, p3, p4, p5;
        int sims;
        
        System.out.println("Faremos algumas perguntas para saber sua participação no crime. Responda apenas com Sim ou Não.");
        
        System.out.println("Telefonou para a vítima?");
        p1 = leia.next();
        
        System.out.println("Esteve no local do crime?");
        p2 = leia.next();
        
        System.out.println("Mora perto da vítima?");
        p3 = leia.next();

        System.out.println("Devia para a vítima?");
        p4 = leia.next();
        
        System.out.println("Já trabalhou com a vítima?");
        p5 = leia.next();
        
        if(p1 == "Sim"){
            System.out.println("Suspeita");
        }
    }
    
}
