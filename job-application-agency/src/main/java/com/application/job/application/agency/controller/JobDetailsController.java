package com.application.job.application.agency.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.job.application.agency.model.JobDetails;
import com.application.job.application.agency.service.JobDetailsService;

@RestController
public class JobDetailsController {

	@Autowired
	private JobDetailsService js;
	
	@GetMapping("/JobDetails")
	public List<JobDetails> handleget()
	{
		return js.getAll();
		
	}
	@PostMapping("/JobDetails")
	public JobDetails add(@RequestBody JobDetails r)
	{
		return js.insertrecord(r);
	}
	@DeleteMapping("/deljd/{rid}")
	public void delr(@PathVariable("rid")int r)
	{
		js.del(r);
	}

	@PutMapping("/upjd/{rid}")
	public JobDetails update(@PathVariable("rid")int i,@RequestBody JobDetails r)
	{
		return js.updaterecord(i,r);
	}
}
