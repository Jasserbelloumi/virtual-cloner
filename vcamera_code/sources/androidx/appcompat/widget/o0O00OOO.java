package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import java.util.Objects;
import o0O000oo.o00oo00O;
/* loaded from: classes.dex */
public final class o0O00OOO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f1172o00oOOo0 = "ReceiveContent";

    @o00oOooO.o0OOooO0(24)
    /* loaded from: classes.dex */
    public static final class o00oOOo0 {
        @o00oOooO.o0O0O0Oo
        public static boolean o00oOOo0(@o00oOooO.oo0oO0 DragEvent dragEvent, @o00oOooO.oo0oO0 TextView textView, @o00oOooO.oo0oO0 Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                o0O000oo.o0O0o00O.o0oOo0O0(textView, new o00oo00O.o00oOOoO(dragEvent.getClipData(), 3).o00oOOo0());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        @o00oOooO.o0O0O0Oo
        public static boolean o00oOOoO(@o00oOooO.oo0oO0 DragEvent dragEvent, @o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            o0O000oo.o0O0o00O.o0oOo0O0(view, new o00oo00O.o00oOOoO(dragEvent.getClipData(), 3).o00oOOo0());
            return true;
        }
    }

    public static boolean o00oOOo0(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && o0O000oo.o0O0o00O.o0O00(view) != null) {
            Activity o00oOo002 = o00oOo00(view);
            if (o00oOo002 == null) {
                Objects.toString(view);
                return false;
            } else if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            } else {
                if (dragEvent.getAction() == 3) {
                    return view instanceof TextView ? o00oOOo0.o00oOOo0(dragEvent, (TextView) view, o00oOo002) : o00oOOo0.o00oOOoO(dragEvent, view, o00oOo002);
                }
            }
        }
        return false;
    }

    public static boolean o00oOOoO(@o00oOooO.oo0oO0 TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 31 || o0O000oo.o0O0o00O.o0O00(textView) == null || !(i == 16908322 || i == 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            o00oo00O.o00oOOoO o00ooooo2 = new o00oo00O.o00oOOoO(primaryClip, 1);
            o00ooooo2.f10442o00oOOo0.setFlags(i != 16908322 ? 1 : 0);
            o0O000oo.o0O0o00O.o0oOo0O0(textView, o00ooooo2.o00oOOo0());
        }
        return true;
    }

    @o00oOooO.o0OO00OO
    public static Activity o00oOo00(@o00oOooO.oo0oO0 View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
