package com.application.job.application.agency.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.application.job.application.agency.model.Tracker;
import com.application.job.application.agency.repository.TrackerRepository;

@Service
public class TrackerServiceImpl implements TrackerService{

	
	@Autowired
	@Qualifier("tcRepo")
	private TrackerRepository tcRepo;
	
	@Override
	public Tracker insertrecord(Tracker r) {
		// TODO Auto-generated method stub
		return tcRepo.save(r);
	}

	@Override
	public List<Tracker> getAll() {
		// TODO Auto-generated method stub
		return tcRepo.findAll();
	}

	@Override
	public void del(int ri) {
		// TODO Auto-generated method stub
		tcRepo.deleteById(ri);
	}

	@Override
	public Tracker updaterecord(int i, Tracker r) {
		Optional<Tracker> opt=tcRepo.findById(i);
		if(opt.isPresent())
		{
			Tracker rold=opt.get();
			rold.setApplicationid(r.getApplicationid());
			rold.setCompanyname(r.getCompanyname());
			rold.setJobtitle(r.getJobtitle());
			rold.setEmail(r.getEmail());
			rold.setRessumeversion(r.getRessumeversion());
			rold.setApplicationdate(r.getApplicationdate());
			rold.setInterviewdate(r.getInterviewdate());
			return tcRepo.save(rold);
		}
			
		
		return null;
	}

	
}
