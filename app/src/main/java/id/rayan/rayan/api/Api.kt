package id.rayan.rayan.api

import id.rayan.rayan.data.model.DetailUserResponse
import id.rayan.rayan.data.model.User
import id.rayan.rayan.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 251d671aba5376cb73867917414967dd698372ac")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 251d671aba5376cb73867917414967dd698372ac")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 251d671aba5376cb73867917414967dd698372ac")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 251d671aba5376cb73867917414967dd698372ac")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}