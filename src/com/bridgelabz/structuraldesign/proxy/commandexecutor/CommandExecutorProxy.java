package com.bridgelabz.structuraldesign.proxy.commandexecutor;

/**
 * Title:This class is written to implement Command Executor Proxy for
 * Proxy Design pattern
 */
public class CommandExecutorProxy implements CommandExecutorInt {
//Variables used to check user is admin or not
	private boolean isAdmin;
	private CommandExecutorInt executor;

	/**
	 * This method is written to get user details to check he's admin or not
	 */
	public CommandExecutorProxy(String user, String pwd) {
		if ("admin".equals(user) && "admin123".equals(pwd))
			isAdmin = true;
		executor = new CommandExecutor();
	}

	/**
	 * This method is written to exceute command
	 */
	public void runCommand(String cmd) throws Exception {
		if (isAdmin) {
			executor.runCommand(cmd);
		} else {
			if (cmd.trim().startsWith("rm")) {
				throw new Exception("rm command is not allowed for non-admin users ");
			} else {
				executor.runCommand(cmd);
			}
		}
	}
}
