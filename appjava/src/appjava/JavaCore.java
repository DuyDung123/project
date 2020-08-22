package appjava;

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
}
