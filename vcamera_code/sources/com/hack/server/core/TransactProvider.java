package com.hack.server.core;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import o0O0oooo.o0OO;
import o0O0oooo.o0OO0oO;
/* loaded from: classes2.dex */
public class TransactProvider extends ContentProvider {

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final String f6527o00oo0O0 = "TransactProvider";

    @Override // android.content.ContentProvider
    public Bundle call(String str, String str2, Bundle bundle) {
        if (TextUtils.equals(str, o0OO0oO.f12910o0OoOoOO)) {
            bundle.setClassLoader(TransactProvider.class.getClassLoader());
            int i = bundle.getInt(o0OO0oO.f12893o0O000o0);
            if (i == 3) {
                getContext().getContentResolver().acquireUnstableContentProviderClient((Uri) bundle.getParcelable(o0OO0oO.f12898o0O00OO));
                return null;
            }
            return o0OO.o00oo0().o00oOOo0(getContext(), i, bundle);
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
