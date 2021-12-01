package javaUtil.exam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {
    public static void main(String[] args){
        Date date = new Date();
        System.out.println(date.toString());

        SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a zzz");

        System.out.println(ft.format(date));

        System.out.println(date.getTime()); // 현재 시간 long값으로

        long today = System.currentTimeMillis();
        System.out.println(today); // 현재 시간 long값으로

        System.out.println(today - date.getTime()); // 코드 두개 사이 걸린시간 나타냄
    }
}
