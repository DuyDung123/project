package appjava;

public class LocalinnerClass {
	private int data = 30;
	void display() {
		 class Local{
			void msg() {
				System.out.println(data);
			}
		}
		Local l = new Local();
		l.msg();
	}
}
