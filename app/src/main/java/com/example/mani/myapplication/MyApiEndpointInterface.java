package com.example.mani.myapplication;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by mshafaatdoost on 11/21/16.
 */

public interface MyApiEndpointInterface {

    /**
     * get full location for a location id
     *
     * @param locationId location id
     * @return location object
     */
    @GET("/posts/{id}")
    Observable<Post> getLocationDetail(@Path("id") int id);
}
