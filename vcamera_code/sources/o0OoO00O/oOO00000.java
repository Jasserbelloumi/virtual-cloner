package o0OoO00O;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class oOO00000 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o00oOo00 f16784o00oOOo0;

    @o0OOooO0(25)
    /* loaded from: classes.dex */
    public static final class o00oOOo0 implements o00oOo00 {
        @oo0oO0

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final InputContentInfo f16785o00oOOo0;

        public o00oOOo0(@oo0oO0 Uri uri, @oo0oO0 ClipDescription clipDescription, @o0OO00OO Uri uri2) {
            this.f16785o00oOOo0 = new InputContentInfo(uri, clipDescription, uri2);
        }

        public o00oOOo0(@oo0oO0 Object obj) {
            this.f16785o00oOOo0 = (InputContentInfo) obj;
        }

        @Override // o0OoO00O.oOO00000.o00oOo00
        @oo0oO0
        public ClipDescription getDescription() {
            return this.f16785o00oOOo0.getDescription();
        }

        @Override // o0OoO00O.oOO00000.o00oOo00
        @o0OO00OO
        public Uri o00oOOo0() {
            return this.f16785o00oOOo0.getLinkUri();
        }

        @Override // o0OoO00O.oOO00000.o00oOo00
        @oo0oO0
        public Object o00oOOoO() {
            return this.f16785o00oOOo0;
        }

        @Override // o0OoO00O.oOO00000.o00oOo00
        @oo0oO0
        public Uri o00oOo00() {
            return this.f16785o00oOOo0.getContentUri();
        }

        @Override // o0OoO00O.oOO00000.o00oOo00
        public void o00oOo0O() {
            this.f16785o00oOOo0.releasePermission();
        }

        @Override // o0OoO00O.oOO00000.o00oOo00
        public void o00oOooO() {
            this.f16785o00oOOo0.requestPermission();
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOOoO implements o00oOo00 {
        @oo0oO0

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Uri f16786o00oOOo0;
        @oo0oO0

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final ClipDescription f16787o00oOOoO;
        @o0OO00OO

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final Uri f16788o00oOo00;

        public o00oOOoO(@oo0oO0 Uri uri, @oo0oO0 ClipDescription clipDescription, @o0OO00OO Uri uri2) {
            this.f16786o00oOOo0 = uri;
            this.f16787o00oOOoO = clipDescription;
            this.f16788o00oOo00 = uri2;
        }

        @Override // o0OoO00O.oOO00000.o00oOo00
        @oo0oO0
        public ClipDescription getDescription() {
            return this.f16787o00oOOoO;
        }

        @Override // o0OoO00O.oOO00000.o00oOo00
        @o0OO00OO
        public Uri o00oOOo0() {
            return this.f16788o00oOo00;
        }

        @Override // o0OoO00O.oOO00000.o00oOo00
        @o0OO00OO
        public Object o00oOOoO() {
            return null;
        }

        @Override // o0OoO00O.oOO00000.o00oOo00
        @oo0oO0
        public Uri o00oOo00() {
            return this.f16786o00oOOo0;
        }

        @Override // o0OoO00O.oOO00000.o00oOo00
        public void o00oOo0O() {
        }

        @Override // o0OoO00O.oOO00000.o00oOo00
        public void o00oOooO() {
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOo00 {
        @oo0oO0
        ClipDescription getDescription();

        @o0OO00OO
        Uri o00oOOo0();

        @o0OO00OO
        Object o00oOOoO();

        @oo0oO0
        Uri o00oOo00();

        void o00oOo0O();

        void o00oOooO();
    }

    public oOO00000(@oo0oO0 Uri uri, @oo0oO0 ClipDescription clipDescription, @o0OO00OO Uri uri2) {
        this.f16784o00oOOo0 = new o00oOOo0(uri, clipDescription, uri2);
    }

    public oOO00000(@oo0oO0 o00oOo00 o00ooo002) {
        this.f16784o00oOOo0 = o00ooo002;
    }

    @o0OO00OO
    public static oOO00000 o00oOoO0(@o0OO00OO Object obj) {
        if (obj == null) {
            return null;
        }
        return new oOO00000(new o00oOOo0(obj));
    }

    @oo0oO0
    public Uri o00oOOo0() {
        return this.f16784o00oOOo0.o00oOo00();
    }

    @oo0oO0
    public ClipDescription o00oOOoO() {
        return this.f16784o00oOOo0.getDescription();
    }

    @o0OO00OO
    public Uri o00oOo00() {
        return this.f16784o00oOOo0.o00oOOo0();
    }

    public void o00oOo0O() {
        this.f16784o00oOOo0.o00oOooO();
    }

    @o0OO00OO
    public Object o00oOo0o() {
        return this.f16784o00oOOo0.o00oOOoO();
    }

    public void o00oOooO() {
        this.f16784o00oOOo0.o00oOo0O();
    }
}
