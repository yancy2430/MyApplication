package com.tdeado.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.duapp.aesjni.AESEncrypt;
import com.nice.main.helpers.utils.NiceSignUtils;
import com.yanzhenjie.andserver.annotation.GetMapping;
import com.yanzhenjie.andserver.annotation.PostMapping;
import com.yanzhenjie.andserver.annotation.RequestMapping;
import com.yanzhenjie.andserver.annotation.RequestParam;
import com.yanzhenjie.andserver.annotation.RestController;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    ServerManager serverManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        serverManager = new ServerManager(this);
        serverManager.startServer();
        Button button = findViewById(R.id.ip);
        button.setText(NetWorkUtil.getHostIp()+":9999");

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        serverManager.stopServer();

    }

    public void click(View view) {

    }
}
