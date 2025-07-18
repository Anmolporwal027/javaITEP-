/**
 24. Write a Java program to count total number of notes in given amount.
 */
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount  ");
        int amt = sc.nextInt();
        int ten = 0 ;
        int twenty = 0;
        int fifty = 0;
        int hundered = 0;
       if(amt >= 100){
            hundered = amt/100;
            amt = amt % 100;
       }
       if(amt >= 50){
            fifty = amt/50;
            amt = amt % 50;
       }
       if(amt >= 20){
            twenty = amt/20;
            amt = amt%20;
       }
       if(amt >= 10){
            ten = amt/10;
            amt = amt%10;
       }

       System.out.println("notes of 100 "+hundered);
       System.out.println("notes of 50 "+fifty);
       System.out.println("notes of 20 "+twenty);
       System.out.println("notes of 10 "+ten);
    }
}