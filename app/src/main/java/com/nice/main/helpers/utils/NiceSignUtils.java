package com.nice.main.helpers.utils;

import android.util.Log;

public class NiceSignUtils {
    private static native String getSignCode(byte[] bArr, byte[] bArr2, byte[] bArr3);

    private static native String[] getSignRequest(String str, byte[] bArr, byte[] bArr2, byte[] bArr3);

    public static String test(byte[] bArr, byte[] bArr2, byte[] bArr3){

        return getSignCode(bArr,bArr2,bArr3);
    }

    public static String[] test2(String str,byte[] bArr, byte[] bArr2, byte[] bArr3){

        return getSignRequest(str,bArr,bArr2,bArr3);
    }
    static {
        try {
            System.loadLibrary("salt");
        } catch (UnsatisfiedLinkError e) {
            e.fillInStackTrace();
            Log.e("JNI", "loadJNI fail " + e.getMessage());
        }
    }
}
