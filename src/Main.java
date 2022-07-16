import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[10];
        String[] str = new String[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < str.length; i++) {
            str[i] = scanner.nextLine();
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = str[i].length();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}