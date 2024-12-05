import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays_ride {
    public static void main(String[] args) {
        /*
        july: 15.0, 18.9, 20.1, 23.4
        august: 25.1, 25.4, 24.5, 25.8, 28.6
         */

        double[] julyRide = {15.0, 18.9, 10.1, 23.4};
        System.out.println(julyRide);
        System.out.println(Arrays.toString(julyRide));

        double[] augustRide = {25.1, 25.4, 24.5, 25.8, 28.6};

/*        double amountOfKilometers = 0;
        for (int index = 0; index < julyRide.length; index++) {
            System.out.println(julyRide[index]);
            amountOfKilometers = amountOfKilometers + julyRide[index];
        }

        System.out.println(amountOfKilometers);*/

        double minKilometers = julyRide[0]; // в этой части определяем самый короткий заезд
        for(int index = 0; index < julyRide.length; index++) {
            if (julyRide[index] < minKilometers) {
                minKilometers = julyRide[index];
            }
        }
        System.out.println(minKilometers);

        double maxKilometers = 0; // в этой части определяем самый длинный заезд
        for (int index = 0; index < julyRide.length; index++) {
            if (julyRide[index] > maxKilometers) {
                maxKilometers = julyRide[index];
            }
        }
        System.out.println(maxKilometers);

        // Если массив пустой, то для определения минимума можем присвоить переменной минимума
        // максимальное значение, тогла любое значение будет меньше и перезапишется

        double minEmptyKilometers = Double.MAX_VALUE; // в этой части определяем самый короткий заезд
        for(int index = 0; index < julyRide.length; index++) {
            if (julyRide[index] < minEmptyKilometers) {
                minEmptyKilometers = julyRide[index];
            }
        }
        System.out.println(minEmptyKilometers);

        //если надо найти максимум/минимум из двух массивов
        double[][] allRides = {
                {15.0, 18.9, 20.1, 23.4},
                {25.1, 25.4, 14.5, 25.8, 28.6}
        };


        double minAllKilometers = Double.MAX_VALUE; // в этой части определяем самый короткий заезд
        for(int index = 0; index < allRides.length; index++) {
            for (int j = 0; j < allRides[index].length; j++) {
                if (allRides[index][j] < minAllKilometers) {
                    minAllKilometers = allRides[index][j];
                }
            }

        }
        System.out.println(minAllKilometers);
    }
}
