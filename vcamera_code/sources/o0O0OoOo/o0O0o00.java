package o0O0OoOo;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import androidx.window.R;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Set;
import kotlin.Metadata;
import o0O0OoO.o00oo0O0;
import o0OO000o.o00oOOoO;
import o0OOOoo0.oO0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ \u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0002J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J\u001a\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¨\u0006 "}, d2 = {"Lo0O0OoOo/o0O0o00;", "", "Landroid/content/Context;", "context", "", "staticRuleResourceId", "", "Lo0O0OoOo/o0O0oo0o;", "o00oOoO0", "(Landroid/content/Context;I)Ljava/util/Set;", "splitResourceId", "o00oOoO", "Landroid/content/res/XmlResourceParser;", "parser", "Lo0O0OoOo/o0OooO0;", "o00oOo0O", "Lo0O0OoOo/oo0OOoo;", "o00oOo0o", "Lo0O0OoOo/o0O0OOOo;", "o00oOooO", "Lo0O0OoOo/o0O00O0;", "o00oOo00", "Lo0O0OoOo/o0O00;", o00oOOoO.f12961o00oOo00, "", "pkg", "", "clsSeq", "Landroid/content/ComponentName;", "o00oOOo0", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
@o00oo0O0
/* loaded from: classes.dex */
public final class o0O0o00 {
    public final ComponentName o00oOOo0(String str, CharSequence charSequence) {
        if (charSequence != null) {
            if (!(charSequence.length() == 0)) {
                String obj = charSequence.toString();
                if (obj.charAt(0) == '.') {
                    return new ComponentName(str, o0OOOOO0.o0ooO.o00ooOO0(str, obj));
                }
                int o0OOoOOO2 = oO0O0.o0OOoOOO(obj, '/', 0, false, 6, null);
                if (o0OOoOOO2 > 0) {
                    str = obj.substring(0, o0OOoOOO2);
                    o0OOOOO0.o0ooO.o00oo0OO(str, "this as java.lang.String…ing(startIndex, endIndex)");
                    obj = obj.substring(o0OOoOOO2 + 1);
                    o0OOOOO0.o0ooO.o00oo0OO(obj, "this as java.lang.String).substring(startIndex)");
                }
                if (o0OOOOO0.o0ooO.o00oOoO0(obj, "*") || oO0O0.o0OOoOOO(obj, '.', 0, false, 6, null) >= 0) {
                    return new ComponentName(str, obj);
                }
                return new ComponentName(str, str + '.' + obj);
            }
        }
        throw new IllegalArgumentException("Activity name must not be null");
    }

    public final o0O00 o00oOOoO(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, R.styleable.ActivityFilter, 0, 0);
        String string = obtainStyledAttributes.getString(R.styleable.ActivityFilter_activityName);
        String string2 = obtainStyledAttributes.getString(R.styleable.ActivityFilter_activityAction);
        String packageName = context.getApplicationContext().getPackageName();
        o0OOOOO0.o0ooO.o00oo0OO(packageName, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
        return new o0O00(o00oOOo0(packageName, string), string2);
    }

    public final o0O00O0 o00oOo00(Context context, XmlResourceParser xmlResourceParser) {
        return new o0O00O0(o0OO0oO.o0O0OO.INSTANCE, context.getTheme().obtainStyledAttributes(xmlResourceParser, R.styleable.ActivityRule, 0, 0).getBoolean(R.styleable.ActivityRule_alwaysExpand, false));
    }

    public final o0OooO0 o00oOo0O(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, R.styleable.SplitPairRule, 0, 0);
        float f = obtainStyledAttributes.getFloat(R.styleable.SplitPairRule_splitRatio, 0.0f);
        int dimension = (int) obtainStyledAttributes.getDimension(R.styleable.SplitPairRule_splitMinWidth, 0.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(R.styleable.SplitPairRule_splitMinSmallestWidth, 0.0f);
        int i = obtainStyledAttributes.getInt(R.styleable.SplitPairRule_splitLayoutDirection, 3);
        return new o0OooO0(o0OO0oO.o0O0OO.INSTANCE, obtainStyledAttributes.getBoolean(R.styleable.SplitPairRule_finishPrimaryWithSecondary, false), obtainStyledAttributes.getBoolean(R.styleable.SplitPairRule_finishSecondaryWithPrimary, true), obtainStyledAttributes.getBoolean(R.styleable.SplitPairRule_clearTop, false), dimension, dimension2, f, i);
    }

    public final oo0OOoo o00oOo0o(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, R.styleable.SplitPlaceholderRule, 0, 0);
        String string = obtainStyledAttributes.getString(R.styleable.SplitPlaceholderRule_placeholderActivityName);
        float f = obtainStyledAttributes.getFloat(R.styleable.SplitPlaceholderRule_splitRatio, 0.0f);
        int dimension = (int) obtainStyledAttributes.getDimension(R.styleable.SplitPlaceholderRule_splitMinWidth, 0.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(R.styleable.SplitPlaceholderRule_splitMinSmallestWidth, 0.0f);
        int i = obtainStyledAttributes.getInt(R.styleable.SplitPlaceholderRule_splitLayoutDirection, 3);
        String packageName = context.getApplicationContext().getPackageName();
        o0OOOOO0.o0ooO.o00oo0OO(packageName, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
        ComponentName o00oOOo02 = o00oOOo0(packageName, string);
        o0OO0oO.o0O0OO o0o0oo = o0OO0oO.o0O0OO.INSTANCE;
        Intent component = new Intent().setComponent(o00oOOo02);
        o0OOOOO0.o0ooO.o00oo0OO(component, "Intent().setComponent(pl…eholderActivityClassName)");
        return new oo0OOoo(o0o0oo, component, dimension, dimension2, f, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e5, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Set<o0O0OoOo.o0O0oo0o> o00oOoO(android.content.Context r9, int r10) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0O0OoOo.o0O0o00.o00oOoO(android.content.Context, int):java.util.Set");
    }

    @Nullable
    public final Set<o0O0oo0o> o00oOoO0(@NotNull Context context, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(context, "context");
        return o00oOoO(context, i);
    }

    public final o0O0OOOo o00oOooO(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, R.styleable.SplitPairFilter, 0, 0);
        String string = obtainStyledAttributes.getString(R.styleable.SplitPairFilter_primaryActivityName);
        String string2 = obtainStyledAttributes.getString(R.styleable.SplitPairFilter_secondaryActivityName);
        String string3 = obtainStyledAttributes.getString(R.styleable.SplitPairFilter_secondaryActivityAction);
        String packageName = context.getApplicationContext().getPackageName();
        o0OOOOO0.o0ooO.o00oo0OO(packageName, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
        return new o0O0OOOo(o00oOOo0(packageName, string), o00oOOo0(packageName, string2), string3);
    }
}
