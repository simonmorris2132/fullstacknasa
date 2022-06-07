package com.careerdevs.fullstacknasa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.careerdevs.fullstacknasa.models.APODInfo;

@RestController
public class APODController {
    
    @Autowired
    private Environment env;

    @GetMapping("/info")
    public APODInfo apodInfo(RestTemplate restTemplate) {
        
        String url = "https://api.nasa.gov/planetary/apod?api_key=" + env.getProperty("API_KEY");

        APODInfo apod = restTemplate.getForObject(url, APODInfo.class);

        return apod;

    }

}
