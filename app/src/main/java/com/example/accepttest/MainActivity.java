package com.example.accepttest;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.accepttest.Modls.BillingData;
import com.example.accepttest.WebService.ApiClient;
import com.example.accepttest.WebService.ApiPayement;
import com.example.accepttest.WebService.Requests.ApiRequest;
import com.example.accepttest.WebService.Requests.OrderRequest;
import com.example.accepttest.WebService.Requests.PaymentKeyRequest;
import com.example.accepttest.WebService.Response.ApiResponse;
import com.example.accepttest.WebService.Response.OrderResponse;
import com.example.accepttest.WebService.Response.PaymentKeyResponse;
import com.paymob.acceptsdk.IntentConstants;
import com.paymob.acceptsdk.PayActivity;
import com.paymob.acceptsdk.PayActivityIntentKeys;
import com.paymob.acceptsdk.PayResponseKeys;
import com.paymob.acceptsdk.SaveCardResponseKeys;
import com.paymob.acceptsdk.ToastMaker;

import java.util.ArrayList;
import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    static final int ACCEPT_PAYMENT_REQUEST = 1;

    private static final String API_PREFS_NAME = "prfs_api";
   private static final String MARCH_ID = "march_id";



    private static final String TOKEN = "auth_tokn";

    String paymentKey="";

    final static String apiKey = "ZXlKMGVYQWlPaUpLVjFRaUxDSmhiR2NpT2lKSVV6VXhNaUo5LmV5SmpiR0Z6Y" +
            "3lJNklrMWxjbU5vWVc1MElpd2libUZ0WlNJNkltbHVhWFJwWVd3aUxDSndjbTltYVd4bFgzQnJJam96TVRjM2Z" +
            "RLnQ4XzJzcVhPeERMbG44M0dDdkpLTVBoYUUwTXNNYmVtV08tdXVpNmpPeWJXMlV" +
            "oakh5YXpvUU5LMDV2aThHYUxYZWxqOXczWmlOMkZhX2pPNFgzTTlR";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button CheckOut = findViewById(R.id.CheckOutBtn);
        CheckOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });






        /*
        final EditText firstname=(EditText) findViewById(R.id.Firstname);
        final EditText lastname=(EditText)findViewById(R.id.Lastname);
        final EditText phonenumber=(EditText)findViewById(R.id.Phonenumber);
        final EditText email =(EditText)findViewById(R.id.email);
        final EditText state =(EditText)findViewById(R.id.state);
        final EditText country =(EditText)findViewById(R.id.country);
        final EditText city =(EditText)findViewById(R.id.city);
        final EditText postalCode =(EditText)findViewById(R.id.postalCode);
        final EditText shippingMethod =(EditText)findViewById(R.id.shippingMethod);
        final EditText building =(EditText)findViewById(R.id.building);
        final EditText floor =(EditText)findViewById(R.id.floor);
        final EditText apartment =(EditText)findViewById(R.id.apartment);
        final EditText street =(EditText)findViewById(R.id.street);

        Button save=(Button)findViewById(R.id.Billingbtn);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                       BillingData billingData = new BillingData(

                        firstname.getText().toString(),
                        lastname.getText().toString(),
                        phonenumber.getText().toString(),
                        email.getText().toString(),
                        state.getText().toString(),
                        country.getText().toString(),
                        city.getText().toString(),
                        postalCode.getText().toString(),
                        shippingMethod.getText().toString(),
                        building.getText().toString(),
                        floor.getText().toString(),
                        apartment.getText().toString(),
                        street.getText().toString()
                );

            }

        });

*/




        //startPayActivityNoToken(true);
        //onActivityResult(1,6,getIntent());

        init();


    }

    void init() {
        //TODO crat usr intrfac to gt usr data
        //crat func to  gt paymntKy and add all data to mak Th Post  rqust
        //in pay func rspons sav th paymnt ky thn opn payActivity func
        //thn handl onActivtyrsult callBack
       //System.out.println(authToken);
        //getApiAuth();
       // getOrder();
        //getpaymentKey();

    }

    String authToken;
    String marchId;

    void getApiAuth() {
        ApiPayement apiPayement = ApiClient.getClient().create(ApiPayement.class);
        ApiRequest apiRequest = new ApiRequest(apiKey);

        apiPayement.getApiAuth(apiRequest).enqueue(new Callback<ApiResponse>() {
            @Override
            public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
                authToken = response.body().getToken();
                marchId = String.valueOf(response.body().getProfile().getId());
                saveDataString(TOKEN, authToken);
                saveDataString(MARCH_ID, marchId);
                getOrder();
            }


            @Override
            public void onFailure(Call<ApiResponse> call, Throwable t) {
                Toast.makeText(MainActivity.this, "hey", Toast.LENGTH_SHORT).show();
            }
        });
    }


    int orderId;
    void getOrder() {
        ApiPayement apiPayement = ApiClient.getClient().create(ApiPayement.class);

        OrderRequest orderRequest = new OrderRequest(new ArrayList<String>(), String.valueOf(
                new Random().nextInt(5200)), "EGP", "100", marchId
                , String.valueOf(false), authToken);

        apiPayement.getOrder(orderRequest).enqueue(new Callback<OrderResponse>() {
            @Override
            public void onResponse(Call<OrderResponse> call, Response<OrderResponse> response) {
                orderId = response.body().getId();

                //TODO call pay func
              //  getpaymentKey();
            }

            @Override
            public void onFailure(Call<OrderResponse> call, Throwable t) {
                Toast.makeText(MainActivity.this, "RROR", Toast.LENGTH_SHORT).show();
            }
        });
    }

   /*  void getpaymentKey(){

        ApiPayement apiPayement = ApiClient.getClient().create(ApiPayement.class);
BillingData bill = new BillingData("NA","Raafat","NA","NA", "NA","NA","01110902775","NA","NA","ahmed","NA","ahmedraafat@weaccept.co","NA");
        PaymentKeyRequest paymentKeyRequest = new PaymentKeyRequest(
                4858,"EGP",bill,String.valueOf(orderId),3600,"100",authToken);

       apiPayement.getPaymentKey(paymentKeyRequest).enqueue(new Callback<PaymentKeyResponse>() {
            @Override
            public void onResponse(Call<PaymentKeyResponse> call, Response<PaymentKeyResponse> response) {

                paymentKey= response.body().getToken();

            }

            @Override
            public void onFailure(Call<PaymentKeyResponse> call, Throwable t) {
                Toast.makeText(MainActivity.this, "no key", Toast.LENGTH_SHORT).show();
            }
        });
    }*/

    void saveDataString(String key, String value) {
        SharedPreferences.Editor editor = getSharedPreferences(API_PREFS_NAME, MODE_PRIVATE).edit();
        editor.putString(key, value);
        editor.commit();
    }

    String getDataString(String key) {
        SharedPreferences prefs = getSharedPreferences(API_PREFS_NAME, MODE_PRIVATE);
        return prefs.getString(key, null);
    }

    private void startPayActivityNoToken(Boolean showSaveCard) {
        Intent pay_intent = new Intent(this, PayActivity.class);

        putNormalExtras(pay_intent);
        pay_intent.putExtra(PayActivityIntentKeys.SAVE_CARD_DEFAULT, true);
        pay_intent.putExtra(PayActivityIntentKeys.SHOW_ALERTS, showSaveCard);
        pay_intent.putExtra(PayActivityIntentKeys.SHOW_SAVE_CARD, showSaveCard);
        pay_intent.putExtra(PayActivityIntentKeys.THEME_COLOR, 0x8033B5E5);

        startActivityForResult(pay_intent, ACCEPT_PAYMENT_REQUEST);
    }

    private void putNormalExtras(Intent intent) {
        // Pass the correct values for the billing data keys
        intent.putExtra(PayActivityIntentKeys.FIRST_NAME, "firsy_name");
        intent.putExtra(PayActivityIntentKeys.LAST_NAME, "last_name");
        intent.putExtra(PayActivityIntentKeys.BUILDING, "1");
        intent.putExtra(PayActivityIntentKeys.FLOOR, "1");
        intent.putExtra(PayActivityIntentKeys.APARTMENT, "1");
        intent.putExtra(PayActivityIntentKeys.CITY, "cairo");
        intent.putExtra(PayActivityIntentKeys.STATE, "new_cairo");
        intent.putExtra(PayActivityIntentKeys.COUNTRY, "egypt");
        intent.putExtra(PayActivityIntentKeys.EMAIL, "email@gmail.com");
        intent.putExtra(PayActivityIntentKeys.PHONE_NUMBER, "2345678");
        intent.putExtra(PayActivityIntentKeys.POSTAL_CODE, "3456");

        intent.putExtra(PayActivityIntentKeys.PAYMENT_KEY, paymentKey);

        intent.putExtra(PayActivityIntentKeys.THREE_D_SECURE_ACTIVITY_TITLE, "Verification");
    }




    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Bundle extras = data.getExtras();

        if (requestCode == ACCEPT_PAYMENT_REQUEST) {

            if (resultCode == IntentConstants.USER_CANCELED) {
                // User canceled and did no payment request was fired
                ToastMaker.displayShortToast(this, "User canceled!!");
            } else if (resultCode == IntentConstants.MISSING_ARGUMENT) {
                // You forgot to pass an important key-value pair in the intent's extras
                ToastMaker.displayShortToast(this, "Missing Argument == " + extras.getString(IntentConstants.MISSING_ARGUMENT_VALUE));
            } else if (resultCode == IntentConstants.TRANSACTION_ERROR) {
                // An error occurred while handling an API's response
                ToastMaker.displayShortToast(this, "Reason == " + extras.getString(IntentConstants.TRANSACTION_ERROR_REASON));
            } else if (resultCode == IntentConstants.TRANSACTION_REJECTED) {
                // User attempted to pay but their transaction was rejected

                // Use the static keys declared in PayResponseKeys to extract the fields you want
                ToastMaker.displayShortToast(this, extras.getString(PayResponseKeys.DATA_MESSAGE));
            } else if (resultCode == IntentConstants.TRANSACTION_REJECTED_PARSING_ISSUE) {
                // User attempted to pay but their transaction was rejected. An error occured while reading the returned JSON
                ToastMaker.displayShortToast(this, extras.getString(IntentConstants.RAW_PAY_RESPONSE));
            } else if (resultCode == IntentConstants.TRANSACTION_SUCCESSFUL) {
                // User finished their payment successfully
                Toast.makeText(this, "successfull payment ", Toast.LENGTH_SHORT).show();
                // Use the static keys declared in PayResponseKeys to extract the fields you want
                ToastMaker.displayShortToast(this, extras.getString(PayResponseKeys.DATA_MESSAGE));
            } else if (resultCode == IntentConstants.TRANSACTION_SUCCESSFUL_PARSING_ISSUE) {
                // User finished their payment successfully. An error occured while reading the returned JSON.
                ToastMaker.displayShortToast(this, "TRANSACTION_SUCCESSFUL - Parsing Issue");

                // ToastMaker.displayShortToast(this, extras.getString(IntentConstants.RAW_PAY_RESPONSE));
            } else if (resultCode == IntentConstants.TRANSACTION_SUCCESSFUL_CARD_SAVED) {
                // User finished their payment successfully and card was saved.

                // Use the static keys declared in PayResponseKeys to extract the fields you want
                // Use the static keys declared in SaveCardResponseKeys to extract the fields you want
                ToastMaker.displayShortToast(this, "Token == " + extras.getString(SaveCardResponseKeys.TOKEN));
            } else if (resultCode == IntentConstants.USER_CANCELED_3D_SECURE_VERIFICATION) {
                ToastMaker.displayShortToast(this, "User canceled 3-d scure verification!!");

                // Note that a payment process was attempted. You can extract the original returned values
                // Use the static keys declared in PayResponseKeys to extract the fields you want
                ToastMaker.displayShortToast(this, extras.getString(PayResponseKeys.PENDING));
            } else if (resultCode == IntentConstants.USER_CANCELED_3D_SECURE_VERIFICATION_PARSING_ISSUE) {
                ToastMaker.displayShortToast(this, "User canceled 3-d scure verification - Parsing Issue!!");

                // Note that a payment process was attempted.
                // User finished their payment successfully. An error occured while reading the returned JSON.
                ToastMaker.displayShortToast(this, extras.getString(IntentConstants.RAW_PAY_RESPONSE));
            }
        }
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Button1:
                startPayActivityNoToken(true);
                break;
           // case R.id.Button2:
             //   startPayActivityNoToken(false);
               // break;
            //case R.id.Button3:
              //  startPayActivityToken();
               // break;
        }
    }
}
