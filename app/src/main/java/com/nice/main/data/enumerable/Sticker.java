package com.nice.main.data.enumerable;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

import org.json.JSONException;
import org.json.JSONObject;

public class Sticker implements Parcelable, Serializable {
    public static final Creator<Sticker> CREATOR = new Creator<Sticker>() {
        /* renamed from: a */
        public Sticker createFromParcel(Parcel parcel) {
            try {
                return Sticker.a(new JSONObject(parcel.readString()));
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        /* renamed from: a */
        public Sticker[] newArray(int i) {
            return new Sticker[i];
        }
    };
    public long a;
    public String b;
    public String c;
    public String d;
    public boolean e = true;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String n;
    public int o;
    public Map<String, String> p;
    public boolean q;
    public long r;
    public String s;
    public String t;
    public boolean u;
    public boolean v;
    public boolean x;
    public int y;

    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

    }

    public Sticker() {
        String str = "";
        this.f = str;
        this.i = str;
        this.x = false;
        this.y = -1;
    }

    public static Sticker a(JSONObject jSONObject) {
        Sticker sticker = new Sticker();
        try {
            return  sticker;
        } catch (Throwable th) {
            th.printStackTrace();
            return sticker;
        }
    }

    public static Sticker a(Sticker sticker, JSONObject jSONObject) {
        String str = "hot_show";
        String str2 = "new_show";
        try {
            String str3 = "";
            sticker.j = jSONObject.has(str2) ? jSONObject.getString(str2) : str3;
            if (jSONObject.has(str)) {
                str3 = jSONObject.getString(str);
            }
            sticker.k = str3;
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return sticker;
    }

    public static Sticker b(Sticker sticker, JSONObject jSONObject) {
        String str = "sign_status";
        String str2 = "show_pub_icon";
        String str3 = "is_sign";
        try {
            String str4 = "";
            sticker.s = jSONObject.has(str3) ? jSONObject.getString(str3) : str4;
            if (jSONObject.has(str)) {
                str4 = jSONObject.getString(str);
            }
            sticker.t = str4;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return sticker;
    }

    public static Sticker c(Sticker sticker, JSONObject jSONObject) {
        return sticker;
    }


    public static String ach(String str, String str2, String str3, String str4) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(str2);
        stringBuilder.append(":");
        stringBuilder.append(str3);
        stringBuilder.append("/");
        stringBuilder.append(str4);
        return stringBuilder.toString();
    }





    public boolean equals(Object obj) {
        boolean z2 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Sticker)) {
            return false;
        }
        if (((Sticker) obj).a != this.a) {
            z2 = false;
        }
        return z2;
    }

    public int hashCode() {
        return (int) this.a;
    }
}