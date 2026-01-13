package oo0oO0;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import java.io.IOException;
import o00oOooO.oo0oO0;
import oo0oO0.o00oOOo0;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes2.dex */
public final class o00oOOoO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f17276o00oOOo0 = "AndroidManifest.xml";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f17277o00oOOoO = "http://schemas.android.com/apk/res/android";

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f17278o00oOo00 = "manifest";

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f17279o00oOo0O = "uses-permission";

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final String f17280o00oOo0o = "uses-permission-sdk-23";

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final String f17281o00oOoO = "application";

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final String f17282o00oOoO0 = "uses-permission-sdk-m";

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final String f17283o00oOoOO = "activity";

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final String f17284o00oOoOo = "activity-alias";

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final String f17285o00oOoo0 = "service";

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f17286o00oOooO = "uses-sdk";

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final String f17287o00oOooo = "package";

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final String f17288o00oo0 = "maxSdkVersion";

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final String f17289o00oo00O = "name";

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final String f17290o00oo0O = "requestLegacyExternalStorage";

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final String f17291o00oo0O0 = "usesPermissionFlags";

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final String f17292o00oo0OO = "minSdkVersion";

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final String f17293o00oo0Oo = "supportsPictureInPicture";

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final String f17294o00oo0o0 = "permission";

    public static o00oOOo0.C0227o00oOOo0 o00oOOo0(@oo0oO0 XmlResourceParser xmlResourceParser) {
        o00oOOo0.C0227o00oOOo0 c0227o00oOOo0 = new o00oOOo0.C0227o00oOOo0();
        c0227o00oOOo0.f17265o00oOOo0 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "name");
        c0227o00oOOo0.f17266o00oOOoO = xmlResourceParser.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", f17293o00oo0Oo, false);
        return c0227o00oOOo0;
    }

    @oo0oO0
    public static o00oOOo0 o00oOOoO(@oo0oO0 Context context, int i) throws IOException, XmlPullParserException {
        o00oOOo0 o00oooo02 = new o00oOOo0();
        XmlResourceParser openXmlResourceParser = context.getAssets().openXmlResourceParser(i, f17276o00oOOo0);
        do {
            if (openXmlResourceParser.getEventType() == 2) {
                String name = openXmlResourceParser.getName();
                if (TextUtils.equals(f17278o00oOo00, name)) {
                    o00oooo02.f17259o00oOOo0 = openXmlResourceParser.getAttributeValue(null, f17287o00oOooo);
                }
                if (TextUtils.equals(f17286o00oOooO, name)) {
                    o00oooo02.f17260o00oOOoO = o00oOo0o(openXmlResourceParser);
                }
                if (TextUtils.equals(f17279o00oOo0O, name) || TextUtils.equals(f17280o00oOo0o, name) || TextUtils.equals(f17282o00oOoO0, name)) {
                    o00oooo02.f17261o00oOo00.add(o00oOooO(openXmlResourceParser));
                }
                if (TextUtils.equals("application", name)) {
                    o00oooo02.f17264o00oOooO = o00oOo00(openXmlResourceParser);
                }
                if (TextUtils.equals("activity", name) || TextUtils.equals(f17284o00oOoOo, name)) {
                    o00oooo02.f17262o00oOo0O.add(o00oOOo0(openXmlResourceParser));
                }
                if (TextUtils.equals("service", name)) {
                    o00oooo02.f17263o00oOo0o.add(o00oOo0O(openXmlResourceParser));
                }
            }
        } while (openXmlResourceParser.next() != 1);
        openXmlResourceParser.close();
        return o00oooo02;
    }

    public static o00oOOo0.o00oOOoO o00oOo00(@oo0oO0 XmlResourceParser xmlResourceParser) {
        o00oOOo0.o00oOOoO o00ooooo2 = new o00oOOo0.o00oOOoO();
        o00ooooo2.f17267o00oOOo0 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "name");
        o00ooooo2.f17268o00oOOoO = xmlResourceParser.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", f17290o00oo0O, false);
        return o00ooooo2;
    }

    public static o00oOOo0.o00oOo0O o00oOo0O(@oo0oO0 XmlResourceParser xmlResourceParser) {
        o00oOOo0.o00oOo0O o00ooo0o2 = new o00oOOo0.o00oOo0O();
        o00ooo0o2.f17273o00oOOo0 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "name");
        o00ooo0o2.f17274o00oOOoO = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", f17294o00oo0o0);
        return o00ooo0o2;
    }

    public static o00oOOo0.o00oOoO o00oOo0o(@oo0oO0 XmlResourceParser xmlResourceParser) {
        o00oOOo0.o00oOoO o00oooo2 = new o00oOOo0.o00oOoO();
        o00oooo2.f17275o00oOOo0 = xmlResourceParser.getAttributeIntValue("http://schemas.android.com/apk/res/android", f17292o00oo0OO, 0);
        return o00oooo2;
    }

    public static o00oOOo0.o00oOo00 o00oOooO(@oo0oO0 XmlResourceParser xmlResourceParser) {
        o00oOOo0.o00oOo00 o00ooo002 = new o00oOOo0.o00oOo00();
        o00ooo002.f17270o00oOOo0 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "name");
        o00ooo002.f17271o00oOOoO = xmlResourceParser.getAttributeIntValue("http://schemas.android.com/apk/res/android", f17288o00oo0, Integer.MAX_VALUE);
        o00ooo002.f17272o00oOo00 = xmlResourceParser.getAttributeIntValue("http://schemas.android.com/apk/res/android", f17291o00oo0O0, 0);
        return o00ooo002;
    }
}
