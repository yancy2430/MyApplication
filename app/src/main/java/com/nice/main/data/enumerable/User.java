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
    public boolean A = false;
    public int B;
    public String C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public boolean M;
    public String N;
    public String O;
    public String R;
    public boolean T;
    public long U;
    public boolean V = false;
    public boolean W;
    public String X;
    public String Y;
    public String aA;
    public boolean aB;
    public String ac;
    public String ad;
    public String ae;
    public boolean ag = false;
    public boolean ah;
    public boolean aj;
    public boolean ak;
    public boolean al;
    public boolean am;
    public String an;
    public String ao;
    public String ap;
    public int aq;
    public long ar;
    public int as;
    public long at;
    public String av;
    public int ax;
    public int ay;
    public int az;
    public long l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t = "";
    public String u;
    public boolean x = false;
    public boolean y = false;
    public boolean z = false;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("User{uid=");
        sb.append(this.l);
        sb.append(", avatar='");
        sb.append(this.n);
        sb.append('\'');
        sb.append(", name='");
        sb.append(this.m);
        sb.append('\'');
        sb.append(", description='");
        sb.append(this.s);
        sb.append('\'');
        sb.append(", gender='");
        sb.append(this.t);
        sb.append('\'');
        sb.append(", location='");
        sb.append(this.u);
        sb.append('\'');
        sb.append(", verified='");
        sb.append('\'');
        sb.append(", verifyInfo=");
        sb.append(", block='");
        sb.append(this.x);
        sb.append('\'');
        sb.append(", showsNum=");
        sb.append(this.G);
        sb.append(", zansNum=");
        sb.append(this.H);
        sb.append(", followersNum=");
        sb.append(this.I);
        sb.append(", tagNum=");
        sb.append(this.K);
        sb.append(", followsNum=");
        sb.append(this.J);
        sb.append(", brandShareNum=");
        sb.append(this.B);
        sb.append(", isXinjiangUser=");
        sb.append(this.aB);
        sb.append(", accountType=");
        sb.append('}');
        return sb.toString();
    }

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