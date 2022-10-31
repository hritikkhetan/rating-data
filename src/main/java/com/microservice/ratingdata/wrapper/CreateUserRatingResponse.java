package com.microservice.ratingdata.wrapper;

import lombok.Data;

@Data
public class CreateUserRatingResponse {
	
	public String userId;
	
	public String movie;
	
	public Float rating;
	
}
