package o0O0OoOo;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.support.v4.media.o00oOo0O;
import kotlin.Metadata;
import o0O0OoO.o00oo0O0;
import o0OO000o.o00oOOoO;
import o0OOOoo0.oO0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0013\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u001a"}, d2 = {"Lo0O0OoOo/o0O00;", "", "Landroid/content/Intent;", "intent", "", "o00oOooO", "Landroid/app/Activity;", "activity", "o00oOo00", "other", "equals", "", "hashCode", "", "toString", "Landroid/content/ComponentName;", "o00oOOo0", "Landroid/content/ComponentName;", "()Landroid/content/ComponentName;", "componentName", o00oOOoO.f12961o00oOo00, "Ljava/lang/String;", "()Ljava/lang/String;", "intentAction", "<init>", "(Landroid/content/ComponentName;Ljava/lang/String;)V", "window_release"}, k = 1, mv = {1, 6, 0})
@o00oo0O0
/* loaded from: classes.dex */
public final class o0O00 {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final ComponentName f11990o00oOOo0;
    @Nullable

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final String f11991o00oOOoO;

    public o0O00(@NotNull ComponentName componentName, @Nullable String str) {
        o0OOOOO0.o0ooO.o00oo0O0(componentName, "componentName");
        this.f11990o00oOOo0 = componentName;
        this.f11991o00oOOoO = str;
        String packageName = componentName.getPackageName();
        o0OOOOO0.o0ooO.o00oo0OO(packageName, "componentName.packageName");
        String className = componentName.getClassName();
        o0OOOOO0.o0ooO.o00oo0OO(className, "componentName.className");
        boolean z = true;
        if (!(packageName.length() > 0)) {
            throw new IllegalArgumentException("Package name must not be empty".toString());
        }
        if (!(className.length() > 0)) {
            throw new IllegalArgumentException("Activity class name must not be empty.".toString());
        }
        if (!(!oO0O0.o0OOOooO(packageName, "*", false, 2, null) || oO0O0.o0OOoOo0(packageName, "*", 0, false, 6, null) == packageName.length() - 1)) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
        }
        if (oO0O0.o0OOOooO(className, "*", false, 2, null) && oO0O0.o0OOoOo0(className, "*", 0, false, 6, null) != className.length() - 1) {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0O00) {
            o0O00 o0o00 = (o0O00) obj;
            return o0OOOOO0.o0ooO.o00oOoO0(this.f11990o00oOOo0, o0o00.f11990o00oOOo0) && o0OOOOO0.o0ooO.o00oOoO0(this.f11991o00oOOoO, o0o00.f11991o00oOOoO);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f11990o00oOOo0.hashCode() * 31;
        String str = this.f11991o00oOOoO;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final ComponentName o00oOOo0() {
        return this.f11990o00oOOo0;
    }

    @Nullable
    public final String o00oOOoO() {
        return this.f11991o00oOOoO;
    }

    public final boolean o00oOo00(@NotNull Activity activity) {
        o0OOOOO0.o0ooO.o00oo0O0(activity, "activity");
        if (o0O0OO.f12006o00oOOo0.o00oOOo0(activity, this.f11990o00oOOo0)) {
            String str = this.f11991o00oOOoO;
            if (str != null) {
                Intent intent = activity.getIntent();
                if (o0OOOOO0.o0ooO.o00oOoO0(str, intent == null ? null : intent.getAction())) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean o00oOooO(@NotNull Intent intent) {
        o0OOOOO0.o0ooO.o00oo0O0(intent, "intent");
        if (o0O0OO.f12006o00oOOo0.o00oOOoO(intent.getComponent(), this.f11990o00oOOo0)) {
            String str = this.f11991o00oOOoO;
            return str == null || o0OOOOO0.o0ooO.o00oOoO0(str, intent.getAction());
        }
        return false;
    }

    @NotNull
    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("ActivityFilter(componentName=");
        o00oOOo02.append(this.f11990o00oOOo0);
        o00oOOo02.append(", intentAction=");
        o00oOOo02.append((Object) this.f11991o00oOOoO);
        o00oOOo02.append(')');
        return o00oOOo02.toString();
    }
}
