package o0O0o0o0;

import androidx.work.impl.WorkDatabase;
import java.util.LinkedList;
import java.util.UUID;
import o00oOooO.o0OO0oO;
import o00oOooO.oO0Oo;
import o00oOooO.oo0oO0;
import o0O0Ooo.o0O00O0;
import o0O0Ooo0.o0O000O;
import o0O0Ooo0.o0OoO00O;
import o0O0o0Oo.o0O00O0o;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public abstract class o00oOOoO implements Runnable {

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o0O0Ooo.o0O000 f12523o00oo0O0 = new o0O0Ooo.o0O000();

    /* loaded from: classes.dex */
    public class o00oOOo0 extends o00oOOoO {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o0O00O0 f12524o00oo0O;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ UUID f12525o00oo0Oo;

        public o00oOOo0(o0O00O0 o0o00o0, UUID uuid) {
            this.f12524o00oo0O = o0o00o0;
            this.f12525o00oo0Oo = uuid;
        }

        @Override // o0O0o0o0.o00oOOoO
        @oO0Oo
        public void o00oOoOO() {
            WorkDatabase o00ooo0o2 = this.f12524o00oo0O.o00ooo0o();
            o00ooo0o2.o00oOo00();
            try {
                o00oOOo0(this.f12524o00oo0O, this.f12525o00oo0Oo.toString());
                o00ooo0o2.o00ooO0o();
                o00ooo0o2.o00oOoOO();
                o00oOoO(this.f12524o00oo0O);
            } catch (Throwable th) {
                o00ooo0o2.o00oOoOO();
                throw th;
            }
        }
    }

    /* renamed from: o0O0o0o0.o00oOOoO$o00oOOoO  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0155o00oOOoO extends o00oOOoO {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o0O00O0 f12526o00oo0O;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ String f12527o00oo0Oo;

        public C0155o00oOOoO(o0O00O0 o0o00o0, String str) {
            this.f12526o00oo0O = o0o00o0;
            this.f12527o00oo0Oo = str;
        }

        @Override // o0O0o0o0.o00oOOoO
        @oO0Oo
        public void o00oOoOO() {
            WorkDatabase o00ooo0o2 = this.f12526o00oo0O.o00ooo0o();
            o00ooo0o2.o00oOo00();
            try {
                for (String str : o00ooo0o2.o00ooo0O().o00oOoo0(this.f12527o00oo0Oo)) {
                    o00oOOo0(this.f12526o00oo0O, str);
                }
                o00ooo0o2.o00ooO0o();
                o00ooo0o2.o00oOoOO();
                o00oOoO(this.f12526o00oo0O);
            } catch (Throwable th) {
                o00ooo0o2.o00oOoOO();
                throw th;
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 extends o00oOOoO {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o0O00O0 f12528o00oo0O;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ String f12529o00oo0Oo;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public final /* synthetic */ boolean f12530o00oo0o0;

        public o00oOo00(o0O00O0 o0o00o0, String str, boolean z) {
            this.f12528o00oo0O = o0o00o0;
            this.f12529o00oo0Oo = str;
            this.f12530o00oo0o0 = z;
        }

        @Override // o0O0o0o0.o00oOOoO
        @oO0Oo
        public void o00oOoOO() {
            WorkDatabase o00ooo0o2 = this.f12528o00oo0O.o00ooo0o();
            o00ooo0o2.o00oOo00();
            try {
                for (String str : o00ooo0o2.o00ooo0O().o00oOo0o(this.f12529o00oo0Oo)) {
                    o00oOOo0(this.f12528o00oo0O, str);
                }
                o00ooo0o2.o00ooO0o();
                o00ooo0o2.o00oOoOO();
                if (this.f12530o00oo0o0) {
                    o00oOoO(this.f12528o00oo0O);
                }
            } catch (Throwable th) {
                o00ooo0o2.o00oOoOO();
                throw th;
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo0O extends o00oOOoO {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o0O00O0 f12531o00oo0O;

        public o00oOo0O(o0O00O0 o0o00o0) {
            this.f12531o00oo0O = o0o00o0;
        }

        @Override // o0O0o0o0.o00oOOoO
        @oO0Oo
        public void o00oOoOO() {
            WorkDatabase o00ooo0o2 = this.f12531o00oo0O.o00ooo0o();
            o00ooo0o2.o00oOo00();
            try {
                for (String str : o00ooo0o2.o00ooo0O().o00ooO0O()) {
                    o00oOOo0(this.f12531o00oo0O, str);
                }
                new o00oo0OO(this.f12531o00oo0O.o00ooo0o()).o00oOo0O(System.currentTimeMillis());
                o00ooo0o2.o00ooO0o();
            } finally {
                o00ooo0o2.o00oOoOO();
            }
        }
    }

    public static o00oOOoO o00oOOoO(@oo0oO0 o0O00O0 o0o00o0) {
        return new o00oOo0O(o0o00o0);
    }

    public static o00oOOoO o00oOo00(@oo0oO0 UUID uuid, @oo0oO0 o0O00O0 o0o00o0) {
        return new o00oOOo0(o0o00o0, uuid);
    }

    public static o00oOOoO o00oOo0O(@oo0oO0 String str, @oo0oO0 o0O00O0 o0o00o0) {
        return new C0155o00oOOoO(o0o00o0, str);
    }

    public static o00oOOoO o00oOooO(@oo0oO0 String str, @oo0oO0 o0O00O0 o0o00o0, boolean z) {
        return new o00oOo00(o0o00o0, str, z);
    }

    public void o00oOOo0(o0O00O0 o0o00o0, String str) {
        o00oOoO0(o0o00o0.o00ooo0o(), str);
        o0o00o0.o00ooo00().o00oo00O(str);
        for (o0O0Ooo.o0OoOoOo o0oooooo : o0o00o0.o00ooo0O()) {
            o0oooooo.o00oOOo0(str);
        }
    }

    public o0O0Ooo0.o0O000O o00oOo0o() {
        return this.f12523o00oo0O0;
    }

    public void o00oOoO(o0O00O0 o0o00o0) {
        o0O0Ooo.o0O000Oo.o00oOOoO(o0o00o0.o00ooOo0(), o0o00o0.o00ooo0o(), o0o00o0.o00ooo0O());
    }

    public final void o00oOoO0(WorkDatabase workDatabase, String str) {
        o0O00O0o o00ooo0O2 = workDatabase.o00ooo0O();
        o0O0o0Oo.o00oo0O0 o00ooOO02 = workDatabase.o00ooOO0();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            o0OoO00O.o00oOOo0 o00oOoO2 = o00ooo0O2.o00oOoO(str2);
            if (o00oOoO2 != o0OoO00O.o00oOOo0.SUCCEEDED && o00oOoO2 != o0OoO00O.o00oOOo0.FAILED) {
                o00ooo0O2.o00oo0Oo(o0OoO00O.o00oOOo0.CANCELLED, str2);
            }
            linkedList.addAll(o00ooOO02.o00oOOo0(str2));
        }
    }

    public abstract void o00oOoOO();

    @Override // java.lang.Runnable
    public void run() {
        try {
            o00oOoOO();
            this.f12523o00oo0O0.o00oOOo0(o0O0Ooo0.o0O000O.f12172o00oOOo0);
        } catch (Throwable th) {
            this.f12523o00oo0O0.o00oOOo0(new o0O000O.o00oOOoO.o00oOOo0(th));
        }
    }
}
