package com.microservice.ratingdata.wrapper;

import org.springframework.lang.NonNull;

import lombok.Data;

@Data
public class CreateUserRatingRequest {

	@NonNull
	private String userId;
	
	@NonNull
	private String movieId;
	
	@NonNull
	private Integer rating;
	
}
