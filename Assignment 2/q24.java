/*
    24. How many bricks each 25 cm long, 10 cm wide and 7.5 cm thick will be required for a wall 20 m long, 2 m high and 0.75 m thick? If bricks sell at $900 per thousand what will it cost to build the wall?
 */
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter brick length ");
        double bl= sc.nextDouble();
        
        System.out.println("Enter brick breadth ");
        double bb= sc.nextDouble();

        System.out.println("Enter brick height ");
        double bh= sc.nextDouble();

        System.out.println("Enter wall length ");
        double wl= sc.nextDouble();
        
        System.out.println("Enter wall breadth ");
        double wb= sc.nextDouble();

        System.out.println("Enter wall height ");
        double wh= sc.nextDouble();
        
        wl = wl*100;
        wh = wh*100;
        wb = wb*100;

        double brickvol = bl * bb * bh;
        double wallvol = wl * wb * wh;

        double numofbrick = wallvol/brickvol;
        System.out.println("Number of bricks are : "+numofbrick);
        double totalcostperthousand = (numofbrick)*900;
        System.out.println(" cost "+totalcostperthousand);
    }
}