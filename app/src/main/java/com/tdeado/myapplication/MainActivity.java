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
    ServerManager serverManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        serverManager = new ServerManager(this);
        serverManager.startServer();
        String[] sts = NiceSignUtils.encode("https://115.182.19.34/Product/detail?token=gDcklty79BTYgsDAglhmPxR7qhRJ2_2Q&did=dfd118527b65aa19294070d7739bab05&osn=android&osv=6.0.1&appv=5.4.7", "{\"id\":\"196979\"}".getBytes(), "dfd118527b65aa19294070d7739bab05".getBytes(), "a9x627235cv6foto".getBytes());
        for (String st : sts) {
            Log.d(TAG, "st: " + st);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        serverManager.stopServer();

    }

    public void click(View view) {

    }
}
