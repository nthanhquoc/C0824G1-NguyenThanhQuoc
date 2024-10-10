package bai_tap;

public class DisplayPrimeLess100 {
    public static void main(String[] args) {
        int count=0;
        int prime=2;
        while(count<100){
            if (isPrime(prime)) {
                if(prime<100){
                    System.out.print(prime+" ");
                    count++;
                }
            }
            prime++;
        }
    }
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
