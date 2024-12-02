package ua.edu.ucu.apps.task1;

public class ATM {
    Section first;

    public ATM() {
        this.first = new Section_500();

        Section_200 section200 = new Section_200();
        first.setNext(section200);
    }

    public void getMeMoney(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
        first.process(amount);
    }
}
