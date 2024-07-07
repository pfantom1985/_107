package by.it_academy.jd2.JD2_107_24;

public class Main {
    public static void main(String[] args) {
        System.out.println(countDigit("asddsgljpk4p1ojrotfgib08yu"));
    }

    public static int countDigit(String text){
        int count = 0;
        char[] array = text.toCharArray();
        for (char c : array) {
            if (isDigit(c)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isDigit(char ch){
        return ch >= '0' && ch <= '9';
    }
}