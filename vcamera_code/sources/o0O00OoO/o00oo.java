package o0O00OoO;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import o00oOooO.o0OO0oO;
import o00oOooO.o0o0000;
import o0O00OoO.o00oo;
import o0OO0oO.o0O0OO;
import o0OO0oO.o0O0oo0o;
import o0OO0oO.oo0ooO;
import o0OOOO0o.o00oOoO;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001:\u00032'*B\t\b\u0002¢\u0006\u0004\b0\u00101J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0007J \u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0007J\u0012\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J0\u0010\"\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001b2\u000e\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u001f2\u000e\u0010!\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u001fH\u0002J\u0018\u0010#\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0018\u0010&\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$H\u0002R\u0014\u0010)\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010(R\"\u0010/\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,\"\u0004\b-\u0010.¨\u00063"}, d2 = {"Lo0O00OoO/o00oo;", "", "Landroidx/fragment/app/Fragment;", "fragment", "", "previousFragmentId", "Lo0OO0o/oO0Ooooo;", "o00oOoOO", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "o00oOoOo", "o00oo0OO", "o00oOoo0", "", "isVisibleToUser", "o00oo0O", "violatingFragment", "targetFragment", "", "requestCode", "o00oo0O0", "o00oo00O", "o00oOooo", "o00oo0Oo", "Lo0O00OoO/o0O000o0;", "violation", "o00oo0", "Lo0O00OoO/o00oo$o00oOo00;", "o00oOooO", "o00oOoO", "policy", "Ljava/lang/Class;", "fragmentClass", "violationClass", "o00oo0oO", "o00oOo0O", "Ljava/lang/Runnable;", "runnable", "o00oo0o0", o0OO000o.o00oOOoO.f12961o00oOo00, "Ljava/lang/String;", "TAG", "o00oOo00", "Lo0O00OoO/o00oo$o00oOo00;", "()Lo0O00OoO/o00oo$o00oOo00;", "o00oo0o", "(Lo0O00OoO/o00oo$o00oOo00;)V", "defaultPolicy", "<init>", "()V", "o00oOOo0", "fragment_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class o00oo {
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f11118o00oOOoO = "FragmentStrictMode";
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o00oo f11117o00oOOo0 = new o00oo();
    @NotNull

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static o00oOo00 f11119o00oOo00 = o00oOo00.f11120o00oOo0O;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lo0O00OoO/o00oo$o00oOOo0;", "", "<init>", "(Ljava/lang/String;I)V", "PENALTY_LOG", "PENALTY_DEATH", "DETECT_FRAGMENT_REUSE", "DETECT_FRAGMENT_TAG_USAGE", "DETECT_RETAIN_INSTANCE_USAGE", "DETECT_SET_USER_VISIBLE_HINT", "DETECT_TARGET_FRAGMENT_USAGE", "DETECT_WRONG_FRAGMENT_CONTAINER", "fragment_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public enum o00oOOo0 {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lo0O00OoO/o00oo$o00oOOoO;", "", "Lo0O00OoO/o0O000o0;", "violation", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "fragment_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public interface o00oOOoO {
        void o00oOOo0(@NotNull o0O000o0 o0o000o0);
    }

    @Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0002\u0004\tBC\b\u0000\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012 \u0010\u0016\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f0\u00150\r¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR4\u0010\u0014\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f0\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u001a"}, d2 = {"Lo0O00OoO/o00oo$o00oOo00;", "", "", "Lo0O00OoO/o00oo$o00oOOo0;", "o00oOOo0", "Ljava/util/Set;", "()Ljava/util/Set;", "flags", "Lo0O00OoO/o00oo$o00oOOoO;", o0OO000o.o00oOOoO.f12961o00oOo00, "Lo0O00OoO/o00oo$o00oOOoO;", "()Lo0O00OoO/o00oo$o00oOOoO;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "", "Ljava/lang/Class;", "Lo0O00OoO/o0O000o0;", "o00oOo00", "Ljava/util/Map;", "()Ljava/util/Map;", "mAllowedViolations", "", "allowedViolations", "<init>", "(Ljava/util/Set;Lo0O00OoO/o00oo$o00oOOoO;Ljava/util/Map;)V", "o00oOooO", "fragment_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class o00oOo00 {
        @NotNull

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Set<o00oOOo0> f11122o00oOOo0;
        @Nullable

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final o00oOOoO f11123o00oOOoO;
        @NotNull

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final Map<String, Set<Class<? extends o0O000o0>>> f11124o00oOo00;
        @NotNull

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final o00oOOoO f11121o00oOooO = new o00oOOoO(null);
        @o00oOoO
        @NotNull

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static final o00oOo00 f11120o00oOo0O = new o00oOo00(o0O0OO.INSTANCE, null, oo0ooO.o00ooO0O());

        @Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0002\u001a\u00020\u0000H\u0007J\b\u0010\u0003\u001a\u00020\u0000H\u0007J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0000H\u0007J\b\u0010\b\u001a\u00020\u0000H\u0007J\b\u0010\t\u001a\u00020\u0000H\u0007J\b\u0010\n\u001a\u00020\u0000H\u0007J\b\u0010\u000b\u001a\u00020\u0000H\u0007J\b\u0010\f\u001a\u00020\u0000H\u0007J(\u0010\u0012\u001a\u00020\u00002\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\rH\u0007J \u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00132\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\rH\u0007J\u0006\u0010\u0016\u001a\u00020\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR.\u0010\u001e\u001a\u001c\u0012\u0004\u0012\u00020\u0013\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\r0\u00170\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001d¨\u0006!"}, d2 = {"Lo0O00OoO/o00oo$o00oOo00$o00oOOo0;", "", "o00oOooo", "o00oOoOo", "Lo0O00OoO/o00oo$o00oOOoO;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "o00oOoo0", "o00oOooO", "o00oOo0O", "o00oOo0o", "o00oOoO0", "o00oOoO", "o00oOoOO", "Ljava/lang/Class;", "Landroidx/fragment/app/Fragment;", "fragmentClass", "Lo0O00OoO/o0O000o0;", "violationClass", "o00oOOo0", "", o0OO000o.o00oOOoO.f12961o00oOo00, "Lo0O00OoO/o00oo$o00oOo00;", "o00oOo00", "", "Lo0O00OoO/o00oo$o00oOOo0;", "Ljava/util/Set;", "flags", "Lo0O00OoO/o00oo$o00oOOoO;", "", "Ljava/util/Map;", "mAllowedViolations", "<init>", "()V", "fragment_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class o00oOOo0 {
            @Nullable

            /* renamed from: o00oOOoO  reason: collision with root package name */
            public o00oOOoO f11126o00oOOoO;
            @NotNull

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public final Set<o00oOOo0> f11125o00oOOo0 = new LinkedHashSet();
            @NotNull

            /* renamed from: o00oOo00  reason: collision with root package name */
            public final Map<String, Set<Class<? extends o0O000o0>>> f11127o00oOo00 = new LinkedHashMap();

            @SuppressLint({"BuilderSetStyle"})
            @NotNull
            public final o00oOOo0 o00oOOo0(@NotNull Class<? extends Fragment> cls, @NotNull Class<? extends o0O000o0> cls2) {
                o0ooO.o00oo0O0(cls, "fragmentClass");
                o0ooO.o00oo0O0(cls2, "violationClass");
                String name = cls.getName();
                o0ooO.o00oo0OO(name, "fragmentClassString");
                return o00oOOoO(name, cls2);
            }

            @SuppressLint({"BuilderSetStyle"})
            @NotNull
            public final o00oOOo0 o00oOOoO(@NotNull String str, @NotNull Class<? extends o0O000o0> cls) {
                o0ooO.o00oo0O0(str, "fragmentClass");
                o0ooO.o00oo0O0(cls, "violationClass");
                Set<Class<? extends o0O000o0>> set = this.f11127o00oOo00.get(str);
                if (set == null) {
                    set = new LinkedHashSet<>();
                }
                set.add(cls);
                this.f11127o00oOo00.put(str, set);
                return this;
            }

            @NotNull
            public final o00oOo00 o00oOo00() {
                if (this.f11126o00oOOoO == null && !this.f11125o00oOOo0.contains(o00oOOo0.PENALTY_DEATH)) {
                    o00oOooo();
                }
                return new o00oOo00(this.f11125o00oOOo0, this.f11126o00oOOoO, this.f11127o00oOo00);
            }

            @SuppressLint({"BuilderSetStyle"})
            @NotNull
            public final o00oOOo0 o00oOo0O() {
                this.f11125o00oOOo0.add(o00oOOo0.DETECT_FRAGMENT_TAG_USAGE);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @NotNull
            public final o00oOOo0 o00oOo0o() {
                this.f11125o00oOOo0.add(o00oOOo0.DETECT_RETAIN_INSTANCE_USAGE);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @NotNull
            public final o00oOOo0 o00oOoO() {
                this.f11125o00oOOo0.add(o00oOOo0.DETECT_TARGET_FRAGMENT_USAGE);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @NotNull
            public final o00oOOo0 o00oOoO0() {
                this.f11125o00oOOo0.add(o00oOOo0.DETECT_SET_USER_VISIBLE_HINT);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @NotNull
            public final o00oOOo0 o00oOoOO() {
                this.f11125o00oOOo0.add(o00oOOo0.DETECT_WRONG_FRAGMENT_CONTAINER);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @NotNull
            public final o00oOOo0 o00oOoOo() {
                this.f11125o00oOOo0.add(o00oOOo0.PENALTY_DEATH);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @NotNull
            public final o00oOOo0 o00oOoo0(@NotNull o00oOOoO o00ooooo2) {
                o0ooO.o00oo0O0(o00ooooo2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                this.f11126o00oOOoO = o00ooooo2;
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @NotNull
            public final o00oOOo0 o00oOooO() {
                this.f11125o00oOOo0.add(o00oOOo0.DETECT_FRAGMENT_REUSE);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @NotNull
            public final o00oOOo0 o00oOooo() {
                this.f11125o00oOOo0.add(o00oOOo0.PENALTY_LOG);
                return this;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lo0O00OoO/o00oo$o00oOo00$o00oOOoO;", "", "Lo0O00OoO/o00oo$o00oOo00;", "LAX", "Lo0O00OoO/o00oo$o00oOo00;", "<init>", "()V", "fragment_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class o00oOOoO {
            public o00oOOoO() {
            }

            public o00oOOoO(o0OOOOO0.o0O00 o0o00) {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public o00oOo00(@NotNull Set<? extends o00oOOo0> set, @Nullable o00oOOoO o00ooooo2, @NotNull Map<String, ? extends Set<Class<? extends o0O000o0>>> map) {
            o0ooO.o00oo0O0(set, "flags");
            o0ooO.o00oo0O0(map, "allowedViolations");
            this.f11122o00oOOo0 = set;
            this.f11123o00oOOoO = o00ooooo2;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Set<Class<? extends o0O000o0>>> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            this.f11124o00oOo00 = linkedHashMap;
        }

        @NotNull
        public final Set<o00oOOo0> o00oOOo0() {
            return this.f11122o00oOOo0;
        }

        @Nullable
        public final o00oOOoO o00oOOoO() {
            return this.f11123o00oOOoO;
        }

        @NotNull
        public final Map<String, Set<Class<? extends o0O000o0>>> o00oOo00() {
            return this.f11124o00oOo00;
        }
    }

    public static final void o00oOo0o(o00oOo00 o00ooo002, o0O000o0 o0o000o0) {
        o0ooO.o00oo0O0(o00ooo002, "$policy");
        o0ooO.o00oo0O0(o0o000o0, "$violation");
        o00ooo002.f11123o00oOOoO.o00oOOo0(o0o000o0);
    }

    public static final void o00oOoO0(String str, o0O000o0 o0o000o0) {
        o0ooO.o00oo0O0(o0o000o0, "$violation");
        throw o0o000o0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OOOO0o.o00ooO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public static final void o00oOoOO(@NotNull Fragment fragment, @NotNull String str) {
        o0ooO.o00oo0O0(fragment, "fragment");
        o0ooO.o00oo0O0(str, "previousFragmentId");
        o00oo0O0 o00oo0o02 = new o00oo0O0(fragment, str);
        o00oo o00ooVar = f11117o00oOOo0;
        o00ooVar.o00oOoO(o00oo0o02);
        o00oOo00 o00oOooO2 = o00ooVar.o00oOooO(fragment);
        if (o00oOooO2.f11122o00oOOo0.contains(o00oOOo0.DETECT_FRAGMENT_REUSE) && o00ooVar.o00oo0oO(o00oOooO2, fragment.getClass(), o00oo0o02.getClass())) {
            o00ooVar.o00oOo0O(o00oOooO2, o00oo0o02);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OOOO0o.o00ooO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public static final void o00oOoOo(@NotNull Fragment fragment, @Nullable ViewGroup viewGroup) {
        o0ooO.o00oo0O0(fragment, "fragment");
        o00ooO0 o00ooo02 = new o00ooO0(fragment, viewGroup);
        o00oo o00ooVar = f11117o00oOOo0;
        o00ooVar.o00oOoO(o00ooo02);
        o00oOo00 o00oOooO2 = o00ooVar.o00oOooO(fragment);
        if (o00oOooO2.f11122o00oOOo0.contains(o00oOOo0.DETECT_FRAGMENT_TAG_USAGE) && o00ooVar.o00oo0oO(o00oOooO2, fragment.getClass(), o00ooo02.getClass())) {
            o00ooVar.o00oOo0O(o00oOooO2, o00ooo02);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OOOO0o.o00ooO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public static final void o00oOoo0(@NotNull Fragment fragment) {
        o0ooO.o00oo0O0(fragment, "fragment");
        o00ooO o00ooo = new o00ooO(fragment);
        o00oo o00ooVar = f11117o00oOOo0;
        o00ooVar.o00oOoO(o00ooo);
        o00oOo00 o00oOooO2 = o00ooVar.o00oOooO(fragment);
        if (o00oOooO2.f11122o00oOOo0.contains(o00oOOo0.DETECT_RETAIN_INSTANCE_USAGE) && o00ooVar.o00oo0oO(o00oOooO2, fragment.getClass(), o00ooo.getClass())) {
            o00ooVar.o00oOo0O(o00oOooO2, o00ooo);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OOOO0o.o00ooO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public static final void o00oOooo(@NotNull Fragment fragment) {
        o0ooO.o00oo0O0(fragment, "fragment");
        o0 o0Var = new o0(fragment);
        o00oo o00ooVar = f11117o00oOOo0;
        o00ooVar.o00oOoO(o0Var);
        o00oOo00 o00oOooO2 = o00ooVar.o00oOooO(fragment);
        if (o00oOooO2.f11122o00oOOo0.contains(o00oOOo0.DETECT_TARGET_FRAGMENT_USAGE) && o00ooVar.o00oo0oO(o00oOooO2, fragment.getClass(), o0Var.getClass())) {
            o00ooVar.o00oOo0O(o00oOooO2, o0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OOOO0o.o00ooO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public static final void o00oo00O(@NotNull Fragment fragment) {
        o0ooO.o00oo0O0(fragment, "fragment");
        o0O00000 o0o00000 = new o0O00000(fragment);
        o00oo o00ooVar = f11117o00oOOo0;
        o00ooVar.o00oOoO(o0o00000);
        o00oOo00 o00oOooO2 = o00ooVar.o00oOooO(fragment);
        if (o00oOooO2.f11122o00oOOo0.contains(o00oOOo0.DETECT_TARGET_FRAGMENT_USAGE) && o00ooVar.o00oo0oO(o00oOooO2, fragment.getClass(), o0o00000.getClass())) {
            o00ooVar.o00oOo0O(o00oOooO2, o0o00000);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OOOO0o.o00ooO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public static final void o00oo0O(@NotNull Fragment fragment, boolean z) {
        o0ooO.o00oo0O0(fragment, "fragment");
        o0OoOoOo o0oooooo = new o0OoOoOo(fragment, z);
        o00oo o00ooVar = f11117o00oOOo0;
        o00ooVar.o00oOoO(o0oooooo);
        o00oOo00 o00oOooO2 = o00ooVar.o00oOooO(fragment);
        if (o00oOooO2.f11122o00oOOo0.contains(o00oOOo0.DETECT_SET_USER_VISIBLE_HINT) && o00ooVar.o00oo0oO(o00oOooO2, fragment.getClass(), o0oooooo.getClass())) {
            o00ooVar.o00oOo0O(o00oOooO2, o0oooooo);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OOOO0o.o00ooO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public static final void o00oo0O0(@NotNull Fragment fragment, @NotNull Fragment fragment2, int i) {
        o0ooO.o00oo0O0(fragment, "violatingFragment");
        o0ooO.o00oo0O0(fragment2, "targetFragment");
        o0O000O o0o000o = new o0O000O(fragment, fragment2, i);
        o00oo o00ooVar = f11117o00oOOo0;
        o00ooVar.o00oOoO(o0o000o);
        o00oOo00 o00oOooO2 = o00ooVar.o00oOooO(fragment);
        if (o00oOooO2.f11122o00oOOo0.contains(o00oOOo0.DETECT_TARGET_FRAGMENT_USAGE) && o00ooVar.o00oo0oO(o00oOooO2, fragment.getClass(), o0o000o.getClass())) {
            o00ooVar.o00oOo0O(o00oOooO2, o0o000o);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OOOO0o.o00ooO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public static final void o00oo0OO(@NotNull Fragment fragment) {
        o0ooO.o00oo0O0(fragment, "fragment");
        o0O000 o0o000 = new o0O000(fragment);
        o00oo o00ooVar = f11117o00oOOo0;
        o00ooVar.o00oOoO(o0o000);
        o00oOo00 o00oOooO2 = o00ooVar.o00oOooO(fragment);
        if (o00oOooO2.f11122o00oOOo0.contains(o00oOOo0.DETECT_RETAIN_INSTANCE_USAGE) && o00ooVar.o00oo0oO(o00oOooO2, fragment.getClass(), o0o000.getClass())) {
            o00ooVar.o00oOo0O(o00oOooO2, o0o000);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OOOO0o.o00ooO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public static final void o00oo0Oo(@NotNull Fragment fragment, @NotNull ViewGroup viewGroup) {
        o0ooO.o00oo0O0(fragment, "fragment");
        o0ooO.o00oo0O0(viewGroup, TtmlNode.RUBY_CONTAINER);
        o0O00 o0o00 = new o0O00(fragment, viewGroup);
        o00oo o00ooVar = f11117o00oOOo0;
        o00ooVar.o00oOoO(o0o00);
        o00oOo00 o00oOooO2 = o00ooVar.o00oOooO(fragment);
        if (o00oOooO2.f11122o00oOOo0.contains(o00oOOo0.DETECT_WRONG_FRAGMENT_CONTAINER) && o00ooVar.o00oo0oO(o00oOooO2, fragment.getClass(), o0o00.getClass())) {
            o00ooVar.o00oOo0O(o00oOooO2, o0o00);
        }
    }

    @NotNull
    public final o00oOo00 o00oOo00() {
        return f11119o00oOo00;
    }

    public final void o00oOo0O(final o00oOo00 o00ooo002, final o0O000o0 o0o000o0) {
        Fragment fragment = o0o000o0.getFragment();
        final String name = fragment.getClass().getName();
        o00ooo002.f11122o00oOOo0.contains(o00oOOo0.PENALTY_LOG);
        if (o00ooo002.f11123o00oOOoO != null) {
            o00oo0o0(fragment, new Runnable() { // from class: o0O00OoO.o00oo0O
                @Override // java.lang.Runnable
                public final void run() {
                    o00oo.o00oOo0o(o00oo.o00oOo00.this, o0o000o0);
                }
            });
        }
        if (o00ooo002.f11122o00oOOo0.contains(o00oOOo0.PENALTY_DEATH)) {
            o00oo0o0(fragment, new Runnable() { // from class: o0O00OoO.o0O0o
                @Override // java.lang.Runnable
                public final void run() {
                    o00oo.o00oOoO0(name, o0o000o0);
                }
            });
        }
    }

    public final void o00oOoO(o0O000o0 o0o000o0) {
        if (FragmentManager.oo0OOoo(3)) {
            o0o000o0.getFragment().getClass();
        }
    }

    public final o00oOo00 o00oOooO(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                o0ooO.o00oo0OO(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.o0OooO0() != null) {
                    o00oOo00 o0OooO02 = parentFragmentManager.o0OooO0();
                    o0ooO.o00oo00O(o0OooO02);
                    return o0OooO02;
                }
            }
            fragment = fragment.getParentFragment();
        }
        return f11119o00oOo00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0o0000
    public final void o00oo0(@NotNull o0O000o0 o0o000o0) {
        o0ooO.o00oo0O0(o0o000o0, "violation");
        o00oOoO(o0o000o0);
        Fragment fragment = o0o000o0.getFragment();
        o00oOo00 o00oOooO2 = o00oOooO(fragment);
        if (o00oo0oO(o00oOooO2, fragment.getClass(), o0o000o0.getClass())) {
            o00oOo0O(o00oOooO2, o0o000o0);
        }
    }

    public final void o00oo0o(@NotNull o00oOo00 o00ooo002) {
        o0ooO.o00oo0O0(o00ooo002, "<set-?>");
        f11119o00oOo00 = o00ooo002;
    }

    public final void o00oo0o0(Fragment fragment, Runnable runnable) {
        if (fragment.isAdded()) {
            Handler o00oOooo2 = fragment.getParentFragmentManager().o0O0OOO0().o00oOooo();
            o0ooO.o00oo0OO(o00oOooo2, "fragment.parentFragmentManager.host.handler");
            if (!o0ooO.o00oOoO0(o00oOooo2.getLooper(), Looper.myLooper())) {
                o00oOooo2.post(runnable);
                return;
            }
        }
        runnable.run();
    }

    public final boolean o00oo0oO(o00oOo00 o00ooo002, Class<? extends Fragment> cls, Class<? extends o0O000o0> cls2) {
        Set<Class<? extends o0O000o0>> set = o00ooo002.f11124o00oOo00.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (o0ooO.o00oOoO0(cls2.getSuperclass(), o0O000o0.class) || !o0O0oo0o.o0OO00OO(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
