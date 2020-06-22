import aboutString.StringReverse;
import multiply.MultiplyNumbers;

import java.util.Scanner;

public class testOneCyberce {
    public static void main(String [] args){




        Scanner input = new Scanner(System.in);
        System.out.println("welcome to Cyberce!!!");
        System.out.println("please choose R for reverse string, O for isOdd method, M for multiply");
        System.out.println("enter your choice:");
        String choice = input.next();

        switch(choice){
            case "R":
                System.out.println("give your string to reverse it");
                String stringByUser=input.next();
                StringReverse reversestring = new StringReverse();
                String k = reversestring.reverseString(stringByUser);
                System.out.println(k);
                break;

            case "O":
                System.out.println("give an integer number to  see if it's odd");
                MultiplyNumbers multi = new MultiplyNumbers();
                int number = input.nextInt();
                boolean isoddnumber = multi.isOdd(number);
                if(isoddnumber){
                    System.out.println("yes it's odd");
                }else{
                    System.out.println("No.it is not odd");
                }
                break;
            case "M":
                System.out.println("give two integer numbers for multiplication");
                System.out.println("first:");
                int x=input.nextInt();
                System.out.println("second:");
                int y=input.nextInt();
                MultiplyNumbers multidyo = new MultiplyNumbers();
                int ginomeno=multidyo.multiply(x,y);
                System.out.println("the result is :"+ginomeno);
                break;



        }
        System.out.println("thank you for choosing us");
    }



}
