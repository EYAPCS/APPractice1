/**
 * Created by emma on 7/28/17.
 */
public class QuestionOne {

    public static void reverseArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = temp;

        }

    }

}
