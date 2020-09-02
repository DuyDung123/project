package appjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaCore {
	public static Scanner myObj = new Scanner(System.in);
	void continues() {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			// Khi i == 5 thì không in i = 5 ra màn hình
			System.out.println(i);
		}
	}

	int fibonacci(int n) {
		int f0 = 0, f1 = 1, fn = f0 + f1;

		if (n < 0) {
			return -1;
		} else if (n == 0 || n == 1) {
			return n;
		} else {
			for (int i = 2; i < n; i++) {
				f0 = f1;
				f1 = fn;
				fn = f0 + f1;
			}
		}
		return fn;
	}
	
	public void richrac() {
		int n;
		System.out.print("nhập n: ");
		n = myObj.nextInt();
		for(int i = 0; i < n; i++ ) {
			if(i % 2 == 1) {
				for(int t = (i+1)*n; t>= i*n +1; t--) {
					System.out.print(t + " ");
					if(t<= i*n+1) {
						System.out.println();
					}
				}
			}else {
				for(int t = i*n + 1; t<= (i+1)*n; t++) {
					System.out.print(t + " ");
					if(t>= (i+1)*n) {
						System.out.println();
					}
				}
			}
		}
	}
	
	public void bai01() {
		System.out.println("tìm chố chia hết cho 7 nhưng không chia hết cho 5");
		System.out.print("nhập khoảng từ N: ");
		int n = myObj.nextInt();
		System.out.print("đến khoảng M: ");
		int m = myObj.nextInt();
		System.out.print("số chia hết: ");
		int a = myObj.nextInt();
		System.out.print("số không chia hết: ");
		int b = myObj.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for(int i = n; i <= m; i++) {
			if(i % a == 0 && i % b !=0) {
				list.add(i);
			}
		}
		System.out.print(list);
//		if(list != null && !list.isEmpty()) {
//			for(int i : list) {
//				System.out.print(i + ", ");
//			}
//		}
	}
}
