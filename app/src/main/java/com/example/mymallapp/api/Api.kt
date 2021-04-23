package com.example.mymallapp.api

import com.example.mymallapp.bean.FoodBean
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 *
 */
interface Api {

    //stage_id=1&limit=20&page=1
    @GET("ios/cf/dish_list.php?")
    fun getFood(@Query("stage_id")stage_id : Int, @Query("limit")limit : Int, @Query("page")page : Int) : Observable<FoodBean?>?


}