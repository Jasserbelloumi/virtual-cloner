package com.ferfalk.simplesearchview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.o00ooO0;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.tabs.TabLayout;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import o00oOooO.o0O00O;
import o00oOooO.o0O0O0o0;
import o00ooOoo.oOo000Oo;
import o0O0oOoO.o0OO0;
import o0O0oOoO.o0OoOoO;
import o0O0oOoo.o0OO0O0;
import o0O0oo0.o0O000Oo;
import o0O0oo0.o0O000o0;
import o0O0oo0.o0O00O0;
import o0O0oo0.o0OoOoOo;
import o0OO0o.o0O0oo0o;
import o0OO0o.oO0Ooooo;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u008e\u00012\u00020\u0001:\n\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001B+\b\u0007\u0012\b\u0010\u008b\u0001\u001a\u00030\u008a\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\u0006H\u0002J\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u0006H\u0002J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\u001a\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0017H\u0016J\u000e\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u000bJ\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010 \u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u000bH\u0007¢\u0006\u0004\b \u0010\u001fJ\u000e\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!J\u0012\u0010$\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u000bH\u0007J\u0012\u0010%\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u000bH\u0007J\u0006\u0010&\u001a\u00020\u000bJ*\u0010,\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020\u000bH\u0007J\u000e\u0010/\u001a\u00020\u00062\u0006\u0010.\u001a\u00020-J\u0010\u00101\u001a\u00020\u00062\b\b\u0001\u00100\u001a\u00020\u0004J\u000e\u00102\u001a\u00020\u00062\u0006\u0010.\u001a\u00020-J\u0010\u00103\u001a\u00020\u00062\b\b\u0001\u00100\u001a\u00020\u0004J\u0010\u00106\u001a\u00020\u00062\b\u00105\u001a\u0004\u0018\u000104J\u0010\u00107\u001a\u00020\u00062\b\u00105\u001a\u0004\u0018\u000104J\u0010\u00108\u001a\u00020\u00062\b\u00105\u001a\u0004\u0018\u000104J\u0010\u0010:\u001a\u00020\u00062\b\u00109\u001a\u0004\u0018\u000104J\u0010\u0010;\u001a\u00020\u00062\b\b\u0001\u00100\u001a\u00020\u0004J\u0010\u0010<\u001a\u00020\u00062\b\b\u0001\u00100\u001a\u00020\u0004J\u0010\u0010>\u001a\u00020\u00062\b\u0010=\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010@\u001a\u00020\u00062\u0006\u0010?\u001a\u00020\u0004J\u0010\u0010A\u001a\u00020\u00062\b\b\u0001\u00105\u001a\u00020\u0004J\u0010\u0010B\u001a\u00020\u00062\b\b\u0001\u00100\u001a\u00020\u0004J\u000e\u0010D\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u000bJ\u0018\u0010F\u001a\u00020\u00062\b\u0010E\u001a\u0004\u0018\u00010\u000e2\u0006\u0010+\u001a\u00020\u000bJ\u000e\u0010H\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\u000bJ\u000e\u0010K\u001a\u00020\u00062\u0006\u0010J\u001a\u00020IJ\u0010\u0010N\u001a\u00020\u00062\b\u0010M\u001a\u0004\u0018\u00010LJ\u0010\u0010P\u001a\u00020\u00062\b\u0010M\u001a\u0004\u0018\u00010OJ\u0010\u0010S\u001a\u00020\u00062\b\u0010R\u001a\u0004\u0018\u00010QR\"\u0010Z\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR$\u0010a\u001a\u0004\u0018\u00010[8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u0018\u0010d\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010e\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010cR\u0016\u0010g\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010fR$\u0010k\u001a\u00020\u000b2\u0006\u0010h\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010f\u001a\u0004\bi\u0010jR\u0016\u0010l\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010fR\u0018\u0010R\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u001c\u0010r\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bo\u0010U\u0012\u0004\bp\u0010qR(\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010h\u001a\u0004\u0018\u00010!8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b,\u0010s\u001a\u0004\bt\u0010uR\u0016\u0010w\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010UR\u0018\u0010y\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010xR\u0018\u0010{\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010zR\u0016\u0010|\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010fR\u0016\u0010\u001b\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010fR\u0015\u0010\u0080\u0001\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0015\u0010\u0081\u0001\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bm\u0010jR\u0018\u0010\u0085\u0001\u001a\u00030\u0082\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R(\u0010\u0089\u0001\u001a\u00020\u00042\u0007\u0010\u0086\u0001\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0087\u0001\u0010W\"\u0005\b\u0088\u0001\u0010Y¨\u0006\u0094\u0001"}, d2 = {"Lcom/ferfalk/simplesearchview/SimpleSearchView;", "Landroid/widget/FrameLayout;", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "Lo0OO0o/oO0Ooooo;", "o00oo0oO", "o00oo0o", "o00oo0o0", "o00ooo0O", "", "o00oOoo0", "()Ljava/lang/Boolean;", "", "newText", "o00ooOO0", "o00ooO", "clearFocus", "direction", "Landroid/graphics/Rect;", "previouslyFocusedRect", "requestFocus", "Landroid/os/Parcelable;", "onSaveInstanceState", "state", "onRestoreInstanceState", "keepQuery", "setKeepQuery", "animate", "o00ooOo0", "(Z)Lo0OO0o/oO0Ooooo;", "o00oo00O", "Lcom/google/android/material/tabs/TabLayout;", "tabLayout", "setTabLayout", "o00ooOoo", "o00oo0O", "o00ooO0o", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "submit", "o00ooO0", "", o00ooO00.o00oo0.f8113o00oOoO0, "setIconsAlpha", TtmlNode.ATTR_TTS_COLOR, "setIconsColor", "setBackIconAlpha", "setBackIconColor", "Landroid/graphics/drawable/Drawable;", "drawable", "setBackIconDrawable", "setVoiceIconDrawable", "setClearIconDrawable", oOo000Oo.o0O000.f9439o00ooOO0, "setSearchBackground", "setTextColor", "setHintTextColor", "hint", "setHint", "inputType", "setInputType", "setCursorDrawable", "setCursorColor", "voiceSearch", "o00oo0OO", "sequence", "o00ooOO", "show", "o00ooo0", "Landroid/view/MenuItem;", "menuItem", "setMenuItem", "Lcom/ferfalk/simplesearchview/SimpleSearchView$o00oOOoO;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnQueryTextListener", "Lcom/ferfalk/simplesearchview/SimpleSearchView$o00oOo00;", "setOnSearchViewListener", "", "voiceSearchPrompt", "setVoiceSearchPrompt", "o00oo0O0", "I", "getAnimationDuration", "()I", "setAnimationDuration", "(I)V", "animationDuration", "Landroid/graphics/Point;", "Landroid/graphics/Point;", "getRevealAnimationCenter", "()Landroid/graphics/Point;", "setRevealAnimationCenter", "(Landroid/graphics/Point;)V", "revealAnimationCenter", "o00oo0Oo", "Ljava/lang/CharSequence;", SearchIntents.EXTRA_QUERY, "oldQuery", "Z", "allowVoiceSearch", "<set-?>", "o0O0o", "()Z", "isSearchOpen", "isClearingFocus", "o00oo", "Ljava/lang/String;", "o00ooO00", "getStyle$annotations", "()V", TtmlNode.TAG_STYLE, "Lcom/google/android/material/tabs/TabLayout;", "getTabLayout", "()Lcom/google/android/material/tabs/TabLayout;", "o00ooO0O", "tabLayoutInitialHeight", "Lcom/ferfalk/simplesearchview/SimpleSearchView$o00oOOoO;", "onQueryChangeListener", "Lcom/ferfalk/simplesearchview/SimpleSearchView$o00oOo00;", "searchViewListener", "searchIsClosing", "Lo0O0oOoo/o0OO0O0;", "o00ooOOo", "Lo0O0oOoo/o0OO0O0;", "binding", "isVoiceAvailable", "Landroid/graphics/drawable/GradientDrawable;", "getCardStyleBackground", "()Landroid/graphics/drawable/GradientDrawable;", "cardStyleBackground", "value", "getCardStyle", "setCardStyle", "cardStyle", "Landroid/content/Context;", "creationContext", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "o00oooOO", "o00oOOo0", o0OO000o.o00oOOoO.f12961o00oOo00, "SavedState", "o00oOo00", "o00oOo0O", "simplesearchview_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class SimpleSearchView extends FrameLayout {

    /* renamed from: o00ooOo  reason: collision with root package name */
    public static final int f5821o00ooOo = 4;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public static final int f5822o00ooOo0 = 735;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public static final int f5823o00ooOoO = 26;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public static final int f5824o00ooOoo = 6;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public static final float f5825o00ooo0 = 0.87f;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public static final int f5826o00ooo00 = 2;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public static final float f5827o00ooo0O = 0.54f;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public static final int f5828o00ooo0o = 0;

    /* renamed from: o00oooO  reason: collision with root package name */
    public static final int f5829o00oooO = 1;

    /* renamed from: o00oooOO  reason: collision with root package name */
    public static final o00oOOo0 f5830o00oooOO = new o00oOOo0(null);

    /* renamed from: o00oo  reason: collision with root package name */
    public String f5831o00oo;
    @Nullable

    /* renamed from: o00oo0O  reason: collision with root package name */
    public Point f5832o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public int f5833o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public CharSequence f5834o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public boolean f5835o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public CharSequence f5836o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public boolean f5837o00oo0oO;

    /* renamed from: o00ooO  reason: collision with root package name */
    public o00oOo00 f5838o00ooO;
    @Nullable

    /* renamed from: o00ooO0  reason: collision with root package name */
    public TabLayout f5839o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public int f5840o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public int f5841o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public o00oOOoO f5842o00ooO0o;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public boolean f5843o00ooOO;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public boolean f5844o00ooOO0;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public final o0OO0O0 f5845o00ooOOo;

    /* renamed from: o0O0o  reason: collision with root package name */
    public boolean f5846o0O0o;

    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 -2\u00020\u0001:\u0001\u001aB\u0013\b\u0016\u0012\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*B\u0011\b\u0012\u0012\u0006\u0010+\u001a\u00020\u0002¢\u0006\u0004\b)\u0010,J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\"\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\n\u001a\u0004\b \u0010\f\"\u0004\b!\u0010\u000eR\"\u0010&\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0012\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010\u0016¨\u0006."}, d2 = {"Lcom/ferfalk/simplesearchview/SimpleSearchView$SavedState;", "Landroid/view/View$BaseSavedState;", "Landroid/os/Parcel;", "out", "", "flags", "Lo0OO0o/oO0Ooooo;", "writeToParcel", "", "o00oo0O0", "Ljava/lang/String;", "o00oOooO", "()Ljava/lang/String;", "o00oOoOO", "(Ljava/lang/String;)V", SearchIntents.EXTRA_QUERY, "", "o00oo0O", "Z", "o00oOo0o", "()Z", "o00oOoOo", "(Z)V", "isSearchOpen", "o00oo0Oo", "I", o0OO000o.o00oOOoO.f12961o00oOo00, "()I", "o00oOoO0", "(I)V", "animationDuration", "o00oo0o0", "o00oOo0O", "o00oOoo0", "voiceSearchPrompt", "o00oo0o", "o00oOo00", "o00oOoO", "keepQuery", "Landroid/os/Parcelable;", "superState", "<init>", "(Landroid/os/Parcelable;)V", "in", "(Landroid/os/Parcel;)V", "o0O0o", "simplesearchview_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class SavedState extends View.BaseSavedState {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public boolean f5849o00oo0O;
        @Nullable

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public String f5850o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public int f5851o00oo0Oo;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public boolean f5852o00oo0o;
        @Nullable

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public String f5853o00oo0o0;

        /* renamed from: o0O0o  reason: collision with root package name */
        public static final o00oOOoO f5848o0O0o = new o00oOOoO(null);
        @NotNull

        /* renamed from: o00oo0oO  reason: collision with root package name */
        public static final Parcelable.Creator<SavedState> f5847o00oo0oO = new o00oOOo0();

        @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/ferfalk/simplesearchview/SimpleSearchView$SavedState$o00oOOo0", "Landroid/os/Parcelable$Creator;", "Lcom/ferfalk/simplesearchview/SimpleSearchView$SavedState;", "Landroid/os/Parcel;", "in", "o00oOOo0", "", "size", "", o0OO000o.o00oOOoO.f12961o00oOo00, "(I)[Lcom/ferfalk/simplesearchview/SimpleSearchView$SavedState;", "simplesearchview_release"}, k = 1, mv = {1, 4, 0})
        /* loaded from: classes.dex */
        public static final class o00oOOo0 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            @Nullable
            /* renamed from: o00oOOo0 */
            public SavedState createFromParcel(@NotNull Parcel parcel) {
                o0ooO.o00oo0O0(parcel, "in");
                return new SavedState(parcel);
            }

            @NotNull
            public SavedState[] o00oOOoO(int i) {
                return new SavedState[i];
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/ferfalk/simplesearchview/SimpleSearchView$SavedState$o00oOOoO;", "", "Landroid/os/Parcelable$Creator;", "Lcom/ferfalk/simplesearchview/SimpleSearchView$SavedState;", "CREATOR", "Landroid/os/Parcelable$Creator;", "o00oOOo0", "()Landroid/os/Parcelable$Creator;", "<init>", "()V", "simplesearchview_release"}, k = 1, mv = {1, 4, 0})
        /* loaded from: classes.dex */
        public static final class o00oOOoO {
            public o00oOOoO() {
            }

            public o00oOOoO(o0O00 o0o00) {
            }

            @NotNull
            public final Parcelable.Creator<SavedState> o00oOOo0() {
                return SavedState.f5847o00oo0oO;
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f5850o00oo0O0 = parcel.readString();
            this.f5849o00oo0O = parcel.readInt() == 1;
            this.f5851o00oo0Oo = parcel.readInt();
            this.f5853o00oo0o0 = parcel.readString();
            this.f5852o00oo0o = parcel.readInt() == 1;
        }

        public /* synthetic */ SavedState(Parcel parcel, o0O00 o0o00) {
            this(parcel);
        }

        public SavedState(@Nullable Parcelable parcelable) {
            super(parcelable);
        }

        public final int o00oOOoO() {
            return this.f5851o00oo0Oo;
        }

        public final boolean o00oOo00() {
            return this.f5852o00oo0o;
        }

        @Nullable
        public final String o00oOo0O() {
            return this.f5853o00oo0o0;
        }

        public final boolean o00oOo0o() {
            return this.f5849o00oo0O;
        }

        public final void o00oOoO(boolean z) {
            this.f5852o00oo0o = z;
        }

        public final void o00oOoO0(int i) {
            this.f5851o00oo0Oo = i;
        }

        public final void o00oOoOO(@Nullable String str) {
            this.f5850o00oo0O0 = str;
        }

        public final void o00oOoOo(boolean z) {
            this.f5849o00oo0O = z;
        }

        public final void o00oOoo0(@Nullable String str) {
            this.f5853o00oo0o0 = str;
        }

        @Nullable
        public final String o00oOooO() {
            return this.f5850o00oo0O0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            o0ooO.o00oo0O0(parcel, "out");
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f5850o00oo0O0);
            parcel.writeInt(this.f5849o00oo0O ? 1 : 0);
            parcel.writeInt(this.f5851o00oo0Oo);
            parcel.writeString(this.f5853o00oo0o0);
            parcel.writeInt(this.f5852o00oo0o ? 1 : 0);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ferfalk/simplesearchview/SimpleSearchView$showSearch$1$animationListener$1", "Lo0O0oo0/o0O00;", "Landroid/view/View;", "view", "", o0OO000o.o00oOOoO.f12961o00oOo00, "simplesearchview_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class o0 extends o0O0oo0.o0O00 {

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ boolean f5855o00oOOoO;

        public o0(boolean z) {
            this.f5855o00oOOoO = z;
        }

        @Override // o0O0oo0.o0O00, o0O0oo0.o0O00O0.o00oOOo0
        public boolean o00oOOoO(@NotNull View view) {
            o0ooO.o00oo0O0(view, "view");
            o00oOo00 o00ooo002 = SimpleSearchView.this.f5838o00ooO;
            if (o00ooo002 != null) {
                o00ooo002.o00oOo00();
                return false;
            }
            return false;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004¨\u0006\u0011"}, d2 = {"Lcom/ferfalk/simplesearchview/SimpleSearchView$o00oOOo0;", "", "", "ANIMATION_CENTER_PADDING", "I", "", "BACK_ICON_ALPHA_DEFAULT", "F", "CARD_CORNER_RADIUS", "CARD_ELEVATION", "CARD_PADDING", "ICONS_ALPHA_DEFAULT", "REQUEST_VOICE_SEARCH", "STYLE_BAR", "STYLE_CARD", "<init>", "()V", "simplesearchview_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&J\b\u0010\b\u001a\u00020\u0004H&¨\u0006\t"}, d2 = {"Lcom/ferfalk/simplesearchview/SimpleSearchView$o00oOOoO;", "", "", SearchIntents.EXTRA_QUERY, "", o0OO000o.o00oOOoO.f12961o00oOo00, "newText", "o00oOOo0", "o00oOo00", "simplesearchview_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public interface o00oOOoO {
        boolean o00oOOo0(@NotNull String str);

        boolean o00oOOoO(@NotNull String str);

        boolean o00oOo00();
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/ferfalk/simplesearchview/SimpleSearchView$o00oOo00;", "", "Lo0OO0o/oO0Ooooo;", o0OO000o.o00oOOoO.f12961o00oOo00, "o00oOOo0", "o00oOo00", "o00oOooO", "simplesearchview_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public interface o00oOo00 {
        void o00oOOo0();

        void o00oOOoO();

        void o00oOo00();

        void o00oOooO();
    }

    @o0OO0oO0.o00oOoO(o0OO0oO0.o00oOOo0.SOURCE)
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/ferfalk/simplesearchview/SimpleSearchView$o00oOo0O;", "", "simplesearchview_release"}, k = 1, mv = {1, 4, 0})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface o00oOo0O {
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ferfalk/simplesearchview/SimpleSearchView$closeSearch$1$animationListener$1", "Lo0O0oo0/o0O00;", "Landroid/view/View;", "view", "", o0OO000o.o00oOOoO.f12961o00oOo00, "simplesearchview_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class o00oOoO extends o0O0oo0.o0O00 {

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ boolean f5857o00oOOoO;

        public o00oOoO(boolean z) {
            this.f5857o00oOOoO = z;
        }

        @Override // o0O0oo0.o0O00, o0O0oo0.o0O00O0.o00oOOo0
        public boolean o00oOOoO(@NotNull View view) {
            o0ooO.o00oo0O0(view, "view");
            o00oOo00 o00ooo002 = SimpleSearchView.this.f5838o00ooO;
            if (o00ooo002 != null) {
                o00ooo002.o00oOooO();
                return false;
            }
            return false;
        }
    }

    @o0O0oo0o(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/MenuItem;", "kotlin.jvm.PlatformType", "onMenuItemClick"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class o00oo implements MenuItem.OnMenuItemClickListener {
        public o00oo() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            SimpleSearchView.o00ooOo(SimpleSearchView.this, false, 1, null);
            return true;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lo0OO0o/oO0Ooooo;", "onClick", "(Landroid/view/View;)V", "com/ferfalk/simplesearchview/SimpleSearchView$initClickListeners$1$2", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class o00oo0 implements View.OnClickListener {
        public o00oo0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            SimpleSearchView.this.o00oOoo0();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lo0OO0o/oO0Ooooo;", "onClick", "(Landroid/view/View;)V", "com/ferfalk/simplesearchview/SimpleSearchView$initClickListeners$1$1", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class o00oo00O implements View.OnClickListener {
        public o00oo00O() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            SimpleSearchView.o00oo0(SimpleSearchView.this, false, 1, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ferfalk/simplesearchview/SimpleSearchView$initSearchEditText$1$2", "Lo0O0oOoO/o0OO0;", "", "s", "", TtmlNode.START, TtmlNode.ANNOTATION_POSITION_BEFORE, "count", "Lo0OO0o/oO0Ooooo;", "onTextChanged", "simplesearchview_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class o00oo0O extends o0OO0 {
        public o00oo0O() {
        }

        @Override // o0O0oOoO.o0OO0, android.text.TextWatcher
        public void onTextChanged(@NotNull CharSequence charSequence, int i, int i2, int i3) {
            o0ooO.o00oo0O0(charSequence, "s");
            if (SimpleSearchView.this.f5844o00ooOO0) {
                return;
            }
            SimpleSearchView.this.o00ooOO0(charSequence);
        }
    }

    @o0O0oo0o(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/TextView;", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "Landroid/view/KeyEvent;", "onEditorAction", "com/ferfalk/simplesearchview/SimpleSearchView$initSearchEditText$1$1"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class o00oo0O0 implements TextView.OnEditorActionListener {
        public o00oo0O0() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(@Nullable TextView textView, int i, @Nullable KeyEvent keyEvent) {
            SimpleSearchView.this.o00ooO();
            return true;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lo0OO0o/oO0Ooooo;", "onClick", "(Landroid/view/View;)V", "com/ferfalk/simplesearchview/SimpleSearchView$initClickListeners$1$3", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class o00oo0OO implements View.OnClickListener {
        public o00oo0OO() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            SimpleSearchView.this.o00ooo0O();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ferfalk/simplesearchview/SimpleSearchView$o00ooO", "Lo0O0oOoO/o0OoOoO;", "Lcom/google/android/material/tabs/TabLayout$Tab;", "tab", "Lo0OO0o/oO0Ooooo;", "onTabUnselected", "simplesearchview_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class o00ooO extends o0OoOoO {
        public o00ooO() {
        }

        @Override // o0O0oOoO.o0OoOoO, com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(@NotNull TabLayout.Tab tab) {
            o0ooO.o00oo0O0(tab, "tab");
            SimpleSearchView.o00oo0(SimpleSearchView.this, false, 1, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/ferfalk/simplesearchview/SimpleSearchView$o00ooO0", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "", "onPreDraw", "simplesearchview_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class o00ooO0 implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ TabLayout f5865o00oo0O;

        public o00ooO0(TabLayout tabLayout) {
            this.f5865o00oo0O = tabLayout;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            SimpleSearchView.this.f5841o00ooO0O = this.f5865o00oo0O.getHeight();
            this.f5865o00oo0O.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/View;", "<anonymous parameter 0>", "", "hasFocus", "Lo0OO0o/oO0Ooooo;", "onFocusChange", "(Landroid/view/View;Z)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class o0O0o implements View.OnFocusChangeListener {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0OO0O0 f5867o00oo0O0;

        public o0O0o(o0OO0O0 o0oo0o0) {
            this.f5867o00oo0O0 = o0oo0o0;
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(@Nullable View view, boolean z) {
            if (z) {
                EditText editText = this.f5867o00oo0O0.searchEditText;
                o0ooO.o00oo0OO(editText, "searchEditText");
                o0OoOoOo.o00oOo0O(editText);
            }
        }
    }

    @o0OOOO0o.o00oo0O0
    public SimpleSearchView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @o0OOOO0o.o00oo0O0
    public SimpleSearchView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @o0OOOO0o.o00oo0O0
    public SimpleSearchView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o0ooO.o00oo0O0(context, "creationContext");
        this.f5833o00oo0O0 = 250;
        this.f5831o00oo = "";
        o0OO0O0 inflate = o0OO0O0.inflate(LayoutInflater.from(getContext()), this, true);
        o0ooO.o00oo0OO(inflate, "SearchViewBinding.inflat…rom(context), this, true)");
        this.f5845o00ooOOo = inflate;
        o00oo0oO(attributeSet, i);
        o00oo0o();
        o00oo0o0();
        o00ooo0(true);
        if (isInEditMode()) {
            return;
        }
        setVisibility(4);
    }

    public /* synthetic */ SimpleSearchView(Context context, AttributeSet attributeSet, int i, int i2, o0O00 o0o00) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final GradientDrawable getCardStyleBackground() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        Context context = getContext();
        o0ooO.o00oo0OO(context, "context");
        gradientDrawable.setCornerRadius(o0O000Oo.o00oOOoO(4, context));
        return gradientDrawable;
    }

    private static /* synthetic */ void getStyle$annotations() {
    }

    public static /* synthetic */ oO0Ooooo o00oo0(SimpleSearchView simpleSearchView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return simpleSearchView.o00oo00O(z);
    }

    public static /* synthetic */ void o00oo0Oo(SimpleSearchView simpleSearchView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        simpleSearchView.o00oo0O(z);
    }

    public static /* synthetic */ boolean o00ooO0O(SimpleSearchView simpleSearchView, int i, int i2, Intent intent, boolean z, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            z = true;
        }
        return simpleSearchView.o00ooO0(i, i2, intent, z);
    }

    public static /* synthetic */ oO0Ooooo o00ooOo(SimpleSearchView simpleSearchView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return simpleSearchView.o00ooOo0(z);
    }

    public static /* synthetic */ void o00ooo00(SimpleSearchView simpleSearchView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        simpleSearchView.o00ooOoo(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        o0OO0O0 o0oo0o0 = this.f5845o00ooOOo;
        this.f5846o0O0o = true;
        o0OoOoOo.o00oOo00(this);
        super.clearFocus();
        o0oo0o0.searchEditText.clearFocus();
        this.f5846o0O0o = false;
    }

    public final int getAnimationDuration() {
        return this.f5833o00oo0O0;
    }

    public final int getCardStyle() {
        return this.f5840o00ooO00;
    }

    @Nullable
    public final Point getRevealAnimationCenter() {
        Point point = this.f5832o00oo0O;
        if (point != null) {
            return point;
        }
        int width = getWidth();
        Context context = getContext();
        o0ooO.o00oo0OO(context, "context");
        Point point2 = new Point(width - o0O000Oo.o00oOOoO(26, context), getHeight() / 2);
        this.f5832o00oo0O = point2;
        return point2;
    }

    @Nullable
    public final TabLayout getTabLayout() {
        return this.f5839o00ooO0;
    }

    public final Boolean o00oOoo0() {
        EditText editText = this.f5845o00ooOOo.searchEditText;
        o0ooO.o00oo0OO(editText, "searchEditText");
        editText.setText((CharSequence) null);
        o00oOOoO o00ooooo2 = this.f5842o00ooO0o;
        if (o00ooooo2 != null) {
            return Boolean.valueOf(o00ooooo2.o00oOo00());
        }
        return null;
    }

    @o0OOOO0o.o00oo0O0
    @Nullable
    public final oO0Ooooo o00oOooo() {
        return o00oo0(this, false, 1, null);
    }

    public final boolean o00oo() {
        if (isInEditMode()) {
            return true;
        }
        Context context = getContext();
        o0ooO.o00oo0OO(context, "context");
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.speech.action.RECOGNIZE_SPEECH"), 0);
        o0ooO.o00oo0OO(queryIntentActivities, "pm.queryIntentActivities…ION_RECOGNIZE_SPEECH), 0)");
        return !queryIntentActivities.isEmpty();
    }

    @o0OOOO0o.o00oo0O0
    @Nullable
    public final oO0Ooooo o00oo00O(boolean z) {
        o0OO0O0 o0oo0o0 = this.f5845o00ooOOo;
        if (this.f5837o00oo0oO) {
            this.f5844o00ooOO0 = true;
            EditText editText = o0oo0o0.searchEditText;
            o0ooO.o00oo0OO(editText, "searchEditText");
            editText.setText((CharSequence) null);
            this.f5844o00ooOO0 = false;
            clearFocus();
            if (z) {
                o0O00O0.o00ooO(this, this.f5833o00oo0O0, new o00oOoO(z), getRevealAnimationCenter()).start();
            } else {
                setVisibility(4);
            }
            o00ooOoo(z);
            this.f5837o00oo0oO = false;
            o00oOo00 o00ooo002 = this.f5838o00ooO;
            if (o00ooo002 != null) {
                o00ooo002.o00oOOo0();
                return oO0Ooooo.f13240o00oOOo0;
            }
            return null;
        }
        return null;
    }

    @o0OOOO0o.o00oo0O0
    public final void o00oo0O(boolean z) {
        TabLayout tabLayout = this.f5839o00ooO0;
        if (tabLayout == null) {
            return;
        }
        o0ooO.o00oo00O(tabLayout);
        if (!z) {
            tabLayout.setVisibility(8);
            return;
        }
        TabLayout tabLayout2 = this.f5839o00ooO0;
        o0ooO.o00oo00O(tabLayout2);
        o0O00O0.o0O000Oo(tabLayout, tabLayout2.getHeight(), 0, this.f5833o00oo0O0, null, 16, null).start();
    }

    @o0OOOO0o.o00oo0O0
    public final void o00oo0O0() {
        o00oo0Oo(this, false, 1, null);
    }

    public final void o00oo0OO(boolean z) {
        this.f5835o00oo0o = z;
    }

    public final void o00oo0o() {
        o0OO0O0 o0oo0o0 = this.f5845o00ooOOo;
        o0oo0o0.searchEditText.setOnEditorActionListener(new o00oo0O0());
        o0oo0o0.searchEditText.addTextChangedListener(new o00oo0O());
        EditText editText = o0oo0o0.searchEditText;
        o0ooO.o00oo0OO(editText, "searchEditText");
        editText.setOnFocusChangeListener(new o0O0o(o0oo0o0));
    }

    public final void o00oo0o0() {
        o0OO0O0 o0oo0o0 = this.f5845o00ooOOo;
        o0oo0o0.backButton.setOnClickListener(new o00oo00O());
        o0oo0o0.clearButton.setOnClickListener(new o00oo0());
        o0oo0o0.voiceButton.setOnClickListener(new o00oo0OO());
    }

    public final void o00oo0oO(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.SimpleSearchView, i, 0);
        o0ooO.o00oo0OO(obtainStyledAttributes, "context.obtainStyledAttr…rchView, defStyleAttr, 0)");
        int i2 = R.styleable.SimpleSearchView_type;
        if (obtainStyledAttributes.hasValue(i2)) {
            setCardStyle(obtainStyledAttributes.getInt(i2, this.f5840o00ooO00));
        }
        int i3 = R.styleable.SimpleSearchView_backIconAlpha;
        if (obtainStyledAttributes.hasValue(i3)) {
            setBackIconAlpha(obtainStyledAttributes.getFloat(i3, 0.87f));
        }
        int i4 = R.styleable.SimpleSearchView_iconsAlpha;
        if (obtainStyledAttributes.hasValue(i4)) {
            setIconsAlpha(obtainStyledAttributes.getFloat(i4, 0.54f));
        }
        int i5 = R.styleable.SimpleSearchView_backIconTint;
        if (obtainStyledAttributes.hasValue(i5)) {
            Context context = getContext();
            o0ooO.o00oo0OO(context, "context");
            setBackIconColor(obtainStyledAttributes.getColor(i5, o0OoOoOo.o00oOOoO(context)));
        }
        int i6 = R.styleable.SimpleSearchView_iconsTint;
        if (obtainStyledAttributes.hasValue(i6)) {
            setIconsColor(obtainStyledAttributes.getColor(i6, -16777216));
        }
        int i7 = R.styleable.SimpleSearchView_cursorColor;
        if (obtainStyledAttributes.hasValue(i7)) {
            Context context2 = getContext();
            o0ooO.o00oo0OO(context2, "context");
            setCursorColor(obtainStyledAttributes.getColor(i7, o0OoOoOo.o00oOOo0(context2)));
        }
        int i8 = R.styleable.SimpleSearchView_hintColor;
        if (obtainStyledAttributes.hasValue(i8)) {
            setHintTextColor(obtainStyledAttributes.getColor(i8, o00ooo0.o0.getColor(getContext(), R.color.default_textColorHint)));
        }
        int i9 = R.styleable.SimpleSearchView_searchBackground;
        if (obtainStyledAttributes.hasValue(i9)) {
            setSearchBackground(obtainStyledAttributes.getDrawable(i9));
        }
        int i10 = R.styleable.SimpleSearchView_searchBackIcon;
        if (obtainStyledAttributes.hasValue(i10)) {
            setBackIconDrawable(obtainStyledAttributes.getDrawable(i10));
        }
        int i11 = R.styleable.SimpleSearchView_searchClearIcon;
        if (obtainStyledAttributes.hasValue(i11)) {
            setClearIconDrawable(obtainStyledAttributes.getDrawable(i11));
        }
        int i12 = R.styleable.SimpleSearchView_searchVoiceIcon;
        if (obtainStyledAttributes.hasValue(i12)) {
            setVoiceIconDrawable(obtainStyledAttributes.getDrawable(i12));
        }
        int i13 = R.styleable.SimpleSearchView_voiceSearch;
        if (obtainStyledAttributes.hasValue(i13)) {
            this.f5835o00oo0o = obtainStyledAttributes.getBoolean(i13, this.f5835o00oo0o);
        }
        int i14 = R.styleable.SimpleSearchView_voiceSearchPrompt;
        if (obtainStyledAttributes.hasValue(i14)) {
            setVoiceSearchPrompt(obtainStyledAttributes.getString(i14));
        }
        int i15 = R.styleable.SimpleSearchView_android_hint;
        if (obtainStyledAttributes.hasValue(i15)) {
            setHint(obtainStyledAttributes.getString(i15));
        }
        int i16 = R.styleable.SimpleSearchView_android_inputType;
        if (obtainStyledAttributes.hasValue(i16)) {
            setInputType(obtainStyledAttributes.getInt(i16, 524288));
        }
        int i17 = R.styleable.SimpleSearchView_android_textColor;
        if (obtainStyledAttributes.hasValue(i17)) {
            setTextColor(obtainStyledAttributes.getColor(i17, o00ooo0.o0.getColor(getContext(), R.color.default_textColor)));
        }
        obtainStyledAttributes.recycle();
    }

    public final void o00ooO() {
        o0OO0O0 o0oo0o0 = this.f5845o00ooOOo;
        EditText editText = o0oo0o0.searchEditText;
        o0ooO.o00oo0OO(editText, "searchEditText");
        Editable text = editText.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        o00oOOoO o00ooooo2 = this.f5842o00ooO0o;
        if (o00ooooo2 != null) {
            o0ooO.o00oo00O(o00ooooo2);
            if (o00ooooo2.o00oOOoO(text.toString())) {
                return;
            }
        }
        o00oo0(this, false, 1, null);
        this.f5844o00ooOO0 = true;
        EditText editText2 = o0oo0o0.searchEditText;
        o0ooO.o00oo0OO(editText2, "searchEditText");
        editText2.setText((CharSequence) null);
        this.f5844o00ooOO0 = false;
    }

    @o0OOOO0o.o00oo0O0
    public final boolean o00ooO0(int i, int i2, @NotNull Intent intent, boolean z) {
        o0ooO.o00oo0O0(intent, "data");
        if (i == 735 && i2 == -1) {
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("android.speech.extra.RESULTS");
            if (!(stringArrayListExtra == null || stringArrayListExtra.isEmpty())) {
                String str = stringArrayListExtra.get(0);
                if (!TextUtils.isEmpty(str)) {
                    o00ooOO(str, z);
                }
            }
            return true;
        }
        return false;
    }

    @o0OOOO0o.o00oo0O0
    public final boolean o00ooO00(int i, int i2, @NotNull Intent intent) {
        return o00ooO0O(this, i, i2, intent, false, 8, null);
    }

    public final boolean o00ooO0o() {
        if (this.f5837o00oo0oO) {
            o00oo0(this, false, 1, null);
            return true;
        }
        return false;
    }

    public final void o00ooOO(@Nullable CharSequence charSequence, boolean z) {
        o0OO0O0 o0oo0o0 = this.f5845o00ooOOo;
        o0oo0o0.searchEditText.setText(charSequence);
        if (charSequence != null) {
            EditText editText = o0oo0o0.searchEditText;
            editText.setSelection(editText.length());
            this.f5834o00oo0Oo = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        o00ooO();
    }

    public final void o00ooOO0(CharSequence charSequence) {
        o00oOOoO o00ooooo2;
        o0OO0O0 o0oo0o0 = this.f5845o00ooOOo;
        this.f5834o00oo0Oo = charSequence;
        boolean z = !TextUtils.isEmpty(charSequence);
        ImageButton imageButton = o0oo0o0.clearButton;
        o0ooO.o00oo0OO(imageButton, "clearButton");
        if (z) {
            imageButton.setVisibility(0);
            o00ooo0(false);
        } else {
            imageButton.setVisibility(8);
            o00ooo0(true);
        }
        if (!TextUtils.equals(charSequence, this.f5836o00oo0o0) && (o00ooooo2 = this.f5842o00ooO0o) != null) {
            o00ooooo2.o00oOOo0(charSequence.toString());
        }
        this.f5836o00oo0o0 = charSequence.toString();
    }

    @o0OOOO0o.o00oo0O0
    @Nullable
    public final oO0Ooooo o00ooOOo() {
        return o00ooOo(this, false, 1, null);
    }

    @o0OOOO0o.o00oo0O0
    @Nullable
    public final oO0Ooooo o00ooOo0(boolean z) {
        o0OO0O0 o0oo0o0 = this.f5845o00ooOOo;
        if (this.f5837o00oo0oO) {
            return null;
        }
        o0oo0o0.searchEditText.setText(this.f5843o00ooOO ? this.f5834o00oo0Oo : null);
        o0oo0o0.searchEditText.requestFocus();
        if (z) {
            o0O00O0.o00ooooO(this, this.f5833o00oo0O0, new o0(z), getRevealAnimationCenter()).start();
        } else {
            setVisibility(0);
        }
        o00oo0O(z);
        this.f5837o00oo0oO = true;
        o00oOo00 o00ooo002 = this.f5838o00ooO;
        if (o00ooo002 != null) {
            o00ooo002.o00oOOoO();
            return oO0Ooooo.f13240o00oOOo0;
        }
        return null;
    }

    @o0OOOO0o.o00oo0O0
    public final void o00ooOoO() {
        o00ooo00(this, false, 1, null);
    }

    @o0OOOO0o.o00oo0O0
    public final void o00ooOoo(boolean z) {
        TabLayout tabLayout = this.f5839o00ooO0;
        if (tabLayout == null) {
            return;
        }
        if (z) {
            o0ooO.o00oo00O(tabLayout);
            o0O00O0.o0O000Oo(tabLayout, 0, this.f5841o00ooO0O, this.f5833o00oo0O0, null, 16, null).start();
        } else if (tabLayout != null) {
            tabLayout.setVisibility(0);
        }
    }

    public final void o00ooo0(boolean z) {
        ImageButton imageButton;
        int i;
        o0OO0O0 o0oo0o0 = this.f5845o00ooOOo;
        if (z && o00oo() && this.f5835o00oo0o) {
            imageButton = o0oo0o0.voiceButton;
            o0ooO.o00oo0OO(imageButton, "voiceButton");
            i = 0;
        } else {
            imageButton = o0oo0o0.voiceButton;
            o0ooO.o00oo0OO(imageButton, "voiceButton");
            i = 8;
        }
        imageButton.setVisibility(i);
    }

    public final void o00ooo0O() {
        Context context = getContext();
        o0ooO.o00oo0OO(context, "context");
        Activity o00oOooO2 = o0OoOoOo.o00oOooO(context);
        if (o00oOooO2 != null) {
            Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
            String str = this.f5831o00oo;
            if (!(str == null || str.length() == 0)) {
                intent.putExtra("android.speech.extra.PROMPT", this.f5831o00oo);
            }
            intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
            intent.putExtra("android.speech.extra.MAX_RESULTS", 1);
            o00oOooO2.startActivityForResult(intent, f5822o00ooOo0);
        }
    }

    public final boolean o0O0o() {
        return this.f5837o00oo0oO;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@NotNull Parcelable parcelable) {
        o0ooO.o00oo0O0(parcelable, "state");
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f5834o00oo0Oo = savedState.f5850o00oo0O0;
        this.f5833o00oo0O0 = savedState.f5851o00oo0Oo;
        this.f5831o00oo = savedState.f5853o00oo0o0;
        this.f5843o00ooOO = savedState.f5852o00oo0o;
        if (savedState.f5849o00oo0O) {
            o00ooOo0(false);
            o00ooOO(savedState.f5850o00oo0O0, false);
        }
        super.onRestoreInstanceState(savedState.getSuperState());
    }

    @Override // android.view.View
    @NotNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        CharSequence charSequence = this.f5834o00oo0Oo;
        savedState.f5850o00oo0O0 = charSequence != null ? String.valueOf(charSequence) : null;
        savedState.f5849o00oo0O = this.f5837o00oo0oO;
        savedState.f5851o00oo0Oo = this.f5833o00oo0O0;
        savedState.f5852o00oo0o = this.f5843o00ooOO;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, @Nullable Rect rect) {
        o0OO0O0 o0oo0o0 = this.f5845o00ooOOo;
        if (!this.f5846o0O0o && isFocusable()) {
            return o0oo0o0.searchEditText.requestFocus(i, rect);
        }
        return false;
    }

    public final void setAnimationDuration(int i) {
        this.f5833o00oo0O0 = i;
    }

    public final void setBackIconAlpha(float f) {
        ImageButton imageButton = this.f5845o00ooOOo.backButton;
        o0ooO.o00oo0OO(imageButton, "backButton");
        imageButton.setAlpha(f);
    }

    public final void setBackIconColor(@o0O00O int i) {
        o00ooO0.o00oOOo0.o00oOo00(this.f5845o00ooOOo.backButton, ColorStateList.valueOf(i));
    }

    public final void setBackIconDrawable(@Nullable Drawable drawable) {
        this.f5845o00ooOOo.backButton.setImageDrawable(drawable);
    }

    public final void setCardStyle(int i) {
        float f;
        o0OO0O0 o0oo0o0 = this.f5845o00ooOOo;
        this.f5840o00ooO00 = i;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (i == 0 || i != 1) {
            o0oo0o0.searchContainer.setBackgroundColor(-1);
            View view = o0oo0o0.bottomLine;
            o0ooO.o00oo0OO(view, "bottomLine");
            view.setVisibility(0);
            f = 0.0f;
        } else {
            ConstraintLayout constraintLayout = o0oo0o0.searchContainer;
            o0ooO.o00oo0OO(constraintLayout, "searchContainer");
            constraintLayout.setBackground(getCardStyleBackground());
            View view2 = o0oo0o0.bottomLine;
            o0ooO.o00oo0OO(view2, "bottomLine");
            view2.setVisibility(8);
            Context context = getContext();
            o0ooO.o00oo0OO(context, "context");
            int o00oOOoO2 = o0O000Oo.o00oOOoO(6, context);
            layoutParams.setMargins(o00oOOoO2, o00oOOoO2, o00oOOoO2, o00oOOoO2);
            Context context2 = getContext();
            o0ooO.o00oo0OO(context2, "context");
            f = o0O000Oo.o00oOOoO(2, context2);
        }
        ConstraintLayout constraintLayout2 = o0oo0o0.searchContainer;
        o0ooO.o00oo0OO(constraintLayout2, "searchContainer");
        constraintLayout2.setLayoutParams(layoutParams);
        ConstraintLayout constraintLayout3 = o0oo0o0.searchContainer;
        o0ooO.o00oo0OO(constraintLayout3, "searchContainer");
        constraintLayout3.setElevation(f);
    }

    public final void setClearIconDrawable(@Nullable Drawable drawable) {
        this.f5845o00ooOOo.clearButton.setImageDrawable(drawable);
    }

    public final void setCursorColor(@o0O00O int i) {
        EditText editText = this.f5845o00ooOOo.searchEditText;
        o0ooO.o00oo0OO(editText, "searchEditText");
        o0O000o0.o00oOOo0(editText, i);
    }

    public final void setCursorDrawable(@o0O0O0o0 int i) {
        EditText editText = this.f5845o00ooOOo.searchEditText;
        o0ooO.o00oo0OO(editText, "searchEditText");
        o0O000o0.o00oOOoO(editText, i);
    }

    public final void setHint(@Nullable CharSequence charSequence) {
        EditText editText = this.f5845o00ooOOo.searchEditText;
        o0ooO.o00oo0OO(editText, "searchEditText");
        editText.setHint(charSequence);
    }

    public final void setHintTextColor(@o0O00O int i) {
        this.f5845o00ooOOo.searchEditText.setHintTextColor(i);
    }

    public final void setIconsAlpha(float f) {
        o0OO0O0 o0oo0o0 = this.f5845o00ooOOo;
        ImageButton imageButton = o0oo0o0.clearButton;
        o0ooO.o00oo0OO(imageButton, "clearButton");
        imageButton.setAlpha(f);
        ImageButton imageButton2 = o0oo0o0.voiceButton;
        o0ooO.o00oo0OO(imageButton2, "voiceButton");
        imageButton2.setAlpha(f);
    }

    public final void setIconsColor(@o0O00O int i) {
        o0OO0O0 o0oo0o0 = this.f5845o00ooOOo;
        o00ooO0.o00oOOo0.o00oOo00(o0oo0o0.clearButton, ColorStateList.valueOf(i));
        o00ooO0.o00oOOo0.o00oOo00(o0oo0o0.voiceButton, ColorStateList.valueOf(i));
    }

    public final void setInputType(int i) {
        EditText editText = this.f5845o00ooOOo.searchEditText;
        o0ooO.o00oo0OO(editText, "searchEditText");
        editText.setInputType(i);
    }

    public final void setKeepQuery(boolean z) {
        this.f5843o00ooOO = z;
    }

    public final void setMenuItem(@NotNull MenuItem menuItem) {
        o0ooO.o00oo0O0(menuItem, "menuItem");
        menuItem.setOnMenuItemClickListener(new o00oo());
    }

    public final void setOnQueryTextListener(@Nullable o00oOOoO o00ooooo2) {
        this.f5842o00ooO0o = o00ooooo2;
    }

    public final void setOnSearchViewListener(@Nullable o00oOo00 o00ooo002) {
        this.f5838o00ooO = o00ooo002;
    }

    public final void setRevealAnimationCenter(@Nullable Point point) {
        this.f5832o00oo0O = point;
    }

    public final void setSearchBackground(@Nullable Drawable drawable) {
        ConstraintLayout constraintLayout = this.f5845o00ooOOo.searchContainer;
        o0ooO.o00oo0OO(constraintLayout, "searchContainer");
        constraintLayout.setBackground(drawable);
    }

    public final void setTabLayout(@NotNull TabLayout tabLayout) {
        o0ooO.o00oo0O0(tabLayout, "tabLayout");
        this.f5839o00ooO0 = tabLayout;
        o0ooO.o00oo00O(tabLayout);
        tabLayout.getViewTreeObserver().addOnPreDrawListener(new o00ooO0(tabLayout));
        TabLayout tabLayout2 = this.f5839o00ooO0;
        o0ooO.o00oo00O(tabLayout2);
        tabLayout2.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new o00ooO());
    }

    public final void setTextColor(@o0O00O int i) {
        this.f5845o00ooOOo.searchEditText.setTextColor(i);
    }

    public final void setVoiceIconDrawable(@Nullable Drawable drawable) {
        this.f5845o00ooOOo.voiceButton.setImageDrawable(drawable);
    }

    public final void setVoiceSearchPrompt(@Nullable String str) {
        this.f5831o00oo = str;
    }
}
