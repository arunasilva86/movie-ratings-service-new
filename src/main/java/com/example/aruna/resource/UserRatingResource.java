package com.example.aruna.resource;

import com.example.aruna.model.Rating;
import com.example.aruna.model.UserRatings;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/userRatings")
public class UserRatingResource {

    @RequestMapping("/users/{userId}")
    public UserRatings getUserRatings(@PathVariable int userId) {

        List<Rating> ratingsList = Arrays.asList(new Rating(123, 4),new Rating(456, 5));
        UserRatings userRatings = new UserRatings();
        userRatings.setUserRatings(ratingsList);
        return userRatings;
    }
}
