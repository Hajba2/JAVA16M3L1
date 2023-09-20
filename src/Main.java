import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        m5();
    }

    private static void m5() {
        Human h1 = new Human();
        h1.name = "Goga";
        h1.age = 29;

        Human h2 = new Human();
        h2.name = "Inna";
        h2.age = 25;

        h1.toString();

        System.out.println(h1);

        //System.out.println("Human name = " + h1.name + " human age = " + h1.age);
    }

    public static void m4() {
        System.out.println(12.7f);
        Scanner s = new Scanner(System.in);

        float v = s.nextFloat();

        System.out.println("v = " + v);
    }

    public static void m3() {
        Scanner s = new Scanner(System.in);

        //int i = s.nextInt();
        //System.out.println(i);

        String next = s.next();
        String nextLine = s.nextLine();
        System.out.println(next);
        System.out.println(nextLine);
    }

    public static void m2() throws IOException {
        int byteVariable = System.in.read();

        System.out.println("You had enter " + byteVariable);
    }

    public static void m1() {
        Scanner in = new Scanner(System.in); //Створили об'єкт Scanner
        System.out.print("Input a number: "); //Попросили користувача ввести число

        int num = in.nextInt(); //Прочитали число
        System.out.println("Your number is " + num); //Вивели число

        System.out.println("Sum of your numbers is " + (in.nextInt() + in.nextInt())); //Вивели число

        in.close(); //Закрили об'єкт scanner - остання операція
    }
}