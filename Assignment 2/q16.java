/*
    Tina wants a new carpet for her rectangular dining room. Her dining room is a 5 meters by 7 meters rectangle. How much carpet does she need to buy to cover her entire dining room.
 */


import java.util.Scanner;
class test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length ");
        float len = sc.nextFloat();
        
        System.out.println("Enter breadth ");
        float bre= sc.nextFloat();
        
        double area = len * bre;
        System.out.println("Area = "+area);

    }
}