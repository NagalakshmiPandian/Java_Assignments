/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emp_sal;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Emp_sal {
    public static void main(String[] args) {
        // TODO code application logic here
        String name,month;
        int age,mon_salary,year,current_year=2020,date;
        int annual_salary;
        float tax;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name of the Employee: ");
        name = sc.next();
        System.out.println("Enter the Year of birth: ");
        year=sc.nextInt();
        System.out.println("Enter the Month of birth: ");
        month=sc.next();
        System.out.println("Enter the Date of birth: ");
        date = sc.nextInt();
        age = current_year - year;
        System.out.println("The age of the Employee: "+age);
        System.out.println("Enter the monthly salary of the Employee: ");
        mon_salary = sc.nextInt();
        annual_salary = mon_salary * 12;
        System.out.println("Annual salary of the employee: "+annual_salary);
        if(annual_salary >= 500000){
            tax = (annual_salary *(20/100));
            System.out.println("Tax amount to be paid by employee per annum is "+tax);
            
        }

    }
    
}
