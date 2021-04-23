package com.example.mymallapp.ui.home

import com.example.baselibrary.http.call.CallObserver
import com.example.baselibrary.mvp.model.IModel
import com.example.baselibrary.mvp.view.IView
import com.example.mymallapp.bean.FoodBean

/**
 *
 */
interface HomeContract {

    interface View : IView{
        fun initFood(foodBean: List<FoodBean.DataBean>)
    }

    interface Model : IModel{
        fun requestList(callObserver : CallObserver<FoodBean>)
    }

}