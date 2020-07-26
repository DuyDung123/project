package appjava;

import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
//		 test test = new test();
//		 test.fileStream();
//		 GridLayoutExam1 gridLayoutExam1 = new GridLayoutExam1()
		JavaCore javaCore = new JavaCore();
		javaCore.continues();
		
		System.out.println("10 số đầu tiên của dãy số fibonacci: ");
		for (int i = 0; i < 10; i++) {
            System.out.print(javaCore.fibonacci(i) + " ");
        }
	}
}
