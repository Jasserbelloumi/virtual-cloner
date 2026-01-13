package o0O00OO;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import java.io.File;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public abstract class o00oOOo0 {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f10902o00oOOoO = "DocumentFile";
    @o0OO00OO

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o00oOOo0 f10903o00oOOo0;

    public o00oOOo0(@o0OO00OO o00oOOo0 o00oooo02) {
        this.f10903o00oOOo0 = o00oooo02;
    }

    @oo0oO0
    public static o00oOOo0 o00oOoO(@oo0oO0 File file) {
        return new o00oOo00(null, file);
    }

    @o0OO00OO
    public static o00oOOo0 o00oOoOO(@oo0oO0 Context context, @oo0oO0 Uri uri) {
        return new o00oOo0O(null, context, uri);
    }

    @o0OO00OO
    public static o00oOOo0 o00oOoOo(@oo0oO0 Context context, @oo0oO0 Uri uri) {
        return new o00oOoO(null, context, DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)));
    }

    public static boolean o00oo0O0(@oo0oO0 Context context, @o0OO00OO Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri);
    }

    public abstract boolean o00oOOo0();

    public abstract boolean o00oOOoO();

    @o0OO00OO
    public abstract o00oOOo0 o00oOo00(@oo0oO0 String str);

    public abstract boolean o00oOo0O();

    public abstract boolean o00oOo0o();

    @o0OO00OO
    public o00oOOo0 o00oOoO0(@oo0oO0 String str) {
        o00oOOo0[] o00oo0oO2;
        for (o00oOOo0 o00oooo02 : o00oo0oO()) {
            if (str.equals(o00oooo02.o00oOoo0())) {
                return o00oooo02;
            }
        }
        return null;
    }

    @o0OO00OO
    public abstract String o00oOoo0();

    @o0OO00OO
    public abstract o00oOOo0 o00oOooO(@oo0oO0 String str, @oo0oO0 String str2);

    @o0OO00OO
    public o00oOOo0 o00oOooo() {
        return this.f10903o00oOOo0;
    }

    @oo0oO0
    public abstract Uri o00oo0();

    @o0OO00OO
    public abstract String o00oo00O();

    public abstract boolean o00oo0O();

    public abstract boolean o00oo0OO();

    public abstract boolean o00oo0Oo();

    public abstract long o00oo0o();

    public abstract long o00oo0o0();

    @oo0oO0
    public abstract o00oOOo0[] o00oo0oO();

    public abstract boolean o0O0o(@oo0oO0 String str);
}
