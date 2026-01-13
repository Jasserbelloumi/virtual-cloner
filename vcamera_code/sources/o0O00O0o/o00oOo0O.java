package o0O00O0o;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import o00oOooO.o0OO0oO;
/* loaded from: classes.dex */
public class o00oOo0O extends o00oOo00 {
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})

    /* renamed from: o00ooOO  reason: collision with root package name */
    public int[] f10896o00ooOO;
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public int[] f10897o00ooOOo;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public o00oOOo0 f10898o00ooOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public int f10899o00ooOo0;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public o00oOOoO f10900o00ooOoO;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public String[] f10901o00ooOoo;

    /* loaded from: classes.dex */
    public interface o00oOOo0 {
        CharSequence convertToString(Cursor cursor);
    }

    /* loaded from: classes.dex */
    public interface o00oOOoO {
        boolean setViewValue(View view, Cursor cursor, int i);
    }

    @Deprecated
    public o00oOo0O(Context context, int i, Cursor cursor, String[] strArr, int[] iArr) {
        super(context, i, cursor);
        this.f10899o00ooOo0 = -1;
        this.f10897o00ooOOo = iArr;
        this.f10901o00ooOoo = strArr;
        o00oo0O0(cursor, strArr);
    }

    public o00oOo0O(Context context, int i, Cursor cursor, String[] strArr, int[] iArr, int i2) {
        super(context, i, cursor, i2);
        this.f10899o00ooOo0 = -1;
        this.f10897o00ooOOo = iArr;
        this.f10901o00ooOoo = strArr;
        o00oo0O0(cursor, strArr);
    }

    @Override // o0O00O0o.o00oOOo0, o0O00O0o.o00oOOoO.o00oOOo0
    public CharSequence convertToString(Cursor cursor) {
        o00oOOo0 o00oooo02 = this.f10898o00ooOo;
        if (o00oooo02 != null) {
            return o00oooo02.convertToString(cursor);
        }
        int i = this.f10899o00ooOo0;
        return i > -1 ? cursor.getString(i) : super.convertToString(cursor);
    }

    @Override // o0O00O0o.o00oOOo0
    public void o00oOooO(View view, Context context, Cursor cursor) {
        o00oOOoO o00ooooo2 = this.f10900o00ooOoO;
        int[] iArr = this.f10897o00ooOOo;
        int length = iArr.length;
        int[] iArr2 = this.f10896o00ooOO;
        for (int i = 0; i < length; i++) {
            View findViewById = view.findViewById(iArr[i]);
            if (findViewById != null) {
                if (o00ooooo2 != null ? o00ooooo2.setViewValue(findViewById, cursor, iArr2[i]) : false) {
                    continue;
                } else {
                    String string = cursor.getString(iArr2[i]);
                    if (string == null) {
                        string = "";
                    }
                    if (findViewById instanceof TextView) {
                        o00ooO00((TextView) findViewById, string);
                    } else if (!(findViewById instanceof ImageView)) {
                        throw new IllegalStateException(findViewById.getClass().getName() + " is not a  view that can be bounds by this SimpleCursorAdapter");
                    } else {
                        o00oo((ImageView) findViewById, string);
                    }
                }
            }
        }
    }

    @Override // o0O00O0o.o00oOOo0
    public Cursor o00oOooo(Cursor cursor) {
        o00oo0O0(cursor, this.f10901o00ooOoo);
        return super.o00oOooo(cursor);
    }

    public void o00oo(ImageView imageView, String str) {
        try {
            imageView.setImageResource(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            imageView.setImageURI(Uri.parse(str));
        }
    }

    public o00oOOo0 o00oo0O() {
        return this.f10898o00ooOo;
    }

    public final void o00oo0O0(Cursor cursor, String[] strArr) {
        if (cursor == null) {
            this.f10896o00ooOO = null;
            return;
        }
        int length = strArr.length;
        int[] iArr = this.f10896o00ooOO;
        if (iArr == null || iArr.length != length) {
            this.f10896o00ooOO = new int[length];
        }
        for (int i = 0; i < length; i++) {
            this.f10896o00ooOO[i] = cursor.getColumnIndexOrThrow(strArr[i]);
        }
    }

    public void o00oo0OO(Cursor cursor, String[] strArr, int[] iArr) {
        this.f10901o00ooOoo = strArr;
        this.f10897o00ooOOo = iArr;
        o00oo0O0(cursor, strArr);
        super.o00oOOo0(cursor);
    }

    public int o00oo0Oo() {
        return this.f10899o00ooOo0;
    }

    public void o00oo0o(o00oOOo0 o00oooo02) {
        this.f10898o00ooOo = o00oooo02;
    }

    public o00oOOoO o00oo0o0() {
        return this.f10900o00ooOoO;
    }

    public void o00oo0oO(int i) {
        this.f10899o00ooOo0 = i;
    }

    public void o00ooO00(TextView textView, String str) {
        textView.setText(str);
    }

    public void o0O0o(o00oOOoO o00ooooo2) {
        this.f10900o00ooOoO = o00ooooo2;
    }
}
