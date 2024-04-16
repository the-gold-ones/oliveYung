package com.olive.listen;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.olive.schedule.ScheduleRegister;

@WebListener
public class Observer implements ServletContextListener {
	private ScheduleRegister sr;
	@Override
	public void contextInitialized(ServletContextEvent e) {
		sr = new ScheduleRegister();
		sr.execute();
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent e) {
		System.out.println("context리스너끝냄...");
		sr.shutdownScheduler();
	}
}
