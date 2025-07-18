/**
14.Write a program to accept percantage from the user and
display grade according to the following criteria
  Marks	  		Grade
  > 90       		 A
  >80 and <=90		 B
  >=60 and <=80		 C
  below 60		     D
 */

import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter percentage");
        int mark = sc.nextInt();

        if(mark > 90){
            System.out.println("Grade A");
        }
        else if(mark > 80 && mark <=90){
            System.out.println("Grade B");
        }
        else if(mark >= 60 && mark <= 80){
            System.out.println("Grade C");
        }
        else if(mark < 60){
            System.out.println("Grade D");
        }

    }
}