/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.oop;

/**
 *
 * @author macnaer
 */
public class Junior extends Developer implements IDrink{
    private String fixLevel;
    private String writeCode;
    
    public Junior(String name, String city, String position, int age, int salary, String fixLevel, String writeCode){
        super(name, city, position, age, salary);
        this.fixLevel = fixLevel;
        this.writeCode = writeCode;
    }
    
    public void GetDeveloperInfo(){
        System.out.println("Name: " + this.name + "\nCity: " + this.city + "\nPosition: " 
                + this.position + "\nAge: " + this.age+ "\nSalary: " + this.salary + "\nFix Level: " + this.fixLevel
                + "\nWrite Code: " + this.writeCode);
    }

    @Override
    public void Drink(String drink) {
        String[] drinks = new String[3];
        drinks[0] = "Tea";
        drinks[1] = "Coffe";
        drinks[2] = "Milk";
        for (int i = 0; i < 3; i++){
             if (drinks[i] == drink){
                System.out.println(this.name + " drinks " + drink);
                return;
            }
        }
        System.out.println("Permission denied!");
        
    }
    
}
