package com.example.naveen.instagramintegration.services;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Naveen on 5/28/2016.
 */
public class ServiceManager {

    public static InstagramService createService() {
        return getRetrofit().create(InstagramService.class);
    }



    private static Retrofit getRetrofit() {
        return new Retrofit.Builder()
                .baseUrl("https://api.instagram.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}