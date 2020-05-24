package com.auu.hunterblade.exampleapolloandroidstrapi

import android.app.Application
import com.apollographql.apollo.ApolloClient
import okhttp3.OkHttpClient

class App : Application(){

//    private val baseUrl = "http://10.42.0.1:1337/graphql"

    private var baseUrl = "http://localhost:1337/graphql"

    private val apolloPublicClient: ApolloClient by lazy {

        val okHttpClient = OkHttpClient.Builder()
            .build()

        ApolloClient.builder()
            .serverUrl(baseUrl)
            .okHttpClient(okHttpClient)
            .build()
    }


    fun getDataService(): ApolloClient {
         return apolloPublicClient
    }


}