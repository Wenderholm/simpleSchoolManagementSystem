package com.company.banking_application;

import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Jan Kowalski","JK2021");
        bankAccount.showMenu();
    }

    static class BankAccount {
        int balance;
        int previousTransaction;
        String customerName;
        String customerId;

        public BankAccount(String customerName, String customerId) {
            this.customerName = customerName;
            this.customerId = customerId;
        }

        void deposit(int amount) {
            if (amount != 0) {
                balance += amount;
                previousTransaction = amount;
            }
        }

        void withdraw(int amount) {
            if (amount != 0) {
                balance -= amount;
                previousTransaction = -amount;
            }
        }

        void getPreviousTransaction() {
            if (previousTransaction > 0) {
                System.out.println("Depozyt: " + previousTransaction);
            } else if (previousTransaction < 0) {
                System.out.println("Wypłata: " + Math.abs(previousTransaction));
            } else {
                System.out.println("nie wystąpiła żadana tranzakcja");
            }
        }

        void showOptions(){
            System.out.println("");
            System.out.println("A. Sprawdz Bilans");
            System.out.println("B. Depozyt");
            System.out.println("C. Wypłata");
            System.out.println("D. Poprzednia tranzakcja");
            System.out.println("E. Wyjście");
        }
        void showMenu() {
            char opc = '\0';
            Scanner scanner = new Scanner(System.in);
            System.out.println("Witaj: " + customerName);
            System.out.println("Twoj numer ID to: " + customerId);
            showOptions();

            do {
                System.out.println("======================================");
                System.out.println("Wybierz jedną z opcji");
                System.out.println("======================================");
                opc = scanner.next().charAt(0);

                switch (opc) {
                    case 'A':
                        System.out.println("======================================");
                        System.out.println("Bilans = " + balance);
                        System.out.println("======================================");
                        showOptions();
                        break;
                    case 'B':
                        System.out.println("======================================");
                        System.out.println("Wprowdz sumę jaką chcesz wpłącić: " );
                        System.out.println("======================================");
                        int amount = scanner.nextInt();
                        deposit(amount);
                        showOptions();
                        break;
                    case 'C':
                        System.out.println("======================================");
                        System.out.println("Wprowdz sumę jaką chcesz wypłacić: " );
                        System.out.println("======================================");
                        int amount2 = scanner.nextInt();
                        withdraw(amount2);
                        showOptions();
                        break;
                    case 'D':
                        System.out.println("======================================");
                        System.out.println("Poprzednia tranzakcja to: " );
                        System.out.println("======================================");
                        getPreviousTransaction();
                        showOptions();
                        break;
                    case 'E':
                        System.out.println("**************************************");
                        break;
                    default:
                        System.out.println("Nie ma takiej opcji do wyboru. Wybierz jeszcze raz");
                }
            }while(opc!='E');
            System.out.println("Dziękujemy za skorzystanie z naszych usług");
        }
    }
}
