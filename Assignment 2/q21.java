/*
    A brick measures 15 cm in length, 8 cm in breadth and 5 cm in height. How many bricks will be used to make a wall of length 15 m, breadth 10 m and height 8 metres?
 */
import java.util.Scanner;

class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter brick length ");
        int bl= sc.nextInt();
        
        System.out.println("Enter birck breadth ");
        int bb= sc.nextInt();

        System.out.println("Enter brick height ");
        int bh= sc.nextInt();

        System.out.println("Enter wall length ");
        int wl= sc.nextInt();
        
        System.out.println("Enter wall breadth ");
        int wb= sc.nextInt();

        System.out.println("Enter wall height ");
        int wh= sc.nextInt();

        int brickvol = bl * bb * bh; 
        long wallvol = (long)wl * wb * wh;

        long numbrick = wallvol/brickvol;

        System.out.println("number of brick = "+numbrick);
        
        
    }
}