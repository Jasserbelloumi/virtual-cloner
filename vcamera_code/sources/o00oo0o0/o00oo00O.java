package o00oo0o0;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o00oo00O {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f7555o00oOo0O = "androidx.browser.trusted.sharing.KEY_TEXT";

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final String f7556o00oOo0o = "androidx.browser.trusted.sharing.KEY_URIS";

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f7557o00oOooO = "androidx.browser.trusted.sharing.KEY_TITLE";
    @o0OO00OO

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final String f7558o00oOOo0;
    @o0OO00OO

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final String f7559o00oOOoO;
    @o0OO00OO

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final List<Uri> f7560o00oOo00;

    public o00oo00O(@o0OO00OO String str, @o0OO00OO String str2, @o0OO00OO List<Uri> list) {
        this.f7558o00oOOo0 = str;
        this.f7559o00oOOoO = str2;
        this.f7560o00oOo00 = list;
    }

    @oo0oO0
    public static o00oo00O o00oOOo0(@oo0oO0 Bundle bundle) {
        return new o00oo00O(bundle.getString("androidx.browser.trusted.sharing.KEY_TITLE"), bundle.getString("androidx.browser.trusted.sharing.KEY_TEXT"), bundle.getParcelableArrayList(f7556o00oOo0o));
    }

    @oo0oO0
    public Bundle o00oOOoO() {
        Bundle bundle = new Bundle();
        bundle.putString("androidx.browser.trusted.sharing.KEY_TITLE", this.f7558o00oOOo0);
        bundle.putString("androidx.browser.trusted.sharing.KEY_TEXT", this.f7559o00oOOoO);
        if (this.f7560o00oOo00 != null) {
            bundle.putParcelableArrayList(f7556o00oOo0o, new ArrayList<>(this.f7560o00oOo00));
        }
        return bundle;
    }
}
