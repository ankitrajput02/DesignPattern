package com.bridgelabz.structuraldesign.proxy.commandexecutor;

/**
* This class is written to implement Proxy Design pattern
* */
public class ProxyPatternTest {
	public static void main(String[] args) {
		CommandExecutorInt executor = new CommandExecutorProxy("admin", "admin123");
		try {
			executor.runCommand("ls -ltr");
			executor.runCommand("rm -rf aa.txt");
		} catch (Exception e) {
			System.out.println("Exception message " + e.getMessage());
		}
	}
}