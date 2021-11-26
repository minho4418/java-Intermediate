package javaStudy;

public class WrapperExam { // java.lang 패키지 -> import안해도 사용가능

    public static void main(String[] args){
        // Integer : int의 값을 객체에 wrap한다.
        int i = 5;
        Integer i2 = new Integer(5);

        Integer i3 = 5; // Integer로 자동 형변환됨 -> 오토박싱
        // new Interger(5)를 5만써도 된다는 뜻
        // 오토박싱 : 기본 타입 데이터를 객체 타입의 데이터로 자동 형변환 시켜주는 기능

        int i4 = i3.intValue(); // Integer 객체타입을 int로 하려면 이렇게

        int i5 = i3; // java가 업데이트 되면서 intValue() 이제 안써도됨 -> 오토언박싱
        // 오토언박싱 : 오토박싱과 반대로 객체 타입의 데이터를 기본형 타입 데이터로 자동 형변환
    }
}
// wrapper class : 기본형 데이터 타입의 객체화를 가능하게 도와주는 클래스들