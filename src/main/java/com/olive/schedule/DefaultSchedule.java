package com.olive.schedule;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.olive.dao.UserDAO;
import com.olive.service.MembershipService;

public class DefaultSchedule implements Job{
	private MembershipService membershipService;
	
	
	public DefaultSchedule() {
		membershipService = new MembershipService();
	}
	
	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		//여기에 앞으로 실행할 잡 등록
		membershipService.updateUsersLevel();
		System.out.println("coupon 발행중");
		
	}
	
	
	
}
