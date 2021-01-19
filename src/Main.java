public class Main {
    public static void main(String[] args) {
        double topup = 1132.76;
        double balance = 100.26;
        double bonus = (int) topup / 100;
        int limit = 1000;
        double total;
        if (topup > limit) {
            total = balance + topup + bonus;
        } else {
            total = balance + topup;
        }

        System.out.println(total);
    }
}