package o00ooO0O;

import java.util.ArrayList;
import o00ooO.o00oo0O;
import o00ooO0O.o00oo0OO;
/* loaded from: classes.dex */
public class o00oo00O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o00oo0OO f8759o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o00oo0OO.o00oOoO f8760o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public ArrayList<Object> f8761o00oOo00 = new ArrayList<>();

    /* renamed from: o00oOooO  reason: collision with root package name */
    public o00oo0O f8762o00oOooO;

    public o00oo00O(o00oo0OO o00oo0oo, o00oo0OO.o00oOoO o00oooo2) {
        this.f8759o00oOOo0 = o00oo0oo;
        this.f8760o00oOOoO = o00oooo2;
    }

    public o00oo00O o00oOOo0(Object... objArr) {
        for (Object obj : objArr) {
            this.f8761o00oOo00.add(obj);
        }
        return this;
    }

    public void o00oOOoO() {
    }

    public o00oo0O o00oOo00() {
        return this.f8762o00oOooO;
    }

    public void o00oOo0O(o00oo0O o00oo0o2) {
        this.f8762o00oOooO = o00oo0o2;
    }

    public o00oo0OO.o00oOoO o00oOooO() {
        return this.f8760o00oOOoO;
    }
}
