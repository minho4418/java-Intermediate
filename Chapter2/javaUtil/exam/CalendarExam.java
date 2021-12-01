package javaUtil.exam;

import java.util.Calendar;

public class CalendarExam {
    public static void main(String[] args){ // 추상클래스는 미완성된 메소드를 가지고있음. new인스턴스 못만듦.
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH)+1);

        System.out.println(cal.get(Calendar.HOUR_OF_DAY));

        cal.add(Calendar.HOUR_OF_DAY, 5);

        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
    }
}
