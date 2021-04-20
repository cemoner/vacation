package com.company;


import java.util.ArrayList;
import java.util.Collections;

import static java.lang.StrictMath.abs;

public class Vacation {
    ArrayList<String> people = new ArrayList<>();
    ArrayList<Double> differences = new ArrayList<>();
    double forEach;

    public Vacation(String... people) {
        Collections.addAll(this.people, people);
    }

    public void expenseEachCalculator(double... expenses) {
        double sum = 0;
        for (double expense : expenses) {
            differences.add(expense);
            sum += expense;
        }
        forEach = sum / expenses.length;
    }

    public void differenceCalculcator() {
        for (double expenses : differences) {
            differences.set(differences.indexOf(expenses), forEach - expenses);
        }
    }

    public void paying() {
        for (double debt : differences) {
            if (debt > 0) {
                for (double payee : differences) {
                    if (payee < 0 && debt > 0) {
                        int indexdebtor = differences.indexOf(debt);
                        int indexpayee = differences.indexOf(payee);
                        double payes;
                        if (debt >= abs(payee)) {
                            debt += payee;
                            payes = -payee;
                            System.out.println(people.get(indexdebtor) + " Payes " + payes + " to ---> " + people.get(indexpayee));
                            payee = 0;
                        } else {
                            payee += debt;
                            payes = debt;
                            System.out.println(people.get(indexdebtor) + " Payes " + payes + " to ---> " + people.get(indexpayee));
                            debt = 0;
                        }
                        differences.set(indexdebtor, debt);
                        differences.set(indexpayee, payee);
                    }
                }
            }
        }
    }
}
