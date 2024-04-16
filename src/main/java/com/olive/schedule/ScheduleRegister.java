package com.olive.schedule;

import static org.quartz.CronScheduleBuilder.cronSchedule;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;

public class ScheduleRegister {
	private Scheduler scheduler;
	public ScheduleRegister() {
		// TODO Auto-generated constructor stub
	}
	
	public void execute() {
		try {

			scheduler = new StdSchedulerFactory().getScheduler();
			scheduler.scheduleJob(
					newJob(DefaultSchedule.class)
                    .withIdentity("defaultSchedule", Scheduler.DEFAULT_GROUP)
                    .build(),
            newTrigger()
                    .withIdentity("defaultTrgger", Scheduler.DEFAULT_GROUP)
                    .withSchedule(cronSchedule("0 0 0 1 * ?"))
                    .build());
			scheduler.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void shutdownScheduler() {
		 try {
	            scheduler.shutdown();
	        } catch (SchedulerException e) {
	            e.printStackTrace();
	        }
	}

}
