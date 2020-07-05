/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.oop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author macnaer
 */
abstract public class Developer{
    protected String name;
    protected String city;
    protected String position;
    protected int age;
    protected int salary;
    
    public Developer(String name, String city, String position, int age, int salary){
        this.name = name;
        this.city = city;
        this.position = position;
        this.age = age;
        this.salary = salary;
    }    
    
    public Developer() throws IOException{
        BufferedReader buffered = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Name: ");
        this.name = buffered.readLine();
        System.out.print("City: ");
        this.city = buffered.readLine();
        System.out.print("Position: ");
        this.position = buffered.readLine();
        System.out.print("Age: ");
        this.age = Integer.parseInt(buffered.readLine());
        System.out.print("Salary: ");
        this.salary = Integer.parseInt(buffered.readLine());
        
    }
    
    public void CompareSalary(Developer dev){
        if (this.salary > dev.GetSalary()){
            System.out.println(this.name + " has higher salart then " + dev.name);
        }else if (this.salary < dev.GetSalary()){
            System.out.println(dev.name + " has higher salart then " + this.name);
        }else{
             System.out.println(dev.name + " has tha same salary as " + this.name);
        }
        
    }
    public void GetDeveloperInfo(){
        System.out.println("Name: " + this.name + "\nCity: " + this.city + "\nPosition: " 
                + this.position + "\nAge: " + this.age+ "\nSalary: " + this.salary);
    }
    
    
    public int GetSalary(){
        return this.salary;
    }
    
    public String GetName(){
        return this.name;
    }
    
    public void SetSalary(int newSalary){
        this.salary = newSalary;
    }
    
}
