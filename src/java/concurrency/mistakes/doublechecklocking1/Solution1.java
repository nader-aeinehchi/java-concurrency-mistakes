/*
 * This software is produced by Nader Aeinehchi. Unauthorized redistribution, reproduction or usage of this
 * software in whole or in part without the express written consent of Nader Aeinehchi is strictly
 * prohibited. Copyright 2016 Nader Aeinehchi. ALL RIGHTS RESERVED
 */
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
