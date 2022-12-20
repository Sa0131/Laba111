package ru.mirea.lab12;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CompTime {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Calendar calendar = new GregorianCalendar();
        System.out.println("Введите год, месяц и день: ");
        calendar.set(Calendar.YEAR, input.nextInt());
        calendar.set(Calendar.MONTH, input.nextInt()-1);
        calendar.set(Calendar.DAY_OF_MONTH, input.nextInt());
        Date dateP = calendar.getTime();
        Date date = new Date();

        if(date.after(dateP))
        {
            System.out.println("Введённая дата раньше нынешней!");
        }
        else if(date.before(dateP))
        {
            System.out.println("Введённая дата позже нынешней!");
        }
        else System.out.println("Даты равны!");

        //SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        //System.out.println(date.toString());
    }
}

