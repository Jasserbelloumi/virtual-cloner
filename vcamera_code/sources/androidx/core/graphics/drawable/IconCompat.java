package androidx.core.graphics.drawable;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.google.android.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.charset.Charset;
import o00oOooO.o0O00O;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0O0O0o0;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.o0o0000;
import o00oOooO.oo0OOoo;
import o00oOooO.oo0oO0;
import o00ooo0.o0;
import o00ooo0o.o0O0OO;
import o0O0Oo0.o0O00000;
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final String f2380o00oOoo0 = "IconCompat";

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final int f2381o00oOooo = -1;

    /* renamed from: o00oo  reason: collision with root package name */
    public static final float f2382o00oo = 0.020833334f;

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final int f2383o00oo0 = 2;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final int f2384o00oo00O = 1;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final int f2385o00oo0O = 5;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final int f2386o00oo0O0 = 4;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final int f2387o00oo0OO = 3;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final int f2388o00oo0Oo = 6;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final float f2389o00oo0o = 0.6666667f;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final float f2390o00oo0o0 = 0.25f;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final float f2391o00oo0oO = 0.9166667f;
    @o0o0000

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final String f2392o00ooO = "int1";

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final int f2393o00ooO0 = 30;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final int f2394o00ooO00 = 61;
    @o0o0000

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final String f2395o00ooO0O = "type";
    @o0o0000

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final String f2396o00ooO0o = "obj";
    @o0o0000

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final String f2397o00ooOO = "tint_list";
    @o0o0000

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final String f2398o00ooOO0 = "int2";
    @o0o0000

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public static final String f2399o00ooOOo = "tint_mode";

    /* renamed from: o00ooOo  reason: collision with root package name */
    public static final PorterDuff.Mode f2400o00ooOo = PorterDuff.Mode.SRC_IN;
    @o0o0000

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public static final String f2401o00ooOo0 = "string1";

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final float f2402o0O0o = 0.010416667f;
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public int f2403o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public Object f2404o00oOOoO;
    @o0OO00OO
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})

    /* renamed from: o00oOo00  reason: collision with root package name */
    public byte[] f2405o00oOo00;
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int f2406o00oOo0O;
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public int f2407o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public PorterDuff.Mode f2408o00oOoO;
    @o0OO00OO
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public ColorStateList f2409o00oOoO0;
    @o0OO00OO
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public String f2410o00oOoOO;
    @o0OO00OO
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public String f2411o00oOoOo;
    @o0OO00OO
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})

    /* renamed from: o00oOooO  reason: collision with root package name */
    public Parcelable f2412o00oOooO;

    @o0OOooO0(23)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0OO00OO
        public static IconCompat o00oOOo0(@oo0oO0 Context context, @oo0oO0 Icon icon) {
            int o00oOo002 = o00oOo00.o00oOo00(icon);
            if (o00oOo002 == 2) {
                String o00oOOoO2 = o00oOo00.o00oOOoO(icon);
                try {
                    return IconCompat.o00oo(IconCompat.o00ooO0o(context, o00oOOoO2), o00oOOoO2, o00oOo00.o00oOOo0(icon));
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else if (o00oOo002 != 4) {
                if (o00oOo002 != 6) {
                    IconCompat iconCompat = new IconCompat(-1);
                    iconCompat.f2404o00oOOoO = icon;
                    return iconCompat;
                }
                return IconCompat.o00oo0O0(o00oOo0o(icon));
            } else {
                return IconCompat.o00oo0o0(o00oOo0o(icon));
            }
        }

        public static IconCompat o00oOOoO(@oo0oO0 Object obj) {
            obj.getClass();
            int o00oOo002 = o00oOo00.o00oOo00(obj);
            if (o00oOo002 != 2) {
                if (o00oOo002 != 4) {
                    if (o00oOo002 != 6) {
                        IconCompat iconCompat = new IconCompat(-1);
                        iconCompat.f2404o00oOOoO = obj;
                        return iconCompat;
                    }
                    return IconCompat.o00oo0O0(o00oOo0o(obj));
                }
                return IconCompat.o00oo0o0(o00oOo0o(obj));
            }
            return IconCompat.o00oo(null, o00oOo00.o00oOOoO(obj), o00oOo00.o00oOOo0(obj));
        }

        @o0O0O0o0
        @oo0OOoo
        public static int o00oOo00(@oo0oO0 Object obj) {
            return o00oOo00.o00oOOo0(obj);
        }

        public static int o00oOo0O(@oo0oO0 Object obj) {
            return o00oOo00.o00oOo00(obj);
        }

        @o0O0O0Oo
        @o0OO00OO
        public static Uri o00oOo0o(@oo0oO0 Object obj) {
            return o00oOo00.o00oOooO(obj);
        }

        @o0O0O0Oo
        public static Icon o00oOoO(IconCompat iconCompat, Context context) {
            Icon createWithBitmap;
            Bitmap bitmap;
            switch (iconCompat.f2403o00oOOo0) {
                case -1:
                    return (Icon) iconCompat.f2404o00oOOoO;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f2404o00oOOoO);
                    break;
                case 2:
                    createWithBitmap = Icon.createWithResource(iconCompat.o00ooO0O(), iconCompat.f2406o00oOo0O);
                    break;
                case 3:
                    createWithBitmap = Icon.createWithData((byte[]) iconCompat.f2404o00oOOoO, iconCompat.f2406o00oOo0O, iconCompat.f2407o00oOo0o);
                    break;
                case 4:
                    createWithBitmap = Icon.createWithContentUri((String) iconCompat.f2404o00oOOoO);
                    break;
                case 5:
                    bitmap = (Bitmap) iconCompat.f2404o00oOOoO;
                    createWithBitmap = o00oOOoO.o00oOOoO(bitmap);
                    break;
                case 6:
                    if (Build.VERSION.SDK_INT >= 30) {
                        createWithBitmap = o00oOo0O.o00oOOo0(iconCompat.o00ooOO0());
                        break;
                    } else if (context == null) {
                        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Context is required to resolve the file uri of the icon: ");
                        o00oOOo02.append(iconCompat.o00ooOO0());
                        throw new IllegalArgumentException(o00oOOo02.toString());
                    } else {
                        InputStream o00ooOO2 = iconCompat.o00ooOO(context);
                        if (o00ooOO2 == null) {
                            StringBuilder o00oOOo03 = android.support.v4.media.o00oOo0O.o00oOOo0("Cannot load adaptive icon from uri: ");
                            o00oOOo03.append(iconCompat.o00ooOO0());
                            throw new IllegalStateException(o00oOOo03.toString());
                        }
                        bitmap = BitmapFactory.decodeStream(o00ooOO2);
                        createWithBitmap = o00oOOoO.o00oOOoO(bitmap);
                        break;
                    }
            }
            ColorStateList colorStateList = iconCompat.f2409o00oOoO0;
            if (colorStateList != null) {
                createWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f2408o00oOoO;
            if (mode != IconCompat.f2400o00ooOo) {
                createWithBitmap.setTintMode(mode);
            }
            return createWithBitmap;
        }

        @o0O0O0Oo
        public static Drawable o00oOoO0(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        @o0OO00OO
        public static String o00oOooO(@oo0oO0 Object obj) {
            return o00oOo00.o00oOOoO(obj);
        }
    }

    @o0OOooO0(26)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o0O0O0Oo
        public static Drawable o00oOOo0(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        @o0O0O0Oo
        public static Icon o00oOOoO(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    @o0OOooO0(28)
    /* loaded from: classes.dex */
    public static class o00oOo00 {
        @o0O0O0Oo
        public static int o00oOOo0(Object obj) {
            return ((Icon) obj).getResId();
        }

        @o0O0O0Oo
        public static String o00oOOoO(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        @o0O0O0Oo
        public static int o00oOo00(Object obj) {
            return ((Icon) obj).getType();
        }

        @o0O0O0Oo
        public static Uri o00oOooO(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    @o0OOooO0(30)
    /* loaded from: classes.dex */
    public static class o00oOo0O {
        @o0O0O0Oo
        public static Icon o00oOOo0(Uri uri) {
            Icon createWithAdaptiveBitmapContentUri;
            createWithAdaptiveBitmapContentUri = Icon.createWithAdaptiveBitmapContentUri(uri);
            return createWithAdaptiveBitmapContentUri;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    /* loaded from: classes.dex */
    public @interface o00oOoO {
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public IconCompat() {
        this.f2403o00oOOo0 = -1;
        this.f2405o00oOo00 = null;
        this.f2412o00oOooO = null;
        this.f2406o00oOo0O = 0;
        this.f2407o00oOo0o = 0;
        this.f2409o00oOoO0 = null;
        this.f2408o00oOoO = f2400o00ooOo;
        this.f2410o00oOoOO = null;
    }

    public IconCompat(int i) {
        this.f2405o00oOo00 = null;
        this.f2412o00oOooO = null;
        this.f2406o00oOo0O = 0;
        this.f2407o00oOo0o = 0;
        this.f2409o00oOoO0 = null;
        this.f2408o00oOoO = f2400o00ooOo;
        this.f2410o00oOoOO = null;
        this.f2403o00oOOo0 = i;
    }

    @o0OO00OO
    public static IconCompat o00oOoOo(@oo0oO0 Bundle bundle) {
        Object parcelable;
        int i = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i);
        iconCompat.f2406o00oOo0O = bundle.getInt(f2392o00ooO);
        iconCompat.f2407o00oOo0o = bundle.getInt(f2398o00ooOO0);
        iconCompat.f2411o00oOoOo = bundle.getString(f2401o00ooOo0);
        if (bundle.containsKey(f2397o00ooOO)) {
            iconCompat.f2409o00oOoO0 = (ColorStateList) bundle.getParcelable(f2397o00ooOO);
        }
        if (bundle.containsKey(f2399o00ooOOo)) {
            iconCompat.f2408o00oOoO = PorterDuff.Mode.valueOf(bundle.getString(f2399o00ooOOo));
        }
        switch (i) {
            case -1:
            case 1:
            case 5:
                parcelable = bundle.getParcelable(f2396o00ooO0o);
                iconCompat.f2404o00oOOoO = parcelable;
                break;
            case 0:
            default:
                return null;
            case 2:
            case 4:
            case 6:
                parcelable = bundle.getString(f2396o00ooO0o);
                iconCompat.f2404o00oOOoO = parcelable;
                break;
            case 3:
                iconCompat.f2404o00oOOoO = bundle.getByteArray(f2396o00ooO0o);
                break;
        }
        return iconCompat;
    }

    @o0OOooO0(23)
    @o0OO00OO
    public static IconCompat o00oOoo0(@oo0oO0 Context context, @oo0oO0 Icon icon) {
        icon.getClass();
        return o00oOOo0.o00oOOo0(context, icon);
    }

    @o0OOooO0(23)
    @o0OO00OO
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public static IconCompat o00oOooo(@oo0oO0 Icon icon) {
        return o00oOOo0.o00oOOoO(icon);
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public static IconCompat o00oo(@o0OO00OO Resources resources, @oo0oO0 String str, @o0O0O0o0 int i) {
        str.getClass();
        if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f2406o00oOo0O = i;
            if (resources != null) {
                try {
                    iconCompat.f2404o00oOOoO = resources.getResourceName(i);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f2404o00oOOoO = str;
            }
            iconCompat.f2411o00oOoOo = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    @o0o0000
    public static Bitmap o00oo0(Bitmap bitmap, boolean z) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, o0O00000.f11832o00oo0o0);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, o0O00000.f11830o00oo0Oo);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    @o0OOooO0(23)
    @o0OO00OO
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public static IconCompat o00oo00O(@oo0oO0 Icon icon) {
        if (o00oOo00.o00oOo00(icon) == 2 && o00oOo00.o00oOOo0(icon) == 0) {
            return null;
        }
        return o00oOOo0.o00oOOoO(icon);
    }

    @oo0oO0
    public static IconCompat o00oo0O(@oo0oO0 String str) {
        str.getClass();
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f2404o00oOOoO = str;
        return iconCompat;
    }

    @oo0oO0
    public static IconCompat o00oo0O0(@oo0oO0 Uri uri) {
        uri.getClass();
        return o00oo0O(uri.toString());
    }

    @oo0oO0
    public static IconCompat o00oo0OO(@oo0oO0 Bitmap bitmap) {
        bitmap.getClass();
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.f2404o00oOOoO = bitmap;
        return iconCompat;
    }

    @oo0oO0
    public static IconCompat o00oo0Oo(@oo0oO0 Bitmap bitmap) {
        bitmap.getClass();
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f2404o00oOOoO = bitmap;
        return iconCompat;
    }

    @oo0oO0
    public static IconCompat o00oo0o(@oo0oO0 String str) {
        str.getClass();
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f2404o00oOOoO = str;
        return iconCompat;
    }

    @oo0oO0
    public static IconCompat o00oo0o0(@oo0oO0 Uri uri) {
        uri.getClass();
        return o00oo0o(uri.toString());
    }

    @oo0oO0
    public static IconCompat o00oo0oO(@oo0oO0 byte[] bArr, int i, int i2) {
        bArr.getClass();
        IconCompat iconCompat = new IconCompat(3);
        iconCompat.f2404o00oOOoO = bArr;
        iconCompat.f2406o00oOo0O = i;
        iconCompat.f2407o00oOo0o = i2;
        return iconCompat;
    }

    public static Resources o00ooO0o(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            String.format("Unable to find pkg=%s for icon", str);
            return null;
        }
    }

    public static String o00ooo0o(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    @oo0oO0
    public static IconCompat o0O0o(@oo0oO0 Context context, @o0O0O0o0 int i) {
        context.getClass();
        return o00oo(context.getResources(), context.getPackageName(), i);
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void o00oOo0o() {
        Parcelable parcelable;
        this.f2408o00oOoO = PorterDuff.Mode.valueOf(this.f2410o00oOoOO);
        switch (this.f2403o00oOOo0) {
            case -1:
                parcelable = this.f2412o00oOooO;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                parcelable = this.f2412o00oOooO;
                if (parcelable == null) {
                    byte[] bArr = this.f2405o00oOo00;
                    this.f2404o00oOOoO = bArr;
                    this.f2403o00oOOo0 = 3;
                    this.f2406o00oOo0O = 0;
                    this.f2407o00oOo0o = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f2405o00oOo00, Charset.forName(C.UTF16_NAME));
                this.f2404o00oOOoO = str;
                if (this.f2403o00oOOo0 == 2 && this.f2411o00oOoOo == null) {
                    this.f2411o00oOoOo = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f2404o00oOOoO = this.f2405o00oOo00;
                return;
        }
        this.f2404o00oOOoO = parcelable;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void o00oOoO(@oo0oO0 Intent intent, @o0OO00OO Drawable drawable, @oo0oO0 Context context) {
        Bitmap bitmap;
        o00oOoOO(context);
        int i = this.f2403o00oOOo0;
        if (i == 1) {
            bitmap = (Bitmap) this.f2404o00oOOoO;
            if (drawable != null) {
                bitmap = bitmap.copy(bitmap.getConfig(), true);
            }
        } else if (i == 2) {
            try {
                Context createPackageContext = context.createPackageContext(o00ooO0O(), 0);
                if (drawable == null) {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(createPackageContext, this.f2406o00oOo0O));
                    return;
                }
                Drawable drawable2 = o0.getDrawable(createPackageContext, this.f2406o00oOo0O);
                if (drawable2.getIntrinsicWidth() > 0 && drawable2.getIntrinsicHeight() > 0) {
                    bitmap = Bitmap.createBitmap(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    drawable2.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    drawable2.draw(new Canvas(bitmap));
                }
                int launcherLargeIconSize = ((ActivityManager) createPackageContext.getSystemService("activity")).getLauncherLargeIconSize();
                bitmap = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Bitmap.Config.ARGB_8888);
                drawable2.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                drawable2.draw(new Canvas(bitmap));
            } catch (PackageManager.NameNotFoundException e) {
                StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Can't find package ");
                o00oOOo02.append(this.f2404o00oOOoO);
                throw new IllegalArgumentException(o00oOOo02.toString(), e);
            }
        } else if (i != 5) {
            throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
        } else {
            bitmap = o00oo0((Bitmap) this.f2404o00oOOoO, true);
        }
        if (drawable != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            drawable.setBounds(width / 2, height / 2, width, height);
            drawable.draw(new Canvas(bitmap));
        }
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void o00oOoO0(boolean z) {
        this.f2410o00oOoOO = this.f2408o00oOoO.name();
        switch (this.f2403o00oOOo0) {
            case -1:
                if (z) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.f2404o00oOOoO).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f2405o00oOo00 = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.f2405o00oOo00 = ((String) this.f2404o00oOOoO).getBytes(Charset.forName(C.UTF16_NAME));
                return;
            case 3:
                this.f2405o00oOo00 = (byte[]) this.f2404o00oOOoO;
                return;
            case 4:
            case 6:
                this.f2405o00oOo00 = this.f2404o00oOOoO.toString().getBytes(Charset.forName(C.UTF16_NAME));
                return;
        }
        this.f2412o00oOooO = (Parcelable) this.f2404o00oOOoO;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void o00oOoOO(@oo0oO0 Context context) {
        Object obj;
        int identifier;
        if (this.f2403o00oOOo0 != 2 || (obj = this.f2404o00oOOoO) == null) {
            return;
        }
        String str = (String) obj;
        if (str.contains(":")) {
            String str2 = str.split(":", -1)[1];
            String str3 = str2.split("/", -1)[0];
            String str4 = str2.split("/", -1)[1];
            String str5 = str.split(":", -1)[0];
            if ("0_resource_name_obfuscated".equals(str4) || this.f2406o00oOo0O == (identifier = o00ooO0o(context, o00ooO0O()).getIdentifier(str4, str3, str5))) {
                return;
            }
            this.f2406o00oOo0O = identifier;
        }
    }

    public int o00ooO() {
        int i = this.f2403o00oOOo0;
        return i == -1 ? o00oOo00.o00oOo00(this.f2404o00oOOoO) : i;
    }

    @o0O0O0o0
    public int o00ooO0() {
        int i = this.f2403o00oOOo0;
        if (i == -1) {
            return o00oOo00.o00oOOo0(this.f2404o00oOOoO);
        }
        if (i == 2) {
            return this.f2406o00oOo0O;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    @o0OO00OO
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public Bitmap o00ooO00() {
        int i = this.f2403o00oOOo0;
        if (i == -1) {
            Object obj = this.f2404o00oOOoO;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        } else if (i == 1) {
            return (Bitmap) this.f2404o00oOOoO;
        } else {
            if (i == 5) {
                return o00oo0((Bitmap) this.f2404o00oOOoO, true);
            }
            throw new IllegalStateException("called getBitmap() on " + this);
        }
    }

    @oo0oO0
    public String o00ooO0O() {
        int i = this.f2403o00oOOo0;
        if (i == -1) {
            return o00oOo00.o00oOOoO(this.f2404o00oOOoO);
        }
        if (i == 2) {
            String str = this.f2411o00oOoOo;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f2404o00oOOoO).split(":", -1)[0] : this.f2411o00oOoOo;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    @o0OO00OO
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public InputStream o00ooOO(@oo0oO0 Context context) {
        Uri o00ooOO02 = o00ooOO0();
        String scheme = o00ooOO02.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            return context.getContentResolver().openInputStream(o00ooOO02);
        }
        try {
            return new FileInputStream(new File((String) this.f2404o00oOOoO));
        } catch (FileNotFoundException | Exception unused) {
            o00ooOO02.toString();
            return null;
        }
    }

    @oo0oO0
    public Uri o00ooOO0() {
        int i = this.f2403o00oOOo0;
        if (i == -1) {
            return o00oOOo0.o00oOo0o(this.f2404o00oOOoO);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f2404o00oOOoO);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    @o0OO00OO
    public Drawable o00ooOOo(@oo0oO0 Context context) {
        o00oOoOO(context);
        return o00oOOo0.o00oOoO0(o00ooo0O(context), context);
    }

    @oo0oO0
    public IconCompat o00ooOo(@o0O00O int i) {
        return o00ooOoO(ColorStateList.valueOf(i));
    }

    public final Drawable o00ooOo0(Context context) {
        switch (this.f2403o00oOOo0) {
            case 1:
                return new BitmapDrawable(context.getResources(), (Bitmap) this.f2404o00oOOoO);
            case 2:
                String o00ooO0O2 = o00ooO0O();
                if (TextUtils.isEmpty(o00ooO0O2)) {
                    o00ooO0O2 = context.getPackageName();
                }
                try {
                    return o0O0OO.o00oOoO0(o00ooO0o(context, o00ooO0O2), this.f2406o00oOo0O, context.getTheme());
                } catch (RuntimeException unused) {
                    String.format("Unable to load resource 0x%08x from pkg=%s", Integer.valueOf(this.f2406o00oOo0O), this.f2404o00oOOoO);
                    break;
                }
            case 3:
                return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.f2404o00oOOoO, this.f2406o00oOo0O, this.f2407o00oOo0o));
            case 4:
                InputStream o00ooOO2 = o00ooOO(context);
                if (o00ooOO2 != null) {
                    return new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(o00ooOO2));
                }
                break;
            case 5:
                return new BitmapDrawable(context.getResources(), o00oo0((Bitmap) this.f2404o00oOOoO, false));
            case 6:
                InputStream o00ooOO3 = o00ooOO(context);
                if (o00ooOO3 != null) {
                    return o00oOOoO.o00oOOo0(null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(o00ooOO3)));
                }
                break;
        }
        return null;
    }

    @oo0oO0
    public IconCompat o00ooOoO(@o0OO00OO ColorStateList colorStateList) {
        this.f2409o00oOoO0 = colorStateList;
        return this;
    }

    @oo0oO0
    public IconCompat o00ooOoo(@o0OO00OO PorterDuff.Mode mode) {
        this.f2408o00oOoO = mode;
        return this;
    }

    @o0OOooO0(23)
    @oo0oO0
    @Deprecated
    public Icon o00ooo0() {
        return o00ooo0O(null);
    }

    @oo0oO0
    public Bundle o00ooo00() {
        Parcelable parcelable;
        Bundle bundle = new Bundle();
        switch (this.f2403o00oOOo0) {
            case -1:
                parcelable = (Parcelable) this.f2404o00oOOoO;
                bundle.putParcelable(f2396o00ooO0o, parcelable);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                parcelable = (Bitmap) this.f2404o00oOOoO;
                bundle.putParcelable(f2396o00ooO0o, parcelable);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString(f2396o00ooO0o, (String) this.f2404o00oOOoO);
                break;
            case 3:
                bundle.putByteArray(f2396o00ooO0o, (byte[]) this.f2404o00oOOoO);
                break;
        }
        bundle.putInt("type", this.f2403o00oOOo0);
        bundle.putInt(f2392o00ooO, this.f2406o00oOo0O);
        bundle.putInt(f2398o00ooOO0, this.f2407o00oOo0o);
        bundle.putString(f2401o00ooOo0, this.f2411o00oOoOo);
        ColorStateList colorStateList = this.f2409o00oOoO0;
        if (colorStateList != null) {
            bundle.putParcelable(f2397o00ooOO, colorStateList);
        }
        PorterDuff.Mode mode = this.f2408o00oOoO;
        if (mode != f2400o00ooOo) {
            bundle.putString(f2399o00ooOOo, mode.name());
        }
        return bundle;
    }

    @o0OOooO0(23)
    @oo0oO0
    public Icon o00ooo0O(@o0OO00OO Context context) {
        return o00oOOo0.o00oOoO(this, context);
    }

    @oo0oO0
    public String toString() {
        int height;
        if (this.f2403o00oOOo0 == -1) {
            return String.valueOf(this.f2404o00oOOoO);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(o00ooo0o(this.f2403o00oOOo0));
        switch (this.f2403o00oOOo0) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f2404o00oOOoO).getWidth());
                sb.append("x");
                height = ((Bitmap) this.f2404o00oOOoO).getHeight();
                sb.append(height);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f2411o00oOoOo);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(o00ooO0())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f2406o00oOo0O);
                if (this.f2407o00oOo0o != 0) {
                    sb.append(" off=");
                    height = this.f2407o00oOo0o;
                    sb.append(height);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f2404o00oOOoO);
                break;
        }
        if (this.f2409o00oOoO0 != null) {
            sb.append(" tint=");
            sb.append(this.f2409o00oOoO0);
        }
        if (this.f2408o00oOoO != f2400o00ooOo) {
            sb.append(" mode=");
            sb.append(this.f2408o00oOoO);
        }
        sb.append(")");
        return sb.toString();
    }
}
