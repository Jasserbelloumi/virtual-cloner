package o0O000o0;

import android.support.v4.media.o00oOo0O;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.webkit.WebView;
import android.widget.TextView;
import com.google.android.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o0O000o0.o00oOo00;
/* loaded from: classes.dex */
public final class o00oOo00 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String[] f10411o00oOOo0 = new String[0];

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final Comparator<o00oOOoO> f10412o00oOOoO = new Comparator() { // from class: o0O000o0.o00oOOoO
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int o00oo0OO2;
            o00oo0OO2 = o00oOo00.o00oo0OO((o00oOo00.o00oOOoO) obj, (o00oOo00.o00oOOoO) obj2);
            return o00oo0OO2;
        }
    };

    @o0OOooO0(24)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static void o00oOOo0(TextView textView, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
            Linkify.addLinks(textView, pattern, str, strArr, matchFilter, transformFilter);
        }

        @o0O0O0Oo
        public static boolean o00oOOoO(Spannable spannable, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
            return Linkify.addLinks(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public URLSpan f10413o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public String f10414o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f10415o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f10416o00oOooO;
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* renamed from: o0O000o0.o00oOo00$o00oOo00  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public @interface InterfaceC0131o00oOo00 {
    }

    public static void o00oOOoO(@oo0oO0 TextView textView) {
        if ((textView.getMovementMethod() instanceof LinkMovementMethod) || !textView.getLinksClickable()) {
            return;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static void o00oOo00(@oo0oO0 TextView textView, @oo0oO0 Pattern pattern, @o0OO00OO String str) {
        Linkify.addLinks(textView, pattern, str);
    }

    public static void o00oOo0O(@oo0oO0 TextView textView, @oo0oO0 Pattern pattern, @o0OO00OO String str, @o0OO00OO String[] strArr, @o0OO00OO Linkify.MatchFilter matchFilter, @o0OO00OO Linkify.TransformFilter transformFilter) {
        o00oOOo0.o00oOOo0(textView, pattern, str, strArr, matchFilter, transformFilter);
    }

    public static boolean o00oOo0o(@oo0oO0 Spannable spannable, int i) {
        return Linkify.addLinks(spannable, i);
    }

    public static boolean o00oOoO(@oo0oO0 Spannable spannable, @oo0oO0 Pattern pattern, @o0OO00OO String str, @o0OO00OO Linkify.MatchFilter matchFilter, @o0OO00OO Linkify.TransformFilter transformFilter) {
        return Linkify.addLinks(spannable, pattern, str, matchFilter, transformFilter);
    }

    public static boolean o00oOoO0(@oo0oO0 Spannable spannable, @oo0oO0 Pattern pattern, @o0OO00OO String str) {
        return Linkify.addLinks(spannable, pattern, str);
    }

    public static boolean o00oOoOO(@oo0oO0 Spannable spannable, @oo0oO0 Pattern pattern, @o0OO00OO String str, @o0OO00OO String[] strArr, @o0OO00OO Linkify.MatchFilter matchFilter, @o0OO00OO Linkify.TransformFilter transformFilter) {
        return o00oOOo0.o00oOOoO(spannable, pattern, str, strArr, matchFilter, transformFilter);
    }

    public static boolean o00oOoOo(@oo0oO0 TextView textView, int i) {
        return Linkify.addLinks(textView, i);
    }

    public static void o00oOoo0(String str, int i, int i2, Spannable spannable) {
        spannable.setSpan(new URLSpan(str), i, i2, 33);
    }

    public static void o00oOooO(@oo0oO0 TextView textView, @oo0oO0 Pattern pattern, @o0OO00OO String str, @o0OO00OO Linkify.MatchFilter matchFilter, @o0OO00OO Linkify.TransformFilter transformFilter) {
        Linkify.addLinks(textView, pattern, str, matchFilter, transformFilter);
    }

    public static String o00oOooo(String str) {
        return WebView.findAddress(str);
    }

    public static void o00oo0(ArrayList<o00oOOoO> arrayList, Spannable spannable) {
        int indexOf;
        String obj = spannable.toString();
        int i = 0;
        while (true) {
            try {
                String findAddress = WebView.findAddress(obj);
                if (findAddress != null && (indexOf = obj.indexOf(findAddress)) >= 0) {
                    o00oOOoO o00ooooo2 = new o00oOOoO();
                    int length = findAddress.length() + indexOf;
                    o00ooooo2.f10415o00oOo00 = indexOf + i;
                    i += length;
                    o00ooooo2.f10416o00oOooO = i;
                    obj = obj.substring(length);
                    try {
                        String encode = URLEncoder.encode(findAddress, C.UTF8_NAME);
                        o00ooooo2.f10414o00oOOoO = "geo:0,0?q=" + encode;
                        arrayList.add(o00ooooo2);
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
                return;
            } catch (UnsupportedOperationException unused2) {
                return;
            }
        }
    }

    public static void o00oo00O(ArrayList<o00oOOoO> arrayList, Spannable spannable, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group(0);
            if (matchFilter == null || matchFilter.acceptMatch(spannable, start, end)) {
                if (group != null) {
                    o00oOOoO o00ooooo2 = new o00oOOoO();
                    o00ooooo2.f10414o00oOOoO = o00oo0O0(group, strArr, matcher, transformFilter);
                    o00ooooo2.f10415o00oOo00 = start;
                    o00ooooo2.f10416o00oOooO = end;
                    arrayList.add(o00ooooo2);
                }
            }
        }
    }

    public static void o00oo0O(ArrayList<o00oOOoO> arrayList, Spannable spannable) {
        URLSpan[] uRLSpanArr;
        int i;
        int i2 = 0;
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            o00oOOoO o00ooooo2 = new o00oOOoO();
            o00ooooo2.f10413o00oOOo0 = uRLSpan;
            o00ooooo2.f10415o00oOo00 = spannable.getSpanStart(uRLSpan);
            o00ooooo2.f10416o00oOooO = spannable.getSpanEnd(uRLSpan);
            arrayList.add(o00ooooo2);
        }
        Collections.sort(arrayList, f10412o00oOOoO);
        int size = arrayList.size();
        while (i2 < size - 1) {
            o00oOOoO o00ooooo3 = arrayList.get(i2);
            int i3 = i2 + 1;
            o00oOOoO o00ooooo4 = arrayList.get(i3);
            int i4 = o00ooooo3.f10415o00oOo00;
            int i5 = o00ooooo4.f10415o00oOo00;
            if (i4 <= i5 && (i = o00ooooo3.f10416o00oOooO) > i5) {
                int i6 = o00ooooo4.f10416o00oOooO;
                int i7 = (i6 > i && i - i4 <= i6 - i5) ? i - i4 < i6 - i5 ? i2 : -1 : i3;
                if (i7 != -1) {
                    Object obj = arrayList.get(i7).f10413o00oOOo0;
                    if (obj != null) {
                        spannable.removeSpan(obj);
                    }
                    arrayList.remove(i7);
                    size--;
                }
            }
            i2 = i3;
        }
    }

    public static String o00oo0O0(@oo0oO0 String str, @oo0oO0 String[] strArr, Matcher matcher, @o0OO00OO Linkify.TransformFilter transformFilter) {
        boolean z;
        if (transformFilter != null) {
            str = transformFilter.transformUrl(matcher, str);
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= length) {
                z = false;
                break;
            }
            String str2 = strArr[i];
            if (str.regionMatches(true, 0, str2, 0, str2.length())) {
                if (!str.regionMatches(false, 0, str2, 0, str2.length())) {
                    StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0(str2);
                    o00oOOo02.append(str.substring(str2.length()));
                    str = o00oOOo02.toString();
                }
            } else {
                i++;
            }
        }
        return (z || strArr.length <= 0) ? str : android.support.v4.media.o00oOOoO.o00oOOo0(new StringBuilder(), strArr[0], str);
    }

    public static /* synthetic */ int o00oo0OO(o00oOOoO o00ooooo2, o00oOOoO o00ooooo3) {
        int i = o00ooooo2.f10415o00oOo00;
        int i2 = o00ooooo3.f10415o00oOo00;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        return Integer.compare(o00ooooo3.f10416o00oOooO, o00ooooo2.f10416o00oOooO);
    }

    public static boolean o00oo0Oo() {
        return true;
    }
}
