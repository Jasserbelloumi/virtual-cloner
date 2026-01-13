package o00oooOo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o00ooo0o.o0O0O0o0;
import o0O000O.o00oo0OO;
import org.videolan.libvlc.media.MediaPlayer;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class oOOO00o0 {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f9837o00oOOoO = "TypefaceCompatBaseImpl";

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f9838o00oOo00 = 0;
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public ConcurrentHashMap<Long, o0O0O0o0.o00oOo0O> f9839o00oOOo0 = new ConcurrentHashMap<>();

    /* loaded from: classes.dex */
    public class o00oOOo0 implements o00oOo0O<o00oo0OO.o00oOo00> {
        public o00oOOo0() {
        }

        @Override // o00oooOo.oOOO00o0.o00oOo0O
        /* renamed from: o00oOo00 */
        public int o00oOOoO(o00oo0OO.o00oOo00 o00ooo002) {
            return o00ooo002.o00oOo0O();
        }

        @Override // o00oooOo.oOOO00o0.o00oOo0O
        /* renamed from: o00oOooO */
        public boolean o00oOOo0(o00oo0OO.o00oOo00 o00ooo002) {
            return o00ooo002.o00oOo0o();
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements o00oOo0O<o0O0O0o0.o00oOoO> {
        public o00oOOoO() {
        }

        @Override // o00oooOo.oOOO00o0.o00oOo0O
        /* renamed from: o00oOo00 */
        public int o00oOOoO(o0O0O0o0.o00oOoO o00oooo2) {
            return o00oooo2.f9732o00oOOoO;
        }

        @Override // o00oooOo.oOOO00o0.o00oOo0O
        /* renamed from: o00oOooO */
        public boolean o00oOOo0(o0O0O0o0.o00oOoO o00oooo2) {
            return o00oooo2.f9733o00oOo00;
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 implements o00oOo0O<o0O0O0o0.o00oOoO> {
        public o00oOo00() {
        }

        @Override // o00oooOo.oOOO00o0.o00oOo0O
        /* renamed from: o00oOo00 */
        public int o00oOOoO(o0O0O0o0.o00oOoO o00oooo2) {
            return o00oooo2.f9732o00oOOoO;
        }

        @Override // o00oooOo.oOOO00o0.o00oOo0O
        /* renamed from: o00oOooO */
        public boolean o00oOOo0(o0O0O0o0.o00oOoO o00oooo2) {
            return o00oooo2.f9733o00oOo00;
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOo0O<T> {
        boolean o00oOOo0(T t);

        int o00oOOoO(T t);
    }

    public static <T> T o00oOoOo(T[] tArr, int i, o00oOo0O<T> o00ooo0o2) {
        return (T) o00oOoo0(tArr, (i & 1) == 0 ? 400 : MediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING, (i & 2) != 0, o00ooo0o2);
    }

    public static <T> T o00oOoo0(T[] tArr, int i, boolean z, o00oOo0O<T> o00ooo0o2) {
        T t = null;
        int i2 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(o00ooo0o2.o00oOOoO(t2) - i) * 2) + (o00ooo0o2.o00oOOo0(t2) == z ? 0 : 1);
            if (t == null || i2 > abs) {
                t = t2;
                i2 = abs;
            }
        }
        return t;
    }

    public static long o00oo0(@o0OO00OO Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return 0L;
        }
    }

    public final void o00oOOo0(Typeface typeface, o0O0O0o0.o00oOo0O o00ooo0o2) {
        long o00oo02 = o00oo0(typeface);
        if (o00oo02 != 0) {
            this.f9839o00oOOo0.put(Long.valueOf(o00oo02), o00ooo0o2);
        }
    }

    @o0OO00OO
    public Typeface o00oOOoO(Context context, o0O0O0o0.o00oOo0O o00ooo0o2, Resources resources, int i) {
        o0O0O0o0.o00oOoO o00oOoO2 = o00oOoO(o00ooo0o2, i);
        if (o00oOoO2 == null) {
            return null;
        }
        Typeface o00oOoO3 = oOOO000.o00oOoO(context, resources, o00oOoO2.f9735o00oOo0o, o00oOoO2.f9731o00oOOo0, 0, i);
        o00oOOo0(o00oOoO3, o00ooo0o2);
        return o00oOoO3;
    }

    @o0OO00OO
    public Typeface o00oOo00(Context context, o0O0O0o0.o00oOo0O o00ooo0o2, Resources resources, int i, boolean z) {
        o0O0O0o0.o00oOoO o00oOoOO2 = o00oOoOO(o00ooo0o2, i, z);
        if (o00oOoOO2 == null) {
            return null;
        }
        Typeface o00oOoO2 = oOOO000.o00oOoO(context, resources, o00oOoOO2.f9735o00oOo0o, o00oOoOO2.f9731o00oOOo0, 0, 0);
        o00oOOo0(o00oOoO2, o00ooo0o2);
        return o00oOoO2;
    }

    public Typeface o00oOo0O(Context context, InputStream inputStream) {
        File o00oOo0O2 = oOOO0O0.o00oOo0O(context);
        if (o00oOo0O2 == null) {
            return null;
        }
        try {
            if (oOOO0O0.o00oOooO(o00oOo0O2, inputStream)) {
                return Typeface.createFromFile(o00oOo0O2.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            o00oOo0O2.delete();
        }
    }

    @o0OO00OO
    public Typeface o00oOo0o(Context context, Resources resources, int i, String str, int i2) {
        File o00oOo0O2 = oOOO0O0.o00oOo0O(context);
        if (o00oOo0O2 == null) {
            return null;
        }
        try {
            if (oOOO0O0.o00oOo00(o00oOo0O2, resources, i)) {
                return Typeface.createFromFile(o00oOo0O2.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            o00oOo0O2.delete();
        }
    }

    public final o0O0O0o0.o00oOoO o00oOoO(o0O0O0o0.o00oOo0O o00ooo0o2, int i) {
        return (o0O0O0o0.o00oOoO) o00oOoOo(o00ooo0o2.f9730o00oOOo0, i, new o00oOOoO());
    }

    @oo0oO0
    public Typeface o00oOoO0(@oo0oO0 Context context, @oo0oO0 Typeface typeface, int i, boolean z) {
        Typeface typeface2;
        try {
            typeface2 = oOOO0O0o.o00oOOo0(this, context, typeface, i, z);
        } catch (RuntimeException unused) {
            typeface2 = null;
        }
        return typeface2 == null ? typeface : typeface2;
    }

    public final o0O0O0o0.o00oOoO o00oOoOO(o0O0O0o0.o00oOo0O o00ooo0o2, int i, boolean z) {
        return (o0O0O0o0.o00oOoO) o00oOoo0(o00ooo0o2.f9730o00oOOo0, i, z, new o00oOo00());
    }

    @o0OO00OO
    public Typeface o00oOooO(Context context, @o0OO00OO CancellationSignal cancellationSignal, @oo0oO0 o00oo0OO.o00oOo00[] o00ooo00Arr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (o00ooo00Arr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(o00oOooo(o00ooo00Arr, i).o00oOooO());
        } catch (IOException unused) {
            inputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            Typeface o00oOo0O2 = o00oOo0O(context, inputStream);
            oOOO0O0.o00oOOo0(inputStream);
            return o00oOo0O2;
        } catch (IOException unused2) {
            oOOO0O0.o00oOOo0(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            oOOO0O0.o00oOOo0(inputStream2);
            throw th;
        }
    }

    public o00oo0OO.o00oOo00 o00oOooo(o00oo0OO.o00oOo00[] o00ooo00Arr, int i) {
        return (o00oo0OO.o00oOo00) o00oOoOo(o00ooo00Arr, i, new o00oOOo0());
    }

    @o0OO00OO
    public o0O0O0o0.o00oOo0O o00oo00O(Typeface typeface) {
        long o00oo02 = o00oo0(typeface);
        if (o00oo02 == 0) {
            return null;
        }
        return this.f9839o00oOOo0.get(Long.valueOf(o00oo02));
    }
}
