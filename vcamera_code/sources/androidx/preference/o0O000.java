package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class o0O000 {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final Class<?>[] f3922o00oOo0O = {Context.class, AttributeSet.class};

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final HashMap<String, Constructor<?>> f3923o00oOo0o = new HashMap<>();

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final String f3924o00oOoO = "extra";

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final String f3925o00oOoO0 = "intent";
    @oo0oO0

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Context f3926o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final Object[] f3927o00oOOoO = new Object[2];

    /* renamed from: o00oOo00  reason: collision with root package name */
    public o0O000O f3928o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public String[] f3929o00oOooO;

    public o0O000(@oo0oO0 Context context, o0O000O o0o000o) {
        this.f3926o00oOOo0 = context;
        o00oOoO0(o0o000o);
    }

    public static void o00oOooo(@oo0oO0 XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            if (next == 3 && xmlPullParser.getDepth() <= depth) {
                return;
            }
        }
    }

    public final Preference o00oOOo0(@oo0oO0 String str, @o0OO00OO String[] strArr, AttributeSet attributeSet) throws ClassNotFoundException, InflateException {
        Class<?> cls;
        Constructor<?> constructor = f3923o00oOo0o.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.f3926o00oOOo0.getClassLoader();
                    if (strArr != null && strArr.length != 0) {
                        cls = null;
                        ClassNotFoundException e = null;
                        for (String str2 : strArr) {
                            try {
                                cls = Class.forName(str2 + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e2) {
                                e = e2;
                            }
                        }
                        if (cls == null) {
                            if (e == null) {
                                throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                            }
                            throw e;
                        }
                        constructor = cls.getConstructor(f3922o00oOo0O);
                        constructor.setAccessible(true);
                        f3923o00oOo0o.put(str, constructor);
                    }
                    cls = Class.forName(str, false, classLoader);
                    constructor = cls.getConstructor(f3922o00oOo0O);
                    constructor.setAccessible(true);
                    f3923o00oOo0o.put(str, constructor);
                } catch (ClassNotFoundException e3) {
                    throw e3;
                }
            } catch (Exception e4) {
                InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                inflateException.initCause(e4);
                throw inflateException;
            }
        }
        Object[] objArr = this.f3927o00oOOoO;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    public final Preference o00oOOoO(String str, AttributeSet attributeSet) {
        try {
            return -1 == str.indexOf(46) ? o00oOoO(str, attributeSet) : o00oOOo0(str, null, attributeSet);
        } catch (InflateException e) {
            throw e;
        } catch (ClassNotFoundException e2) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e2);
            throw inflateException;
        } catch (Exception e3) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e3);
            throw inflateException2;
        }
    }

    @oo0oO0
    public Context o00oOo00() {
        return this.f3926o00oOOo0;
    }

    @oo0oO0
    public Preference o00oOo0O(int i, @o0OO00OO PreferenceGroup preferenceGroup) {
        XmlResourceParser xml = o00oOo00().getResources().getXml(i);
        try {
            return o00oOo0o(xml, preferenceGroup);
        } finally {
            xml.close();
        }
    }

    @oo0oO0
    public Preference o00oOo0o(XmlPullParser xmlPullParser, @o0OO00OO PreferenceGroup preferenceGroup) {
        int next;
        PreferenceGroup o00oOoOO2;
        synchronized (this.f3927o00oOOoO) {
            AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
            this.f3927o00oOOoO[0] = this.f3926o00oOOo0;
            do {
                try {
                    next = xmlPullParser.next();
                    if (next == 2) {
                        break;
                    }
                } catch (InflateException e) {
                    throw e;
                } catch (IOException e2) {
                    InflateException inflateException = new InflateException(xmlPullParser.getPositionDescription() + ": " + e2.getMessage());
                    inflateException.initCause(e2);
                    throw inflateException;
                } catch (XmlPullParserException e3) {
                    InflateException inflateException2 = new InflateException(e3.getMessage());
                    inflateException2.initCause(e3);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next != 2) {
                throw new InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
            }
            o00oOoOO2 = o00oOoOO(preferenceGroup, (PreferenceGroup) o00oOOoO(xmlPullParser.getName(), asAttributeSet));
            o00oOoOo(xmlPullParser, o00oOoOO2, asAttributeSet);
        }
        return o00oOoOO2;
    }

    public Preference o00oOoO(String str, AttributeSet attributeSet) throws ClassNotFoundException {
        return o00oOOo0(str, this.f3929o00oOooO, attributeSet);
    }

    public final void o00oOoO0(o0O000O o0o000o) {
        this.f3928o00oOo00 = o0o000o;
        o00oOoo0(new String[]{Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."});
    }

    @oo0oO0
    public final PreferenceGroup o00oOoOO(PreferenceGroup preferenceGroup, @oo0oO0 PreferenceGroup preferenceGroup2) {
        if (preferenceGroup == null) {
            preferenceGroup2.o0O000Oo(this.f3928o00oOo00);
            return preferenceGroup2;
        }
        return preferenceGroup;
    }

    public final void o00oOoOo(@oo0oO0 XmlPullParser xmlPullParser, Preference preference, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if ("intent".equals(name)) {
                    try {
                        preference.o0O0OOo(Intent.parseIntent(o00oOo00().getResources(), xmlPullParser, attributeSet));
                    } catch (IOException e) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e);
                        throw xmlPullParserException;
                    }
                } else if (f3924o00oOoO.equals(name)) {
                    o00oOo00().getResources().parseBundleExtra(f3924o00oOoO, attributeSet, preference.o00oo0OO());
                    try {
                        o00oOooo(xmlPullParser);
                    } catch (IOException e2) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e2);
                        throw xmlPullParserException2;
                    }
                } else {
                    Preference o00oOOoO2 = o00oOOoO(name, attributeSet);
                    ((PreferenceGroup) preference).o0oOo0O0(o00oOOoO2);
                    o00oOoOo(xmlPullParser, o00oOOoO2, attributeSet);
                }
            }
        }
    }

    public void o00oOoo0(String[] strArr) {
        this.f3929o00oOooO = strArr;
    }

    public String[] o00oOooO() {
        return this.f3929o00oOooO;
    }
}
