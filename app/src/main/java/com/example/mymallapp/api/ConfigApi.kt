package com.example.mymallapp.api

import com.example.baselibrary.http.factory.RetrofitFactory
import com.example.baselibrary.http.factory.RetrofitType

/**
 *
 */
class ConfigApi {

    fun <T> Home(api : Class<T>?) : T? {
        return RetrofitFactory.instance
            ?.create(RetrofitType.HOME)?.getRetrofit()?.create(api)
    }

}