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

import com.application.job.application.agency.model.registation;
import com.application.job.application.agency.service.registrationservice;

@RestController
public class registrationcontroller {
@Autowired
private registrationservice rs;

@GetMapping("/registrations")
public List<registation> handleget()
{
	return rs.getAll();
	
}
@PostMapping("/addreg")
public registation add(@RequestBody registation r)
{
	return rs.insertrecord(r);
}
@DeleteMapping("/delreg/{rid}")
public void delr(@PathVariable("rid")int r)
{
	rs.del(r);
}

@PutMapping("/upreg/{rid}")
public registation update(@PathVariable("rid")int i,@RequestBody registation r)
{
	return rs.updaterecord(i,r);
}

@GetMapping("/login/{emailId}/{password}")
public List<registation> login(@PathVariable("emailId")String emailId,@PathVariable("password")String password)
{
return rs.login(emailId, password)	;
}
}
