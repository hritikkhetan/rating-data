package com.microservice.ratingdata.wrapper;

import java.util.List;

import com.microservice.ratingdata.model.UserRating;

import lombok.Data;

@Data
public class GetUserRatingResponse {

	List<UserRating> userRatingList;
	
}
