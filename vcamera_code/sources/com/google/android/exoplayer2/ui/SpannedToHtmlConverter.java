package com.google.android.exoplayer2.ui;

import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import com.google.android.exoplayer2.text.span.HorizontalTextInVerticalContextSpan;
import com.google.android.exoplayer2.text.span.RubySpan;
import com.google.android.exoplayer2.text.span.TextEmphasisSpan;
import com.google.android.exoplayer2.ui.SpannedToHtmlConverter;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import o00oOooO.o0OO00OO;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SpannedToHtmlConverter {
    private static final Pattern NEWLINE_PATTERN = Pattern.compile("(&#13;)?&#10;");

    /* loaded from: classes.dex */
    public static class HtmlAndCss {
        public final Map<String, String> cssRuleSets;
        public final String html;

        private HtmlAndCss(String str, Map<String, String> map) {
            this.html = str;
            this.cssRuleSets = map;
        }
    }

    /* loaded from: classes.dex */
    public static final class SpanInfo {
        public final String closingTag;
        public final int end;
        public final String openingTag;
        public final int start;
        private static final Comparator<SpanInfo> FOR_OPENING_TAGS = new Comparator() { // from class: com.google.android.exoplayer2.ui.o00oo00O
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$static$0;
                lambda$static$0 = SpannedToHtmlConverter.SpanInfo.lambda$static$0((SpannedToHtmlConverter.SpanInfo) obj, (SpannedToHtmlConverter.SpanInfo) obj2);
                return lambda$static$0;
            }
        };
        private static final Comparator<SpanInfo> FOR_CLOSING_TAGS = new Comparator() { // from class: com.google.android.exoplayer2.ui.o00oo0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$static$1;
                lambda$static$1 = SpannedToHtmlConverter.SpanInfo.lambda$static$1((SpannedToHtmlConverter.SpanInfo) obj, (SpannedToHtmlConverter.SpanInfo) obj2);
                return lambda$static$1;
            }
        };

        private SpanInfo(int i, int i2, String str, String str2) {
            this.start = i;
            this.end = i2;
            this.openingTag = str;
            this.closingTag = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$static$0(SpanInfo spanInfo, SpanInfo spanInfo2) {
            int compare = Integer.compare(spanInfo2.end, spanInfo.end);
            if (compare != 0) {
                return compare;
            }
            int compareTo = spanInfo.openingTag.compareTo(spanInfo2.openingTag);
            return compareTo != 0 ? compareTo : spanInfo.closingTag.compareTo(spanInfo2.closingTag);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$static$1(SpanInfo spanInfo, SpanInfo spanInfo2) {
            int compare = Integer.compare(spanInfo2.start, spanInfo.start);
            if (compare != 0) {
                return compare;
            }
            int compareTo = spanInfo2.openingTag.compareTo(spanInfo.openingTag);
            return compareTo != 0 ? compareTo : spanInfo2.closingTag.compareTo(spanInfo.closingTag);
        }
    }

    /* loaded from: classes.dex */
    public static final class Transition {
        private final List<SpanInfo> spansAdded = new ArrayList();
        private final List<SpanInfo> spansRemoved = new ArrayList();
    }

    private SpannedToHtmlConverter() {
    }

    public static HtmlAndCss convert(@o0OO00OO CharSequence charSequence, float f) {
        if (charSequence == null) {
            return new HtmlAndCss("", ImmutableMap.of());
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            HashSet hashSet = new HashSet();
            int i = 0;
            for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
                hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
            }
            HashMap hashMap = new HashMap();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                hashMap.put(HtmlUtils.cssAllClassDescendantsSelector(android.support.v4.media.o00oOOo0.o00oOOo0("bg_", intValue)), Util.formatInvariant("background-color:%s;", HtmlUtils.toCssRgba(intValue)));
            }
            SparseArray<Transition> findSpanTransitions = findSpanTransitions(spanned, f);
            StringBuilder sb = new StringBuilder(spanned.length());
            int i2 = 0;
            while (i < findSpanTransitions.size()) {
                int keyAt = findSpanTransitions.keyAt(i);
                sb.append(escapeHtml(spanned.subSequence(i2, keyAt)));
                Transition transition = findSpanTransitions.get(keyAt);
                Collections.sort(transition.spansRemoved, SpanInfo.FOR_CLOSING_TAGS);
                for (SpanInfo spanInfo : transition.spansRemoved) {
                    sb.append(spanInfo.closingTag);
                }
                Collections.sort(transition.spansAdded, SpanInfo.FOR_OPENING_TAGS);
                for (SpanInfo spanInfo2 : transition.spansAdded) {
                    sb.append(spanInfo2.openingTag);
                }
                i++;
                i2 = keyAt;
            }
            sb.append(escapeHtml(spanned.subSequence(i2, spanned.length())));
            return new HtmlAndCss(sb.toString(), hashMap);
        }
        return new HtmlAndCss(escapeHtml(charSequence), ImmutableMap.of());
    }

    private static String escapeHtml(CharSequence charSequence) {
        return NEWLINE_PATTERN.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    private static SparseArray<Transition> findSpanTransitions(Spanned spanned, float f) {
        Object[] spans;
        SparseArray<Transition> sparseArray = new SparseArray<>();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String openingTag = getOpeningTag(obj, f);
            String closingTag = getClosingTag(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (openingTag != null) {
                Assertions.checkNotNull(closingTag);
                SpanInfo spanInfo = new SpanInfo(spanStart, spanEnd, openingTag, closingTag);
                getOrCreate(sparseArray, spanStart).spansAdded.add(spanInfo);
                getOrCreate(sparseArray, spanEnd).spansRemoved.add(spanInfo);
            }
        }
        return sparseArray;
    }

    @o0OO00OO
    private static String getClosingTag(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof HorizontalTextInVerticalContextSpan) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof TextEmphasisSpan)) {
            return "</span>";
        }
        if (obj instanceof TypefaceSpan) {
            if (((TypefaceSpan) obj).getFamily() != null) {
                return "</span>";
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "</b>";
            }
            if (style == 2) {
                return "</i>";
            }
            if (style == 3) {
                return "</i></b>";
            }
        } else if (obj instanceof RubySpan) {
            return android.support.v4.media.o00oOOoO.o00oOOo0(android.support.v4.media.o00oOo0O.o00oOOo0("<rt>"), escapeHtml(((RubySpan) obj).rubyText), "</rt></ruby>");
        } else {
            if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
        }
        return null;
    }

    @o0OO00OO
    private static String getOpeningTag(Object obj, float f) {
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return Util.formatInvariant("<span style='color:%s;'>", HtmlUtils.toCssRgba(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return Util.formatInvariant("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof HorizontalTextInVerticalContextSpan) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
            boolean dip = absoluteSizeSpan.getDip();
            float size = absoluteSizeSpan.getSize();
            if (!dip) {
                size /= f;
            }
            return Util.formatInvariant("<span style='font-size:%.2fpx;'>", Float.valueOf(size));
        } else if (obj instanceof RelativeSizeSpan) {
            return Util.formatInvariant("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        } else {
            if (obj instanceof TypefaceSpan) {
                String family = ((TypefaceSpan) obj).getFamily();
                if (family != null) {
                    return Util.formatInvariant("<span style='font-family:\"%s\";'>", family);
                }
                return null;
            } else if (obj instanceof StyleSpan) {
                int style = ((StyleSpan) obj).getStyle();
                if (style != 1) {
                    if (style != 2) {
                        if (style != 3) {
                            return null;
                        }
                        return "<b><i>";
                    }
                    return "<i>";
                }
                return "<b>";
            } else if (!(obj instanceof RubySpan)) {
                if (obj instanceof UnderlineSpan) {
                    return "<u>";
                }
                if (obj instanceof TextEmphasisSpan) {
                    TextEmphasisSpan textEmphasisSpan = (TextEmphasisSpan) obj;
                    return Util.formatInvariant("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", getTextEmphasisStyle(textEmphasisSpan.markShape, textEmphasisSpan.markFill), getTextEmphasisPosition(textEmphasisSpan.position));
                }
                return null;
            } else {
                int i = ((RubySpan) obj).position;
                if (i != -1) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return "<ruby style='ruby-position:under;'>";
                    }
                    return "<ruby style='ruby-position:over;'>";
                }
                return "<ruby style='ruby-position:unset;'>";
            }
        }
    }

    private static Transition getOrCreate(SparseArray<Transition> sparseArray, int i) {
        Transition transition = sparseArray.get(i);
        if (transition == null) {
            Transition transition2 = new Transition();
            sparseArray.put(i, transition2);
            return transition2;
        }
        return transition;
    }

    private static String getTextEmphasisPosition(int i) {
        return i != 2 ? "over right" : "under left";
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String getTextEmphasisStyle(int r3, int r4) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 2
            r2 = 1
            if (r4 == r2) goto Lf
            if (r4 == r1) goto Lc
            goto L14
        Lc:
            java.lang.String r4 = "open "
            goto L11
        Lf:
            java.lang.String r4 = "filled "
        L11:
            r0.append(r4)
        L14:
            if (r3 == 0) goto L29
            if (r3 == r2) goto L26
            if (r3 == r1) goto L23
            r4 = 3
            if (r3 == r4) goto L20
            java.lang.String r3 = "unset"
            goto L2b
        L20:
            java.lang.String r3 = "sesame"
            goto L2b
        L23:
            java.lang.String r3 = "dot"
            goto L2b
        L26:
            java.lang.String r3 = "circle"
            goto L2b
        L29:
            java.lang.String r3 = "none"
        L2b:
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.SpannedToHtmlConverter.getTextEmphasisStyle(int, int):java.lang.String");
    }
}
