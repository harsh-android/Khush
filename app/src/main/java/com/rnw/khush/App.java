package com.rnw.khush;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

public class App extends Application {

    private static final String TAG = "App";

    @Override
    public void onCreate() {
        super.onCreate();

        Toast.makeText(this, "Application", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "onCreate: ================ Application");

    }
}
