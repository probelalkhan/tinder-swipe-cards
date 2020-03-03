package net.simplifiedcoding.tinder

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface TinderAPI {

    @GET("profiles")
    fun getProfiles(): Call<List<Profile>>

    companion object {
        operator fun invoke(): TinderAPI {
            return Retrofit.Builder()
                .baseUrl("https://api.simplifiedcoding.in/course-apis/tinder/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(TinderAPI::class.java)
        }
    }
}