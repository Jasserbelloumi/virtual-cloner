package o00ooo0o;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import androidx.core.R;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.o0OoOoOo;
import o00oOooO.oo0oO0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o0O0O0o0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final int f9724o00oOOo0 = 400;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f9725o00oOOoO = 1;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f9726o00oOo00 = 0;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f9727o00oOo0O = -1;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f9728o00oOo0o = 500;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f9729o00oOooO = 1;

    @o0OOooO0(21)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o00oOooO.o0O0O0Oo
        public static int o00oOOo0(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOOoO {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface o00oOo00 {
    }

    /* loaded from: classes.dex */
    public static final class o00oOo0O implements o00oOOoO {
        @oo0oO0

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o00oOoO[] f9730o00oOOo0;

        public o00oOo0O(@oo0oO0 o00oOoO[] o00ooooArr) {
            this.f9730o00oOOo0 = o00ooooArr;
        }

        @oo0oO0
        public o00oOoO[] o00oOOo0() {
            return this.f9730o00oOOo0;
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOoO {
        @oo0oO0

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final String f9731o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final int f9732o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final boolean f9733o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final int f9734o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public final int f9735o00oOo0o;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final String f9736o00oOooO;

        public o00oOoO(@oo0oO0 String str, int i, boolean z, @o0OO00OO String str2, int i2, int i3) {
            this.f9731o00oOOo0 = str;
            this.f9732o00oOOoO = i;
            this.f9733o00oOo00 = z;
            this.f9736o00oOooO = str2;
            this.f9734o00oOo0O = i2;
            this.f9735o00oOo0o = i3;
        }

        @oo0oO0
        public String o00oOOo0() {
            return this.f9731o00oOOo0;
        }

        public int o00oOOoO() {
            return this.f9735o00oOo0o;
        }

        public int o00oOo00() {
            return this.f9734o00oOo0O;
        }

        public int o00oOo0O() {
            return this.f9732o00oOOoO;
        }

        public boolean o00oOo0o() {
            return this.f9733o00oOo00;
        }

        @o0OO00OO
        public String o00oOooO() {
            return this.f9736o00oOooO;
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oo00O implements o00oOOoO {
        @oo0oO0

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o0O000O.o00oo00O f9737o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final int f9738o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final int f9739o00oOo00;
        @o0OO00OO

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final String f9740o00oOooO;

        public o00oo00O(@oo0oO0 o0O000O.o00oo00O o00oo00o, int i, int i2) {
            this(o00oo00o, i, i2, null);
        }

        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
        public o00oo00O(@oo0oO0 o0O000O.o00oo00O o00oo00o, int i, int i2, @o0OO00OO String str) {
            this.f9737o00oOOo0 = o00oo00o;
            this.f9739o00oOo00 = i;
            this.f9738o00oOOoO = i2;
            this.f9740o00oOooO = str;
        }

        public int o00oOOo0() {
            return this.f9739o00oOo00;
        }

        @oo0oO0
        public o0O000O.o00oo00O o00oOOoO() {
            return this.f9737o00oOOo0;
        }

        @o0OO00OO
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
        public String o00oOo00() {
            return this.f9740o00oOooO;
        }

        public int o00oOooO() {
            return this.f9738o00oOOoO;
        }
    }

    public static int o00oOOo0(TypedArray typedArray, int i) {
        return o00oOOo0.o00oOOo0(typedArray, i);
    }

    @o0OO00OO
    public static o00oOOoO o00oOOoO(@oo0oO0 XmlPullParser xmlPullParser, @oo0oO0 Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return o00oOooO(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    @oo0oO0
    public static List<List<byte[]>> o00oOo00(@oo0oO0 Resources resources, @o0OoOoOo int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (o00oOOo0.o00oOOo0(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(o00oOoO(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(o00oOoO(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    @o0OO00OO
    public static o00oOOoO o00oOo0O(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.FontFamily);
        String string = obtainAttributes.getString(R.styleable.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(R.styleable.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(R.styleable.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(R.styleable.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(R.styleable.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(R.styleable.FontFamily_fontProviderFetchTimeout, 500);
        String string4 = obtainAttributes.getString(R.styleable.FontFamily_fontProviderSystemFontFamily);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                o00oOoO0(xmlPullParser);
            }
            return new o00oo00O(new o0O000O.o00oo00O(string, string2, string3, o00oOo00(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(o00oOo0o(xmlPullParser, resources));
                } else {
                    o00oOoO0(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new o00oOo0O((o00oOoO[]) arrayList.toArray(new o00oOoO[0]));
    }

    public static o00oOoO o00oOo0o(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.FontFamilyFont);
        int i = R.styleable.FontFamilyFont_fontWeight;
        if (!obtainAttributes.hasValue(i)) {
            i = R.styleable.FontFamilyFont_android_fontWeight;
        }
        int i2 = obtainAttributes.getInt(i, 400);
        int i3 = R.styleable.FontFamilyFont_fontStyle;
        if (!obtainAttributes.hasValue(i3)) {
            i3 = R.styleable.FontFamilyFont_android_fontStyle;
        }
        boolean z = 1 == obtainAttributes.getInt(i3, 0);
        int i4 = R.styleable.FontFamilyFont_ttcIndex;
        if (!obtainAttributes.hasValue(i4)) {
            i4 = R.styleable.FontFamilyFont_android_ttcIndex;
        }
        int i5 = R.styleable.FontFamilyFont_fontVariationSettings;
        if (!obtainAttributes.hasValue(i5)) {
            i5 = R.styleable.FontFamilyFont_android_fontVariationSettings;
        }
        String string = obtainAttributes.getString(i5);
        int i6 = obtainAttributes.getInt(i4, 0);
        int i7 = R.styleable.FontFamilyFont_font;
        if (!obtainAttributes.hasValue(i7)) {
            i7 = R.styleable.FontFamilyFont_android_font;
        }
        int resourceId = obtainAttributes.getResourceId(i7, 0);
        String string2 = obtainAttributes.getString(i7);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            o00oOoO0(xmlPullParser);
        }
        return new o00oOoO(string2, i2, z, string, i6, resourceId);
    }

    public static List<byte[]> o00oOoO(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    public static void o00oOoO0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    @o0OO00OO
    public static o00oOOoO o00oOooO(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return o00oOo0O(xmlPullParser, resources);
        }
        o00oOoO0(xmlPullParser);
        return null;
    }
}
