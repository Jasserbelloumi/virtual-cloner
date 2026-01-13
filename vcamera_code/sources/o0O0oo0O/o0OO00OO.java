package o0O0oo0O;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.R;
import com.afollestad.materialdialogs.internal.button.DialogActionButton;
import com.afollestad.materialdialogs.internal.main.DialogLayout;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import o00oOooO.o0O00oO0;
import o00oOooO.o0O0O0o0;
import o00oOooO.o0OOO0O;
import o00oOooO.o0OoO00O;
import o00ooOoo.oO0O0O0;
import o0O0oO0.o0O000O;
import o0O0oOO.o0O00OO;
import o0O0oOo.o0O0OO0;
import o0O0oOo.o0O0OOO;
import o0O0oOo.o0OooO0;
import o0O0oOo.oo0OOoo;
import o0OO0o.o0O0o;
import o0OO0o.o0O0oo0o;
import o0OO0o.o0OO000;
import o0OO0o.oO0Ooooo;
import o0OOOO.o00oo;
import o0OOOO0o.o00ooO0;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0O0OO;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0002\u0083\u0001B\u001c\u0012\u0006\u0010|\u001a\u00020x\u0012\t\b\u0002\u0010\u0080\u0001\u001a\u00020}¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u001b\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\u0012JB\u0010\u0018\u001a\u00020\u00002\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00132\u001b\b\u0002\u0010\u0017\u001a\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014¢\u0006\u0002\b\u0016¢\u0006\u0004\b\u0018\u0010\u0019JC\u0010\u001c\u001a\u00020\u00002\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00132\u001c\b\u0002\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014j\u0004\u0018\u0001`\u001a¢\u0006\u0004\b\u001c\u0010\u0019J\u0006\u0010\u001d\u001a\u00020\u0000JC\u0010\u001e\u001a\u00020\u00002\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00132\u001c\b\u0002\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014j\u0004\u0018\u0001`\u001a¢\u0006\u0004\b\u001e\u0010\u0019J\u0006\u0010\u001f\u001a\u00020\u0000JE\u0010 \u001a\u00020\u00002\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00132\u001c\b\u0002\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014j\u0004\u0018\u0001`\u001aH\u0007¢\u0006\u0004\b \u0010\u0019J\b\u0010!\u001a\u00020\u0000H\u0007J\b\u0010\"\u001a\u00020\u0000H\u0007J%\u0010$\u001a\u00020\u00002\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b$\u0010%J%\u0010(\u001a\u00020\u00002\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b(\u0010)J\u0012\u0010,\u001a\u00020\u00002\b\b\u0002\u0010+\u001a\u00020*H\u0007J\b\u0010-\u001a\u00020\u0002H\u0016J\"\u0010/\u001a\u00020\u00002\u0017\u0010.\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0014¢\u0006\u0002\b\u0016H\u0086\bJ\u000e\u00101\u001a\u00020\u00002\u0006\u00100\u001a\u00020*J\u0010\u00102\u001a\u00020\u00022\u0006\u00100\u001a\u00020*H\u0017J\u000e\u00103\u001a\u00020\u00002\u0006\u00100\u001a\u00020*J\u0010\u00105\u001a\u00020\u00022\u0006\u00104\u001a\u00020*H\u0017J\b\u00106\u001a\u00020\u0002H\u0016J\u0017\u00109\u001a\u00020\u00022\u0006\u00108\u001a\u000207H\u0000¢\u0006\u0004\b9\u0010:R#\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020<0;8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R*\u0010I\u001a\u00020*2\u0006\u0010B\u001a\u00020*8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR.\u0010Q\u001a\u0004\u0018\u00010J2\b\u0010B\u001a\u0004\u0018\u00010J8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR.\u0010T\u001a\u0004\u0018\u00010J2\b\u0010B\u001a\u0004\u0018\u00010J8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010L\u001a\u0004\bR\u0010N\"\u0004\bS\u0010PR.\u0010X\u001a\u0004\u0018\u00010J2\b\u0010B\u001a\u0004\u0018\u00010J8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010L\u001a\u0004\bV\u0010N\"\u0004\bW\u0010PR*\u00104\u001a\u00020*2\u0006\u0010B\u001a\u00020*8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010D\u001a\u0004\bC\u0010F\"\u0004\bZ\u0010HR*\u00100\u001a\u00020*2\u0006\u0010B\u001a\u00020*8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010D\u001a\u0004\bK\u0010F\"\u0004\b\\\u0010HR.\u0010b\u001a\u0004\u0018\u00010&2\b\u0010B\u001a\u0004\u0018\u00010&8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\bU\u0010_\"\u0004\b`\u0010aR\u0018\u0010e\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0017\u0010k\u001a\u00020f8\u0006¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR0\u0010o\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0014j\u0002`\u001a0l8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bM\u0010m\u001a\u0004\bc\u0010nR0\u0010p\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0014j\u0002`\u001a0l8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bi\u0010m\u001a\u0004\bg\u0010nR0\u0010r\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0014j\u0002`\u001a0l8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bq\u0010m\u001a\u0004\b]\u0010nR0\u0010s\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0014j\u0002`\u001a0l8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010m\u001a\u0004\b=\u0010nR*\u0010u\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0014j\u0002`\u001a0l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010mR*\u0010v\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0014j\u0002`\u001a0l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010mR*\u0010w\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0014j\u0002`\u001a0l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010mR\u0017\u0010|\u001a\u00020x8\u0006¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\bq\u0010{R\u0018\u0010\u0080\u0001\u001a\u00020}8\u0006¢\u0006\f\n\u0004\b\u0018\u0010~\u001a\u0004\b[\u0010\u007f¨\u0006\u0084\u0001"}, d2 = {"Lo0O0oo0O/o0OO00OO;", "Landroid/app/Dialog;", "Lo0OO0o/oO0Ooooo;", "o0O000O", "o00ooOOo", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "key", "o00oOoO", "(Ljava/lang/String;)Ljava/lang/Object;", "", "res", "Landroid/graphics/drawable/Drawable;", "drawable", "o00ooOO0", "(Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;)Lo0O0oo0O/o0OO00OO;", "text", "o0O000Oo", "(Ljava/lang/Integer;Ljava/lang/String;)Lo0O0oo0O/o0OO00OO;", "", "Lkotlin/Function1;", "Loo0oOOo/o00oOo00;", "Lo0OO0o/o0O000Oo;", "applySettings", "o00ooOoO", "(Ljava/lang/Integer;Ljava/lang/CharSequence;Lo0OOOO/o00oo;)Lo0O0oo0O/o0OO00OO;", "Lcom/afollestad/materialdialogs/DialogCallback;", "click", "o00oooOo", "o00oOoO0", "o00ooo00", "o00oOo0O", "o00ooo0O", "o00oOo0o", "o00oooO", "literal", "o00ooOo0", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lo0O0oo0O/o0OO00OO;", "", "literalDp", "o00oOoOO", "(Ljava/lang/Float;Ljava/lang/Integer;)Lo0O0oo0O/o0OO00OO;", "", "debugMode", "o00oOoo0", "show", "func", "o0OoOoOo", "cancelable", "o00oOooO", "setCancelable", "o00oOo00", "cancelOnTouchOutside", "setCanceledOnTouchOutside", "dismiss", "Lo0O0oo0O/o0OO0O0;", "which", "o00oooOO", "(Lo0O0oo0O/o0OO0O0;)V", "", "", "o00oo0O0", "Ljava/util/Map;", "o00oo0o0", "()Ljava/util/Map;", "config", "<set-?>", "o00oo0O", "Z", "o00oo00O", "()Z", "o00oooo", "(Z)V", "autoDismissEnabled", "Landroid/graphics/Typeface;", "o00oo0Oo", "Landroid/graphics/Typeface;", "o00ooO0O", "()Landroid/graphics/Typeface;", "o0O000", "(Landroid/graphics/Typeface;)V", "titleFont", "o00oo0", "o00ooooO", "bodyFont", "o00oo0o", "o00oo0OO", "o00ooooo", "buttonFont", "o00oo0oO", "o0", "o0O0o", "o0O00000", "o00oo", "Ljava/lang/Float;", "()Ljava/lang/Float;", "o0O0000O", "(Ljava/lang/Float;)V", "cornerRadius", "o00ooO00", "Ljava/lang/Integer;", "maxWidth", "Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "o00ooO0", "Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "o00ooO0o", "()Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "view", "", "Ljava/util/List;", "()Ljava/util/List;", "preShowListeners", "showListeners", "o00ooO", "dismissListeners", "cancelListeners", "o00ooOO", "positiveListeners", "negativeListeners", "neutralListeners", "Landroid/content/Context;", "o00ooOo", "Landroid/content/Context;", "()Landroid/content/Context;", "windowContext", "Lo0O0oo0O/oo0oO0;", "Lo0O0oo0O/oo0oO0;", "()Lo0O0oo0O/oo0oO0;", "dialogBehavior", "<init>", "(Landroid/content/Context;Lo0O0oo0O/oo0oO0;)V", "o00oOOo0", "core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class o0OO00OO extends Dialog {
    @Nullable

    /* renamed from: o00oo  reason: collision with root package name */
    public Float f12785o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public boolean f12786o00oo0O;
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Map<String, Object> f12787o00oo0O0;
    @Nullable

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public Typeface f12788o00oo0Oo;
    @Nullable

    /* renamed from: o00oo0o  reason: collision with root package name */
    public Typeface f12789o00oo0o;
    @Nullable

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public Typeface f12790o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public boolean f12791o00oo0oO;
    @NotNull

    /* renamed from: o00ooO  reason: collision with root package name */
    public final List<o00oo<o0OO00OO, oO0Ooooo>> f12792o00ooO;
    @NotNull

    /* renamed from: o00ooO0  reason: collision with root package name */
    public final DialogLayout f12793o00ooO0;
    @o00oOooO.o0OO0

    /* renamed from: o00ooO00  reason: collision with root package name */
    public Integer f12794o00ooO00;
    @NotNull

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public final List<o00oo<o0OO00OO, oO0Ooooo>> f12795o00ooO0O;
    @NotNull

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public final List<o00oo<o0OO00OO, oO0Ooooo>> f12796o00ooO0o;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public final List<o00oo<o0OO00OO, oO0Ooooo>> f12797o00ooOO;
    @NotNull

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public final List<o00oo<o0OO00OO, oO0Ooooo>> f12798o00ooOO0;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public final List<o00oo<o0OO00OO, oO0Ooooo>> f12799o00ooOOo;
    @NotNull

    /* renamed from: o00ooOo  reason: collision with root package name */
    public final Context f12800o00ooOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public final List<o00oo<o0OO00OO, oO0Ooooo>> f12801o00ooOo0;
    @NotNull

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public final oo0oO0 f12802o00ooOoO;

    /* renamed from: o0O0o  reason: collision with root package name */
    public boolean f12803o0O0o;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public static final o00oOOo0 f12784o00ooo00 = new o00oOOo0(null);
    @NotNull

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public static oo0oO0 f12783o00ooOoo = o0OO00o.f12804o00oOOo0;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\nR(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lo0O0oo0O/o0OO00OO$o00oOOo0;", "", "Lo0O0oo0O/oo0oO0;", "DEFAULT_BEHAVIOR", "Lo0O0oo0O/oo0oO0;", o0OO000o.o00oOOoO.f12961o00oOo00, "()Lo0O0oo0O/oo0oO0;", "o00oOo00", "(Lo0O0oo0O/oo0oO0;)V", "DEFAULT_BEHAVIOR$annotations", "()V", "<init>", "core"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }

        @o00ooO0
        public static /* synthetic */ void o00oOOo0() {
        }

        @NotNull
        public final oo0oO0 o00oOOoO() {
            return o0OO00OO.f12783o00ooOoo;
        }

        public final void o00oOo00(@NotNull oo0oO0 oo0oo0) {
            o0ooO.o00oo0O(oo0oo0, "<set-?>");
            o0OO00OO.f12783o00ooOoo = oo0oo0;
        }
    }

    @o0O0oo0o(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 16})
    /* loaded from: classes.dex */
    public static final class o00oOOoO extends o0O0OO implements o0OOOO.o00oOOo0<Float> {
        public o00oOOoO() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final float invoke2() {
            Context context = o0OO00OO.this.getContext();
            o0ooO.o00oOoO(context, "context");
            return context.getResources().getDimension(R.dimen.md_dialog_default_corner_radius);
        }

        @Override // o0OOOO.o00oOOo0
        public /* bridge */ /* synthetic */ Float invoke() {
            return Float.valueOf(invoke2());
        }
    }

    @o0O0oo0o(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 16})
    /* loaded from: classes.dex */
    public static final class o00oOo00 extends o0O0OO implements o0OOOO.o00oOOo0<Integer> {
        public o00oOo00() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return o0O0OO0.o00oOo00(o0OO00OO.this, null, Integer.valueOf(R.attr.colorBackgroundFloating), null, 5, null);
        }

        @Override // o0OOOO.o00oOOo0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00OO(@NotNull Context context, @NotNull oo0oO0 oo0oo0) {
        super(context, o0OO0.o00oOOo0(context, oo0oo0));
        o0ooO.o00oo0O(context, "windowContext");
        o0ooO.o00oo0O(oo0oo0, "dialogBehavior");
        this.f12800o00ooOo = context;
        this.f12802o00ooOoO = oo0oo0;
        this.f12787o00oo0O0 = new LinkedHashMap();
        this.f12786o00oo0O = true;
        this.f12791o00oo0oO = true;
        this.f12803o0O0o = true;
        this.f12795o00ooO0O = new ArrayList();
        this.f12796o00ooO0o = new ArrayList();
        this.f12792o00ooO = new ArrayList();
        this.f12798o00ooOO0 = new ArrayList();
        this.f12797o00ooOO = new ArrayList();
        this.f12799o00ooOOo = new ArrayList();
        this.f12801o00ooOo0 = new ArrayList();
        LayoutInflater from = LayoutInflater.from(context);
        Window window = getWindow();
        if (window == null) {
            o0ooO.o00ooo0O();
        }
        o0ooO.o00oOoO(window, "window!!");
        o0ooO.o00oOoO(from, "layoutInflater");
        ViewGroup o00oOOo02 = oo0oo0.o00oOOo0(context, window, from, this);
        setContentView(o00oOOo02);
        DialogLayout o00oOo002 = oo0oo0.o00oOo00(o00oOOo02);
        o00oOo002.o00oOOoO(this);
        this.f12793o00ooO0 = o00oOo002;
        this.f12788o00oo0Oo = o0O0OOO.o00oOOoO(this, null, Integer.valueOf(R.attr.md_font_title), 1, null);
        this.f12790o00oo0o0 = o0O0OOO.o00oOOoO(this, null, Integer.valueOf(R.attr.md_font_body), 1, null);
        this.f12789o00oo0o = o0O0OOO.o00oOOoO(this, null, Integer.valueOf(R.attr.md_font_button), 1, null);
        o00ooOOo();
    }

    public /* synthetic */ o0OO00OO(Context context, oo0oO0 oo0oo0, int i, o0O00 o0o00) {
        this(context, (i & 2) != 0 ? f12783o00ooOoo : oo0oo0);
    }

    public static /* synthetic */ o0OO00OO o00oOoOo(o0OO00OO o0oo00oo, Float f, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            f = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        return o0oo00oo.o00oOoOO(f, num);
    }

    public static o0OO00OO o00oOooo(o0OO00OO o0oo00oo, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        o0oo00oo.f12793o00ooO0.setDebugMode(z);
        return o0oo00oo;
    }

    @NotNull
    public static final oo0oO0 o00oo0oO() {
        return f12783o00ooOoo;
    }

    public static /* synthetic */ o0OO00OO o00ooOO(o0OO00OO o0oo00oo, Integer num, Drawable drawable, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            drawable = null;
        }
        return o0oo00oo.o00ooOO0(num, drawable);
    }

    public static /* synthetic */ o0OO00OO o00ooOo(o0OO00OO o0oo00oo, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        return o0oo00oo.o00ooOo0(num, num2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ o0OO00OO o00ooOoo(o0OO00OO o0oo00oo, Integer num, CharSequence charSequence, o00oo o00ooVar, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            charSequence = null;
        }
        if ((i & 4) != 0) {
            o00ooVar = null;
        }
        return o0oo00oo.o00ooOoO(num, charSequence, o00ooVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ o0OO00OO o00ooo0(o0OO00OO o0oo00oo, Integer num, CharSequence charSequence, o00oo o00ooVar, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            charSequence = null;
        }
        if ((i & 4) != 0) {
            o00ooVar = null;
        }
        return o0oo00oo.o00ooo00(num, charSequence, o00ooVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ o0OO00OO o00ooo0o(o0OO00OO o0oo00oo, Integer num, CharSequence charSequence, o00oo o00ooVar, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            charSequence = null;
        }
        if ((i & 4) != 0) {
            o00ooVar = null;
        }
        return o0oo00oo.o00ooo0O(num, charSequence, o00ooVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ o0OO00OO o00oooo0(o0OO00OO o0oo00oo, Integer num, CharSequence charSequence, o00oo o00ooVar, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            charSequence = null;
        }
        if ((i & 4) != 0) {
            o00ooVar = null;
        }
        return o0oo00oo.o00oooOo(num, charSequence, o00ooVar);
    }

    public static final void o0O0000o(@NotNull oo0oO0 oo0oo0) {
        f12783o00ooOoo = oo0oo0;
    }

    public static /* synthetic */ o0OO00OO o0OoOoOO(o0OO00OO o0oo00oo, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return o0oo00oo.o0O000Oo(num, str);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (this.f12802o00ooOoO.onDismiss()) {
            return;
        }
        o0O0oOo.o0O0OO.o00oOOo0(this);
        super.dismiss();
    }

    public final void o0(boolean z) {
        this.f12791o00oo0oO = z;
    }

    @NotNull
    public final o0OO00OO o00oOo00(boolean z) {
        setCanceledOnTouchOutside(z);
        return this;
    }

    @NotNull
    public final o0OO00OO o00oOo0O() {
        this.f12799o00ooOOo.clear();
        return this;
    }

    @o0O0o(message = "Use of neutral buttons is discouraged, see https://material.io/design/components/dialogs.html#actions.")
    @NotNull
    public final o0OO00OO o00oOo0o() {
        this.f12801o00ooOo0.clear();
        return this;
    }

    public final <T> T o00oOoO(@NotNull String str) {
        o0ooO.o00oo0O(str, "key");
        return (T) this.f12787o00oo0O0.get(str);
    }

    @NotNull
    public final o0OO00OO o00oOoO0() {
        this.f12797o00ooOO.clear();
        return this;
    }

    @NotNull
    public final o0OO00OO o00oOoOO(@Nullable Float f, @o0O00oO0 @Nullable Integer num) {
        float applyDimension;
        o0OooO0.f12732o00oOOo0.o00oOOoO("cornerRadius", f, num);
        if (num != null) {
            applyDimension = this.f12800o00ooOo.getResources().getDimension(num.intValue());
        } else {
            Resources resources = this.f12800o00ooOo.getResources();
            o0ooO.o00oOoO(resources, "windowContext.resources");
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            if (f == null) {
                o0ooO.o00ooo0O();
            }
            applyDimension = TypedValue.applyDimension(1, f.floatValue(), displayMetrics);
        }
        this.f12785o00oo = Float.valueOf(applyDimension);
        o00ooOOo();
        return this;
    }

    @o0OoO00O
    @NotNull
    public final o0OO00OO o00oOoo0(boolean z) {
        this.f12793o00ooO0.setDebugMode(z);
        return this;
    }

    @NotNull
    public final o0OO00OO o00oOooO(boolean z) {
        setCancelable(z);
        return this;
    }

    @NotNull
    public final List<o00oo<o0OO00OO, oO0Ooooo>> o00oo() {
        return this.f12792o00ooO;
    }

    @Nullable
    public final Typeface o00oo0() {
        return this.f12790o00oo0o0;
    }

    public final boolean o00oo00O() {
        return this.f12786o00oo0O;
    }

    public final boolean o00oo0O() {
        return this.f12791o00oo0oO;
    }

    @NotNull
    public final List<o00oo<o0OO00OO, oO0Ooooo>> o00oo0O0() {
        return this.f12798o00ooOO0;
    }

    @Nullable
    public final Typeface o00oo0OO() {
        return this.f12789o00oo0o;
    }

    public final boolean o00oo0Oo() {
        return this.f12803o0O0o;
    }

    @Nullable
    public final Float o00oo0o() {
        return this.f12785o00oo;
    }

    @NotNull
    public final Map<String, Object> o00oo0o0() {
        return this.f12787o00oo0O0;
    }

    @NotNull
    public final Context o00ooO() {
        return this.f12800o00ooOo;
    }

    @NotNull
    public final List<o00oo<o0OO00OO, oO0Ooooo>> o00ooO0() {
        return this.f12796o00ooO0o;
    }

    @NotNull
    public final List<o00oo<o0OO00OO, oO0Ooooo>> o00ooO00() {
        return this.f12795o00ooO0O;
    }

    @Nullable
    public final Typeface o00ooO0O() {
        return this.f12788o00oo0Oo;
    }

    @NotNull
    public final DialogLayout o00ooO0o() {
        return this.f12793o00ooO0;
    }

    @NotNull
    public final o0OO00OO o00ooOO0(@o0O0O0o0 @Nullable Integer num, @Nullable Drawable drawable) {
        o0OooO0.f12732o00oOOo0.o00oOOoO("icon", drawable, num);
        o0O0oOo.o0O0OO.o00oOo00(this, this.f12793o00ooO0.getTitleLayout().getIconView$core(), num, drawable);
        return this;
    }

    public final void o00ooOOo() {
        int o00oOo002 = o0O0OO0.o00oOo00(this, null, Integer.valueOf(R.attr.md_background_color), new o00oOo00(), 1, null);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        oo0oO0 oo0oo0 = this.f12802o00ooOoO;
        DialogLayout dialogLayout = this.f12793o00ooO0;
        Float f = this.f12785o00oo;
        oo0oo0.o00oOooO(dialogLayout, o00oOo002, f != null ? f.floatValue() : o0OooO0.f12732o00oOOo0.o00oo0o(this.f12800o00ooOo, R.attr.md_corner_radius, new o00oOOoO()));
    }

    @NotNull
    public final o0OO00OO o00ooOo0(@o0O00oO0 @Nullable Integer num, @o00oOooO.o0OO0 @Nullable Integer num2) {
        o0OooO0.f12732o00oOOo0.o00oOOoO("maxWidth", num, num2);
        Integer num3 = this.f12794o00ooO00;
        boolean z = (num3 == null || num3 == null || num3.intValue() != 0) ? false : true;
        if (num != null) {
            num2 = Integer.valueOf(this.f12800o00ooOo.getResources().getDimensionPixelSize(num.intValue()));
        } else if (num2 == null) {
            o0ooO.o00ooo0O();
        }
        this.f12794o00ooO00 = num2;
        if (z) {
            o0O000O();
        }
        return this;
    }

    @NotNull
    public final o0OO00OO o00ooOoO(@o0OOO0O @Nullable Integer num, @Nullable CharSequence charSequence, @Nullable o00oo<? super oo0oOOo.o00oOo00, oO0Ooooo> o00ooVar) {
        o0OooO0.f12732o00oOOo0.o00oOOoO("message", charSequence, num);
        this.f12793o00ooO0.getContentLayout().o00oOoOO(this, num, charSequence, this.f12790o00oo0o0, o00ooVar);
        return this;
    }

    @NotNull
    public final o0OO00OO o00ooo00(@o0OOO0O @Nullable Integer num, @Nullable CharSequence charSequence, @Nullable o00oo<? super o0OO00OO, oO0Ooooo> o00ooVar) {
        if (o00ooVar != null) {
            this.f12799o00ooOOo.add(o00ooVar);
        }
        DialogActionButton o00oOOo02 = oooOO0.o00oOOo0.o00oOOo0(this, o0OO0O0.NEGATIVE);
        if (num != null || charSequence != null || !oo0OOoo.o00oOoO0(o00oOOo02)) {
            o0O0oOo.o0O0OO.o00oOo0O(this, o00oOOo02, num, charSequence, 17039360, this.f12789o00oo0o, null, 32, null);
        }
        return this;
    }

    @o0O0o(message = "Use of neutral buttons is discouraged, see https://material.io/design/components/dialogs.html#actions.")
    @NotNull
    public final o0OO00OO o00ooo0O(@o0OOO0O @Nullable Integer num, @Nullable CharSequence charSequence, @Nullable o00oo<? super o0OO00OO, oO0Ooooo> o00ooVar) {
        if (o00ooVar != null) {
            this.f12801o00ooOo0.add(o00ooVar);
        }
        DialogActionButton o00oOOo02 = oooOO0.o00oOOo0.o00oOOo0(this, o0OO0O0.NEUTRAL);
        if (num != null || charSequence != null || !oo0OOoo.o00oOoO0(o00oOOo02)) {
            o0O0oOo.o0O0OO.o00oOo0O(this, o00oOOo02, num, charSequence, 0, this.f12789o00oo0o, null, 40, null);
        }
        return this;
    }

    @o0OoO00O
    @NotNull
    public final o0OO00OO o00oooO() {
        this.f12786o00oo0O = false;
        return this;
    }

    public final void o00oooOO(@NotNull o0OO0O0 o0oo0o0) {
        List<o00oo<o0OO00OO, oO0Ooooo>> list;
        o0ooO.o00oo0O(o0oo0o0, "which");
        int i = o0OO00o0.f12807o00oOOo0[o0oo0o0.ordinal()];
        if (i != 1) {
            if (i == 2) {
                list = this.f12799o00ooOOo;
            } else if (i == 3) {
                list = this.f12801o00ooOo0;
            }
            o0O000O.o00oOOo0(list, this);
        } else {
            o0O000O.o00oOOo0(this.f12797o00ooOO, this);
            RecyclerView.o00oo0OO<?> o00oOooO2 = o0O0oOo0.o0O00oO0.o00oOooO(this);
            if (!(o00oOooO2 instanceof o0O00OO)) {
                o00oOooO2 = null;
            }
            o0O00OO o0o00oo = (o0O00OO) o00oOooO2;
            if (o0o00oo != null) {
                o0o00oo.o00oo0O0();
            }
        }
        if (this.f12786o00oo0O) {
            dismiss();
        }
    }

    @NotNull
    public final o0OO00OO o00oooOo(@o0OOO0O @Nullable Integer num, @Nullable CharSequence charSequence, @Nullable o00oo<? super o0OO00OO, oO0Ooooo> o00ooVar) {
        if (o00ooVar != null) {
            this.f12797o00ooOO.add(o00ooVar);
        }
        DialogActionButton o00oOOo02 = oooOO0.o00oOOo0.o00oOOo0(this, o0OO0O0.POSITIVE);
        if (num == null && charSequence == null && oo0OOoo.o00oOoO0(o00oOOo02)) {
            return this;
        }
        o0O0oOo.o0O0OO.o00oOo0O(this, o00oOOo02, num, charSequence, 17039370, this.f12789o00oo0o, null, 32, null);
        return this;
    }

    public final void o00oooo(boolean z) {
        this.f12786o00oo0O = z;
    }

    public final void o00ooooO(@Nullable Typeface typeface) {
        this.f12790o00oo0o0 = typeface;
    }

    public final void o00ooooo(@Nullable Typeface typeface) {
        this.f12789o00oo0o = typeface;
    }

    public final void o0O000(@Nullable Typeface typeface) {
        this.f12788o00oo0Oo = typeface;
    }

    public final void o0O00000(boolean z) {
        this.f12803o0O0o = z;
    }

    public final void o0O0000O(@Nullable Float f) {
        this.f12785o00oo = f;
    }

    public final void o0O000O() {
        oo0oO0 oo0oo0 = this.f12802o00ooOoO;
        Context context = this.f12800o00ooOo;
        Integer num = this.f12794o00ooO00;
        Window window = getWindow();
        if (window == null) {
            o0ooO.o00ooo0O();
        }
        o0ooO.o00oOoO(window, "window!!");
        oo0oo0.o00oOo0O(context, window, this.f12793o00ooO0, num);
    }

    @NotNull
    public final o0OO00OO o0O000Oo(@o0OOO0O @Nullable Integer num, @Nullable String str) {
        o0OooO0.f12732o00oOOo0.o00oOOoO(oO0O0O0.f9045o00oOo0O, str, num);
        o0O0oOo.o0O0OO.o00oOo0O(this, this.f12793o00ooO0.getTitleLayout().getTitleView$core(), num, str, 0, this.f12788o00oo0Oo, Integer.valueOf(R.attr.md_color_title), 8, null);
        return this;
    }

    @NotNull
    public final oo0oO0 o0O0o() {
        return this.f12802o00ooOoO;
    }

    @NotNull
    public final o0OO00OO o0OoOoOo(@NotNull o00oo<? super o0OO00OO, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O(o00ooVar, "func");
        o00ooVar.invoke(this);
        show();
        return this;
    }

    @Override // android.app.Dialog
    @o0O0o(message = "Use fluent cancelable(Boolean) instead.", replaceWith = @o0OO000(expression = "cancelable(cancelable)", imports = {}))
    public void setCancelable(boolean z) {
        this.f12803o0O0o = z;
        super.setCancelable(z);
    }

    @Override // android.app.Dialog
    @o0O0o(message = "Use fluent cancelOnTouchOutside(Boolean) instead.", replaceWith = @o0OO000(expression = "cancelOnTouchOutside(cancelOnTouchOutside)", imports = {}))
    public void setCanceledOnTouchOutside(boolean z) {
        this.f12791o00oo0oO = z;
        super.setCanceledOnTouchOutside(z);
    }

    @Override // android.app.Dialog
    public void show() {
        o0O000O();
        o0O0oOo.o0O0OO.o00oOo0o(this);
        this.f12802o00ooOoO.o00oOoO0(this);
        super.show();
        this.f12802o00ooOoO.o00oOo0o(this);
    }
}
