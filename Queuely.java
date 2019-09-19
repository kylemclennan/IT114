package cs113;
import java.util.*;

public class Queuely {
	public static void main(String[] args) {
		//TODO Auto-generated stub
		Queue<TestKVP> q = new LinkedList<TestKVP>();
		List<String> t = new ArrayList<String>();
		t.add("a");
		t.add("b");
		t.add("c");
		t.add("d");
		for(int i = 0; i<10;i++) {
			Collections.shuffle(t);
			String temp= ""+t.get(0);
			q.add(new TestKVP(i,temp));
		}
		System.out.println("Show Queue "+q);
		
		TestKVP first = q.remove();
		System.out.println("First  "+ first);
		System.out.println("Altered Queue "+ q);
		
		TestKVP peek = q.peek();
		System.out.println("Viewing first "+ peek);
		System.out.println("Unaltered Queue "+q);
		
		TestKVP value = q.peek();
		System.out.println("peek : "+value);
		
		value = ((LinkedList<TestKVP>) q).peekFirst();
		System.out.println("PeekFirst : "+ value);
		
		value = ((LinkedList<TestKVP>) q).peekLast();
		System.out.println("PeekLast : "+ value);	
	}
}
class TestKVP{
	public int key;
	public String value;
	public TestKVP(int k,String v) {
		this.key = k;
		this.value = v;
	}
	@Override
	public String toString() {
		return"{'key': " + this.key +"', 'value':'" + this.value + "'}";
	}
}