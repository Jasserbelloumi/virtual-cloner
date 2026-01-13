package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.SparseArray;
import android.util.Xml;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import o00ooOOo.oO0000Oo;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class o00oo0O0 {

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final String f2273o00oOoO = "ConstraintLayoutStates";

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final boolean f2274o00oOoOO = false;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public o00oOoO f2276o00oOOoO;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public int f2275o00oOOo0 = -1;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f2277o00oOo00 = -1;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f2281o00oOooO = -1;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public SparseArray<o00oOOo0> f2278o00oOo0O = new SparseArray<>();

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public SparseArray<o00oOoO> f2279o00oOo0o = new SparseArray<>();

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public oO0000Oo f2280o00oOoO0 = null;

    /* loaded from: classes.dex */
    public static class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public int f2282o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public ArrayList<o00oOOoO> f2283o00oOOoO = new ArrayList<>();

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f2284o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public boolean f2285o00oOooO;

        public o00oOOo0(Context context, XmlPullParser xmlPullParser) {
            this.f2284o00oOo00 = -1;
            this.f2285o00oOooO = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.State_android_id) {
                    this.f2282o00oOOo0 = obtainStyledAttributes.getResourceId(index, this.f2282o00oOOo0);
                } else if (index == R.styleable.State_constraints) {
                    this.f2284o00oOo00 = obtainStyledAttributes.getResourceId(index, this.f2284o00oOo00);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2284o00oOo00);
                    context.getResources().getResourceName(this.f2284o00oOo00);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        this.f2285o00oOooO = true;
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        public void o00oOOo0(o00oOOoO o00ooooo2) {
            this.f2283o00oOOoO.add(o00ooooo2);
        }

        public int o00oOOoO(float f, float f2) {
            for (int i = 0; i < this.f2283o00oOOoO.size(); i++) {
                if (this.f2283o00oOOoO.get(i).o00oOOo0(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public int f2286o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public float f2287o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public float f2288o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public float f2289o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public int f2290o00oOo0o;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public boolean f2291o00oOoO0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public float f2292o00oOooO;

        public o00oOOoO(Context context, XmlPullParser xmlPullParser) {
            this.f2287o00oOOoO = Float.NaN;
            this.f2288o00oOo00 = Float.NaN;
            this.f2292o00oOooO = Float.NaN;
            this.f2289o00oOo0O = Float.NaN;
            this.f2290o00oOo0o = -1;
            this.f2291o00oOoO0 = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.Variant_constraints) {
                    this.f2290o00oOo0o = obtainStyledAttributes.getResourceId(index, this.f2290o00oOo0o);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2290o00oOo0o);
                    context.getResources().getResourceName(this.f2290o00oOo0o);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        this.f2291o00oOoO0 = true;
                    }
                } else if (index == R.styleable.Variant_region_heightLessThan) {
                    this.f2289o00oOo0O = obtainStyledAttributes.getDimension(index, this.f2289o00oOo0O);
                } else if (index == R.styleable.Variant_region_heightMoreThan) {
                    this.f2288o00oOo00 = obtainStyledAttributes.getDimension(index, this.f2288o00oOo00);
                } else if (index == R.styleable.Variant_region_widthLessThan) {
                    this.f2292o00oOooO = obtainStyledAttributes.getDimension(index, this.f2292o00oOooO);
                } else if (index == R.styleable.Variant_region_widthMoreThan) {
                    this.f2287o00oOOoO = obtainStyledAttributes.getDimension(index, this.f2287o00oOOoO);
                }
            }
            obtainStyledAttributes.recycle();
        }

        public boolean o00oOOo0(float f, float f2) {
            if (Float.isNaN(this.f2287o00oOOoO) || f >= this.f2287o00oOOoO) {
                if (Float.isNaN(this.f2288o00oOo00) || f2 >= this.f2288o00oOo00) {
                    if (Float.isNaN(this.f2292o00oOooO) || f <= this.f2292o00oOooO) {
                        return Float.isNaN(this.f2289o00oOo0O) || f2 <= this.f2289o00oOo0O;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
    }

    public o00oo0O0(Context context, XmlPullParser xmlPullParser) {
        o00oOOoO(context, xmlPullParser);
    }

    public int o00oOOo0(int i, int i2, float f, float f2) {
        o00oOOo0 o00oooo02 = this.f2278o00oOo0O.get(i2);
        if (o00oooo02 == null) {
            return i2;
        }
        if (f == -1.0f || f2 == -1.0f) {
            if (o00oooo02.f2284o00oOo00 == i) {
                return i;
            }
            Iterator<o00oOOoO> it = o00oooo02.f2283o00oOOoO.iterator();
            while (it.hasNext()) {
                if (i == it.next().f2290o00oOo0o) {
                    return i;
                }
            }
            return o00oooo02.f2284o00oOo00;
        }
        o00oOOoO o00ooooo2 = null;
        Iterator<o00oOOoO> it2 = o00oooo02.f2283o00oOOoO.iterator();
        while (it2.hasNext()) {
            o00oOOoO next = it2.next();
            if (next.o00oOOo0(f, f2)) {
                if (i == next.f2290o00oOo0o) {
                    return i;
                }
                o00ooooo2 = next;
            }
        }
        return o00ooooo2 != null ? o00ooooo2.f2290o00oOo0o : o00oooo02.f2284o00oOo00;
    }

    public final void o00oOOoO(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.StateSet);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == R.styleable.StateSet_defaultState) {
                this.f2275o00oOOo0 = obtainStyledAttributes.getResourceId(index, this.f2275o00oOOo0);
            }
        }
        obtainStyledAttributes.recycle();
        o00oOOo0 o00oooo02 = null;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlPullParser.getName();
                } else if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    char c = 65535;
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1301459538:
                            if (name.equals("LayoutDescription")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    if (c != 0 && c != 1) {
                        if (c == 2) {
                            o00oooo02 = new o00oOOo0(context, xmlPullParser);
                            this.f2278o00oOo0O.put(o00oooo02.f2282o00oOOo0, o00oooo02);
                        } else if (c == 3) {
                            o00oOOoO o00ooooo2 = new o00oOOoO(context, xmlPullParser);
                            if (o00oooo02 != null) {
                                o00oooo02.o00oOOo0(o00ooooo2);
                            }
                        }
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("StateSet".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    public boolean o00oOo00(int i, float f, float f2) {
        int i2 = this.f2277o00oOo00;
        if (i2 != i) {
            return true;
        }
        o00oOOo0 valueAt = i == -1 ? this.f2278o00oOo0O.valueAt(0) : this.f2278o00oOo0O.get(i2);
        int i3 = this.f2281o00oOooO;
        return (i3 == -1 || !valueAt.f2283o00oOOoO.get(i3).o00oOOo0(f, f2)) && this.f2281o00oOooO != valueAt.o00oOOoO(f, f2);
    }

    public int o00oOo0O(int i, int i2, int i3) {
        return o00oOo0o(-1, i, i2, i3);
    }

    public int o00oOo0o(int i, int i2, float f, float f2) {
        int o00oOOoO2;
        if (i == i2) {
            o00oOOo0 valueAt = i2 == -1 ? this.f2278o00oOo0O.valueAt(0) : this.f2278o00oOo0O.get(this.f2277o00oOo00);
            if (valueAt == null) {
                return -1;
            }
            return ((this.f2281o00oOooO == -1 || !valueAt.f2283o00oOOoO.get(i).o00oOOo0(f, f2)) && i != (o00oOOoO2 = valueAt.o00oOOoO(f, f2))) ? o00oOOoO2 == -1 ? valueAt.f2284o00oOo00 : valueAt.f2283o00oOOoO.get(o00oOOoO2).f2290o00oOo0o : i;
        }
        o00oOOo0 o00oooo02 = this.f2278o00oOo0O.get(i2);
        if (o00oooo02 == null) {
            return -1;
        }
        int o00oOOoO3 = o00oooo02.o00oOOoO(f, f2);
        return o00oOOoO3 == -1 ? o00oooo02.f2284o00oOo00 : o00oooo02.f2283o00oOOoO.get(o00oOOoO3).f2290o00oOo0o;
    }

    public void o00oOooO(oO0000Oo oo0000oo) {
        this.f2280o00oOoO0 = oo0000oo;
    }
}
