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

import com.application.job.application.agency.model.Tracker;
import com.application.job.application.agency.service.TrackerService;

@RestController
public class TrackerController {
@Autowired
private TrackerService ts;

@GetMapping("/tracker")
public List<Tracker> handleget()
{
	return ts.getAll();
	
}
@PostMapping("/addtracker")
public Tracker add(@RequestBody Tracker r)
{
	return ts.insertrecord(r);
}
@DeleteMapping("/deltracker/{rid}")
public void delr(@PathVariable("rid")int r)
{
	ts.del(r);
}

@PutMapping("/uptracker/{rid}")
public Tracker update(@PathVariable("rid")int i,@RequestBody Tracker r)
{
	return ts.updaterecord(i,r);
}


}


