import java.util.Scanner;
class test{
    public static void main(String args[]){
        System.out.println("Welcome to D-Mart ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name ");
        String name = sc.next();
        System.out.println("Enter your Gender (M or F)");
        char gender = sc.next().charAt(0);

            System.out.println("Enter name of the product 1 ");
            String p1 = sc.next();
            System.out.println("Enter quantity of product 1");
            int q1 = sc.nextInt();
            int price1 = 10;
            float total1 = price1 * q1;
            float q1discount = 0;
    
            System.out.println("Enter name of the product 2 ");
            String p2 = sc.next();
            System.out.println("Enter quantity of product 2");
            int q2 = sc.nextInt();
            int price2 = 20;
            float total2 = price2 * q2;

            System.out.println("Enter name of the product 3 ");
            String p3 = sc.next();
            System.out.println("Enter quantity of product 3");
            int q3 = sc.nextInt();
            int price3 = 30;
            float total3 = price3 * q3;

            System.out.println("Enter name of the product 4 ");
            String p4 = sc.next();
            System.out.println("Enter quantity of product 4");
            int q4 = sc.nextInt();
            int price4 = 40;
            float total4 = price4 * q4;

            System.out.println("Enter name of the product 5 ");
            String p5 = sc.next();
            System.out.println("Enter quantity of product 5");
            int q5 = sc.nextInt();
            int price5 = 50;
            float total5 = price5 * q5;
            float q5discount = total5*0.10f;
            float totalafdis5 = total5 - q5discount;

            System.out.println("Enter name of the product 6 ");
            String p6 = sc.next();
            System.out.println("Enter quantity of product 6");
            int q6 = sc.nextInt();
            int price6 = 60;
            float total6 = price6 * q6;

            System.out.println("Enter name of the product7 ");
            String p7 = sc.next();
            System.out.println("Enter quantity of product 7");
            int q7 = sc.nextInt();
            int price7 = 70;
            float total7 = price7 * q7;

            System.out.println("Enter name of the product 8 ");
            String p8 = sc.next();
            System.out.println("Enter quantity of product 8 ");
            int q8 = sc.nextInt();
            int price8 = 80;
            float total8 = price8 * q8;

            System.out.println("Enter name of the product 9");
            String p9 = sc.next();
            System.out.println("Enter quantity of product 9 ");
            int q9 = sc.nextInt();
            int price9 = 90;
            float total9 = price9 * q9;

            System.out.println("Enter name of the product 10 ");
            String p10 = sc.next();
            System.out.println("Enter quantity of product 10");
            int q10 = sc.nextInt();
            int price10 = 100;
            float total10 = price10 * q10;
            float q10discount = total10*0.15f;
            float totalafdis10 = total10 - q10discount;

            System.out.println("Do you require carry bag (Y or N)?");
            char carrybag = sc.next().charAt(0);


            float totalafdis1 = 0;
            if(q1 > 4){
                q1discount = total1*0.05f;
                totalafdis1 = total1-q1discount;
            }
            float TotalBill = total1 + total2 + total3 + total4 + total5 + total6 + total7 + total8 + total9 + total10;
            float TotalAfterDiscount = ((q1>4)?totalafdis1:total1) + total2 + total3 + total4 + totalafdis5 + total6 + total7 + total8 + total9 + totalafdis10 ;
            
            float totaldis = 0;
            if(TotalBill > 10000){
                totaldis = TotalBill * 0.15f;
                TotalAfterDiscount = TotalBill - totaldis;
            }else if(TotalBill >= 5000 && TotalBill <= 10000){
                totaldis = TotalBill * 0.10f;
                TotalAfterDiscount = TotalBill - totaldis;
            }
            float gst = TotalBill * 0.10f;
            System.out.println("                         DMart	                               ");
            System.out.println("      Name : Cheeku Sing			Data: 12/9/2022	           ");
            System.out.println("Item name    Quantity    Price	    Total        AfterDiscount");
            System.out.println( p1+"             "+q1+"        "+price1+"             "+total1+"             "+((q1 > 4)?totalafdis1:total1));
            System.out.println( p2+"             "+q2+"        "+price2+"             "+total2+"             "+total2);
            System.out.println( p3+"             "+q3+"        "+price3+"             "+total3+"             "+total3);
            System.out.println( p4+"             "+q4+"        "+price4+"             "+total4+"             "+total4);
            System.out.println( p5+"             "+q5+"        "+price5+"             "+total5+"             "+(total5 - q5discount));
            System.out.println( p6+"             "+q6+"        "+price6+"             "+total6+"             "+total6);
            System.out.println( p7+"             "+q7+"        "+price7+"             "+total7+"             "+total7);
            System.out.println( p8+"             "+q8+"        "+price8+"             "+total8+"             "+total8);
            System.out.println( p9+"             "+q9+"        "+price9+"             "+total9+"             "+total9);
            System.out.println( p10+"             "+q10+"        "+price10+"             "+total10+"             "+(total10 - q10discount));
            System.out.println("-----------------------------------------------------------------------------------");

            System.out.println("                                   Total bill           After Discount :");
            System.out.println("                                       "+TotalBill+"          "+TotalAfterDiscount);
            if(gender == 'M'){
                System.out.println("Gift  -   Ladger Wallet                                        ");
            }
            else{
                System.out.println("Gift  -   Cadeburry                                            ");
            }
            System.out.println("GST : 10%                                 "+gst+"                   "+gst+"    ");
            if(carrybag == 'Y'){
                System.out.println("Carry Bag : yes                       10                       10 ");
                TotalBill += 10;
                TotalAfterDiscount += 10;

            }
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("                                   "+(TotalBill+gst)+"           "+(TotalAfterDiscount+gst));
        }
}