/*
    30. How many tiles of length 5 cm and breadth 8 cm are needed to tile the floor of a bed room 200 cm long and 400 cm wide?
 */
import java.util.Scanner;
class test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter length of tile");
        float tl = sc.nextFloat();

        System.out.println("Enter breadth of tile");
        float tb = sc.nextFloat();

        System.out.println("Enter floor length");
        float floorl = sc.nextFloat();

        System.out.println("Enter floor breadth");
        float floorb = sc.nextFloat();

        float farea = floorl * floorb;
        float tarea = tl * tb;
        float nooftile = farea/tarea;
        System.out.println("no of tiles required are  "+nooftile);
    }
}