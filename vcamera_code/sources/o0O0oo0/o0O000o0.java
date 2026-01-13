package o0O0oo0;

import android.graphics.drawable.Drawable;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Field;
import kotlin.Metadata;
import o00oOooO.o0O00O;
import o00ooo0.o0;
import o00oooOo.oOO000;
import o00oooOo.oOO0000;
import o0OO000o.o00oOOoO;
import o0OOOO0o.o00ooO0;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u001a\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0004H\u0007R\u001c\u0010\r\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0012\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0015"}, d2 = {"Lo0O0oo0/o0O000o0;", "", "Landroid/widget/EditText;", "editText", "", "drawable", "Lo0OO0o/oO0Ooooo;", o00oOOoO.f12961o00oOo00, TtmlNode.ATTR_TTS_COLOR, "o00oOOo0", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "EDIT_TEXT_FIELD_CURSOR_DRAWABLE_RES", "o00oOo00", "EDIT_TEXT_FIELD_EDITOR", "o00oOooO", "EDIT_TEXT_FIELD_CURSOR_DRAWABLE", "<init>", "()V", "simplesearchview_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class o0O000o0 {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f12754o00oOOoO = "mCursorDrawableRes";

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f12755o00oOo00 = "mEditor";

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f12757o00oOooO = "mCursorDrawable";

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final o0O000o0 f12756o00oOo0O = new o0O000o0();

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f12753o00oOOo0 = o0O000o0.class.getSimpleName();

    @o00ooO0
    public static final void o00oOOo0(@NotNull EditText editText, @o0O00O int i) {
        o0ooO.o00oo0O0(editText, "editText");
        try {
            Field declaredField = TextView.class.getDeclaredField(f12754o00oOOoO);
            o0ooO.o00oo0OO(declaredField, "field");
            declaredField.setAccessible(true);
            int i2 = declaredField.getInt(editText);
            Field declaredField2 = TextView.class.getDeclaredField(f12755o00oOo00);
            o0ooO.o00oo0OO(declaredField2, "field");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(editText);
            Drawable drawable = o0.getDrawable(editText.getContext(), i2);
            if (drawable != null) {
                drawable.setColorFilter(oOO0000.o00oOOo0(i, oOO000.SRC_IN));
            }
            Drawable[] drawableArr = {drawable, drawable};
            Field declaredField3 = obj.getClass().getDeclaredField(f12757o00oOooO);
            o0ooO.o00oo0OO(declaredField3, "field");
            declaredField3.setAccessible(true);
            declaredField3.set(obj, drawableArr);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @o00ooO0
    public static final void o00oOOoO(@NotNull EditText editText, int i) {
        o0ooO.o00oo0O0(editText, "editText");
        try {
            Field declaredField = TextView.class.getDeclaredField(f12754o00oOOoO);
            o0ooO.o00oo0OO(declaredField, "f");
            declaredField.setAccessible(true);
            declaredField.set(editText, Integer.valueOf(i));
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
