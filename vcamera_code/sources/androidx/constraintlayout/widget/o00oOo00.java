package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.util.ArrayList;
import o00ooOOo.oO0000Oo;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class o00oOo00 {

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final String f1939o00oOoO = "ConstraintLayoutStates";

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final boolean f1940o00oOoOO = false;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final ConstraintLayout f1941o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public o00oOoO f1942o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f1943o00oOo00 = -1;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f1947o00oOooO = -1;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public SparseArray<o00oOOo0> f1944o00oOo0O = new SparseArray<>();

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public SparseArray<o00oOoO> f1945o00oOo0o = new SparseArray<>();

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public oO0000Oo f1946o00oOoO0 = null;

    /* loaded from: classes.dex */
    public static class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public int f1948o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public ArrayList<o00oOOoO> f1949o00oOOoO = new ArrayList<>();

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f1950o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public o00oOoO f1951o00oOooO;

        public o00oOOo0(Context context, XmlPullParser xmlPullParser) {
            this.f1950o00oOo00 = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.State_android_id) {
                    this.f1948o00oOOo0 = obtainStyledAttributes.getResourceId(index, this.f1948o00oOOo0);
                } else if (index == R.styleable.State_constraints) {
                    this.f1950o00oOo00 = obtainStyledAttributes.getResourceId(index, this.f1950o00oOo00);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1950o00oOo00);
                    context.getResources().getResourceName(this.f1950o00oOo00);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        o00oOoO o00oooo2 = new o00oOoO();
                        this.f1951o00oOooO = o00oooo2;
                        o00oooo2.o00ooO0O(context, this.f1950o00oOo00);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        public void o00oOOo0(o00oOOoO o00ooooo2) {
            this.f1949o00oOOoO.add(o00ooooo2);
        }

        public int o00oOOoO(float f, float f2) {
            for (int i = 0; i < this.f1949o00oOOoO.size(); i++) {
                if (this.f1949o00oOOoO.get(i).o00oOOo0(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public int f1952o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public float f1953o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public float f1954o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public float f1955o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public int f1956o00oOo0o;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public o00oOoO f1957o00oOoO0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public float f1958o00oOooO;

        public o00oOOoO(Context context, XmlPullParser xmlPullParser) {
            this.f1953o00oOOoO = Float.NaN;
            this.f1954o00oOo00 = Float.NaN;
            this.f1958o00oOooO = Float.NaN;
            this.f1955o00oOo0O = Float.NaN;
            this.f1956o00oOo0o = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.Variant_constraints) {
                    this.f1956o00oOo0o = obtainStyledAttributes.getResourceId(index, this.f1956o00oOo0o);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1956o00oOo0o);
                    context.getResources().getResourceName(this.f1956o00oOo0o);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        o00oOoO o00oooo2 = new o00oOoO();
                        this.f1957o00oOoO0 = o00oooo2;
                        o00oooo2.o00ooO0O(context, this.f1956o00oOo0o);
                    }
                } else if (index == R.styleable.Variant_region_heightLessThan) {
                    this.f1955o00oOo0O = obtainStyledAttributes.getDimension(index, this.f1955o00oOo0O);
                } else if (index == R.styleable.Variant_region_heightMoreThan) {
                    this.f1954o00oOo00 = obtainStyledAttributes.getDimension(index, this.f1954o00oOo00);
                } else if (index == R.styleable.Variant_region_widthLessThan) {
                    this.f1958o00oOooO = obtainStyledAttributes.getDimension(index, this.f1958o00oOooO);
                } else if (index == R.styleable.Variant_region_widthMoreThan) {
                    this.f1953o00oOOoO = obtainStyledAttributes.getDimension(index, this.f1953o00oOOoO);
                }
            }
            obtainStyledAttributes.recycle();
        }

        public boolean o00oOOo0(float f, float f2) {
            if (Float.isNaN(this.f1953o00oOOoO) || f >= this.f1953o00oOOoO) {
                if (Float.isNaN(this.f1954o00oOo00) || f2 >= this.f1954o00oOo00) {
                    if (Float.isNaN(this.f1958o00oOooO) || f <= this.f1958o00oOooO) {
                        return Float.isNaN(this.f1955o00oOo0O) || f2 <= this.f1955o00oOo0O;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
    }

    public o00oOo00(Context context, ConstraintLayout constraintLayout, int i) {
        this.f1941o00oOOo0 = constraintLayout;
        o00oOOo0(context, i);
    }

    public final void o00oOOo0(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        o00oOOo0 o00oooo02 = null;
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    char c = 65535;
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals(o00oOoO.f1975o00oOo0O)) {
                                c = 4;
                                break;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c = 0;
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
                            o00oooo02 = new o00oOOo0(context, xml);
                            this.f1944o00oOo0O.put(o00oooo02.f1948o00oOOo0, o00oooo02);
                            continue;
                        } else if (c == 3) {
                            o00oOOoO o00ooooo2 = new o00oOOoO(context, xml);
                            if (o00oooo02 != null) {
                                o00oooo02.o00oOOo0(o00ooooo2);
                                continue;
                            } else {
                                continue;
                            }
                        } else if (c != 4) {
                            continue;
                        } else {
                            o00oOo00(context, xml);
                            continue;
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    public boolean o00oOOoO(int i, float f, float f2) {
        int i2 = this.f1943o00oOo00;
        if (i2 != i) {
            return true;
        }
        o00oOOo0 valueAt = i == -1 ? this.f1944o00oOo0O.valueAt(0) : this.f1944o00oOo0O.get(i2);
        int i3 = this.f1947o00oOooO;
        return (i3 == -1 || !valueAt.f1949o00oOOoO.get(i3).o00oOOo0(f, f2)) && this.f1947o00oOooO != valueAt.o00oOOoO(f, f2);
    }

    public final void o00oOo00(Context context, XmlPullParser xmlPullParser) {
        o00oOoO o00oooo2 = new o00oOoO();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if ("id".equals(xmlPullParser.getAttributeName(i))) {
                String attributeValue = xmlPullParser.getAttributeValue(i);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1 && attributeValue.length() > 1) {
                    identifier = Integer.parseInt(attributeValue.substring(1));
                }
                o00oooo2.o0O00Oo(context, xmlPullParser);
                this.f1945o00oOo0o.put(identifier, o00oooo2);
                return;
            }
        }
    }

    public void o00oOo0O(int i, float f, float f2) {
        int o00oOOoO2;
        int i2 = this.f1943o00oOo00;
        if (i2 != i) {
            this.f1943o00oOo00 = i;
            o00oOOo0 o00oooo02 = this.f1944o00oOo0O.get(i);
            int o00oOOoO3 = o00oooo02.o00oOOoO(f, f2);
            o00oOoO o00oooo2 = o00oOOoO3 == -1 ? o00oooo02.f1951o00oOooO : o00oooo02.f1949o00oOOoO.get(o00oOOoO3).f1957o00oOoO0;
            int i3 = o00oOOoO3 == -1 ? o00oooo02.f1950o00oOo00 : o00oooo02.f1949o00oOOoO.get(o00oOOoO3).f1956o00oOo0o;
            if (o00oooo2 == null) {
                return;
            }
            this.f1947o00oOooO = o00oOOoO3;
            oO0000Oo oo0000oo = this.f1946o00oOoO0;
            if (oo0000oo != null) {
                oo0000oo.o00oOOoO(i, i3);
            }
            o00oooo2.o00oOooo(this.f1941o00oOOo0);
            oO0000Oo oo0000oo2 = this.f1946o00oOoO0;
            if (oo0000oo2 != null) {
                oo0000oo2.o00oOOo0(i, i3);
                return;
            }
            return;
        }
        o00oOOo0 valueAt = i == -1 ? this.f1944o00oOo0O.valueAt(0) : this.f1944o00oOo0O.get(i2);
        int i4 = this.f1947o00oOooO;
        if ((i4 == -1 || !valueAt.f1949o00oOOoO.get(i4).o00oOOo0(f, f2)) && this.f1947o00oOooO != (o00oOOoO2 = valueAt.o00oOOoO(f, f2))) {
            o00oOoO o00oooo3 = o00oOOoO2 == -1 ? this.f1942o00oOOoO : valueAt.f1949o00oOOoO.get(o00oOOoO2).f1957o00oOoO0;
            int i5 = o00oOOoO2 == -1 ? valueAt.f1950o00oOo00 : valueAt.f1949o00oOOoO.get(o00oOOoO2).f1956o00oOo0o;
            if (o00oooo3 == null) {
                return;
            }
            this.f1947o00oOooO = o00oOOoO2;
            oO0000Oo oo0000oo3 = this.f1946o00oOoO0;
            if (oo0000oo3 != null) {
                oo0000oo3.o00oOOoO(-1, i5);
            }
            o00oooo3.o00oOooo(this.f1941o00oOOo0);
            oO0000Oo oo0000oo4 = this.f1946o00oOoO0;
            if (oo0000oo4 != null) {
                oo0000oo4.o00oOOo0(-1, i5);
            }
        }
    }

    public void o00oOooO(oO0000Oo oo0000oo) {
        this.f1946o00oOoO0 = oo0000oo;
    }
}
