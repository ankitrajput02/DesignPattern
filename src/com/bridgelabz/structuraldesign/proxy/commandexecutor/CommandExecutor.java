package com.bridgelabz.structuraldesign.proxy.commandexecutor;

import java.io.IOException;

/**
* This class is written to implement command executor for Proxy Design pattern
* */
public class CommandExecutor implements CommandExecutorInt{
	

	/**
	* This method written to execute commands
	* */
	public void runCommand(String cmd)throws IOException{
	Runtime.getRuntime().exec(cmd);
	System.out.println(" ' "+cmd+" 'Command Executed.");
	}
	}

