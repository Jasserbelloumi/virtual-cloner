package o0O0OoOo;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import kotlin.Metadata;
import o0O0OoO.o00oo0O0;
import o0OO000o.o00oOOoO;
import o0OOOoo0.oO0O0;
import o0OOOoo0.oO0O00o0;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002R\u0014\u0010\u0011\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012¨\u0006\u0016"}, d2 = {"Lo0O0OoOo/o0O0OO;", "", "Landroid/content/ComponentName;", "activityComponent", "ruleComponent", "", o00oOOoO.f12961o00oOo00, "(Landroid/content/ComponentName;Landroid/content/ComponentName;)Z", "Landroid/app/Activity;", "activity", "o00oOOo0", "(Landroid/app/Activity;Landroid/content/ComponentName;)Z", "", "name", "pattern", "o00oOo00", "Z", "sDebugMatchers", "Ljava/lang/String;", "sMatchersTag", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
@o00oo0O0
/* loaded from: classes.dex */
public final class o0O0OO {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o0O0OO f12006o00oOOo0 = new o0O0OO();

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final boolean f12007o00oOOoO = false;
    @NotNull

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f12008o00oOo00 = "SplitRuleResolution";

    public final boolean o00oOOo0(@NotNull Activity activity, @NotNull ComponentName componentName) {
        ComponentName component;
        o0OOOOO0.o0ooO.o00oo0O0(activity, "activity");
        o0OOOOO0.o0ooO.o00oo0O0(componentName, "ruleComponent");
        if (o00oOOoO(activity.getComponentName(), componentName)) {
            return true;
        }
        Intent intent = activity.getIntent();
        if (intent == null || (component = intent.getComponent()) == null) {
            return false;
        }
        return f12006o00oOOo0.o00oOOoO(component, componentName);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o00oOOoO(@org.jetbrains.annotations.Nullable android.content.ComponentName r7, @org.jetbrains.annotations.NotNull android.content.ComponentName r8) {
        /*
            r6 = this;
            java.lang.String r0 = "ruleComponent"
            o0OOOOO0.o0ooO.o00oo0O0(r8, r0)
            java.lang.String r0 = "*"
            r1 = 1
            r2 = 0
            if (r7 != 0) goto L22
            java.lang.String r7 = r8.getPackageName()
            boolean r7 = o0OOOOO0.o0ooO.o00oOoO0(r7, r0)
            if (r7 == 0) goto L20
            java.lang.String r7 = r8.getClassName()
            boolean r7 = o0OOOOO0.o0ooO.o00oOoO0(r7, r0)
            if (r7 == 0) goto L20
            goto L21
        L20:
            r1 = r2
        L21:
            return r1
        L22:
            java.lang.String r3 = r7.toString()
            java.lang.String r4 = "activityComponent.toString()"
            o0OOOOO0.o0ooO.o00oo0OO(r3, r4)
            r4 = 2
            r5 = 0
            boolean r0 = o0OOOoo0.oO0O0.o0OOOooO(r3, r0, r2, r4, r5)
            r0 = r0 ^ r1
            if (r0 == 0) goto L8f
            java.lang.String r0 = r7.getPackageName()
            java.lang.String r3 = r8.getPackageName()
            boolean r0 = o0OOOOO0.o0ooO.o00oOoO0(r0, r3)
            if (r0 != 0) goto L5d
            java.lang.String r0 = r7.getPackageName()
            java.lang.String r3 = "activityComponent.packageName"
            o0OOOOO0.o0ooO.o00oo0OO(r0, r3)
            java.lang.String r3 = r8.getPackageName()
            java.lang.String r4 = "ruleComponent.packageName"
            o0OOOOO0.o0ooO.o00oo0OO(r3, r4)
            boolean r0 = r6.o00oOo00(r0, r3)
            if (r0 == 0) goto L5b
            goto L5d
        L5b:
            r0 = r2
            goto L5e
        L5d:
            r0 = r1
        L5e:
            java.lang.String r3 = r7.getClassName()
            java.lang.String r4 = r8.getClassName()
            boolean r3 = o0OOOOO0.o0ooO.o00oOoO0(r3, r4)
            if (r3 != 0) goto L87
            java.lang.String r7 = r7.getClassName()
            java.lang.String r3 = "activityComponent.className"
            o0OOOOO0.o0ooO.o00oo0OO(r7, r3)
            java.lang.String r8 = r8.getClassName()
            java.lang.String r3 = "ruleComponent.className"
            o0OOOOO0.o0ooO.o00oo0OO(r8, r3)
            boolean r7 = r6.o00oOo00(r7, r8)
            if (r7 == 0) goto L85
            goto L87
        L85:
            r7 = r2
            goto L88
        L87:
            r7 = r1
        L88:
            if (r0 == 0) goto L8d
            if (r7 == 0) goto L8d
            goto L8e
        L8d:
            r1 = r2
        L8e:
            return r1
        L8f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Wildcard can only be part of the rule."
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o0O0OoOo.o0O0OO.o00oOOoO(android.content.ComponentName, android.content.ComponentName):boolean");
    }

    public final boolean o00oOo00(String str, String str2) {
        if (oO0O0.o0OOOooO(str2, "*", false, 2, null)) {
            if (o0OOOOO0.o0ooO.o00oOoO0(str2, "*")) {
                return true;
            }
            if (oO0O0.o0OOoOo0(str2, "*", 0, false, 6, null) == oO0O0.o0Oo00oo(str2, "*", 0, false, 6, null) && oO0O00o0.o0O0oooO(str2, "*", false, 2, null)) {
                String substring = str2.substring(0, str2.length() - 1);
                o0OOOOO0.o0ooO.o00oo0OO(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return oO0O00o0.o0OOO0O(str, substring, false, 2, null);
            }
            throw new IllegalArgumentException("Name pattern with a wildcard must only contain a single wildcard in the end".toString());
        }
        return false;
    }
}
