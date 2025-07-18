/**
 20. W.A.P to check whether a charachter is an alphabet or not.
 */

import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter letter somethng");
        char ch = sc.next().charAt(0);
       if((ch >= 'A' && ch <='Z' )||(ch >= 'a' && ch<='z')){
            System.out.println("It is a alphaet");
       }
       else{
             System.out.println("It is not a alphaet");
       }
       
    }
}