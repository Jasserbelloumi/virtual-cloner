package com.google.common.html;

import com.google.common.annotations.GwtCompatible;
import com.google.common.escape.Escaper;
import com.google.common.escape.Escapers;
import o0OOOoo0.oOo0oooO;
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public final class HtmlEscapers {
    private static final Escaper HTML_ESCAPER = Escapers.builder().addEscape(oOo0oooO.f13903o00oOOoO, "&quot;").addEscape('\'', "&#39;").addEscape(oOo0oooO.f13912o00oOooO, "&amp;").addEscape(oOo0oooO.f13905o00oOo0O, "&lt;").addEscape(oOo0oooO.f13906o00oOo0o, "&gt;").build();

    private HtmlEscapers() {
    }

    public static Escaper htmlEscaper() {
        return HTML_ESCAPER;
    }
}
