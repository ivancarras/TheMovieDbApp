package com.wembleystudios.themoviedbapp.data.api

import com.wembleystudios.themoviedbapp.data.model.ApiConfigurationData
import io.reactivex.Single
import retrofit2.http.GET

interface ConfigurationService {

    @GET("3/configuration")
    fun getConfiguration(): Single<ApiConfigurationData>
}