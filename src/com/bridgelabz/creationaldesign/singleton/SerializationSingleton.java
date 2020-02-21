package com.bridgelabz.creationaldesign.singleton;

import java.io.Serializable;

/**
 * This class is written to implement Serialized Initialization for Singleton
 * Design Pattern
 */
public class SerializationSingleton implements Serializable {
	private static final long serialVersionUID = 1L;
	private static SerializationSingleton instance = new SerializationSingleton();
	transient String[] abc = { "abc1", "abc2", "abc3" };

	private SerializationSingleton() {
	}

	public static SerializationSingleton getInstance() {
		return instance;
	}

	protected Object readResolve() {
		return getInstance();
	}
}