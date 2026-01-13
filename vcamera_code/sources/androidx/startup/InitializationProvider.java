package androidx.startup;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0OooO0.o0O0OOO;
/* loaded from: classes.dex */
public class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(@oo0oO0 Uri uri, @o0OO00OO String str, @o0OO00OO String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    @o0OO00OO
    public final String getType(@oo0oO0 Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    @o0OO00OO
    public final Uri insert(@oo0oO0 Uri uri, @o0OO00OO ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            if (context.getApplicationContext() != null) {
                o00oOOo0.o00oOo0O(context).o00oOOo0();
                return true;
            }
            return true;
        }
        throw new o0O0OOO("Context cannot be null");
    }

    @Override // android.content.ContentProvider
    @o0OO00OO
    public final Cursor query(@oo0oO0 Uri uri, @o0OO00OO String[] strArr, @o0OO00OO String str, @o0OO00OO String[] strArr2, @o0OO00OO String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(@oo0oO0 Uri uri, @o0OO00OO ContentValues contentValues, @o0OO00OO String str, @o0OO00OO String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
