package main;

public class ShiftingLetters {
    public String shiftingLetters(String S, int[] shifts) {

        char[] chars = S.toCharArray();
        int sum = 0;
        for (int i = shifts.length - 1; i >= 0; i--) {
            sum += shifts[i];
            sum %= 26;
            chars[i] = (char) (97 + (chars[i] - 97 + sum) % 26);
        }
        return new String(chars);
    }
}
