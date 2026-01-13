package o0Oo0Oo0;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
/* loaded from: classes3.dex */
public final class o0oOo0O0 {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f16135o00oOo0O = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final String f16136o00oOo0o = "\"([^\"]*)\"";

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final String f16139o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final String f16140o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final String f16141o00oOo00;
    @Nullable

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final String f16142o00oOooO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final Pattern f16138o00oOoO0 = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final Pattern f16137o00oOoO = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    public o0oOo0O0(String str, String str2, String str3, @Nullable String str4) {
        this.f16139o00oOOo0 = str;
        this.f16140o00oOOoO = str2;
        this.f16141o00oOo00 = str3;
        this.f16142o00oOooO = str4;
    }

    @Nullable
    public static o0oOo0O0 o00oOo00(String str) {
        Matcher matcher = f16138o00oOoO0.matcher(str);
        if (matcher.lookingAt()) {
            String group = matcher.group(1);
            Locale locale = Locale.US;
            String lowerCase = group.toLowerCase(locale);
            String lowerCase2 = matcher.group(2).toLowerCase(locale);
            Matcher matcher2 = f16137o00oOoO.matcher(str);
            String str2 = null;
            for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
                matcher2.region(end, str.length());
                if (!matcher2.lookingAt()) {
                    return null;
                }
                String group2 = matcher2.group(1);
                if (group2 != null && group2.equalsIgnoreCase("charset")) {
                    String group3 = matcher2.group(2);
                    if (group3 == null) {
                        group3 = matcher2.group(3);
                    } else if (group3.startsWith("'") && group3.endsWith("'") && group3.length() > 2) {
                        group3 = group3.substring(1, group3.length() - 1);
                    }
                    if (str2 != null && !group3.equalsIgnoreCase(str2)) {
                        return null;
                    }
                    str2 = group3;
                }
            }
            return new o0oOo0O0(str, lowerCase, lowerCase2, str2);
        }
        return null;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof o0oOo0O0) && ((o0oOo0O0) obj).f16139o00oOOo0.equals(this.f16139o00oOOo0);
    }

    public int hashCode() {
        return this.f16139o00oOOo0.hashCode();
    }

    @Nullable
    public Charset o00oOOo0() {
        return o00oOOoO(null);
    }

    @Nullable
    public Charset o00oOOoO(@Nullable Charset charset) {
        try {
            String str = this.f16142o00oOooO;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public String o00oOo0O() {
        return this.f16140o00oOOoO;
    }

    public String o00oOooO() {
        return this.f16141o00oOo00;
    }

    public String toString() {
        return this.f16139o00oOOo0;
    }
}
