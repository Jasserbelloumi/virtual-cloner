package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import java.util.Objects;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o0O000oo.o0O0OO0;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class o0O000o0 implements o0O0OO0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f2533o00oOOo0 = "ReceiveContent";

    @o0OOooO0(16)
    /* loaded from: classes.dex */
    public static final class o00oOOo0 {
        public static CharSequence o00oOOo0(@oo0oO0 Context context, @oo0oO0 ClipData.Item item, int i) {
            if ((i & 1) != 0) {
                CharSequence coerceToText = item.coerceToText(context);
                return coerceToText instanceof Spanned ? coerceToText.toString() : coerceToText;
            }
            return item.coerceToStyledText(context);
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOOoO {
        public static CharSequence o00oOOo0(@oo0oO0 Context context, @oo0oO0 ClipData.Item item, int i) {
            CharSequence coerceToText = item.coerceToText(context);
            return ((i & 1) == 0 || !(coerceToText instanceof Spanned)) ? coerceToText : coerceToText.toString();
        }
    }

    public static CharSequence o00oOOoO(@oo0oO0 Context context, @oo0oO0 ClipData.Item item, int i) {
        return o00oOOo0.o00oOOo0(context, item, i);
    }

    public static void o00oOo00(@oo0oO0 Editable editable, @oo0oO0 CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    @Override // o0O000oo.o0O0OO0
    @o0OO00OO
    public o0O000oo.o00oo00O o00oOOo0(@oo0oO0 View view, @oo0oO0 o0O000oo.o00oo00O o00oo00o) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Objects.toString(o00oo00o);
        }
        if (o00oo00o.o00oOoO0() == 2) {
            return o00oo00o;
        }
        ClipData o00oOo002 = o00oo00o.o00oOo00();
        int o00oOo0O2 = o00oo00o.o00oOo0O();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < o00oOo002.getItemCount(); i++) {
            CharSequence o00oOOo02 = o00oOOo0.o00oOOo0(context, o00oOo002.getItemAt(i), o00oOo0O2);
            if (o00oOOo02 != null) {
                if (z) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), o00oOOo02);
                } else {
                    o00oOo00(editable, o00oOOo02);
                    z = true;
                }
            }
        }
        return null;
    }
}
