package com.duapp.aesjni;

import android.util.Log;

public class AESEncrypt {
    public static native int checkSignature(Object obj);

    public static native String decode(Object obj, String str);

    public static native String encode(Object obj, String str);

    public static native String getLeanCloudAppID();

    public static native String getLeanCloudAppKey();

    public static native String getWxAppId(Object obj);

    public static native String getWxAppKey();

    static {
        try {
            System.loadLibrary("JNIEncrypt");
        } catch (UnsatisfiedLinkError e) {
            e.fillInStackTrace();
            Log.e("JNI", "loadJNI fail " + e.getMessage());
        }
    }
}