/**
 9. Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).
 */

import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character ");
        char ch = sc.next().charAt(0);
      
        if(ch >='a' && ch<='z'){
            System.out.println("lowercase character");
        }
        else if( ch >= 'A' && ch <= 'Z'){
            System.out.println("uppercase character");
        }
        else{
            System.out.println("Enter correct character ");
        }
    }
}