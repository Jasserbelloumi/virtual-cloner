package o0O00O0o;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public abstract class o00oOo00 extends o00oOOo0 {

    /* renamed from: o00ooO  reason: collision with root package name */
    public int f10893o00ooO;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public int f10894o00ooO0o;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public LayoutInflater f10895o00ooOO0;

    @Deprecated
    public o00oOo00(Context context, int i, Cursor cursor) {
        super(context, cursor);
        this.f10893o00ooO = i;
        this.f10894o00ooO0o = i;
        this.f10895o00ooOO0 = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public o00oOo00(Context context, int i, Cursor cursor, int i2) {
        super(context, cursor, i2);
        this.f10893o00ooO = i;
        this.f10894o00ooO0o = i;
        this.f10895o00ooOO0 = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Deprecated
    public o00oOo00(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f10893o00ooO = i;
        this.f10894o00ooO0o = i;
        this.f10895o00ooOO0 = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // o0O00O0o.o00oOOo0
    public View o00oOoO(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f10895o00ooOO0.inflate(this.f10893o00ooO, viewGroup, false);
    }

    @Override // o0O00O0o.o00oOOo0
    public View o00oOoOO(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f10895o00ooOO0.inflate(this.f10894o00ooO0o, viewGroup, false);
    }

    public void o00oo0(int i) {
        this.f10894o00ooO0o = i;
    }

    public void o00oo00O(int i) {
        this.f10893o00ooO = i;
    }
}
