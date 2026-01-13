package o0O0OoOo;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import o00oOooO.o0o0000;
import o0O0OoO.o00oo0O0;
import o0O0OoOo.o0O0O0O;
import o0O0OoOo.o0oO0O0o;
import o0O0OoOo.o0ooO;
import o0OO0o.oO0Ooooo;
import o0ooOoOO.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0003\u0007\u0004\nB\u0013\b\u0007\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b-\u0010\u001dJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016J,\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH\u0016J\u001c\u0010\u0015\u001a\u00020\u00062\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016R$\u0010\u001e\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR&\u0010&\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\u0018\u0010)\u001a\u00060'R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010(R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+¨\u0006."}, d2 = {"Lo0O0OoOo/o0ooO;", "Lo0O0OoOo/o0O00oO0;", "", "Lo0O0OoOo/o0O0oo0o;", o0OO000o.o00oOOoO.f12961o00oOo00, "rules", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "rule", "o00oOooO", "o00oOo00", "Landroid/app/Activity;", "activity", "Ljava/util/concurrent/Executor;", "executor", "Lo0ooOoOO/o;", "", "Lo0O0OoOo/o0O0OOO;", "callback", "o00oOo0O", "consumer", "o00oOoO0", "", "o00oOo0o", "Lo0O0OoOo/o0oO0O0o;", "Lo0O0OoOo/o0oO0O0o;", "o00oOoo0", "()Lo0O0OoOo/o0oO0O0o;", "o00oo0", "(Lo0O0OoOo/o0oO0O0o;)V", "embeddingExtension", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lo0O0OoOo/o0ooO$o00oOo00;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "o00oOooo", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "getSplitChangeCallbacks$annotations", "()V", "splitChangeCallbacks", "Lo0O0OoOo/o0ooO$o00oOOoO;", "Lo0O0OoOo/o0ooO$o00oOOoO;", "splitInfoEmbeddingCallback", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "splitRules", "<init>", "window_release"}, k = 1, mv = {1, 6, 0})
@o00oo0O0
/* loaded from: classes.dex */
public final class o0ooO implements o0O00oO0 {
    @Nullable

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static volatile o0ooO f12037o00oOo0o = null;
    @NotNull

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final String f12038o00oOoO = "EmbeddingBackend";
    @o00oOooO.o0O0OOOo("globalLock")
    @o0o0000
    @Nullable

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public o0oO0O0o f12040o00oOOo0;
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final CopyOnWriteArrayList<o00oOo00> f12041o00oOOoO;
    @NotNull

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final o00oOOoO f12042o00oOo00;
    @NotNull

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final CopyOnWriteArraySet<o0O0oo0o> f12043o00oOooO;
    @NotNull

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final o00oOOo0 f12036o00oOo0O = new o00oOOo0(null);
    @NotNull

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final ReentrantLock f12039o00oOoO0 = new ReentrantLock();

    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\n\u0010\n\u001a\u0004\u0018\u00010\tH\u0002R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lo0O0OoOo/o0ooO$o00oOOo0;", "", "Lo0O0OoOo/o0ooO;", "o00oOOo0", "", "extensionVersion", "", "o00oOo00", "(Ljava/lang/Integer;)Z", "Lo0O0OoOo/o0oO0O0o;", o0OO000o.o00oOOoO.f12961o00oOo00, "", "TAG", "Ljava/lang/String;", "globalInstance", "Lo0O0OoOo/o0ooO;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0OOOOO0.o0O00 o0o00) {
        }

        @NotNull
        public final o0ooO o00oOOo0() {
            if (o0ooO.f12037o00oOo0o == null) {
                ReentrantLock reentrantLock = o0ooO.f12039o00oOoO0;
                reentrantLock.lock();
                try {
                    if (o0ooO.f12037o00oOo0o == null) {
                        o0ooO.f12037o00oOo0o = new o0ooO(o0ooO.f12036o00oOo0O.o00oOOoO());
                    }
                    oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
                } finally {
                    reentrantLock.unlock();
                }
            }
            o0ooO o0ooo = o0ooO.f12037o00oOo0o;
            o0OOOOO0.o0ooO.o00oo00O(o0ooo);
            return o0ooo;
        }

        public final o0oO0O0o o00oOOoO() {
            try {
                o0O0O0O.o00oOOo0 o00oooo02 = o0O0O0O.f11999o00oOo00;
                if (o00oOo00(o00oooo02.o00oOOoO()) && o00oooo02.o00oOo00()) {
                    return new o0O0O0O();
                }
                return null;
            } catch (Throwable th) {
                o0OOOOO0.o0ooO.o00ooOO0("Failed to load embedding extension: ", th);
                return null;
            }
        }

        @o0o0000
        public final boolean o00oOo00(@Nullable Integer num) {
            return num != null && num.intValue() >= 1;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R*\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lo0O0OoOo/o0ooO$o00oOOoO;", "Lo0O0OoOo/o0oO0O0o$o00oOOo0;", "", "Lo0O0OoOo/o0O0OOO;", "splitInfo", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "Ljava/util/List;", o0OO000o.o00oOOoO.f12961o00oOo00, "()Ljava/util/List;", "o00oOo00", "(Ljava/util/List;)V", "lastInfo", "<init>", "(Lo0O0OoOo/o0ooO;)V", "window_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public final class o00oOOoO implements o0oO0O0o.o00oOOo0 {
        @Nullable

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public List<o0O0OOO> f12044o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ o0ooO f12045o00oOOoO;

        public o00oOOoO(o0ooO o0ooo) {
            o0OOOOO0.o0ooO.o00oo0O0(o0ooo, "this$0");
            this.f12045o00oOOoO = o0ooo;
        }

        @Override // o0O0OoOo.o0oO0O0o.o00oOOo0
        public void o00oOOo0(@NotNull List<o0O0OOO> list) {
            o0OOOOO0.o0ooO.o00oo0O0(list, "splitInfo");
            this.f12044o00oOOo0 = list;
            Iterator<o00oOo00> it = this.f12045o00oOOoO.f12041o00oOOoO.iterator();
            while (it.hasNext()) {
                it.next().o00oOOoO(list);
            }
        }

        @Nullable
        public final List<o0O0OOO> o00oOOoO() {
            return this.f12044o00oOOo0;
        }

        public final void o00oOo00(@Nullable List<o0O0OOO> list) {
            this.f12044o00oOOo0 = list;
        }
    }

    @Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\fR#\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014¨\u0006\u0018"}, d2 = {"Lo0O0OoOo/o0ooO$o00oOo00;", "", "", "Lo0O0OoOo/o0O0OOO;", "splitInfoList", "Lo0OO0o/oO0Ooooo;", o0OO000o.o00oOOoO.f12961o00oOo00, "Landroid/app/Activity;", "o00oOOo0", "Landroid/app/Activity;", "activity", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/Executor;", "executor", "Lo0ooOoOO/o;", "o00oOo00", "Lo0ooOoOO/o;", "o00oOooO", "()Lo0ooOoOO/o;", "callback", "Ljava/util/List;", "lastValue", "<init>", "(Landroid/app/Activity;Ljava/util/concurrent/Executor;Lo0ooOoOO/o;)V", "window_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class o00oOo00 {
        @NotNull

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Activity f12046o00oOOo0;
        @NotNull

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Executor f12047o00oOOoO;
        @NotNull

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final o<List<o0O0OOO>> f12048o00oOo00;
        @Nullable

        /* renamed from: o00oOooO  reason: collision with root package name */
        public List<o0O0OOO> f12049o00oOooO;

        public o00oOo00(@NotNull Activity activity, @NotNull Executor executor, @NotNull o<List<o0O0OOO>> oVar) {
            o0OOOOO0.o0ooO.o00oo0O0(activity, "activity");
            o0OOOOO0.o0ooO.o00oo0O0(executor, "executor");
            o0OOOOO0.o0ooO.o00oo0O0(oVar, "callback");
            this.f12046o00oOOo0 = activity;
            this.f12047o00oOOoO = executor;
            this.f12048o00oOo00 = oVar;
        }

        public static final void o00oOo00(o00oOo00 o00ooo002, List list) {
            o0OOOOO0.o0ooO.o00oo0O0(o00ooo002, "this$0");
            o0OOOOO0.o0ooO.o00oo0O0(list, "$splitsWithActivity");
            o00ooo002.f12048o00oOo00.accept(list);
        }

        public final void o00oOOoO(@NotNull List<o0O0OOO> list) {
            o0OOOOO0.o0ooO.o00oo0O0(list, "splitInfoList");
            final ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((o0O0OOO) obj).o00oOOo0(this.f12046o00oOOo0)) {
                    arrayList.add(obj);
                }
            }
            if (o0OOOOO0.o0ooO.o00oOoO0(arrayList, this.f12049o00oOooO)) {
                return;
            }
            this.f12049o00oOooO = arrayList;
            this.f12047o00oOOoO.execute(new Runnable() { // from class: o0O0OoOo.o0O0OO0
                @Override // java.lang.Runnable
                public final void run() {
                    o0ooO.o00oOo00.o00oOo00(o0ooO.o00oOo00.this, arrayList);
                }
            });
        }

        @NotNull
        public final o<List<o0O0OOO>> o00oOooO() {
            return this.f12048o00oOo00;
        }
    }

    @o0o0000
    public o0ooO(@Nullable o0oO0O0o o0oo0o0o) {
        this.f12040o00oOOo0 = o0oo0o0o;
        o00oOOoO o00ooooo2 = new o00oOOoO(this);
        this.f12042o00oOo00 = o00ooooo2;
        this.f12041o00oOOoO = new CopyOnWriteArrayList<>();
        o0oO0O0o o0oo0o0o2 = this.f12040o00oOOo0;
        if (o0oo0o0o2 != null) {
            o0oo0o0o2.o00oOOoO(o00ooooo2);
        }
        this.f12043o00oOooO = new CopyOnWriteArraySet<>();
    }

    @o0o0000
    public static /* synthetic */ void o00oo00O() {
    }

    @Override // o0O0OoOo.o0O00oO0
    public void o00oOOo0(@NotNull Set<? extends o0O0oo0o> set) {
        o0OOOOO0.o0ooO.o00oo0O0(set, "rules");
        this.f12043o00oOooO.clear();
        this.f12043o00oOooO.addAll(set);
        o0oO0O0o o0oo0o0o = this.f12040o00oOOo0;
        if (o0oo0o0o == null) {
            return;
        }
        o0oo0o0o.o00oOOo0(this.f12043o00oOooO);
    }

    @Override // o0O0OoOo.o0O00oO0
    @NotNull
    public Set<o0O0oo0o> o00oOOoO() {
        return this.f12043o00oOooO;
    }

    @Override // o0O0OoOo.o0O00oO0
    public void o00oOo00(@NotNull o0O0oo0o o0o0oo0o) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0oo0o, "rule");
        if (this.f12043o00oOooO.contains(o0o0oo0o)) {
            this.f12043o00oOooO.remove(o0o0oo0o);
            o0oO0O0o o0oo0o0o = this.f12040o00oOOo0;
            if (o0oo0o0o == null) {
                return;
            }
            o0oo0o0o.o00oOOo0(this.f12043o00oOooO);
        }
    }

    @Override // o0O0OoOo.o0O00oO0
    public void o00oOo0O(@NotNull Activity activity, @NotNull Executor executor, @NotNull o<List<o0O0OOO>> oVar) {
        o0OOOOO0.o0ooO.o00oo0O0(activity, "activity");
        o0OOOOO0.o0ooO.o00oo0O0(executor, "executor");
        o0OOOOO0.o0ooO.o00oo0O0(oVar, "callback");
        ReentrantLock reentrantLock = f12039o00oOoO0;
        reentrantLock.lock();
        try {
            if (this.f12040o00oOOo0 == null) {
                oVar.accept(o0OO0oO.o0ooO.INSTANCE);
                return;
            }
            o00oOo00 o00ooo002 = new o00oOo00(activity, executor, oVar);
            this.f12041o00oOOoO.add(o00ooo002);
            List<o0O0OOO> list = this.f12042o00oOo00.f12044o00oOOo0;
            if (list != null) {
                o0OOOOO0.o0ooO.o00oo00O(list);
            } else {
                list = o0OO0oO.o0ooO.INSTANCE;
            }
            o00ooo002.o00oOOoO(list);
            oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // o0O0OoOo.o0O00oO0
    public boolean o00oOo0o() {
        return this.f12040o00oOOo0 != null;
    }

    @Override // o0O0OoOo.o0O00oO0
    public void o00oOoO0(@NotNull o<List<o0O0OOO>> oVar) {
        o0OOOOO0.o0ooO.o00oo0O0(oVar, "consumer");
        ReentrantLock reentrantLock = f12039o00oOoO0;
        reentrantLock.lock();
        try {
            Iterator<o00oOo00> it = this.f12041o00oOOoO.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                o00oOo00 next = it.next();
                if (o0OOOOO0.o0ooO.o00oOoO0(next.f12048o00oOo00, oVar)) {
                    this.f12041o00oOOoO.remove(next);
                    break;
                }
            }
            oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Nullable
    public final o0oO0O0o o00oOoo0() {
        return this.f12040o00oOOo0;
    }

    @Override // o0O0OoOo.o0O00oO0
    public void o00oOooO(@NotNull o0O0oo0o o0o0oo0o) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0oo0o, "rule");
        if (this.f12043o00oOooO.contains(o0o0oo0o)) {
            return;
        }
        this.f12043o00oOooO.add(o0o0oo0o);
        o0oO0O0o o0oo0o0o = this.f12040o00oOOo0;
        if (o0oo0o0o == null) {
            return;
        }
        o0oo0o0o.o00oOOo0(this.f12043o00oOooO);
    }

    @NotNull
    public final CopyOnWriteArrayList<o00oOo00> o00oOooo() {
        return this.f12041o00oOOoO;
    }

    public final void o00oo0(@Nullable o0oO0O0o o0oo0o0o) {
        this.f12040o00oOOo0 = o0oo0o0o;
    }
}
