package com.application.job.application.agency.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.application.job.application.agency.model.registation;

@Repository
@Qualifier("regRepo")
public interface registrationrepository extends JpaRepository<registation, Integer>{
@Query(value = "select * from registation where email_id=:emailId and password=:password",nativeQuery = true)
List<registation> findAllByEmailIdAndPassword(String emailId, String password);

}
