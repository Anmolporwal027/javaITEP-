/* Write a Java program to input basic salary of an employee and calculate its Gross salary according to following: Basic Salary <= 10000 : HRA = 20%, DA = 80% 
Basic Salary <= 20000 : HRA = 25%, DA = 90% 
Basic Salary > 20000 : HRA = 30%, DA = 95% 
 */
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int Salary;
        float HRA;
        float DA;
        float Gross;
        System.out.println("Enter the Salary");
        Salary = sc.nextInt();
        if(Salary<=10000)
        {
            HRA = (Salary*20)/100;
            DA = (Salary*80)/100;
            System.out.println("HRA : "+HRA);
            System.out.println("DA : "+DA);
            Gross = Salary+DA+HRA;
            System.out.println("Yout Gross Salary is : "+Gross+" and Basic Salary is : "+Salary);
        }
        else if(Salary<=20000)
        {
            HRA = (Salary*25)/100;
            DA = (Salary*90)/100;
            System.out.println("HRA : "+HRA);
            System.out.println("DA : "+DA);
            Gross = Salary+DA+HRA;
            System.out.println("Yout Gross Salary is : "+Gross+" ans Basic Salary is "+Salary);
        }
        else if(Salary>20000){
    
            HRA = (Salary*30)/100;
            DA = (Salary*95)/100;
            System.out.println("HRA : "+HRA);
            System.out.println("DA : "+DA);
            Gross = Salary+DA+HRA;
            System.out.println("Yout Gross Salary is : "+Gross+" ans Basic Salary is: "+Salary);
        }
        }

    }

