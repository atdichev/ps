package com.azsoftware.ps;

import java.util.List;
import org.jutils.jprocesses.JProcesses;
import org.jutils.jprocesses.model.ProcessInfo;

public class App {
    public static void main( String[] args ) {
	    List<ProcessInfo> processesList = JProcesses.getProcessList();
	    for (final ProcessInfo processInfo : processesList) {
	    	System.out.format("%8s %s\n", new Object[] {processInfo.getPid(), processInfo.getCommand()});
	    }
    }
}
