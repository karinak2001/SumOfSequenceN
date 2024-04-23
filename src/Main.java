import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //כתוב תרשים זרימה שידפיס את כל המספרים הזוגיים עד 20 ואת סכומם

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number = 20;
        int i = 0;


        while (i < number) {
            sum = sum + i;
            System.out.print(i + " + ");
            i += 2;
        }
        sum = sum + 20;
        System.out.println("20 = " + sum);

    }
}