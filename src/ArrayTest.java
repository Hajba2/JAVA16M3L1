import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {

        int[] ints2 = {23, 12, 99, 88};
        int[] ints = new int[3];
        System.out.println(ints.length);

        ints[0] = 33;
        ints[1] = 45;
        ints[2] = 65;

        System.out.println("ints[2] = " + ints[2]);

        System.out.println("ints = " + ints);
        System.out.println("Arrays.toString(ints) = " + Arrays.toString(ints));
        System.out.println("Arrays.toString(ints2) = " + Arrays.toString(ints2));

        String[] strings = new String[2];
        strings[0] = "abra";
        strings[1] = "cadabra";
        //strings[2] = "Asdf";

        Human[] humans = new Human[3];
        humans[0] = new Human();
        humans[0].name = "Java";
        humans[0].age = 1;

        System.out.println("strings = " + Arrays.toString(strings));

        System.out.println("humans = " + Arrays.toString(humans));

        int[][] twoDimArr = new int[3][2];
        twoDimArr[0][0] = 1;
        twoDimArr[1][0] = 2;
        twoDimArr[2][0] = 3;
        twoDimArr[0][1] = 4;

        System.out.println("twoDimArr[0] = " + Arrays.toString(twoDimArr[0]));
        System.out.println("twoDimArr[1] = " + Arrays.toString(twoDimArr[1]));
        System.out.println("twoDimArr[2] = " + Arrays.toString(twoDimArr[2]));

        //int[][] tooBigArr = new int[999999999][999999999];

    }
}
