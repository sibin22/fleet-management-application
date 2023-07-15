package com.application.management.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.management.app.models.JobTitle;

public interface JobTitleRepository extends JpaRepository<JobTitle, Integer> {

}
