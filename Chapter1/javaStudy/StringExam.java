package javaStudy;

public class StringExam {
    public static void main(String[] args){
        String str1 = "hello world";
        String str2 = str1.substring(5);
        System.out.println(str1);
        System.out.println(str2);

        String str3 = str1 + str2;
        System.out.println(str3);

        String str4 = new StringBuffer().append(str1).append(str2).toString();
        System.out.println(str4);

        String str5 = "";
        for(int i =0; i<100; i++){ // 한번돌때마다 new 스트링버터가 생겨남
            str5 = str5 +"*"; // new 객체가 많이 생겨날수록 프로그램 느려짐
        }
        System.out.println(str5);

        StringBuffer sb = new StringBuffer(); // 이 방법이 더 효과적이다.
        for(int i = 0; i < 100; i++){
            sb.append("*");
        }
        String str6 = sb.toString();
        System.out.println(str6);
    }
}