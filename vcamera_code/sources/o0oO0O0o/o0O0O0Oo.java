package o0oO0O0o;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import o00oOooO.o0O;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0ooOoOO.oO0000Oo;
/* loaded from: classes.dex */
public class o0O0O0Oo<D> {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public int f16896o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public o00oOo00<D> f16897o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public o00oOOoO<D> f16898o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public Context f16904o00oOooO;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public boolean f16899o00oOo0O = false;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public boolean f16900o00oOo0o = false;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public boolean f16902o00oOoO0 = true;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public boolean f16901o00oOoO = false;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public boolean f16903o00oOoOO = false;

    /* loaded from: classes.dex */
    public final class o00oOOo0 extends ContentObserver {
        public o00oOOo0() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            o0O0O0Oo.this.o00oo0O0();
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOOoO<D> {
        void o00oOOo0(@oo0oO0 o0O0O0Oo<D> o0o0o0oo);
    }

    /* loaded from: classes.dex */
    public interface o00oOo00<D> {
        void o00oOOo0(@oo0oO0 o0O0O0Oo<D> o0o0o0oo, @o0OO00OO D d);
    }

    public o0O0O0Oo(@oo0oO0 Context context) {
        this.f16904o00oOooO = context.getApplicationContext();
    }

    @o0O
    public void o00oOOo0() {
        this.f16900o00oOo0o = true;
        o00oo0();
    }

    @o0O
    public boolean o00oOOoO() {
        return o00oo0OO();
    }

    public void o00oOo00() {
        this.f16903o00oOoOO = false;
    }

    @o0O
    public void o00oOo0O() {
        o00oOOoO<D> o00ooooo2 = this.f16898o00oOo00;
        if (o00ooooo2 != null) {
            o00ooooo2.o00oOOo0(this);
        }
    }

    @o0O
    public void o00oOo0o(@o0OO00OO D d) {
        o00oOo00<D> o00ooo002 = this.f16897o00oOOoO;
        if (o00ooo002 != null) {
            o00ooo002.o00oOOo0(this, d);
        }
    }

    @o0O
    public void o00oOoO() {
        o00oo0O();
    }

    @Deprecated
    public void o00oOoO0(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f16896o00oOOo0);
        printWriter.print(" mListener=");
        printWriter.println(this.f16897o00oOOoO);
        if (this.f16899o00oOo0O || this.f16901o00oOoO || this.f16903o00oOoOO) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f16899o00oOo0O);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f16901o00oOoO);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f16903o00oOoOO);
        }
        if (this.f16900o00oOo0o || this.f16902o00oOoO0) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f16900o00oOo0o);
            printWriter.print(" mReset=");
            printWriter.println(this.f16902o00oOoO0);
        }
    }

    @oo0oO0
    public Context o00oOoOO() {
        return this.f16904o00oOooO;
    }

    public int o00oOoOo() {
        return this.f16896o00oOOo0;
    }

    public boolean o00oOoo0() {
        return this.f16900o00oOo0o;
    }

    @oo0oO0
    public String o00oOooO(@o0OO00OO D d) {
        StringBuilder sb = new StringBuilder(64);
        oO0000Oo.o00oOOo0(d, sb);
        sb.append("}");
        return sb.toString();
    }

    public boolean o00oOooo() {
        return this.f16902o00oOoO0;
    }

    @o0O
    public void o00oo() {
        o00oo0Oo();
        this.f16902o00oOoO0 = true;
        this.f16899o00oOo0O = false;
        this.f16900o00oOo0o = false;
        this.f16901o00oOoO = false;
        this.f16903o00oOoOO = false;
    }

    @o0O
    public void o00oo0() {
    }

    public boolean o00oo00O() {
        return this.f16899o00oOo0O;
    }

    @o0O
    public void o00oo0O() {
    }

    @o0O
    public void o00oo0O0() {
        if (this.f16899o00oOo0O) {
            o00oOoO();
        } else {
            this.f16901o00oOoO = true;
        }
    }

    @o0O
    public boolean o00oo0OO() {
        return false;
    }

    @o0O
    public void o00oo0Oo() {
    }

    @o0O
    public void o00oo0o() {
    }

    @o0O
    public void o00oo0o0() {
    }

    @o0O
    public void o00oo0oO(int i, @oo0oO0 o00oOo00<D> o00ooo002) {
        if (this.f16897o00oOOoO != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f16897o00oOOoO = o00ooo002;
        this.f16896o00oOOo0 = i;
    }

    @o0O
    public void o00ooO(@oo0oO0 o00oOo00<D> o00ooo002) {
        o00oOo00<D> o00ooo003 = this.f16897o00oOOoO;
        if (o00ooo003 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (o00ooo003 != o00ooo002) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f16897o00oOOoO = null;
    }

    @o0O
    public final void o00ooO0() {
        this.f16899o00oOo0O = true;
        this.f16902o00oOoO0 = false;
        this.f16900o00oOo0o = false;
        o00oo0o0();
    }

    public void o00ooO00() {
        if (this.f16903o00oOoOO) {
            o00oo0O0();
        }
    }

    @o0O
    public void o00ooO0O() {
        this.f16899o00oOo0O = false;
        o00oo0o();
    }

    public boolean o00ooO0o() {
        boolean z = this.f16901o00oOoO;
        this.f16901o00oOoO = false;
        this.f16903o00oOoOO |= z;
        return z;
    }

    @o0O
    public void o00ooOO0(@oo0oO0 o00oOOoO<D> o00ooooo2) {
        o00oOOoO<D> o00ooooo3 = this.f16898o00oOo00;
        if (o00ooooo3 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (o00ooooo3 != o00ooooo2) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f16898o00oOo00 = null;
    }

    @o0O
    public void o0O0o(@oo0oO0 o00oOOoO<D> o00ooooo2) {
        if (this.f16898o00oOo00 != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f16898o00oOo00 = o00ooooo2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        oO0000Oo.o00oOOo0(this, sb);
        sb.append(" id=");
        return android.support.v4.media.o00oOo00.o00oOOo0(sb, this.f16896o00oOOo0, "}");
    }
}
