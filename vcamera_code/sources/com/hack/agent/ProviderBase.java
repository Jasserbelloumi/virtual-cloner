package com.hack.agent;

import android.app.Application;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.os.Bundle;
import o0O0oooo.o0OO0oO0;
import o0O0oooo.o0OOO00;
import o0OO000.o00oOo0O;
/* loaded from: classes2.dex */
public abstract class ProviderBase extends AppAgentFileProvider {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final boolean f6518o00oo0O = false;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final String f6519o00oo0Oo = "ProviderBase";

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(o00oOo0O.f12950o00oo0O);
        o0OOO00.f12921o00oOo00 = providerInfo;
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public Bundle call(String str, String str2, Bundle bundle) {
        return (Bundle) o0OO0oO0.o00oOOo0().o00oOOoO(o00oOOoO(), str, str2, bundle);
    }

    public abstract int o00oOOoO();

    @Override // com.hack.agent.BaseAgentFileProvider, android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }
}
