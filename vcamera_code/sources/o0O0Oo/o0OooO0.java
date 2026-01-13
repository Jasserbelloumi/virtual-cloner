package o0O0Oo;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.o0O00;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import o00oOooO.o0O0000O;
import o00oOooO.o0OO0oO;
import o00oooOo.oOO0O0O0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o0OooO0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f11749o00oOOo0 = "AnimatorInflater";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f11750o00oOOoO = 0;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f11751o00oOo00 = 100;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f11752o00oOo0O = 1;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f11753o00oOo0o = 2;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f11754o00oOoO = 4;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int f11755o00oOoO0 = 3;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final boolean f11756o00oOoOO = false;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f11757o00oOooO = 0;

    /* loaded from: classes.dex */
    public static class o00oOOo0 implements TypeEvaluator<oOO0O0O0.o00oOOoO[]> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public oOO0O0O0.o00oOOoO[] f11758o00oOOo0;

        public o00oOOo0() {
        }

        public o00oOOo0(oOO0O0O0.o00oOOoO[] o00oooooArr) {
            this.f11758o00oOOo0 = o00oooooArr;
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: o00oOOo0 */
        public oOO0O0O0.o00oOOoO[] evaluate(float f, oOO0O0O0.o00oOOoO[] o00oooooArr, oOO0O0O0.o00oOOoO[] o00oooooArr2) {
            if (oOO0O0O0.o00oOOoO(o00oooooArr, o00oooooArr2)) {
                if (!oOO0O0O0.o00oOOoO(this.f11758o00oOOo0, o00oooooArr)) {
                    this.f11758o00oOOo0 = oOO0O0O0.o00oOo0o(o00oooooArr);
                }
                for (int i = 0; i < o00oooooArr.length; i++) {
                    this.f11758o00oOOo0[i].o00oOooO(o00oooooArr[i], o00oooooArr2[i], f);
                }
                return this.f11758o00oOOo0;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    public static Animator o00oOOo0(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f) throws XmlPullParserException, IOException {
        return o00oOOoO(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.animation.Animator o00oOOoO(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0O0Oo.o0OooO0.o00oOOoO(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    public static Keyframe o00oOo00(Keyframe keyframe, float f) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f) : Keyframe.ofObject(f);
    }

    public static void o00oOo0O(Object[] objArr, String str) {
        if (objArr == null || objArr.length == 0) {
            return;
        }
        for (Object obj : objArr) {
            Keyframe keyframe = (Keyframe) obj;
            Object obj2 = "null";
            Objects.toString(keyframe.getFraction() < 0.0f ? "null" : Float.valueOf(keyframe.getFraction()));
            if (keyframe.hasValue()) {
                obj2 = keyframe.getValue();
            }
            Objects.toString(obj2);
        }
    }

    public static PropertyValuesHolder o00oOo0o(TypedArray typedArray, int i, int i2, int i3, String str) {
        PropertyValuesHolder ofInt;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i4 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        int i5 = z2 ? peekValue2.type : 0;
        if (i == 4) {
            i = ((z && o00oOoOO(i4)) || (z2 && o00oOoOO(i5))) ? 3 : 0;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            oOO0O0O0.o00oOOoO[] o00oOooO2 = oOO0O0O0.o00oOooO(string);
            oOO0O0O0.o00oOOoO[] o00oOooO3 = oOO0O0O0.o00oOooO(string2);
            if (o00oOooO2 == null && o00oOooO3 == null) {
                return null;
            }
            if (o00oOooO2 == null) {
                if (o00oOooO3 != null) {
                    return PropertyValuesHolder.ofObject(str, new o00oOOo0(), o00oOooO3);
                }
                return null;
            }
            o00oOOo0 o00oooo02 = new o00oOOo0();
            if (o00oOooO3 == null) {
                ofObject = PropertyValuesHolder.ofObject(str, o00oooo02, o00oOooO2);
            } else if (!oOO0O0O0.o00oOOoO(o00oOooO2, o00oOooO3)) {
                throw new InflateException(o0O00.o00oOOo0(" Can't morph from ", string, " to ", string2));
            } else {
                ofObject = PropertyValuesHolder.ofObject(str, o00oooo02, o00oOooO2, o00oOooO3);
            }
            return ofObject;
        }
        oo0OOoo o00oOOo02 = i == 3 ? oo0OOoo.o00oOOo0() : null;
        if (z3) {
            if (z) {
                float dimension = i4 == 5 ? typedArray.getDimension(i2, 0.0f) : typedArray.getFloat(i2, 0.0f);
                if (z2) {
                    ofInt = PropertyValuesHolder.ofFloat(str, dimension, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                } else {
                    ofInt = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                ofInt = PropertyValuesHolder.ofFloat(str, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
            }
        } else if (!z) {
            if (z2) {
                ofInt = PropertyValuesHolder.ofInt(str, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : o00oOoOO(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
            }
            if (propertyValuesHolder == null && o00oOOo02 != null) {
                propertyValuesHolder.setEvaluator(o00oOOo02);
                return propertyValuesHolder;
            }
        } else {
            int dimension2 = i4 == 5 ? (int) typedArray.getDimension(i2, 0.0f) : o00oOoOO(i4) ? typedArray.getColor(i2, 0) : typedArray.getInt(i2, 0);
            if (z2) {
                ofInt = PropertyValuesHolder.ofInt(str, dimension2, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : o00oOoOO(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
            } else {
                ofInt = PropertyValuesHolder.ofInt(str, dimension2);
            }
        }
        propertyValuesHolder = ofInt;
        return propertyValuesHolder == null ? propertyValuesHolder : propertyValuesHolder;
    }

    public static int o00oOoO(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray o00oo0o02 = o00ooo0o.o0O0o00.o00oo0o0(resources, theme, attributeSet, o0O0OO.f11607o0O00);
        int i = 0;
        TypedValue o00oo0o2 = o00ooo0o.o0O0o00.o00oo0o(o00oo0o02, xmlPullParser, "value", 0);
        if ((o00oo0o2 != null) && o00oOoOO(o00oo0o2.type)) {
            i = 3;
        }
        o00oo0o02.recycle();
        return i;
    }

    public static int o00oOoO0(TypedArray typedArray, int i, int i2) {
        TypedValue peekValue = typedArray.peekValue(i);
        boolean z = peekValue != null;
        int i3 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i2);
        boolean z2 = peekValue2 != null;
        return ((z && o00oOoOO(i3)) || (z2 && o00oOoOO(z2 ? peekValue2.type : 0))) ? 3 : 0;
    }

    public static boolean o00oOoOO(int i) {
        return i >= 28 && i <= 31;
    }

    public static Animator o00oOoOo(Context context, @o0O0000O int i) throws Resources.NotFoundException {
        return AnimatorInflater.loadAnimator(context, i);
    }

    public static Animator o00oOoo0(Context context, Resources resources, Resources.Theme theme, @o0O0000O int i) throws Resources.NotFoundException {
        return o00oOooo(context, resources, theme, i, 1.0f);
    }

    public static void o00oOooO(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((i2 - i) + 2);
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    public static Animator o00oOooo(Context context, Resources resources, Resources.Theme theme, @o0O0000O int i, float f) throws Resources.NotFoundException {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = resources.getAnimation(i);
                    return o00oOOo0(context, resources, theme, xmlResourceParser, f);
                } catch (XmlPullParserException e) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                    notFoundException.initCause(e);
                    throw notFoundException;
                }
            } catch (IOException e2) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException2.initCause(e2);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    public static Keyframe o00oo0(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        TypedArray o00oo0o02 = o00ooo0o.o0O0o00.o00oo0o0(resources, theme, attributeSet, o0O0OO.f11607o0O00);
        float o00oOoOo2 = o00ooo0o.o0O0o00.o00oOoOo(o00oo0o02, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue o00oo0o2 = o00ooo0o.o0O0o00.o00oo0o(o00oo0o02, xmlPullParser, "value", 0);
        boolean z = o00oo0o2 != null;
        if (i == 4) {
            i = (z && o00oOoOO(o00oo0o2.type)) ? 3 : 0;
        }
        Keyframe ofInt = z ? i != 0 ? (i == 1 || i == 3) ? Keyframe.ofInt(o00oOoOo2, o00ooo0o.o0O0o00.o00oOoo0(o00oo0o02, xmlPullParser, "value", 0, 0)) : null : Keyframe.ofFloat(o00oOoOo2, o00ooo0o.o0O0o00.o00oOoOo(o00oo0o02, xmlPullParser, "value", 0, 0.0f)) : i == 0 ? Keyframe.ofFloat(o00oOoOo2) : Keyframe.ofInt(o00oOoOo2);
        int o00oOooo2 = o00ooo0o.o0O0o00.o00oOooo(o00oo0o02, xmlPullParser, "interpolator", 1, 0);
        if (o00oOooo2 > 0) {
            ofInt.setInterpolator(AnimationUtils.loadInterpolator(context, o00oOooo2));
        }
        o00oo0o02.recycle();
        return ofInt;
    }

    public static ValueAnimator o00oo00O(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        TypedArray o00oo0o02 = o00ooo0o.o0O0o00.o00oo0o0(resources, theme, attributeSet, o0O0OO.f11603o00oooo);
        TypedArray o00oo0o03 = o00ooo0o.o0O0o00.o00oo0o0(resources, theme, attributeSet, o0O0OO.f11620o0O00OO);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        o00oo0Oo(valueAnimator, o00oo0o02, o00oo0o03, f, xmlPullParser);
        int o00oOooo2 = o00ooo0o.o0O0o00.o00oOooo(o00oo0o02, xmlPullParser, "interpolator", 0, 0);
        if (o00oOooo2 > 0) {
            valueAnimator.setInterpolator(AnimationUtils.loadInterpolator(context, o00oOooo2));
        }
        o00oo0o02.recycle();
        if (o00oo0o03 != null) {
            o00oo0o03.recycle();
        }
        return valueAnimator;
    }

    public static PropertyValuesHolder[] o00oo0O(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int i;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType == 2 && xmlPullParser.getName().equals("propertyValuesHolder")) {
                TypedArray o00oo0o02 = o00ooo0o.o0O0o00.o00oo0o0(resources, theme, attributeSet, o0O0OO.f11634o0OoOoOO);
                String o00oo00O2 = o00ooo0o.o0O0o00.o00oo00O(o00oo0o02, xmlPullParser, "propertyName", 3);
                int o00oOoo02 = o00ooo0o.o0O0o00.o00oOoo0(o00oo0o02, xmlPullParser, "valueType", 2, 4);
                PropertyValuesHolder o00oo0O02 = o00oo0O0(context, resources, theme, xmlPullParser, o00oo00O2, o00oOoo02);
                if (o00oo0O02 == null) {
                    o00oo0O02 = o00oOo0o(o00oo0o02, o00oOoo02, 0, 1, o00oo00O2);
                }
                if (o00oo0O02 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(o00oo0O02);
                }
                o00oo0o02.recycle();
            }
            xmlPullParser.next();
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i = 0; i < size; i++) {
                propertyValuesHolderArr[i] = (PropertyValuesHolder) arrayList.get(i);
            }
        }
        return propertyValuesHolderArr;
    }

    public static PropertyValuesHolder o00oo0O0(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i) throws XmlPullParserException, IOException {
        int size;
        PropertyValuesHolder propertyValuesHolder = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            } else if (xmlPullParser.getName().equals("keyframe")) {
                if (i == 4) {
                    i = o00oOoO(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe o00oo02 = o00oo0(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i, xmlPullParser);
                if (o00oo02 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(o00oo02);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < 0.0f) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), o00oOo00(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != 0.0f) {
                if (fraction2 < 0.0f) {
                    keyframe.setFraction(0.0f);
                } else {
                    arrayList.add(0, o00oOo00(keyframe, 0.0f));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i2 = 0; i2 < size; i2++) {
                Keyframe keyframe3 = keyframeArr[i2];
                if (keyframe3.getFraction() < 0.0f) {
                    if (i2 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int i3 = size - 1;
                        if (i2 == i3) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i4 = i2;
                            for (int i5 = i2 + 1; i5 < i3 && keyframeArr[i5].getFraction() < 0.0f; i5++) {
                                i4 = i5;
                            }
                            o00oOooO(keyframeArr, keyframeArr[i4 + 1].getFraction() - keyframeArr[i2 - 1].getFraction(), i2, i4);
                        }
                    }
                }
            }
            propertyValuesHolder = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i == 3) {
                propertyValuesHolder.setEvaluator(oo0OOoo.o00oOOo0());
            }
        }
        return propertyValuesHolder;
    }

    public static ObjectAnimator o00oo0OO(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        o00oo00O(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    public static void o00oo0Oo(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        long o00oOoo02 = o00ooo0o.o0O0o00.o00oOoo0(typedArray, xmlPullParser, "duration", 1, 300);
        long o00oOoo03 = o00ooo0o.o0O0o00.o00oOoo0(typedArray, xmlPullParser, "startOffset", 2, 0);
        int o00oOoo04 = o00ooo0o.o0O0o00.o00oOoo0(typedArray, xmlPullParser, "valueType", 7, 4);
        if (o00ooo0o.o0O0o00.o00oo0Oo(xmlPullParser, "valueFrom") && o00ooo0o.o0O0o00.o00oo0Oo(xmlPullParser, "valueTo")) {
            if (o00oOoo04 == 4) {
                o00oOoo04 = o00oOoO0(typedArray, 5, 6);
            }
            PropertyValuesHolder o00oOo0o2 = o00oOo0o(typedArray, o00oOoo04, 5, 6, "");
            if (o00oOo0o2 != null) {
                valueAnimator.setValues(o00oOo0o2);
            }
        }
        valueAnimator.setDuration(o00oOoo02);
        valueAnimator.setStartDelay(o00oOoo03);
        valueAnimator.setRepeatCount(o00ooo0o.o0O0o00.o00oOoo0(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(o00ooo0o.o0O0o00.o00oOoo0(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            o00oo0o0(valueAnimator, typedArray2, o00oOoo04, f, xmlPullParser);
        }
    }

    public static void o00oo0o(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f2 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f3 = 0.0f;
        do {
            f3 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f3));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f3 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f4 = f3 / (min - 1);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= min) {
                break;
            }
            pathMeasure2.getPosTan(f2 - ((Float) arrayList.get(i2)).floatValue(), fArr3, null);
            fArr[i] = fArr3[0];
            fArr2[i] = fArr3[1];
            f2 += f4;
            int i3 = i2 + 1;
            if (i3 < arrayList.size() && f2 > ((Float) arrayList.get(i3)).floatValue()) {
                pathMeasure2.nextContour();
                i2 = i3;
            }
            i++;
        }
        PropertyValuesHolder ofFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder ofFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (ofFloat == null) {
            objectAnimator.setValues(ofFloat2);
        } else if (ofFloat2 == null) {
            objectAnimator.setValues(ofFloat);
        } else {
            objectAnimator.setValues(ofFloat, ofFloat2);
        }
    }

    public static void o00oo0o0(ValueAnimator valueAnimator, TypedArray typedArray, int i, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String o00oo00O2 = o00ooo0o.o0O0o00.o00oo00O(typedArray, xmlPullParser, "pathData", 1);
        if (o00oo00O2 == null) {
            objectAnimator.setPropertyName(o00ooo0o.o0O0o00.o00oo00O(typedArray, xmlPullParser, "propertyName", 0));
            return;
        }
        String o00oo00O3 = o00ooo0o.o0O0o00.o00oo00O(typedArray, xmlPullParser, "propertyXName", 2);
        String o00oo00O4 = o00ooo0o.o0O0o00.o00oo00O(typedArray, xmlPullParser, "propertyYName", 3);
        if (i != 2) {
        }
        if (o00oo00O3 != null || o00oo00O4 != null) {
            o00oo0o(oOO0O0O0.o00oOo0O(o00oo00O2), objectAnimator, f * 0.5f, o00oo00O3, o00oo00O4);
            return;
        }
        throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
    }
}
