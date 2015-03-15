package com.smalwe.jobs;

import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.StatefulJob;

@SuppressWarnings("deprecation")
public class FristJob implements StatefulJob {

	
	@Override
	public void execute(JobExecutionContext context)
			throws JobExecutionException {
		// TODO Auto-generated method stub
		JobDataMap dataMap = context.getMergedJobDataMap();
		
		System.out.println("First job executed:" + dataMap.getString("name"));
		
	}
	
}
