package com.simplertutorials.android.baseproject.data.api

import com.simplertutorials.android.baseproject.domain.ApiResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService{
    @GET ("info")
    fun getInfo(@Query("q")infoName:String,
                   @Query("appid")apiKey:String)
            : Single<ApiResponse>

}