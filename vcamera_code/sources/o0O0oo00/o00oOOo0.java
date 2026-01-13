package o0O0oo00;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.afollestad.materialdialogs.R;
import kotlin.Metadata;
import o00oOooO.o0OO0oO;
import o0O0oOo.o0OooO0;
import o0O0oo0O.o0OO00OO;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0004R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R*\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006%"}, d2 = {"Lo0O0oo00/o00oOOo0;", "Landroid/view/ViewGroup;", "", "getDividerColor", "Landroid/graphics/Paint;", "o00oOOo0", "o00oo0O0", "Landroid/graphics/Paint;", "dividerPaint", "o00oo0O", "I", "getDividerHeight", "()I", "dividerHeight", "Lo0O0oo0O/o0OO00OO;", "o00oo0Oo", "Lo0O0oo0O/o0OO00OO;", "getDialog", "()Lo0O0oo0O/o0OO00OO;", "setDialog", "(Lo0O0oo0O/o0OO00OO;)V", "dialog", "", "value", "o00oo0o0", "Z", "getDrawDivider", "()Z", "setDrawDivider", "(Z)V", "drawDivider", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "core"}, k = 1, mv = {1, 4, 0})
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public abstract class o00oOOo0 extends ViewGroup {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final int f12772o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Paint f12773o00oo0O0;
    @NotNull

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public o0OO00OO f12774o00oo0Oo;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public boolean f12775o00oo0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oOOo0(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        o0ooO.o00oo0O(context, "context");
        Paint paint = new Paint();
        this.f12773o00oo0O0 = paint;
        o0OooO0 o0oooo0 = o0OooO0.f12732o00oOOo0;
        int i = R.dimen.md_divider_height;
        this.f12772o00oo0O = o0oooo0.o00oOo0O(this, i);
        setWillNotDraw(false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(context.getResources().getDimension(i));
        paint.setAntiAlias(true);
    }

    public /* synthetic */ o00oOOo0(Context context, AttributeSet attributeSet, int i, o0O00 o0o00) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final int getDividerColor() {
        o0OooO0 o0oooo0 = o0OooO0.f12732o00oOOo0;
        o0OO00OO o0oo00oo = this.f12774o00oo0Oo;
        if (o0oo00oo == null) {
            o0ooO.o00ooooO("dialog");
        }
        Context context = o0oo00oo.getContext();
        o0ooO.o00oOoO(context, "dialog.context");
        return o0OooO0.o00oo0O(o0oooo0, context, null, Integer.valueOf(R.attr.md_divider_color), null, 10, null);
    }

    @NotNull
    public final o0OO00OO getDialog() {
        o0OO00OO o0oo00oo = this.f12774o00oo0Oo;
        if (o0oo00oo == null) {
            o0ooO.o00ooooO("dialog");
        }
        return o0oo00oo;
    }

    public final int getDividerHeight() {
        return this.f12772o00oo0O;
    }

    public final boolean getDrawDivider() {
        return this.f12775o00oo0o0;
    }

    @NotNull
    public final Paint o00oOOo0() {
        this.f12773o00oo0O0.setColor(getDividerColor());
        return this.f12773o00oo0O0;
    }

    public final void setDialog(@NotNull o0OO00OO o0oo00oo) {
        o0ooO.o00oo0O(o0oo00oo, "<set-?>");
        this.f12774o00oo0Oo = o0oo00oo;
    }

    public final void setDrawDivider(boolean z) {
        this.f12775o00oo0o0 = z;
        invalidate();
    }
}
