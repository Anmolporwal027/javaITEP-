/**
 WAP to calculate the percentage of students
 */
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mark1 ");
        float m1 = sc.nextFloat();
        System.out.println("Enter mark2 ");
        float m2 = sc.nextFloat();
        float gain = m1 + m2;
        float total = 100;
        float per = (gain/total)*100;

        System.out.print("percentage =  "+per);
    }
}