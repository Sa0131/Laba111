package ru.mirea.lab14;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TimeForm {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Calendar calendar = new GregorianCalendar();
        System.out.println("Введите год, месяц и день: ");
        calendar.set(Calendar.YEAR, input.nextInt());
        calendar.set(Calendar.MONTH, input.nextInt()-1);
        calendar.set(Calendar.DAY_OF_MONTH, input.nextInt());
        System.out.println("Введите время: часы, минуты: ");
        calendar.set(Calendar.HOUR_OF_DAY, input.nextInt());
        calendar.set(Calendar.MINUTE, input.nextInt());
        Date date = calendar.getTime();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        System.out.println(format.format(date));
    }
}
