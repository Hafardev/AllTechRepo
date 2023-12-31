package com.example.mybasicapplication.di.annotation

import dagger.MapKey


@MapKey
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FUNCTION)
annotation class Order(val value:Int){

}