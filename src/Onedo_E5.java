import java.util.Arrays;
import java.util.Scanner;

public class Onedo_E5
{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] price = { 1522, 1971, 1431, 905, 261, 1885, 406, 133, 540, 1652, 506, 1555, 859, 266, 467 };
        Integer[] code = {  113,  208,  222, 264, 268,  281, 362, 368, 375,  430, 656,  803, 818, 983, 993 };

        System.out.print("Enter Item Code: ");
        int item = input.nextInt();

        // https://www.delftstack.com/howto/java/java-array-indexof
        int codeIndex = Arrays.asList(code).indexOf(item);
        if(codeIndex < 0)
            System.out.println("Item not found.");
        else {
            System.out.println("Item is available.");
            System.out.println("The price of Item Code " + item + " is Php " + price[codeIndex]);
        }
    }

}