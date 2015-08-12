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
public class Exercicio3 {

    public Exercicio3() {
        System.out.println("Digite o nome de cada praia(OBS: o nome da ultima praia deverá ser zzz)");
        String beach;
        String bigestDistanceBeach="";
        String beachRange = "";
        double bigestDistance = 0;
        double numberOfBeaches = 0;
        double sumOfDistances = 0;
        do{
        System.out.println("Digite o nome da praia: ");
        Scanner sc = new Scanner(System.in);
        beach = sc.nextLine();
        System.out.println("Digite a distância em Km do hotel: ");
        String distanceInput = sc.nextLine();
        int distance = Integer.parseInt(distanceInput);

        
        if(distance >= bigestDistance){
            bigestDistance = distance;
            bigestDistanceBeach = beach +", "+bigestDistanceBeach;
        }else{
            if(distance > bigestDistance){
            bigestDistanceBeach = beach;
        }
        }
        if(distance>=10 && distance <=15){
            beachRange = beachRange+ ", " +beach;
        }

        numberOfBeaches++;
        sumOfDistances = sumOfDistances + distance;
        
        }while(!beach.equals("zzz"));
        double avgOfDistances = sumOfDistances/numberOfBeaches;
        System.out.println("Praia mais distante: " + bigestDistanceBeach);
        System.out.println("Praias que estão a mais de 10km e menos de 15km: "+beachRange);
        System.out.println("Distância média das praias: "+avgOfDistances);
    }
    
}
