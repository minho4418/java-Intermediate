package javaUtil.exam;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class TimeExam {
    public static void main(String[] args){
        LocalDateTime timePoint = LocalDateTime.now();
        System.out.println(timePoint);

        LocalDate id1 = LocalDate.of(2012,Month.DECEMBER,12);
        System.out.println(id1);

        LocalTime it1 = LocalTime.of(17,28);
        System.out.println(it1);
        LocalTime it2 = LocalTime.parse("10:15:30");
        System.out.println(it2);

        LocalDate theDate = timePoint.toLocalDate();
        System.out.println(theDate);
        Month month = timePoint.getMonth();
        System.out.println(timePoint.getMonth());
        System.out.println(month.getValue());
        System.out.println(timePoint.getHour());
    }
}
