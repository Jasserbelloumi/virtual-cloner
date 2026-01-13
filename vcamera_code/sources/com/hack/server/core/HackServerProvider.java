package com.hack.server.core;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import com.hack.agent.ProviderBase;
import com.hack.server.core.HackServerProvider;
import o0O0oooo.o0OO0oO;
import o0O0oooo.o0OO0oO0;
import o0OO000o.o00oo0;
/* loaded from: classes2.dex */
public class HackServerProvider extends ProviderBase {

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final String f6525o00oo0o = "HackServerProvider";

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final boolean f6526o00oo0o0 = false;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o00oOooO() {
        getContext().startService(new Intent(getContext(), ForgroundService.class));
    }

    @Override // com.hack.agent.BaseAgentFileProvider, android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // com.hack.agent.BaseAgentFileProvider, android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // com.hack.agent.BaseAgentFileProvider, android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // com.hack.agent.ProviderBase
    public int o00oOOoO() {
        return o0OO0oO.f12878o00oooO;
    }

    @Override // com.hack.agent.ProviderBase, com.hack.agent.BaseAgentFileProvider, android.content.ContentProvider
    public boolean onCreate() {
        o00oo0.o00oOo0O(new Runnable() { // from class: o0O.o00oOOo0
            @Override // java.lang.Runnable
            public final void run() {
                HackServerProvider.this.o00oOooO();
            }
        });
        return ((Boolean) o0OO0oO0.o00oOOo0().o00oOOoO(o0OO0oO.f12877o00ooo0o, getContext())).booleanValue();
    }

    @Override // com.hack.agent.BaseAgentFileProvider, android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // com.hack.agent.BaseAgentFileProvider, android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
