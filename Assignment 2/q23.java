/*
    23. Find the number of cubical boxes of cubical side 3 cm which can be accommodated in carton of dimensions 15 cm × 9 cm × 12 cm.
*/
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cubical box size ");
        float cubside= sc.nextFloat();

        System.out.println("Enter catron length ");
        float cl= sc.nextFloat();
        
        System.out.println("Enter carton breadth ");
        float cb= sc.nextFloat();

        System.out.println("Enter carton height ");
        float ch= sc.nextFloat();
       
        float cartonvol = cl * cb * ch; 
        float boxvol = cubside * cubside * cubside;
        float numcubicalbox = cartonvol/boxvol;
        System.out.println(" number of cubical boxes "+numcubicalbox);
    }
}