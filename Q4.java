public class Q4 {

    static int firstFree(int[] seats) {
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 0) {
                return i;
            } 
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] row1 = {1, 1, 0, 0};
        int[] row2 = {0, 1};
        int[] row3 = {1, 1};
        int[] row4 = {};



        System.out.println(firstFree(row1)); 
        System.out.println(firstFree(row2)); 
        System.out.println(firstFree(row3)); 
        System.out.println(firstFree(row4)); 
    }
} 