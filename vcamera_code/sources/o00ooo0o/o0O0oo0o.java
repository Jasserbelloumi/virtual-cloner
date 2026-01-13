package o00ooo0o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import o00oOooO.o0O00O;
import o00oOooO.o0O00OOO;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import org.xmlpull.v1.XmlPullParserException;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class o0O0oo0o {

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f9770o00oOooO = "ComplexColorCompat";

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Shader f9771o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final ColorStateList f9772o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f9773o00oOo00;

    public o0O0oo0o(Shader shader, ColorStateList colorStateList, @o0O00O int i) {
        this.f9771o00oOOo0 = shader;
        this.f9772o00oOOoO = colorStateList;
        this.f9773o00oOo00 = i;
    }

    @oo0oO0
    public static o0O0oo0o o00oOOo0(@oo0oO0 Resources resources, @o0O00OOO int i, @o0OO00OO Resources.Theme theme) throws IOException, XmlPullParserException {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            name.getClass();
            if (name.equals("gradient")) {
                return o00oOooO(o0ooO.o00oOo00(resources, xml, asAttributeSet, theme));
            }
            if (name.equals("selector")) {
                return o00oOo00(o0oO0O0o.o00oOOoO(resources, xml, asAttributeSet, theme));
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static o0O0oo0o o00oOOoO(@o0O00O int i) {
        return new o0O0oo0o(null, null, i);
    }

    public static o0O0oo0o o00oOo00(@oo0oO0 ColorStateList colorStateList) {
        return new o0O0oo0o(null, colorStateList, colorStateList.getDefaultColor());
    }

    @o0OO00OO
    public static o0O0oo0o o00oOoO0(@oo0oO0 Resources resources, @o0O00OOO int i, @o0OO00OO Resources.Theme theme) {
        try {
            return o00oOOo0(resources, i, theme);
        } catch (Exception unused) {
            return null;
        }
    }

    public static o0O0oo0o o00oOooO(@oo0oO0 Shader shader) {
        return new o0O0oo0o(shader, null, 0);
    }

    @o0O00O
    public int o00oOo0O() {
        return this.f9773o00oOo00;
    }

    @o0OO00OO
    public Shader o00oOo0o() {
        return this.f9771o00oOOo0;
    }

    public boolean o00oOoO() {
        return this.f9771o00oOOo0 != null;
    }

    public boolean o00oOoOO() {
        ColorStateList colorStateList;
        return this.f9771o00oOOo0 == null && (colorStateList = this.f9772o00oOOoO) != null && colorStateList.isStateful();
    }

    public boolean o00oOoOo(int[] iArr) {
        if (o00oOoOO()) {
            ColorStateList colorStateList = this.f9772o00oOOoO;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f9773o00oOo00) {
                this.f9773o00oOo00 = colorForState;
                return true;
            }
        }
        return false;
    }

    public void o00oOoo0(@o0O00O int i) {
        this.f9773o00oOo00 = i;
    }

    public boolean o00oOooo() {
        return o00oOoO() || this.f9773o00oOo00 != 0;
    }
}
