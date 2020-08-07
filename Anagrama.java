
import java.util.Scanner;



public class Anagrama {
    private static java.util.HashMap<Character, Integer> repetitions;
    private static String a,b;
    public static void main(String args[]){
        Scanner scanner =  new Scanner(System.in);
        a = scanner.next();
        b = scanner.next();
        scanner.close();
        boolean ans = a.length() == b.length();
        ans = !ans ? ans : solucion(a,b);
        System.out.println(ans? "Anagrams": "Not Anagrams");
    }

    public static boolean solucion(String a, String b){
        if(a.length() != b.length()) return false;
        boolean ans = true;
        repetitions = new java.util.HashMap<Character, Integer>();
        for(int i=0; i<a.length() && i<b.length(); i++){
            insertar(Character.toLowerCase(a.charAt(i)), 1);
            insertar(Character.toLowerCase(b.charAt(i)), -1);
        }
        java.util.ArrayList<Character> keys = new java.util.ArrayList<Character>(repetitions.keySet());
        for(Character ch: keys){
            ans = ans && repetitions.get(ch) == 0;
        }
        return ans;
    }

    public static void insertar(char key,  int aumento){
        if(repetitions.containsKey(key)){
            repetitions.put(key, repetitions.get(key) + aumento);
        } else {
            repetitions.put(key, aumento);
        }
    }
}