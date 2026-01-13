package androidx.emoji2.text;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.o00oOo0O;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o00oOooO.o0O00O;
import o00oOooO.o0O0OOOo;
import o00oOooO.o0O0o00O;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.o0OoO00O;
import o00oOooO.oo0oO0;
import o0ooOoOO.ooOOOOoo;
@o00oOooO.o0O000O
/* loaded from: classes.dex */
public class o00oo00O {

    /* renamed from: o00oo  reason: collision with root package name */
    public static final int f2679o00oo = 0;

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final String f2680o00oo0 = "android.support.text.emoji.emojiCompat_metadataVersion";

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final int f2681o00oo0O = 0;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final int f2682o00oo0O0 = 3;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final String f2683o00oo0OO = "android.support.text.emoji.emojiCompat_replaceAll";

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final int f2684o00oo0Oo = 1;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final int f2685o00oo0o = 0;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final int f2686o00oo0o0 = 2;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final int f2687o00oo0oO = 1;
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final int f2688o00ooO = Integer.MAX_VALUE;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final int f2689o00ooO0 = 0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final int f2690o00ooO00 = 1;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final int f2691o00ooO0O = 1;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final int f2692o00ooO0o = 2;
    @o0O0OOOo("INSTANCE_LOCK")
    @o0OO00OO

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public static volatile o00oo00O f2695o00ooOOo = null;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public static final String f2696o00ooOo = "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.";
    @o0O0OOOo("CONFIG_LOCK")

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public static volatile boolean f2697o00ooOo0 = false;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final int f2698o0O0o = 2;
    @o0O0OOOo("mInitLock")
    @oo0oO0

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final Set<AbstractC0018o00oo00O> f2700o00oOOoO;
    @oo0oO0

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final o00oOo00 f2702o00oOo0O;
    @oo0oO0

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final o00oo0O0 f2703o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public final boolean f2704o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public final boolean f2705o00oOoO0;
    @o0OO00OO

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public final int[] f2706o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public final boolean f2707o00oOoOo;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public final int f2708o00oOoo0;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public final int f2710o00oOooo;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public final o00oOoO f2711o00oo00O;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final Object f2694o00ooOO0 = new Object();

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final Object f2693o00ooOO = new Object();
    @oo0oO0

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final ReadWriteLock f2699o00oOOo0 = new ReentrantReadWriteLock();
    @o0O0OOOo("mInitLock")

    /* renamed from: o00oOo00  reason: collision with root package name */
    public volatile int f2701o00oOo00 = 3;
    @oo0oO0

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final Handler f2709o00oOooO = new Handler(Looper.getMainLooper());

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    /* loaded from: classes.dex */
    public @interface o00oOOo0 {
    }

    @o0OOooO0(19)
    /* loaded from: classes.dex */
    public static final class o00oOOoO extends o00oOo00 {

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public volatile androidx.emoji2.text.o00oo0O f2712o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public volatile o0O00000 f2713o00oOo00;

        /* loaded from: classes.dex */
        public class o00oOOo0 extends o00oo0O {
            public o00oOOo0() {
            }

            @Override // androidx.emoji2.text.o00oo00O.o00oo0O
            public void o00oOOo0(@o0OO00OO Throwable th) {
                o00oOOoO.this.f2715o00oOOo0.o00oo0o0(th);
            }

            @Override // androidx.emoji2.text.o00oo00O.o00oo0O
            public void o00oOOoO(@oo0oO0 o0O00000 o0o00000) {
                o00oOOoO.this.o00oOoO(o0o00000);
            }
        }

        public o00oOOoO(o00oo00O o00oo00o) {
            super(o00oo00o);
        }

        @Override // androidx.emoji2.text.o00oo00O.o00oOo00
        public String o00oOOo0() {
            String o00oooO2 = this.f2713o00oOo00.f2760o00oOOo0.o00oooO();
            return o00oooO2 == null ? "" : o00oooO2;
        }

        @Override // androidx.emoji2.text.o00oo00O.o00oOo00
        public int o00oOOoO(CharSequence charSequence, int i) {
            return this.f2712o00oOOoO.o00oOooO(charSequence, i);
        }

        @Override // androidx.emoji2.text.o00oo00O.o00oOo00
        public boolean o00oOo00(@oo0oO0 CharSequence charSequence) {
            return this.f2712o00oOOoO.o00oOo00(charSequence) == 1;
        }

        @Override // androidx.emoji2.text.o00oo00O.o00oOo00
        public void o00oOo0O() {
            try {
                this.f2715o00oOOo0.f2703o00oOo0o.o00oOOo0(new o00oOOo0());
            } catch (Throwable th) {
                this.f2715o00oOOo0.o00oo0o0(th);
            }
        }

        @Override // androidx.emoji2.text.o00oo00O.o00oOo00
        public CharSequence o00oOo0o(@oo0oO0 CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return this.f2712o00oOOoO.o00oOoOo(charSequence, i, i2, i3, z);
        }

        public void o00oOoO(@oo0oO0 o0O00000 o0o00000) {
            if (o0o00000 == null) {
                this.f2715o00oOOo0.o00oo0o0(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f2713o00oOo00 = o0o00000;
            o0O00000 o0o000002 = this.f2713o00oOo00;
            o00oo o00ooVar = new o00oo();
            o00oOoO o00oooo2 = this.f2715o00oOOo0.f2711o00oo00O;
            o00oo00O o00oo00o = this.f2715o00oOOo0;
            this.f2712o00oOOoO = new androidx.emoji2.text.o00oo0O(o0o000002, o00ooVar, o00oooo2, o00oo00o.f2704o00oOoO, o00oo00o.f2706o00oOoOO);
            this.f2715o00oOOo0.o00oo0o();
        }

        @Override // androidx.emoji2.text.o00oo00O.o00oOo00
        public void o00oOoO0(@oo0oO0 EditorInfo editorInfo) {
            editorInfo.extras.putInt(o00oo00O.f2680o00oo0, this.f2713o00oOo00.o00oOoO());
            editorInfo.extras.putBoolean(o00oo00O.f2683o00oo0OO, this.f2715o00oOOo0.f2705o00oOoO0);
        }

        @Override // androidx.emoji2.text.o00oo00O.o00oOo00
        public boolean o00oOooO(@oo0oO0 CharSequence charSequence, int i) {
            return this.f2712o00oOOoO.o00oOooO(charSequence, i) == 1;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o00oo00O f2715o00oOOo0;

        public o00oOo00(o00oo00O o00oo00o) {
            this.f2715o00oOOo0 = o00oo00o;
        }

        public String o00oOOo0() {
            return "";
        }

        public int o00oOOoO(CharSequence charSequence, int i) {
            return 0;
        }

        public boolean o00oOo00(@oo0oO0 CharSequence charSequence) {
            return false;
        }

        public void o00oOo0O() {
            this.f2715o00oOOo0.o00oo0o();
        }

        public CharSequence o00oOo0o(@oo0oO0 CharSequence charSequence, @o0O0o00O(from = 0) int i, @o0O0o00O(from = 0) int i2, @o0O0o00O(from = 0) int i3, boolean z) {
            return charSequence;
        }

        public void o00oOoO0(@oo0oO0 EditorInfo editorInfo) {
        }

        public boolean o00oOooO(@oo0oO0 CharSequence charSequence, int i) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00oOo0O {
        @oo0oO0

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o00oo0O0 f2716o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public boolean f2717o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public boolean f2718o00oOo00;
        @o0OO00OO

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public Set<AbstractC0018o00oo00O> f2719o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public boolean f2720o00oOo0o;
        @o0OO00OO

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int[] f2724o00oOooO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public int f2722o00oOoO0 = -16711936;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public int f2721o00oOoO = 0;
        @oo0oO0

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public o00oOoO f2723o00oOoOO = new androidx.emoji2.text.o00oOoO();

        public o00oOo0O(@oo0oO0 o00oo0O0 o00oo0o02) {
            ooOOOOoo.o00oo00O(o00oo0o02, "metadataLoader cannot be null.");
            this.f2716o00oOOo0 = o00oo0o02;
        }

        @oo0oO0
        public final o00oo0O0 o00oOOo0() {
            return this.f2716o00oOOo0;
        }

        @oo0oO0
        public o00oOo0O o00oOOoO(@oo0oO0 AbstractC0018o00oo00O abstractC0018o00oo00O) {
            ooOOOOoo.o00oo00O(abstractC0018o00oo00O, "initCallback cannot be null");
            if (this.f2719o00oOo0O == null) {
                this.f2719o00oOo0O = new androidx.collection.o00oOo00();
            }
            this.f2719o00oOo0O.add(abstractC0018o00oo00O);
            return this;
        }

        @oo0oO0
        public o00oOo0O o00oOo00(@o0O00O int i) {
            this.f2722o00oOoO0 = i;
            return this;
        }

        @oo0oO0
        public o00oOo0O o00oOo0O(@oo0oO0 o00oOoO o00oooo2) {
            ooOOOOoo.o00oo00O(o00oooo2, "GlyphChecker cannot be null");
            this.f2723o00oOoOO = o00oooo2;
            return this;
        }

        @oo0oO0
        public o00oOo0O o00oOo0o(int i) {
            this.f2721o00oOoO = i;
            return this;
        }

        @oo0oO0
        public o00oOo0O o00oOoO(boolean z) {
            return o00oOoOO(z, null);
        }

        @oo0oO0
        public o00oOo0O o00oOoO0(boolean z) {
            this.f2717o00oOOoO = z;
            return this;
        }

        @oo0oO0
        public o00oOo0O o00oOoOO(boolean z, @o0OO00OO List<Integer> list) {
            this.f2718o00oOo00 = z;
            if (!z || list == null) {
                this.f2724o00oOooO = null;
            } else {
                this.f2724o00oOooO = new int[list.size()];
                int i = 0;
                for (Integer num : list) {
                    this.f2724o00oOooO[i] = num.intValue();
                    i++;
                }
                Arrays.sort(this.f2724o00oOooO);
            }
            return this;
        }

        @oo0oO0
        public o00oOo0O o00oOoOo(@oo0oO0 AbstractC0018o00oo00O abstractC0018o00oo00O) {
            ooOOOOoo.o00oo00O(abstractC0018o00oo00O, "initCallback cannot be null");
            Set<AbstractC0018o00oo00O> set = this.f2719o00oOo0O;
            if (set != null) {
                set.remove(abstractC0018o00oo00O);
            }
            return this;
        }

        @oo0oO0
        public o00oOo0O o00oOooO(boolean z) {
            this.f2720o00oOo0o = z;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOoO {
        boolean o00oOOo0(@oo0oO0 CharSequence charSequence, @o0O0o00O(from = 0) int i, @o0O0o00O(from = 0) int i2, @o0O0o00O(from = 0) int i3);
    }

    @o0OOooO0(19)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    /* loaded from: classes.dex */
    public static class o00oo {
        public androidx.emoji2.text.o0O0o o00oOOo0(@oo0oO0 androidx.emoji2.text.o00oo0O0 o00oo0o02) {
            return new o0O000(o00oo0o02);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo0 implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final Throwable f2725o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final List<AbstractC0018o00oo00O> f2726o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final int f2727o00oo0Oo;

        public o00oo0(@oo0oO0 AbstractC0018o00oo00O abstractC0018o00oo00O, int i) {
            this(Arrays.asList((AbstractC0018o00oo00O) ooOOOOoo.o00oo00O(abstractC0018o00oo00O, "initCallback cannot be null")), i, null);
        }

        public o00oo0(@oo0oO0 Collection<AbstractC0018o00oo00O> collection, int i) {
            this(collection, i, null);
        }

        public o00oo0(@oo0oO0 Collection<AbstractC0018o00oo00O> collection, int i, @o0OO00OO Throwable th) {
            ooOOOOoo.o00oo00O(collection, "initCallbacks cannot be null");
            this.f2726o00oo0O0 = new ArrayList(collection);
            this.f2727o00oo0Oo = i;
            this.f2725o00oo0O = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f2726o00oo0O0.size();
            int i = 0;
            if (this.f2727o00oo0Oo != 1) {
                while (i < size) {
                    this.f2726o00oo0O0.get(i).o00oOOo0(this.f2725o00oo0O);
                    i++;
                }
                return;
            }
            while (i < size) {
                this.f2726o00oo0O0.get(i).o00oOOoO();
                i++;
            }
        }
    }

    /* renamed from: androidx.emoji2.text.o00oo00O$o00oo00O  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0018o00oo00O {
        public void o00oOOo0(@o0OO00OO Throwable th) {
        }

        public void o00oOOoO() {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00oo0O {
        public abstract void o00oOOo0(@o0OO00OO Throwable th);

        public abstract void o00oOOoO(@oo0oO0 o0O00000 o0o00000);
    }

    /* loaded from: classes.dex */
    public interface o00oo0O0 {
        void o00oOOo0(@oo0oO0 o00oo0O o00oo0o2);
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    /* loaded from: classes.dex */
    public @interface o00oo0OO {
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    /* loaded from: classes.dex */
    public @interface o0O0o {
    }

    public o00oo00O(@oo0oO0 o00oOo0O o00ooo0o2) {
        this.f2705o00oOoO0 = o00ooo0o2.f2717o00oOOoO;
        this.f2704o00oOoO = o00ooo0o2.f2718o00oOo00;
        this.f2706o00oOoOO = o00ooo0o2.f2724o00oOooO;
        this.f2707o00oOoOo = o00ooo0o2.f2720o00oOo0o;
        this.f2708o00oOoo0 = o00ooo0o2.f2722o00oOoO0;
        this.f2703o00oOo0o = o00ooo0o2.f2716o00oOOo0;
        this.f2710o00oOooo = o00ooo0o2.f2721o00oOoO;
        this.f2711o00oo00O = o00ooo0o2.f2723o00oOoOO;
        androidx.collection.o00oOo00 o00ooo002 = new androidx.collection.o00oOo00();
        this.f2700o00oOOoO = o00ooo002;
        Set<AbstractC0018o00oo00O> set = o00ooo0o2.f2719o00oOo0O;
        if (set != null && !set.isEmpty()) {
            o00ooo002.addAll(o00ooo0o2.f2719o00oOo0O);
        }
        this.f2702o00oOo0O = new o00oOOoO(this);
        o00oo0Oo();
    }

    @oo0oO0
    public static o00oo00O o00oOOoO() {
        o00oo00O o00oo00o;
        synchronized (f2694o00ooOO0) {
            o00oo00o = f2695o00ooOOo;
            ooOOOOoo.o00oo0OO(o00oo00o != null, f2696o00ooOo);
        }
        return o00oo00o;
    }

    public static boolean o00oOoO(@oo0oO0 Editable editable, int i, @oo0oO0 KeyEvent keyEvent) {
        return androidx.emoji2.text.o00oo0O.o00oOo0o(editable, i, keyEvent);
    }

    public static boolean o00oOoO0(@oo0oO0 InputConnection inputConnection, @oo0oO0 Editable editable, @o0O0o00O(from = 0) int i, @o0O0o00O(from = 0) int i2, boolean z) {
        return androidx.emoji2.text.o00oo0O.o00oOo0O(inputConnection, editable, i, i2, z);
    }

    @o0OO00OO
    public static o00oo00O o00oOoo0(@oo0oO0 Context context) {
        return o00oOooo(context, null);
    }

    @o0OO00OO
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public static o00oo00O o00oOooo(@oo0oO0 Context context, @o0OO00OO o00oOo0O.o00oOOo0 o00oooo02) {
        o00oo00O o00oo00o;
        if (f2697o00ooOo0) {
            return f2695o00ooOOo;
        }
        if (o00oooo02 == null) {
            o00oooo02 = new o00oOo0O.o00oOOo0(null);
        }
        o00oOo0O o00oOo002 = o00oooo02.o00oOo00(context);
        synchronized (f2693o00ooOO) {
            if (!f2697o00ooOo0) {
                if (o00oOo002 != null) {
                    o00oo00O(o00oOo002);
                }
                f2697o00ooOo0 = true;
            }
            o00oo00o = f2695o00ooOOo;
        }
        return o00oo00o;
    }

    public static boolean o00oo0() {
        return f2695o00ooOOo != null;
    }

    @oo0oO0
    public static o00oo00O o00oo00O(@oo0oO0 o00oOo0O o00ooo0o2) {
        o00oo00O o00oo00o = f2695o00ooOOo;
        if (o00oo00o == null) {
            synchronized (f2694o00ooOO0) {
                o00oo00o = f2695o00ooOOo;
                if (o00oo00o == null) {
                    o00oo00o = new o00oo00O(o00ooo0o2);
                    f2695o00ooOOo = o00oo00o;
                }
            }
        }
        return o00oo00o;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.TESTS})
    public static void o00ooO(boolean z) {
        synchronized (f2693o00ooOO) {
            f2697o00ooOo0 = z;
        }
    }

    @oo0oO0
    public static o00oo00O o00ooO0O(@oo0oO0 o00oOo0O o00ooo0o2) {
        o00oo00O o00oo00o;
        synchronized (f2694o00ooOO0) {
            o00oo00o = new o00oo00O(o00ooo0o2);
            f2695o00ooOOo = o00oo00o;
        }
        return o00oo00o;
    }

    @o0OO00OO
    @o0OO0oO({o0OO0oO.o00oOOo0.TESTS})
    public static o00oo00O o00ooO0o(@o0OO00OO o00oo00O o00oo00o) {
        o00oo00O o00oo00o2;
        synchronized (f2694o00ooOO0) {
            f2695o00ooOOo = o00oo00o;
            o00oo00o2 = f2695o00ooOOo;
        }
        return o00oo00o2;
    }

    @oo0oO0
    public String o00oOo00() {
        ooOOOOoo.o00oo0OO(o00oo0O0(), "Not initialized yet");
        return this.f2702o00oOo0O.o00oOOo0();
    }

    @o0O00O
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public int o00oOo0O() {
        return this.f2708o00oOoo0;
    }

    public int o00oOo0o() {
        this.f2699o00oOOo0.readLock().lock();
        try {
            return this.f2701o00oOo00;
        } finally {
            this.f2699o00oOOo0.readLock().unlock();
        }
    }

    @Deprecated
    public boolean o00oOoOO(@oo0oO0 CharSequence charSequence) {
        ooOOOOoo.o00oo0OO(o00oo0O0(), "Not initialized yet");
        ooOOOOoo.o00oo00O(charSequence, "sequence cannot be null");
        return this.f2702o00oOo0O.o00oOo00(charSequence);
    }

    @Deprecated
    public boolean o00oOoOo(@oo0oO0 CharSequence charSequence, @o0O0o00O(from = 0) int i) {
        ooOOOOoo.o00oo0OO(o00oo0O0(), "Not initialized yet");
        ooOOOOoo.o00oo00O(charSequence, "sequence cannot be null");
        return this.f2702o00oOo0O.o00oOooO(charSequence, i);
    }

    public int o00oOooO(@oo0oO0 CharSequence charSequence, @o0O0o00O(from = 0) int i) {
        ooOOOOoo.o00oo0OO(o00oo0O0(), "Not initialized yet");
        ooOOOOoo.o00oo00O(charSequence, "sequence cannot be null");
        return this.f2702o00oOo0O.o00oOOoO(charSequence, i);
    }

    @o0OO00OO
    @o0OoO00O
    public CharSequence o00oo(@o0OO00OO CharSequence charSequence, @o0O0o00O(from = 0) int i, @o0O0o00O(from = 0) int i2, @o0O0o00O(from = 0) int i3) {
        return o00ooO00(charSequence, i, i2, i3, 0);
    }

    public void o00oo0O() {
        ooOOOOoo.o00oo0OO(this.f2710o00oOooo == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (o00oo0O0()) {
            return;
        }
        this.f2699o00oOOo0.writeLock().lock();
        try {
            if (this.f2701o00oOo00 == 0) {
                return;
            }
            this.f2701o00oOo00 = 0;
            this.f2699o00oOOo0.writeLock().unlock();
            this.f2702o00oOo0O.o00oOo0O();
        } finally {
            this.f2699o00oOOo0.writeLock().unlock();
        }
    }

    public final boolean o00oo0O0() {
        return o00oOo0o() == 1;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public boolean o00oo0OO() {
        return this.f2707o00oOoOo;
    }

    public final void o00oo0Oo() {
        this.f2699o00oOOo0.writeLock().lock();
        try {
            if (this.f2710o00oOooo == 0) {
                this.f2701o00oOo00 = 0;
            }
            this.f2699o00oOOo0.writeLock().unlock();
            if (o00oOo0o() == 0) {
                this.f2702o00oOo0O.o00oOo0O();
            }
        } catch (Throwable th) {
            this.f2699o00oOOo0.writeLock().unlock();
            throw th;
        }
    }

    public void o00oo0o() {
        ArrayList arrayList = new ArrayList();
        this.f2699o00oOOo0.writeLock().lock();
        try {
            this.f2701o00oOo00 = 1;
            arrayList.addAll(this.f2700o00oOOoO);
            this.f2700o00oOOoO.clear();
            this.f2699o00oOOo0.writeLock().unlock();
            this.f2709o00oOooO.post(new o00oo0(arrayList, this.f2701o00oOo00, null));
        } catch (Throwable th) {
            this.f2699o00oOOo0.writeLock().unlock();
            throw th;
        }
    }

    public void o00oo0o0(@o0OO00OO Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f2699o00oOOo0.writeLock().lock();
        try {
            this.f2701o00oOo00 = 2;
            arrayList.addAll(this.f2700o00oOOoO);
            this.f2700o00oOOoO.clear();
            this.f2699o00oOOo0.writeLock().unlock();
            this.f2709o00oOooO.post(new o00oo0(arrayList, this.f2701o00oOo00, th));
        } catch (Throwable th2) {
            this.f2699o00oOOo0.writeLock().unlock();
            throw th2;
        }
    }

    @o0OO00OO
    @o0OoO00O
    public CharSequence o00oo0oO(@o0OO00OO CharSequence charSequence) {
        return o0O0o(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public void o00ooO0(@oo0oO0 AbstractC0018o00oo00O abstractC0018o00oo00O) {
        ooOOOOoo.o00oo00O(abstractC0018o00oo00O, "initCallback cannot be null");
        this.f2699o00oOOo0.writeLock().lock();
        try {
            if (this.f2701o00oOo00 != 1 && this.f2701o00oOo00 != 2) {
                this.f2700o00oOOoO.add(abstractC0018o00oo00O);
            }
            this.f2709o00oOooO.post(new o00oo0(abstractC0018o00oo00O, this.f2701o00oOo00));
        } finally {
            this.f2699o00oOOo0.writeLock().unlock();
        }
    }

    @o0OO00OO
    @o0OoO00O
    public CharSequence o00ooO00(@o0OO00OO CharSequence charSequence, @o0O0o00O(from = 0) int i, @o0O0o00O(from = 0) int i2, @o0O0o00O(from = 0) int i3, int i4) {
        boolean z;
        ooOOOOoo.o00oo0OO(o00oo0O0(), "Not initialized yet");
        ooOOOOoo.o00oOoOo(i, "start cannot be negative");
        ooOOOOoo.o00oOoOo(i2, "end cannot be negative");
        ooOOOOoo.o00oOoOo(i3, "maxEmojiCount cannot be negative");
        ooOOOOoo.o00oOOoO(i <= i2, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        ooOOOOoo.o00oOOoO(i <= charSequence.length(), "start should be < than charSequence length");
        ooOOOOoo.o00oOOoO(i2 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        if (i4 != 1) {
            z = i4 != 2 ? this.f2705o00oOoO0 : false;
        } else {
            z = true;
        }
        return this.f2702o00oOo0O.o00oOo0o(charSequence, i, i2, i3, z);
    }

    public void o00ooOO(@oo0oO0 EditorInfo editorInfo) {
        if (!o00oo0O0() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f2702o00oOo0O.o00oOoO0(editorInfo);
    }

    public void o00ooOO0(@oo0oO0 AbstractC0018o00oo00O abstractC0018o00oo00O) {
        ooOOOOoo.o00oo00O(abstractC0018o00oo00O, "initCallback cannot be null");
        this.f2699o00oOOo0.writeLock().lock();
        try {
            this.f2700o00oOOoO.remove(abstractC0018o00oo00O);
        } finally {
            this.f2699o00oOOo0.writeLock().unlock();
        }
    }

    @o0OO00OO
    @o0OoO00O
    public CharSequence o0O0o(@o0OO00OO CharSequence charSequence, @o0O0o00O(from = 0) int i, @o0O0o00O(from = 0) int i2) {
        return o00oo(charSequence, i, i2, Integer.MAX_VALUE);
    }
}
