package com.company;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {

        // Новая текущая дата
        Date date = new Date();
        System.out.println(date);

        // календарь
        Calendar cl = Calendar.getInstance(); //создание календаря
        cl.setTime(date);                   // запись туда даты
        cl.add(Calendar.MINUTE, 2);     //добавить 2 минуты
        System.out.println(cl.getTime());

        //формат времени
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT); // утсановка формата времени
        System.out.println(df.format(cl.getTime()));

        // масска для времени
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        System.out.println(sdf.format(cl.getTime()));

        // забитие точной, нужной даты
        Date newDate = sdf.parse("05/12/1985 07:23");
        System.out.println(newDate);
	// write your code here
    }
}
