package com.bridgelabz.structuraldesign.proxy.commandexecutor;
/* 
 * This interface is written to implement CommandExecutor for ProxyDesignpattern
 * */
public interface CommandExecutorInt {
	public void runCommand(String cmd)throws Exception;

}