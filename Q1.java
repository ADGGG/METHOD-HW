public class Q1 {
    static int fee(int kg) {
    if (kg <= 0 || kg > 1000) {
        return -1;
    } 
    return 5 + (kg - 1) * 2; 
    }
    
    static void printFee(int kg){
       if (fee(kg) == -1) {
        System.out.println("Invalid weight");
    } else {
        System.out.println("RM" + fee(kg)); 
    }
    }
    public static void main(String[] args){
    printFee(1);
    printFee(4);
    printFee(0);
    printFee(-2);
    }


}

