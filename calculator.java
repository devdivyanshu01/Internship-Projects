import java.util.Scanner;

class calculator
{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

         System.out.print (" Enter First number - ");
         int n1 = sc.nextInt ();

        System.out.print (" Enter Second number - ");
        int n2 = sc.nextInt ();

        System.out.println ("Operation to be performed according to their serial number.");
        System.out.println ("1. +, Addition");
        System.out.println ("2. -, Subtraction");
        System.out.println ("3. *, Multiplication");
        System.out.println ("4. /, Division");
        System.out.println ("5. %, Remainder");
        System.out.print ("Enter operator(1,2,3,4,5) you have to use in you calculation : ");
        int operator_num = sc.nextInt ();

        int result = 0;

        switch (operator_num)
	    {
	        case 1:
	            result = n1+n2;
	            break;
	        case 2:
	            result = n1-n2;
	            break;
	        case 3:
	            result = n1*n2;
	            break;
	        case 4:
	            if (n1 % n2 == 0)
		        {
		            result = n1/n2;
		        }
	            else
		        {
		            System.out.println("Numbers you inputed is remaining " + n1%n2 +". After operation.");
		            result = n1/n2;
		        }
	            break;
	        case 5:
	            if (n1 % n2 != 0)
		        {
		        result = n1%n2;
		        }
	            else
		        {
		        System.out.println("Numbers you inputed is not returning value. please use Division operator next with these inputs.");
		        }
	            break;
	        default:
	            System.out.println ("Enter operator properly (only from +,-,*,/,%)");
	            
        }
        System.out.println("The result of your inputs according to selected operator is " + result);
    }
}