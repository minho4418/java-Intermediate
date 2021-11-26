package javaStudy;

public class StringBufferExam {
    public static void main(String[] args){
        // StringBuffer 클래스 : 문자열을 추가하거나 변경 할 때 주로 사용하는 자료형
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("world");

        String str = sb.toString();
        System.out.println(str);

        StringBuffer sb2 = new StringBuffer();
        StringBuffer sb3 = sb2.append("hello");
        // 메소드체이닝 : 자기자신을 리턴하여 계속해서 자신의 메소드를 호출하는 방식
        if(sb2 == sb3)
            System.out.println("sb2 == sb3");

        String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();
        System.out.println(str2);

       }
}