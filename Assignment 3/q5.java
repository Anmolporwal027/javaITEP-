/*
    Take input of age of 3 people by user and determine oldest and youngest among them.
 */

import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age ");
        int p1 = sc.nextInt();
        System.out.println("Enter your age ");
        int p2 = sc.nextInt();
        System.out.println("Enter your age ");
        int p3 = sc.nextInt();
        int oldest = 0;
        int young = 0;

        // for person 1
        if( p1 > p2 && p1 > p3){
                oldest = p1;
        }
        else if(p1 < p2 && p1 < p3){
                young = p1;
        }

        // for person 2
        if( p2 > p1 && p2 > p3){
                oldest = p2;
        }
        else if(p2 < p1 && p2 < p3){
                young = p2;
        }
        // for person 3
        if( p3 > p1 && p3 > p2){
                oldest = p3;
        }
        else if(p3 < p1 && p3 < p2){
                young = p3;
        }
        
        System.out.println("Youngest = "+young);
        System.out.println("oldest = "+oldest);
    }
}