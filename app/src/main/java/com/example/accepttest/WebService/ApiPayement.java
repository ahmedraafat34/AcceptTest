package com.example.accepttest.WebService;

import com.example.accepttest.WebService.Requests.ApiRequest;
import com.example.accepttest.WebService.Requests.OrderRequest;
import com.example.accepttest.WebService.Requests.PaymentKeyRequest;
import com.example.accepttest.WebService.Response.ApiResponse;
import com.example.accepttest.WebService.Response.OrderResponse;
import com.example.accepttest.WebService.Response.PaymentKeyResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface  ApiPayement {

    @POST("auth/tokens?")
    Call<ApiResponse> getApiAuth(@Body ApiRequest apiRequest);

    @POST("ecommerce/orders")
    Call<OrderResponse> getOrder(@Body OrderRequest orderRequest);

    @POST("acceptance/payment_keys")
    Call<PaymentKeyResponse> getPaymentKey(@Body PaymentKeyRequest paymentKeyRequest);

}
