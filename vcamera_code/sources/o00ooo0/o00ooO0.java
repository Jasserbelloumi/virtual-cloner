package o00ooo0;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o0O000.o00oOoO;
/* loaded from: classes.dex */
public final class o00ooO0 {

    @o0OOooO0(16)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o00oOooO.o0O0O0Oo
        public static Cursor o00oOOo0(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, cancellationSignal);
        }
    }

    @o0OO00OO
    public static Cursor o00oOOo0(@oo0oO0 ContentResolver contentResolver, @oo0oO0 Uri uri, @o0OO00OO String[] strArr, @o0OO00OO String str, @o0OO00OO String[] strArr2, @o0OO00OO String str2, @o0OO00OO o00oOoO o00oooo2) {
        Object o00oOOoO2;
        if (o00oooo2 != null) {
            try {
                o00oOOoO2 = o00oooo2.o00oOOoO();
            } catch (Exception e) {
                if (e instanceof OperationCanceledException) {
                    throw new o0O000.o0O000();
                }
                throw e;
            }
        } else {
            o00oOOoO2 = null;
        }
        return o00oOOo0.o00oOOo0(contentResolver, uri, strArr, str, strArr2, str2, (CancellationSignal) o00oOOoO2);
    }
}
