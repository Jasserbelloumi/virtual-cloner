package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.o00oOOo0;
import androidx.constraintlayout.widget.o00oo00O;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.ads.AdError;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import o00ooO00.o0O00;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class o00oOoO {

    /* renamed from: o0  reason: collision with root package name */
    public static final int f1974o0 = 12;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f1975o00oOo0O = "ConstraintSet";

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final String f1976o00oOo0o = "XML parser error must be within a Constraint ";

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f1977o00oOoO = 0;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int f1978o00oOoO0 = -1;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final int f1979o00oOoOO = -2;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final int f1980o00oOoOo = 1;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final int f1981o00oOoo0 = 0;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final int f1982o00oOooo = 0;

    /* renamed from: o00oo  reason: collision with root package name */
    public static final int f1983o00oo = 4;

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final int f1984o00oo0 = 1;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final int f1985o00oo00O = 0;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final int f1986o00oo0O = 0;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final int f1987o00oo0O0 = 1;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final int f1988o00oo0OO = 0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final int f1989o00oo0Oo = 4;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final int f1990o00oo0o = 1;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final int f1991o00oo0o0 = 8;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final int f1992o00oo0oO = 2;

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final int f1993o00ooO = 1;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final int f1994o00ooO0 = 6;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final int f1995o00ooO00 = 5;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final int f1996o00ooO0O = 7;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final int f1997o00ooO0o = 0;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final int f1998o00ooOO = 1;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final int f1999o00ooOO0 = 0;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public static final int f2000o00ooOOo = 2;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public static final int[] f2001o00ooOo = {0, 4, 8};

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public static final boolean f2002o00ooOo0 = false;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public static final int f2003o00ooOoO = 1;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public static SparseIntArray f2004o00ooOoo = null;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public static final int f2005o00ooo0 = 2;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public static final int f2006o00ooo00 = 1;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public static final int f2007o00ooo0O = 3;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public static final int f2008o00ooo0o = 4;

    /* renamed from: o00oooO  reason: collision with root package name */
    public static final int f2009o00oooO = 5;

    /* renamed from: o00oooOO  reason: collision with root package name */
    public static final int f2010o00oooOO = 6;

    /* renamed from: o00oooOo  reason: collision with root package name */
    public static final int f2011o00oooOo = 7;

    /* renamed from: o00oooo  reason: collision with root package name */
    public static final int f2012o00oooo = 9;

    /* renamed from: o00oooo0  reason: collision with root package name */
    public static final int f2013o00oooo0 = 8;

    /* renamed from: o00ooooO  reason: collision with root package name */
    public static final int f2014o00ooooO = 10;

    /* renamed from: o00ooooo  reason: collision with root package name */
    public static final int f2015o00ooooo = 11;

    /* renamed from: o0O00  reason: collision with root package name */
    public static final int f2016o0O00 = 25;

    /* renamed from: o0O000  reason: collision with root package name */
    public static final int f2017o0O000 = 16;

    /* renamed from: o0O00000  reason: collision with root package name */
    public static final int f2018o0O00000 = 13;

    /* renamed from: o0O0000O  reason: collision with root package name */
    public static final int f2019o0O0000O = 14;

    /* renamed from: o0O0000o  reason: collision with root package name */
    public static final int f2020o0O0000o = 15;

    /* renamed from: o0O000O  reason: collision with root package name */
    public static final int f2021o0O000O = 17;

    /* renamed from: o0O000Oo  reason: collision with root package name */
    public static final int f2022o0O000Oo = 19;

    /* renamed from: o0O000o  reason: collision with root package name */
    public static final int f2023o0O000o = 22;

    /* renamed from: o0O000o0  reason: collision with root package name */
    public static final int f2024o0O000o0 = 21;

    /* renamed from: o0O000oo  reason: collision with root package name */
    public static final int f2025o0O000oo = 24;

    /* renamed from: o0O00O  reason: collision with root package name */
    public static final int f2026o0O00O = 29;

    /* renamed from: o0O00O0  reason: collision with root package name */
    public static final int f2027o0O00O0 = 26;

    /* renamed from: o0O00O0o  reason: collision with root package name */
    public static final int f2028o0O00O0o = 28;

    /* renamed from: o0O00OO  reason: collision with root package name */
    public static final int f2029o0O00OO = 30;

    /* renamed from: o0O00OOO  reason: collision with root package name */
    public static final int f2030o0O00OOO = 31;

    /* renamed from: o0O00Oo  reason: collision with root package name */
    public static final int f2031o0O00Oo = 32;

    /* renamed from: o0O00OoO  reason: collision with root package name */
    public static final int f2032o0O00OoO = 34;

    /* renamed from: o0O00Ooo  reason: collision with root package name */
    public static final int f2033o0O00Ooo = 35;

    /* renamed from: o0O00o  reason: collision with root package name */
    public static final int f2034o0O00o = 39;

    /* renamed from: o0O00o00  reason: collision with root package name */
    public static final int f2035o0O00o00 = 36;

    /* renamed from: o0O00o0O  reason: collision with root package name */
    public static final int f2036o0O00o0O = 37;

    /* renamed from: o0O00o0o  reason: collision with root package name */
    public static final int f2037o0O00o0o = 38;

    /* renamed from: o0O00oO0  reason: collision with root package name */
    public static final int f2038o0O00oO0 = 40;

    /* renamed from: o0O0O0O  reason: collision with root package name */
    public static final int f2039o0O0O0O = 41;

    /* renamed from: o0O0O0Oo  reason: collision with root package name */
    public static final int f2040o0O0O0Oo = 44;

    /* renamed from: o0O0O0o  reason: collision with root package name */
    public static final int f2041o0O0O0o = 46;

    /* renamed from: o0O0O0o0  reason: collision with root package name */
    public static final int f2042o0O0O0o0 = 45;

    /* renamed from: o0O0O0oO  reason: collision with root package name */
    public static final int f2043o0O0O0oO = 47;

    /* renamed from: o0O0O0oo  reason: collision with root package name */
    public static final int f2044o0O0O0oo = 48;

    /* renamed from: o0O0OO  reason: collision with root package name */
    public static final int f2045o0O0OO = 52;

    /* renamed from: o0O0OO0  reason: collision with root package name */
    public static final int f2046o0O0OO0 = 50;

    /* renamed from: o0O0OO0O  reason: collision with root package name */
    public static final int f2047o0O0OO0O = 51;

    /* renamed from: o0O0OOO  reason: collision with root package name */
    public static final int f2048o0O0OOO = 54;

    /* renamed from: o0O0OOO0  reason: collision with root package name */
    public static final int f2049o0O0OOO0 = 53;

    /* renamed from: o0O0OOOo  reason: collision with root package name */
    public static final int f2050o0O0OOOo = 55;

    /* renamed from: o0O0OOo  reason: collision with root package name */
    public static final int f2051o0O0OOo = 56;

    /* renamed from: o0O0OOoO  reason: collision with root package name */
    public static final int f2052o0O0OOoO = 57;

    /* renamed from: o0O0OOoo  reason: collision with root package name */
    public static final int f2053o0O0OOoo = 58;

    /* renamed from: o0O0Oo  reason: collision with root package name */
    public static final int f2054o0O0Oo = 63;

    /* renamed from: o0O0Oo0  reason: collision with root package name */
    public static final int f2055o0O0Oo0 = 60;

    /* renamed from: o0O0Oo0O  reason: collision with root package name */
    public static final int f2056o0O0Oo0O = 61;

    /* renamed from: o0O0Oo0o  reason: collision with root package name */
    public static final int f2057o0O0Oo0o = 62;

    /* renamed from: o0O0OoO  reason: collision with root package name */
    public static final int f2058o0O0OoO = 67;

    /* renamed from: o0O0OoO0  reason: collision with root package name */
    public static final int f2059o0O0OoO0 = 65;

    /* renamed from: o0O0OoOo  reason: collision with root package name */
    public static final int f2060o0O0OoOo = 68;

    /* renamed from: o0O0Ooo  reason: collision with root package name */
    public static final int f2061o0O0Ooo = 70;

    /* renamed from: o0O0Ooo0  reason: collision with root package name */
    public static final int f2062o0O0Ooo0 = 69;

    /* renamed from: o0O0OooO  reason: collision with root package name */
    public static final int f2063o0O0OooO = 71;

    /* renamed from: o0O0Oooo  reason: collision with root package name */
    public static final int f2064o0O0Oooo = 64;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final int f2065o0O0o = 3;

    /* renamed from: o0O0o0  reason: collision with root package name */
    public static final int f2066o0O0o0 = 76;

    /* renamed from: o0O0o00  reason: collision with root package name */
    public static final int f2067o0O0o00 = 73;

    /* renamed from: o0O0o000  reason: collision with root package name */
    public static final int f2068o0O0o000 = 72;

    /* renamed from: o0O0o00O  reason: collision with root package name */
    public static final int f2069o0O0o00O = 74;

    /* renamed from: o0O0o00o  reason: collision with root package name */
    public static final int f2070o0O0o00o = 75;

    /* renamed from: o0O0o0O  reason: collision with root package name */
    public static final int f2071o0O0o0O = 77;

    /* renamed from: o0O0o0OO  reason: collision with root package name */
    public static final int f2072o0O0o0OO = 78;

    /* renamed from: o0O0o0Oo  reason: collision with root package name */
    public static final int f2073o0O0o0Oo = 79;

    /* renamed from: o0O0o0o  reason: collision with root package name */
    public static final int f2074o0O0o0o = 81;

    /* renamed from: o0O0o0o0  reason: collision with root package name */
    public static final int f2075o0O0o0o0 = 80;

    /* renamed from: o0O0oo0o  reason: collision with root package name */
    public static final int f2076o0O0oo0o = 43;

    /* renamed from: o0OoO00O  reason: collision with root package name */
    public static final int f2077o0OoO00O = 27;

    /* renamed from: o0OoOoOO  reason: collision with root package name */
    public static final int f2078o0OoOoOO = 20;

    /* renamed from: o0OoOoOo  reason: collision with root package name */
    public static final int f2079o0OoOoOo = 18;

    /* renamed from: o0OooO0  reason: collision with root package name */
    public static final int f2080o0OooO0 = 59;

    /* renamed from: o0oO0O0o  reason: collision with root package name */
    public static final int f2081o0oO0O0o = 42;

    /* renamed from: o0oO0Ooo  reason: collision with root package name */
    public static final int f2082o0oO0Ooo = 33;

    /* renamed from: o0oOo0O0  reason: collision with root package name */
    public static final int f2083o0oOo0O0 = 82;

    /* renamed from: o0ooO  reason: collision with root package name */
    public static final int f2084o0ooO = 49;

    /* renamed from: o0ooOoOO  reason: collision with root package name */
    public static final int f2085o0ooOoOO = 23;

    /* renamed from: oo0OOoo  reason: collision with root package name */
    public static final int f2086oo0OOoo = 66;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public boolean f2087o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public HashMap<String, androidx.constraintlayout.widget.o00oOOo0> f2088o00oOOoO = new HashMap<>();

    /* renamed from: o00oOo00  reason: collision with root package name */
    public boolean f2089o00oOo00 = true;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public HashMap<Integer, o00oOOo0> f2090o00oOooO = new HashMap<>();

    /* loaded from: classes.dex */
    public static class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public int f2091o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final o00oOo0O f2092o00oOOoO = new o00oOo0O();

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final o00oOo00 f2093o00oOo00 = new o00oOo00();

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final o00oOOoO f2096o00oOooO = new o00oOOoO();

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final C0014o00oOoO f2094o00oOo0O = new C0014o00oOoO();

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public HashMap<String, androidx.constraintlayout.widget.o00oOOo0> f2095o00oOo0o = new HashMap<>();

        public void o00oOoO(ConstraintLayout.o00oOOoO o00ooooo2) {
            o00oOOoO o00ooooo3 = this.f2096o00oOooO;
            o00ooooo2.f1804o00oOooO = o00ooooo3.f2156o00oOoO;
            o00ooooo2.f1797o00oOo0O = o00ooooo3.f2158o00oOoOO;
            o00ooooo2.f1798o00oOo0o = o00ooooo3.f2159o00oOoOo;
            o00ooooo2.f1800o00oOoO0 = o00ooooo3.f2160o00oOoo0;
            o00ooooo2.f1799o00oOoO = o00ooooo3.f2162o00oOooo;
            o00ooooo2.f1801o00oOoOO = o00ooooo3.f2165o00oo00O;
            o00ooooo2.f1802o00oOoOo = o00ooooo3.f2164o00oo0;
            o00ooooo2.f1803o00oOoo0 = o00ooooo3.f2168o00oo0OO;
            o00ooooo2.f1805o00oOooo = o00ooooo3.f2167o00oo0O0;
            o00ooooo2.f1810o00oo0O0 = o00ooooo3.f2166o00oo0O;
            o00ooooo2.f1809o00oo0O = o00ooooo3.f2169o00oo0Oo;
            o00ooooo2.f1812o00oo0Oo = o00ooooo3.f2171o00oo0o0;
            o00ooooo2.f1814o00oo0o0 = o00ooooo3.f2170o00oo0o;
            ((ViewGroup.MarginLayoutParams) o00ooooo2).leftMargin = o00ooooo3.f2178o00ooOO;
            ((ViewGroup.MarginLayoutParams) o00ooooo2).rightMargin = o00ooooo3.f2180o00ooOOo;
            ((ViewGroup.MarginLayoutParams) o00ooooo2).topMargin = o00ooooo3.f2182o00ooOo0;
            ((ViewGroup.MarginLayoutParams) o00ooooo2).bottomMargin = o00ooooo3.f2181o00ooOo;
            o00ooooo2.f1818o00ooO00 = o00ooooo3.f2190o00oooOO;
            o00ooooo2.f1817o00ooO0 = o00ooooo3.f2189o00oooO;
            o00ooooo2.f1815o00oo0oO = o00ooooo3.f2185o00ooo0;
            o00ooooo2.f1806o00oo = o00ooooo3.f2188o00ooo0o;
            o00ooooo2.f1819o00ooO0O = o00ooooo3.f2172o00oo0oO;
            o00ooooo2.f1820o00ooO0o = o00ooooo3.f2207o0O0o;
            o00ooooo2.f1808o00oo00O = o00ooooo3.f2175o00ooO00;
            o00ooooo2.f1807o00oo0 = o00ooooo3.f2174o00ooO0;
            o00ooooo2.f1811o00oo0OO = o00ooooo3.f2176o00ooO0O;
            o00ooooo2.f1816o00ooO = o00ooooo3.f2163o00oo;
            o00ooooo2.f1836o00oooo0 = o00ooooo3.f2177o00ooO0o;
            o00ooooo2.f1835o00oooo = o00ooooo3.f2173o00ooO;
            o00ooooo2.f1825o00ooOo0 = o00ooooo3.f2191o00oooOo;
            o00ooooo2.f1823o00ooOOo = o00ooooo3.f2193o00oooo0;
            o00ooooo2.f1826o00ooOoO = o00ooooo3.f2194o00ooooO;
            o00ooooo2.f1824o00ooOo = o00ooooo3.f2192o00oooo;
            o00ooooo2.f1838o00ooooo = o00ooooo3.f2196o0O00;
            o00ooooo2.f1793o0 = o00ooooo3.f2206o0O00O0;
            o00ooooo2.f1827o00ooOoo = o00ooooo3.f2195o00ooooo;
            o00ooooo2.f1829o00ooo00 = o00ooooo3.f2150o0;
            o00ooooo2.f1831o00ooo0o = o00ooooo3.f2198o0O00000;
            o00ooooo2.f1832o00oooO = o00ooooo3.f2199o0O0000O;
            o00ooooo2.f1828o00ooo0 = o00ooooo3.f2200o0O0000o;
            o00ooooo2.f1830o00ooo0O = o00ooooo3.f2197o0O000;
            o00ooooo2.f1833o00oooOO = o00ooooo3.f2201o0O000O;
            o00ooooo2.f1834o00oooOo = o00ooooo3.f2210o0OoOoOo;
            o00ooooo2.f1837o00ooooO = o00ooooo3.f2179o00ooOO0;
            o00ooooo2.f1796o00oOo00 = o00ooooo3.f2157o00oOoO0;
            o00ooooo2.f1794o00oOOo0 = o00ooooo3.f2154o00oOo0O;
            o00ooooo2.f1795o00oOOoO = o00ooooo3.f2155o00oOo0o;
            ((ViewGroup.MarginLayoutParams) o00ooooo2).width = o00ooooo3.f2153o00oOo00;
            ((ViewGroup.MarginLayoutParams) o00ooooo2).height = o00ooooo3.f2161o00oOooO;
            String str = o00ooooo3.f2205o0O000oo;
            if (str != null) {
                o00ooooo2.f1841o0O00000 = str;
            }
            o00ooooo2.setMarginStart(o00ooooo3.f2184o00ooOoo);
            o00ooooo2.setMarginEnd(this.f2096o00oOooO.f2183o00ooOoO);
            o00ooooo2.o00oOo0O();
        }

        /* renamed from: o00oOoOO */
        public o00oOOo0 clone() {
            o00oOOo0 o00oooo02 = new o00oOOo0();
            o00oooo02.f2096o00oOooO.o00oOOo0(this.f2096o00oOooO);
            o00oooo02.f2093o00oOo00.o00oOOo0(this.f2093o00oOo00);
            o00oooo02.f2092o00oOOoO.o00oOOo0(this.f2092o00oOOoO);
            o00oooo02.f2094o00oOo0O.o00oOOo0(this.f2094o00oOo0O);
            o00oooo02.f2091o00oOOo0 = this.f2091o00oOOo0;
            return o00oooo02;
        }

        public final void o00oOoOo(int i, ConstraintLayout.o00oOOoO o00ooooo2) {
            this.f2091o00oOOo0 = i;
            o00oOOoO o00ooooo3 = this.f2096o00oOooO;
            o00ooooo3.f2156o00oOoO = o00ooooo2.f1804o00oOooO;
            o00ooooo3.f2158o00oOoOO = o00ooooo2.f1797o00oOo0O;
            o00ooooo3.f2159o00oOoOo = o00ooooo2.f1798o00oOo0o;
            o00ooooo3.f2160o00oOoo0 = o00ooooo2.f1800o00oOoO0;
            o00ooooo3.f2162o00oOooo = o00ooooo2.f1799o00oOoO;
            o00ooooo3.f2165o00oo00O = o00ooooo2.f1801o00oOoOO;
            o00ooooo3.f2164o00oo0 = o00ooooo2.f1802o00oOoOo;
            o00ooooo3.f2168o00oo0OO = o00ooooo2.f1803o00oOoo0;
            o00ooooo3.f2167o00oo0O0 = o00ooooo2.f1805o00oOooo;
            o00ooooo3.f2166o00oo0O = o00ooooo2.f1810o00oo0O0;
            o00ooooo3.f2169o00oo0Oo = o00ooooo2.f1809o00oo0O;
            o00ooooo3.f2171o00oo0o0 = o00ooooo2.f1812o00oo0Oo;
            o00ooooo3.f2170o00oo0o = o00ooooo2.f1814o00oo0o0;
            o00ooooo3.f2172o00oo0oO = o00ooooo2.f1819o00ooO0O;
            o00ooooo3.f2207o0O0o = o00ooooo2.f1820o00ooO0o;
            o00ooooo3.f2163o00oo = o00ooooo2.f1816o00ooO;
            o00ooooo3.f2175o00ooO00 = o00ooooo2.f1808o00oo00O;
            o00ooooo3.f2174o00ooO0 = o00ooooo2.f1807o00oo0;
            o00ooooo3.f2176o00ooO0O = o00ooooo2.f1811o00oo0OO;
            o00ooooo3.f2177o00ooO0o = o00ooooo2.f1836o00oooo0;
            o00ooooo3.f2173o00ooO = o00ooooo2.f1835o00oooo;
            o00ooooo3.f2179o00ooOO0 = o00ooooo2.f1837o00ooooO;
            o00ooooo3.f2157o00oOoO0 = o00ooooo2.f1796o00oOo00;
            o00ooooo3.f2154o00oOo0O = o00ooooo2.f1794o00oOOo0;
            o00ooooo3.f2155o00oOo0o = o00ooooo2.f1795o00oOOoO;
            o00ooooo3.f2153o00oOo00 = ((ViewGroup.MarginLayoutParams) o00ooooo2).width;
            o00ooooo3.f2161o00oOooO = ((ViewGroup.MarginLayoutParams) o00ooooo2).height;
            o00ooooo3.f2178o00ooOO = ((ViewGroup.MarginLayoutParams) o00ooooo2).leftMargin;
            o00ooooo3.f2180o00ooOOo = ((ViewGroup.MarginLayoutParams) o00ooooo2).rightMargin;
            o00ooooo3.f2182o00ooOo0 = ((ViewGroup.MarginLayoutParams) o00ooooo2).topMargin;
            o00ooooo3.f2181o00ooOo = ((ViewGroup.MarginLayoutParams) o00ooooo2).bottomMargin;
            o00ooooo3.f2191o00oooOo = o00ooooo2.f1825o00ooOo0;
            o00ooooo3.f2193o00oooo0 = o00ooooo2.f1823o00ooOOo;
            o00ooooo3.f2194o00ooooO = o00ooooo2.f1826o00ooOoO;
            o00ooooo3.f2192o00oooo = o00ooooo2.f1824o00ooOo;
            o00ooooo3.f2196o0O00 = o00ooooo2.f1838o00ooooo;
            o00ooooo3.f2206o0O00O0 = o00ooooo2.f1793o0;
            o00ooooo3.f2195o00ooooo = o00ooooo2.f1827o00ooOoo;
            o00ooooo3.f2150o0 = o00ooooo2.f1829o00ooo00;
            o00ooooo3.f2198o0O00000 = o00ooooo2.f1831o00ooo0o;
            o00ooooo3.f2199o0O0000O = o00ooooo2.f1832o00oooO;
            o00ooooo3.f2200o0O0000o = o00ooooo2.f1828o00ooo0;
            o00ooooo3.f2197o0O000 = o00ooooo2.f1830o00ooo0O;
            o00ooooo3.f2201o0O000O = o00ooooo2.f1833o00oooOO;
            o00ooooo3.f2210o0OoOoOo = o00ooooo2.f1834o00oooOo;
            o00ooooo3.f2205o0O000oo = o00ooooo2.f1841o0O00000;
            o00ooooo3.f2185o00ooo0 = o00ooooo2.f1815o00oo0oO;
            o00ooooo3.f2188o00ooo0o = o00ooooo2.f1806o00oo;
            o00ooooo3.f2186o00ooo00 = o00ooooo2.f1813o00oo0o;
            o00ooooo3.f2187o00ooo0O = o00ooooo2.f1855o0O0o;
            o00ooooo3.f2190o00oooOO = o00ooooo2.f1818o00ooO00;
            o00ooooo3.f2189o00oooO = o00ooooo2.f1817o00ooO0;
            o00ooooo3.f2183o00ooOoO = o00ooooo2.getMarginEnd();
            this.f2096o00oOooO.f2184o00ooOoo = o00ooooo2.getMarginStart();
        }

        public final void o00oOoo0(int i, o00oo00O.o00oOOo0 o00oooo02) {
            o00oOoOo(i, o00oooo02);
            this.f2092o00oOOoO.f2230o00oOooO = o00oooo02.f2259o0O0OO0O;
            C0014o00oOoO c0014o00oOoO = this.f2094o00oOo0O;
            c0014o00oOoO.f2244o00oOOoO = o00oooo02.f2260o0O0OOO;
            c0014o00oOoO.f2245o00oOo00 = o00oooo02.f2262o0O0OOOo;
            c0014o00oOoO.f2253o00oOooO = o00oooo02.f2263o0O0OOo;
            c0014o00oOoO.f2246o00oOo0O = o00oooo02.f2264o0O0OOoO;
            c0014o00oOoO.f2247o00oOo0o = o00oooo02.f2265o0O0OOoo;
            c0014o00oOoO.f2249o00oOoO0 = o00oooo02.f2270o0OooO0;
            c0014o00oOoO.f2248o00oOoO = o00oooo02.f2267o0O0Oo0;
            c0014o00oOoO.f2250o00oOoOO = o00oooo02.f2268o0O0Oo0O;
            c0014o00oOoO.f2251o00oOoOo = o00oooo02.f2269o0O0Oo0o;
            c0014o00oOoO.f2252o00oOoo0 = o00oooo02.f2266o0O0Oo;
            c0014o00oOoO.f2255o00oo00O = o00oooo02.f2261o0O0OOO0;
            c0014o00oOoO.f2254o00oOooo = o00oooo02.f2258o0O0OO;
        }

        public final void o00oOooo(androidx.constraintlayout.widget.o00oOOoO o00ooooo2, int i, o00oo00O.o00oOOo0 o00oooo02) {
            o00oOoo0(i, o00oooo02);
            if (o00ooooo2 instanceof Barrier) {
                o00oOOoO o00ooooo3 = this.f2096o00oOooO;
                o00ooooo3.f2204o0O000o0 = 1;
                Barrier barrier = (Barrier) o00ooooo2;
                o00ooooo3.f2202o0O000Oo = barrier.getType();
                this.f2096o00oOooO.f2203o0O000o = barrier.getReferencedIds();
                this.f2096o00oOooO.f2209o0OoOoOO = barrier.getMargin();
            }
        }

        public final void o00oo0(String str, int i) {
            o00oo00O(str, o00oOOo0.o00oOOoO.COLOR_TYPE).o00oOoOo(i);
        }

        public final androidx.constraintlayout.widget.o00oOOo0 o00oo00O(String str, o00oOOo0.o00oOOoO o00ooooo2) {
            if (!this.f2095o00oOo0o.containsKey(str)) {
                androidx.constraintlayout.widget.o00oOOo0 o00oooo02 = new androidx.constraintlayout.widget.o00oOOo0(str, o00ooooo2);
                this.f2095o00oOo0o.put(str, o00oooo02);
                return o00oooo02;
            }
            androidx.constraintlayout.widget.o00oOOo0 o00oooo03 = this.f2095o00oOo0o.get(str);
            if (o00oooo03.o00oOooO() == o00ooooo2) {
                return o00oooo03;
            }
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("ConstraintAttribute is already a ");
            o00oOOo02.append(o00oooo03.o00oOooO().name());
            throw new IllegalArgumentException(o00oOOo02.toString());
        }

        public final void o00oo0O(String str, String str2) {
            o00oo00O(str, o00oOOo0.o00oOOoO.STRING_TYPE).o00oo0(str2);
        }

        public final void o00oo0O0(String str, int i) {
            o00oo00O(str, o00oOOo0.o00oOOoO.INT_TYPE).o00oOooo(i);
        }

        public final void o00oo0OO(String str, float f) {
            o00oo00O(str, o00oOOo0.o00oOOoO.FLOAT_TYPE).o00oOoo0(f);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO {

        /* renamed from: o0O00O  reason: collision with root package name */
        public static SparseIntArray f2097o0O00O = null;

        /* renamed from: o0O00O0o  reason: collision with root package name */
        public static final int f2098o0O00O0o = -1;

        /* renamed from: o0O00OO  reason: collision with root package name */
        public static final int f2099o0O00OO = 1;

        /* renamed from: o0O00OOO  reason: collision with root package name */
        public static final int f2100o0O00OOO = 2;

        /* renamed from: o0O00Oo  reason: collision with root package name */
        public static final int f2101o0O00Oo = 3;

        /* renamed from: o0O00OoO  reason: collision with root package name */
        public static final int f2102o0O00OoO = 5;

        /* renamed from: o0O00Ooo  reason: collision with root package name */
        public static final int f2103o0O00Ooo = 6;

        /* renamed from: o0O00o  reason: collision with root package name */
        public static final int f2104o0O00o = 10;

        /* renamed from: o0O00o00  reason: collision with root package name */
        public static final int f2105o0O00o00 = 7;

        /* renamed from: o0O00o0O  reason: collision with root package name */
        public static final int f2106o0O00o0O = 8;

        /* renamed from: o0O00o0o  reason: collision with root package name */
        public static final int f2107o0O00o0o = 9;

        /* renamed from: o0O00oO0  reason: collision with root package name */
        public static final int f2108o0O00oO0 = 11;

        /* renamed from: o0O0O0O  reason: collision with root package name */
        public static final int f2109o0O0O0O = 12;

        /* renamed from: o0O0O0Oo  reason: collision with root package name */
        public static final int f2110o0O0O0Oo = 15;

        /* renamed from: o0O0O0o  reason: collision with root package name */
        public static final int f2111o0O0O0o = 17;

        /* renamed from: o0O0O0o0  reason: collision with root package name */
        public static final int f2112o0O0O0o0 = 16;

        /* renamed from: o0O0O0oO  reason: collision with root package name */
        public static final int f2113o0O0O0oO = 18;

        /* renamed from: o0O0O0oo  reason: collision with root package name */
        public static final int f2114o0O0O0oo = 19;

        /* renamed from: o0O0OO  reason: collision with root package name */
        public static final int f2115o0O0OO = 23;

        /* renamed from: o0O0OO0  reason: collision with root package name */
        public static final int f2116o0O0OO0 = 21;

        /* renamed from: o0O0OO0O  reason: collision with root package name */
        public static final int f2117o0O0OO0O = 22;

        /* renamed from: o0O0OOO  reason: collision with root package name */
        public static final int f2118o0O0OOO = 25;

        /* renamed from: o0O0OOO0  reason: collision with root package name */
        public static final int f2119o0O0OOO0 = 24;

        /* renamed from: o0O0OOOo  reason: collision with root package name */
        public static final int f2120o0O0OOOo = 26;

        /* renamed from: o0O0OOo  reason: collision with root package name */
        public static final int f2121o0O0OOo = 27;

        /* renamed from: o0O0OOoO  reason: collision with root package name */
        public static final int f2122o0O0OOoO = 28;

        /* renamed from: o0O0OOoo  reason: collision with root package name */
        public static final int f2123o0O0OOoo = 29;

        /* renamed from: o0O0Oo  reason: collision with root package name */
        public static final int f2124o0O0Oo = 34;

        /* renamed from: o0O0Oo0  reason: collision with root package name */
        public static final int f2125o0O0Oo0 = 31;

        /* renamed from: o0O0Oo0O  reason: collision with root package name */
        public static final int f2126o0O0Oo0O = 32;

        /* renamed from: o0O0Oo0o  reason: collision with root package name */
        public static final int f2127o0O0Oo0o = 33;

        /* renamed from: o0O0OoO  reason: collision with root package name */
        public static final int f2128o0O0OoO = 38;

        /* renamed from: o0O0OoO0  reason: collision with root package name */
        public static final int f2129o0O0OoO0 = 36;

        /* renamed from: o0O0OoOo  reason: collision with root package name */
        public static final int f2130o0O0OoOo = 39;

        /* renamed from: o0O0Ooo  reason: collision with root package name */
        public static final int f2131o0O0Ooo = 61;

        /* renamed from: o0O0Ooo0  reason: collision with root package name */
        public static final int f2132o0O0Ooo0 = 40;

        /* renamed from: o0O0OooO  reason: collision with root package name */
        public static final int f2133o0O0OooO = 62;

        /* renamed from: o0O0Oooo  reason: collision with root package name */
        public static final int f2134o0O0Oooo = 35;

        /* renamed from: o0O0o0  reason: collision with root package name */
        public static final int f2135o0O0o0 = 72;

        /* renamed from: o0O0o00  reason: collision with root package name */
        public static final int f2136o0O0o00 = 69;

        /* renamed from: o0O0o000  reason: collision with root package name */
        public static final int f2137o0O0o000 = 63;

        /* renamed from: o0O0o00O  reason: collision with root package name */
        public static final int f2138o0O0o00O = 70;

        /* renamed from: o0O0o00o  reason: collision with root package name */
        public static final int f2139o0O0o00o = 71;

        /* renamed from: o0O0o0O  reason: collision with root package name */
        public static final int f2140o0O0o0O = 73;

        /* renamed from: o0O0o0OO  reason: collision with root package name */
        public static final int f2141o0O0o0OO = 74;

        /* renamed from: o0O0o0Oo  reason: collision with root package name */
        public static final int f2142o0O0o0Oo = 75;

        /* renamed from: o0O0o0o0  reason: collision with root package name */
        public static final int f2143o0O0o0o0 = 76;

        /* renamed from: o0O0oo0o  reason: collision with root package name */
        public static final int f2144o0O0oo0o = 14;

        /* renamed from: o0OooO0  reason: collision with root package name */
        public static final int f2145o0OooO0 = 30;

        /* renamed from: o0oO0O0o  reason: collision with root package name */
        public static final int f2146o0oO0O0o = 13;

        /* renamed from: o0oO0Ooo  reason: collision with root package name */
        public static final int f2147o0oO0Ooo = 4;

        /* renamed from: o0ooO  reason: collision with root package name */
        public static final int f2148o0ooO = 20;

        /* renamed from: oo0OOoo  reason: collision with root package name */
        public static final int f2149oo0OOoo = 37;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f2153o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f2161o00oOooO;

        /* renamed from: o0O000o  reason: collision with root package name */
        public int[] f2203o0O000o;

        /* renamed from: o0O000oo  reason: collision with root package name */
        public String f2205o0O000oo;

        /* renamed from: o0ooOoOO  reason: collision with root package name */
        public String f2211o0ooOoOO;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public boolean f2151o00oOOo0 = false;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public boolean f2152o00oOOoO = false;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public int f2154o00oOo0O = -1;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public int f2155o00oOo0o = -1;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public float f2157o00oOoO0 = -1.0f;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public int f2156o00oOoO = -1;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public int f2158o00oOoOO = -1;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public int f2159o00oOoOo = -1;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public int f2160o00oOoo0 = -1;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public int f2162o00oOooo = -1;

        /* renamed from: o00oo00O  reason: collision with root package name */
        public int f2165o00oo00O = -1;

        /* renamed from: o00oo0  reason: collision with root package name */
        public int f2164o00oo0 = -1;

        /* renamed from: o00oo0OO  reason: collision with root package name */
        public int f2168o00oo0OO = -1;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public int f2167o00oo0O0 = -1;

        /* renamed from: o00oo0O  reason: collision with root package name */
        public int f2166o00oo0O = -1;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public int f2169o00oo0Oo = -1;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public int f2171o00oo0o0 = -1;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public int f2170o00oo0o = -1;

        /* renamed from: o00oo0oO  reason: collision with root package name */
        public float f2172o00oo0oO = 0.5f;

        /* renamed from: o0O0o  reason: collision with root package name */
        public float f2207o0O0o = 0.5f;

        /* renamed from: o00oo  reason: collision with root package name */
        public String f2163o00oo = null;

        /* renamed from: o00ooO00  reason: collision with root package name */
        public int f2175o00ooO00 = -1;

        /* renamed from: o00ooO0  reason: collision with root package name */
        public int f2174o00ooO0 = 0;

        /* renamed from: o00ooO0O  reason: collision with root package name */
        public float f2176o00ooO0O = 0.0f;

        /* renamed from: o00ooO0o  reason: collision with root package name */
        public int f2177o00ooO0o = -1;

        /* renamed from: o00ooO  reason: collision with root package name */
        public int f2173o00ooO = -1;

        /* renamed from: o00ooOO0  reason: collision with root package name */
        public int f2179o00ooOO0 = -1;

        /* renamed from: o00ooOO  reason: collision with root package name */
        public int f2178o00ooOO = -1;

        /* renamed from: o00ooOOo  reason: collision with root package name */
        public int f2180o00ooOOo = -1;

        /* renamed from: o00ooOo0  reason: collision with root package name */
        public int f2182o00ooOo0 = -1;

        /* renamed from: o00ooOo  reason: collision with root package name */
        public int f2181o00ooOo = -1;

        /* renamed from: o00ooOoO  reason: collision with root package name */
        public int f2183o00ooOoO = -1;

        /* renamed from: o00ooOoo  reason: collision with root package name */
        public int f2184o00ooOoo = -1;

        /* renamed from: o00ooo00  reason: collision with root package name */
        public int f2186o00ooo00 = -1;

        /* renamed from: o00ooo0  reason: collision with root package name */
        public int f2185o00ooo0 = -1;

        /* renamed from: o00ooo0O  reason: collision with root package name */
        public int f2187o00ooo0O = -1;

        /* renamed from: o00ooo0o  reason: collision with root package name */
        public int f2188o00ooo0o = -1;

        /* renamed from: o00oooO  reason: collision with root package name */
        public int f2189o00oooO = -1;

        /* renamed from: o00oooOO  reason: collision with root package name */
        public int f2190o00oooOO = -1;

        /* renamed from: o00oooOo  reason: collision with root package name */
        public float f2191o00oooOo = -1.0f;

        /* renamed from: o00oooo0  reason: collision with root package name */
        public float f2193o00oooo0 = -1.0f;

        /* renamed from: o00oooo  reason: collision with root package name */
        public int f2192o00oooo = 0;

        /* renamed from: o00ooooO  reason: collision with root package name */
        public int f2194o00ooooO = 0;

        /* renamed from: o00ooooo  reason: collision with root package name */
        public int f2195o00ooooo = 0;

        /* renamed from: o0  reason: collision with root package name */
        public int f2150o0 = 0;

        /* renamed from: o0O00000  reason: collision with root package name */
        public int f2198o0O00000 = -1;

        /* renamed from: o0O0000O  reason: collision with root package name */
        public int f2199o0O0000O = -1;

        /* renamed from: o0O0000o  reason: collision with root package name */
        public int f2200o0O0000o = -1;

        /* renamed from: o0O000  reason: collision with root package name */
        public int f2197o0O000 = -1;

        /* renamed from: o0O000O  reason: collision with root package name */
        public float f2201o0O000O = 1.0f;

        /* renamed from: o0OoOoOo  reason: collision with root package name */
        public float f2210o0OoOoOo = 1.0f;

        /* renamed from: o0O000Oo  reason: collision with root package name */
        public int f2202o0O000Oo = -1;

        /* renamed from: o0OoOoOO  reason: collision with root package name */
        public int f2209o0OoOoOO = 0;

        /* renamed from: o0O000o0  reason: collision with root package name */
        public int f2204o0O000o0 = -1;

        /* renamed from: o0O00  reason: collision with root package name */
        public boolean f2196o0O00 = false;

        /* renamed from: o0O00O0  reason: collision with root package name */
        public boolean f2206o0O00O0 = false;

        /* renamed from: o0OoO00O  reason: collision with root package name */
        public boolean f2208o0OoO00O = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2097o0O00O = sparseIntArray;
            sparseIntArray.append(R.styleable.Layout_layout_constraintLeft_toLeftOf, 24);
            f2097o0O00O.append(R.styleable.Layout_layout_constraintLeft_toRightOf, 25);
            f2097o0O00O.append(R.styleable.Layout_layout_constraintRight_toLeftOf, 28);
            f2097o0O00O.append(R.styleable.Layout_layout_constraintRight_toRightOf, 29);
            f2097o0O00O.append(R.styleable.Layout_layout_constraintTop_toTopOf, 35);
            f2097o0O00O.append(R.styleable.Layout_layout_constraintTop_toBottomOf, 34);
            f2097o0O00O.append(R.styleable.Layout_layout_constraintBottom_toTopOf, 4);
            f2097o0O00O.append(R.styleable.Layout_layout_constraintBottom_toBottomOf, 3);
            f2097o0O00O.append(R.styleable.Layout_layout_constraintBaseline_toBaselineOf, 1);
            f2097o0O00O.append(R.styleable.Layout_layout_editor_absoluteX, 6);
            f2097o0O00O.append(R.styleable.Layout_layout_editor_absoluteY, 7);
            f2097o0O00O.append(R.styleable.Layout_layout_constraintGuide_begin, 17);
            f2097o0O00O.append(R.styleable.Layout_layout_constraintGuide_end, 18);
            f2097o0O00O.append(R.styleable.Layout_layout_constraintGuide_percent, 19);
            f2097o0O00O.append(R.styleable.Layout_android_orientation, 26);
            f2097o0O00O.append(R.styleable.Layout_layout_constraintStart_toEndOf, 31);
            f2097o0O00O.append(R.styleable.Layout_layout_constraintStart_toStartOf, 32);
            f2097o0O00O.append(R.styleable.Layout_layout_constraintEnd_toStartOf, 10);
            f2097o0O00O.append(R.styleable.Layout_layout_constraintEnd_toEndOf, 9);
            f2097o0O00O.append(R.styleable.Layout_layout_goneMarginLeft, 13);
            f2097o0O00O.append(R.styleable.Layout_layout_goneMarginTop, 16);
            f2097o0O00O.append(R.styleable.Layout_layout_goneMarginRight, 14);
            f2097o0O00O.append(R.styleable.Layout_layout_goneMarginBottom, 11);
            f2097o0O00O.append(R.styleable.Layout_layout_goneMarginStart, 15);
            f2097o0O00O.append(R.styleable.Layout_layout_goneMarginEnd, 12);
            f2097o0O00O.append(R.styleable.Layout_layout_constraintVertical_weight, 38);
            f2097o0O00O.append(R.styleable.Layout_layout_constraintHorizontal_weight, 37);
            f2097o0O00O.append(R.styleable.Layout_layout_constraintHorizontal_chainStyle, 39);
            f2097o0O00O.append(R.styleable.Layout_layout_constraintVertical_chainStyle, 40);
            f2097o0O00O.append(R.styleable.Layout_layout_constraintHorizontal_bias, 20);
            f2097o0O00O.append(R.styleable.Layout_layout_constraintVertical_bias, 36);
            f2097o0O00O.append(R.styleable.Layout_layout_constraintDimensionRatio, 5);
            f2097o0O00O.append(R.styleable.Layout_layout_constraintLeft_creator, 76);
            f2097o0O00O.append(R.styleable.Layout_layout_constraintTop_creator, 76);
            f2097o0O00O.append(R.styleable.Layout_layout_constraintRight_creator, 76);
            f2097o0O00O.append(R.styleable.Layout_layout_constraintBottom_creator, 76);
            f2097o0O00O.append(R.styleable.Layout_layout_constraintBaseline_creator, 76);
            f2097o0O00O.append(R.styleable.Layout_android_layout_marginLeft, 23);
            f2097o0O00O.append(R.styleable.Layout_android_layout_marginRight, 27);
            f2097o0O00O.append(R.styleable.Layout_android_layout_marginStart, 30);
            f2097o0O00O.append(R.styleable.Layout_android_layout_marginEnd, 8);
            f2097o0O00O.append(R.styleable.Layout_android_layout_marginTop, 33);
            f2097o0O00O.append(R.styleable.Layout_android_layout_marginBottom, 2);
            f2097o0O00O.append(R.styleable.Layout_android_layout_width, 22);
            f2097o0O00O.append(R.styleable.Layout_android_layout_height, 21);
            f2097o0O00O.append(R.styleable.Layout_layout_constraintCircle, 61);
            f2097o0O00O.append(R.styleable.Layout_layout_constraintCircleRadius, 62);
            f2097o0O00O.append(R.styleable.Layout_layout_constraintCircleAngle, 63);
            f2097o0O00O.append(R.styleable.Layout_layout_constraintWidth_percent, 69);
            f2097o0O00O.append(R.styleable.Layout_layout_constraintHeight_percent, 70);
            f2097o0O00O.append(R.styleable.Layout_chainUseRtl, 71);
            f2097o0O00O.append(R.styleable.Layout_barrierDirection, 72);
            f2097o0O00O.append(R.styleable.Layout_barrierMargin, 73);
            f2097o0O00O.append(R.styleable.Layout_constraint_referenced_ids, 74);
            f2097o0O00O.append(R.styleable.Layout_barrierAllowsGoneWidgets, 75);
        }

        public void o00oOOo0(o00oOOoO o00ooooo2) {
            this.f2151o00oOOo0 = o00ooooo2.f2151o00oOOo0;
            this.f2153o00oOo00 = o00ooooo2.f2153o00oOo00;
            this.f2152o00oOOoO = o00ooooo2.f2152o00oOOoO;
            this.f2161o00oOooO = o00ooooo2.f2161o00oOooO;
            this.f2154o00oOo0O = o00ooooo2.f2154o00oOo0O;
            this.f2155o00oOo0o = o00ooooo2.f2155o00oOo0o;
            this.f2157o00oOoO0 = o00ooooo2.f2157o00oOoO0;
            this.f2156o00oOoO = o00ooooo2.f2156o00oOoO;
            this.f2158o00oOoOO = o00ooooo2.f2158o00oOoOO;
            this.f2159o00oOoOo = o00ooooo2.f2159o00oOoOo;
            this.f2160o00oOoo0 = o00ooooo2.f2160o00oOoo0;
            this.f2162o00oOooo = o00ooooo2.f2162o00oOooo;
            this.f2165o00oo00O = o00ooooo2.f2165o00oo00O;
            this.f2164o00oo0 = o00ooooo2.f2164o00oo0;
            this.f2168o00oo0OO = o00ooooo2.f2168o00oo0OO;
            this.f2167o00oo0O0 = o00ooooo2.f2167o00oo0O0;
            this.f2166o00oo0O = o00ooooo2.f2166o00oo0O;
            this.f2169o00oo0Oo = o00ooooo2.f2169o00oo0Oo;
            this.f2171o00oo0o0 = o00ooooo2.f2171o00oo0o0;
            this.f2170o00oo0o = o00ooooo2.f2170o00oo0o;
            this.f2172o00oo0oO = o00ooooo2.f2172o00oo0oO;
            this.f2207o0O0o = o00ooooo2.f2207o0O0o;
            this.f2163o00oo = o00ooooo2.f2163o00oo;
            this.f2175o00ooO00 = o00ooooo2.f2175o00ooO00;
            this.f2174o00ooO0 = o00ooooo2.f2174o00ooO0;
            this.f2176o00ooO0O = o00ooooo2.f2176o00ooO0O;
            this.f2177o00ooO0o = o00ooooo2.f2177o00ooO0o;
            this.f2173o00ooO = o00ooooo2.f2173o00ooO;
            this.f2179o00ooOO0 = o00ooooo2.f2179o00ooOO0;
            this.f2178o00ooOO = o00ooooo2.f2178o00ooOO;
            this.f2180o00ooOOo = o00ooooo2.f2180o00ooOOo;
            this.f2182o00ooOo0 = o00ooooo2.f2182o00ooOo0;
            this.f2181o00ooOo = o00ooooo2.f2181o00ooOo;
            this.f2183o00ooOoO = o00ooooo2.f2183o00ooOoO;
            this.f2184o00ooOoo = o00ooooo2.f2184o00ooOoo;
            this.f2186o00ooo00 = o00ooooo2.f2186o00ooo00;
            this.f2185o00ooo0 = o00ooooo2.f2185o00ooo0;
            this.f2187o00ooo0O = o00ooooo2.f2187o00ooo0O;
            this.f2188o00ooo0o = o00ooooo2.f2188o00ooo0o;
            this.f2189o00oooO = o00ooooo2.f2189o00oooO;
            this.f2190o00oooOO = o00ooooo2.f2190o00oooOO;
            this.f2191o00oooOo = o00ooooo2.f2191o00oooOo;
            this.f2193o00oooo0 = o00ooooo2.f2193o00oooo0;
            this.f2192o00oooo = o00ooooo2.f2192o00oooo;
            this.f2194o00ooooO = o00ooooo2.f2194o00ooooO;
            this.f2195o00ooooo = o00ooooo2.f2195o00ooooo;
            this.f2150o0 = o00ooooo2.f2150o0;
            this.f2198o0O00000 = o00ooooo2.f2198o0O00000;
            this.f2199o0O0000O = o00ooooo2.f2199o0O0000O;
            this.f2200o0O0000o = o00ooooo2.f2200o0O0000o;
            this.f2197o0O000 = o00ooooo2.f2197o0O000;
            this.f2201o0O000O = o00ooooo2.f2201o0O000O;
            this.f2210o0OoOoOo = o00ooooo2.f2210o0OoOoOo;
            this.f2202o0O000Oo = o00ooooo2.f2202o0O000Oo;
            this.f2209o0OoOoOO = o00ooooo2.f2209o0OoOoOO;
            this.f2204o0O000o0 = o00ooooo2.f2204o0O000o0;
            this.f2205o0O000oo = o00ooooo2.f2205o0O000oo;
            int[] iArr = o00ooooo2.f2203o0O000o;
            if (iArr != null) {
                this.f2203o0O000o = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f2203o0O000o = null;
            }
            this.f2211o0ooOoOO = o00ooooo2.f2211o0ooOoOO;
            this.f2196o0O00 = o00ooooo2.f2196o0O00;
            this.f2206o0O00O0 = o00ooooo2.f2206o0O00O0;
            this.f2208o0OoO00O = o00ooooo2.f2208o0OoO00O;
        }

        public void o00oOOoO(o0O00 o0o00, StringBuilder sb) {
            Field[] declaredFields = getClass().getDeclaredFields();
            sb.append("\n");
            for (Field field : declaredFields) {
                String name = field.getName();
                if (!Modifier.isStatic(field.getModifiers())) {
                    try {
                        Object obj = field.get(this);
                        Class<?> type = field.getType();
                        if (type == Integer.TYPE) {
                            Integer num = (Integer) obj;
                            if (num.intValue() != -1) {
                                Object o00ooo0o2 = o0o00.o00ooo0o(num.intValue());
                                sb.append("    ");
                                sb.append(name);
                                sb.append(" = \"");
                                sb.append(o00ooo0o2 == null ? num : o00ooo0o2);
                            }
                        } else if (type == Float.TYPE) {
                            Float f = (Float) obj;
                            if (f.floatValue() != -1.0f) {
                                sb.append("    ");
                                sb.append(name);
                                sb.append(" = \"");
                                sb.append(f);
                            }
                        }
                        sb.append("\"\n");
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        public void o00oOo00(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Layout);
            this.f2152o00oOOoO = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = f2097o0O00O.get(index);
                if (i2 == 80) {
                    this.f2196o0O00 = obtainStyledAttributes.getBoolean(index, this.f2196o0O00);
                } else if (i2 != 81) {
                    switch (i2) {
                        case 1:
                            this.f2167o00oo0O0 = o00oOoO.o0oO0Ooo(obtainStyledAttributes, index, this.f2167o00oo0O0);
                            continue;
                        case 2:
                            this.f2181o00ooOo = obtainStyledAttributes.getDimensionPixelSize(index, this.f2181o00ooOo);
                            continue;
                        case 3:
                            this.f2168o00oo0OO = o00oOoO.o0oO0Ooo(obtainStyledAttributes, index, this.f2168o00oo0OO);
                            continue;
                        case 4:
                            this.f2164o00oo0 = o00oOoO.o0oO0Ooo(obtainStyledAttributes, index, this.f2164o00oo0);
                            continue;
                        case 5:
                            this.f2163o00oo = obtainStyledAttributes.getString(index);
                            continue;
                        case 6:
                            this.f2177o00ooO0o = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2177o00ooO0o);
                            continue;
                        case 7:
                            this.f2173o00ooO = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2173o00ooO);
                            continue;
                        case 8:
                            this.f2183o00ooOoO = obtainStyledAttributes.getDimensionPixelSize(index, this.f2183o00ooOoO);
                            continue;
                        case 9:
                            this.f2170o00oo0o = o00oOoO.o0oO0Ooo(obtainStyledAttributes, index, this.f2170o00oo0o);
                            continue;
                        case 10:
                            this.f2171o00oo0o0 = o00oOoO.o0oO0Ooo(obtainStyledAttributes, index, this.f2171o00oo0o0);
                            continue;
                        case 11:
                            this.f2188o00ooo0o = obtainStyledAttributes.getDimensionPixelSize(index, this.f2188o00ooo0o);
                            continue;
                        case 12:
                            this.f2189o00oooO = obtainStyledAttributes.getDimensionPixelSize(index, this.f2189o00oooO);
                            continue;
                        case 13:
                            this.f2186o00ooo00 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2186o00ooo00);
                            continue;
                        case 14:
                            this.f2187o00ooo0O = obtainStyledAttributes.getDimensionPixelSize(index, this.f2187o00ooo0O);
                            continue;
                        case 15:
                            this.f2190o00oooOO = obtainStyledAttributes.getDimensionPixelSize(index, this.f2190o00oooOO);
                            continue;
                        case 16:
                            this.f2185o00ooo0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2185o00ooo0);
                            continue;
                        case 17:
                            this.f2154o00oOo0O = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2154o00oOo0O);
                            continue;
                        case 18:
                            this.f2155o00oOo0o = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2155o00oOo0o);
                            continue;
                        case 19:
                            this.f2157o00oOoO0 = obtainStyledAttributes.getFloat(index, this.f2157o00oOoO0);
                            continue;
                        case 20:
                            this.f2172o00oo0oO = obtainStyledAttributes.getFloat(index, this.f2172o00oo0oO);
                            continue;
                        case 21:
                            this.f2161o00oOooO = obtainStyledAttributes.getLayoutDimension(index, this.f2161o00oOooO);
                            continue;
                        case 22:
                            this.f2153o00oOo00 = obtainStyledAttributes.getLayoutDimension(index, this.f2153o00oOo00);
                            continue;
                        case 23:
                            this.f2178o00ooOO = obtainStyledAttributes.getDimensionPixelSize(index, this.f2178o00ooOO);
                            continue;
                        case 24:
                            this.f2156o00oOoO = o00oOoO.o0oO0Ooo(obtainStyledAttributes, index, this.f2156o00oOoO);
                            continue;
                        case 25:
                            this.f2158o00oOoOO = o00oOoO.o0oO0Ooo(obtainStyledAttributes, index, this.f2158o00oOoOO);
                            continue;
                        case 26:
                            this.f2179o00ooOO0 = obtainStyledAttributes.getInt(index, this.f2179o00ooOO0);
                            continue;
                        case 27:
                            this.f2180o00ooOOo = obtainStyledAttributes.getDimensionPixelSize(index, this.f2180o00ooOOo);
                            continue;
                        case 28:
                            this.f2159o00oOoOo = o00oOoO.o0oO0Ooo(obtainStyledAttributes, index, this.f2159o00oOoOo);
                            continue;
                        case 29:
                            this.f2160o00oOoo0 = o00oOoO.o0oO0Ooo(obtainStyledAttributes, index, this.f2160o00oOoo0);
                            continue;
                        case 30:
                            this.f2184o00ooOoo = obtainStyledAttributes.getDimensionPixelSize(index, this.f2184o00ooOoo);
                            continue;
                        case 31:
                            this.f2166o00oo0O = o00oOoO.o0oO0Ooo(obtainStyledAttributes, index, this.f2166o00oo0O);
                            continue;
                        case 32:
                            this.f2169o00oo0Oo = o00oOoO.o0oO0Ooo(obtainStyledAttributes, index, this.f2169o00oo0Oo);
                            continue;
                        case 33:
                            this.f2182o00ooOo0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2182o00ooOo0);
                            continue;
                        case 34:
                            this.f2165o00oo00O = o00oOoO.o0oO0Ooo(obtainStyledAttributes, index, this.f2165o00oo00O);
                            continue;
                        case 35:
                            this.f2162o00oOooo = o00oOoO.o0oO0Ooo(obtainStyledAttributes, index, this.f2162o00oOooo);
                            continue;
                        case 36:
                            this.f2207o0O0o = obtainStyledAttributes.getFloat(index, this.f2207o0O0o);
                            continue;
                        case 37:
                            this.f2193o00oooo0 = obtainStyledAttributes.getFloat(index, this.f2193o00oooo0);
                            continue;
                        case 38:
                            this.f2191o00oooOo = obtainStyledAttributes.getFloat(index, this.f2191o00oooOo);
                            continue;
                        case 39:
                            this.f2192o00oooo = obtainStyledAttributes.getInt(index, this.f2192o00oooo);
                            continue;
                        case 40:
                            this.f2194o00ooooO = obtainStyledAttributes.getInt(index, this.f2194o00ooooO);
                            continue;
                        default:
                            switch (i2) {
                                case 54:
                                    this.f2195o00ooooo = obtainStyledAttributes.getInt(index, this.f2195o00ooooo);
                                    continue;
                                case 55:
                                    this.f2150o0 = obtainStyledAttributes.getInt(index, this.f2150o0);
                                    continue;
                                case 56:
                                    this.f2198o0O00000 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2198o0O00000);
                                    continue;
                                case 57:
                                    this.f2199o0O0000O = obtainStyledAttributes.getDimensionPixelSize(index, this.f2199o0O0000O);
                                    continue;
                                case 58:
                                    this.f2200o0O0000o = obtainStyledAttributes.getDimensionPixelSize(index, this.f2200o0O0000o);
                                    continue;
                                case 59:
                                    this.f2197o0O000 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2197o0O000);
                                    continue;
                                default:
                                    switch (i2) {
                                        case 61:
                                            this.f2175o00ooO00 = o00oOoO.o0oO0Ooo(obtainStyledAttributes, index, this.f2175o00ooO00);
                                            continue;
                                        case 62:
                                            this.f2174o00ooO0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2174o00ooO0);
                                            continue;
                                        case 63:
                                            this.f2176o00ooO0O = obtainStyledAttributes.getFloat(index, this.f2176o00ooO0O);
                                            continue;
                                        default:
                                            switch (i2) {
                                                case 69:
                                                    this.f2201o0O000O = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 70:
                                                    this.f2210o0OoOoOo = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 71:
                                                    continue;
                                                    continue;
                                                    continue;
                                                case 72:
                                                    this.f2202o0O000Oo = obtainStyledAttributes.getInt(index, this.f2202o0O000Oo);
                                                    continue;
                                                case 73:
                                                    this.f2209o0OoOoOO = obtainStyledAttributes.getDimensionPixelSize(index, this.f2209o0OoOoOO);
                                                    continue;
                                                case 74:
                                                    this.f2211o0ooOoOO = obtainStyledAttributes.getString(index);
                                                    continue;
                                                case 75:
                                                    this.f2208o0OoO00O = obtainStyledAttributes.getBoolean(index, this.f2208o0OoO00O);
                                                    continue;
                                                case 76:
                                                default:
                                                    Integer.toHexString(index);
                                                    f2097o0O00O.get(index);
                                                    continue;
                                                case 77:
                                                    this.f2205o0O000oo = obtainStyledAttributes.getString(index);
                                                    continue;
                                            }
                                    }
                            }
                    }
                } else {
                    this.f2206o0O00O0 = obtainStyledAttributes.getBoolean(index, this.f2206o0O00O0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 {

        /* renamed from: o00oOoO  reason: collision with root package name */
        public static SparseIntArray f2212o00oOoO = null;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public static final int f2213o00oOoOO = 1;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public static final int f2214o00oOoOo = 2;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public static final int f2215o00oOoo0 = 3;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public static final int f2216o00oOooo = 4;

        /* renamed from: o00oo0  reason: collision with root package name */
        public static final int f2217o00oo0 = 6;

        /* renamed from: o00oo00O  reason: collision with root package name */
        public static final int f2218o00oo00O = 5;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public boolean f2219o00oOOo0 = false;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f2220o00oOOoO = -1;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public String f2221o00oOo00 = null;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f2225o00oOooO = -1;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public int f2222o00oOo0O = 0;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public float f2223o00oOo0o = Float.NaN;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public float f2224o00oOoO0 = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2212o00oOoO = sparseIntArray;
            sparseIntArray.append(R.styleable.Motion_motionPathRotate, 1);
            f2212o00oOoO.append(R.styleable.Motion_pathMotionArc, 2);
            f2212o00oOoO.append(R.styleable.Motion_transitionEasing, 3);
            f2212o00oOoO.append(R.styleable.Motion_drawPath, 4);
            f2212o00oOoO.append(R.styleable.Motion_animate_relativeTo, 5);
            f2212o00oOoO.append(R.styleable.Motion_motionStagger, 6);
        }

        public void o00oOOo0(o00oOo00 o00ooo002) {
            this.f2219o00oOOo0 = o00ooo002.f2219o00oOOo0;
            this.f2220o00oOOoO = o00ooo002.f2220o00oOOoO;
            this.f2221o00oOo00 = o00ooo002.f2221o00oOo00;
            this.f2225o00oOooO = o00ooo002.f2225o00oOooO;
            this.f2222o00oOo0O = o00ooo002.f2222o00oOo0O;
            this.f2224o00oOoO0 = o00ooo002.f2224o00oOoO0;
            this.f2223o00oOo0o = o00ooo002.f2223o00oOo0o;
        }

        public void o00oOOoO(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Motion);
            this.f2219o00oOOo0 = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f2212o00oOoO.get(index)) {
                    case 1:
                        this.f2224o00oOoO0 = obtainStyledAttributes.getFloat(index, this.f2224o00oOoO0);
                        break;
                    case 2:
                        this.f2225o00oOooO = obtainStyledAttributes.getInt(index, this.f2225o00oOooO);
                        break;
                    case 3:
                        this.f2221o00oOo00 = obtainStyledAttributes.peekValue(index).type == 3 ? obtainStyledAttributes.getString(index) : o00oo.o00oOo00.f7198o00oOoo0[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.f2222o00oOo0O = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f2220o00oOOoO = o00oOoO.o0oO0Ooo(obtainStyledAttributes, index, this.f2220o00oOOoO);
                        break;
                    case 6:
                        this.f2223o00oOo0o = obtainStyledAttributes.getFloat(index, this.f2223o00oOo0o);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo0O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public boolean f2226o00oOOo0 = false;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f2227o00oOOoO = 0;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f2228o00oOo00 = 0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public float f2230o00oOooO = 1.0f;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public float f2229o00oOo0O = Float.NaN;

        public void o00oOOo0(o00oOo0O o00ooo0o2) {
            this.f2226o00oOOo0 = o00ooo0o2.f2226o00oOOo0;
            this.f2227o00oOOoO = o00ooo0o2.f2227o00oOOoO;
            this.f2230o00oOooO = o00ooo0o2.f2230o00oOooO;
            this.f2229o00oOo0O = o00ooo0o2.f2229o00oOo0O;
            this.f2228o00oOo00 = o00ooo0o2.f2228o00oOo00;
        }

        public void o00oOOoO(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PropertySet);
            this.f2226o00oOOo0 = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.PropertySet_android_alpha) {
                    this.f2230o00oOooO = obtainStyledAttributes.getFloat(index, this.f2230o00oOooO);
                } else if (index == R.styleable.PropertySet_android_visibility) {
                    this.f2227o00oOOoO = obtainStyledAttributes.getInt(index, this.f2227o00oOOoO);
                    this.f2227o00oOOoO = o00oOoO.f2001o00ooOo[this.f2227o00oOOoO];
                } else if (index == R.styleable.PropertySet_visibilityMode) {
                    this.f2228o00oOo00 = obtainStyledAttributes.getInt(index, this.f2228o00oOo00);
                } else if (index == R.styleable.PropertySet_motionProgress) {
                    this.f2229o00oOo0O = obtainStyledAttributes.getFloat(index, this.f2229o00oOo0O);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.o00oOoO$o00oOoO  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0014o00oOoO {

        /* renamed from: o00oo  reason: collision with root package name */
        public static final int f2231o00oo = 9;

        /* renamed from: o00oo0  reason: collision with root package name */
        public static SparseIntArray f2232o00oo0 = null;

        /* renamed from: o00oo0O  reason: collision with root package name */
        public static final int f2233o00oo0O = 3;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public static final int f2234o00oo0O0 = 2;

        /* renamed from: o00oo0OO  reason: collision with root package name */
        public static final int f2235o00oo0OO = 1;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public static final int f2236o00oo0Oo = 4;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public static final int f2237o00oo0o = 6;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public static final int f2238o00oo0o0 = 5;

        /* renamed from: o00oo0oO  reason: collision with root package name */
        public static final int f2239o00oo0oO = 7;

        /* renamed from: o00ooO0  reason: collision with root package name */
        public static final int f2240o00ooO0 = 11;

        /* renamed from: o00ooO00  reason: collision with root package name */
        public static final int f2241o00ooO00 = 10;

        /* renamed from: o0O0o  reason: collision with root package name */
        public static final int f2242o0O0o = 8;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public boolean f2243o00oOOo0 = false;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public float f2244o00oOOoO = 0.0f;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public float f2245o00oOo00 = 0.0f;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public float f2253o00oOooO = 0.0f;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public float f2246o00oOo0O = 1.0f;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public float f2247o00oOo0o = 1.0f;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public float f2249o00oOoO0 = Float.NaN;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public float f2248o00oOoO = Float.NaN;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public float f2250o00oOoOO = 0.0f;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public float f2251o00oOoOo = 0.0f;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public float f2252o00oOoo0 = 0.0f;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public boolean f2254o00oOooo = false;

        /* renamed from: o00oo00O  reason: collision with root package name */
        public float f2255o00oo00O = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2232o00oo0 = sparseIntArray;
            sparseIntArray.append(R.styleable.Transform_android_rotation, 1);
            f2232o00oo0.append(R.styleable.Transform_android_rotationX, 2);
            f2232o00oo0.append(R.styleable.Transform_android_rotationY, 3);
            f2232o00oo0.append(R.styleable.Transform_android_scaleX, 4);
            f2232o00oo0.append(R.styleable.Transform_android_scaleY, 5);
            f2232o00oo0.append(R.styleable.Transform_android_transformPivotX, 6);
            f2232o00oo0.append(R.styleable.Transform_android_transformPivotY, 7);
            f2232o00oo0.append(R.styleable.Transform_android_translationX, 8);
            f2232o00oo0.append(R.styleable.Transform_android_translationY, 9);
            f2232o00oo0.append(R.styleable.Transform_android_translationZ, 10);
            f2232o00oo0.append(R.styleable.Transform_android_elevation, 11);
        }

        public void o00oOOo0(C0014o00oOoO c0014o00oOoO) {
            this.f2243o00oOOo0 = c0014o00oOoO.f2243o00oOOo0;
            this.f2244o00oOOoO = c0014o00oOoO.f2244o00oOOoO;
            this.f2245o00oOo00 = c0014o00oOoO.f2245o00oOo00;
            this.f2253o00oOooO = c0014o00oOoO.f2253o00oOooO;
            this.f2246o00oOo0O = c0014o00oOoO.f2246o00oOo0O;
            this.f2247o00oOo0o = c0014o00oOoO.f2247o00oOo0o;
            this.f2249o00oOoO0 = c0014o00oOoO.f2249o00oOoO0;
            this.f2248o00oOoO = c0014o00oOoO.f2248o00oOoO;
            this.f2250o00oOoOO = c0014o00oOoO.f2250o00oOoOO;
            this.f2251o00oOoOo = c0014o00oOoO.f2251o00oOoOo;
            this.f2252o00oOoo0 = c0014o00oOoO.f2252o00oOoo0;
            this.f2254o00oOooo = c0014o00oOoO.f2254o00oOooo;
            this.f2255o00oo00O = c0014o00oOoO.f2255o00oo00O;
        }

        public void o00oOOoO(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Transform);
            this.f2243o00oOOo0 = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f2232o00oo0.get(index)) {
                    case 1:
                        this.f2244o00oOOoO = obtainStyledAttributes.getFloat(index, this.f2244o00oOOoO);
                        break;
                    case 2:
                        this.f2245o00oOo00 = obtainStyledAttributes.getFloat(index, this.f2245o00oOo00);
                        break;
                    case 3:
                        this.f2253o00oOooO = obtainStyledAttributes.getFloat(index, this.f2253o00oOooO);
                        break;
                    case 4:
                        this.f2246o00oOo0O = obtainStyledAttributes.getFloat(index, this.f2246o00oOo0O);
                        break;
                    case 5:
                        this.f2247o00oOo0o = obtainStyledAttributes.getFloat(index, this.f2247o00oOo0o);
                        break;
                    case 6:
                        this.f2249o00oOoO0 = obtainStyledAttributes.getDimension(index, this.f2249o00oOoO0);
                        break;
                    case 7:
                        this.f2248o00oOoO = obtainStyledAttributes.getDimension(index, this.f2248o00oOoO);
                        break;
                    case 8:
                        this.f2250o00oOoOO = obtainStyledAttributes.getDimension(index, this.f2250o00oOoOO);
                        break;
                    case 9:
                        this.f2251o00oOoOo = obtainStyledAttributes.getDimension(index, this.f2251o00oOoOo);
                        break;
                    case 10:
                        this.f2252o00oOoo0 = obtainStyledAttributes.getDimension(index, this.f2252o00oOoo0);
                        break;
                    case 11:
                        this.f2254o00oOooo = true;
                        this.f2255o00oo00O = obtainStyledAttributes.getDimension(index, this.f2255o00oo00O);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2004o00ooOoo = sparseIntArray;
        sparseIntArray.append(R.styleable.Constraint_layout_constraintLeft_toLeftOf, 25);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constraintLeft_toRightOf, 26);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constraintRight_toLeftOf, 29);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constraintRight_toRightOf, 30);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constraintTop_toTopOf, 36);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constraintTop_toBottomOf, 35);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constraintBottom_toTopOf, 4);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constraintBottom_toBottomOf, 3);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_editor_absoluteX, 6);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_editor_absoluteY, 7);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constraintGuide_begin, 17);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constraintGuide_end, 18);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constraintGuide_percent, 19);
        f2004o00ooOoo.append(R.styleable.Constraint_android_orientation, 27);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constraintStart_toEndOf, 32);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constraintStart_toStartOf, 33);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constraintEnd_toStartOf, 10);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constraintEnd_toEndOf, 9);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_goneMarginLeft, 13);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_goneMarginTop, 16);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_goneMarginRight, 14);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_goneMarginBottom, 11);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_goneMarginStart, 15);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_goneMarginEnd, 12);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constraintVertical_weight, 40);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constraintHorizontal_weight, 39);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constraintHorizontal_chainStyle, 41);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constraintVertical_chainStyle, 42);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constraintHorizontal_bias, 20);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constraintVertical_bias, 37);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constraintDimensionRatio, 5);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constraintLeft_creator, 82);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constraintTop_creator, 82);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constraintRight_creator, 82);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constraintBottom_creator, 82);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constraintBaseline_creator, 82);
        f2004o00ooOoo.append(R.styleable.Constraint_android_layout_marginLeft, 24);
        f2004o00ooOoo.append(R.styleable.Constraint_android_layout_marginRight, 28);
        f2004o00ooOoo.append(R.styleable.Constraint_android_layout_marginStart, 31);
        f2004o00ooOoo.append(R.styleable.Constraint_android_layout_marginEnd, 8);
        f2004o00ooOoo.append(R.styleable.Constraint_android_layout_marginTop, 34);
        f2004o00ooOoo.append(R.styleable.Constraint_android_layout_marginBottom, 2);
        f2004o00ooOoo.append(R.styleable.Constraint_android_layout_width, 23);
        f2004o00ooOoo.append(R.styleable.Constraint_android_layout_height, 21);
        f2004o00ooOoo.append(R.styleable.Constraint_android_visibility, 22);
        f2004o00ooOoo.append(R.styleable.Constraint_android_alpha, 43);
        f2004o00ooOoo.append(R.styleable.Constraint_android_elevation, 44);
        f2004o00ooOoo.append(R.styleable.Constraint_android_rotationX, 45);
        f2004o00ooOoo.append(R.styleable.Constraint_android_rotationY, 46);
        f2004o00ooOoo.append(R.styleable.Constraint_android_rotation, 60);
        f2004o00ooOoo.append(R.styleable.Constraint_android_scaleX, 47);
        f2004o00ooOoo.append(R.styleable.Constraint_android_scaleY, 48);
        f2004o00ooOoo.append(R.styleable.Constraint_android_transformPivotX, 49);
        f2004o00ooOoo.append(R.styleable.Constraint_android_transformPivotY, 50);
        f2004o00ooOoo.append(R.styleable.Constraint_android_translationX, 51);
        f2004o00ooOoo.append(R.styleable.Constraint_android_translationY, 52);
        f2004o00ooOoo.append(R.styleable.Constraint_android_translationZ, 53);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constraintWidth_default, 54);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constraintHeight_default, 55);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constraintWidth_max, 56);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constraintHeight_max, 57);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constraintWidth_min, 58);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constraintHeight_min, 59);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constraintCircle, 61);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constraintCircleRadius, 62);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constraintCircleAngle, 63);
        f2004o00ooOoo.append(R.styleable.Constraint_animate_relativeTo, 64);
        f2004o00ooOoo.append(R.styleable.Constraint_transitionEasing, 65);
        f2004o00ooOoo.append(R.styleable.Constraint_drawPath, 66);
        f2004o00ooOoo.append(R.styleable.Constraint_transitionPathRotate, 67);
        f2004o00ooOoo.append(R.styleable.Constraint_motionStagger, 79);
        f2004o00ooOoo.append(R.styleable.Constraint_android_id, 38);
        f2004o00ooOoo.append(R.styleable.Constraint_motionProgress, 68);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constraintWidth_percent, 69);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constraintHeight_percent, 70);
        f2004o00ooOoo.append(R.styleable.Constraint_chainUseRtl, 71);
        f2004o00ooOoo.append(R.styleable.Constraint_barrierDirection, 72);
        f2004o00ooOoo.append(R.styleable.Constraint_barrierMargin, 73);
        f2004o00ooOoo.append(R.styleable.Constraint_constraint_referenced_ids, 74);
        f2004o00ooOoo.append(R.styleable.Constraint_barrierAllowsGoneWidgets, 75);
        f2004o00ooOoo.append(R.styleable.Constraint_pathMotionArc, 76);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constraintTag, 77);
        f2004o00ooOoo.append(R.styleable.Constraint_visibilityMode, 78);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constrainedWidth, 80);
        f2004o00ooOoo.append(R.styleable.Constraint_layout_constrainedHeight, 81);
    }

    public static String[] o0O0o0oo(String str) {
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z = false;
        for (int i2 = 0; i2 < charArray.length; i2++) {
            char c = charArray[i2];
            if (c == ',' && !z) {
                arrayList.add(new String(charArray, i, i2 - i));
                i = i2 + 1;
            } else if (c == '\"') {
                z = !z;
            }
        }
        arrayList.add(new String(charArray, i, charArray.length - i));
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static int o0oO0Ooo(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    public void o0(int i, int i2, int i3, int... iArr) {
        o00oOOoO o00ooooo2 = o0O000Oo(i).f2096o00oOooO;
        o00ooooo2.f2204o0O000o0 = 1;
        o00ooooo2.f2202o0O000Oo = i2;
        o00ooooo2.f2209o0OoOoOO = i3;
        o00ooooo2.f2151o00oOOo0 = false;
        o00ooooo2.f2203o0O000o = iArr;
    }

    public final void o00oOo00(o00oOOo0.o00oOOoO o00ooooo2, String... strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (this.f2088o00oOOoO.containsKey(strArr[i])) {
                androidx.constraintlayout.widget.o00oOOo0 o00oooo02 = this.f2088o00oOOoO.get(strArr[i]);
                if (o00oooo02.o00oOooO() != o00ooooo2) {
                    StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("ConstraintAttribute is already a ");
                    o00oOOo02.append(o00oooo02.o00oOooO().name());
                    throw new IllegalArgumentException(o00oOOo02.toString());
                }
            } else {
                this.f2088o00oOOoO.put(strArr[i], new androidx.constraintlayout.widget.o00oOOo0(strArr[i], o00ooooo2));
            }
        }
    }

    public void o00oOo0O(String... strArr) {
        o00oOo00(o00oOOo0.o00oOOoO.FLOAT_TYPE, strArr);
    }

    public void o00oOo0o(String... strArr) {
        o00oOo00(o00oOOo0.o00oOOoO.INT_TYPE, strArr);
    }

    public void o00oOoO(int i, int i2, int i3) {
        o00ooOOo(i, 1, i2, i2 == 0 ? 1 : 2, 0);
        o00ooOOo(i, 2, i3, i3 == 0 ? 2 : 1, 0);
        if (i2 != 0) {
            o00ooOOo(i2, 2, i, 1, 0);
        }
        if (i3 != 0) {
            o00ooOOo(i3, 1, i, 2, 0);
        }
    }

    public void o00oOoO0(String... strArr) {
        o00oOo00(o00oOOo0.o00oOOoO.STRING_TYPE, strArr);
    }

    public void o00oOoOO(int i, int i2, int i3) {
        o00ooOOo(i, 6, i2, i2 == 0 ? 6 : 7, 0);
        o00ooOOo(i, 7, i3, i3 == 0 ? 7 : 6, 0);
        if (i2 != 0) {
            o00ooOOo(i2, 7, i, 6, 0);
        }
        if (i3 != 0) {
            o00ooOOo(i3, 6, i, 7, 0);
        }
    }

    public void o00oOoOo(int i, int i2, int i3) {
        o00ooOOo(i, 3, i2, i2 == 0 ? 3 : 4, 0);
        o00ooOOo(i, 4, i3, i3 == 0 ? 4 : 3, 0);
        if (i2 != 0) {
            o00ooOOo(i2, 4, i, 3, 0);
        }
        if (i3 != 0) {
            o00ooOOo(i3, 3, i, 4, 0);
        }
    }

    public void o00oOoo0(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f2090o00oOooO.containsKey(Integer.valueOf(id))) {
                o00ooO00.o00oOoO.o00oOoo0(childAt);
            } else if (this.f2089o00oOo00 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (this.f2090o00oOooO.containsKey(Integer.valueOf(id))) {
                    androidx.constraintlayout.widget.o00oOOo0.o00oOoOO(childAt, this.f2090o00oOooO.get(Integer.valueOf(id)).f2095o00oOo0o);
                }
            }
        }
    }

    public void o00oOooO(String... strArr) {
        o00oOo00(o00oOOo0.o00oOOoO.COLOR_TYPE, strArr);
    }

    public void o00oOooo(ConstraintLayout constraintLayout) {
        o00oo0(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public void o00oo(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        o00ooOOo(i, 3, i2, i3, i4);
        o00ooOOo(i, 4, i5, i6, i7);
        this.f2090o00oOooO.get(Integer.valueOf(i)).f2096o00oOooO.f2207o0O0o = f;
    }

    public void o00oo0(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f2090o00oOooO.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f2090o00oOooO.containsKey(Integer.valueOf(id))) {
                o00ooO00.o00oOoO.o00oOoo0(childAt);
            } else if (this.f2089o00oOo00 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (id != -1 && this.f2090o00oOooO.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    o00oOOo0 o00oooo02 = this.f2090o00oOooO.get(Integer.valueOf(id));
                    if (childAt instanceof Barrier) {
                        o00oooo02.f2096o00oOooO.f2204o0O000o0 = 1;
                    }
                    int i2 = o00oooo02.f2096o00oOooO.f2204o0O000o0;
                    if (i2 != -1 && i2 == 1) {
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id);
                        barrier.setType(o00oooo02.f2096o00oOooO.f2202o0O000Oo);
                        barrier.setMargin(o00oooo02.f2096o00oOooO.f2209o0OoOoOO);
                        barrier.setAllowsGoneWidget(o00oooo02.f2096o00oOooO.f2208o0OoO00O);
                        o00oOOoO o00ooooo2 = o00oooo02.f2096o00oOooO;
                        int[] iArr = o00ooooo2.f2203o0O000o;
                        if (iArr != null) {
                            barrier.setReferencedIds(iArr);
                        } else {
                            String str = o00ooooo2.f2211o0ooOoOO;
                            if (str != null) {
                                o00ooooo2.f2203o0O000o = o00ooooO(barrier, str);
                                barrier.setReferencedIds(o00oooo02.f2096o00oOooO.f2203o0O000o);
                            }
                        }
                    }
                    ConstraintLayout.o00oOOoO o00ooooo3 = (ConstraintLayout.o00oOOoO) childAt.getLayoutParams();
                    o00ooooo3.o00oOo0O();
                    o00oooo02.o00oOoO(o00ooooo3);
                    if (z) {
                        androidx.constraintlayout.widget.o00oOOo0.o00oOoOO(childAt, o00oooo02.f2095o00oOo0o);
                    }
                    childAt.setLayoutParams(o00ooooo3);
                    o00oOo0O o00ooo0o2 = o00oooo02.f2092o00oOOoO;
                    if (o00ooo0o2.f2228o00oOo00 == 0) {
                        childAt.setVisibility(o00ooo0o2.f2227o00oOOoO);
                    }
                    childAt.setAlpha(o00oooo02.f2092o00oOOoO.f2230o00oOooO);
                    childAt.setRotation(o00oooo02.f2094o00oOo0O.f2244o00oOOoO);
                    childAt.setRotationX(o00oooo02.f2094o00oOo0O.f2245o00oOo00);
                    childAt.setRotationY(o00oooo02.f2094o00oOo0O.f2253o00oOooO);
                    childAt.setScaleX(o00oooo02.f2094o00oOo0O.f2246o00oOo0O);
                    childAt.setScaleY(o00oooo02.f2094o00oOo0O.f2247o00oOo0o);
                    if (!Float.isNaN(o00oooo02.f2094o00oOo0O.f2249o00oOoO0)) {
                        childAt.setPivotX(o00oooo02.f2094o00oOo0O.f2249o00oOoO0);
                    }
                    if (!Float.isNaN(o00oooo02.f2094o00oOo0O.f2248o00oOoO)) {
                        childAt.setPivotY(o00oooo02.f2094o00oOo0O.f2248o00oOoO);
                    }
                    childAt.setTranslationX(o00oooo02.f2094o00oOo0O.f2250o00oOoOO);
                    childAt.setTranslationY(o00oooo02.f2094o00oOo0O.f2251o00oOoOo);
                    childAt.setTranslationZ(o00oooo02.f2094o00oOo0O.f2252o00oOoo0);
                    C0014o00oOoO c0014o00oOoO = o00oooo02.f2094o00oOo0O;
                    if (c0014o00oOoO.f2254o00oOooo) {
                        childAt.setElevation(c0014o00oOoO.f2255o00oo00O);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            o00oOOo0 o00oooo03 = this.f2090o00oOooO.get(num);
            int i3 = o00oooo03.f2096o00oOooO.f2204o0O000o0;
            if (i3 != -1 && i3 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                o00oOOoO o00ooooo4 = o00oooo03.f2096o00oOooO;
                int[] iArr2 = o00ooooo4.f2203o0O000o;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = o00ooooo4.f2211o0ooOoOO;
                    if (str2 != null) {
                        o00ooooo4.f2203o0O000o = o00ooooO(barrier2, str2);
                        barrier2.setReferencedIds(o00oooo03.f2096o00oOooO.f2203o0O000o);
                    }
                }
                barrier2.setType(o00oooo03.f2096o00oOooO.f2202o0O000Oo);
                barrier2.setMargin(o00oooo03.f2096o00oOooO.f2209o0OoOoOO);
                ConstraintLayout.o00oOOoO generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                barrier2.o00ooO0();
                o00oooo03.o00oOoO(generateDefaultLayoutParams);
                constraintLayout.addView(barrier2, generateDefaultLayoutParams);
            }
            if (o00oooo03.f2096o00oOooO.f2151o00oOOo0) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.o00oOOoO generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                o00oooo03.o00oOoO(generateDefaultLayoutParams2);
                constraintLayout.addView(guideline, generateDefaultLayoutParams2);
            }
        }
    }

    public void o00oo00O(androidx.constraintlayout.widget.o00oOOoO o00ooooo2, o00ooO.o00oOoO o00oooo2, ConstraintLayout.o00oOOoO o00ooooo3, SparseArray<o00ooO.o00oOoO> sparseArray) {
        int id = o00ooooo2.getId();
        if (this.f2090o00oOooO.containsKey(Integer.valueOf(id))) {
            o00oOOo0 o00oooo02 = this.f2090o00oOooO.get(Integer.valueOf(id));
            if (o00oooo2 instanceof o00ooO.o00oo0O) {
                o00ooooo2.o00oo0O0(o00oooo02, (o00ooO.o00oo0O) o00oooo2, o00ooooo3, sparseArray);
            }
        }
    }

    public void o00oo0O(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        o00oOoO o00oooo2;
        int i8;
        int i9;
        if (i4 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (i7 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (f <= 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        }
        if (i3 == 1 || i3 == 2) {
            o00oooo2 = this;
            i8 = i;
            o00oooo2.o00ooOOo(i8, 1, i2, i3, i4);
            i9 = 2;
        } else if (i3 != 6 && i3 != 7) {
            o00ooOOo(i, 3, i2, i3, i4);
            o00ooOOo(i, 4, i5, i6, i7);
            this.f2090o00oOooO.get(Integer.valueOf(i)).f2096o00oOooO.f2207o0O0o = f;
            return;
        } else {
            o00oooo2 = this;
            i8 = i;
            o00oooo2.o00ooOOo(i8, 6, i2, i3, i4);
            i9 = 7;
        }
        o00oooo2.o00ooOOo(i8, i9, i5, i6, i7);
        this.f2090o00oOooO.get(Integer.valueOf(i)).f2096o00oOooO.f2172o00oo0oO = f;
    }

    public void o00oo0O0(ConstraintLayout constraintLayout) {
        o00oo0(constraintLayout, false);
        constraintLayout.setConstraintSet(null);
    }

    public void o00oo0OO(int i, ConstraintLayout.o00oOOoO o00ooooo2) {
        if (this.f2090o00oOooO.containsKey(Integer.valueOf(i))) {
            this.f2090o00oOooO.get(Integer.valueOf(i)).o00oOoO(o00ooooo2);
        }
    }

    public void o00oo0Oo(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        o00oOoO o00oooo2;
        int i7;
        int i8;
        int i9;
        if (i2 == 0) {
            i8 = 0;
            i3 = 1;
            i4 = 0;
            i9 = 0;
            i5 = 2;
            i6 = 0;
            f = 0.5f;
            o00oooo2 = this;
            i7 = i;
        } else {
            i3 = 2;
            i4 = 0;
            i5 = 1;
            i6 = 0;
            f = 0.5f;
            o00oooo2 = this;
            i7 = i;
            i8 = i2;
            i9 = i2;
        }
        o00oooo2.o00oo0O(i7, i8, i3, i4, i9, i5, i6, f);
    }

    public void o00oo0o(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        o00oOoO o00oooo2;
        int i7;
        int i8;
        int i9;
        if (i2 == 0) {
            i8 = 0;
            i3 = 6;
            i4 = 0;
            i9 = 0;
            i5 = 7;
            i6 = 0;
            f = 0.5f;
            o00oooo2 = this;
            i7 = i;
        } else {
            i3 = 7;
            i4 = 0;
            i5 = 6;
            i6 = 0;
            f = 0.5f;
            o00oooo2 = this;
            i7 = i;
            i8 = i2;
            i9 = i2;
        }
        o00oooo2.o00oo0O(i7, i8, i3, i4, i9, i5, i6, f);
    }

    public void o00oo0o0(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        o00ooOOo(i, 1, i2, i3, i4);
        o00ooOOo(i, 2, i5, i6, i7);
        this.f2090o00oOooO.get(Integer.valueOf(i)).f2096o00oOooO.f2172o00oo0oO = f;
    }

    public void o00oo0oO(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        o00ooOOo(i, 6, i2, i3, i4);
        o00ooOOo(i, 7, i5, i6, i7);
        this.f2090o00oOooO.get(Integer.valueOf(i)).f2096o00oOooO.f2172o00oo0oO = f;
    }

    public void o00ooO(o00oOoO o00oooo2) {
        this.f2090o00oOooO.clear();
        for (Integer num : o00oooo2.f2090o00oOooO.keySet()) {
            this.f2090o00oOooO.put(num, o00oooo2.f2090o00oOooO.get(num).clone());
        }
    }

    public void o00ooO0(int i, int i2) {
        if (this.f2090o00oOooO.containsKey(Integer.valueOf(i))) {
            o00oOOo0 o00oooo02 = this.f2090o00oOooO.get(Integer.valueOf(i));
            switch (i2) {
                case 1:
                    o00oOOoO o00ooooo2 = o00oooo02.f2096o00oOooO;
                    o00ooooo2.f2158o00oOoOO = -1;
                    o00ooooo2.f2156o00oOoO = -1;
                    o00ooooo2.f2178o00ooOO = -1;
                    o00ooooo2.f2186o00ooo00 = -1;
                    return;
                case 2:
                    o00oOOoO o00ooooo3 = o00oooo02.f2096o00oOooO;
                    o00ooooo3.f2160o00oOoo0 = -1;
                    o00ooooo3.f2159o00oOoOo = -1;
                    o00ooooo3.f2180o00ooOOo = -1;
                    o00ooooo3.f2187o00ooo0O = -1;
                    return;
                case 3:
                    o00oOOoO o00ooooo4 = o00oooo02.f2096o00oOooO;
                    o00ooooo4.f2165o00oo00O = -1;
                    o00ooooo4.f2162o00oOooo = -1;
                    o00ooooo4.f2182o00ooOo0 = -1;
                    o00ooooo4.f2185o00ooo0 = -1;
                    return;
                case 4:
                    o00oOOoO o00ooooo5 = o00oooo02.f2096o00oOooO;
                    o00ooooo5.f2164o00oo0 = -1;
                    o00ooooo5.f2168o00oo0OO = -1;
                    o00ooooo5.f2181o00ooOo = -1;
                    o00ooooo5.f2188o00ooo0o = -1;
                    return;
                case 5:
                    o00oooo02.f2096o00oOooO.f2167o00oo0O0 = -1;
                    return;
                case 6:
                    o00oOOoO o00ooooo6 = o00oooo02.f2096o00oOooO;
                    o00ooooo6.f2166o00oo0O = -1;
                    o00ooooo6.f2169o00oo0Oo = -1;
                    o00ooooo6.f2184o00ooOoo = -1;
                    o00ooooo6.f2190o00oooOO = -1;
                    return;
                case 7:
                    o00oOOoO o00ooooo7 = o00oooo02.f2096o00oOooO;
                    o00ooooo7.f2171o00oo0o0 = -1;
                    o00ooooo7.f2170o00oo0o = -1;
                    o00ooooo7.f2183o00ooOoO = -1;
                    o00ooooo7.f2189o00oooO = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public void o00ooO00(int i) {
        this.f2090o00oOooO.remove(Integer.valueOf(i));
    }

    public void o00ooO0O(Context context, int i) {
        o00ooO0o((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    public void o00ooO0o(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f2090o00oOooO.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.o00oOOoO o00ooooo2 = (ConstraintLayout.o00oOOoO) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f2089o00oOo00 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f2090o00oOooO.containsKey(Integer.valueOf(id))) {
                this.f2090o00oOooO.put(Integer.valueOf(id), new o00oOOo0());
            }
            o00oOOo0 o00oooo02 = this.f2090o00oOooO.get(Integer.valueOf(id));
            o00oooo02.f2095o00oOo0o = androidx.constraintlayout.widget.o00oOOo0.o00oOo00(this.f2088o00oOOoO, childAt);
            o00oooo02.o00oOoOo(id, o00ooooo2);
            o00oooo02.f2092o00oOOoO.f2227o00oOOoO = childAt.getVisibility();
            o00oooo02.f2092o00oOOoO.f2230o00oOooO = childAt.getAlpha();
            o00oooo02.f2094o00oOo0O.f2244o00oOOoO = childAt.getRotation();
            o00oooo02.f2094o00oOo0O.f2245o00oOo00 = childAt.getRotationX();
            o00oooo02.f2094o00oOo0O.f2253o00oOooO = childAt.getRotationY();
            o00oooo02.f2094o00oOo0O.f2246o00oOo0O = childAt.getScaleX();
            o00oooo02.f2094o00oOo0O.f2247o00oOo0o = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                C0014o00oOoO c0014o00oOoO = o00oooo02.f2094o00oOo0O;
                c0014o00oOoO.f2249o00oOoO0 = pivotX;
                c0014o00oOoO.f2248o00oOoO = pivotY;
            }
            o00oooo02.f2094o00oOo0O.f2250o00oOoOO = childAt.getTranslationX();
            o00oooo02.f2094o00oOo0O.f2251o00oOoOo = childAt.getTranslationY();
            o00oooo02.f2094o00oOo0O.f2252o00oOoo0 = childAt.getTranslationZ();
            C0014o00oOoO c0014o00oOoO2 = o00oooo02.f2094o00oOo0O;
            if (c0014o00oOoO2.f2254o00oOooo) {
                c0014o00oOoO2.f2255o00oo00O = childAt.getElevation();
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                o00oooo02.f2096o00oOooO.f2208o0OoO00O = barrier.o00ooO0O();
                o00oooo02.f2096o00oOooO.f2203o0O000o = barrier.getReferencedIds();
                o00oooo02.f2096o00oOooO.f2202o0O000Oo = barrier.getType();
                o00oooo02.f2096o00oOooO.f2209o0OoOoOO = barrier.getMargin();
            }
        }
    }

    public void o00ooOO(int i, int i2, int i3, int i4) {
        o00oOOoO o00ooooo2;
        if (!this.f2090o00oOooO.containsKey(Integer.valueOf(i))) {
            this.f2090o00oOooO.put(Integer.valueOf(i), new o00oOOo0());
        }
        o00oOOo0 o00oooo02 = this.f2090o00oOooO.get(Integer.valueOf(i));
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    o00oOOoO o00ooooo3 = o00oooo02.f2096o00oOooO;
                    o00ooooo3.f2156o00oOoO = i3;
                    o00ooooo3.f2158o00oOoOO = -1;
                    return;
                } else if (i4 == 2) {
                    o00oOOoO o00ooooo4 = o00oooo02.f2096o00oOooO;
                    o00ooooo4.f2158o00oOoOO = i3;
                    o00ooooo4.f2156o00oOoO = -1;
                    return;
                } else {
                    StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("left to ");
                    o00oOOo02.append(o0O0o0oO(i4));
                    o00oOOo02.append(" undefined");
                    throw new IllegalArgumentException(o00oOOo02.toString());
                }
            case 2:
                if (i4 == 1) {
                    o00oOOoO o00ooooo5 = o00oooo02.f2096o00oOooO;
                    o00ooooo5.f2159o00oOoOo = i3;
                    o00ooooo5.f2160o00oOoo0 = -1;
                    return;
                } else if (i4 == 2) {
                    o00oOOoO o00ooooo6 = o00oooo02.f2096o00oOooO;
                    o00ooooo6.f2160o00oOoo0 = i3;
                    o00ooooo6.f2159o00oOoOo = -1;
                    return;
                } else {
                    StringBuilder o00oOOo03 = android.support.v4.media.o00oOo0O.o00oOOo0("right to ");
                    o00oOOo03.append(o0O0o0oO(i4));
                    o00oOOo03.append(" undefined");
                    throw new IllegalArgumentException(o00oOOo03.toString());
                }
            case 3:
                if (i4 == 3) {
                    o00ooooo2 = o00oooo02.f2096o00oOooO;
                    o00ooooo2.f2162o00oOooo = i3;
                    o00ooooo2.f2165o00oo00O = -1;
                    break;
                } else if (i4 != 4) {
                    StringBuilder o00oOOo04 = android.support.v4.media.o00oOo0O.o00oOOo0("right to ");
                    o00oOOo04.append(o0O0o0oO(i4));
                    o00oOOo04.append(" undefined");
                    throw new IllegalArgumentException(o00oOOo04.toString());
                } else {
                    o00ooooo2 = o00oooo02.f2096o00oOooO;
                    o00ooooo2.f2165o00oo00O = i3;
                    o00ooooo2.f2162o00oOooo = -1;
                    break;
                }
            case 4:
                if (i4 == 4) {
                    o00ooooo2 = o00oooo02.f2096o00oOooO;
                    o00ooooo2.f2168o00oo0OO = i3;
                    o00ooooo2.f2164o00oo0 = -1;
                    break;
                } else if (i4 != 3) {
                    StringBuilder o00oOOo05 = android.support.v4.media.o00oOo0O.o00oOOo0("right to ");
                    o00oOOo05.append(o0O0o0oO(i4));
                    o00oOOo05.append(" undefined");
                    throw new IllegalArgumentException(o00oOOo05.toString());
                } else {
                    o00ooooo2 = o00oooo02.f2096o00oOooO;
                    o00ooooo2.f2164o00oo0 = i3;
                    o00ooooo2.f2168o00oo0OO = -1;
                    break;
                }
            case 5:
                if (i4 != 5) {
                    StringBuilder o00oOOo06 = android.support.v4.media.o00oOo0O.o00oOOo0("right to ");
                    o00oOOo06.append(o0O0o0oO(i4));
                    o00oOOo06.append(" undefined");
                    throw new IllegalArgumentException(o00oOOo06.toString());
                }
                o00oOOoO o00ooooo7 = o00oooo02.f2096o00oOooO;
                o00ooooo7.f2167o00oo0O0 = i3;
                o00ooooo7.f2168o00oo0OO = -1;
                o00ooooo7.f2164o00oo0 = -1;
                o00ooooo7.f2162o00oOooo = -1;
                o00ooooo7.f2165o00oo00O = -1;
                return;
            case 6:
                if (i4 == 6) {
                    o00oOOoO o00ooooo8 = o00oooo02.f2096o00oOooO;
                    o00ooooo8.f2169o00oo0Oo = i3;
                    o00ooooo8.f2166o00oo0O = -1;
                    return;
                } else if (i4 == 7) {
                    o00oOOoO o00ooooo9 = o00oooo02.f2096o00oOooO;
                    o00ooooo9.f2166o00oo0O = i3;
                    o00ooooo9.f2169o00oo0Oo = -1;
                    return;
                } else {
                    StringBuilder o00oOOo07 = android.support.v4.media.o00oOo0O.o00oOOo0("right to ");
                    o00oOOo07.append(o0O0o0oO(i4));
                    o00oOOo07.append(" undefined");
                    throw new IllegalArgumentException(o00oOOo07.toString());
                }
            case 7:
                if (i4 == 7) {
                    o00oOOoO o00ooooo10 = o00oooo02.f2096o00oOooO;
                    o00ooooo10.f2170o00oo0o = i3;
                    o00ooooo10.f2171o00oo0o0 = -1;
                    return;
                } else if (i4 == 6) {
                    o00oOOoO o00ooooo11 = o00oooo02.f2096o00oOooO;
                    o00ooooo11.f2171o00oo0o0 = i3;
                    o00ooooo11.f2170o00oo0o = -1;
                    return;
                } else {
                    StringBuilder o00oOOo08 = android.support.v4.media.o00oOo0O.o00oOOo0("right to ");
                    o00oOOo08.append(o0O0o0oO(i4));
                    o00oOOo08.append(" undefined");
                    throw new IllegalArgumentException(o00oOOo08.toString());
                }
            default:
                throw new IllegalArgumentException(o0O0o0oO(i2) + " to " + o0O0o0oO(i4) + " unknown");
        }
        o00ooooo2.f2167o00oo0O0 = -1;
    }

    public void o00ooOO0(o00oo00O o00oo00o) {
        int childCount = o00oo00o.getChildCount();
        this.f2090o00oOooO.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = o00oo00o.getChildAt(i);
            o00oo00O.o00oOOo0 o00oooo02 = (o00oo00O.o00oOOo0) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f2089o00oOo00 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f2090o00oOooO.containsKey(Integer.valueOf(id))) {
                this.f2090o00oOooO.put(Integer.valueOf(id), new o00oOOo0());
            }
            o00oOOo0 o00oooo03 = this.f2090o00oOooO.get(Integer.valueOf(id));
            if (childAt instanceof androidx.constraintlayout.widget.o00oOOoO) {
                o00oooo03.o00oOooo((androidx.constraintlayout.widget.o00oOOoO) childAt, id, o00oooo02);
            }
            o00oooo03.o00oOoo0(id, o00oooo02);
        }
    }

    public void o00ooOOo(int i, int i2, int i3, int i4, int i5) {
        o00oOOoO o00ooooo2;
        o00oOOoO o00ooooo3;
        if (!this.f2090o00oOooO.containsKey(Integer.valueOf(i))) {
            this.f2090o00oOooO.put(Integer.valueOf(i), new o00oOOo0());
        }
        o00oOOo0 o00oooo02 = this.f2090o00oOooO.get(Integer.valueOf(i));
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    o00oOOoO o00ooooo4 = o00oooo02.f2096o00oOooO;
                    o00ooooo4.f2156o00oOoO = i3;
                    o00ooooo4.f2158o00oOoOO = -1;
                } else if (i4 != 2) {
                    StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Left to ");
                    o00oOOo02.append(o0O0o0oO(i4));
                    o00oOOo02.append(" undefined");
                    throw new IllegalArgumentException(o00oOOo02.toString());
                } else {
                    o00oOOoO o00ooooo5 = o00oooo02.f2096o00oOooO;
                    o00ooooo5.f2158o00oOoOO = i3;
                    o00ooooo5.f2156o00oOoO = -1;
                }
                o00oooo02.f2096o00oOooO.f2178o00ooOO = i5;
                return;
            case 2:
                if (i4 == 1) {
                    o00oOOoO o00ooooo6 = o00oooo02.f2096o00oOooO;
                    o00ooooo6.f2159o00oOoOo = i3;
                    o00ooooo6.f2160o00oOoo0 = -1;
                } else if (i4 != 2) {
                    StringBuilder o00oOOo03 = android.support.v4.media.o00oOo0O.o00oOOo0("right to ");
                    o00oOOo03.append(o0O0o0oO(i4));
                    o00oOOo03.append(" undefined");
                    throw new IllegalArgumentException(o00oOOo03.toString());
                } else {
                    o00oOOoO o00ooooo7 = o00oooo02.f2096o00oOooO;
                    o00ooooo7.f2160o00oOoo0 = i3;
                    o00ooooo7.f2159o00oOoOo = -1;
                }
                o00oooo02.f2096o00oOooO.f2180o00ooOOo = i5;
                return;
            case 3:
                if (i4 == 3) {
                    o00ooooo2 = o00oooo02.f2096o00oOooO;
                    o00ooooo2.f2162o00oOooo = i3;
                    o00ooooo2.f2165o00oo00O = -1;
                } else if (i4 != 4) {
                    StringBuilder o00oOOo04 = android.support.v4.media.o00oOo0O.o00oOOo0("right to ");
                    o00oOOo04.append(o0O0o0oO(i4));
                    o00oOOo04.append(" undefined");
                    throw new IllegalArgumentException(o00oOOo04.toString());
                } else {
                    o00ooooo2 = o00oooo02.f2096o00oOooO;
                    o00ooooo2.f2165o00oo00O = i3;
                    o00ooooo2.f2162o00oOooo = -1;
                }
                o00ooooo2.f2167o00oo0O0 = -1;
                o00oooo02.f2096o00oOooO.f2182o00ooOo0 = i5;
                return;
            case 4:
                if (i4 == 4) {
                    o00ooooo3 = o00oooo02.f2096o00oOooO;
                    o00ooooo3.f2168o00oo0OO = i3;
                    o00ooooo3.f2164o00oo0 = -1;
                } else if (i4 != 3) {
                    StringBuilder o00oOOo05 = android.support.v4.media.o00oOo0O.o00oOOo0("right to ");
                    o00oOOo05.append(o0O0o0oO(i4));
                    o00oOOo05.append(" undefined");
                    throw new IllegalArgumentException(o00oOOo05.toString());
                } else {
                    o00ooooo3 = o00oooo02.f2096o00oOooO;
                    o00ooooo3.f2164o00oo0 = i3;
                    o00ooooo3.f2168o00oo0OO = -1;
                }
                o00ooooo3.f2167o00oo0O0 = -1;
                o00oooo02.f2096o00oOooO.f2181o00ooOo = i5;
                return;
            case 5:
                if (i4 != 5) {
                    StringBuilder o00oOOo06 = android.support.v4.media.o00oOo0O.o00oOOo0("right to ");
                    o00oOOo06.append(o0O0o0oO(i4));
                    o00oOOo06.append(" undefined");
                    throw new IllegalArgumentException(o00oOOo06.toString());
                }
                o00oOOoO o00ooooo8 = o00oooo02.f2096o00oOooO;
                o00ooooo8.f2167o00oo0O0 = i3;
                o00ooooo8.f2168o00oo0OO = -1;
                o00ooooo8.f2164o00oo0 = -1;
                o00ooooo8.f2162o00oOooo = -1;
                o00ooooo8.f2165o00oo00O = -1;
                return;
            case 6:
                if (i4 == 6) {
                    o00oOOoO o00ooooo9 = o00oooo02.f2096o00oOooO;
                    o00ooooo9.f2169o00oo0Oo = i3;
                    o00ooooo9.f2166o00oo0O = -1;
                } else if (i4 != 7) {
                    StringBuilder o00oOOo07 = android.support.v4.media.o00oOo0O.o00oOOo0("right to ");
                    o00oOOo07.append(o0O0o0oO(i4));
                    o00oOOo07.append(" undefined");
                    throw new IllegalArgumentException(o00oOOo07.toString());
                } else {
                    o00oOOoO o00ooooo10 = o00oooo02.f2096o00oOooO;
                    o00ooooo10.f2166o00oo0O = i3;
                    o00ooooo10.f2169o00oo0Oo = -1;
                }
                o00oooo02.f2096o00oOooO.f2184o00ooOoo = i5;
                return;
            case 7:
                if (i4 == 7) {
                    o00oOOoO o00ooooo11 = o00oooo02.f2096o00oOooO;
                    o00ooooo11.f2170o00oo0o = i3;
                    o00ooooo11.f2171o00oo0o0 = -1;
                } else if (i4 != 6) {
                    StringBuilder o00oOOo08 = android.support.v4.media.o00oOo0O.o00oOOo0("right to ");
                    o00oOOo08.append(o0O0o0oO(i4));
                    o00oOOo08.append(" undefined");
                    throw new IllegalArgumentException(o00oOOo08.toString());
                } else {
                    o00oOOoO o00ooooo12 = o00oooo02.f2096o00oOooO;
                    o00ooooo12.f2171o00oo0o0 = i3;
                    o00ooooo12.f2170o00oo0o = -1;
                }
                o00oooo02.f2096o00oOooO.f2183o00ooOoO = i5;
                return;
            default:
                throw new IllegalArgumentException(o0O0o0oO(i2) + " to " + o0O0o0oO(i4) + " unknown");
        }
    }

    public void o00ooOo(int i, int i2) {
        o0O000Oo(i).f2096o00oOooO.f2150o0 = i2;
    }

    public void o00ooOo0(int i, int i2, int i3, float f) {
        o00oOOoO o00ooooo2 = o0O000Oo(i).f2096o00oOooO;
        o00ooooo2.f2175o00ooO00 = i2;
        o00ooooo2.f2174o00ooO0 = i3;
        o00ooooo2.f2176o00ooO0O = f;
    }

    public void o00ooOoO(int i, int i2) {
        o0O000Oo(i).f2096o00oOooO.f2195o00ooooo = i2;
    }

    public void o00ooOoo(int i, int i2) {
        o0O000Oo(i).f2096o00oOooO.f2161o00oOooO = i2;
    }

    public void o00ooo0(int i, int i2) {
        o0O000Oo(i).f2096o00oOooO.f2198o0O00000 = i2;
    }

    public void o00ooo00(int i, int i2) {
        o0O000Oo(i).f2096o00oOooO.f2199o0O0000O = i2;
    }

    public void o00ooo0O(int i, int i2) {
        o0O000Oo(i).f2096o00oOooO.f2197o0O000 = i2;
    }

    public void o00ooo0o(int i, int i2) {
        o0O000Oo(i).f2096o00oOooO.f2200o0O0000o = i2;
    }

    public void o00oooO(int i, float f) {
        o0O000Oo(i).f2096o00oOooO.f2210o0OoOoOo = f;
    }

    public void o00oooOO(int i, float f) {
        o0O000Oo(i).f2096o00oOooO.f2201o0O000O = f;
    }

    public void o00oooOo(int i, int i2) {
        o0O000Oo(i).f2096o00oOooO.f2153o00oOo00 = i2;
    }

    public void o00oooo(int i, boolean z) {
        o0O000Oo(i).f2096o00oOooO.f2196o0O00 = z;
    }

    public void o00oooo0(int i, boolean z) {
        o0O000Oo(i).f2096o00oOooO.f2206o0O00O0 = z;
    }

    public final int[] o00ooooO(View view, String str) {
        int i;
        Object designInformation;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = R.id.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) view.getParent()).getDesignInformation(0, trim)) != null && (designInformation instanceof Integer)) {
                i = ((Integer) designInformation).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    public void o00ooooo(int i, int i2) {
        o00oOOoO o00ooooo2 = o0O000Oo(i).f2096o00oOooO;
        o00ooooo2.f2151o00oOOo0 = true;
        o00ooooo2.f2179o00ooOO0 = i2;
    }

    public o00oOOo0 o0O00(int i) {
        return o0O000Oo(i);
    }

    public void o0O000(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != iArr.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            o0O000Oo(iArr[0]).f2096o00oOooO.f2191o00oooOo = fArr[0];
        }
        o0O000Oo(iArr[0]).f2096o00oOooO.f2194o00ooooO = i5;
        o00ooOOo(iArr[0], 3, i, i2, 0);
        for (int i6 = 1; i6 < iArr.length; i6++) {
            int i7 = i6 - 1;
            o00ooOOo(iArr[i6], 3, iArr[i7], 4, 0);
            o00ooOOo(iArr[i7], 4, iArr[i6], 3, 0);
            if (fArr != null) {
                o0O000Oo(iArr[i6]).f2096o00oOooO.f2191o00oooOo = fArr[i6];
            }
        }
        o00ooOOo(iArr[iArr.length - 1], 4, i3, i4, 0);
    }

    public void o0O00000(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5) {
        o0O0000O(i, i2, i3, i4, iArr, fArr, i5, 1, 2);
    }

    public final void o0O0000O(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5, int i6, int i7) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != iArr.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            o0O000Oo(iArr[0]).f2096o00oOooO.f2193o00oooo0 = fArr[0];
        }
        o0O000Oo(iArr[0]).f2096o00oOooO.f2192o00oooo = i5;
        o00ooOOo(iArr[0], i6, i, i2, -1);
        for (int i8 = 1; i8 < iArr.length; i8++) {
            int i9 = i8 - 1;
            o00ooOOo(iArr[i8], i6, iArr[i9], i7, -1);
            o00ooOOo(iArr[i9], i7, iArr[i8], i6, -1);
            if (fArr != null) {
                o0O000Oo(iArr[i8]).f2096o00oOooO.f2193o00oooo0 = fArr[i8];
            }
        }
        o00ooOOo(iArr[iArr.length - 1], i7, i3, i4, -1);
    }

    public void o0O0000o(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5) {
        o0O0000O(i, i2, i3, i4, iArr, fArr, i5, 6, 7);
    }

    public void o0O000O(o0O00 o0o00, int... iArr) {
        HashSet hashSet;
        Integer[] numArr;
        Set<Integer> keySet = this.f2090o00oOooO.keySet();
        if (iArr.length != 0) {
            hashSet = new HashSet();
            for (int i : iArr) {
                hashSet.add(Integer.valueOf(i));
            }
        } else {
            hashSet = new HashSet(keySet);
        }
        System.out.println(hashSet.size() + " constraints");
        StringBuilder sb = new StringBuilder();
        for (Integer num : (Integer[]) hashSet.toArray(new Integer[0])) {
            sb.append("<Constraint id=");
            sb.append(num);
            sb.append(" \n");
            this.f2090o00oOooO.get(num).f2096o00oOooO.o00oOOoO(o0o00, sb);
            sb.append("/>\n");
        }
        System.out.println(sb.toString());
    }

    public final o00oOOo0 o0O000Oo(int i) {
        if (!this.f2090o00oOooO.containsKey(Integer.valueOf(i))) {
            this.f2090o00oOooO.put(Integer.valueOf(i), new o00oOOo0());
        }
        return this.f2090o00oOooO.get(Integer.valueOf(i));
    }

    public HashMap<String, androidx.constraintlayout.widget.o00oOOo0> o0O000o() {
        return this.f2088o00oOOoO;
    }

    public o00oOOo0 o0O000o0(int i) {
        if (this.f2090o00oOooO.containsKey(Integer.valueOf(i))) {
            return this.f2090o00oOooO.get(Integer.valueOf(i));
        }
        return null;
    }

    public int[] o0O000oo() {
        Integer[] numArr = (Integer[]) this.f2090o00oOooO.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    public int o0O00O(int i) {
        return o0O000Oo(i).f2096o00oOooO.f2153o00oOo00;
    }

    public int[] o0O00O0(int i) {
        int[] iArr = o0O000Oo(i).f2096o00oOooO.f2203o0O000o;
        return iArr == null ? new int[0] : Arrays.copyOf(iArr, iArr.length);
    }

    public int o0O00O0o(int i) {
        return o0O000Oo(i).f2092o00oOOoO.f2228o00oOo00;
    }

    public boolean o0O00OO() {
        return this.f2089o00oOo00;
    }

    public void o0O00OOO(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    o00oOOo0 o0OoOoOo2 = o0OoOoOo(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        o0OoOoOo2.f2096o00oOooO.f2151o00oOOo0 = true;
                    }
                    this.f2090o00oOooO.put(Integer.valueOf(o0OoOoOo2.f2091o00oOOo0), o0OoOoOo2);
                    continue;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0179, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o0O00Oo(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.o00oOoO.o0O00Oo(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public void o0O00OoO(o00oOOo0 o00oooo02, String str) {
        String[] split = str.split(",");
        for (int i = 0; i < split.length; i++) {
            String[] split2 = split[i].split("=");
            if (split2.length != 2) {
                String str2 = split[i];
            } else {
                o00oooo02.o00oo0(split2[0], Color.parseColor(split2[1]));
            }
        }
    }

    public void o0O00Ooo(o00oOOo0 o00oooo02, String str) {
        String[] split = str.split(",");
        for (int i = 0; i < split.length; i++) {
            String[] split2 = split[i].split("=");
            if (split2.length != 2) {
                String str2 = split[i];
            } else {
                o00oooo02.o00oo0OO(split2[0], Float.parseFloat(split2[1]));
            }
        }
    }

    public void o0O00o(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.o00oOOoO o00ooooo2 = (ConstraintLayout.o00oOOoO) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f2089o00oOo00 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f2090o00oOooO.containsKey(Integer.valueOf(id))) {
                this.f2090o00oOooO.put(Integer.valueOf(id), new o00oOOo0());
            }
            o00oOOo0 o00oooo02 = this.f2090o00oOooO.get(Integer.valueOf(id));
            if (!o00oooo02.f2096o00oOooO.f2152o00oOOoO) {
                o00oooo02.o00oOoOo(id, o00ooooo2);
                if (childAt instanceof androidx.constraintlayout.widget.o00oOOoO) {
                    o00oooo02.f2096o00oOooO.f2203o0O000o = ((androidx.constraintlayout.widget.o00oOOoO) childAt).getReferencedIds();
                    if (childAt instanceof Barrier) {
                        Barrier barrier = (Barrier) childAt;
                        o00oooo02.f2096o00oOooO.f2208o0OoO00O = barrier.o00ooO0O();
                        o00oooo02.f2096o00oOooO.f2202o0O000Oo = barrier.getType();
                        o00oooo02.f2096o00oOooO.f2209o0OoOoOO = barrier.getMargin();
                    }
                }
                o00oooo02.f2096o00oOooO.f2152o00oOOoO = true;
            }
            o00oOo0O o00ooo0o2 = o00oooo02.f2092o00oOOoO;
            if (!o00ooo0o2.f2226o00oOOo0) {
                o00ooo0o2.f2227o00oOOoO = childAt.getVisibility();
                o00oooo02.f2092o00oOOoO.f2230o00oOooO = childAt.getAlpha();
                o00oooo02.f2092o00oOOoO.f2226o00oOOo0 = true;
            }
            C0014o00oOoO c0014o00oOoO = o00oooo02.f2094o00oOo0O;
            if (!c0014o00oOoO.f2243o00oOOo0) {
                c0014o00oOoO.f2243o00oOOo0 = true;
                c0014o00oOoO.f2244o00oOOoO = childAt.getRotation();
                o00oooo02.f2094o00oOo0O.f2245o00oOo00 = childAt.getRotationX();
                o00oooo02.f2094o00oOo0O.f2253o00oOooO = childAt.getRotationY();
                o00oooo02.f2094o00oOo0O.f2246o00oOo0O = childAt.getScaleX();
                o00oooo02.f2094o00oOo0O.f2247o00oOo0o = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    C0014o00oOoO c0014o00oOoO2 = o00oooo02.f2094o00oOo0O;
                    c0014o00oOoO2.f2249o00oOoO0 = pivotX;
                    c0014o00oOoO2.f2248o00oOoO = pivotY;
                }
                o00oooo02.f2094o00oOo0O.f2250o00oOoOO = childAt.getTranslationX();
                o00oooo02.f2094o00oOo0O.f2251o00oOoOo = childAt.getTranslationY();
                o00oooo02.f2094o00oOo0O.f2252o00oOoo0 = childAt.getTranslationZ();
                C0014o00oOoO c0014o00oOoO3 = o00oooo02.f2094o00oOo0O;
                if (c0014o00oOoO3.f2254o00oOooo) {
                    c0014o00oOoO3.f2255o00oo00O = childAt.getElevation();
                }
            }
        }
    }

    public void o0O00o00(o00oOOo0 o00oooo02, String str) {
        String[] split = str.split(",");
        for (int i = 0; i < split.length; i++) {
            String[] split2 = split[i].split("=");
            if (split2.length != 2) {
                String str2 = split[i];
            } else {
                o00oooo02.o00oo0OO(split2[0], Integer.decode(split2[1]).intValue());
            }
        }
    }

    public void o0O00o0O(o00oOOo0 o00oooo02, String str) {
        String[] o0O0o0oo2 = o0O0o0oo(str);
        for (int i = 0; i < o0O0o0oo2.length; i++) {
            String[] split = o0O0o0oo2[i].split("=");
            String str2 = o0O0o0oo2[i];
            o00oooo02.o00oo0O(split[0], split[1]);
        }
    }

    public final void o0O00o0o(Context context, o00oOOo0 o00oooo02, TypedArray typedArray) {
        o00oOo00 o00ooo002;
        String str;
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index != R.styleable.Constraint_android_id && R.styleable.Constraint_android_layout_marginStart != index && R.styleable.Constraint_android_layout_marginEnd != index) {
                o00oooo02.f2093o00oOo00.f2219o00oOOo0 = true;
                o00oooo02.f2096o00oOooO.f2152o00oOOoO = true;
                o00oooo02.f2092o00oOOoO.f2226o00oOOo0 = true;
                o00oooo02.f2094o00oOo0O.f2243o00oOOo0 = true;
            }
            switch (f2004o00ooOoo.get(index)) {
                case 1:
                    o00oOOoO o00ooooo2 = o00oooo02.f2096o00oOooO;
                    o00ooooo2.f2167o00oo0O0 = o0oO0Ooo(typedArray, index, o00ooooo2.f2167o00oo0O0);
                    break;
                case 2:
                    o00oOOoO o00ooooo3 = o00oooo02.f2096o00oOooO;
                    o00ooooo3.f2181o00ooOo = typedArray.getDimensionPixelSize(index, o00ooooo3.f2181o00ooOo);
                    break;
                case 3:
                    o00oOOoO o00ooooo4 = o00oooo02.f2096o00oOooO;
                    o00ooooo4.f2168o00oo0OO = o0oO0Ooo(typedArray, index, o00ooooo4.f2168o00oo0OO);
                    break;
                case 4:
                    o00oOOoO o00ooooo5 = o00oooo02.f2096o00oOooO;
                    o00ooooo5.f2164o00oo0 = o0oO0Ooo(typedArray, index, o00ooooo5.f2164o00oo0);
                    break;
                case 5:
                    o00oooo02.f2096o00oOooO.f2163o00oo = typedArray.getString(index);
                    break;
                case 6:
                    o00oOOoO o00ooooo6 = o00oooo02.f2096o00oOooO;
                    o00ooooo6.f2177o00ooO0o = typedArray.getDimensionPixelOffset(index, o00ooooo6.f2177o00ooO0o);
                    break;
                case 7:
                    o00oOOoO o00ooooo7 = o00oooo02.f2096o00oOooO;
                    o00ooooo7.f2173o00ooO = typedArray.getDimensionPixelOffset(index, o00ooooo7.f2173o00ooO);
                    break;
                case 8:
                    o00oOOoO o00ooooo8 = o00oooo02.f2096o00oOooO;
                    o00ooooo8.f2183o00ooOoO = typedArray.getDimensionPixelSize(index, o00ooooo8.f2183o00ooOoO);
                    break;
                case 9:
                    o00oOOoO o00ooooo9 = o00oooo02.f2096o00oOooO;
                    o00ooooo9.f2170o00oo0o = o0oO0Ooo(typedArray, index, o00ooooo9.f2170o00oo0o);
                    break;
                case 10:
                    o00oOOoO o00ooooo10 = o00oooo02.f2096o00oOooO;
                    o00ooooo10.f2171o00oo0o0 = o0oO0Ooo(typedArray, index, o00ooooo10.f2171o00oo0o0);
                    break;
                case 11:
                    o00oOOoO o00ooooo11 = o00oooo02.f2096o00oOooO;
                    o00ooooo11.f2188o00ooo0o = typedArray.getDimensionPixelSize(index, o00ooooo11.f2188o00ooo0o);
                    break;
                case 12:
                    o00oOOoO o00ooooo12 = o00oooo02.f2096o00oOooO;
                    o00ooooo12.f2189o00oooO = typedArray.getDimensionPixelSize(index, o00ooooo12.f2189o00oooO);
                    break;
                case 13:
                    o00oOOoO o00ooooo13 = o00oooo02.f2096o00oOooO;
                    o00ooooo13.f2186o00ooo00 = typedArray.getDimensionPixelSize(index, o00ooooo13.f2186o00ooo00);
                    break;
                case 14:
                    o00oOOoO o00ooooo14 = o00oooo02.f2096o00oOooO;
                    o00ooooo14.f2187o00ooo0O = typedArray.getDimensionPixelSize(index, o00ooooo14.f2187o00ooo0O);
                    break;
                case 15:
                    o00oOOoO o00ooooo15 = o00oooo02.f2096o00oOooO;
                    o00ooooo15.f2190o00oooOO = typedArray.getDimensionPixelSize(index, o00ooooo15.f2190o00oooOO);
                    break;
                case 16:
                    o00oOOoO o00ooooo16 = o00oooo02.f2096o00oOooO;
                    o00ooooo16.f2185o00ooo0 = typedArray.getDimensionPixelSize(index, o00ooooo16.f2185o00ooo0);
                    break;
                case 17:
                    o00oOOoO o00ooooo17 = o00oooo02.f2096o00oOooO;
                    o00ooooo17.f2154o00oOo0O = typedArray.getDimensionPixelOffset(index, o00ooooo17.f2154o00oOo0O);
                    break;
                case 18:
                    o00oOOoO o00ooooo18 = o00oooo02.f2096o00oOooO;
                    o00ooooo18.f2155o00oOo0o = typedArray.getDimensionPixelOffset(index, o00ooooo18.f2155o00oOo0o);
                    break;
                case 19:
                    o00oOOoO o00ooooo19 = o00oooo02.f2096o00oOooO;
                    o00ooooo19.f2157o00oOoO0 = typedArray.getFloat(index, o00ooooo19.f2157o00oOoO0);
                    break;
                case 20:
                    o00oOOoO o00ooooo20 = o00oooo02.f2096o00oOooO;
                    o00ooooo20.f2172o00oo0oO = typedArray.getFloat(index, o00ooooo20.f2172o00oo0oO);
                    break;
                case 21:
                    o00oOOoO o00ooooo21 = o00oooo02.f2096o00oOooO;
                    o00ooooo21.f2161o00oOooO = typedArray.getLayoutDimension(index, o00ooooo21.f2161o00oOooO);
                    break;
                case 22:
                    o00oOo0O o00ooo0o2 = o00oooo02.f2092o00oOOoO;
                    o00ooo0o2.f2227o00oOOoO = typedArray.getInt(index, o00ooo0o2.f2227o00oOOoO);
                    o00oOo0O o00ooo0o3 = o00oooo02.f2092o00oOOoO;
                    o00ooo0o3.f2227o00oOOoO = f2001o00ooOo[o00ooo0o3.f2227o00oOOoO];
                    break;
                case 23:
                    o00oOOoO o00ooooo22 = o00oooo02.f2096o00oOooO;
                    o00ooooo22.f2153o00oOo00 = typedArray.getLayoutDimension(index, o00ooooo22.f2153o00oOo00);
                    break;
                case 24:
                    o00oOOoO o00ooooo23 = o00oooo02.f2096o00oOooO;
                    o00ooooo23.f2178o00ooOO = typedArray.getDimensionPixelSize(index, o00ooooo23.f2178o00ooOO);
                    break;
                case 25:
                    o00oOOoO o00ooooo24 = o00oooo02.f2096o00oOooO;
                    o00ooooo24.f2156o00oOoO = o0oO0Ooo(typedArray, index, o00ooooo24.f2156o00oOoO);
                    break;
                case 26:
                    o00oOOoO o00ooooo25 = o00oooo02.f2096o00oOooO;
                    o00ooooo25.f2158o00oOoOO = o0oO0Ooo(typedArray, index, o00ooooo25.f2158o00oOoOO);
                    break;
                case 27:
                    o00oOOoO o00ooooo26 = o00oooo02.f2096o00oOooO;
                    o00ooooo26.f2179o00ooOO0 = typedArray.getInt(index, o00ooooo26.f2179o00ooOO0);
                    break;
                case 28:
                    o00oOOoO o00ooooo27 = o00oooo02.f2096o00oOooO;
                    o00ooooo27.f2180o00ooOOo = typedArray.getDimensionPixelSize(index, o00ooooo27.f2180o00ooOOo);
                    break;
                case 29:
                    o00oOOoO o00ooooo28 = o00oooo02.f2096o00oOooO;
                    o00ooooo28.f2159o00oOoOo = o0oO0Ooo(typedArray, index, o00ooooo28.f2159o00oOoOo);
                    break;
                case 30:
                    o00oOOoO o00ooooo29 = o00oooo02.f2096o00oOooO;
                    o00ooooo29.f2160o00oOoo0 = o0oO0Ooo(typedArray, index, o00ooooo29.f2160o00oOoo0);
                    break;
                case 31:
                    o00oOOoO o00ooooo30 = o00oooo02.f2096o00oOooO;
                    o00ooooo30.f2184o00ooOoo = typedArray.getDimensionPixelSize(index, o00ooooo30.f2184o00ooOoo);
                    break;
                case 32:
                    o00oOOoO o00ooooo31 = o00oooo02.f2096o00oOooO;
                    o00ooooo31.f2166o00oo0O = o0oO0Ooo(typedArray, index, o00ooooo31.f2166o00oo0O);
                    break;
                case 33:
                    o00oOOoO o00ooooo32 = o00oooo02.f2096o00oOooO;
                    o00ooooo32.f2169o00oo0Oo = o0oO0Ooo(typedArray, index, o00ooooo32.f2169o00oo0Oo);
                    break;
                case 34:
                    o00oOOoO o00ooooo33 = o00oooo02.f2096o00oOooO;
                    o00ooooo33.f2182o00ooOo0 = typedArray.getDimensionPixelSize(index, o00ooooo33.f2182o00ooOo0);
                    break;
                case 35:
                    o00oOOoO o00ooooo34 = o00oooo02.f2096o00oOooO;
                    o00ooooo34.f2165o00oo00O = o0oO0Ooo(typedArray, index, o00ooooo34.f2165o00oo00O);
                    break;
                case 36:
                    o00oOOoO o00ooooo35 = o00oooo02.f2096o00oOooO;
                    o00ooooo35.f2162o00oOooo = o0oO0Ooo(typedArray, index, o00ooooo35.f2162o00oOooo);
                    break;
                case 37:
                    o00oOOoO o00ooooo36 = o00oooo02.f2096o00oOooO;
                    o00ooooo36.f2207o0O0o = typedArray.getFloat(index, o00ooooo36.f2207o0O0o);
                    break;
                case 38:
                    o00oooo02.f2091o00oOOo0 = typedArray.getResourceId(index, o00oooo02.f2091o00oOOo0);
                    break;
                case 39:
                    o00oOOoO o00ooooo37 = o00oooo02.f2096o00oOooO;
                    o00ooooo37.f2193o00oooo0 = typedArray.getFloat(index, o00ooooo37.f2193o00oooo0);
                    break;
                case 40:
                    o00oOOoO o00ooooo38 = o00oooo02.f2096o00oOooO;
                    o00ooooo38.f2191o00oooOo = typedArray.getFloat(index, o00ooooo38.f2191o00oooOo);
                    break;
                case 41:
                    o00oOOoO o00ooooo39 = o00oooo02.f2096o00oOooO;
                    o00ooooo39.f2192o00oooo = typedArray.getInt(index, o00ooooo39.f2192o00oooo);
                    break;
                case 42:
                    o00oOOoO o00ooooo40 = o00oooo02.f2096o00oOooO;
                    o00ooooo40.f2194o00ooooO = typedArray.getInt(index, o00ooooo40.f2194o00ooooO);
                    break;
                case 43:
                    o00oOo0O o00ooo0o4 = o00oooo02.f2092o00oOOoO;
                    o00ooo0o4.f2230o00oOooO = typedArray.getFloat(index, o00ooo0o4.f2230o00oOooO);
                    break;
                case 44:
                    C0014o00oOoO c0014o00oOoO = o00oooo02.f2094o00oOo0O;
                    c0014o00oOoO.f2254o00oOooo = true;
                    c0014o00oOoO.f2255o00oo00O = typedArray.getDimension(index, c0014o00oOoO.f2255o00oo00O);
                    break;
                case 45:
                    C0014o00oOoO c0014o00oOoO2 = o00oooo02.f2094o00oOo0O;
                    c0014o00oOoO2.f2245o00oOo00 = typedArray.getFloat(index, c0014o00oOoO2.f2245o00oOo00);
                    break;
                case 46:
                    C0014o00oOoO c0014o00oOoO3 = o00oooo02.f2094o00oOo0O;
                    c0014o00oOoO3.f2253o00oOooO = typedArray.getFloat(index, c0014o00oOoO3.f2253o00oOooO);
                    break;
                case 47:
                    C0014o00oOoO c0014o00oOoO4 = o00oooo02.f2094o00oOo0O;
                    c0014o00oOoO4.f2246o00oOo0O = typedArray.getFloat(index, c0014o00oOoO4.f2246o00oOo0O);
                    break;
                case 48:
                    C0014o00oOoO c0014o00oOoO5 = o00oooo02.f2094o00oOo0O;
                    c0014o00oOoO5.f2247o00oOo0o = typedArray.getFloat(index, c0014o00oOoO5.f2247o00oOo0o);
                    break;
                case 49:
                    C0014o00oOoO c0014o00oOoO6 = o00oooo02.f2094o00oOo0O;
                    c0014o00oOoO6.f2249o00oOoO0 = typedArray.getDimension(index, c0014o00oOoO6.f2249o00oOoO0);
                    break;
                case 50:
                    C0014o00oOoO c0014o00oOoO7 = o00oooo02.f2094o00oOo0O;
                    c0014o00oOoO7.f2248o00oOoO = typedArray.getDimension(index, c0014o00oOoO7.f2248o00oOoO);
                    break;
                case 51:
                    C0014o00oOoO c0014o00oOoO8 = o00oooo02.f2094o00oOo0O;
                    c0014o00oOoO8.f2250o00oOoOO = typedArray.getDimension(index, c0014o00oOoO8.f2250o00oOoOO);
                    break;
                case 52:
                    C0014o00oOoO c0014o00oOoO9 = o00oooo02.f2094o00oOo0O;
                    c0014o00oOoO9.f2251o00oOoOo = typedArray.getDimension(index, c0014o00oOoO9.f2251o00oOoOo);
                    break;
                case 53:
                    C0014o00oOoO c0014o00oOoO10 = o00oooo02.f2094o00oOo0O;
                    c0014o00oOoO10.f2252o00oOoo0 = typedArray.getDimension(index, c0014o00oOoO10.f2252o00oOoo0);
                    break;
                case 54:
                    o00oOOoO o00ooooo41 = o00oooo02.f2096o00oOooO;
                    o00ooooo41.f2195o00ooooo = typedArray.getInt(index, o00ooooo41.f2195o00ooooo);
                    break;
                case 55:
                    o00oOOoO o00ooooo42 = o00oooo02.f2096o00oOooO;
                    o00ooooo42.f2150o0 = typedArray.getInt(index, o00ooooo42.f2150o0);
                    break;
                case 56:
                    o00oOOoO o00ooooo43 = o00oooo02.f2096o00oOooO;
                    o00ooooo43.f2198o0O00000 = typedArray.getDimensionPixelSize(index, o00ooooo43.f2198o0O00000);
                    break;
                case 57:
                    o00oOOoO o00ooooo44 = o00oooo02.f2096o00oOooO;
                    o00ooooo44.f2199o0O0000O = typedArray.getDimensionPixelSize(index, o00ooooo44.f2199o0O0000O);
                    break;
                case 58:
                    o00oOOoO o00ooooo45 = o00oooo02.f2096o00oOooO;
                    o00ooooo45.f2200o0O0000o = typedArray.getDimensionPixelSize(index, o00ooooo45.f2200o0O0000o);
                    break;
                case 59:
                    o00oOOoO o00ooooo46 = o00oooo02.f2096o00oOooO;
                    o00ooooo46.f2197o0O000 = typedArray.getDimensionPixelSize(index, o00ooooo46.f2197o0O000);
                    break;
                case 60:
                    C0014o00oOoO c0014o00oOoO11 = o00oooo02.f2094o00oOo0O;
                    c0014o00oOoO11.f2244o00oOOoO = typedArray.getFloat(index, c0014o00oOoO11.f2244o00oOOoO);
                    break;
                case 61:
                    o00oOOoO o00ooooo47 = o00oooo02.f2096o00oOooO;
                    o00ooooo47.f2175o00ooO00 = o0oO0Ooo(typedArray, index, o00ooooo47.f2175o00ooO00);
                    break;
                case 62:
                    o00oOOoO o00ooooo48 = o00oooo02.f2096o00oOooO;
                    o00ooooo48.f2174o00ooO0 = typedArray.getDimensionPixelSize(index, o00ooooo48.f2174o00ooO0);
                    break;
                case 63:
                    o00oOOoO o00ooooo49 = o00oooo02.f2096o00oOooO;
                    o00ooooo49.f2176o00ooO0O = typedArray.getFloat(index, o00ooooo49.f2176o00ooO0O);
                    break;
                case 64:
                    o00oOo00 o00ooo003 = o00oooo02.f2093o00oOo00;
                    o00ooo003.f2220o00oOOoO = o0oO0Ooo(typedArray, index, o00ooo003.f2220o00oOOoO);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        o00ooo002 = o00oooo02.f2093o00oOo00;
                        str = typedArray.getString(index);
                    } else {
                        o00ooo002 = o00oooo02.f2093o00oOo00;
                        str = o00oo.o00oOo00.f7198o00oOoo0[typedArray.getInteger(index, 0)];
                    }
                    o00ooo002.f2221o00oOo00 = str;
                    break;
                case 66:
                    o00oooo02.f2093o00oOo00.f2222o00oOo0O = typedArray.getInt(index, 0);
                    break;
                case 67:
                    o00oOo00 o00ooo004 = o00oooo02.f2093o00oOo00;
                    o00ooo004.f2224o00oOoO0 = typedArray.getFloat(index, o00ooo004.f2224o00oOoO0);
                    break;
                case 68:
                    o00oOo0O o00ooo0o5 = o00oooo02.f2092o00oOOoO;
                    o00ooo0o5.f2229o00oOo0O = typedArray.getFloat(index, o00ooo0o5.f2229o00oOo0O);
                    break;
                case 69:
                    o00oooo02.f2096o00oOooO.f2201o0O000O = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    o00oooo02.f2096o00oOooO.f2210o0OoOoOo = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    break;
                case 72:
                    o00oOOoO o00ooooo50 = o00oooo02.f2096o00oOooO;
                    o00ooooo50.f2202o0O000Oo = typedArray.getInt(index, o00ooooo50.f2202o0O000Oo);
                    break;
                case 73:
                    o00oOOoO o00ooooo51 = o00oooo02.f2096o00oOooO;
                    o00ooooo51.f2209o0OoOoOO = typedArray.getDimensionPixelSize(index, o00ooooo51.f2209o0OoOoOO);
                    break;
                case 74:
                    o00oooo02.f2096o00oOooO.f2211o0ooOoOO = typedArray.getString(index);
                    break;
                case 75:
                    o00oOOoO o00ooooo52 = o00oooo02.f2096o00oOooO;
                    o00ooooo52.f2208o0OoO00O = typedArray.getBoolean(index, o00ooooo52.f2208o0OoO00O);
                    break;
                case 76:
                    o00oOo00 o00ooo005 = o00oooo02.f2093o00oOo00;
                    o00ooo005.f2225o00oOooO = typedArray.getInt(index, o00ooo005.f2225o00oOooO);
                    break;
                case 77:
                    o00oooo02.f2096o00oOooO.f2205o0O000oo = typedArray.getString(index);
                    break;
                case 78:
                    o00oOo0O o00ooo0o6 = o00oooo02.f2092o00oOOoO;
                    o00ooo0o6.f2228o00oOo00 = typedArray.getInt(index, o00ooo0o6.f2228o00oOo00);
                    break;
                case 79:
                    o00oOo00 o00ooo006 = o00oooo02.f2093o00oOo00;
                    o00ooo006.f2223o00oOo0o = typedArray.getFloat(index, o00ooo006.f2223o00oOo0o);
                    break;
                case 80:
                    o00oOOoO o00ooooo53 = o00oooo02.f2096o00oOooO;
                    o00ooooo53.f2196o0O00 = typedArray.getBoolean(index, o00ooooo53.f2196o0O00);
                    break;
                case 81:
                    o00oOOoO o00ooooo54 = o00oooo02.f2096o00oOooO;
                    o00ooooo54.f2206o0O00O0 = typedArray.getBoolean(index, o00ooooo54.f2206o0O00O0);
                    break;
                case 82:
                default:
                    Integer.toHexString(index);
                    f2004o00ooOoo.get(index);
                    break;
            }
        }
    }

    public void o0O00oO0(o00oOoO o00oooo2) {
        for (Integer num : o00oooo2.f2090o00oOooO.keySet()) {
            int intValue = num.intValue();
            o00oOOo0 o00oooo02 = o00oooo2.f2090o00oOooO.get(num);
            if (!this.f2090o00oOooO.containsKey(Integer.valueOf(intValue))) {
                this.f2090o00oOooO.put(Integer.valueOf(intValue), new o00oOOo0());
            }
            o00oOOo0 o00oooo03 = this.f2090o00oOooO.get(Integer.valueOf(intValue));
            o00oOOoO o00ooooo2 = o00oooo03.f2096o00oOooO;
            if (!o00ooooo2.f2152o00oOOoO) {
                o00ooooo2.o00oOOo0(o00oooo02.f2096o00oOooO);
            }
            o00oOo0O o00ooo0o2 = o00oooo03.f2092o00oOOoO;
            if (!o00ooo0o2.f2226o00oOOo0) {
                o00ooo0o2.o00oOOo0(o00oooo02.f2092o00oOOoO);
            }
            C0014o00oOoO c0014o00oOoO = o00oooo03.f2094o00oOo0O;
            if (!c0014o00oOoO.f2243o00oOOo0) {
                c0014o00oOoO.o00oOOo0(o00oooo02.f2094o00oOo0O);
            }
            o00oOo00 o00ooo002 = o00oooo03.f2093o00oOo00;
            if (!o00ooo002.f2219o00oOOo0) {
                o00ooo002.o00oOOo0(o00oooo02.f2093o00oOo00);
            }
            for (String str : o00oooo02.f2095o00oOo0o.keySet()) {
                if (!o00oooo03.f2095o00oOo0o.containsKey(str)) {
                    o00oooo03.f2095o00oOo0o.put(str, o00oooo02.f2095o00oOo0o.get(str));
                }
            }
        }
    }

    public void o0O0O0O(String str) {
        this.f2088o00oOOoO.remove(str);
    }

    public void o0O0O0Oo(int i, float f) {
        o0O000Oo(i).f2092o00oOOoO.f2230o00oOooO = f;
    }

    public void o0O0O0o(int i, int i2) {
        o0O000Oo(i).f2096o00oOooO.f2204o0O000o0 = i2;
    }

    public void o0O0O0o0(int i, boolean z) {
        o0O000Oo(i).f2094o00oOo0O.f2254o00oOooo = z;
    }

    public void o0O0O0oO(int i, String str, int i2) {
        o0O000Oo(i).o00oo0(str, i2);
    }

    public void o0O0O0oo(int i, String str) {
        o0O000Oo(i).f2096o00oOooO.f2163o00oo = str;
    }

    public void o0O0OO(int i, String str, float f) {
        o0O000Oo(i).o00oo0OO(str, f);
    }

    public void o0O0OO0(int i, int i2) {
        o0O000Oo(i).f2096o00oOooO.f2173o00ooO = i2;
    }

    public void o0O0OO0O(int i, float f) {
        o0O000Oo(i).f2094o00oOo0O.f2255o00oo00O = f;
        o0O000Oo(i).f2094o00oOo0O.f2254o00oOooo = true;
    }

    public void o0O0OOO(int i, int i2, int i3) {
        o00oOOo0 o0O000Oo2 = o0O000Oo(i);
        switch (i2) {
            case 1:
                o0O000Oo2.f2096o00oOooO.f2186o00ooo00 = i3;
                return;
            case 2:
                o0O000Oo2.f2096o00oOooO.f2187o00ooo0O = i3;
                return;
            case 3:
                o0O000Oo2.f2096o00oOooO.f2185o00ooo0 = i3;
                return;
            case 4:
                o0O000Oo2.f2096o00oOooO.f2188o00ooo0o = i3;
                return;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                o0O000Oo2.f2096o00oOooO.f2190o00oooOO = i3;
                return;
            case 7:
                o0O000Oo2.f2096o00oOooO.f2189o00oooO = i3;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void o0O0OOO0(boolean z) {
        this.f2089o00oOo00 = z;
    }

    public void o0O0OOOo(int i, int i2) {
        o0O000Oo(i).f2096o00oOooO.f2154o00oOo0O = i2;
        o0O000Oo(i).f2096o00oOooO.f2155o00oOo0o = -1;
        o0O000Oo(i).f2096o00oOooO.f2157o00oOoO0 = -1.0f;
    }

    public void o0O0OOo(int i, int i2) {
        o0O000Oo(i).f2096o00oOooO.f2155o00oOo0o = i2;
        o0O000Oo(i).f2096o00oOooO.f2154o00oOo0O = -1;
        o0O000Oo(i).f2096o00oOooO.f2157o00oOoO0 = -1.0f;
    }

    public void o0O0OOoO(int i, float f) {
        o0O000Oo(i).f2096o00oOooO.f2157o00oOoO0 = f;
        o0O000Oo(i).f2096o00oOooO.f2155o00oOo0o = -1;
        o0O000Oo(i).f2096o00oOooO.f2154o00oOo0O = -1;
    }

    public void o0O0OOoo(int i, float f) {
        o0O000Oo(i).f2096o00oOooO.f2172o00oo0oO = f;
    }

    public void o0O0Oo(int i, int... iArr) {
        o0O000Oo(i).f2096o00oOooO.f2203o0O000o = iArr;
    }

    public void o0O0Oo0(int i, float f) {
        o0O000Oo(i).f2096o00oOooO.f2193o00oooo0 = f;
    }

    public void o0O0Oo0O(int i, String str, int i2) {
        o0O000Oo(i).o00oo0O0(str, i2);
    }

    public void o0O0Oo0o(int i, int i2, int i3) {
        o00oOOo0 o0O000Oo2 = o0O000Oo(i);
        switch (i2) {
            case 1:
                o0O000Oo2.f2096o00oOooO.f2178o00ooOO = i3;
                return;
            case 2:
                o0O000Oo2.f2096o00oOooO.f2180o00ooOOo = i3;
                return;
            case 3:
                o0O000Oo2.f2096o00oOooO.f2182o00ooOo0 = i3;
                return;
            case 4:
                o0O000Oo2.f2096o00oOooO.f2181o00ooOo = i3;
                return;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                o0O000Oo2.f2096o00oOooO.f2184o00ooOoo = i3;
                return;
            case 7:
                o0O000Oo2.f2096o00oOooO.f2183o00ooOoO = i3;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void o0O0OoO(int i, float f) {
        o0O000Oo(i).f2094o00oOo0O.f2246o00oOo0O = f;
    }

    public void o0O0OoO0(int i, float f) {
        o0O000Oo(i).f2094o00oOo0O.f2245o00oOo00 = f;
    }

    public void o0O0OoOo(int i, float f) {
        o0O000Oo(i).f2094o00oOo0O.f2247o00oOo0o = f;
    }

    public void o0O0Ooo(int i, float f, float f2) {
        C0014o00oOoO c0014o00oOoO = o0O000Oo(i).f2094o00oOo0O;
        c0014o00oOoO.f2248o00oOoO = f2;
        c0014o00oOoO.f2249o00oOoO0 = f;
    }

    public void o0O0Ooo0(int i, String str, String str2) {
        o0O000Oo(i).o00oo0O(str, str2);
    }

    public void o0O0OooO(int i, float f) {
        o0O000Oo(i).f2094o00oOo0O.f2249o00oOoO0 = f;
    }

    public void o0O0Oooo(int i, float f) {
        o0O000Oo(i).f2094o00oOo0O.f2244o00oOOoO = f;
    }

    public void o0O0o(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        o00oOoO o00oooo2;
        int i7;
        int i8;
        int i9;
        if (i2 == 0) {
            i8 = 0;
            i3 = 3;
            i4 = 0;
            i9 = 0;
            i5 = 4;
            i6 = 0;
            f = 0.5f;
            o00oooo2 = this;
            i7 = i;
        } else {
            i3 = 4;
            i4 = 0;
            i5 = 3;
            i6 = 0;
            f = 0.5f;
            o00oooo2 = this;
            i7 = i;
            i8 = i2;
            i9 = i2;
        }
        o00oooo2.o00oo0O(i7, i8, i3, i4, i9, i5, i6, f);
    }

    public void o0O0o0(int i, float f) {
        o0O000Oo(i).f2094o00oOo0O.f2252o00oOoo0 = f;
    }

    public void o0O0o00(int i, float f, float f2) {
        C0014o00oOoO c0014o00oOoO = o0O000Oo(i).f2094o00oOo0O;
        c0014o00oOoO.f2250o00oOoOO = f;
        c0014o00oOoO.f2251o00oOoOo = f2;
    }

    public void o0O0o000(int i, float f) {
        o0O000Oo(i).f2094o00oOo0O.f2248o00oOoO = f;
    }

    public void o0O0o00O(int i, float f) {
        o0O000Oo(i).f2094o00oOo0O.f2250o00oOoOO = f;
    }

    public void o0O0o00o(int i, float f) {
        o0O000Oo(i).f2094o00oOo0O.f2251o00oOoOo = f;
    }

    public void o0O0o0O(boolean z) {
        this.f2087o00oOOo0 = z;
    }

    public void o0O0o0OO(int i, float f) {
        o0O000Oo(i).f2096o00oOooO.f2207o0O0o = f;
    }

    public void o0O0o0Oo(int i, int i2) {
        o0O000Oo(i).f2096o00oOooO.f2194o00ooooO = i2;
    }

    public void o0O0o0o(int i, int i2) {
        o0O000Oo(i).f2092o00oOOoO.f2227o00oOOoO = i2;
    }

    public void o0O0o0o0(int i, float f) {
        o0O000Oo(i).f2096o00oOooO.f2191o00oooOo = f;
    }

    public final String o0O0o0oO(int i) {
        switch (i) {
            case 1:
                return TtmlNode.LEFT;
            case 2:
                return TtmlNode.RIGHT;
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return TtmlNode.START;
            case 7:
                return TtmlNode.END;
            default:
                return AdError.UNDEFINED_DOMAIN;
        }
    }

    public void o0O0oo0o(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        o00oOoO o00oooo2;
        int i6;
        if (this.f2090o00oOooO.containsKey(Integer.valueOf(i))) {
            o00oOOoO o00ooooo2 = this.f2090o00oOooO.get(Integer.valueOf(i)).f2096o00oOooO;
            int i7 = o00ooooo2.f2165o00oo00O;
            int i8 = o00ooooo2.f2164o00oo0;
            if (i7 != -1 || i8 != -1) {
                if (i7 != -1 && i8 != -1) {
                    i5 = 0;
                    o00oooo2 = this;
                    o00oooo2.o00ooOOo(i7, 4, i8, 3, 0);
                    i3 = 3;
                    i4 = 4;
                    i6 = i8;
                    i2 = i7;
                } else if (i7 != -1 || i8 != -1) {
                    i2 = o00ooooo2.f2168o00oo0OO;
                    if (i2 != -1) {
                        i3 = 4;
                        i4 = 4;
                        i5 = 0;
                        o00oooo2 = this;
                        i6 = i7;
                    } else {
                        i2 = o00ooooo2.f2162o00oOooo;
                        if (i2 != -1) {
                            i3 = 3;
                            i4 = 3;
                            i5 = 0;
                            o00oooo2 = this;
                            i6 = i8;
                        }
                    }
                }
                o00oooo2.o00ooOOo(i6, i3, i2, i4, i5);
            }
        }
        o00ooO0(i, 3);
        o00ooO0(i, 4);
    }

    public int o0OoO00O(int i) {
        return o0O000Oo(i).f2092o00oOOoO.f2227o00oOOoO;
    }

    public boolean o0OoOoOO(int i) {
        return o0O000Oo(i).f2094o00oOo0O.f2254o00oOooo;
    }

    public final o00oOOo0 o0OoOoOo(Context context, AttributeSet attributeSet) {
        o00oOOo0 o00oooo02 = new o00oOOo0();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Constraint);
        o0O00o0o(context, o00oooo02, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return o00oooo02;
    }

    public void o0OooO0(int i, int i2) {
        o0O000Oo(i).f2096o00oOooO.f2192o00oooo = i2;
    }

    public void o0oO0O0o(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        o00oOoO o00oooo2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        o00oOoO o00oooo3;
        int i12;
        if (this.f2090o00oOooO.containsKey(Integer.valueOf(i))) {
            o00oOOoO o00ooooo2 = this.f2090o00oOooO.get(Integer.valueOf(i)).f2096o00oOooO;
            int i13 = o00ooooo2.f2158o00oOoOO;
            int i14 = o00ooooo2.f2159o00oOoOo;
            if (i13 == -1 && i14 == -1) {
                int i15 = o00ooooo2.f2166o00oo0O;
                int i16 = o00ooooo2.f2171o00oo0o0;
                if (i15 != -1 || i16 != -1) {
                    if (i15 != -1 && i16 != -1) {
                        i11 = 0;
                        o00oooo3 = this;
                        o00oooo3.o00ooOOo(i15, 7, i16, 6, 0);
                        i9 = 6;
                        i10 = 7;
                        i12 = i16;
                        i8 = i13;
                    } else if (i13 != -1 || i16 != -1) {
                        i8 = o00ooooo2.f2160o00oOoo0;
                        if (i8 != -1) {
                            i9 = 7;
                            i10 = 7;
                            i11 = 0;
                            o00oooo3 = this;
                            i12 = i13;
                        } else {
                            i8 = o00ooooo2.f2156o00oOoO;
                            if (i8 != -1) {
                                i9 = 6;
                                i10 = 6;
                                i11 = 0;
                                o00oooo3 = this;
                                i12 = i16;
                            }
                        }
                    }
                    o00oooo3.o00ooOOo(i12, i9, i8, i10, i11);
                }
                o00ooO0(i, 6);
                i7 = 7;
            } else {
                if (i13 == -1 || i14 == -1) {
                    if (i13 != -1 || i14 != -1) {
                        i2 = o00ooooo2.f2160o00oOoo0;
                        if (i2 != -1) {
                            i3 = 2;
                            i4 = 2;
                            i5 = 0;
                            o00oooo2 = this;
                            i6 = i13;
                        } else {
                            i2 = o00ooooo2.f2156o00oOoO;
                            if (i2 != -1) {
                                i3 = 1;
                                i4 = 1;
                                i5 = 0;
                                o00oooo2 = this;
                                i6 = i14;
                            }
                        }
                    }
                    o00ooO0(i, 1);
                    i7 = 2;
                } else {
                    i5 = 0;
                    o00oooo2 = this;
                    o00oooo2.o00ooOOo(i13, 2, i14, 1, 0);
                    i3 = 1;
                    i4 = 2;
                    i6 = i14;
                    i2 = i13;
                }
                o00oooo2.o00ooOOo(i6, i3, i2, i4, i5);
                o00ooO0(i, 1);
                i7 = 2;
            }
            o00ooO0(i, i7);
        }
    }

    public void o0oOo0O0(int i, int i2) {
        o0O000Oo(i).f2092o00oOOoO.f2228o00oOo00 = i2;
    }

    public void o0ooO(int i, int i2) {
        o0O000Oo(i).f2096o00oOooO.f2177o00ooO0o = i2;
    }

    public int o0ooOoOO(int i) {
        return o0O000Oo(i).f2096o00oOooO.f2161o00oOooO;
    }

    public void oo0OOoo(int i, float f) {
        o0O000Oo(i).f2094o00oOo0O.f2253o00oOooO = f;
    }
}
