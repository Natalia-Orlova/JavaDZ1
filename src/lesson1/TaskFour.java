package lesson1;

public class TaskFour {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int end = s.length() - 1;
        while (end >= 0) {
            while (end > 0 && s.charAt(end) == ' '){
                end--;
            }
            int start = end - 1;
            while (start >= 0 && s.charAt(start) != ' ') {
                start--;
            }
            sb.append(s,start + 1, end + 1);
            sb.append(' ');
            end = start;
        }
        return sb.toString().trim();
    }
}
