package appjava;

public class JavaCore {
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
}
