package com.tdeado.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.duapp.aesjni.AESEncrypt;
import com.nice.main.helpers.utils.NiceSignUtils;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "getWxAppKey: " + AESEncrypt.getWxAppKey());
        Log.d(TAG, "getWxAppKey: " + AESEncrypt.getWxAppId(this));
        Log.d(TAG, "NiceSignUtils: " + NiceSignUtils.test("1".getBytes(), "2".getBytes(), "33".getBytes()));
        Log.d(TAG, "NiceSignUtils: ");
        String[] sts = NiceSignUtils.test2("{\"id\":\"218476\"}", "{\"id\":\"218476\"}".getBytes(), "dfd118527b65aa19294070d7739bab05".getBytes(), "hi1tkadhkjslivk5".getBytes());
        for (String st : sts) {

            Log.d(TAG, "st: " + st);
        }
    }

    public void click(View view) {

        String key = AESEncrypt.encode(this, "code1111countryCode86loginTokenplatformandroidsourcePagetimestamp1566137545608typecodeuserName18152733661uuidf239ec0993ccaca2v4.10.0");
        Log.d(TAG, "onCreate: " + key);
        Log.d(TAG, "getWxAppKey: " + AESEncrypt.getWxAppId(this));
        Log.d(TAG, "getWxAppKey: " + AESEncrypt.getWxAppKey());
        Log.d(TAG, "getLeanCloudAppID: " + AESEncrypt.getLeanCloudAppID());
    }
}
