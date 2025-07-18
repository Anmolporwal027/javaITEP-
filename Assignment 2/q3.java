/*
    How many tiles whose length and breadth are 13 cm and 7 cm respectively are needed to cover a rectangular region whose length and breadth are 520 cm and 140 cm? 
 */
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of tile");
        float len = sc.nextFloat();
        System.out.println("Enter breadth of tile");
        float bre = sc.nextFloat();

        System.out.println("Enter length of rectangle");
        float rlen = sc.nextFloat();
        System.out.println("Enter breadth of rectangle");
        float rbre = sc.nextFloat();


        float tarea = len * bre;
        float rarea = rlen * rbre;
        
        float numofTile = rarea/tarea;

        System.out.println("Numberr of tiles are : "+numofTile);

    }
}