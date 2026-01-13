package o00ooo0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import o00oOooO.o0OOO0OO;
import o0OO000o.o00oOOoO;
import o0OO0o.oO0Ooooo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004\u001aQ\u0010\u0011\u001a\u00020\u000e*\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\u000b\u001a\u00020\t2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0086\bø\u0001\u0000\u001a;\u0010\u0013\u001a\u00020\u000e*\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroid/content/Context;", "o00oOOo0", "(Landroid/content/Context;)Ljava/lang/Object;", "Landroid/util/AttributeSet;", "set", "", "attrs", "", "defStyleAttr", "defStyleRes", "Lkotlin/Function1;", "Landroid/content/res/TypedArray;", "Lo0OO0o/oO0Ooooo;", "Lo0OO0o/o0O000Oo;", "block", "o00oOo00", "resourceId", o00oOOoO.f12961o00oOo00, "core-ktx_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class o0O0000O {
    public static final <T> T o00oOOo0(Context context) {
        o0OOOOO0.o0ooO.o00oo0O0(context, "<this>");
        o0OOOOO0.o0ooO.o00oooOo();
        return (T) o0.getSystemService(context, Object.class);
    }

    public static final void o00oOOoO(@NotNull Context context, @o0OOO0OO int i, @NotNull int[] iArr, @NotNull o0OOOO.o00oo<? super TypedArray, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(context, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "attrs");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "block");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, iArr);
        o0OOOOO0.o0ooO.o00oo0OO(obtainStyledAttributes, "obtainStyledAttributes(resourceId, attrs)");
        o00ooVar.invoke(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public static final void o00oOo00(@NotNull Context context, @Nullable AttributeSet attributeSet, @NotNull int[] iArr, @o00oOooO.o0O000Oo int i, @o0OOO0OO int i2, @NotNull o0OOOO.o00oo<? super TypedArray, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(context, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "attrs");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "block");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        o0OOOOO0.o0ooO.o00oo0OO(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        o00ooVar.invoke(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void o00oOooO(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, o0OOOO.o00oo o00ooVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            attributeSet = null;
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        o0OOOOO0.o0ooO.o00oo0O0(context, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "attrs");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "block");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        o0OOOOO0.o0ooO.o00oo0OO(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        o00ooVar.invoke(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
}
