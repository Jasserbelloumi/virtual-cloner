package o00ooo0;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import kotlin.Metadata;
import o0OO0o.oO0Ooooo;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"Landroid/content/SharedPreferences;", "", "commit", "Lkotlin/Function1;", "Landroid/content/SharedPreferences$Editor;", "Lo0OO0o/oO0Ooooo;", "Lo0OO0o/o0O000Oo;", "action", "o00oOOo0", "core-ktx_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class o0O0o0 {
    @SuppressLint({"ApplySharedPref"})
    public static final void o00oOOo0(@NotNull SharedPreferences sharedPreferences, boolean z, @NotNull o0OOOO.o00oo<? super SharedPreferences.Editor, oO0Ooooo> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sharedPreferences, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "action");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        o0OOOOO0.o0ooO.o00oo0OO(edit, "editor");
        o00ooVar.invoke(edit);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }

    public static /* synthetic */ void o00oOOoO(SharedPreferences sharedPreferences, boolean z, o0OOOO.o00oo o00ooVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        o0OOOOO0.o0ooO.o00oo0O0(sharedPreferences, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "action");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        o0OOOOO0.o0ooO.o00oo0OO(edit, "editor");
        o00ooVar.invoke(edit);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }
}
