package com.willy.ratingbar;

import android.view.MotionEvent;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
/* loaded from: classes2.dex */
public class o00oOo0O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static DecimalFormat f6657o00oOOo0 = null;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f6658o00oOOoO = 5;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f6659o00oOo00 = 200;

    public static float o00oOOo0(o00oOo00 o00ooo002, float f, float f2) {
        DecimalFormat o00oOOoO2 = o00oOOoO();
        return Float.parseFloat(o00oOOoO2.format(((Integer) o00ooo002.getTag()).intValue() - (1.0f - (Math.round(Float.parseFloat(o00oOOoO2.format((f2 - o00ooo002.getLeft()) / o00ooo002.getWidth())) / f) * f))));
    }

    public static DecimalFormat o00oOOoO() {
        if (f6657o00oOOo0 == null) {
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.ENGLISH);
            decimalFormatSymbols.setDecimalSeparator('.');
            f6657o00oOOo0 = new DecimalFormat("#.##", decimalFormatSymbols);
        }
        return f6657o00oOOo0;
    }

    public static float o00oOo00(float f, int i, float f2) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f3 = i;
        if (f > f3) {
            f = f3;
        }
        return f % f2 != 0.0f ? f2 : f;
    }

    public static boolean o00oOooO(float f, float f2, MotionEvent motionEvent) {
        if (((float) (motionEvent.getEventTime() - motionEvent.getDownTime())) > 200.0f) {
            return false;
        }
        return Math.abs(f - motionEvent.getX()) <= 5.0f && Math.abs(f2 - motionEvent.getY()) <= 5.0f;
    }
}
