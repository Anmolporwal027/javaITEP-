import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num  ");
        int num = sc.nextInt();
     
        if((num % 5==0) && (num % 11 == 0)){
            System.out.println(num+" is divisible by 11 and 5");
        }
        else{
            System.out.println(num+" is not divisible by 11 and 5");
        }
       
    }
}