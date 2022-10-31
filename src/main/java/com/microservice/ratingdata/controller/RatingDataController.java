package com.microservice.ratingdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.ratingdata.dao.RatingDaoRepository;
import com.microservice.ratingdata.model.UserRating;
import com.microservice.ratingdata.wrapper.CreateUserRatingRequest;
import com.microservice.ratingdata.wrapper.GetUserRatingResponse;

@RestController
public class RatingDataController {
	
	@Autowired
	public RatingDaoRepository ratingDaoRepository;
	
	@PostMapping(value = "/rating")
	public @ResponseBody UserRating createUserRating(@RequestBody CreateUserRatingRequest createRatingRequest) {
		
		UserRating userRating = new UserRating();
		userRating.setUserId(createRatingRequest.getUserId());
		userRating.setMovieId(createRatingRequest.getMovieId());
		userRating.setRating(createRatingRequest.getRating());
		
		ratingDaoRepository.save(userRating);
		
		return userRating;
		
	}
	
	@GetMapping(value = "/rating/{userId}")
	public GetUserRatingResponse getUserRatings(@PathVariable String userId){
		
		GetUserRatingResponse getUserRatingResponse = new GetUserRatingResponse();
		getUserRatingResponse.setUserRatingList(ratingDaoRepository.findByUserId(userId));
		return getUserRatingResponse;
		
	}
	
}