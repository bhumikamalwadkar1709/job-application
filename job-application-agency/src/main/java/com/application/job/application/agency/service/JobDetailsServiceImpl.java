package com.application.job.application.agency.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.application.job.application.agency.model.JobDetails;
import com.application.job.application.agency.repository.JobDetailsRepository;

@Service
public class JobDetailsServiceImpl implements JobDetailsService{

	@Autowired
	@Qualifier("jdRepo")
	private JobDetailsRepository jdRepo;
	
	@Override
	public JobDetails insertrecord(JobDetails r) {
		// TODO Auto-generated method stub
		return jdRepo.save(r);
	}

	@Override
	public List<JobDetails> getAll() {
		// TODO Auto-generated method stub
		return jdRepo.findAll();
	}

	@Override
	public void del(int ri) {
		// TODO Auto-generated method stub
		jdRepo.deleteById(ri);
	}

	@Override
	public JobDetails updaterecord(int i, JobDetails r) {
		// TODO Auto-generated method stub
		Optional<JobDetails> opt=jdRepo.findById(i);
		if(opt.isPresent())
		{
			JobDetails rold=opt.get();
			rold.setJobid(r.getJobid());
			rold.setUserid(r.getUserid());
			rold.setSalary(r.getSalary());
			rold.setStatus(r.getStatus());
			
			return jdRepo.save(rold);
		}
			
		
		return null;
	}
	}


