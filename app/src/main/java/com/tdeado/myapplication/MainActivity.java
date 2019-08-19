package com.tdeado.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.duapp.aesjni.AESEncrypt;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "getWxAppKey: "+AESEncrypt.getWxAppKey());
        Log.d(TAG, "getWxAppKey: "+AESEncrypt.getWxAppId(this));


//        Log.d(TAG, "getKey: "+AESEncrypt.getKey(this));
    }

    public void click(View view) {

        String key = AESEncrypt.encode(this,"code1111countryCode86loginTokenplatformandroidsourcePagetimestamp1566137545608typecodeuserName18152733661uuidf239ec0993ccaca2v4.10.0");
        Log.d(TAG, "onCreate: "+key);
        Log.d(TAG, "getWxAppKey: "+AESEncrypt.getWxAppId(this));
        Log.d(TAG, "getWxAppKey: "+AESEncrypt.getWxAppKey());
        Log.d(TAG, "getLeanCloudAppID: "+AESEncrypt.getLeanCloudAppID());
    }
}
