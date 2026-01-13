package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.o00oo00O;
import androidx.emoji2.text.o0O00000;
import java.util.Arrays;
import o00oOooO.o0O0o00O;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OOooO0(19)
@o00oOooO.o0O000O
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public final class o00oo0O {

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f2728o00oOo0o = 1;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f2729o00oOoO = 3;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int f2730o00oOoO0 = 2;
    @oo0oO0

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o00oo00O.o00oo f2731o00oOOo0;
    @oo0oO0

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0O00000 f2732o00oOOoO;
    @oo0oO0

    /* renamed from: o00oOo00  reason: collision with root package name */
    public o00oo00O.o00oOoO f2733o00oOo00;
    @o0OO00OO

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final int[] f2734o00oOo0O;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final boolean f2735o00oOooO;

    @o0OOooO0(19)
    /* loaded from: classes.dex */
    public static final class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final int f2736o00oOOo0 = -1;

        public static int o00oOOo0(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    i--;
                    if (i < 0) {
                        return z ? -1 : 0;
                    }
                    char charAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i2--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i2--;
                    } else if (Character.isHighSurrogate(charAt)) {
                        return -1;
                    } else {
                        z = true;
                    }
                }
                return i;
            }
        }

        public static int o00oOOoO(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    if (i >= length) {
                        if (z) {
                            return -1;
                        }
                        return length;
                    }
                    char charAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i2--;
                        i++;
                    } else if (!Character.isSurrogate(charAt)) {
                        i2--;
                        i++;
                    } else if (Character.isLowSurrogate(charAt)) {
                        return -1;
                    } else {
                        i++;
                        z = true;
                    }
                }
                return i;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOOoO {

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public static final int f2737o00oOoOO = 1;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public static final int f2738o00oOoOo = 2;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public int f2739o00oOOo0 = 1;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final o0O00000.o00oOOo0 f2740o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public o0O00000.o00oOOo0 f2741o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public int f2742o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public int f2743o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public final int[] f2744o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public final boolean f2745o00oOoO0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public o0O00000.o00oOOo0 f2746o00oOooO;

        public o00oOOoO(o0O00000.o00oOOo0 o00oooo02, boolean z, int[] iArr) {
            this.f2740o00oOOoO = o00oooo02;
            this.f2741o00oOo00 = o00oooo02;
            this.f2745o00oOoO0 = z;
            this.f2744o00oOoO = iArr;
        }

        public static boolean o00oOo0o(int i) {
            return i == 65038;
        }

        public static boolean o00oOooO(int i) {
            return i == 65039;
        }

        public int o00oOOo0(int i) {
            o0O00000.o00oOOo0 o00oOOo02 = this.f2741o00oOo00.o00oOOo0(i);
            int i2 = 3;
            if (this.f2739o00oOOo0 != 2) {
                if (o00oOOo02 != null) {
                    this.f2739o00oOOo0 = 2;
                    this.f2741o00oOo00 = o00oOOo02;
                    this.f2743o00oOo0o = 1;
                    i2 = 2;
                }
                i2 = o00oOoO0();
            } else {
                if (o00oOOo02 != null) {
                    this.f2741o00oOo00 = o00oOOo02;
                    this.f2743o00oOo0o++;
                } else {
                    if (!o00oOo0o(i)) {
                        if (!o00oOooO(i)) {
                            if (this.f2741o00oOo00.o00oOOoO() != null && (this.f2743o00oOo0o != 1 || o00oOoO())) {
                                this.f2746o00oOooO = this.f2741o00oOo00;
                                o00oOoO0();
                            }
                        }
                    }
                    i2 = o00oOoO0();
                }
                i2 = 2;
            }
            this.f2742o00oOo0O = i;
            return i2;
        }

        public o00oo0O0 o00oOOoO() {
            return this.f2741o00oOo00.o00oOOoO();
        }

        public o00oo0O0 o00oOo00() {
            return this.f2746o00oOooO.o00oOOoO();
        }

        public boolean o00oOo0O() {
            return this.f2739o00oOOo0 == 2 && this.f2741o00oOo00.o00oOOoO() != null && (this.f2743o00oOo0o > 1 || o00oOoO());
        }

        public final boolean o00oOoO() {
            if (this.f2741o00oOo00.o00oOOoO().o00oOooo() || o00oOooO(this.f2742o00oOo0O)) {
                return true;
            }
            if (this.f2745o00oOoO0) {
                if (this.f2744o00oOoO == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f2744o00oOoO, this.f2741o00oOo00.o00oOOoO().o00oOOoO(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        public final int o00oOoO0() {
            this.f2739o00oOOo0 = 1;
            this.f2741o00oOo00 = this.f2740o00oOOoO;
            this.f2743o00oOo0o = 0;
            return 1;
        }
    }

    public o00oo0O(@oo0oO0 o0O00000 o0o00000, @oo0oO0 o00oo00O.o00oo o00ooVar, @oo0oO0 o00oo00O.o00oOoO o00oooo2, boolean z, @o0OO00OO int[] iArr) {
        this.f2731o00oOOo0 = o00ooVar;
        this.f2732o00oOOoO = o0o00000;
        this.f2733o00oOo00 = o00oooo2;
        this.f2735o00oOooO = z;
        this.f2734o00oOo0O = iArr;
    }

    public static boolean o00oOOoO(@oo0oO0 Editable editable, @oo0oO0 KeyEvent keyEvent, boolean z) {
        o0O0o[] o0o0oArr;
        if (o00oOoOO(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!o00oOoO(selectionStart, selectionEnd) && (o0o0oArr = (o0O0o[]) editable.getSpans(selectionStart, selectionEnd, o0O0o.class)) != null && o0o0oArr.length > 0) {
            for (o0O0o o0o0o : o0o0oArr) {
                int spanStart = editable.getSpanStart(o0o0o);
                int spanEnd = editable.getSpanEnd(o0o0o);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean o00oOo0O(@oo0oO0 InputConnection inputConnection, @oo0oO0 Editable editable, @o0O0o00O(from = 0) int i, @o0O0o00O(from = 0) int i2, boolean z) {
        int max;
        int min;
        if (editable != null && inputConnection != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (o00oOoO(selectionStart, selectionEnd)) {
                return false;
            }
            if (z) {
                max = o00oOOo0.o00oOOo0(editable, selectionStart, Math.max(i, 0));
                min = o00oOOo0.o00oOOoO(editable, selectionEnd, Math.max(i2, 0));
                if (max == -1 || min == -1) {
                    return false;
                }
            } else {
                max = Math.max(selectionStart - i, 0);
                min = Math.min(selectionEnd + i2, editable.length());
            }
            o0O0o[] o0o0oArr = (o0O0o[]) editable.getSpans(max, min, o0O0o.class);
            if (o0o0oArr != null && o0o0oArr.length > 0) {
                for (o0O0o o0o0o : o0o0oArr) {
                    int spanStart = editable.getSpanStart(o0o0o);
                    int spanEnd = editable.getSpanEnd(o0o0o);
                    max = Math.min(spanStart, max);
                    min = Math.max(spanEnd, min);
                }
                int max2 = Math.max(max, 0);
                int min2 = Math.min(min, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max2, min2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    public static boolean o00oOo0o(@oo0oO0 Editable editable, int i, @oo0oO0 KeyEvent keyEvent) {
        if (i != 67 ? i != 112 ? false : o00oOOoO(editable, keyEvent, true) : o00oOOoO(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            return true;
        }
        return false;
    }

    public static boolean o00oOoO(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    public static boolean o00oOoOO(@oo0oO0 KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    public final void o00oOOo0(@oo0oO0 Spannable spannable, o00oo0O0 o00oo0o02, int i, int i2) {
        spannable.setSpan(this.f2731o00oOOo0.o00oOOo0(o00oo0o02), i, i2, 33);
    }

    public int o00oOo00(@oo0oO0 CharSequence charSequence) {
        return o00oOooO(charSequence, this.f2732o00oOOoO.o00oOoO());
    }

    public final boolean o00oOoO0(CharSequence charSequence, int i, int i2, o00oo0O0 o00oo0o02) {
        if (o00oo0o02.o00oOo0O() == 0) {
            o00oo0o02.o00oo0(this.f2733o00oOo00.o00oOOo0(charSequence, i, i2, o00oo0o02.o00oOoOO()));
        }
        return o00oo0o02.o00oOo0O() == 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0123, code lost:
        ((androidx.emoji2.text.o0O0000O) r10).o00oOooO();
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047 A[Catch: all -> 0x012a, TryCatch #0 {all -> 0x012a, blocks: (B:7:0x000d, B:10:0x0012, B:12:0x0016, B:14:0x0025, B:18:0x0036, B:20:0x0040, B:22:0x0043, B:24:0x0047, B:26:0x0053, B:27:0x0056, B:29:0x0063, B:35:0x0072, B:36:0x0080, B:40:0x0099, B:48:0x00a9, B:51:0x00b5, B:52:0x00bf, B:53:0x00c9, B:55:0x00d0, B:56:0x00d5, B:58:0x00e0, B:60:0x00e7, B:64:0x00f1, B:67:0x00fd, B:68:0x0103, B:70:0x010c, B:15:0x002b), top: B:84:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fd A[Catch: all -> 0x012a, TryCatch #0 {all -> 0x012a, blocks: (B:7:0x000d, B:10:0x0012, B:12:0x0016, B:14:0x0025, B:18:0x0036, B:20:0x0040, B:22:0x0043, B:24:0x0047, B:26:0x0053, B:27:0x0056, B:29:0x0063, B:35:0x0072, B:36:0x0080, B:40:0x0099, B:48:0x00a9, B:51:0x00b5, B:52:0x00bf, B:53:0x00c9, B:55:0x00d0, B:56:0x00d5, B:58:0x00e0, B:60:0x00e7, B:64:0x00f1, B:67:0x00fd, B:68:0x0103, B:70:0x010c, B:15:0x002b), top: B:84:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010c A[Catch: all -> 0x012a, TRY_LEAVE, TryCatch #0 {all -> 0x012a, blocks: (B:7:0x000d, B:10:0x0012, B:12:0x0016, B:14:0x0025, B:18:0x0036, B:20:0x0040, B:22:0x0043, B:24:0x0047, B:26:0x0053, B:27:0x0056, B:29:0x0063, B:35:0x0072, B:36:0x0080, B:40:0x0099, B:48:0x00a9, B:51:0x00b5, B:52:0x00bf, B:53:0x00c9, B:55:0x00d0, B:56:0x00d5, B:58:0x00e0, B:60:0x00e7, B:64:0x00f1, B:67:0x00fd, B:68:0x0103, B:70:0x010c, B:15:0x002b), top: B:84:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00d5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.CharSequence o00oOoOo(@o00oOooO.oo0oO0 java.lang.CharSequence r10, @o00oOooO.o0O0o00O(from = 0) int r11, @o00oOooO.o0O0o00O(from = 0) int r12, @o00oOooO.o0O0o00O(from = 0) int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.o00oo0O.o00oOoOo(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }

    public int o00oOooO(@oo0oO0 CharSequence charSequence, int i) {
        o00oOOoO o00ooooo2 = new o00oOOoO(this.f2732o00oOOoO.f2762o00oOo00, this.f2735o00oOooO, this.f2734o00oOo0O);
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int codePointAt = Character.codePointAt(charSequence, i2);
            int o00oOOo02 = o00ooooo2.o00oOOo0(codePointAt);
            o00oo0O0 o00oOOoO2 = o00ooooo2.o00oOOoO();
            if (o00oOOo02 == 1) {
                i2 += Character.charCount(codePointAt);
                i4 = 0;
            } else if (o00oOOo02 == 2) {
                i2 += Character.charCount(codePointAt);
            } else if (o00oOOo02 == 3) {
                o00oOOoO2 = o00ooooo2.o00oOo00();
                if (o00oOOoO2.o00oOooO() <= i) {
                    i3++;
                }
            }
            if (o00oOOoO2 != null && o00oOOoO2.o00oOooO() <= i) {
                i4++;
            }
        }
        if (i3 != 0) {
            return 2;
        }
        if (!o00ooooo2.o00oOo0O() || o00ooooo2.o00oOOoO().o00oOooO() > i) {
            return i4 == 0 ? 0 : 2;
        }
        return 1;
    }
}
