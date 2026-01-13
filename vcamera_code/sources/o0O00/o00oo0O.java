package o0O00;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo$TouchDelegateInfo;
import androidx.core.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0O0o00O;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.o0OoOoO;
import o00oOooO.oo0oO0;
import o0O00.o00ooO;
import o0O000.o00oOOo0;
/* loaded from: classes.dex */
public class o00oo0O {

    /* renamed from: o0  reason: collision with root package name */
    public static final String f9971o0 = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f9972o00oOo0O = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY";

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final String f9973o00oOo0o = "androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY";

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final String f9974o00oOoO = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final String f9975o00oOoO0 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY";

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final String f9976o00oOoOO = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY";

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final String f9977o00oOoOo = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY";

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final String f9978o00oOoo0 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY";

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f9979o00oOooO = "AccessibilityNodeInfo.roleDescription";

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final String f9980o00oOooo = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY";

    /* renamed from: o00oo  reason: collision with root package name */
    public static final int f9981o00oo = 8;

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final String f9982o00oo0 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY";

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final String f9983o00oo00O = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY";

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final int f9984o00oo0O = 2;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final int f9985o00oo0O0 = 1;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final String f9986o00oo0OO = "androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY";

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final int f9987o00oo0Oo = 4;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final int f9988o00oo0o = 1;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final int f9989o00oo0o0 = 8;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final int f9990o00oo0oO = 2;

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final int f9991o00ooO = 256;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final int f9992o00ooO0 = 32;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final int f9993o00ooO00 = 16;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final int f9994o00ooO0O = 64;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final int f9995o00ooO0o = 128;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final int f9996o00ooOO = 1024;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final int f9997o00ooOO0 = 512;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public static final int f9998o00ooOOo = 2048;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public static final int f9999o00ooOo = 8192;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public static final int f10000o00ooOo0 = 4096;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public static final int f10001o00ooOoO = 16384;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public static final int f10002o00ooOoo = 32768;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public static final int f10003o00ooo0 = 131072;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public static final int f10004o00ooo00 = 65536;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public static final int f10005o00ooo0O = 262144;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public static final int f10006o00ooo0o = 524288;

    /* renamed from: o00oooO  reason: collision with root package name */
    public static final int f10007o00oooO = 1048576;

    /* renamed from: o00oooOO  reason: collision with root package name */
    public static final int f10008o00oooOO = 2097152;

    /* renamed from: o00oooOo  reason: collision with root package name */
    public static final String f10009o00oooOo = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";

    /* renamed from: o00oooo  reason: collision with root package name */
    public static final String f10010o00oooo = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";

    /* renamed from: o00oooo0  reason: collision with root package name */
    public static final String f10011o00oooo0 = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";

    /* renamed from: o00ooooO  reason: collision with root package name */
    public static final String f10012o00ooooO = "ACTION_ARGUMENT_SELECTION_START_INT";

    /* renamed from: o00ooooo  reason: collision with root package name */
    public static final String f10013o00ooooo = "ACTION_ARGUMENT_SELECTION_END_INT";

    /* renamed from: o0O00  reason: collision with root package name */
    public static final int f10014o0O00 = 16;

    /* renamed from: o0O000  reason: collision with root package name */
    public static final String f10015o0O000 = "ACTION_ARGUMENT_MOVE_WINDOW_X";

    /* renamed from: o0O00000  reason: collision with root package name */
    public static final String f10016o0O00000 = "android.view.accessibility.action.ARGUMENT_ROW_INT";

    /* renamed from: o0O0000O  reason: collision with root package name */
    public static final String f10017o0O0000O = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";

    /* renamed from: o0O0000o  reason: collision with root package name */
    public static final String f10018o0O0000o = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE";

    /* renamed from: o0O000O  reason: collision with root package name */
    public static final String f10019o0O000O = "ACTION_ARGUMENT_MOVE_WINDOW_Y";

    /* renamed from: o0O000Oo  reason: collision with root package name */
    public static final int f10020o0O000Oo = 1;

    /* renamed from: o0O000o  reason: collision with root package name */
    public static final int f10021o0O000o = 2;

    /* renamed from: o0O000o0  reason: collision with root package name */
    public static final int f10022o0O000o0 = 1;

    /* renamed from: o0O000oo  reason: collision with root package name */
    public static final int f10023o0O000oo = 8;

    /* renamed from: o0O00O  reason: collision with root package name */
    public static final int f10024o0O00O = 20000;

    /* renamed from: o0O00O0  reason: collision with root package name */
    public static final String f10025o0O00O0 = "android.core.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY";

    /* renamed from: o0O00O0o  reason: collision with root package name */
    public static final String f10026o0O00O0o = "android.core.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH";

    /* renamed from: o0O00OO  reason: collision with root package name */
    public static int f10027o0O00OO = 0;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final int f10028o0O0o = 4;

    /* renamed from: o0OoO00O  reason: collision with root package name */
    public static final String f10029o0OoO00O = "android.core.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX";

    /* renamed from: o0OoOoOO  reason: collision with root package name */
    public static final int f10030o0OoOoOO = 2;
    @SuppressLint({"ActionValue"})

    /* renamed from: o0OoOoOo  reason: collision with root package name */
    public static final String f10031o0OoOoOo = "android.view.accessibility.action.ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT";

    /* renamed from: o0ooOoOO  reason: collision with root package name */
    public static final int f10032o0ooOoOO = 4;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final AccessibilityNodeInfo f10033o00oOOo0;
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f10034o00oOOoO = -1;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f10035o00oOo00 = -1;

    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @oo0oO0

        /* renamed from: o0  reason: collision with root package name */
        public static final o00oOOo0 f10036o0;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static final String f10037o00oOo0O = "A11yActionCompat";

        /* renamed from: o00ooO  reason: collision with root package name */
        public static final o00oOOo0 f10055o00ooO;

        /* renamed from: o00ooOO  reason: collision with root package name */
        public static final o00oOOo0 f10060o00ooOO;

        /* renamed from: o00ooOO0  reason: collision with root package name */
        public static final o00oOOo0 f10061o00ooOO0;

        /* renamed from: o00ooOOo  reason: collision with root package name */
        public static final o00oOOo0 f10062o00ooOOo;

        /* renamed from: o00ooOo  reason: collision with root package name */
        public static final o00oOOo0 f10063o00ooOo;

        /* renamed from: o00ooOo0  reason: collision with root package name */
        public static final o00oOOo0 f10064o00ooOo0;
        @oo0oO0

        /* renamed from: o00ooOoO  reason: collision with root package name */
        public static final o00oOOo0 f10065o00ooOoO;
        @oo0oO0

        /* renamed from: o00ooOoo  reason: collision with root package name */
        public static final o00oOOo0 f10066o00ooOoo;
        @oo0oO0

        /* renamed from: o00ooo0  reason: collision with root package name */
        public static final o00oOOo0 f10067o00ooo0;
        @oo0oO0

        /* renamed from: o00ooo00  reason: collision with root package name */
        public static final o00oOOo0 f10068o00ooo00;

        /* renamed from: o00ooo0O  reason: collision with root package name */
        public static final o00oOOo0 f10069o00ooo0O;

        /* renamed from: o00ooo0o  reason: collision with root package name */
        public static final o00oOOo0 f10070o00ooo0o;

        /* renamed from: o00oooO  reason: collision with root package name */
        public static final o00oOOo0 f10071o00oooO;

        /* renamed from: o00oooOO  reason: collision with root package name */
        public static final o00oOOo0 f10072o00oooOO;

        /* renamed from: o00oooOo  reason: collision with root package name */
        public static final o00oOOo0 f10073o00oooOo;
        @oo0oO0

        /* renamed from: o00oooo  reason: collision with root package name */
        public static final o00oOOo0 f10074o00oooo;
        @oo0oO0

        /* renamed from: o00oooo0  reason: collision with root package name */
        public static final o00oOOo0 f10075o00oooo0;
        @oo0oO0

        /* renamed from: o00ooooO  reason: collision with root package name */
        public static final o00oOOo0 f10076o00ooooO;
        @oo0oO0

        /* renamed from: o00ooooo  reason: collision with root package name */
        public static final o00oOOo0 f10077o00ooooo;
        @oo0oO0

        /* renamed from: o0O00000  reason: collision with root package name */
        public static final o00oOOo0 f10078o0O00000;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Object f10080o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final int f10081o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final Class<? extends o00ooO.o00oOOo0> f10082o00oOo00;
        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final o00ooO f10083o00oOooO;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public static final o00oOOo0 f10038o00oOo0o = new o00oOOo0(1, null);

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public static final o00oOOo0 f10040o00oOoO0 = new o00oOOo0(2, null);

        /* renamed from: o00oOoO  reason: collision with root package name */
        public static final o00oOOo0 f10039o00oOoO = new o00oOOo0(4, null);

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public static final o00oOOo0 f10041o00oOoOO = new o00oOOo0(8, null);

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public static final o00oOOo0 f10042o00oOoOo = new o00oOOo0(16, null);

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public static final o00oOOo0 f10043o00oOoo0 = new o00oOOo0(32, null);

        /* renamed from: o00oOooo  reason: collision with root package name */
        public static final o00oOOo0 f10044o00oOooo = new o00oOOo0(64, null);

        /* renamed from: o00oo00O  reason: collision with root package name */
        public static final o00oOOo0 f10047o00oo00O = new o00oOOo0(128, null);

        /* renamed from: o00oo0  reason: collision with root package name */
        public static final o00oOOo0 f10046o00oo0 = new o00oOOo0(256, (CharSequence) null, o00ooO.o00oOOoO.class);

        /* renamed from: o00oo0OO  reason: collision with root package name */
        public static final o00oOOo0 f10050o00oo0OO = new o00oOOo0(512, (CharSequence) null, o00ooO.o00oOOoO.class);

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public static final o00oOOo0 f10049o00oo0O0 = new o00oOOo0(1024, (CharSequence) null, o00ooO.o00oOo00.class);

        /* renamed from: o00oo0O  reason: collision with root package name */
        public static final o00oOOo0 f10048o00oo0O = new o00oOOo0(2048, (CharSequence) null, o00ooO.o00oOo00.class);

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public static final o00oOOo0 f10051o00oo0Oo = new o00oOOo0(4096, null);

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public static final o00oOOo0 f10053o00oo0o0 = new o00oOOo0(8192, null);

        /* renamed from: o00oo0o  reason: collision with root package name */
        public static final o00oOOo0 f10052o00oo0o = new o00oOOo0(16384, null);

        /* renamed from: o00oo0oO  reason: collision with root package name */
        public static final o00oOOo0 f10054o00oo0oO = new o00oOOo0(32768, null);

        /* renamed from: o0O0o  reason: collision with root package name */
        public static final o00oOOo0 f10079o0O0o = new o00oOOo0(65536, null);

        /* renamed from: o00oo  reason: collision with root package name */
        public static final o00oOOo0 f10045o00oo = new o00oOOo0(131072, (CharSequence) null, o00ooO.o00oo0.class);

        /* renamed from: o00ooO00  reason: collision with root package name */
        public static final o00oOOo0 f10057o00ooO00 = new o00oOOo0(262144, null);

        /* renamed from: o00ooO0  reason: collision with root package name */
        public static final o00oOOo0 f10056o00ooO0 = new o00oOOo0(524288, null);

        /* renamed from: o00ooO0O  reason: collision with root package name */
        public static final o00oOOo0 f10058o00ooO0O = new o00oOOo0(1048576, null);

        /* renamed from: o00ooO0o  reason: collision with root package name */
        public static final o00oOOo0 f10059o00ooO0o = new o00oOOo0(2097152, (CharSequence) null, o00ooO.o00oo0OO.class);

        static {
            int i = Build.VERSION.SDK_INT;
            f10055o00ooO = new o00oOOo0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null, null);
            f10061o00ooOO0 = new o00oOOo0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, null, o00ooO.o00oOoO.class);
            f10060o00ooOO = new o00oOOo0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);
            f10062o00ooOOo = new o00oOOo0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null, null);
            f10064o00ooOo0 = new o00oOOo0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);
            f10063o00ooOo = new o00oOOo0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null, null);
            f10065o00ooOoO = new o00oOOo0(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, null, null, null);
            f10066o00ooOoo = new o00oOOo0(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, null, null, null);
            f10068o00ooo00 = new o00oOOo0(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, null, null, null);
            f10067o00ooo0 = new o00oOOo0(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, null, null, null);
            f10069o00ooo0O = new o00oOOo0(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null, null);
            f10070o00ooo0o = new o00oOOo0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349, null, null, o00ooO.o00oo00O.class);
            f10071o00oooO = new o00oOOo0(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, 16908354, null, null, o00ooO.o00oOo0O.class);
            f10072o00oooOO = new o00oOOo0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, 16908356, null, null, null);
            f10073o00oooOo = new o00oOOo0(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, 16908357, null, null, null);
            f10075o00oooo0 = new o00oOOo0(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, null, null, null);
            f10074o00oooo = new o00oOOo0(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, 16908372, null, null, null);
            f10076o00ooooO = new o00oOOo0(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, 16908373, null, null, null);
            f10077o00ooooo = new o00oOOo0(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, 16908374, null, null, null);
            f10036o0 = new o00oOOo0(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, 16908375, null, null, null);
            f10078o0O00000 = new o00oOOo0(i >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, 16908376, null, null, null);
        }

        public o00oOOo0(int i, CharSequence charSequence) {
            this(null, i, charSequence, null, null);
        }

        public o00oOOo0(int i, CharSequence charSequence, Class<? extends o00ooO.o00oOOo0> cls) {
            this(null, i, charSequence, null, cls);
        }

        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public o00oOOo0(int i, CharSequence charSequence, o00ooO o00ooo) {
            this(null, i, charSequence, o00ooo, null);
        }

        public o00oOOo0(Object obj) {
            this(obj, 0, null, null, null);
        }

        public o00oOOo0(Object obj, int i, CharSequence charSequence, o00ooO o00ooo, Class<? extends o00ooO.o00oOOo0> cls) {
            this.f10081o00oOOoO = i;
            this.f10083o00oOooO = o00ooo;
            this.f10080o00oOOo0 = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i, charSequence) : obj;
            this.f10082o00oOo00 = cls;
        }

        public boolean equals(@o0OO00OO Object obj) {
            if (obj != null && (obj instanceof o00oOOo0)) {
                Object obj2 = this.f10080o00oOOo0;
                Object obj3 = ((o00oOOo0) obj).f10080o00oOOo0;
                return obj2 == null ? obj3 == null : obj2.equals(obj3);
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.f10080o00oOOo0;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public o00oOOo0 o00oOOo0(CharSequence charSequence, o00ooO o00ooo) {
            return new o00oOOo0(null, this.f10081o00oOOoO, charSequence, o00ooo, this.f10082o00oOo00);
        }

        public int o00oOOoO() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f10080o00oOOo0).getId();
        }

        public CharSequence o00oOo00() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f10080o00oOOo0).getLabel();
        }

        @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public boolean o00oOooO(View view, Bundle bundle) {
            o00ooO.o00oOOo0 newInstance;
            if (this.f10083o00oOooO != null) {
                o00ooO.o00oOOo0 o00oooo02 = null;
                Class<? extends o00ooO.o00oOOo0> cls = this.f10082o00oOo00;
                if (cls != null) {
                    try {
                        newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    } catch (Exception unused) {
                    }
                    try {
                        newInstance.o00oOOo0(bundle);
                        o00oooo02 = newInstance;
                    } catch (Exception unused2) {
                        o00oooo02 = newInstance;
                        Class<? extends o00ooO.o00oOOo0> cls2 = this.f10082o00oOo00;
                        if (cls2 != null) {
                            cls2.getName();
                        }
                        return this.f10083o00oOooO.perform(view, o00oooo02);
                    }
                }
                return this.f10083o00oOooO.perform(view, o00oooo02);
            }
            return false;
        }
    }

    @o0OOooO0(33)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o0O0O0Oo
        public static AccessibilityNodeInfo.ExtraRenderingInfo o00oOOo0(AccessibilityNodeInfo accessibilityNodeInfo) {
            AccessibilityNodeInfo.ExtraRenderingInfo extraRenderingInfo;
            extraRenderingInfo = accessibilityNodeInfo.getExtraRenderingInfo();
            return extraRenderingInfo;
        }

        @o0O0O0Oo
        public static boolean o00oOOoO(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }

        @o0O0O0Oo
        public static void o00oOo00(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setTextSelectable(z);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 {

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final int f10084o00oOOoO = 0;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final int f10085o00oOo00 = 1;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final int f10086o00oOooO = 2;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Object f10087o00oOOo0;

        public o00oOo00(Object obj) {
            this.f10087o00oOOo0 = obj;
        }

        public static o00oOo00 o00oOo0O(int i, int i2, boolean z) {
            return new o00oOo00(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
        }

        public static o00oOo00 o00oOo0o(int i, int i2, boolean z, int i3) {
            return new o00oOo00(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
        }

        public int o00oOOo0() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f10087o00oOOo0).getColumnCount();
        }

        public int o00oOOoO() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f10087o00oOOo0).getRowCount();
        }

        public int o00oOo00() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f10087o00oOOo0).getSelectionMode();
        }

        public boolean o00oOooO() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f10087o00oOOo0).isHierarchical();
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo0O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Object f10088o00oOOo0;

        public o00oOo0O(Object obj) {
            this.f10088o00oOOo0 = obj;
        }

        public static o00oOo0O o00oOoO(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new o00oOo0O(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }

        public static o00oOo0O o00oOoO0(int i, int i2, int i3, int i4, boolean z) {
            return new o00oOo0O(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z));
        }

        public int o00oOOo0() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f10088o00oOOo0).getColumnIndex();
        }

        public int o00oOOoO() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f10088o00oOOo0).getColumnSpan();
        }

        public int o00oOo00() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f10088o00oOOo0).getRowIndex();
        }

        @Deprecated
        public boolean o00oOo0O() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f10088o00oOOo0).isHeading();
        }

        public boolean o00oOo0o() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f10088o00oOOo0).isSelected();
        }

        public int o00oOooO() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f10088o00oOOo0).getRowSpan();
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOoO {

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final int f10089o00oOOoO = 0;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final int f10090o00oOo00 = 1;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final int f10091o00oOooO = 2;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Object f10092o00oOOo0;

        public o00oOoO(Object obj) {
            this.f10092o00oOOo0 = obj;
        }

        public static o00oOoO o00oOo0O(int i, float f, float f2, float f3) {
            return new o00oOoO(AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3));
        }

        public float o00oOOo0() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f10092o00oOOo0).getCurrent();
        }

        public float o00oOOoO() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f10092o00oOOo0).getMax();
        }

        public float o00oOo00() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f10092o00oOOo0).getMin();
        }

        public int o00oOooO() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f10092o00oOOo0).getType();
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oo00O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final AccessibilityNodeInfo$TouchDelegateInfo f10093o00oOOo0;

        public o00oo00O(@oo0oO0 AccessibilityNodeInfo$TouchDelegateInfo accessibilityNodeInfo$TouchDelegateInfo) {
            this.f10093o00oOOo0 = accessibilityNodeInfo$TouchDelegateInfo;
        }

        public o00oo00O(@oo0oO0 Map<Region, View> map) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f10093o00oOOo0 = new AccessibilityNodeInfo$TouchDelegateInfo(map);
            } else {
                this.f10093o00oOOo0 = null;
            }
        }

        @o0OO00OO
        public Region o00oOOo0(@o0O0o00O(from = 0) int i) {
            if (Build.VERSION.SDK_INT >= 29) {
                return this.f10093o00oOOo0.getRegionAt(i);
            }
            return null;
        }

        @o0O0o00O(from = 0)
        public int o00oOOoO() {
            if (Build.VERSION.SDK_INT >= 29) {
                return this.f10093o00oOOo0.getRegionCount();
            }
            return 0;
        }

        @o0OO00OO
        public o00oo0O o00oOo00(@oo0oO0 Region region) {
            AccessibilityNodeInfo targetForRegion;
            if (Build.VERSION.SDK_INT < 29 || (targetForRegion = this.f10093o00oOOo0.getTargetForRegion(region)) == null) {
                return null;
            }
            return o00oo0O.o0OO0Ooo(targetForRegion);
        }
    }

    public o00oo0O(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f10033o00oOOo0 = accessibilityNodeInfo;
    }

    @Deprecated
    public o00oo0O(Object obj) {
        this.f10033o00oOOo0 = (AccessibilityNodeInfo) obj;
    }

    public static String o00oo0OO(int i) {
        if (i != 1) {
            if (i != 2) {
                switch (i) {
                    case 4:
                        return "ACTION_SELECT";
                    case 8:
                        return "ACTION_CLEAR_SELECTION";
                    case 16:
                        return "ACTION_CLICK";
                    case 32:
                        return "ACTION_LONG_CLICK";
                    case 64:
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    case 128:
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    case 256:
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    case 512:
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    case 1024:
                        return "ACTION_NEXT_HTML_ELEMENT";
                    case 2048:
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    case 4096:
                        return "ACTION_SCROLL_FORWARD";
                    case 8192:
                        return "ACTION_SCROLL_BACKWARD";
                    case 16384:
                        return "ACTION_COPY";
                    case 32768:
                        return "ACTION_PASTE";
                    case 65536:
                        return "ACTION_CUT";
                    case 131072:
                        return "ACTION_SET_SELECTION";
                    case 262144:
                        return "ACTION_EXPAND";
                    case 524288:
                        return "ACTION_COLLAPSE";
                    case 2097152:
                        return "ACTION_SET_TEXT";
                    case 16908354:
                        return "ACTION_MOVE_WINDOW";
                    default:
                        switch (i) {
                            case 16908342:
                                return "ACTION_SHOW_ON_SCREEN";
                            case 16908343:
                                return "ACTION_SCROLL_TO_POSITION";
                            case 16908344:
                                return "ACTION_SCROLL_UP";
                            case 16908345:
                                return "ACTION_SCROLL_LEFT";
                            case 16908346:
                                return "ACTION_SCROLL_DOWN";
                            case 16908347:
                                return "ACTION_SCROLL_RIGHT";
                            case 16908348:
                                return "ACTION_CONTEXT_CLICK";
                            case 16908349:
                                return "ACTION_SET_PROGRESS";
                            default:
                                switch (i) {
                                    case 16908356:
                                        return "ACTION_SHOW_TOOLTIP";
                                    case 16908357:
                                        return "ACTION_HIDE_TOOLTIP";
                                    case 16908358:
                                        return "ACTION_PAGE_UP";
                                    case 16908359:
                                        return "ACTION_PAGE_DOWN";
                                    case 16908360:
                                        return "ACTION_PAGE_LEFT";
                                    case 16908361:
                                        return "ACTION_PAGE_RIGHT";
                                    case 16908362:
                                        return "ACTION_PRESS_AND_HOLD";
                                    default:
                                        switch (i) {
                                            case 16908372:
                                                return "ACTION_IME_ENTER";
                                            case 16908373:
                                                return "ACTION_DRAG_START";
                                            case 16908374:
                                                return "ACTION_DRAG_DROP";
                                            case 16908375:
                                                return "ACTION_DRAG_CANCEL";
                                            default:
                                                return "ACTION_UNKNOWN";
                                        }
                                }
                        }
                }
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public static ClickableSpan[] o00ooO00(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public static o00oo0O o0O0OO(o00oo0O o00oo0o2) {
        return new o00oo0O(AccessibilityNodeInfo.obtain(o00oo0o2.f10033o00oOOo0));
    }

    public static o00oo0O o0O0OO0(View view) {
        return new o00oo0O(AccessibilityNodeInfo.obtain(view));
    }

    public static o00oo0O o0O0OO0O(View view, int i) {
        return o0OO0o00(AccessibilityNodeInfo.obtain(view, i));
    }

    public static o00oo0O o0OO0Ooo(@oo0oO0 AccessibilityNodeInfo accessibilityNodeInfo) {
        return new o00oo0O(accessibilityNodeInfo);
    }

    public static o00oo0O o0OO0o00(Object obj) {
        if (obj != null) {
            return new o00oo0O(obj);
        }
        return null;
    }

    public static o00oo0O o0ooO() {
        return new o00oo0O(AccessibilityNodeInfo.obtain());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof o00oo0O)) {
            o00oo0O o00oo0o2 = (o00oo0O) obj;
            AccessibilityNodeInfo accessibilityNodeInfo = this.f10033o00oOOo0;
            if (accessibilityNodeInfo == null) {
                if (o00oo0o2.f10033o00oOOo0 != null) {
                    return false;
                }
            } else if (!accessibilityNodeInfo.equals(o00oo0o2.f10033o00oOOo0)) {
                return false;
            }
            return this.f10035o00oOo00 == o00oo0o2.f10035o00oOo00 && this.f10034o00oOOoO == o00oo0o2.f10034o00oOOoO;
        }
        return false;
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f10033o00oOOo0;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    @o0OO00OO
    public CharSequence o0() {
        CharSequence stateDescription;
        if (o0O000.o00oOOo0.o00oOoO()) {
            stateDescription = this.f10033o00oOOo0.getStateDescription();
            return stateDescription;
        }
        return this.f10033o00oOOo0.getExtras().getCharSequence(f9982o00oo0);
    }

    public void o00oOOo0(int i) {
        this.f10033o00oOOo0.addAction(i);
    }

    public void o00oOOoO(o00oOOo0 o00oooo02) {
        this.f10033o00oOOo0.addAction((AccessibilityNodeInfo.AccessibilityAction) o00oooo02.f10080o00oOOo0);
    }

    public void o00oOo00(View view) {
        this.f10033o00oOOo0.addChild(view);
    }

    public final void o00oOo0O(ClickableSpan clickableSpan, Spanned spanned, int i) {
        o00oOoOO(f9977o00oOoOo).add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        o00oOoOO(f9978o00oOoo0).add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        o00oOoOO(f9980o00oOooo).add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        o00oOoOO(f9976o00oOoOO).add(Integer.valueOf(i));
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void o00oOo0o(CharSequence charSequence, View view) {
    }

    public final void o00oOoO() {
        this.f10033o00oOOo0.getExtras().remove(f9977o00oOoOo);
        this.f10033o00oOOo0.getExtras().remove(f9978o00oOoo0);
        this.f10033o00oOOo0.getExtras().remove(f9980o00oOooo);
        this.f10033o00oOOo0.getExtras().remove(f9976o00oOoOO);
    }

    public boolean o00oOoO0() {
        return this.f10033o00oOOo0.canOpenPopup();
    }

    public final List<Integer> o00oOoOO(String str) {
        ArrayList<Integer> integerArrayList = this.f10033o00oOOo0.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            this.f10033o00oOOo0.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    public List<o00oo0O> o00oOoOo(String str) {
        ArrayList arrayList = new ArrayList();
        List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText = this.f10033o00oOOo0.findAccessibilityNodeInfosByText(str);
        int size = findAccessibilityNodeInfosByText.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new o00oo0O(findAccessibilityNodeInfosByText.get(i)));
        }
        return arrayList;
    }

    public List<o00oo0O> o00oOoo0(String str) {
        List<AccessibilityNodeInfo> findAccessibilityNodeInfosByViewId = this.f10033o00oOOo0.findAccessibilityNodeInfosByViewId(str);
        ArrayList arrayList = new ArrayList();
        for (AccessibilityNodeInfo accessibilityNodeInfo : findAccessibilityNodeInfosByViewId) {
            arrayList.add(new o00oo0O(accessibilityNodeInfo));
        }
        return arrayList;
    }

    public void o00oOooO(View view, int i) {
        this.f10033o00oOOo0.addChild(view, i);
    }

    public o00oo0O o00oOooo(int i) {
        return o0OO0o00(this.f10033o00oOOo0.findFocus(i));
    }

    public CharSequence o00oo() {
        return this.f10033o00oOOo0.getClassName();
    }

    public List<o00oOOo0> o00oo0() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f10033o00oOOo0.getActionList();
        if (actionList != null) {
            ArrayList arrayList = new ArrayList();
            int size = actionList.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(new o00oOOo0(actionList.get(i)));
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public o00oo0O o00oo00O(int i) {
        return o0OO0o00(this.f10033o00oOOo0.focusSearch(i));
    }

    @oo0oO0
    public List<String> o00oo0O() {
        return this.f10033o00oOOo0.getAvailableExtraData();
    }

    @Deprecated
    public int o00oo0O0() {
        return this.f10033o00oOOo0.getActions();
    }

    public final boolean o00oo0Oo(int i) {
        Bundle o00ooOOo2 = o00ooOOo();
        return o00ooOOo2 != null && (o00ooOOo2.getInt(f9974o00oOoO, 0) & i) == i;
    }

    public void o00oo0o(Rect rect) {
        this.f10033o00oOOo0.getBoundsInScreen(rect);
    }

    @Deprecated
    public void o00oo0o0(Rect rect) {
        this.f10033o00oOOo0.getBoundsInParent(rect);
    }

    public o00oo0O o00oo0oO(int i) {
        return o0OO0o00(this.f10033o00oOOo0.getChild(i));
    }

    public int o00ooO() {
        return this.f10033o00oOOo0.getDrawingOrder();
    }

    public o00oOo00 o00ooO0() {
        AccessibilityNodeInfo.CollectionInfo collectionInfo = this.f10033o00oOOo0.getCollectionInfo();
        if (collectionInfo != null) {
            return new o00oOo00(collectionInfo);
        }
        return null;
    }

    public o00oOo0O o00ooO0O() {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = this.f10033o00oOOo0.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            return new o00oOo0O(collectionItemInfo);
        }
        return null;
    }

    public CharSequence o00ooO0o() {
        return this.f10033o00oOOo0.getContentDescription();
    }

    @o0OO00OO
    public AccessibilityNodeInfo.ExtraRenderingInfo o00ooOO() {
        if (Build.VERSION.SDK_INT >= 33) {
            return o00oOOoO.o00oOOo0(this.f10033o00oOOo0);
        }
        return null;
    }

    public CharSequence o00ooOO0() {
        return this.f10033o00oOOo0.getError();
    }

    public Bundle o00ooOOo() {
        return this.f10033o00oOOo0.getExtras();
    }

    @Deprecated
    public Object o00ooOo() {
        return this.f10033o00oOOo0;
    }

    @o0OO00OO
    public CharSequence o00ooOo0() {
        return this.f10033o00oOOo0.getHintText();
    }

    public int o00ooOoO() {
        return this.f10033o00oOOo0.getInputType();
    }

    public o00oo0O o00ooOoo() {
        return o0OO0o00(this.f10033o00oOOo0.getLabelFor());
    }

    public int o00ooo0() {
        return this.f10033o00oOOo0.getLiveRegion();
    }

    public o00oo0O o00ooo00() {
        return o0OO0o00(this.f10033o00oOOo0.getLabeledBy());
    }

    public int o00ooo0O() {
        return this.f10033o00oOOo0.getMaxTextLength();
    }

    public int o00ooo0o() {
        return this.f10033o00oOOo0.getMovementGranularities();
    }

    public final SparseArray<WeakReference<ClickableSpan>> o00oooO(View view) {
        SparseArray<WeakReference<ClickableSpan>> o00ooooo2 = o00ooooo(view);
        if (o00ooooo2 == null) {
            SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
            view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray);
            return sparseArray;
        }
        return o00ooooo2;
    }

    public CharSequence o00oooOO() {
        return this.f10033o00oOOo0.getPackageName();
    }

    @o0OO00OO
    public CharSequence o00oooOo() {
        return this.f10033o00oOOo0.getPaneTitle();
    }

    public o00oOoO o00oooo() {
        AccessibilityNodeInfo.RangeInfo rangeInfo = this.f10033o00oOOo0.getRangeInfo();
        if (rangeInfo != null) {
            return new o00oOoO(rangeInfo);
        }
        return null;
    }

    public o00oo0O o00oooo0() {
        return o0OO0o00(this.f10033o00oOOo0.getParent());
    }

    @o0OO00OO
    public CharSequence o00ooooO() {
        return this.f10033o00oOOo0.getExtras().getCharSequence(f9979o00oOooO);
    }

    public final SparseArray<WeakReference<ClickableSpan>> o00ooooo(View view) {
        return (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
    }

    public void o0O(View view, int i) {
        this.f10035o00oOo00 = i;
        this.f10033o00oOOo0.setSource(view, i);
    }

    public final int o0O00(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals(sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f10027o0O00OO;
        f10027o0O00OO = i2 + 1;
        return i2;
    }

    @o0OO00OO
    public CharSequence o0O000() {
        return this.f10033o00oOOo0.getTooltipText();
    }

    public CharSequence o0O00000() {
        if (o0O000oo()) {
            List<Integer> o00oOoOO2 = o00oOoOO(f9977o00oOoOo);
            List<Integer> o00oOoOO3 = o00oOoOO(f9978o00oOoo0);
            List<Integer> o00oOoOO4 = o00oOoOO(f9980o00oOooo);
            List<Integer> o00oOoOO5 = o00oOoOO(f9976o00oOoOO);
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.f10033o00oOOo0.getText(), 0, this.f10033o00oOOo0.getText().length()));
            for (int i = 0; i < o00oOoOO2.size(); i++) {
                spannableString.setSpan(new o0O00.o00oOOo0(o00oOoOO5.get(i).intValue(), this, o00ooOOo().getInt(f9983o00oo00O)), o00oOoOO2.get(i).intValue(), o00oOoOO3.get(i).intValue(), o00oOoOO4.get(i).intValue());
            }
            return spannableString;
        }
        return this.f10033o00oOOo0.getText();
    }

    public int o0O0000O() {
        return this.f10033o00oOOo0.getTextSelectionEnd();
    }

    public int o0O0000o() {
        return this.f10033o00oOOo0.getTextSelectionStart();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
        r0 = r2.f10033o00oOOo0.getTouchDelegateInfo();
     */
    @o00oOooO.o0OO00OO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o0O00.o00oo0O.o00oo00O o0O000O() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L14
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.f10033o00oOOo0
            android.view.accessibility.AccessibilityNodeInfo$TouchDelegateInfo r0 = o0O00.o00oOoO.o00oOOo0(r0)
            if (r0 == 0) goto L14
            o0O00.o00oo0O$o00oo00O r1 = new o0O00.o00oo0O$o00oo00O
            r1.<init>(r0)
            return r1
        L14:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o0O00.o00oo0O.o0O000O():o0O00.o00oo0O$o00oo00O");
    }

    public o00oo0O o0O000Oo() {
        return o0OO0o00(this.f10033o00oOOo0.getTraversalBefore());
    }

    public o0 o0O000o() {
        return o0.o0O0o(this.f10033o00oOOo0.getWindow());
    }

    public String o0O000o0() {
        return this.f10033o00oOOo0.getViewIdResourceName();
    }

    public final boolean o0O000oo() {
        return !o00oOoOO(f9977o00oOoOo).isEmpty();
    }

    public boolean o0O00O() {
        return this.f10033o00oOOo0.isClickable();
    }

    public boolean o0O00O0() {
        return this.f10033o00oOOo0.isAccessibilityFocused();
    }

    public boolean o0O00O0o() {
        return this.f10033o00oOOo0.isChecked();
    }

    public boolean o0O00OO() {
        return this.f10033o00oOOo0.isContentInvalid();
    }

    public boolean o0O00OOO() {
        return this.f10033o00oOOo0.isContextClickable();
    }

    public boolean o0O00Oo() {
        return this.f10033o00oOOo0.isDismissable();
    }

    public boolean o0O00OoO() {
        return this.f10033o00oOOo0.isEnabled();
    }

    public boolean o0O00Ooo() {
        return this.f10033o00oOOo0.isFocusable();
    }

    public boolean o0O00o() {
        return this.f10033o00oOOo0.isLongClickable();
    }

    public boolean o0O00o00() {
        return this.f10033o00oOOo0.isFocused();
    }

    public boolean o0O00o0O() {
        return this.f10033o00oOOo0.isHeading();
    }

    public boolean o0O00o0o() {
        return this.f10033o00oOOo0.isImportantForAccessibility();
    }

    public boolean o0O00oO0() {
        return this.f10033o00oOOo0.isMultiLine();
    }

    public boolean o0O0O0O() {
        return this.f10033o00oOOo0.isPassword();
    }

    public boolean o0O0O0Oo() {
        return this.f10033o00oOOo0.isSelected();
    }

    public boolean o0O0O0o() {
        boolean isTextEntryKey;
        if (Build.VERSION.SDK_INT >= 29) {
            isTextEntryKey = this.f10033o00oOOo0.isTextEntryKey();
            return isTextEntryKey;
        }
        return o00oo0Oo(8);
    }

    public boolean o0O0O0o0() {
        return this.f10033o00oOOo0.isShowingHintText();
    }

    public boolean o0O0O0oO() {
        if (Build.VERSION.SDK_INT >= 33) {
            return o00oOOoO.o00oOOoO(this.f10033o00oOOo0);
        }
        return false;
    }

    public boolean o0O0O0oo() {
        return this.f10033o00oOOo0.isVisibleToUser();
    }

    public boolean o0O0OOO(int i, Bundle bundle) {
        return this.f10033o00oOOo0.performAction(i, bundle);
    }

    public boolean o0O0OOO0(int i) {
        return this.f10033o00oOOo0.performAction(i);
    }

    public void o0O0OOOo() {
        this.f10033o00oOOo0.recycle();
    }

    public boolean o0O0OOo() {
        return this.f10033o00oOOo0.refresh();
    }

    public boolean o0O0OOoO(o00oOOo0 o00oooo02) {
        return this.f10033o00oOOo0.removeAction((AccessibilityNodeInfo.AccessibilityAction) o00oooo02.f10080o00oOOo0);
    }

    public boolean o0O0OOoo(View view) {
        return this.f10033o00oOOo0.removeChild(view);
    }

    public final void o0O0Oo(int i, boolean z) {
        Bundle o00ooOOo2 = o00ooOOo();
        if (o00ooOOo2 != null) {
            int i2 = o00ooOOo2.getInt(f9974o00oOoO, 0) & (~i);
            if (!z) {
                i = 0;
            }
            o00ooOOo2.putInt(f9974o00oOoO, i | i2);
        }
    }

    public final void o0O0Oo0(View view) {
        SparseArray<WeakReference<ClickableSpan>> o00ooooo2 = o00ooooo(view);
        if (o00ooooo2 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < o00ooooo2.size(); i++) {
                if (o00ooooo2.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                o00ooooo2.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    public void o0O0Oo0O(boolean z) {
        this.f10033o00oOOo0.setAccessibilityFocused(z);
    }

    public void o0O0Oo0o(@oo0oO0 List<String> list) {
        this.f10033o00oOOo0.setAvailableExtraData(list);
    }

    public void o0O0OoO(boolean z) {
        this.f10033o00oOOo0.setCheckable(z);
    }

    public void o0O0OoO0(Rect rect) {
        this.f10033o00oOOo0.setBoundsInScreen(rect);
    }

    public void o0O0OoOo(boolean z) {
        this.f10033o00oOOo0.setChecked(z);
    }

    public void o0O0Ooo(boolean z) {
        this.f10033o00oOOo0.setClickable(z);
    }

    public void o0O0Ooo0(CharSequence charSequence) {
        this.f10033o00oOOo0.setClassName(charSequence);
    }

    public void o0O0OooO(Object obj) {
        this.f10033o00oOOo0.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((o00oOo00) obj).f10087o00oOOo0);
    }

    @Deprecated
    public void o0O0Oooo(Rect rect) {
        this.f10033o00oOOo0.setBoundsInParent(rect);
    }

    public int o0O0o() {
        return this.f10033o00oOOo0.getChildCount();
    }

    public void o0O0o0(boolean z) {
        this.f10033o00oOOo0.setDismissable(z);
    }

    public void o0O0o00(CharSequence charSequence) {
        this.f10033o00oOOo0.setContentDescription(charSequence);
    }

    public void o0O0o000(Object obj) {
        this.f10033o00oOOo0.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((o00oOo0O) obj).f10088o00oOOo0);
    }

    public void o0O0o00O(boolean z) {
        this.f10033o00oOOo0.setContentInvalid(z);
    }

    public void o0O0o00o(boolean z) {
        this.f10033o00oOOo0.setContextClickable(z);
    }

    public void o0O0o0O(int i) {
        this.f10033o00oOOo0.setDrawingOrder(i);
    }

    public void o0O0o0OO(boolean z) {
        this.f10033o00oOOo0.setEditable(z);
    }

    public void o0O0o0Oo(boolean z) {
        this.f10033o00oOOo0.setEnabled(z);
    }

    public void o0O0o0o(boolean z) {
        this.f10033o00oOOo0.setFocusable(z);
    }

    public void o0O0o0o0(CharSequence charSequence) {
        this.f10033o00oOOo0.setError(charSequence);
    }

    public void o0O0o0oO(boolean z) {
        this.f10033o00oOOo0.setHeading(z);
    }

    public void o0O0o0oo(@o0OO00OO CharSequence charSequence) {
        this.f10033o00oOOo0.setHintText(charSequence);
    }

    public void o0O0oO(View view, int i) {
        this.f10033o00oOOo0.setLabeledBy(view, i);
    }

    public void o0O0oO0(View view) {
        this.f10033o00oOOo0.setLabelFor(view);
    }

    public void o0O0oO0O(View view, int i) {
        this.f10033o00oOOo0.setLabelFor(view, i);
    }

    public void o0O0oO0o(View view) {
        this.f10033o00oOOo0.setLabeledBy(view);
    }

    public void o0O0oOO(boolean z) {
        this.f10033o00oOOo0.setLongClickable(z);
    }

    public void o0O0oOO0(int i) {
        this.f10033o00oOOo0.setLiveRegion(i);
    }

    public void o0O0oOOO(int i) {
        this.f10033o00oOOo0.setMovementGranularities(i);
    }

    public void o0O0oOo(@o0OO00OO CharSequence charSequence) {
        this.f10033o00oOOo0.setPaneTitle(charSequence);
    }

    public void o0O0oOo0(boolean z) {
        this.f10033o00oOOo0.setMultiLine(z);
    }

    public void o0O0oOoO(View view) {
        this.f10034o00oOOoO = -1;
        this.f10033o00oOOo0.setParent(view);
    }

    public void o0O0oOoo(View view, int i) {
        this.f10034o00oOOoO = i;
        this.f10033o00oOOo0.setParent(view, i);
    }

    public void o0O0oo(o00oOoO o00oooo2) {
        this.f10033o00oOOo0.setRangeInfo((AccessibilityNodeInfo.RangeInfo) o00oooo2.f10092o00oOOo0);
    }

    public void o0O0oo0(boolean z) {
        this.f10033o00oOOo0.setPassword(z);
    }

    public void o0O0oo00(int i) {
        this.f10033o00oOOo0.setMaxTextLength(i);
    }

    public void o0O0oo0O(boolean z) {
        this.f10033o00oOOo0.setImportantForAccessibility(z);
    }

    public boolean o0O0oo0o() {
        return this.f10033o00oOOo0.isScrollable();
    }

    public void o0O0ooO0(@o0OO00OO CharSequence charSequence) {
        this.f10033o00oOOo0.getExtras().putCharSequence(f9979o00oOooO, charSequence);
    }

    public void o0O0ooOO(boolean z) {
        this.f10033o00oOOo0.setScreenReaderFocusable(z);
    }

    public void o0O0ooo(boolean z) {
        this.f10033o00oOOo0.setSelected(z);
    }

    public void o0O0ooo0(boolean z) {
        this.f10033o00oOOo0.setScrollable(z);
    }

    public void o0O0oooO(boolean z) {
        this.f10033o00oOOo0.setShowingHintText(z);
    }

    public void o0O0oooo(View view) {
        this.f10035o00oOo00 = -1;
        this.f10033o00oOOo0.setSource(view);
    }

    public void o0OO0(View view, int i) {
        this.f10033o00oOOo0.setTraversalBefore(view, i);
    }

    public void o0OO000(@o0OO00OO CharSequence charSequence) {
        if (o0O000.o00oOOo0.o00oOoO()) {
            this.f10033o00oOOo0.setStateDescription(charSequence);
        } else {
            this.f10033o00oOOo0.getExtras().putCharSequence(f9982o00oo0, charSequence);
        }
    }

    public void o0OO000o(CharSequence charSequence) {
        this.f10033o00oOOo0.setText(charSequence);
    }

    public void o0OO00OO(int i, int i2) {
        this.f10033o00oOOo0.setTextSelection(i, i2);
    }

    public void o0OO00Oo(@oo0oO0 o00oo00O o00oo00o) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f10033o00oOOo0.setTouchDelegateInfo(o00oo00o.f10093o00oOOo0);
        }
    }

    public void o0OO00o(View view) {
        this.f10033o00oOOo0.setTraversalBefore(view);
    }

    public void o0OO00o0(View view) {
        this.f10033o00oOOo0.setTraversalAfter(view);
    }

    public void o0OO00oo(@o0OO00OO CharSequence charSequence) {
        this.f10033o00oOOo0.setTooltipText(charSequence);
    }

    @o0OoOoO(markerClass = {o00oOOo0.InterfaceC0120o00oOOo0.class})
    public void o0OO0O0(@o0OO00OO String str) {
        if (o0O000.o00oOOo0.o00oOoo0()) {
            this.f10033o00oOOo0.setUniqueId(str);
        } else {
            this.f10033o00oOOo0.getExtras().putString(f9986o00oo0OO, str);
        }
    }

    public void o0OO0O0O(String str) {
        this.f10033o00oOOo0.setViewIdResourceName(str);
    }

    public void o0OO0OoO(boolean z) {
        this.f10033o00oOOo0.setVisibleToUser(z);
    }

    public AccessibilityNodeInfo o0OOooO0() {
        return this.f10033o00oOOo0;
    }

    public boolean o0OoO00O() {
        return this.f10033o00oOOo0.isCheckable();
    }

    public void o0OoOoO(View view, int i) {
        this.f10033o00oOOo0.setTraversalAfter(view, i);
    }

    @o0OO00OO
    @o0OoOoO(markerClass = {o00oOOo0.InterfaceC0120o00oOOo0.class})
    public String o0OoOoOO() {
        return o0O000.o00oOOo0.o00oOoo0() ? this.f10033o00oOOo0.getUniqueId() : this.f10033o00oOOo0.getExtras().getString(f9986o00oo0OO);
    }

    public o00oo0O o0OoOoOo() {
        return o0OO0o00(this.f10033o00oOOo0.getTraversalAfter());
    }

    public boolean o0OooO0(View view, int i) {
        return this.f10033o00oOOo0.removeChild(view, i);
    }

    public boolean o0oO0O0o() {
        return this.f10033o00oOOo0.isScreenReaderFocusable();
    }

    public boolean o0oO0Ooo() {
        return this.f10033o00oOOo0.isEditable();
    }

    public void o0oOo0O0(boolean z) {
        this.f10033o00oOOo0.setFocused(z);
    }

    public int o0ooOoOO() {
        return this.f10033o00oOOo0.getWindowId();
    }

    public void oo0OOoo(boolean z) {
        this.f10033o00oOOo0.setCanOpenPopup(z);
    }

    public void oo0oO0(boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f10033o00oOOo0.setTextEntryKey(z);
        } else {
            o0O0Oo(8, z);
        }
    }

    public void oo0oOOo(CharSequence charSequence) {
        this.f10033o00oOOo0.setPackageName(charSequence);
    }

    public void oo0ooO(boolean z) {
        if (Build.VERSION.SDK_INT >= 33) {
            o00oOOoO.o00oOo00(this.f10033o00oOOo0, z);
        }
    }

    public void oooOO0(int i) {
        this.f10033o00oOOo0.setInputType(i);
    }

    @oo0oO0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        o00oo0o0(rect);
        sb.append("; boundsInParent: " + rect);
        o00oo0o(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(o00oooOO());
        sb.append("; className: ");
        sb.append(o00oo());
        sb.append("; text: ");
        sb.append(o0O00000());
        sb.append("; contentDescription: ");
        sb.append(o00ooO0o());
        sb.append("; viewId: ");
        sb.append(o0O000o0());
        sb.append("; uniqueId: ");
        sb.append(o0OoOoOO());
        sb.append("; checkable: ");
        sb.append(o0OoO00O());
        sb.append("; checked: ");
        sb.append(o0O00O0o());
        sb.append("; focusable: ");
        sb.append(o0O00Ooo());
        sb.append("; focused: ");
        sb.append(o0O00o00());
        sb.append("; selected: ");
        sb.append(o0O0O0Oo());
        sb.append("; clickable: ");
        sb.append(o0O00O());
        sb.append("; longClickable: ");
        sb.append(o0O00o());
        sb.append("; enabled: ");
        sb.append(o0O00OoO());
        sb.append("; password: ");
        sb.append(o0O0O0O());
        sb.append("; scrollable: " + o0O0oo0o());
        sb.append("; [");
        List<o00oOOo0> o00oo02 = o00oo0();
        for (int i = 0; i < o00oo02.size(); i++) {
            o00oOOo0 o00oooo02 = o00oo02.get(i);
            String o00oo0OO2 = o00oo0OO(o00oooo02.o00oOOoO());
            if (o00oo0OO2.equals("ACTION_UNKNOWN") && o00oooo02.o00oOo00() != null) {
                o00oo0OO2 = o00oooo02.o00oOo00().toString();
            }
            sb.append(o00oo0OO2);
            if (i != o00oo02.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
