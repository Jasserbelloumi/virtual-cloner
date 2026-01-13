package o0oO0O0o;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o00ooo0.o00ooO0;
import o0O000.o00oOoO;
import o0O000.o0O000;
import o0oO0O0o.o0O0O0Oo;
/* loaded from: classes.dex */
public class o0O0oo0o extends o0oO0O0o<Cursor> {

    /* renamed from: o00oo  reason: collision with root package name */
    public String f16929o00oo;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final o0O0O0Oo<Cursor>.o00oOOo0 f16930o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public String[] f16931o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public Uri f16932o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public String f16933o00oo0oO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public o00oOoO f16934o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public Cursor f16935o00ooO00;

    /* renamed from: o0O0o  reason: collision with root package name */
    public String[] f16936o0O0o;

    public o0O0oo0o(@oo0oO0 Context context) {
        super(context);
        this.f16930o00oo0Oo = new o0O0O0Oo.o00oOOo0();
    }

    public o0O0oo0o(@oo0oO0 Context context, @oo0oO0 Uri uri, @o0OO00OO String[] strArr, @o0OO00OO String str, @o0OO00OO String[] strArr2, @o0OO00OO String str2) {
        super(context);
        this.f16930o00oo0Oo = new o0O0O0Oo.o00oOOo0();
        this.f16932o00oo0o0 = uri;
        this.f16931o00oo0o = strArr;
        this.f16933o00oo0oO = str;
        this.f16936o0O0o = strArr2;
        this.f16929o00oo = str2;
    }

    @Override // o0oO0O0o.o0oO0O0o
    /* renamed from: o0 */
    public void o00ooo00(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    @Override // o0oO0O0o.o0oO0O0o, o0oO0O0o.o0O0O0Oo
    @Deprecated
    public void o00oOoO0(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.o00oOoO0(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f16932o00oo0o0);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f16931o00oo0o));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f16933o00oo0oO);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f16936o0O0o));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f16929o00oo);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f16935o00ooO00);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.f16901o00oOoO);
    }

    @Override // o0oO0O0o.o0O0O0Oo
    public void o00oo0Oo() {
        o00oo0o();
        Cursor cursor = this.f16935o00ooO00;
        if (cursor != null && !cursor.isClosed()) {
            this.f16935o00ooO00.close();
        }
        this.f16935o00ooO00 = null;
    }

    @Override // o0oO0O0o.o0O0O0Oo
    public void o00oo0o() {
        o00oOOoO();
    }

    @Override // o0oO0O0o.o0O0O0Oo
    public void o00oo0o0() {
        Cursor cursor = this.f16935o00ooO00;
        if (cursor != null) {
            o00oOo0o(cursor);
        }
        if (o00ooO0o() || this.f16935o00ooO00 == null) {
            o00oOoO();
        }
    }

    @Override // o0oO0O0o.o0oO0O0o
    public void o00ooOO() {
        synchronized (this) {
            o00oOoO o00oooo2 = this.f16934o00ooO0;
            if (o00oooo2 != null) {
                o00oooo2.o00oOOo0();
            }
        }
    }

    @Override // o0oO0O0o.o0O0O0Oo
    /* renamed from: o00oooO */
    public void o00oOo0o(Cursor cursor) {
        if (o00oOooo()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.f16935o00ooO00;
        this.f16935o00ooO00 = cursor;
        if (o00oo00O()) {
            super.o00oOo0o(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @o0OO00OO
    public String[] o00oooOO() {
        return this.f16931o00oo0o;
    }

    @o0OO00OO
    public String o00oooOo() {
        return this.f16933o00oo0oO;
    }

    @o0OO00OO
    public String o00oooo() {
        return this.f16929o00oo;
    }

    @o0OO00OO
    public String[] o00oooo0() {
        return this.f16936o0O0o;
    }

    @oo0oO0
    public Uri o00ooooO() {
        return this.f16932o00oo0o0;
    }

    @Override // o0oO0O0o.o0oO0O0o
    /* renamed from: o00ooooo */
    public Cursor o00ooOoo() {
        synchronized (this) {
            if (o00ooOoO()) {
                throw new o0O000();
            }
            this.f16934o00ooO0 = new o00oOoO();
        }
        try {
            Cursor o00oOOo02 = o00ooO0.o00oOOo0(o00oOoOO().getContentResolver(), this.f16932o00oo0o0, this.f16931o00oo0o, this.f16933o00oo0oO, this.f16936o0O0o, this.f16929o00oo, this.f16934o00ooO0);
            if (o00oOOo02 != null) {
                try {
                    o00oOOo02.getCount();
                    o00oOOo02.registerContentObserver(this.f16930o00oo0Oo);
                } catch (RuntimeException e) {
                    o00oOOo02.close();
                    throw e;
                }
            }
            synchronized (this) {
                this.f16934o00ooO0 = null;
            }
            return o00oOOo02;
        } catch (Throwable th) {
            synchronized (this) {
                this.f16934o00ooO0 = null;
                throw th;
            }
        }
    }

    public void o0O000(@o0OO00OO String str) {
        this.f16929o00oo = str;
    }

    public void o0O00000(@o0OO00OO String[] strArr) {
        this.f16931o00oo0o = strArr;
    }

    public void o0O0000O(@o0OO00OO String str) {
        this.f16933o00oo0oO = str;
    }

    public void o0O0000o(@o0OO00OO String[] strArr) {
        this.f16936o0O0o = strArr;
    }

    public void o0O000O(@oo0oO0 Uri uri) {
        this.f16932o00oo0o0 = uri;
    }
}
