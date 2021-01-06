package util;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;

/**
 * Набор функций для работы с массивами
 *
 * @author Соломатин Дмитрий Иванович(кафедра ПиИТ ФКН ВГУ)
 *
 */
public class ArrayUtils {

    public static int[] toPrimitive(Integer[] arr) {
        if (arr == null) {
            return null;
        }
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        return result;
    }


    public static int[] toIntArray(String str) {
        Scanner scanner = new Scanner(str);
        scanner.useLocale(Locale.ROOT);
        scanner.useDelimiter("(\\s|[,;])+");
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }

        Integer[] arr = list.toArray(new Integer[0]);
        return ArrayUtils.toPrimitive(arr);
    }
}
