import java.util.Arrays;
import java.util.Scanner;

class reverseString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char[] out = s.toCharArray();

        reverse(out);
        System.out.println(Arrays.toString(out));
        sc.close();

    }
    public static void reverse(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
          char tmp = s[left];
          s[left++] = s[right];
          s[right--] = tmp;
        }
      }
}
