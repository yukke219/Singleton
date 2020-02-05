package singleton;

public class SingletonTest {
	public static void main(String[] args){
		Renban r1 = Renban.getInstance();
		Renban r2 = Renban.getInstance();

		System.out.println(r1.getNumber());
		System.out.println(r2.getNumber());
		System.out.println(r1.getNumber());
	}
}