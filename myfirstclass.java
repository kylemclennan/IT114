import java.util.*;

public class MyFirstClass{
	public in myPublic Int;
	private int myPrivateInt;
	protected int my ProtectedInt;

	public String string;
	public char myChar;
	public Date myDate;

	public static void main(String[] args){
		mtFristClass mFirstClassObject = new MyFirstClass();
		mFirstClassObject.myPublicInt =1;
		System.out.println(mFirstClassObject.myPublicInt);
		List<String> myStrings = new ArrayList<String>();
		String[] stringArray = new String[3];

		myStrings.add("Hi");
		myStrings.add("Bye");
		myStrings.add("Hi again");
		myStrings.add("And I'm Still here");
		MyStrings.add("See you tomorrow");
		
		Collections.sort(myStrings);
		//TODO reverse sort
		Collections.reverse(myStrings);
		//TODO SHuffle
		Collections.shuffle(myStrings);
		//TODO create list of ints
		List<Integer> myInts = new ArrayList<Integer>();
		for(int i = 0; i<10;i++{
			myInts.add(i);
		}
		int total = 0;
		for(int i = 0; i <myInts.size();i++){
			total += myInts.get(i);
		}
		System.out.println("my total is " + total);
		//TODO print odd or even of list
		for(int t = 0; t<=myInts.size();t++;{
			System.out.println(t);
			if t% 2 == 0) {
				System.out.println("it is even");
			}
			else {
				System.out.println("it is odd");
			}
		}
		int size = myStrings.size();
		for(int i = 0; i< myStrings.size(); i++ {
			if(i == 1) {
				myStrings.remove(i);
			}
		System.out.println("Index[" + i + "] => " + myStrings.get(i));
		System.out.println(myStrings.get(i));
		System.out.println((Object) "string");
		}
	}
}


