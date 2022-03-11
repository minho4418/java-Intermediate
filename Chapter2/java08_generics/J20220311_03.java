package java08_generics;

// 사과, 1000원
// 홍길동, 165.5cm
class Generic<K, V>{
	private K key;
	private V value;
	public Generic() {}
	
	public Generic(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Generic [key=" + key + ", value=" + value + "]";
	}
	
}

public class J20220311_03 {

	public static void main(String[] args) {
		
		Generic<String, Double> g = new Generic<>("지민호", 165.5);
		System.out.println(g);
		
		Generic<String, Integer> g2 = new Generic<>("사과", 1000);
		System.out.println(g2);
		
	}
}
