package com.company;

public class Main {

    public static void main(String[] args) {
        Vacation vacation = new Vacation("Cem", "Safak", "Omer", "Ahmet", "Mehmet", "Ali");
        vacation.expenseEachCalculator(284, 230, 274, 30, 0, 0);
        vacation.differenceCalculcator();
        vacation.paying();

    }
}
