package o00ooO00;

import android.content.Context;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.o00oOOo0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class o00oo {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f8107o00oOOoO = -1;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static HashMap<String, Constructor<? extends o00oo0>> f8108o00oOo00 = null;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f8109o00oOooO = "KeyFrames";

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public HashMap<Integer, ArrayList<o00oo0>> f8110o00oOOo0 = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends o00oo0>> hashMap = new HashMap<>();
        f8108o00oOo00 = hashMap;
        try {
            hashMap.put("KeyAttribute", o00oo0OO.class.getConstructor(new Class[0]));
            f8108o00oOo00.put("KeyPosition", o00ooO0.class.getConstructor(new Class[0]));
            f8108o00oOo00.put("KeyCycle", o00oo0O.class.getConstructor(new Class[0]));
            f8108o00oOo00.put("KeyTimeCycle", o0.class.getConstructor(new Class[0]));
            f8108o00oOo00.put("KeyTrigger", o0O00000.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException unused) {
        }
    }

    public o00oo(Context context, XmlPullParser xmlPullParser) {
        HashMap<String, o00oOOo0> hashMap;
        o00oo0 o00oo0Var = null;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (f8108o00oOo00.containsKey(name)) {
                        try {
                            o00oo0 newInstance = f8108o00oOo00.get(name).newInstance(new Object[0]);
                            try {
                                newInstance.o00oOo00(context, Xml.asAttributeSet(xmlPullParser));
                                o00oOOoO(newInstance);
                            } catch (Exception unused) {
                            }
                            o00oo0Var = newInstance;
                            continue;
                        } catch (Exception unused2) {
                            continue;
                        }
                    } else if (name.equalsIgnoreCase("CustomAttribute") && o00oo0Var != null && (hashMap = o00oo0Var.f8133o00oOo0O) != null) {
                        o00oOOo0.o00oOoO(context, xmlPullParser, hashMap);
                        continue;
                    }
                } else if (eventType == 3 && "KeyFrameSet".equals(xmlPullParser.getName())) {
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

    public static String o00oOo0O(int i, Context context) {
        return context.getResources().getResourceEntryName(i);
    }

    public void o00oOOo0(o0O000 o0o000) {
        ArrayList<o00oo0> arrayList = this.f8110o00oOOo0.get(Integer.valueOf(o0o000.f8348o00oOOoO));
        if (arrayList != null) {
            o0o000.o00oOOoO(arrayList);
        }
        ArrayList<o00oo0> arrayList2 = this.f8110o00oOOo0.get(-1);
        if (arrayList2 != null) {
            Iterator<o00oo0> it = arrayList2.iterator();
            while (it.hasNext()) {
                o00oo0 next = it.next();
                if (next.o00oOooO(((ConstraintLayout.o00oOOoO) o0o000.f8347o00oOOo0.getLayoutParams()).f1841o0O00000)) {
                    o0o000.o00oOOo0(next);
                }
            }
        }
    }

    public final void o00oOOoO(o00oo0 o00oo0Var) {
        if (!this.f8110o00oOOo0.containsKey(Integer.valueOf(o00oo0Var.f8131o00oOOoO))) {
            this.f8110o00oOOo0.put(Integer.valueOf(o00oo0Var.f8131o00oOOoO), new ArrayList<>());
        }
        this.f8110o00oOOo0.get(Integer.valueOf(o00oo0Var.f8131o00oOOoO)).add(o00oo0Var);
    }

    public ArrayList<o00oo0> o00oOo00(int i) {
        return this.f8110o00oOOo0.get(Integer.valueOf(i));
    }

    public Set<Integer> o00oOooO() {
        return this.f8110o00oOOo0.keySet();
    }
}
