/**
 26. Write a Java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.          Calculate percentage and grade according to following: 
	Percentage >= 90% : Grade A 
	Percentage >= 80% : Grade B 
	Percentage >= 70% : Grade C 
	Percentage >= 60% : Grade D 
	Percentage >= 40% : Grade E 
	Percentage < 40% : Grade F

 */

import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mark of physic ");
        int physic = sc.nextInt();
        System.out.println("Enter mark of chemistry ");
        int chem = sc.nextInt();
        System.out.println("Enter mark of bio ");
        int bio = sc.nextInt();
        System.out.println("Enter mark of maths ");
        int math = sc.nextInt();
        System.out.println("Enter mark of computer ");
        int comp = sc.nextInt();
      
        int totalmark = physic+bio+chem+comp+math;
        float percentage  = (float)totalmark/5;
        if(percentage >= 90){
            System.out.println("a");
        }
        else if(percentage >= 80){
            System.out.println("b");
        }
        else if(percentage >= 70){
            System.out.println("c");
        }
        else if(percentage >= 60){
            System.out.println("d");
        }
        else if(percentage >= 40){
            System.out.println("e");
        }
        else if(percentage < 40){
            System.out.println("f");
        }
    }
}