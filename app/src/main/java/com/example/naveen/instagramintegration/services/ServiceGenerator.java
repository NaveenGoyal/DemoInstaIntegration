package com.example.naveen.instagramintegration.services;
import com.example.naveen.instagramintegration.constants.Constants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Naveen on 5/28/2016.
 */
public class ServiceGenerator{

    public static GetTokenService createTokenService(){
        return getRetrofit().create(GetTokenService.class);
    }


    private static Retrofit getRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}

