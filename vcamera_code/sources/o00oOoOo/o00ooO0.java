package o00oOoOo;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.R;
import androidx.appcompat.widget.o0O0OOOo;
import androidx.appcompat.widget.o0OOO0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import o00oOooO.o0OO0oO;
import o00oOooO.oooOO0;
import o0O000oo.o00oOo00;
import o0O000oo.o0O00O0o;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o00ooO0 extends MenuInflater {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f7023o00oOo0O = "SupportMenuInflater";

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final String f7024o00oOo0o = "menu";

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final String f7025o00oOoO = "item";

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final String f7026o00oOoO0 = "group";

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final int f7027o00oOoOO = 0;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final Class<?>[] f7028o00oOoOo;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final Class<?>[] f7029o00oOoo0;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Object[] f7030o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final Object[] f7031o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public Context f7032o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public Object f7033o00oOooO;

    /* loaded from: classes.dex */
    public static class o00oOOo0 implements MenuItem.OnMenuItemClickListener {

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public static final Class<?>[] f7034o00oo0Oo = {MenuItem.class};

        /* renamed from: o00oo0O  reason: collision with root package name */
        public Method f7035o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public Object f7036o00oo0O0;

        public o00oOOo0(Object obj, String str) {
            this.f7036o00oo0O0 = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f7035o00oo0O = cls.getMethod(str, f7034o00oo0Oo);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f7035o00oo0O.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f7035o00oo0O.invoke(this.f7036o00oo0O0, menuItem)).booleanValue();
                }
                this.f7035o00oo0O.invoke(this.f7036o00oo0O0, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO {

        /* renamed from: o00ooOo  reason: collision with root package name */
        public static final int f7037o00ooOo = 0;

        /* renamed from: o00ooOoO  reason: collision with root package name */
        public static final int f7038o00ooOoO = 0;

        /* renamed from: o00ooOoo  reason: collision with root package name */
        public static final int f7039o00ooOoo = 0;

        /* renamed from: o00ooo0  reason: collision with root package name */
        public static final int f7040o00ooo0 = 0;

        /* renamed from: o00ooo00  reason: collision with root package name */
        public static final int f7041o00ooo00 = 0;

        /* renamed from: o00ooo0O  reason: collision with root package name */
        public static final boolean f7042o00ooo0O = false;

        /* renamed from: o00ooo0o  reason: collision with root package name */
        public static final boolean f7043o00ooo0o = true;

        /* renamed from: o00oooO  reason: collision with root package name */
        public static final boolean f7044o00oooO = true;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public Menu f7045o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f7046o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f7047o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public int f7048o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public boolean f7049o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public boolean f7050o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public boolean f7051o00oOoO0;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public int f7052o00oOoOO;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public int f7053o00oOoOo;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public CharSequence f7054o00oOoo0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f7055o00oOooO;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public CharSequence f7056o00oOooo;

        /* renamed from: o00oo  reason: collision with root package name */
        public int f7057o00oo;

        /* renamed from: o00oo0  reason: collision with root package name */
        public char f7058o00oo0;

        /* renamed from: o00oo00O  reason: collision with root package name */
        public int f7059o00oo00O;

        /* renamed from: o00oo0O  reason: collision with root package name */
        public int f7060o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public char f7061o00oo0O0;

        /* renamed from: o00oo0OO  reason: collision with root package name */
        public int f7062o00oo0OO;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public int f7063o00oo0Oo;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public boolean f7064o00oo0o;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public boolean f7065o00oo0o0;

        /* renamed from: o00oo0oO  reason: collision with root package name */
        public boolean f7066o00oo0oO;

        /* renamed from: o00ooO  reason: collision with root package name */
        public CharSequence f7067o00ooO;

        /* renamed from: o00ooO0  reason: collision with root package name */
        public String f7068o00ooO0;

        /* renamed from: o00ooO00  reason: collision with root package name */
        public String f7069o00ooO00;

        /* renamed from: o00ooO0O  reason: collision with root package name */
        public String f7070o00ooO0O;

        /* renamed from: o00ooO0o  reason: collision with root package name */
        public o00oOo00 f7071o00ooO0o;

        /* renamed from: o00ooOO0  reason: collision with root package name */
        public CharSequence f7073o00ooOO0;

        /* renamed from: o0O0o  reason: collision with root package name */
        public int f7076o0O0o;

        /* renamed from: o00ooOO  reason: collision with root package name */
        public ColorStateList f7072o00ooOO = null;

        /* renamed from: o00ooOOo  reason: collision with root package name */
        public PorterDuff.Mode f7074o00ooOOo = null;

        public o00oOOoO(Menu menu) {
            this.f7045o00oOOo0 = menu;
            o00oOoO();
        }

        public void o00oOOo0() {
            this.f7050o00oOoO = true;
            o00oOoOO(this.f7045o00oOOo0.add(this.f7046o00oOOoO, this.f7052o00oOoOO, this.f7053o00oOoOo, this.f7054o00oOoo0));
        }

        public SubMenu o00oOOoO() {
            this.f7050o00oOoO = true;
            SubMenu addSubMenu = this.f7045o00oOOo0.addSubMenu(this.f7046o00oOOoO, this.f7052o00oOoOO, this.f7053o00oOoOo, this.f7054o00oOoo0);
            o00oOoOO(addSubMenu.getItem());
            return addSubMenu;
        }

        public final char o00oOo00(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        public final <T> T o00oOo0O(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, o00ooO0.this.f7032o00oOo00.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception unused) {
                return null;
            }
        }

        public void o00oOo0o(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = o00ooO0.this.f7032o00oOo00.obtainStyledAttributes(attributeSet, R.styleable.MenuGroup);
            this.f7046o00oOOoO = obtainStyledAttributes.getResourceId(R.styleable.MenuGroup_android_id, 0);
            this.f7047o00oOo00 = obtainStyledAttributes.getInt(R.styleable.MenuGroup_android_menuCategory, 0);
            this.f7055o00oOooO = obtainStyledAttributes.getInt(R.styleable.MenuGroup_android_orderInCategory, 0);
            this.f7048o00oOo0O = obtainStyledAttributes.getInt(R.styleable.MenuGroup_android_checkableBehavior, 0);
            this.f7049o00oOo0o = obtainStyledAttributes.getBoolean(R.styleable.MenuGroup_android_visible, true);
            this.f7051o00oOoO0 = obtainStyledAttributes.getBoolean(R.styleable.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        public void o00oOoO() {
            this.f7046o00oOOoO = 0;
            this.f7047o00oOo00 = 0;
            this.f7055o00oOooO = 0;
            this.f7048o00oOo0O = 0;
            this.f7049o00oOo0o = true;
            this.f7051o00oOoO0 = true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void o00oOoO0(AttributeSet attributeSet) {
            o0OOO0 o00ooOo02 = o0OOO0.o00ooOo0(o00ooO0.this.f7032o00oOo00, attributeSet, R.styleable.MenuItem);
            this.f7052o00oOoOO = o00ooOo02.o00oo0oO(R.styleable.MenuItem_android_id, 0);
            this.f7053o00oOoOo = (o00ooOo02.o00oo0OO(R.styleable.MenuItem_android_menuCategory, this.f7047o00oOo00) & o0.o00oOOo0.f6865o00oOo00) | (o00ooOo02.o00oo0OO(R.styleable.MenuItem_android_orderInCategory, this.f7055o00oOooO) & 65535);
            this.f7054o00oOoo0 = o00ooOo02.o00ooO00(R.styleable.MenuItem_android_title);
            this.f7056o00oOooo = o00ooOo02.o00ooO00(R.styleable.MenuItem_android_titleCondensed);
            this.f7059o00oo00O = o00ooOo02.o00oo0oO(R.styleable.MenuItem_android_icon, 0);
            this.f7058o00oo0 = o00oOo00(o00ooOo02.o00oo(R.styleable.MenuItem_android_alphabeticShortcut));
            this.f7062o00oo0OO = o00ooOo02.o00oo0OO(R.styleable.MenuItem_alphabeticModifiers, 4096);
            this.f7061o00oo0O0 = o00oOo00(o00ooOo02.o00oo(R.styleable.MenuItem_android_numericShortcut));
            this.f7060o00oo0O = o00ooOo02.o00oo0OO(R.styleable.MenuItem_numericModifiers, 4096);
            int i = R.styleable.MenuItem_android_checkable;
            this.f7063o00oo0Oo = o00ooOo02.o00ooOO0(i) ? o00ooOo02.o00oOOo0(i, false) : this.f7048o00oOo0O;
            this.f7065o00oo0o0 = o00ooOo02.o00oOOo0(R.styleable.MenuItem_android_checked, false);
            this.f7064o00oo0o = o00ooOo02.o00oOOo0(R.styleable.MenuItem_android_visible, this.f7049o00oOo0o);
            this.f7066o00oo0oO = o00ooOo02.o00oOOo0(R.styleable.MenuItem_android_enabled, this.f7051o00oOoO0);
            this.f7076o0O0o = o00ooOo02.o00oo0OO(R.styleable.MenuItem_showAsAction, -1);
            this.f7070o00ooO0O = o00ooOo02.o00oo(R.styleable.MenuItem_android_onClick);
            this.f7057o00oo = o00ooOo02.o00oo0oO(R.styleable.MenuItem_actionLayout, 0);
            this.f7069o00ooO00 = o00ooOo02.o00oo(R.styleable.MenuItem_actionViewClass);
            String o00oo2 = o00ooOo02.o00oo(R.styleable.MenuItem_actionProviderClass);
            this.f7068o00ooO0 = o00oo2;
            if ((o00oo2 != null) && this.f7057o00oo == 0 && this.f7069o00ooO00 == null) {
                this.f7071o00ooO0o = (o00oOo00) o00oOo0O(o00oo2, o00ooO0.f7029o00oOoo0, o00ooO0.this.f7031o00oOOoO);
            } else {
                this.f7071o00ooO0o = null;
            }
            this.f7067o00ooO = o00ooOo02.o00ooO00(R.styleable.MenuItem_contentDescription);
            this.f7073o00ooOO0 = o00ooOo02.o00ooO00(R.styleable.MenuItem_tooltipText);
            int i2 = R.styleable.MenuItem_iconTintMode;
            if (o00ooOo02.o00ooOO0(i2)) {
                this.f7074o00ooOOo = o0O0OOOo.o00oOo0O(o00ooOo02.o00oo0OO(i2, -1), this.f7074o00ooOOo);
            } else {
                this.f7074o00ooOOo = null;
            }
            int i3 = R.styleable.MenuItem_iconTint;
            if (o00ooOo02.o00ooOO0(i3)) {
                this.f7072o00ooOO = o00ooOo02.o00oOooO(i3);
            } else {
                this.f7072o00ooOO = null;
            }
            o00ooOo02.o00ooOoo();
            this.f7050o00oOoO = false;
        }

        public final void o00oOoOO(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f7065o00oo0o0).setVisible(this.f7064o00oo0o).setEnabled(this.f7066o00oo0oO).setCheckable(this.f7063o00oo0Oo >= 1).setTitleCondensed(this.f7056o00oOooo).setIcon(this.f7059o00oo00O);
            int i = this.f7076o0O0o;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f7070o00ooO0O != null) {
                if (o00ooO0.this.f7032o00oOo00.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new o00oOOo0(o00ooO0.this.o00oOOoO(), this.f7070o00ooO0O));
            }
            if (this.f7063o00oo0Oo >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.o00oo0OO) {
                    ((androidx.appcompat.view.menu.o00oo0OO) menuItem).o00oo(true);
                } else if (menuItem instanceof o00oOoo0.o00oo0O) {
                    ((o00oOoo0.o00oo0O) menuItem).o00oOoOo(true);
                }
            }
            String str = this.f7069o00ooO00;
            if (str != null) {
                menuItem.setActionView((View) o00oOo0O(str, o00ooO0.f7028o00oOoOo, o00ooO0.this.f7030o00oOOo0));
                z = true;
            }
            int i2 = this.f7057o00oo;
            if (i2 > 0 && !z) {
                menuItem.setActionView(i2);
            }
            o00oOo00 o00ooo002 = this.f7071o00ooO0o;
            if (o00ooo002 != null) {
                o0O00O0o.o00oOooo(menuItem, o00ooo002);
            }
            o0O00O0o.o00oo0O0(menuItem, this.f7067o00ooO);
            o0O00O0o.o00oo(menuItem, this.f7073o00ooOO0);
            o0O00O0o.o00oo0OO(menuItem, this.f7058o00oo0, this.f7062o00oo0OO);
            o0O00O0o.o00oo0o0(menuItem, this.f7061o00oo0O0, this.f7060o00oo0O);
            PorterDuff.Mode mode = this.f7074o00ooOOo;
            if (mode != null) {
                o0O00O0o.o00oo0Oo(menuItem, mode);
            }
            ColorStateList colorStateList = this.f7072o00ooOO;
            if (colorStateList != null) {
                o0O00O0o.o00oo0O(menuItem, colorStateList);
            }
        }

        public boolean o00oOooO() {
            return this.f7050o00oOoO;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f7028o00oOoOo = clsArr;
        f7029o00oOoo0 = clsArr;
    }

    public o00ooO0(Context context) {
        super(context);
        this.f7032o00oOo00 = context;
        Object[] objArr = {context};
        this.f7030o00oOOo0 = objArr;
        this.f7031o00oOOoO = objArr;
    }

    @Override // android.view.MenuInflater
    public void inflate(@oooOO0 int i, Menu menu) {
        if (!(menu instanceof o0.o00oOOo0)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f7032o00oOo00.getResources().getLayout(i);
                    o00oOo00(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (XmlPullParserException e) {
                    throw new InflateException("Error inflating menu XML", e);
                }
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    public final Object o00oOOo0(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? o00oOOo0(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public Object o00oOOoO() {
        if (this.f7033o00oOooO == null) {
            this.f7033o00oOooO = o00oOOo0(this.f7032o00oOo00);
        }
        return this.f7033o00oOooO;
    }

    public final void o00oOo00(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        o00oOOoO o00ooooo2 = new o00oOOoO(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (!name.equals(f7024o00oOo0o)) {
                    throw new RuntimeException(o00oo.o00oOOo0("Expecting menu, got ", name));
                }
                eventType = xmlPullParser.next();
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        str = null;
                        z2 = false;
                    } else if (name2.equals("group")) {
                        o00ooooo2.o00oOoO();
                    } else if (name2.equals("item")) {
                        if (!o00ooooo2.f7050o00oOoO) {
                            o00oOo00 o00ooo002 = o00ooooo2.f7071o00ooO0o;
                            if (o00ooo002 == null || !o00ooo002.o00oOOoO()) {
                                o00ooooo2.o00oOOo0();
                            } else {
                                o00ooooo2.o00oOOoO();
                            }
                        }
                    } else if (name2.equals(f7024o00oOo0o)) {
                        z = true;
                    }
                }
            } else if (!z2) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    o00ooooo2.o00oOo0o(attributeSet);
                } else if (name3.equals("item")) {
                    o00ooooo2.o00oOoO0(attributeSet);
                } else if (name3.equals(f7024o00oOo0o)) {
                    o00oOo00(xmlPullParser, attributeSet, o00ooooo2.o00oOOoO());
                } else {
                    str = name3;
                    z2 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }
}
