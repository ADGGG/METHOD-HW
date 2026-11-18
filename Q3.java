import java.util.Arrays;
public class Q3{
    static int[] doubledCopy(int[] scores){
        int[] copy = new int[scores.length];
        for (int i = 0; i < scores.length; i++){
            copy[i] = scores[i] * 2;
        }
        return copy;
    }
    public static void main(String[] args){
        int[] original = {3, 0, 7};
        int[] doubled = doubledCopy(original);
        System.out.println("Original array is: " + Arrays.toString(original));
        System.out.println("New array is: " + Arrays.toString(doubled));
        }
    }
    
    

