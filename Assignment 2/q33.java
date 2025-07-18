/*
    33. A rectangular garden has dimensions of 30 m by 20 m and is divided in to 4 parts by two pathways that run perpendicular from its sides. One pathway has a width of 3m and the other, 4 m. Calculate the total usable area of the garden.
*/

import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of garden");
        double glen = sc.nextDouble();

        System.out.println("Enter breadth of garden");
        double gbre = sc.nextDouble();

        System.out.println("Enter one pathway width");
        double pw1 = sc.nextDouble();

        System.out.println("Enter two pathway width");
        double pw2 = sc.nextDouble();

        double parea1 = glen * pw1;
        double parea2 = gbre * pw2;
        double crosspath = pw1 * pw2;
        double garea = glen*gbre;

        double totalcrosspath = ( parea1 + parea2 ) - crosspath;
        double usablearea = garea - totalcrosspath; 
        System.out.println("usable area of the garden after removing crosspath area "+usablearea);
    }
}