package javaUtil.exam;

public class MusicBox {
    public synchronized void playMusicA(){
        // synchronized : 현재 데이터를 사용하고 있는 해당 스레드를 제외하고
        //                나머지 스레드들은 데이터에 접근 할 수 없도록 막는 개념

        for(int i = 0; i < 10; i++){
            System.out.println("신나는 음악!");

            try{
                Thread.sleep((int)(Math.random()*1000));
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public synchronized void playMusicB(){
        for(int i = 0; i < 10; i++){
            System.out.println("슬픈 음악!");

            try{
                Thread.sleep((int)(Math.random()*1000));
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public void playMusicC(){
        for(int i = 0; i < 10; i++){
            synchronized (this){
                System.out.println("카페 음악!");
            }

            try{
                Thread.sleep((int)(Math.random()*1000));
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
