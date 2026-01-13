package o0OoO00O;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public final class oOooo {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final int f16790o00oOOo0 = 16777216;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f16791o00oOOoO = Integer.MIN_VALUE;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String[] f16792o00oOo00 = new String[0];

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f16793o00oOo0O = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final String f16794o00oOo0o = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT";

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final String f16795o00oOoO = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END";

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final String f16796o00oOoO0 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD";
    @o0o0000

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final int f16797o00oOoOO = 2048;
    @o0o0000

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final int f16798o00oOoOo = 1024;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f16799o00oOooO = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";

    @o0OOooO0(30)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        public static CharSequence o00oOOo0(@oo0oO0 EditorInfo editorInfo, int i) {
            CharSequence initialSelectedText;
            initialSelectedText = editorInfo.getInitialSelectedText(i);
            return initialSelectedText;
        }

        public static CharSequence o00oOOoO(@oo0oO0 EditorInfo editorInfo, int i, int i2) {
            CharSequence initialTextAfterCursor;
            initialTextAfterCursor = editorInfo.getInitialTextAfterCursor(i, i2);
            return initialTextAfterCursor;
        }

        public static CharSequence o00oOo00(@oo0oO0 EditorInfo editorInfo, int i, int i2) {
            CharSequence initialTextBeforeCursor;
            initialTextBeforeCursor = editorInfo.getInitialTextBeforeCursor(i, i2);
            return initialTextBeforeCursor;
        }

        public static void o00oOooO(@oo0oO0 EditorInfo editorInfo, CharSequence charSequence, int i) {
            editorInfo.setInitialSurroundingSubText(charSequence, i);
        }
    }

    @oo0oO0
    public static String[] o00oOOo0(@oo0oO0 EditorInfo editorInfo) {
        String[] strArr = editorInfo.contentMimeTypes;
        return strArr != null ? strArr : f16792o00oOo00;
    }

    @o0OO00OO
    public static CharSequence o00oOOoO(@oo0oO0 EditorInfo editorInfo, int i) {
        CharSequence charSequence;
        CharSequence initialSelectedText;
        if (Build.VERSION.SDK_INT >= 30) {
            initialSelectedText = editorInfo.getInitialSelectedText(i);
            return initialSelectedText;
        } else if (editorInfo.extras == null) {
            return null;
        } else {
            int min = Math.min(editorInfo.initialSelStart, editorInfo.initialSelEnd);
            int max = Math.max(editorInfo.initialSelStart, editorInfo.initialSelEnd);
            int i2 = editorInfo.extras.getInt(f16796o00oOoO0);
            int i3 = editorInfo.extras.getInt(f16795o00oOoO);
            int i4 = max - min;
            if (editorInfo.initialSelStart < 0 || editorInfo.initialSelEnd < 0 || i3 - i2 != i4 || (charSequence = editorInfo.extras.getCharSequence(f16794o00oOo0o)) == null) {
                return null;
            }
            return (i & 1) != 0 ? charSequence.subSequence(i2, i3) : TextUtils.substring(charSequence, i2, i3);
        }
    }

    @o0OO00OO
    public static CharSequence o00oOo00(@oo0oO0 EditorInfo editorInfo, int i, int i2) {
        CharSequence charSequence;
        CharSequence initialTextAfterCursor;
        if (Build.VERSION.SDK_INT >= 30) {
            initialTextAfterCursor = editorInfo.getInitialTextAfterCursor(i, i2);
            return initialTextAfterCursor;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence(f16794o00oOo0o)) == null) {
            return null;
        }
        int i3 = editorInfo.extras.getInt(f16795o00oOoO);
        int i4 = i2 & 1;
        int min = Math.min(i, charSequence.length() - i3) + i3;
        return i4 != 0 ? charSequence.subSequence(i3, min) : TextUtils.substring(charSequence, i3, min);
    }

    public static int o00oOo0O(EditorInfo editorInfo) {
        return 1;
    }

    public static boolean o00oOo0o(CharSequence charSequence, int i, int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                return false;
            }
            return Character.isHighSurrogate(charSequence.charAt(i));
        }
        return Character.isLowSurrogate(charSequence.charAt(i));
    }

    public static void o00oOoO(@oo0oO0 EditorInfo editorInfo, @o0OO00OO String[] strArr) {
        editorInfo.contentMimeTypes = strArr;
    }

    public static boolean o00oOoO0(int i) {
        int i2 = i & 4095;
        return i2 == 129 || i2 == 225 || i2 == 18;
    }

    public static void o00oOoOO(@oo0oO0 EditorInfo editorInfo, @oo0oO0 CharSequence charSequence, int i) {
        charSequence.getClass();
        if (Build.VERSION.SDK_INT >= 30) {
            editorInfo.setInitialSurroundingSubText(charSequence, i);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 - i : i2 - i;
        int i5 = i2 > i3 ? i2 - i : i3 - i;
        int length = charSequence.length();
        if (i < 0 || i4 < 0 || i5 > length) {
            o00oOoo0(editorInfo, null, 0, 0);
        } else if (o00oOoO0(editorInfo.inputType)) {
            o00oOoo0(editorInfo, null, 0, 0);
        } else if (length <= 2048) {
            o00oOoo0(editorInfo, charSequence, i4, i5);
        } else {
            o00oOooo(editorInfo, charSequence, i4, i5);
        }
    }

    public static void o00oOoOo(@oo0oO0 EditorInfo editorInfo, @oo0oO0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            editorInfo.setInitialSurroundingSubText(charSequence, 0);
        } else {
            o00oOoOO(editorInfo, charSequence, 0);
        }
    }

    public static void o00oOoo0(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence(f16794o00oOo0o, charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt(f16796o00oOoO0, i);
        editorInfo.extras.putInt(f16795o00oOoO, i2);
    }

    @o0OO00OO
    public static CharSequence o00oOooO(@oo0oO0 EditorInfo editorInfo, int i, int i2) {
        CharSequence charSequence;
        CharSequence initialTextBeforeCursor;
        if (Build.VERSION.SDK_INT >= 30) {
            initialTextBeforeCursor = editorInfo.getInitialTextBeforeCursor(i, i2);
            return initialTextBeforeCursor;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence(f16794o00oOo0o)) == null) {
            return null;
        }
        int i3 = editorInfo.extras.getInt(f16796o00oOoO0);
        int i4 = i2 & 1;
        int min = i3 - Math.min(i, i3);
        return i4 != 0 ? charSequence.subSequence(min, i3) : TextUtils.substring(charSequence, min, i3);
    }

    public static void o00oOooo(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        int i3 = i2 - i;
        int i4 = i3 > 1024 ? 0 : i3;
        int i5 = 2048 - i4;
        int min = Math.min(charSequence.length() - i2, i5 - Math.min(i, (int) (i5 * 0.8d)));
        int min2 = Math.min(i, i5 - min);
        int i6 = i - min2;
        if (o00oOo0o(charSequence, i6, 0)) {
            i6++;
            min2--;
        }
        if (o00oOo0o(charSequence, (i2 + min) - 1, 1)) {
            min--;
        }
        CharSequence concat = i4 != i3 ? TextUtils.concat(charSequence.subSequence(i6, i6 + min2), charSequence.subSequence(i2, min + i2)) : charSequence.subSequence(i6, min2 + i4 + min + i6);
        int i7 = min2 + 0;
        o00oOoo0(editorInfo, concat, i7, i4 + i7);
    }
}
