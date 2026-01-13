package o0OO00o;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.support.v4.media.o00oOo0O;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class o00oOOo0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public String f13002o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public Uri f13003o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public String f13004o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public Map<String, String> f13005o00oOo0O;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public AssetFileDescriptor f13006o00oOooO;

    public o00oOOo0() {
    }

    public o00oOOo0(Uri uri) {
        this.f13003o00oOOoO = uri;
    }

    public o00oOOo0(Uri uri, Map<String, String> map) {
        this.f13003o00oOOoO = uri;
        this.f13005o00oOo0O = map;
    }

    public o00oOOo0(String str) {
        this.f13002o00oOOo0 = str;
    }

    public static Uri o00oOo00(String str) {
        return Uri.parse("file:///android_asset/" + str);
    }

    public static AssetFileDescriptor o00oOo0o(Context context, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return context.getAssets().openFd(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String o00oOo0O() {
        return this.f13004o00oOo00;
    }

    public String o00oOoO() {
        return this.f13002o00oOOo0;
    }

    public Map<String, String> o00oOoO0() {
        if (this.f13005o00oOo0O == null) {
            synchronized (o00oOOo0.class) {
                if (this.f13005o00oOo0O == null) {
                    this.f13005o00oOo0O = new HashMap();
                }
            }
        }
        return this.f13005o00oOo0O;
    }

    public Uri o00oOoOO() {
        return this.f13003o00oOOoO;
    }

    public void o00oOoOo(String str) {
        this.f13004o00oOo00 = str;
    }

    public void o00oOoo0(Map<String, String> map) {
        this.f13005o00oOo0O = map;
    }

    public AssetFileDescriptor o00oOooO(Context context) {
        String str = this.f13004o00oOo00;
        if (str != null) {
            if (this.f13006o00oOooO == null) {
                this.f13006o00oOooO = o00oOo0o(context, str);
            }
            return this.f13006o00oOooO;
        }
        return null;
    }

    public void o00oOooo(String str) {
        this.f13002o00oOOo0 = str;
        this.f13006o00oOooO = null;
    }

    public void o00oo00O(Uri uri) {
        this.f13003o00oOOoO = uri;
        this.f13006o00oOooO = null;
    }

    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("DataSource{path='");
        o00oOOo02.append(this.f13002o00oOOo0);
        o00oOOo02.append('\'');
        o00oOOo02.append(", uri=");
        o00oOOo02.append(this.f13003o00oOOoO);
        o00oOOo02.append(", assetFilePath='");
        o00oOOo02.append(this.f13004o00oOo00);
        o00oOOo02.append('\'');
        o00oOOo02.append(", headers=");
        o00oOOo02.append(this.f13005o00oOo0O);
        o00oOOo02.append('}');
        return o00oOOo02.toString();
    }
}
