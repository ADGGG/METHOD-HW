public class Q5 {

    static int digitSum(int n) {
        if (n < 10) {
            return n;
        }
        return (n % 10) + digitSum(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(digitSum(0));
        System.out.println(digitSum(7));   
        System.out.println(digitSum(507)); 
        System.out.println(digitSum(1000));
    }
}