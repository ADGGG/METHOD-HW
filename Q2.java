public class Q2 {
    static int total(int adults, int children){
        int total = (12 * adults) + (7 * children);
        return total;
    }
    static int total(int adults){
        return total (adults, 0);
    }
    public static void main(String[] args){
        System.out.println(total(2, 3));
        System.out.println(total(2));
        System.out.println(total(0, 0));
        System.out.println(total(0, 2));

    }
    
}
