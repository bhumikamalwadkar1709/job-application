package com.application.job.application.agency.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.job.application.agency.model.registation;

@Repository
@Qualifier("regRepo")
public interface registrationrepository extends JpaRepository<registation, Integer>{

}
