import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height ");
        double hei = sc.nextDouble();
        System.out.println("Enter slant height ");
        double shei = sc.nextDouble();
        System.out.println("Enter rate ");
        double rate = sc.nextDouble();

        double r = Math.sqrt((shei*shei) - (hei*hei));
        double base = Math.PI * r * r;
        double cost = base * rate;
        System.out.println("Total rate of polishing "+cost);

    }
}