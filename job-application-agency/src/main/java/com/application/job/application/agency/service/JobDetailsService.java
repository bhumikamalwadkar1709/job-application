package com.application.job.application.agency.service;

import java.util.List;

import com.application.job.application.agency.model.JobDetails;

public interface JobDetailsService {
	JobDetails insertrecord(JobDetails r);
	List<JobDetails> getAll();
	void del(int ri);
	JobDetails updaterecord(int i ,JobDetails r);

}
