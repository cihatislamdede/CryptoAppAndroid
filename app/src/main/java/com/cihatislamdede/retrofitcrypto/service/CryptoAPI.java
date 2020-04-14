package com.cihatislamdede.retrofitcrypto.service;

import com.cihatislamdede.retrofitcrypto.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {
    // GET,POST,UPDATE,DELETE

    @GET("currencies/ticker?key=YOUR_API_KEY&ids=BTC,ETH,XRP,TRX,VET,DOGE,ALGO&convert=USD")
    Observable<List<CryptoModel>> getData();
        
    
}
