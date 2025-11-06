import java.util.*;

public class Permutations {
    public static List<String> generatePermutations(String str) {
        List<String> result = new ArrayList<>();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        
        do {
            result.add(new String(chars));
        } while (nextPermutation(chars));
        
        return result;
    }
    
    private static boolean nextPermutation(char[] array) {
        int i = array.length - 2;
        while (i >= 0 && array[i] >= array[i + 1]) i--;
        
        if (i < 0) return false;
        
        int j = array.length - 1;
        while (array[j] <= array[i]) j--;
        
        swap(array, i, j);
        reverse(array, i + 1, array.length - 1);
        return true;
    }
    
    private static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    private static void reverse(char[] array, int start, int end) {
        while (start < end) swap(array, start++, end--);
    }
}
