/*
    32. A square garden with a side length of 150 m has a square swimming pool in the very centre with a side length of 25 m . Calculate the area of the garden
 */
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of garden");
        int glen = sc.nextInt();

        System.out.println("Enter area of pool");
        int plen = sc.nextInt();

        int parea = plen * plen;
        int garea = glen * glen;

        double newarea = garea - parea;

         System.out.println("area of the garden after removing pool "+newarea);
    }
}