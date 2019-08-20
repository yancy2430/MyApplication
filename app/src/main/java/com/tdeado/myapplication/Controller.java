package com.tdeado.myapplication;


import android.util.Base64;
import android.util.Log;

import com.duapp.aesjni.AESEncrypt;
import com.nice.main.helpers.utils.NiceSignUtils;
import com.yanzhenjie.andserver.annotation.PostMapping;
import com.yanzhenjie.andserver.annotation.RequestMapping;
import com.yanzhenjie.andserver.annotation.RequestParam;
import com.yanzhenjie.andserver.annotation.RestController;



@RestController
@RequestMapping("/encrypt")
public class Controller {
    private static final String TAG = "Controller";
    @RequestMapping("/du")
    public String du(@RequestParam("str") String str) {
        String key = AESEncrypt.encode(this, str);
        return key;
    }
    @PostMapping("/nice")
    public String nice(@RequestParam("str1") String str1,@RequestParam("str2") String str2,@RequestParam("str3") String str3,@RequestParam("str4") String str4) {
        String[] sts = NiceSignUtils.encode(str1, str2.getBytes(),str3.getBytes(), str4.getBytes());
        return sts[2].replace(str1,str2);
    }
}