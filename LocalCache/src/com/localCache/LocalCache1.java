package com.localCache;

import java.util.LinkedHashSet;
import java.util.Set;

public class LocalCache1 {
	Set<Integer> local;
	int storage;

	public LocalCache1(int storage) {
		this.storage = storage;
		this.local = new LinkedHashSet<Integer>(storage);
	}

	public boolean get(int key) {
		if (local.contains(key)) {
			local.remove(key);
			local.add(key);
			return true;
		} else {
			return false;
		}
	}

	public void value(int key) {
		if (get(key) == false) {
			put(key);
		}
	}

	public void cacheDisplay() {

		System.out.println(local);
	}

	public void put(int key) {
		if (local.size() == storage) {
			int firstKey = local.iterator().next();
			local.remove(firstKey);
		}

		local.add(key);
	}
}
