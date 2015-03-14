package com.smalwe.jobs;

import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobKey;

public class SecondJob implements Job{

	@Override
	public void execute(JobExecutionContext context)
			throws JobExecutionException {
		// TODO Auto-generated method stub
		JobDataMap dataMap = context.getMergedJobDataMap();
		JobKey key = context.getJobDetail().getKey();
		//String jobDesc = context.get
		System.out.println("Second job executed:" + key);
	}
	

}
