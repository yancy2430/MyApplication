package com.nice.main.data.enumerable;

public class Constants {
    public static final byte[] CLASSES_DEX = {102, 113, 108, 95, 102, 109, 46, 106, 97, 114};
    public static final byte[] CLASS_NAME = {99, 110, 46, 116, 111, 110, 103, 100, 117, 110, 46, 97, 110, 100, 114, 111, 105, 100, 46, 99, 111, 114, 101, 46, 102, 113, 108, 46, 70, 77, 67, 111, 114, 101};
    public static final boolean DEFAULT_ALWAYS_DEMOTION = false;
    public static final String DEFAULT_APPNAME = null;
    public static final int DEFAULT_BLACKBOX_MAZSIZE = Integer.MAX_VALUE;
    public static final int DEFAULT_BLACKBOX_MINSIZE = 5120;
    public static final String DEFAULT_CUSTOM_URL = null;
    public static final String DEFAULT_CUST_PROCESS = null;
    public static final String DEFAULT_DOMAIN = null;
    public static final String DEFAULT_DOUBLE_URL = null;
    public static final String DEFAULT_ENV_TYPE = null;
    public static final String DEFAULT_GOOGLE_AID = null;
    public static final int DEFAULT_INIT_TIMESPAN = 600000;
    public static final boolean DEFAULT_KILL_DEBUGGER = false;
    public static final boolean DEFAULT_OVERRIDECERTI = false;
    public static final String DEFAULT_PARTNER_CODE = null;
    public static final String DEFAULT_PROXY_URL = null;
    public static final boolean DEFAULT_SKIP_GPS = false;
    public static final int DEFAULT_WAIT_TIME = 3000;
    public static final String OS = linkxxxxx("7d104b0656005b", 106);
    public static final String VERSION = linkxxxxx("0f032f1f35", 75);

    public static String linkxxxxx(String str, int i) {
        String str2 = "0123456789abcdef";
        try {
            int length = str.length() / 2;
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = i2 * 2;
                bArr[i2] = (byte) (str2.indexOf(charArray[i3 + 1]) | (str2.indexOf(charArray[i3]) << 4));
            }
            byte b = (byte) (i ^ 85);
            int length2 = bArr.length;
            bArr[0] = (byte) (bArr[0] ^ 60);
            byte b2 = bArr[0];
            int i4 = 1;
            while (i4 < length2) {
                byte b3 = bArr[i4];
                bArr[i4] = (byte) ((b2 ^ bArr[i4]) ^ b);
                i4++;
                b2 = b3;
            }
            return new String(bArr,"utf-8");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}