package oop.exe2;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(5);

        // These should print-out "true"
        System.out.println(bank.addPerson("Samuel", 10.0));
        System.out.println(bank.addPerson("Andrew", 5.0));
        System.out.println(bank.addPerson("Dan", 7.5));
        System.out.println(bank.addPerson("Eric", 10.0));
        System.out.println(bank.addPerson("John", 10.0));

        // This one should print-out "false"
        System.out.println(bank.addPerson("Shaqed", 10.0));


        bank.deposit("andrew1", 5.0); // This should be false
        bank.deposit("Andrew", 5.0); // This should be true

        bank.deposit("Dan", 2.5); // This should be true

        bank.withdraw("Shaqed", 11); // This should return -1
        bank.withdraw("Eric", 10); // This should return 10

        bank.transfer("Dan", "Eric", 5.0); // This should be true
        bank.transfer("Samuel", "Andrew", 15); // This should be false

        bank.print();
    }

}
