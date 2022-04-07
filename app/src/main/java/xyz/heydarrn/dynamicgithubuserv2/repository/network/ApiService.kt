package xyz.heydarrn.dynamicgithubuserv2.repository.network

import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query
import xyz.heydarrn.dynamicgithubuserv2.BuildConfig

interface ApiService {
    @Headers(GITHUB_TOKEN)
    @GET("search/users")
    fun getUserFromSearching(@Query("q") queriedUsername:String)

    companion object{
        const val GITHUB_TOKEN=BuildConfig.PERSONAL_TOKEN
    }
}