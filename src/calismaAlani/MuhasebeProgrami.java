package calismaAlani;


public class MuhasebeProgrami {

     java.util.ArrayList;
 java.util.Scanner;

    class Transaction {
        String type;
        double amount;

        Transaction(String type, double amount) {
            this.type = type;
            this.amount = amount;
        }
    }

    public class AccountingProgram {
        private static ArrayList<Transaction> transactions = new ArrayList<>();

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean running = true;

            while (running) {
                System.out.println("1. Gelir Ekle");
                System.out.println("2. Gider Ekle");
                System.out.println("3. Masraf Ekle");
                System.out.println("4. Kayıtları Listele");
                System.out.println("5. Çıkış");

                System.out.print("Seçiminiz: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Buffer temizleme

                switch (choice) {
                    case 1:
                        addTransaction("Gelir", scanner);
                        break;
                    case 2:
                        addTransaction("Gider", scanner);
                        break;
                    case 3:
                        addTransaction("Masraf", scanner);
                        break;
                    case 4:
                        listTransactions();
                        break;
                    case 5:
                        running = false;
                        break;
                    default:
                        System.out.println("Geçersiz seçim!");
                }
            }

            scanner.close();
        }

        private static void addTransaction(String type, Scanner scanner) {
            System.out.print(type + " miktarı: ");
            double amount = scanner.nextDouble();
            transactions.add(new Transaction(type, amount));
            System.out.println(type + " başarıyla eklendi.");
        }

        private static void listTransactions() {
            double totalIncome = 0;
            double totalExpense = 0;
            double totalCost = 0;

            System.out.println("---- Tüm Kayıtlar ----");
            for (Transaction transaction : transactions) {
                System.out.println(transaction.type + ": " + transaction.amount);
                switch (transaction.type) {
                    case "Gelir":
                        totalIncome += transaction.amount;
                        break;
                    case "Gider":
                        totalExpense += transaction.amount;
                        break;
                    case "Masraf":
                        totalCost += transaction.amount;
                        break;
                }
            }
            System.out.println("-----------------------");
            System.out.println("Toplam Gelir: " + totalIncome);
            System.out.println("Toplam Gider: " + totalExpense);
            System.out.println("Toplam Masraf: " + totalCost);
            System.out.println("Net Kar/Zarar: " + (totalIncome - totalExpense - totalCost));
        }
    }
    }

