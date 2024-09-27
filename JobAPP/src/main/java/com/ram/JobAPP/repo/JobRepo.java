package com.ram.JobAPP.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ram.JobAPP.model.JobPost;

@Repository
public class JobRepo {

	List<JobPost> jobs = new ArrayList<>(Arrays.asList(
			
			));
					

	public List<JobPost> returnAllJobPosts() {
		return jobs;
	}

	public void addJobPost(JobPost job) {
		jobs.add(job);

	}
	
}
