package com.simplertutorials.android.baseproject.data.api;

import com.simplertutorials.android.baseproject.BuildConfig;
import com.simplertutorials.android.baseproject.domain.ApiResponse;
import com.simplertutorials.android.baseproject.domain.DomainObject;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class ApiRepository {
    private static ApiRepository instance;


    private ApiRepository() {

    }

    public static ApiRepository getInstance() {
        if (instance == null)
            instance = new ApiRepository();
        return instance;
    }

    public Observable<ApiResponse> getInfo(ApiService apiService, DomainObject domainObject) {
        return apiService.getInfo(domainObject.getName(),
                BuildConfig.apiKey)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .toObservable();

    }
}
