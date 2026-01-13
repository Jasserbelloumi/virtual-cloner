package o0O00OO;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import java.util.ArrayList;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
@o0OOooO0(21)
/* loaded from: classes.dex */
public class o00oOoO extends o00oOOo0 {

    /* renamed from: o00oOo00  reason: collision with root package name */
    public Context f10909o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public Uri f10910o00oOooO;

    public o00oOoO(@o0OO00OO o00oOOo0 o00oooo02, Context context, Uri uri) {
        super(o00oooo02);
        this.f10909o00oOo00 = context;
        this.f10910o00oOooO = uri;
    }

    public static void o00oo(@o0OO00OO AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    @o0OO00OO
    public static Uri o00ooO00(Context context, Uri uri, String str, String str2) {
        try {
            return DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // o0O00OO.o00oOOo0
    public boolean o00oOOo0() {
        return o00oOOoO.o00oOOo0(this.f10909o00oOo00, this.f10910o00oOooO);
    }

    @Override // o0O00OO.o00oOOo0
    public boolean o00oOOoO() {
        return o00oOOoO.o00oOOoO(this.f10909o00oOo00, this.f10910o00oOooO);
    }

    @Override // o0O00OO.o00oOOo0
    @o0OO00OO
    public o00oOOo0 o00oOo00(String str) {
        Uri o00ooO002 = o00ooO00(this.f10909o00oOo00, this.f10910o00oOooO, "vnd.android.document/directory", str);
        if (o00ooO002 != null) {
            return new o00oOoO(this, this.f10909o00oOo00, o00ooO002);
        }
        return null;
    }

    @Override // o0O00OO.o00oOOo0
    public boolean o00oOo0O() {
        try {
            return DocumentsContract.deleteDocument(this.f10909o00oOo00.getContentResolver(), this.f10910o00oOooO);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // o0O00OO.o00oOOo0
    public boolean o00oOo0o() {
        return o00oOOoO.o00oOooO(this.f10909o00oOo00, this.f10910o00oOooO);
    }

    @Override // o0O00OO.o00oOOo0
    @o0OO00OO
    public String o00oOoo0() {
        return o00oOOoO.o00oOo0o(this.f10909o00oOo00, this.f10910o00oOooO);
    }

    @Override // o0O00OO.o00oOOo0
    @o0OO00OO
    public o00oOOo0 o00oOooO(String str, String str2) {
        Uri o00ooO002 = o00ooO00(this.f10909o00oOo00, this.f10910o00oOooO, str, str2);
        if (o00ooO002 != null) {
            return new o00oOoO(this, this.f10909o00oOo00, o00ooO002);
        }
        return null;
    }

    @Override // o0O00OO.o00oOOo0
    public Uri o00oo0() {
        return this.f10910o00oOooO;
    }

    @Override // o0O00OO.o00oOOo0
    @o0OO00OO
    public String o00oo00O() {
        return o00oOOoO.o00oOoO(this.f10909o00oOo00, this.f10910o00oOooO);
    }

    @Override // o0O00OO.o00oOOo0
    public boolean o00oo0O() {
        return o00oOOoO.o00oOoOo(this.f10909o00oOo00, this.f10910o00oOooO);
    }

    @Override // o0O00OO.o00oOOo0
    public boolean o00oo0OO() {
        return o00oOOoO.o00oOoOO(this.f10909o00oOo00, this.f10910o00oOooO);
    }

    @Override // o0O00OO.o00oOOo0
    public boolean o00oo0Oo() {
        return o00oOOoO.o00oOoo0(this.f10909o00oOo00, this.f10910o00oOooO);
    }

    @Override // o0O00OO.o00oOOo0
    public long o00oo0o() {
        return o00oOOoO.o00oo00O(this.f10909o00oOo00, this.f10910o00oOooO);
    }

    @Override // o0O00OO.o00oOOo0
    public long o00oo0o0() {
        return o00oOOoO.o00oOooo(this.f10909o00oOo00, this.f10910o00oOooO);
    }

    @Override // o0O00OO.o00oOOo0
    public o00oOOo0[] o00oo0oO() {
        ContentResolver contentResolver = this.f10909o00oOo00.getContentResolver();
        Uri uri = this.f10910o00oOooO;
        Uri buildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = contentResolver.query(buildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                while (cursor.moveToNext()) {
                    arrayList.add(DocumentsContract.buildDocumentUriUsingTree(this.f10910o00oOooO, cursor.getString(0)));
                }
            } catch (Exception e) {
                e.toString();
            }
            Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
            o00oOOo0[] o00oooo0Arr = new o00oOOo0[uriArr.length];
            for (int i = 0; i < uriArr.length; i++) {
                o00oooo0Arr[i] = new o00oOoO(this, this.f10909o00oOo00, uriArr[i]);
            }
            return o00oooo0Arr;
        } finally {
            o00oo(cursor);
        }
    }

    @Override // o0O00OO.o00oOOo0
    public boolean o0O0o(String str) {
        try {
            Uri renameDocument = DocumentsContract.renameDocument(this.f10909o00oOo00.getContentResolver(), this.f10910o00oOooO, str);
            if (renameDocument != null) {
                this.f10910o00oOooO = renameDocument;
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
