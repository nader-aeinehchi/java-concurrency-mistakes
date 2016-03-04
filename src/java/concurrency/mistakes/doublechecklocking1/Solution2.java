package java.concurrency.mistakes.doublechecklocking1;

public class Solution2 {
    private static class Holder {
        static final Solution2 INSTANCE = new Solution2();
    }

	public static Solution2 getInstance() {
        return Holder.INSTANCE;
    }
}