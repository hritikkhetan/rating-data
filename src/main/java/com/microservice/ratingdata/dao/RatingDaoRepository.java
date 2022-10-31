package com.microservice.ratingdata.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.ratingdata.model.UserRating;

@Repository
public interface RatingDaoRepository extends JpaRepository<UserRating, Long>{

	List<UserRating> findByUserId(String userId);
	
}
