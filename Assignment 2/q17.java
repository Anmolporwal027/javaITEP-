/*
    Luci is making a display board for the school exhibition. The display board is a 3 m by 2 m rectangle. He needs to add a ribbon border around the entire display board. What is the length of ribbon that he needs?
 */
import java.util.Scanner;
class test{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter length ");
        float len = sc.nextFloat();
        
        System.out.println("Enter breadth ");
        float bre= sc.nextFloat();

       
        double ribbon = 2*(len + bre);
        System.out.println("ribbon needs = "+ribbon);
    }
}