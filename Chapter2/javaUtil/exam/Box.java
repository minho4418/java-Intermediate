package javaUtil.exam;

public class Box<E> { // Generic : 클래스 내부에서 지정하는 것이 아닌 외부에서 사용자에 의해 지정되는 것을 의미한다.
    // 한마디로 특정(Specific) 타입을 미리 지정해주는 것이 아닌 필요에 의해 지정할 수 있도록 하는 일반(Generic) 타입
    private E obj;

    public void setObj(E obj){
        this.obj = obj;
    }

    public E getObj(){
        return obj;
    }
}
