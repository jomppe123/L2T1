package main;

import java.util.Scanner;

/**
 
Hello world!**/
public class App 
{
    public static void main( String[] args )
    {
        boolean lopeta = false;
        
        Hedgehog hedgehog = new Hedgehog();
        Scanner scanner = new Scanner(System.in);

        while(!lopeta){
            System.out.println("1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma");
            

            if(scanner.hasNext()){
                int valinta = 0;
                
                

                String syote = scanner.nextLine();
                valinta = Integer.parseInt(syote);

                switch (valinta) {
                    case 1:
                        System.out.println("Mitä siili sanoo:");
                        String sanomiset = scanner.nextLine();

                        if (sanomiset.isEmpty()) {
                            hedgehog.speakEmpty();
                        }else{
                            hedgehog.speak(sanomiset);
                        }
                        break;

                    case 2:
                        System.out.println("Anna siilin nimi:");
                        String name = scanner.nextLine();
                        System.out.println("Anna siilin ikä:");
                        String stringAge = scanner.nextLine();
                        int age = Integer.parseInt(stringAge);

                        if(age > 0){
                            hedgehog = new Hedgehog(name, age);
                            
                        }else{
                            System.out.println("Syöte oli väärä");
                        }
                        
                        break;
                    case 3:
                        System.out.println("Kuinka monta kierrosta?");
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
                        System.out.println("Syöte oli väärä");
                        break;
                }
            }
        }





    }

}
