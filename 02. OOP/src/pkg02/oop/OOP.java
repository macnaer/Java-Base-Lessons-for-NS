/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.oop;

import java.io.IOException;

/**
 *
 * @author macnaer
 */
public class OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
//        Developer stive = new Developer("Stive ", "Rivne", "Senior Java developrer", 40, 4500);
//        stive.GetDeveloperInfo();
//        System.out.println( stive.GetName() +" salary " + stive.GetSalary());
//        stive.SetSalary(4650);
//        System.out.println( stive.GetName() +" salary " + stive.GetSalary());
        
//        Developer[] devTeam = new Developer[3];
//        for(int i = 0; i < 3; i++){
//            devTeam[i] = new Developer();
//        }
//        System.out.println("======================================");
//        for(int i = 0; i < 3; i++){
//            devTeam[i].GetDeveloperInfo();
//        }


//        Developer stive = new Developer("Stive ", "Rivne", "Senior Java developrer", 40, 4500); 
//        Developer bob = new Developer("Bob ", "Lviv", "Senior Android developrer", 29 , 4500); 
//        stive.CompareSalary(bob);

          Junior tom = new Junior("Jack Sparrow", "Tartuga","Capitan CTO", 100500, 1000, "Beginner", "Write code using stack overflow");
          tom.GetDeveloperInfo();
          tom.Drink("Rome");
    }
    
}
