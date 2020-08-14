package appjava;

import java.util.Scanner;
import java.text.Normalizer;
import java.util.regex.Pattern;

public class main {

	public static String code(String name) {
		name.toLowerCase();
		name.trim();
		return name.replace(" ", "-");
	}

	public static String removeAccent(String s) {
		String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		temp = pattern.matcher(temp).replaceAll("");
		temp.replaceAll("đ", "d");	
		return temp.replace(" ", "-");
	}

	public static void main(String args[]) {
//		Scanner scanner = new Scanner(System.in);
////		 test test = new test();
////		 test.fileStream();
////		 GridLayoutExam1 gridLayoutExam1 = new GridLayoutExam1()
//		JavaCore javaCore = new JavaCore();
//		javaCore.continues();
//		
//		System.out.println("10 số đầu tiên của dãy số fibonacci: ");
//		for (int i = 0; i < 10; i++) {
//            System.out.print(javaCore.fibonacci(i) + " ");
//        }

		System.out.println(removeAccent("Máy tính"));
	}
}
