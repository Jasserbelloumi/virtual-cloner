package com.skydoves.powerspinner;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.skydoves.powerspinner.PowerSpinnerView;
import java.util.ArrayList;
import java.util.List;
import o0OO0o.oO0Ooooo;
import o0OO0o0.o00oOoO;
import o0OOOO.o00oo;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.Nullable;
@o0OOO00({"SMAP\nPowerSpinnerExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PowerSpinnerExtension.kt\ncom/skydoves/powerspinner/PowerSpinnerExtensionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,68:1\n1855#2,2:69\n*S KotlinDebug\n*F\n+ 1 PowerSpinnerExtension.kt\ncom/skydoves/powerspinner/PowerSpinnerExtensionKt\n*L\n45#1:69,2\n*E\n"})
/* loaded from: classes2.dex */
public final class o00oOOo0 {
    @o00oOoO
    public static final PowerSpinnerView o00oOOo0(Context context, o00oo<? super PowerSpinnerView.o00oOOo0, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O0(context, "context");
        o0ooO.o00oo0O0(o00ooVar, "builder");
        PowerSpinnerView.o00oOOo0 o00oooo02 = new PowerSpinnerView.o00oOOo0(context);
        o00ooVar.invoke(o00oooo02);
        return o00oooo02.f6606o00oOOo0;
    }

    public static final void o00oOOoO(@Nullable View view) {
        List<View> o00oOo002;
        if (view == null || (o00oOo002 = o00oOo00(view)) == null) {
            return;
        }
        for (View view2 : o00oOo002) {
            if (view2 instanceof PowerSpinnerView) {
                ((PowerSpinnerView) view2).o00ooO();
                return;
            }
        }
    }

    public static final List<View> o00oOo00(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                o0ooO.o00oo0OO(childAt, "child");
                arrayList.addAll(o00oOo00(childAt));
            }
        } else {
            arrayList.add(view);
        }
        return arrayList;
    }
}
