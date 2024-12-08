import java.util.Arrays;

public class TypeLocalVar {
    public static void main(String[] args) {

        var number = 15;
        var number2 = 15.5;

        var sum = number2 + number;

        System.out.println(sum);

        var myArray = new int[10];
        System.out.println(Arrays.toString(myArray));
        myArray[0] = 3;
        System.out.println(Arrays.toString(myArray));
    }
}
