package o0OoOoOO;

import android.annotation.SuppressLint;
import android.text.Html;
import android.text.Spanned;
import o00oOooO.o0O0O0Oo;
@SuppressLint({"InlinedApi"})
/* loaded from: classes.dex */
public final class oo0ooO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final int f16877o00oOOo0 = 0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f16878o00oOOoO = 1;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f16879o00oOo00 = 1;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f16880o00oOo0O = 4;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f16881o00oOo0o = 8;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f16882o00oOoO = 32;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int f16883o00oOoO0 = 16;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final int f16884o00oOoOO = 256;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final int f16885o00oOoOo = 0;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final int f16886o00oOoo0 = 63;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f16887o00oOooO = 2;

    @o00oOooO.o0OOooO0(24)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static Spanned o00oOOo0(String str, int i) {
            return Html.fromHtml(str, i);
        }

        @o0O0O0Oo
        public static Spanned o00oOOoO(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i, imageGetter, tagHandler);
        }

        @o0O0O0Oo
        public static String o00oOo00(Spanned spanned, int i) {
            return Html.toHtml(spanned, i);
        }
    }

    @o00oOooO.oo0oO0
    public static Spanned o00oOOo0(@o00oOooO.oo0oO0 String str, int i) {
        return o00oOOo0.o00oOOo0(str, i);
    }

    @o00oOooO.oo0oO0
    public static Spanned o00oOOoO(@o00oOooO.oo0oO0 String str, int i, @o00oOooO.o0OO00OO Html.ImageGetter imageGetter, @o00oOooO.o0OO00OO Html.TagHandler tagHandler) {
        return o00oOOo0.o00oOOoO(str, i, imageGetter, tagHandler);
    }

    @o00oOooO.oo0oO0
    public static String o00oOo00(@o00oOooO.oo0oO0 Spanned spanned, int i) {
        return o00oOOo0.o00oOo00(spanned, i);
    }
}
