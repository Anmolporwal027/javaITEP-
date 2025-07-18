/**
 7. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.



Modify the above question to allow student to sit if he/she has medical cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
 */

import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of total class held ");
        float noftotalclass = sc.nextInt();
        System.out.println("enter number of class you attended ");
        float nofclassattend = sc.nextInt();

        sc.nextLine();
        System.out.println("Do you have medical case reply in y or n ?");
        String medical = sc.nextLine();

        float totalper = (nofclassattend/noftotalclass)*100;

        if((totalper >= 75) || (medical.equalsIgnoreCase("y"))){
            System.out.println("Attendence is  "+totalper+" and you are eligible to attend exam ");
        }
        else{
            System.out.println("Attendence is  "+totalper+" and you are not eligible to attend exam ");
        }
    }
}