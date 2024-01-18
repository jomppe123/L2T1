package com.example;

import java.util.Scanner;

/**
 
Hello world!**/
public class App 
{
    public static void main( String[] args )
    {
        boolean lopeta = false;
        
        Hedgehog hedgehog = new Hedgehog();
        System.out.println("moi");


        while(!lopeta){
            System.out.println("1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma");
            Scanner scanner = new Scanner(System.in);

            if(scanner.hasNext()){
                int valinta = 0;
                
                

                String syote = scanner.nextLine();
                valinta = Integer.parseInt(syote);




                switch (valinta) {
                    case 1:
                        System.out.println("Mitä siili sanoo:");
                        String sanomiset = scanner.nextLine();

                        hedgehog.speak(sanomiset);

                        break;

                    case 2:
                        System.out.println("Anna siilin nimi:");
                        String name = scanner.nextLine();
                        System.out.println("Anna siilin ikä:");
                        String stringAge = scanner.nextLine();
                        int age = Integer.parseInt(stringAge);
                        
                        hedgehog = new Hedgehog(name, age);
                        break;
                    case 3:
                        System.out.println("Monta kierrosta?");
                        String stringRounds = scanner.nextLine();
                        int rounds = Integer.parseInt(stringRounds);

                        hedgehog.run(rounds);
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        lopeta = true;
                        scanner.close();
                        break;

                    default:
                        System.out.println("Syöte oli väärä.");
                        break;
                }
            }
        }





    }

}
