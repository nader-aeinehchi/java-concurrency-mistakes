package java.concurrency.mistakes.doublechecklocking1;

/**
 * Please see the following discussion:
 * @link http://cs.oswego.edu/pipermail/concurrency-interest/2016-March/014966.html
 *
 */
public class BrokenDoubleCheckLocking {
	private final static Object lock = new Object();

	private static BrokenDoubleCheckLocking INSTANCE;

	public static BrokenDoubleCheckLocking getInstance() {

		if (INSTANCE == null) {
			synchronized (lock) {
				if (INSTANCE == null) {
					INSTANCE = new BrokenDoubleCheckLocking();
				}
			}
		}

		return INSTANCE;
	}

}
