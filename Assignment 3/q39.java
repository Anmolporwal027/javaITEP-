/**
 25. Write a Java program to calculate profit or loss. 
 */
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter buy amount  ");
        int buy = sc.nextInt();
        System.out.println("Enter sell amount  ");
        int sell = sc.nextInt();
     
        if(buy < sell ){
            System.out.println("you got profit of rs "+(sell-buy));
        }
        else{
            System.out.println("you got loss of rs "+(buy-sell));
        }
       
    }
}