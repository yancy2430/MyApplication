package com.nice.main.data.enumerable;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

public class User  implements Parcelable, Cloneable {
    public static final Creator<User> CREATOR = new Creator<User>() {
        /* renamed from: a */
        public User createFromParcel(Parcel parcel) {
            try {
                return new User();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        /* renamed from: a */
        public User[] newArray(int i) {
            return new User[i];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

    }


    public static String ach(String str) {
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        while (stringBuffer.length() < 16) {
            stringBuffer.append(Integer.toString(random.nextInt() & Constants.DEFAULT_BLACKBOX_MAZSIZE, 36));
        }
        return stringBuffer.substring(0, 16);
    }
}