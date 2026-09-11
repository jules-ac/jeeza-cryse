import java.util.Scanner;

public class ConvertTemp
{
/**
 * convert Fahrenheit to Celsius
 * @param temp temperature in Fahrenheit
 * @return temperature in Celsius
*/
    static double fahrenheitToCelsius(double temp)
    {
        return (temp-32)*(5.0/9.0);
    }

/**
 * convert Celsius to Fahrenheit
 * @param temp temperature in Celsius
 * @return temperature in Fahrenheit
*/
    static double celsiusToFahrenheit(double temp)
    {
        return (temp*(9.0/5.0))+32;
    }

    /** main method */
    public static void main(String[] args)
    {
        int choice = -1;
        double temp;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Temperature Converter\n\nChoose a conversion:\n1: Fahrenheit to Celsius\n2: Celsius to Fahrenheit\n\n--> ");

        if (scanner.hasNextInt()) { choice = scanner.nextInt(); }
        switch(choice)
        {
            case 1:
                System.out.print("Enter a Fahrenheit value to view its Celsius equivalent: ");
                temp = scanner.nextDouble();
                System.out.printf("%.2f degrees Fahrenheit is equal to %.2f degrees Celsius", temp, fahrenheitToCelsius(temp));
                break;
            case 2:
                System.out.print("Enter a Celsius value to view its Fahrenheit equivalent: ");
                temp = scanner.nextDouble();
                System.out.printf("%.2f degrees Celsius is equal to %.2f degrees Fahrenheit", temp, celsiusToFahrenheit(temp));
                break;
            default: System.out.println("Invalid input");
                break;
        }



    }
}
