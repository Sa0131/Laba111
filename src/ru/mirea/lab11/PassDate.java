package ru.mirea.lab11;

import java.util.Date;
import java.util.Scanner;

public class PassDate {
    public static void main(String[] args)
    {
        System.out.println("Фамилия разработчика: ");
        Scanner in = new Scanner(System.in);
        String sname = in.next();
        Date date = new Date();
        System.out.println("Дата получения задания: Wed Nov 02 01:42:16 MSK 2022"
                +"\n"
                + "Фамилия разработчика: " + sname
                + "\n"
                + "Дата и время сдачи задания: " + date);
    }
}

