package com.application.job.application.agency.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Service;

import com.application.job.application.agency.model.registation;
import com.application.job.application.agency.repository.registrationrepository;

@Service
public class registationserviceImpl implements registrationservice{

	@Autowired
	@Qualifier("regRepo")
	private registrationrepository regRepo;
	
	@Override
	public registation insertrecord(registation r) {
		// TODO Auto-generated method stub
		return regRepo.save(r);
	}

	@Override
	public List<registation> getAll() {
		// TODO Auto-generated method stub
		return regRepo.findAll();
	}

	@Override
	public void del(int ri) {
		// TODOptional<T>enerated method stub
		regRepo.deleteById(ri);
	}

	@Override
	public registation updaterecord(int i,registation r) {
		Optional<registation> opt=regRepo.findById(i);
		if(opt.isPresent())
		{
			registation rold=opt.get();
			rold.setName(r.getName());
			rold.setAddress(r.getAddress());
			rold.setCity(r.getCity());
			rold.setGender(r.getGender());
			rold.setContanct(r.getContanct());
			rold.setEmailId(r.getEmailId());
			rold.setPassword(r.getPassword());
			return regRepo.save(rold);
		}
			
		
		return null;
	}

}
