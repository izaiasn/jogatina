package br.senai.sp.joquepo;

import java.util.Random;
import java.util.Scanner;

public class joquepo {
    public static void main(String[] args) {

        System.out.println("------------------------------------------");
        System.out.println("*****************JOQUEPO******************");
        System.out.println("------------------------------------------");

        int userNumber = 0;
        int computerRandom;
        boolean continua= true;
        while (continua) {
            Scanner teclado = new Scanner(System.in);
            System.out.print("\nDigite 1: PEDRA / 2: PAPEL / 3:Tesoura: ");
            userNumber = teclado.nextInt();
            System.out.println(userNumber);
            Random random = new Random();
            computerRandom = random.nextInt(3) + 1;

            if (userNumber == computerRandom) {
                System.out.print("Empate ");
                continua = false;


            } else if ((userNumber == 1 && computerRandom == 3) || (userNumber == 2 && computerRandom == 1 || (userNumber == 3 && computerRandom == 2))) {
                System.out.println("Você ganhou: " + "Você colocou: " + userNumber + " Computador: " + computerRandom);


            } else
                System.out.print(" Você Perdeu: " + userNumber + " Computador: " + computerRandom);


            switch (computerRandom) {
                case 1:
                    System.out.println(" O pc escolheu Pedra");
                    break;
                case 2:
                    System.out.println(" O PC escolheu Papel");
                    break;

                case  3:
                    System.out.println(" O PC escolheu Tesoura");
                    break;


            }

        }
    }
}
