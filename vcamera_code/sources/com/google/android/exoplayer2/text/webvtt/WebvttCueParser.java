package com.google.android.exoplayer2.text.webvtt;

import android.graphics.Color;
import android.support.v4.media.o00oOo0O;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.span.RubySpan;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.text.webvtt.WebvttCueParser;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o00oOooO.o0OO00OO;
/* loaded from: classes.dex */
public final class WebvttCueParser {
    private static final char CHAR_AMPERSAND = '&';
    private static final char CHAR_GREATER_THAN = '>';
    private static final char CHAR_LESS_THAN = '<';
    private static final char CHAR_SEMI_COLON = ';';
    private static final char CHAR_SLASH = '/';
    private static final char CHAR_SPACE = ' ';
    public static final Pattern CUE_HEADER_PATTERN = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern CUE_SETTING_PATTERN = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map<String, Integer> DEFAULT_BACKGROUND_COLORS;
    public static final float DEFAULT_POSITION = 0.5f;
    private static final Map<String, Integer> DEFAULT_TEXT_COLORS;
    private static final String ENTITY_AMPERSAND = "amp";
    private static final String ENTITY_GREATER_THAN = "gt";
    private static final String ENTITY_LESS_THAN = "lt";
    private static final String ENTITY_NON_BREAK_SPACE = "nbsp";
    private static final int STYLE_BOLD = 1;
    private static final int STYLE_ITALIC = 2;
    private static final String TAG = "WebvttCueParser";
    private static final String TAG_BOLD = "b";
    private static final String TAG_CLASS = "c";
    private static final String TAG_ITALIC = "i";
    private static final String TAG_LANG = "lang";
    private static final String TAG_RUBY = "ruby";
    private static final String TAG_RUBY_TEXT = "rt";
    private static final String TAG_UNDERLINE = "u";
    private static final String TAG_VOICE = "v";
    private static final int TEXT_ALIGNMENT_CENTER = 2;
    private static final int TEXT_ALIGNMENT_END = 3;
    private static final int TEXT_ALIGNMENT_LEFT = 4;
    private static final int TEXT_ALIGNMENT_RIGHT = 5;
    private static final int TEXT_ALIGNMENT_START = 1;

    /* loaded from: classes.dex */
    public static class Element {
        private static final Comparator<Element> BY_START_POSITION_ASC = new Comparator() { // from class: com.google.android.exoplayer2.text.webvtt.o00oOOo0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$static$0;
                lambda$static$0 = WebvttCueParser.Element.lambda$static$0((WebvttCueParser.Element) obj, (WebvttCueParser.Element) obj2);
                return lambda$static$0;
            }
        };
        private final int endPosition;
        private final StartTag startTag;

        private Element(StartTag startTag, int i) {
            this.startTag = startTag;
            this.endPosition = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$static$0(Element element, Element element2) {
            return Integer.compare(element.startTag.position, element2.startTag.position);
        }
    }

    /* loaded from: classes.dex */
    public static final class StartTag {
        public final Set<String> classes;
        public final String name;
        public final int position;
        public final String voice;

        private StartTag(String str, int i, String str2, Set<String> set) {
            this.position = i;
            this.name = str;
            this.voice = str2;
            this.classes = set;
        }

        public static StartTag buildStartTag(String str, int i) {
            String str2;
            String trim = str.trim();
            Assertions.checkArgument(!trim.isEmpty());
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] split = Util.split(trim, "\\.");
            String str3 = split[0];
            HashSet hashSet = new HashSet();
            for (int i2 = 1; i2 < split.length; i2++) {
                hashSet.add(split[i2]);
            }
            return new StartTag(str3, i, str2, hashSet);
        }

        public static StartTag buildWholeCueVirtualTag() {
            return new StartTag("", 0, "", Collections.emptySet());
        }
    }

    /* loaded from: classes.dex */
    public static final class StyleMatch implements Comparable<StyleMatch> {
        public final int score;
        public final WebvttCssStyle style;

        public StyleMatch(int i, WebvttCssStyle webvttCssStyle) {
            this.score = i;
            this.style = webvttCssStyle;
        }

        @Override // java.lang.Comparable
        public int compareTo(StyleMatch styleMatch) {
            return Integer.compare(this.score, styleMatch.score);
        }
    }

    /* loaded from: classes.dex */
    public static final class WebvttCueInfoBuilder {
        public CharSequence text;
        public long startTimeUs = 0;
        public long endTimeUs = 0;
        public int textAlignment = 2;
        public float line = -3.4028235E38f;
        public int lineType = 1;
        public int lineAnchor = 0;
        public float position = -3.4028235E38f;
        public int positionAnchor = Integer.MIN_VALUE;
        public float size = 1.0f;
        public int verticalType = Integer.MIN_VALUE;

        private static float computeLine(float f, int i) {
            int i2 = (f > (-3.4028235E38f) ? 1 : (f == (-3.4028235E38f) ? 0 : -1));
            if (i2 == 0 || i != 0 || (f >= 0.0f && f <= 1.0f)) {
                return i2 != 0 ? f : i == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        @o0OO00OO
        private static Layout.Alignment convertTextAlignment(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                com.google.android.exoplayer2.o00oOOo0.o00oOOo0("Unknown textAlignment: ", i, WebvttCueParser.TAG);
                                return null;
                            }
                        }
                    }
                    return Layout.Alignment.ALIGN_OPPOSITE;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        private static float deriveMaxSize(int i, float f) {
            if (i != 0) {
                if (i == 1) {
                    return f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
                } else if (i == 2) {
                    return f;
                } else {
                    throw new IllegalStateException(String.valueOf(i));
                }
            }
            return 1.0f - f;
        }

        private static float derivePosition(int i) {
            if (i != 4) {
                return i != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        private static int derivePositionAnchor(int i) {
            if (i != 1) {
                if (i != 3) {
                    if (i != 4) {
                        return i != 5 ? 1 : 2;
                    }
                    return 0;
                }
                return 2;
            }
            return 0;
        }

        public WebvttCueInfo build() {
            return new WebvttCueInfo(toCueBuilder().build(), this.startTimeUs, this.endTimeUs);
        }

        public Cue.Builder toCueBuilder() {
            float f = this.position;
            if (f == -3.4028235E38f) {
                f = derivePosition(this.textAlignment);
            }
            int i = this.positionAnchor;
            if (i == Integer.MIN_VALUE) {
                i = derivePositionAnchor(this.textAlignment);
            }
            Cue.Builder verticalType = new Cue.Builder().setTextAlignment(convertTextAlignment(this.textAlignment)).setLine(computeLine(this.line, this.lineType), this.lineType).setLineAnchor(this.lineAnchor).setPosition(f).setPositionAnchor(i).setSize(Math.min(this.size, deriveMaxSize(i, f))).setVerticalType(this.verticalType);
            CharSequence charSequence = this.text;
            if (charSequence != null) {
                verticalType.setText(charSequence);
            }
            return verticalType;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        DEFAULT_TEXT_COLORS = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        DEFAULT_BACKGROUND_COLORS = Collections.unmodifiableMap(hashMap2);
    }

    private static void applyDefaultColors(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i, int i2) {
        Object foregroundColorSpan;
        for (String str : set) {
            Map<String, Integer> map = DEFAULT_TEXT_COLORS;
            if (map.containsKey(str)) {
                foregroundColorSpan = new ForegroundColorSpan(map.get(str).intValue());
            } else {
                Map<String, Integer> map2 = DEFAULT_BACKGROUND_COLORS;
                if (map2.containsKey(str)) {
                    foregroundColorSpan = new BackgroundColorSpan(map2.get(str).intValue());
                }
            }
            spannableStringBuilder.setSpan(foregroundColorSpan, i, i2, 33);
        }
    }

    private static void applyEntity(String str, SpannableStringBuilder spannableStringBuilder) {
        char c;
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case 3309:
                if (str.equals(ENTITY_GREATER_THAN)) {
                    c2 = 0;
                    break;
                }
                break;
            case 3464:
                if (str.equals(ENTITY_LESS_THAN)) {
                    c2 = 1;
                    break;
                }
                break;
            case 96708:
                if (str.equals(ENTITY_AMPERSAND)) {
                    c2 = 2;
                    break;
                }
                break;
            case 3374865:
                if (str.equals(ENTITY_NON_BREAK_SPACE)) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                c = '>';
                break;
            case 1:
                c = '<';
                break;
            case 2:
                c = '&';
                break;
            case 3:
                c = CHAR_SPACE;
                break;
            default:
                Log.w(TAG, "ignoring unsupported entity: '&" + str + ";'");
                return;
        }
        spannableStringBuilder.append(c);
    }

    private static void applyRubySpans(SpannableStringBuilder spannableStringBuilder, @o0OO00OO String str, StartTag startTag, List<Element> list, List<WebvttCssStyle> list2) {
        int rubyPosition = getRubyPosition(list2, str, startTag);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, Element.BY_START_POSITION_ASC);
        int i = startTag.position;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (TAG_RUBY_TEXT.equals(((Element) arrayList.get(i3)).startTag.name)) {
                Element element = (Element) arrayList.get(i3);
                int firstKnownRubyPosition = firstKnownRubyPosition(getRubyPosition(list2, str, element.startTag), rubyPosition, 1);
                int i4 = element.startTag.position - i2;
                int i5 = element.endPosition - i2;
                CharSequence subSequence = spannableStringBuilder.subSequence(i4, i5);
                spannableStringBuilder.delete(i4, i5);
                spannableStringBuilder.setSpan(new RubySpan(subSequence.toString(), firstKnownRubyPosition), i, i4, 33);
                i2 = subSequence.length() + i2;
                i = i4;
            }
        }
    }

    private static void applySpansForTag(@o0OO00OO String str, StartTag startTag, List<Element> list, SpannableStringBuilder spannableStringBuilder, List<WebvttCssStyle> list2) {
        Object styleSpan;
        int i = startTag.position;
        int length = spannableStringBuilder.length();
        String str2 = startTag.name;
        str2.getClass();
        char c = 65535;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c = 0;
                    break;
                }
                break;
            case 98:
                if (str2.equals(TAG_BOLD)) {
                    c = 1;
                    break;
                }
                break;
            case 99:
                if (str2.equals("c")) {
                    c = 2;
                    break;
                }
                break;
            case 105:
                if (str2.equals(TAG_ITALIC)) {
                    c = 3;
                    break;
                }
                break;
            case 117:
                if (str2.equals(TAG_UNDERLINE)) {
                    c = 4;
                    break;
                }
                break;
            case 118:
                if (str2.equals(TAG_VOICE)) {
                    c = 5;
                    break;
                }
                break;
            case 3314158:
                if (str2.equals(TAG_LANG)) {
                    c = 6;
                    break;
                }
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                styleSpan = new StyleSpan(1);
                spannableStringBuilder.setSpan(styleSpan, i, length, 33);
                break;
            case 2:
                applyDefaultColors(spannableStringBuilder, startTag.classes, i, length);
                break;
            case 3:
                styleSpan = new StyleSpan(2);
                spannableStringBuilder.setSpan(styleSpan, i, length, 33);
                break;
            case 4:
                styleSpan = new UnderlineSpan();
                spannableStringBuilder.setSpan(styleSpan, i, length, 33);
                break;
            case 7:
                applyRubySpans(spannableStringBuilder, str, startTag, list, list2);
                break;
            default:
                return;
        }
        List<StyleMatch> applicableStyles = getApplicableStyles(list2, str, startTag);
        for (int i2 = 0; i2 < applicableStyles.size(); i2++) {
            applyStyleToText(spannableStringBuilder, applicableStyles.get(i2).style, i, length);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void applyStyleToText(android.text.SpannableStringBuilder r4, com.google.android.exoplayer2.text.webvtt.WebvttCssStyle r5, int r6, int r7) {
        /*
            if (r5 != 0) goto L3
            return
        L3:
            int r0 = r5.getStyle()
            r1 = -1
            r2 = 33
            if (r0 == r1) goto L18
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            int r1 = r5.getStyle()
            r0.<init>(r1)
            com.google.android.exoplayer2.text.span.SpanUtil.addOrReplaceSpan(r4, r0, r6, r7, r2)
        L18:
            boolean r0 = r5.isLinethrough()
            if (r0 == 0) goto L26
            android.text.style.StrikethroughSpan r0 = new android.text.style.StrikethroughSpan
            r0.<init>()
            r4.setSpan(r0, r6, r7, r2)
        L26:
            boolean r0 = r5.isUnderline()
            if (r0 == 0) goto L34
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
            r4.setSpan(r0, r6, r7, r2)
        L34:
            boolean r0 = r5.hasFontColor()
            if (r0 == 0) goto L46
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            int r1 = r5.getFontColor()
            r0.<init>(r1)
            com.google.android.exoplayer2.text.span.SpanUtil.addOrReplaceSpan(r4, r0, r6, r7, r2)
        L46:
            boolean r0 = r5.hasBackgroundColor()
            if (r0 == 0) goto L58
            android.text.style.BackgroundColorSpan r0 = new android.text.style.BackgroundColorSpan
            int r1 = r5.getBackgroundColor()
            r0.<init>(r1)
            com.google.android.exoplayer2.text.span.SpanUtil.addOrReplaceSpan(r4, r0, r6, r7, r2)
        L58:
            java.lang.String r0 = r5.getFontFamily()
            if (r0 == 0) goto L6a
            android.text.style.TypefaceSpan r0 = new android.text.style.TypefaceSpan
            java.lang.String r1 = r5.getFontFamily()
            r0.<init>(r1)
            com.google.android.exoplayer2.text.span.SpanUtil.addOrReplaceSpan(r4, r0, r6, r7, r2)
        L6a:
            int r0 = r5.getFontSizeUnit()
            r1 = 1
            if (r0 == r1) goto L8f
            r1 = 2
            if (r0 == r1) goto L85
            r1 = 3
            if (r0 == r1) goto L78
            goto L9c
        L78:
            android.text.style.RelativeSizeSpan r0 = new android.text.style.RelativeSizeSpan
            float r1 = r5.getFontSize()
            r3 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r3
            r0.<init>(r1)
            goto L99
        L85:
            android.text.style.RelativeSizeSpan r0 = new android.text.style.RelativeSizeSpan
            float r1 = r5.getFontSize()
            r0.<init>(r1)
            goto L99
        L8f:
            android.text.style.AbsoluteSizeSpan r0 = new android.text.style.AbsoluteSizeSpan
            float r3 = r5.getFontSize()
            int r3 = (int) r3
            r0.<init>(r3, r1)
        L99:
            com.google.android.exoplayer2.text.span.SpanUtil.addOrReplaceSpan(r4, r0, r6, r7, r2)
        L9c:
            boolean r5 = r5.getCombineUpright()
            if (r5 == 0) goto Laa
            com.google.android.exoplayer2.text.span.HorizontalTextInVerticalContextSpan r5 = new com.google.android.exoplayer2.text.span.HorizontalTextInVerticalContextSpan
            r5.<init>()
            r4.setSpan(r5, r6, r7, r2)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.webvtt.WebvttCueParser.applyStyleToText(android.text.SpannableStringBuilder, com.google.android.exoplayer2.text.webvtt.WebvttCssStyle, int, int):void");
    }

    private static int findEndOfTag(String str, int i) {
        int indexOf = str.indexOf(62, i);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    private static int firstKnownRubyPosition(int i, int i2, int i3) {
        if (i != -1) {
            return i;
        }
        if (i2 != -1) {
            return i2;
        }
        if (i3 != -1) {
            return i3;
        }
        throw new IllegalArgumentException();
    }

    private static List<StyleMatch> getApplicableStyles(List<WebvttCssStyle> list, @o0OO00OO String str, StartTag startTag) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            WebvttCssStyle webvttCssStyle = list.get(i);
            int specificityScore = webvttCssStyle.getSpecificityScore(str, startTag.name, startTag.classes, startTag.voice);
            if (specificityScore > 0) {
                arrayList.add(new StyleMatch(specificityScore, webvttCssStyle));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static int getRubyPosition(List<WebvttCssStyle> list, @o0OO00OO String str, StartTag startTag) {
        List<StyleMatch> applicableStyles = getApplicableStyles(list, str, startTag);
        for (int i = 0; i < applicableStyles.size(); i++) {
            WebvttCssStyle webvttCssStyle = applicableStyles.get(i).style;
            if (webvttCssStyle.getRubyPosition() != -1) {
                return webvttCssStyle.getRubyPosition();
            }
        }
        return -1;
    }

    private static String getTagName(String str) {
        String trim = str.trim();
        Assertions.checkArgument(!trim.isEmpty());
        return Util.splitAtFirst(trim, "[ \\.]")[0];
    }

    private static boolean isSupportedTag(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case 98:
                if (str.equals(TAG_BOLD)) {
                    c = 0;
                    break;
                }
                break;
            case 99:
                if (str.equals("c")) {
                    c = 1;
                    break;
                }
                break;
            case 105:
                if (str.equals(TAG_ITALIC)) {
                    c = 2;
                    break;
                }
                break;
            case 117:
                if (str.equals(TAG_UNDERLINE)) {
                    c = 3;
                    break;
                }
                break;
            case 118:
                if (str.equals(TAG_VOICE)) {
                    c = 4;
                    break;
                }
                break;
            case 3650:
                if (str.equals(TAG_RUBY_TEXT)) {
                    c = 5;
                    break;
                }
                break;
            case 3314158:
                if (str.equals(TAG_LANG)) {
                    c = 6;
                    break;
                }
                break;
            case 3511770:
                if (str.equals("ruby")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    public static Cue newCueForText(CharSequence charSequence) {
        WebvttCueInfoBuilder webvttCueInfoBuilder = new WebvttCueInfoBuilder();
        webvttCueInfoBuilder.text = charSequence;
        return webvttCueInfoBuilder.toCueBuilder().build();
    }

    @o0OO00OO
    public static WebvttCueInfo parseCue(ParsableByteArray parsableByteArray, List<WebvttCssStyle> list) {
        String readLine = parsableByteArray.readLine();
        if (readLine == null) {
            return null;
        }
        Pattern pattern = CUE_HEADER_PATTERN;
        Matcher matcher = pattern.matcher(readLine);
        if (matcher.matches()) {
            return parseCue(null, matcher, parsableByteArray, list);
        }
        String readLine2 = parsableByteArray.readLine();
        if (readLine2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(readLine2);
        if (matcher2.matches()) {
            return parseCue(readLine.trim(), matcher2, parsableByteArray, list);
        }
        return null;
    }

    @o0OO00OO
    private static WebvttCueInfo parseCue(@o0OO00OO String str, Matcher matcher, ParsableByteArray parsableByteArray, List<WebvttCssStyle> list) {
        WebvttCueInfoBuilder webvttCueInfoBuilder = new WebvttCueInfoBuilder();
        try {
            webvttCueInfoBuilder.startTimeUs = WebvttParserUtil.parseTimestampUs((String) Assertions.checkNotNull(matcher.group(1)));
            webvttCueInfoBuilder.endTimeUs = WebvttParserUtil.parseTimestampUs((String) Assertions.checkNotNull(matcher.group(2)));
            parseCueSettingsList((String) Assertions.checkNotNull(matcher.group(3)), webvttCueInfoBuilder);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = parsableByteArray.readLine();
                if (TextUtils.isEmpty(readLine)) {
                    webvttCueInfoBuilder.text = parseCueText(str, sb.toString(), list);
                    return webvttCueInfoBuilder.build();
                }
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(readLine.trim());
            }
        } catch (NumberFormatException unused) {
            StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Skipping cue with bad header: ");
            o00oOOo02.append(matcher.group());
            Log.w(TAG, o00oOOo02.toString());
            return null;
        }
    }

    public static Cue.Builder parseCueSettingsList(String str) {
        WebvttCueInfoBuilder webvttCueInfoBuilder = new WebvttCueInfoBuilder();
        parseCueSettingsList(str, webvttCueInfoBuilder);
        return webvttCueInfoBuilder.toCueBuilder();
    }

    private static void parseCueSettingsList(String str, WebvttCueInfoBuilder webvttCueInfoBuilder) {
        Matcher matcher = CUE_SETTING_PATTERN.matcher(str);
        while (matcher.find()) {
            String str2 = (String) Assertions.checkNotNull(matcher.group(1));
            String str3 = (String) Assertions.checkNotNull(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    parseLineAttribute(str3, webvttCueInfoBuilder);
                } else if ("align".equals(str2)) {
                    webvttCueInfoBuilder.textAlignment = parseTextAlignment(str3);
                } else if ("position".equals(str2)) {
                    parsePositionAttribute(str3, webvttCueInfoBuilder);
                } else if ("size".equals(str2)) {
                    webvttCueInfoBuilder.size = WebvttParserUtil.parsePercentage(str3);
                } else if ("vertical".equals(str2)) {
                    webvttCueInfoBuilder.verticalType = parseVerticalAttribute(str3);
                } else {
                    Log.w(TAG, "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Skipping bad cue setting: ");
                o00oOOo02.append(matcher.group());
                Log.w(TAG, o00oOOo02.toString());
            }
        }
    }

    public static SpannedString parseCueText(@o0OO00OO String str, String str2, List<WebvttCssStyle> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            char charAt = str2.charAt(i);
            if (charAt == '&') {
                i++;
                int indexOf = str2.indexOf(59, i);
                int indexOf2 = str2.indexOf(32, i);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    applyEntity(str2.substring(i, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i++;
            } else {
                int i2 = i + 1;
                if (i2 < str2.length()) {
                    boolean z = str2.charAt(i2) == '/';
                    i2 = findEndOfTag(str2, i2);
                    int i3 = i2 - 2;
                    boolean z2 = str2.charAt(i3) == '/';
                    int i4 = i + (z ? 2 : 1);
                    if (!z2) {
                        i3 = i2 - 1;
                    }
                    String substring = str2.substring(i4, i3);
                    if (!substring.trim().isEmpty()) {
                        String tagName = getTagName(substring);
                        if (isSupportedTag(tagName)) {
                            if (z) {
                                while (!arrayDeque.isEmpty()) {
                                    StartTag startTag = (StartTag) arrayDeque.pop();
                                    applySpansForTag(str, startTag, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new Element(startTag, spannableStringBuilder.length()));
                                    }
                                    if (startTag.name.equals(tagName)) {
                                        break;
                                    }
                                }
                            } else if (!z2) {
                                arrayDeque.push(StartTag.buildStartTag(substring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i = i2;
            }
        }
        while (!arrayDeque.isEmpty()) {
            applySpansForTag(str, (StartTag) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        applySpansForTag(str, StartTag.buildWholeCueVirtualTag(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static int parseLineAnchor(String str) {
        str.getClass();
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals(TtmlNode.CENTER)) {
                    c = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals(TtmlNode.END)) {
                    c = 2;
                    break;
                }
                break;
            case 109757538:
                if (str.equals(TtmlNode.START)) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 0;
            default:
                Log.w(TAG, "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static void parseLineAttribute(String str, WebvttCueInfoBuilder webvttCueInfoBuilder) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            webvttCueInfoBuilder.lineAnchor = parseLineAnchor(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            webvttCueInfoBuilder.line = WebvttParserUtil.parsePercentage(str);
            webvttCueInfoBuilder.lineType = 0;
            return;
        }
        webvttCueInfoBuilder.line = Integer.parseInt(str);
        webvttCueInfoBuilder.lineType = 1;
    }

    private static int parsePositionAnchor(String str) {
        str.getClass();
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1842484672:
                if (str.equals("line-left")) {
                    c = 0;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals(TtmlNode.CENTER)) {
                    c = 1;
                    break;
                }
                break;
            case -1276788989:
                if (str.equals("line-right")) {
                    c = 2;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c = 3;
                    break;
                }
                break;
            case 100571:
                if (str.equals(TtmlNode.END)) {
                    c = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals(TtmlNode.START)) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 5:
                return 0;
            case 1:
            case 3:
                return 1;
            case 2:
            case 4:
                return 2;
            default:
                Log.w(TAG, "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static void parsePositionAttribute(String str, WebvttCueInfoBuilder webvttCueInfoBuilder) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            webvttCueInfoBuilder.positionAnchor = parsePositionAnchor(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        webvttCueInfoBuilder.position = WebvttParserUtil.parsePercentage(str);
    }

    private static int parseTextAlignment(String str) {
        str.getClass();
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals(TtmlNode.CENTER)) {
                    c = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals(TtmlNode.END)) {
                    c = 2;
                    break;
                }
                break;
            case 3317767:
                if (str.equals(TtmlNode.LEFT)) {
                    c = 3;
                    break;
                }
                break;
            case 108511772:
                if (str.equals(TtmlNode.RIGHT)) {
                    c = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals(TtmlNode.START)) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 1;
            default:
                Log.w(TAG, "Invalid alignment value: " + str);
                return 2;
        }
    }

    private static int parseVerticalAttribute(String str) {
        str.getClass();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        Log.w(TAG, "Invalid 'vertical' value: " + str);
        return Integer.MIN_VALUE;
    }
}
