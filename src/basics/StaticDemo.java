package basics;

public class StaticDemo {

	int i;
	static int j;

	public void display() {
		i++;
		j++;

		System.out.println("i = " + i + "\tj = " + j);
	}

	public static void main(String[] args) {
		StaticDemo obj1 = new StaticDemo();
		obj1.display(); // i = 1 j = 1

		StaticDemo obj2 = new StaticDemo();
		obj2.display(); // i = 2 j = 1  

		StaticDemo obj3 = new StaticDemo();
		obj3.display();// i = 3 j = 1
	}
}
