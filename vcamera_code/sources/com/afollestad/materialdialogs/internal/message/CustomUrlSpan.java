package com.afollestad.materialdialogs.internal.message;

import android.text.style.URLSpan;
import android.view.View;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import o0OO0o.oO0Ooooo;
import o0OOOO.o00oo;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/afollestad/materialdialogs/internal/message/CustomUrlSpan;", "Landroid/text/style/URLSpan;", "Landroid/view/View;", "widget", "Lo0OO0o/oO0Ooooo;", "onClick", "Lkotlin/Function1;", "", "o00oo0O0", "Lo0OOOO/o00oo;", "onLinkClick", ImagesContract.URL, "<init>", "(Ljava/lang/String;Lo0OOOO/o00oo;)V", "core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class CustomUrlSpan extends URLSpan {

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o00oo<String, oO0Ooooo> f5812o00oo0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CustomUrlSpan(@NotNull String str, @NotNull o00oo<? super String, oO0Ooooo> o00ooVar) {
        super(str);
        o0ooO.o00oo0O(str, ImagesContract.URL);
        o0ooO.o00oo0O(o00ooVar, "onLinkClick");
        this.f5812o00oo0O0 = o00ooVar;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(@NotNull View view) {
        o0ooO.o00oo0O(view, "widget");
        o00oo<String, oO0Ooooo> o00ooVar = this.f5812o00oo0O0;
        String url = getURL();
        o0ooO.o00oOoO(url, ImagesContract.URL);
        o00ooVar.invoke(url);
    }
}
