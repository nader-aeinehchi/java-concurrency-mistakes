package java.concurrency.mistakes.doublechecklocking1;

public class Solution1 {
	private final static Object lock = new Object();

	private static volatile Solution1 INSTANCE;

	public static Solution1 getInstance() {

		if (INSTANCE == null) {
			synchronized (lock) {
				if (INSTANCE == null) {
					INSTANCE = new Solution1();
				}
			}
		}

		return INSTANCE;
	}

}
