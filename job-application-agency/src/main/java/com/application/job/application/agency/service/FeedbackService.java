package com.application.job.application.agency.service;

import java.util.List;

import com.application.job.application.agency.model.Feedback;

public interface FeedbackService {
	Feedback insertrecord(Feedback r);
	List<Feedback> getAll();
	void del(int ri);
	Feedback updaterecord(int i,Feedback r);

}
