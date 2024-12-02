package ua.edu.ucu.apps;

import ua.edu.ucu.apps.task1.ATM;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.getMeMoney(1000);
        atm.getMeMoney(700);
    }

}
