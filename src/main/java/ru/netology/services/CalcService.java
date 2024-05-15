package ru.netology.services;

public class CalcService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (threshold >= money) { // можем ли отдыхать?
                money = money + income - expenses;
                //money = money - expenses;
            } else {
                money = (money - expenses) / 3;
                //money = money / 3;
                count++;
            }
        }
        return count;
    }
}
