/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Students {
    public static void main(String[] args) {
        // TODO code application logic here
        int num1,num2,num3,num4,num5;
        float Per,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of the first subjects:");
        num1 = sc.nextInt();
        System.out.println("Enter the marks of the second subject");
        num2 = sc.nextInt();
        System.out.println("Enter the marks of the third subject");
        num3 = sc.nextInt();
        System.out.println("Enter the marks of the fourth subject");
        num4 = sc.nextInt();
        System.out.println("Enter the marks of the fifth subject");
        num5 = sc.nextInt();
        sum = num1+num2+num3+num4+num5;
        Per = (sum/500)*100;
        System.out.println("Percentage of the 5 subject marks is " + Per);
        if(Per>90){
            System.out.println("The student has got 'A' grade ");
        }
        else if(Per>80 && Per<90){
            System.out.println("The student has got 'B' grade ");
        }
        else if(Per>70 && Per<80){
            System.out.println("The student has got 'C' grade ");
        }
        else if(Per>60 && Per<70){
            System.out.println("The student has got 'D' grade ");
        }
        else if(Per>50 && Per<60){
            System.out.println("The student has got 'E' grade ");
        }
        else{
            System.out.println("The student has got failed in the examination");
        }
    }
    
}
