package o0O00OO;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
@o0OOooO0(19)
/* loaded from: classes.dex */
public class o00oOo0O extends o00oOOo0 {

    /* renamed from: o00oOo00  reason: collision with root package name */
    public Context f10907o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public Uri f10908o00oOooO;

    public o00oOo0O(@o0OO00OO o00oOOo0 o00oooo02, Context context, Uri uri) {
        super(o00oooo02);
        this.f10907o00oOo00 = context;
        this.f10908o00oOooO = uri;
    }

    @Override // o0O00OO.o00oOOo0
    public boolean o00oOOo0() {
        return o00oOOoO.o00oOOo0(this.f10907o00oOo00, this.f10908o00oOooO);
    }

    @Override // o0O00OO.o00oOOo0
    public boolean o00oOOoO() {
        return o00oOOoO.o00oOOoO(this.f10907o00oOo00, this.f10908o00oOooO);
    }

    @Override // o0O00OO.o00oOOo0
    public o00oOOo0 o00oOo00(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // o0O00OO.o00oOOo0
    public boolean o00oOo0O() {
        try {
            return DocumentsContract.deleteDocument(this.f10907o00oOo00.getContentResolver(), this.f10908o00oOooO);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // o0O00OO.o00oOOo0
    public boolean o00oOo0o() {
        return o00oOOoO.o00oOooO(this.f10907o00oOo00, this.f10908o00oOooO);
    }

    @Override // o0O00OO.o00oOOo0
    @o0OO00OO
    public String o00oOoo0() {
        return o00oOOoO.o00oOo0o(this.f10907o00oOo00, this.f10908o00oOooO);
    }

    @Override // o0O00OO.o00oOOo0
    public o00oOOo0 o00oOooO(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // o0O00OO.o00oOOo0
    public Uri o00oo0() {
        return this.f10908o00oOooO;
    }

    @Override // o0O00OO.o00oOOo0
    @o0OO00OO
    public String o00oo00O() {
        return o00oOOoO.o00oOoO(this.f10907o00oOo00, this.f10908o00oOooO);
    }

    @Override // o0O00OO.o00oOOo0
    public boolean o00oo0O() {
        return o00oOOoO.o00oOoOo(this.f10907o00oOo00, this.f10908o00oOooO);
    }

    @Override // o0O00OO.o00oOOo0
    public boolean o00oo0OO() {
        return o00oOOoO.o00oOoOO(this.f10907o00oOo00, this.f10908o00oOooO);
    }

    @Override // o0O00OO.o00oOOo0
    public boolean o00oo0Oo() {
        return o00oOOoO.o00oOoo0(this.f10907o00oOo00, this.f10908o00oOooO);
    }

    @Override // o0O00OO.o00oOOo0
    public long o00oo0o() {
        return o00oOOoO.o00oo00O(this.f10907o00oOo00, this.f10908o00oOooO);
    }

    @Override // o0O00OO.o00oOOo0
    public long o00oo0o0() {
        return o00oOOoO.o00oOooo(this.f10907o00oOo00, this.f10908o00oOooO);
    }

    @Override // o0O00OO.o00oOOo0
    public o00oOOo0[] o00oo0oO() {
        throw new UnsupportedOperationException();
    }

    @Override // o0O00OO.o00oOOo0
    public boolean o0O0o(String str) {
        throw new UnsupportedOperationException();
    }
}
