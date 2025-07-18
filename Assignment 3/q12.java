/*
    12.A 4 digit number is entered through keyboard. Write a program to print a new number with digits reversed as of orignal one. E.g.-
    INPUT : 1234        OUTPUT : 4321
    INPUT : 5982        OUTPUT : 2895
 */

import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of 4 digit");
        int num = sc.nextInt();

        int rev = 0;
        for(int i=0; i<4; i++){
            int rem = num % 10;
            rev = (rev*10)+rem;
            num = num/10;
            i++;
        }
        System.out.println(rev);

    }
}