package javaStudy;

import java.util.Objects;

public class Student { // Object 클래스 : 모든 클래스의 최상위 클래스
    // equals : 객체가 가진 값을 비교할 때 사용
    // toString : 객체가 가진 값을 문자열로 반환
    // hashCode : 객체의 해시코드 값 반환
    // Art + Insert
    String name;
    String number;
    int birthYear;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(number, student.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "홍길동";
        s1.number = "1234";
        s1.birthYear = 1995;

        Student s2 = new Student();
        s2.name = "홍길동";
        s2.number = "1234";
        s2.birthYear = 1995;

        if(s1.equals(s2))
            System.out.println("s1 == s2");
        else
            System.out.println("s1 != s2");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s1);
        System.out.println(s1.toString());
    }
}
