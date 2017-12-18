package com.example.a32150.pushnotification;

import android.content.Intent;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by 32150 on 2017/12/18.
 */

public class MyInstanceIdService extends FirebaseInstanceIdService {
    public MyInstanceIdService() {

        super();
    }

    @Override
    public void handleIntent(Intent intent) {

        super.handleIntent(intent);
    }

    @Override
    public void onTokenRefresh() {
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d("Token", "Refreshed token: " + refreshedToken);

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
        //sendRegistrationToServer(refreshedToken);
    }




}
