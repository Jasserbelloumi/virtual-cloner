package com.skydoves.powerspinner;

import android.content.Context;
import android.content.SharedPreferences;
import o0OOOO0o.o00ooO0;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes2.dex */
public final class o00oOOoO {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o00oOOo0 f6610o00oOOo0 = new o00oOOo0(null);
    @Nullable

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static volatile o00oOOoO f6611o00oOOoO = null;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static SharedPreferences f6612o00oOo00 = null;
    @NotNull

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f6613o00oOooO = "INDEX";

    /* loaded from: classes2.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }

        @o00ooO0
        @NotNull
        public final o00oOOoO o00oOOo0(@NotNull Context context) {
            o0ooO.o00oo0O0(context, "context");
            o00oOOoO o00ooooo2 = o00oOOoO.f6611o00oOOoO;
            if (o00ooooo2 == null) {
                synchronized (this) {
                    o00ooooo2 = o00oOOoO.f6611o00oOOoO;
                    if (o00ooooo2 == null) {
                        o00ooooo2 = new o00oOOoO(null);
                        o00oOOo0 o00oooo02 = o00oOOoO.f6610o00oOOo0;
                        o00oOOoO.f6611o00oOOoO = o00ooooo2;
                        SharedPreferences sharedPreferences = context.getSharedPreferences("com.skydoves.powerspinenr", 0);
                        o0ooO.o00oo0OO(sharedPreferences, "context.getSharedPrefere…r\", Context.MODE_PRIVATE)");
                        o00oOOoO.f6612o00oOo00 = sharedPreferences;
                    }
                }
            }
            return o00ooooo2;
        }
    }

    public o00oOOoO() {
    }

    public o00oOOoO(o0O00 o0o00) {
    }

    @o00ooO0
    @NotNull
    public static final o00oOOoO o00oOo0O(@NotNull Context context) {
        return f6610o00oOOo0.o00oOOo0(context);
    }

    public final int o00oOo0o(@NotNull String str) {
        o0ooO.o00oo0O0(str, "name");
        SharedPreferences sharedPreferences = f6612o00oOo00;
        if (sharedPreferences == null) {
            o0ooO.o00ooooO("sharedPreferenceManager");
            sharedPreferences = null;
        }
        return sharedPreferences.getInt(f6613o00oOooO + str, -1);
    }

    public final void o00oOoO(@NotNull String str) {
        o0ooO.o00oo0O0(str, "name");
        SharedPreferences sharedPreferences = f6612o00oOo00;
        if (sharedPreferences == null) {
            o0ooO.o00ooooO("sharedPreferenceManager");
            sharedPreferences = null;
        }
        sharedPreferences.edit().remove(str).apply();
    }

    public final void o00oOoO0(@NotNull String str, int i) {
        o0ooO.o00oo0O0(str, "name");
        SharedPreferences sharedPreferences = f6612o00oOo00;
        if (sharedPreferences == null) {
            o0ooO.o00ooooO("sharedPreferenceManager");
            sharedPreferences = null;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt(f6613o00oOooO + str, i).apply();
    }

    public final void o00oOooO() {
        SharedPreferences sharedPreferences = f6612o00oOo00;
        if (sharedPreferences == null) {
            o0ooO.o00ooooO("sharedPreferenceManager");
            sharedPreferences = null;
        }
        sharedPreferences.edit().clear().apply();
    }
}
