package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.ViewGroup;
import java.io.IOException;
import java.lang.reflect.Constructor;
import o00oOooO.oo0oO0;
import o00ooo0o.o0O0o00;
import o0O0Oo.o0O0OOO;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class o0O000 {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final Class<?>[] f5110o00oOOoO = {Context.class, AttributeSet.class};

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final androidx.collection.o00oOOo0<String, Constructor<?>> f5111o00oOo00 = new androidx.collection.o00oOOo0<>();

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Context f5112o00oOOo0;

    public o0O000(@oo0oO0 Context context) {
        this.f5112o00oOOo0 = context;
    }

    @oo0oO0
    public static o0O000 o00oOooO(@oo0oO0 Context context) {
        return new o0O000(context);
    }

    public final Object o00oOOo0(AttributeSet attributeSet, Class<?> cls, String str) {
        Object newInstance;
        Class<? extends U> asSubclass;
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        if (attributeValue != null) {
            try {
                androidx.collection.o00oOOo0<String, Constructor<?>> o00oooo02 = f5111o00oOo00;
                synchronized (o00oooo02) {
                    Constructor<?> constructor = o00oooo02.get(attributeValue);
                    if (constructor == null && (asSubclass = Class.forName(attributeValue, false, this.f5112o00oOOo0.getClassLoader()).asSubclass(cls)) != 0) {
                        constructor = asSubclass.getConstructor(f5110o00oOOoO);
                        constructor.setAccessible(true);
                        o00oooo02.put(attributeValue, constructor);
                    }
                    newInstance = constructor.newInstance(this.f5112o00oOOo0, attributeSet);
                }
                return newInstance;
            } catch (Exception e) {
                throw new InflateException("Could not instantiate " + cls + " class " + attributeValue, e);
            }
        }
        throw new InflateException(o00oOoOo.o00oo.o00oOOo0(str, " tag must have a 'class' attribute"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0173, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.transition.o0O0000O o00oOOoO(org.xmlpull.v1.XmlPullParser r8, android.util.AttributeSet r9, androidx.transition.o0O0000O r10) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.o0O000.o00oOOoO(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, androidx.transition.o0O0000O):androidx.transition.o0O0000O");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.transition.o0OoOoOo o00oOo00(org.xmlpull.v1.XmlPullParser r5, android.util.AttributeSet r6, android.view.ViewGroup r7) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r4 = this;
            int r0 = r5.getDepth()
            r1 = 0
        L5:
            int r2 = r5.next()
            r3 = 3
            if (r2 != r3) goto L12
            int r3 = r5.getDepth()
            if (r3 <= r0) goto L50
        L12:
            r3 = 1
            if (r2 == r3) goto L50
            r3 = 2
            if (r2 == r3) goto L19
            goto L5
        L19:
            java.lang.String r2 = r5.getName()
            java.lang.String r3 = "transitionManager"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L2b
            androidx.transition.o0OoOoOo r1 = new androidx.transition.o0OoOoOo
            r1.<init>()
            goto L5
        L2b:
            java.lang.String r3 = "transition"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L39
            if (r1 == 0) goto L39
            r4.o00oOoO(r6, r5, r7, r1)
            goto L5
        L39:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r7 = "Unknown scene name: "
            java.lang.StringBuilder r7 = android.support.v4.media.o00oOo0O.o00oOOo0(r7)
            java.lang.String r5 = r5.getName()
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
        L50:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.o0O000.o00oOo00(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.ViewGroup):androidx.transition.o0OoOoOo");
    }

    @SuppressLint({"RestrictedApi"})
    public final void o00oOo0O(XmlPullParser xmlPullParser, AttributeSet attributeSet, o0O0000O o0o0000o) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                if (!xmlPullParser.getName().equals(o0O0OOO.f11641o00ooO0O)) {
                    StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Unknown scene name: ");
                    o00oOOo02.append(xmlPullParser.getName());
                    throw new RuntimeException(o00oOOo02.toString());
                }
                TypedArray obtainStyledAttributes = this.f5112o00oOOo0.obtainStyledAttributes(attributeSet, o0O00000.f5113o00oOOo0);
                int o00oOooo2 = o0O0o00.o00oOooo(obtainStyledAttributes, xmlPullParser, "targetId", 1, 0);
                if (o00oOooo2 != 0) {
                    o0o0000o.addTarget(o00oOooo2);
                } else {
                    int o00oOooo3 = o0O0o00.o00oOooo(obtainStyledAttributes, xmlPullParser, "excludeId", 2, 0);
                    if (o00oOooo3 != 0) {
                        o0o0000o.excludeTarget(o00oOooo3, true);
                    } else {
                        String o00oo00O2 = o0O0o00.o00oo00O(obtainStyledAttributes, xmlPullParser, "targetName", 4);
                        if (o00oo00O2 != null) {
                            o0o0000o.addTarget(o00oo00O2);
                        } else {
                            String o00oo00O3 = o0O0o00.o00oo00O(obtainStyledAttributes, xmlPullParser, "excludeName", 5);
                            if (o00oo00O3 != null) {
                                o0o0000o.excludeTarget(o00oo00O3, true);
                            } else {
                                String o00oo00O4 = o0O0o00.o00oo00O(obtainStyledAttributes, xmlPullParser, "excludeClass", 3);
                                if (o00oo00O4 != null) {
                                    try {
                                        o0o0000o.excludeTarget(Class.forName(o00oo00O4), true);
                                    } catch (ClassNotFoundException e) {
                                        obtainStyledAttributes.recycle();
                                        throw new RuntimeException(o00oOoOo.o00oo.o00oOOo0("Could not create ", o00oo00O4), e);
                                    }
                                } else {
                                    String o00oo00O5 = o0O0o00.o00oo00O(obtainStyledAttributes, xmlPullParser, "targetClass", 0);
                                    if (o00oo00O5 != null) {
                                        o0o0000o.addTarget(Class.forName(o00oo00O5));
                                    }
                                }
                            }
                        }
                    }
                }
                obtainStyledAttributes.recycle();
            }
        }
    }

    public o0O0000O o00oOo0o(int i) {
        XmlResourceParser xml = this.f5112o00oOOo0.getResources().getXml(i);
        try {
            try {
                return o00oOOoO(xml, Xml.asAttributeSet(xml), null);
            } catch (IOException e) {
                throw new InflateException(xml.getPositionDescription() + ": " + e.getMessage(), e);
            } catch (XmlPullParserException e2) {
                throw new InflateException(e2.getMessage(), e2);
            }
        } finally {
            xml.close();
        }
    }

    @SuppressLint({"RestrictedApi"})
    public final void o00oOoO(AttributeSet attributeSet, XmlPullParser xmlPullParser, ViewGroup viewGroup, o0OoOoOo o0oooooo) throws Resources.NotFoundException {
        o0O0000O o00oOo0o2;
        TypedArray obtainStyledAttributes = this.f5112o00oOOo0.obtainStyledAttributes(attributeSet, o0O00000.f5114o00oOOoO);
        int o00oOooo2 = o0O0o00.o00oOooo(obtainStyledAttributes, xmlPullParser, o00oOoO0.o00oOOoO.f6900o00oooOO, 2, -1);
        int o00oOooo3 = o0O0o00.o00oOooo(obtainStyledAttributes, xmlPullParser, "fromScene", 0, -1);
        o00ooO o00oOooO2 = o00oOooo3 < 0 ? null : o00ooO.o00oOooO(viewGroup, o00oOooo3, this.f5112o00oOOo0);
        int o00oOooo4 = o0O0o00.o00oOooo(obtainStyledAttributes, xmlPullParser, "toScene", 1, -1);
        o00ooO o00oOooO3 = o00oOooo4 >= 0 ? o00ooO.o00oOooO(viewGroup, o00oOooo4, this.f5112o00oOOo0) : null;
        if (o00oOooo2 >= 0 && (o00oOo0o2 = o00oOo0o(o00oOooo2)) != null) {
            if (o00oOooO3 == null) {
                throw new RuntimeException(android.support.v4.media.o00oOOo0.o00oOOo0("No toScene for transition ID ", o00oOooo2));
            }
            if (o00oOooO2 == null) {
                o0oooooo.o00oOooo(o00oOooO3, o00oOo0o2);
            } else {
                o0oooooo.o00oOoo0(o00oOooO2, o00oOooO3, o00oOo0o2);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public o0OoOoOo o00oOoO0(int i, ViewGroup viewGroup) {
        XmlResourceParser xml = this.f5112o00oOOo0.getResources().getXml(i);
        try {
            try {
                return o00oOo00(xml, Xml.asAttributeSet(xml), viewGroup);
            } catch (IOException e) {
                InflateException inflateException = new InflateException(xml.getPositionDescription() + ": " + e.getMessage());
                inflateException.initCause(e);
                throw inflateException;
            } catch (XmlPullParserException e2) {
                InflateException inflateException2 = new InflateException(e2.getMessage());
                inflateException2.initCause(e2);
                throw inflateException2;
            }
        } finally {
            xml.close();
        }
    }
}
