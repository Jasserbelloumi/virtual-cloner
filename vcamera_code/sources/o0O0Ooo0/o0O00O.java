package o0O0Ooo0;

import android.annotation.SuppressLint;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import o00oOooO.oo0oO0;
import o0O0Ooo0.o0OoO00O;
/* loaded from: classes.dex */
public final class o0O00O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final List<UUID> f12177o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final List<String> f12178o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final List<String> f12179o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final List<o0OoO00O.o00oOOo0> f12180o00oOooO;

    /* loaded from: classes.dex */
    public static final class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public List<UUID> f12181o00oOOo0 = new ArrayList();

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public List<String> f12182o00oOOoO = new ArrayList();

        /* renamed from: o00oOo00  reason: collision with root package name */
        public List<String> f12183o00oOo00 = new ArrayList();

        /* renamed from: o00oOooO  reason: collision with root package name */
        public List<o0OoO00O.o00oOOo0> f12184o00oOooO = new ArrayList();

        @oo0oO0
        @SuppressLint({"BuilderSetStyle"})
        public static o00oOOo0 o00oOo0o(@oo0oO0 List<UUID> list) {
            o00oOOo0 o00oooo02 = new o00oOOo0();
            o00oooo02.o00oOOo0(list);
            return o00oooo02;
        }

        @oo0oO0
        @SuppressLint({"BuilderSetStyle"})
        public static o00oOOo0 o00oOoO(@oo0oO0 List<String> list) {
            o00oOOo0 o00oooo02 = new o00oOOo0();
            o00oooo02.o00oOo00(list);
            return o00oooo02;
        }

        @oo0oO0
        @SuppressLint({"BuilderSetStyle"})
        public static o00oOOo0 o00oOoO0(@oo0oO0 List<o0OoO00O.o00oOOo0> list) {
            o00oOOo0 o00oooo02 = new o00oOOo0();
            o00oooo02.o00oOOoO(list);
            return o00oooo02;
        }

        @oo0oO0
        @SuppressLint({"BuilderSetStyle"})
        public static o00oOOo0 o00oOoOO(@oo0oO0 List<String> list) {
            o00oOOo0 o00oooo02 = new o00oOOo0();
            o00oooo02.o00oOooO(list);
            return o00oooo02;
        }

        @oo0oO0
        public o00oOOo0 o00oOOo0(@oo0oO0 List<UUID> list) {
            this.f12181o00oOOo0.addAll(list);
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oOOoO(@oo0oO0 List<o0OoO00O.o00oOOo0> list) {
            this.f12184o00oOooO.addAll(list);
            return this;
        }

        @oo0oO0
        public o00oOOo0 o00oOo00(@oo0oO0 List<String> list) {
            this.f12183o00oOo00.addAll(list);
            return this;
        }

        @oo0oO0
        public o0O00O o00oOo0O() {
            if (this.f12181o00oOOo0.isEmpty() && this.f12182o00oOOoO.isEmpty() && this.f12183o00oOo00.isEmpty() && this.f12184o00oOooO.isEmpty()) {
                throw new IllegalArgumentException("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
            }
            return new o0O00O(this);
        }

        @oo0oO0
        public o00oOOo0 o00oOooO(@oo0oO0 List<String> list) {
            this.f12182o00oOOoO.addAll(list);
            return this;
        }
    }

    public o0O00O(@oo0oO0 o00oOOo0 o00oooo02) {
        this.f12177o00oOOo0 = o00oooo02.f12181o00oOOo0;
        this.f12178o00oOOoO = o00oooo02.f12182o00oOOoO;
        this.f12179o00oOo00 = o00oooo02.f12183o00oOo00;
        this.f12180o00oOooO = o00oooo02.f12184o00oOooO;
    }

    @oo0oO0
    public List<UUID> o00oOOo0() {
        return this.f12177o00oOOo0;
    }

    @oo0oO0
    public List<o0OoO00O.o00oOOo0> o00oOOoO() {
        return this.f12180o00oOooO;
    }

    @oo0oO0
    public List<String> o00oOo00() {
        return this.f12179o00oOo00;
    }

    @oo0oO0
    public List<String> o00oOooO() {
        return this.f12178o00oOOoO;
    }
}
