package com.anurag.jth.designpattern.proxy;

public class ProxyPatternExample {
	public static void main(String[] args) throws Exception {
		CommandExecutor executor = new CommandExecutorProxyImpl("user", "pass");
		executor.run("ls -ltr");
		executor.run(" rm -rf abc.pdf");
	}
}
