import java.util.Scanner;

public class BankingTransaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        long balance = 0; 

        
        for (int i = 0; i < n; i++) {
            
            String operation = sc.next();
            
            long amount = sc.nextLong();

            
            if (operation.equalsIgnoreCase("Deposit")) {
                balance += amount;
            } else if (operation.equalsIgnoreCase("Withdraw")) {
                balance -= amount;
            }
        }

        
        System.out.println(balance);
        
        sc.close();
    }
}
