/*
    25. 100 bricks of length 24 cm and breadth 15 cm are used to tile a path of a garden. What is the area of the path
*/

import java.util.Scanner;

class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the brick");
        int len = sc.nextInt();

        System.out.println("Enter breadth of the brick");
        int bre = sc.nextInt();
        
        int areab = len*bre;
        int totalarea = areab*100;
        System.out.println("area of the path is "+totalarea);
    }
}