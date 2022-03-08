package com.localCache;


public class LocalCacheEx {

	public static void main(String[] args) {
		LocalCache1 cache = new LocalCache1(5);

		cache.value(4);
		cache.value(5);
		cache.value(3);
		cache.value(5);
		cache.value(2);
		cache.value(1);
		cache.value(7);
		cache.value(4);
		cache.value(8);
		cache.value(4);
		cache.cacheDisplay();

	}

}

