import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float result = 0;
        String anstring;
        float ans = 0;

        while (true) {
            System.out.println("Symbols: +, -, *, /");
            System.out.println("'ans' for previous answer");
            Scanner scan1 = new Scanner(System.in);
            System.out.print("Input: ");
            String input1 = scan1.nextLine();
            Scanner scan2 = new Scanner(System.in);
            System.out.print("Operation: "+input1+" ");
            String oper = scan2.nextLine();
            Scanner scan3 = new Scanner(System.in);
            System.out.print("Input: "+input1+" "+oper+" ");
            String input2 = scan3.nextLine();
            System.out.println(" ");
            
            float first;
            float second;

            if (input1.equalsIgnoreCase("ans")) {
                first = ans;
            } else {
                first=Integer.parseInt(input1);
            }
            if (input2.equalsIgnoreCase("ans")) {
                second = ans;
            } else {
                second=Integer.parseInt(input2);
            }

            if (oper.contains("+")) {
                result = first + second;
            } else if (oper.contains("*")) {
                result = first * second;
            } else if (oper.contains("/")) {
                result = first / second;
            }
            ans = result;
            anstring = Float.toString(result);
            System.out.println("Answer: " + anstring);
        }
    }
}