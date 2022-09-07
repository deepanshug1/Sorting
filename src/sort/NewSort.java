package sort;
import java.util.Arrays;
import java.util.Collections;
 
public class NewSort {
    public static void main(String[] args)
    {

        Integer[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };

        Arrays.sort(arr);
 
        System.out.printf("Sorted arr[] : %s",
                          Arrays.toString(arr));
    }
}