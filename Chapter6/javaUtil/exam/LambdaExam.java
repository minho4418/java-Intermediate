package javaUtil.exam;

public class LambdaExam {

    public static void main(String[] args){
        new Thread(() -> {
            for(int i = 0; i < 10; i++){
                System.out.println("hello");
            }
        }).start();
    }
}
