package com.smalwe.jobs;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class FristJob implements Job {

	@Override
	public void execute(JobExecutionContext context)
			throws JobExecutionException {
		// TODO Auto-generated method stub
		System.out.println("First job executed");
		
	}
	
}
