package o00ooo0O;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.support.v4.media.o00oOo0O;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import o00oOooO.o0OO0oO;
import o00oOooO.o0o0000;
import o00oOooO.oO0Oo;
import o00oOooO.oo0oO0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o0O00o00 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f9648o00oOOo0 = "ShortcutXmlParser";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f9649o00oOOoO = "android.app.shortcuts";

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f9650o00oOo00 = "shortcut";

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static volatile ArrayList<String> f9651o00oOo0O = null;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final Object f9652o00oOo0o = new Object();

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f9653o00oOooO = "shortcutId";

    public static String o00oOOo0(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        return attributeValue == null ? xmlPullParser.getAttributeValue(null, str) : attributeValue;
    }

    @oo0oO0
    @oO0Oo
    public static List<String> o00oOOoO(@oo0oO0 Context context) {
        if (f9651o00oOo0O == null) {
            synchronized (f9652o00oOo0o) {
                if (f9651o00oOo0O == null) {
                    f9651o00oOo0O = new ArrayList<>();
                    f9651o00oOo0O.addAll(o00oOo0O(context));
                }
            }
        }
        return f9651o00oOo0O;
    }

    @oo0oO0
    public static XmlResourceParser o00oOo00(Context context, ActivityInfo activityInfo) {
        XmlResourceParser loadXmlMetaData = activityInfo.loadXmlMetaData(context.getPackageManager(), f9649o00oOOoO);
        if (loadXmlMetaData != null) {
            return loadXmlMetaData;
        }
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Failed to open android.app.shortcuts meta-data resource of ");
        o00oOOo02.append(activityInfo.name);
        throw new IllegalArgumentException(o00oOOo02.toString());
    }

    @oo0oO0
    public static Set<String> o00oOo0O(@oo0oO0 Context context) {
        HashSet hashSet = new HashSet();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 128);
        if (queryIntentActivities != null && queryIntentActivities.size() != 0) {
            try {
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    Bundle bundle = activityInfo.metaData;
                    if (bundle != null && bundle.containsKey(f9649o00oOOoO)) {
                        XmlResourceParser o00oOo002 = o00oOo00(context, activityInfo);
                        hashSet.addAll(o00oOooO(o00oOo002));
                        if (o00oOo002 != null) {
                            o00oOo002.close();
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return hashSet;
    }

    @oo0oO0
    @o0o0000
    public static List<String> o00oOooO(@oo0oO0 XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        String o00oOOo02;
        ArrayList arrayList = new ArrayList(1);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= 0)) {
                break;
            }
            int depth = xmlPullParser.getDepth();
            String name = xmlPullParser.getName();
            if (next == 2 && depth == 2 && f9650o00oOo00.equals(name) && (o00oOOo02 = o00oOOo0(xmlPullParser, f9653o00oOooO)) != null) {
                arrayList.add(o00oOOo02);
            }
        }
        return arrayList;
    }
}
