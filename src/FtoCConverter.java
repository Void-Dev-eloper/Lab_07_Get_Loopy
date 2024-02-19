import java.util.Scanner;
public class FtoCConverter {
    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
        boolean finished = false;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Enter the Fahrenheit: ");
            if (in.hasNextDouble()){
                fahrenheit = in.nextDouble();
                in.nextLine();
                celsius = ((fahrenheit - 32) * ((double) 5/9));
                System.out.print(fahrenheit + " Fahrenheit to Celsius is ");
                System.out.printf("%.2f", celsius);
                finished = true;
            }else{
                String trash = in.nextLine();
                System.out.println("Enter a Valid Number: (not) " + "'" + trash + "'");
            }
        }while (!finished);
    }
}
