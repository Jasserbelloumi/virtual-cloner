package com.hack.agent;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import o0O0oooo.o0OO0oO0;
/* loaded from: classes2.dex */
public class HackJobService extends Service {

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final String f6514o00oo0O0 = "HackJobService";

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return (IBinder) o0OO0oO0.o00oOOo0().o00oOOoO(92, intent);
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        return ((Boolean) o0OO0oO0.o00oOOo0().o00oOOoO(93, intent)).booleanValue();
    }
}
