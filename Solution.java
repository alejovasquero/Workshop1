import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String word = null;
        int a=0;
        while(scanner.hasNext()){
            word = scanner.nextLine();
            a++;
            System.out.printf("%d %s\n", a, word);
        }
    }
}
