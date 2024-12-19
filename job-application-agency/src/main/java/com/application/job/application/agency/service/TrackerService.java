package com.application.job.application.agency.service;

import java.util.List;

import com.application.job.application.agency.model.Tracker;

public interface TrackerService {
	Tracker insertrecord(Tracker r);
	List<Tracker> getAll();
	void del(int ri);
	Tracker updaterecord(int i ,Tracker r);
}
