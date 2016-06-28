import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by will on 6/22/16.
 */
public class Exercise06 {
    public static void main(String[] args) {
        String newNum;
        int num = 12345;
        // get this number: 54321
        HashMap m = new HashMap<>();
        ArrayList<Character> arr = new ArrayList<>();

        String numStr = String.valueOf(num);

        int length = numStr.length();

        int i = 1;
        while (i <= length) {
            char letter = numStr.charAt(i-1);
            arr.add(letter);
            i++;
        }

        System.out.println(length);
        System.out.println(arr);


        System.out.println("New solutions:");
        solveViaLoop(num);
        solveViaStringBuilder(num);
        solveViaMath(num);
    }

    public static void solveViaLoop(int num) {
        char[] chars = String.valueOf(num).toCharArray();
        char[] reverseChars = new char[chars.length];
        int i = 0;
        int n = chars.length - 1;
        for (char c : chars) {
            reverseChars[n] = c;
            i++;
            n--;
        }
        int reverseNum = Integer.valueOf(String.valueOf(reverseChars));
        System.out.println(reverseNum);

    }

    public static void solveViaStringBuilder(int num) {
        StringBuilder s = new StringBuilder(String.valueOf(num));
        int reverseNum = Integer.valueOf(s.reverse().toString());
        System.out.println(reverseNum);
    }

    public static void solveViaMath(int num) {
        int reverseNum = 0;
        while (num != 0) {
            reverseNum = reverseNum * 10;
            reverseNum = reverseNum + num % 10;
            num = num / 10;
        }
        System.out.println(reverseNum);

    }
}
