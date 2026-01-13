package org.videolan.libvlc.interfaces;

import o00oOooO.o0OO00OO;
/* loaded from: classes3.dex */
public abstract class AbstractVLCEvent {
    public final long arg1;
    public final long arg2;
    public final float argf1;
    public final String args1;
    public final int type;

    /* loaded from: classes3.dex */
    public interface Listener<T extends AbstractVLCEvent> {
        void onEvent(T t);
    }

    public AbstractVLCEvent(int i) {
        this.type = i;
        this.arg2 = 0L;
        this.arg1 = 0L;
        this.argf1 = 0.0f;
        this.args1 = null;
    }

    public AbstractVLCEvent(int i, float f) {
        this.type = i;
        this.arg2 = 0L;
        this.arg1 = 0L;
        this.argf1 = f;
        this.args1 = null;
    }

    public AbstractVLCEvent(int i, long j) {
        this.type = i;
        this.arg1 = j;
        this.arg2 = 0L;
        this.argf1 = 0.0f;
        this.args1 = null;
    }

    public AbstractVLCEvent(int i, long j, long j2) {
        this.type = i;
        this.arg1 = j;
        this.arg2 = j2;
        this.argf1 = 0.0f;
        this.args1 = null;
    }

    public AbstractVLCEvent(int i, long j, @o0OO00OO String str) {
        this.type = i;
        this.arg1 = j;
        this.arg2 = 0L;
        this.argf1 = 0.0f;
        this.args1 = str;
    }

    public void release() {
    }
}
