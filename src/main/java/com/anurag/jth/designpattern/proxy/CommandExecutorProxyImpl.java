package com.anurag.jth.designpattern.proxy;

public class CommandExecutorProxyImpl implements CommandExecutor{
	private boolean isAdmin;
	private CommandExecutor commandExecutor;
	
	public CommandExecutorProxyImpl(String user, String password) {
		isAdmin = "user".equals(user) && "pass".equals(password) ? true : false;
		commandExecutor = new CommandExecutorImpl();
	}
	
	
	@Override
	public void run(String cmd) throws Exception {

		if(isAdmin) {
			commandExecutor.run(cmd);
		}else {
			if(cmd.trim().startsWith("rm")) {
				throw new Exception("rm command is not allowed for non-admin user");
			}else {
				commandExecutor.run(cmd);
			}
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
