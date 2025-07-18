/**
 Find even odd using switch case
 */

import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter val ");
        int val = sc.nextInt();

        switch(val%2){
            case 0:
                System.out.println("Value is even"+val);
                break;
            case 1:
                System.out.println("Value is odd"+val);
                break;
        }
    }
}