/*     If it costs 1600 rs. to fence a rectangular park of length 20 m at the rate of 25 rs. per m², find the breadth of the park and its perimeter. Also, find the area of the field.

 */

import java.util.Scanner;


class test{
    public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost");
        float cost = sc.nextFloat();
        System.out.println("Enter rate");
        float rate = sc.nextFloat();
        
        System.out.println("Enter length of tile");
        float len = sc.nextFloat();
        float  bre ;
        float peri =  cost/rate;
        System.out.println("Perimeter of the area is : "+peri);
        bre = (peri/2)-len;
        System.out.println("beradth of the rectangle is : "+bre);
        float area = len * bre ;
        System.out.println("Area of the rectangle is : "+area);
    }
}