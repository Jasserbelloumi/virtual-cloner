package o00ooo0;

import android.content.UriMatcher;
import android.net.Uri;
import o00oOooO.oo0oO0;
import o0ooOoOO.oO00O0o0;
/* loaded from: classes.dex */
public class o0OO000 {
    @oo0oO0
    public static oO00O0o0<Uri> o00oOOoO(@oo0oO0 final UriMatcher uriMatcher) {
        return new oO00O0o0() { // from class: o00ooo0.o0O
            @Override // o0ooOoOO.oO00O0o0
            public final boolean test(Object obj) {
                return o0OO000.o00oOo00(uriMatcher, (Uri) obj);
            }
        };
    }

    public static /* synthetic */ boolean o00oOo00(UriMatcher uriMatcher, Uri uri) {
        return uriMatcher.match(uri) != -1;
    }
}
