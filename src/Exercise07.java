/**
 * Created by will on 6/28/16.
 */
public class Exercise07 {
    //Similar to Sparc test
    public static void main(String[] args) {
        System.out.println(isPalindromeViaStringBuilder("racecar"));
        System.out.println(isPalindromeViaStringBuilder("hello"));
        System.out.println();
//        System.out.println(isPalindromeViaLoop("racecar"));
//        System.out.println(isPalindromeViaLoop("hello"));
    }

    public static boolean isPalindromeViaStringBuilder(String input) {
        StringBuilder s = new StringBuilder(input);
        String reverseStr = s.reverse().toString();

        return (reverseStr.equals(input));
    }

//    public static boolean isPalindromeViaLoop(String input) {
//        char[] chars = input.toCharArray();
//
//    }
}
