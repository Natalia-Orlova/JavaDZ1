package lesson1;

public class TaskFive {
    public static void main(String[] args) {
//        String s = "A man, a plan, a canal: Panama";
        String s = "7 6543?, 3456! 7";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            char leftSym = Character.toLowerCase(s.charAt(left));
            char rightSym = Character.toLowerCase(s.charAt(right));

            if (leftSym != rightSym){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
