package o0O0O0Oo;

import android.media.VolumeProvider;
import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
/* loaded from: classes.dex */
public abstract class o00oOo0O {

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f11225o00oOoO = 1;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int f11226o00oOoO0 = 0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final int f11227o00oOoOO = 2;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final int f11228o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final int f11229o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final String f11230o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public AbstractC0147o00oOo0O f11231o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public VolumeProvider f11232o00oOo0o;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f11233o00oOooO;

    /* loaded from: classes.dex */
    public class o00oOOo0 extends VolumeProvider {
        public o00oOOo0(int i, int i2, int i3, String str) {
            super(i, i2, i3, str);
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i) {
            o00oOo0O.this.o00oOo0o(i);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i) {
            o00oOo0O.this.o00oOoO0(i);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO extends VolumeProvider {
        public o00oOOoO(int i, int i2, int i3) {
            super(i, i2, i3);
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i) {
            o00oOo0O.this.o00oOo0o(i);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i) {
            o00oOo0O.this.o00oOoO0(i);
        }
    }

    @o0OOooO0(21)
    /* loaded from: classes.dex */
    public static class o00oOo00 {
        @o0O0O0Oo
        public static void o00oOOo0(VolumeProvider volumeProvider, int i) {
            volumeProvider.setCurrentVolume(i);
        }
    }

    /* renamed from: o0O0O0Oo.o00oOo0O$o00oOo0O  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0147o00oOo0O {
        public abstract void onVolumeChanged(o00oOo0O o00ooo0o2);
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface o00oOoO {
    }

    public o00oOo0O(int i, int i2, int i3) {
        this(i, i2, i3, null);
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public o00oOo0O(int i, int i2, int i3, @o0OO00OO String str) {
        this.f11228o00oOOo0 = i;
        this.f11229o00oOOoO = i2;
        this.f11233o00oOooO = i3;
        this.f11230o00oOo00 = str;
    }

    public final int o00oOOo0() {
        return this.f11233o00oOooO;
    }

    public final int o00oOOoO() {
        return this.f11229o00oOOoO;
    }

    public final int o00oOo00() {
        return this.f11228o00oOOo0;
    }

    public Object o00oOo0O() {
        if (this.f11232o00oOo0o == null) {
            this.f11232o00oOo0o = Build.VERSION.SDK_INT >= 30 ? new o00oOOo0(this.f11228o00oOOo0, this.f11229o00oOOoO, this.f11233o00oOooO, this.f11230o00oOo00) : new o00oOOoO(this.f11228o00oOOo0, this.f11229o00oOOoO, this.f11233o00oOooO);
        }
        return this.f11232o00oOo0o;
    }

    public void o00oOo0o(int i) {
    }

    public void o00oOoO(AbstractC0147o00oOo0O abstractC0147o00oOo0O) {
        this.f11231o00oOo0O = abstractC0147o00oOo0O;
    }

    public void o00oOoO0(int i) {
    }

    public final void o00oOoOO(int i) {
        this.f11233o00oOooO = i;
        o00oOo00.o00oOOo0((VolumeProvider) o00oOo0O(), i);
        AbstractC0147o00oOo0O abstractC0147o00oOo0O = this.f11231o00oOo0O;
        if (abstractC0147o00oOo0O != null) {
            abstractC0147o00oOo0O.onVolumeChanged(this);
        }
    }

    @o0OO00OO
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public final String o00oOooO() {
        return this.f11230o00oOo00;
    }
}
