package com.smalwe.main;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;

import static org.quartz.JobBuilder.*;
import static org.quartz.TriggerBuilder.*;

import com.smalwe.jobs.FristJob;

public class Schedular {
	public static void main (String args[]) throws SchedulerException {
		SchedulerFactory schFact = new StdSchedulerFactory();
		
		Scheduler sch = schFact.getScheduler();
		
		JobDetail job =  newJob(FristJob.class)
				.withIdentity("myJob", "group1")
				.build(); 
		Trigger trigger = newTrigger().withIdentity("myTrigger","group1").startNow()
				.withSchedule(SimpleScheduleBuilder.simpleSchedule()
						.withIntervalInSeconds(1)
						.repeatForever())
						.build(); 
		sch.start();
		sch.scheduleJob(job, trigger);
	}
}