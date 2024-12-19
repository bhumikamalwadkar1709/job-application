package com.application.job.application.agency.service;

import java.util.List;

import com.application.job.application.agency.model.registation;

public interface registrationservice {
registation insertrecord(registation r);
List<registation> getAll();
void del(int ri);
registation updaterecord(int i ,registation r);

}
