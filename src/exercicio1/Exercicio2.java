/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.util.Scanner;

/**
 *
 * @author 31381243
 */
public class Exercicio2 {

    int option;

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }

    public Exercicio2() {
        String option1 = "Solteiro(a)";
        String option2 = "Desquitado(a)";
        String option3 = "Casado(a)";
        String option4 = "Divorciado(a)";
        String option5 = "Viúvo";

        System.out.println("1 - " + option1 + " \n2 - " + option2 + "\n3 - " + option3 + "\n4 - " + option4 + "\n5 -  " + option5);
        Scanner sc = new Scanner(System.in);
        String optionInput = sc.nextLine();

        option = Integer.parseInt(optionInput);
        if (option < 1 || option > 5) {
            System.out.println("Opção invalida");
        } else {
            switch (option) {
                case 1:
                    System.out.println(option1);
                    break;
                case 2:
                    System.out.println(option2);
                    break;
                case 3:
                    System.out.println(option3);
                    break;
                case 4:
                    System.out.println(option4);
                    break;
                case 5:
                    System.out.println(option5);
                    break;

            }
        }
    }

}
