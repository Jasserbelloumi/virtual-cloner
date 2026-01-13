package androidx.appcompat.app;

import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class o0O00000 {
    @oo0oO0

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Deque<WeakReference<XmlPullParser>> f483o00oOOo0 = new ArrayDeque();

    public static boolean o00oOOoO(@o0OO00OO XmlPullParser xmlPullParser) {
        if (xmlPullParser != null) {
            try {
                if (xmlPullParser.getEventType() != 3) {
                    return xmlPullParser.getEventType() == 1;
                }
                return true;
            } catch (XmlPullParserException unused) {
                return true;
            }
        }
        return true;
    }

    @o0OO00OO
    public static XmlPullParser o00oOo00(@oo0oO0 Deque<WeakReference<XmlPullParser>> deque) {
        while (!deque.isEmpty()) {
            XmlPullParser xmlPullParser = deque.peek().get();
            if (!o00oOOoO(xmlPullParser)) {
                return xmlPullParser;
            }
            deque.pop();
        }
        return null;
    }

    public static boolean o00oOooO(@oo0oO0 XmlPullParser xmlPullParser, @o0OO00OO XmlPullParser xmlPullParser2) {
        if (xmlPullParser2 == null || xmlPullParser == xmlPullParser2) {
            return false;
        }
        try {
            if (xmlPullParser2.getEventType() == 2) {
                return "include".equals(xmlPullParser2.getName());
            }
            return false;
        } catch (XmlPullParserException unused) {
            return false;
        }
    }

    public boolean o00oOOo0(@oo0oO0 AttributeSet attributeSet) {
        if (attributeSet instanceof XmlPullParser) {
            XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
            if (xmlPullParser.getDepth() == 1) {
                XmlPullParser o00oOo002 = o00oOo00(this.f483o00oOOo0);
                this.f483o00oOOo0.push(new WeakReference<>(xmlPullParser));
                return o00oOooO(xmlPullParser, o00oOo002);
            }
            return false;
        }
        return false;
    }
}
