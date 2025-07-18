/*
What will be the area of a square with perimeter 200 m?
 */
import java.util.Scanner;
class test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter perimeter to get area of square");
        int peri = sc.nextInt();

        int side = peri/4;
        int area = side * side;

        System.out.println("One side of the square is : "+side);
        System.out.println("area of the square is : "+area);
    }
}