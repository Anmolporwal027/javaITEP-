/*
    A cube with an edge of 7 cm and a cuboid measuring 7 cm × 4 cm × 8 am are kept on a table. Which shape has more volume?
 */
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter cube edge  ");
        float cedge = sc.nextFloat();

        System.out.println("Enter enter cuboid length ");
        float clen= sc.nextFloat();
        
        System.out.println("Enter enter cuboid breadth ");
        float cbre= sc.nextFloat();

        System.out.println("Enter enter cuboid height ");
        float chei= sc.nextFloat();
        
        float cvol = clen*cbre*chei;
        float cubevol = cedge*cedge*cedge;


        System.out.println("cube volume = "+cubevol);
        System.out.println("cuboid volume = "+cvol);
        
    }
}