package o0Oo00oo;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.util.Map;
import java.util.Set;
import multispace.multiapp.clone.app.App;
import o00oOooO.o0OO00OO;
import o0OOoO0.o00oo;
/* loaded from: classes3.dex */
public class o0O00 implements SharedPreferences {

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f15678o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final Uri f15685o00oOooO;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public Context f15686o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public Uri f15687o00oOOoO;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final String f15680o00oOo0o = o00oo.o00oOOo0(new byte[]{-31, 112, -21, -1, 122, Ascii.VT, -32, 63, -4, 103, -4}, new byte[]{-107, 9, -101, -102, 37, 120, -108, 77});

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final String f15682o00oOoO0 = o00oo.o00oOOo0(new byte[]{43, Ascii.EM, -70, 114, Ascii.SUB, -90, 109, -110}, new byte[]{95, 96, -54, Ascii.ETB, 69, -49, 3, -26});

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final String f15681o00oOoO = o00oo.o00oOOo0(new byte[]{8, -89, Ascii.DLE, -93, -94, -125, 108, -74, Ascii.ESC}, new byte[]{124, -34, 96, -58, -3, -17, 3, -40});

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final String f15683o00oOoOO = o00oo.o00oOOo0(new byte[]{-54, -114, 42, -47, -30, -97, 102, 66, -33, -125}, new byte[]{-66, -9, 90, -76, -67, -7, 10, 45});

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final String f15684o00oOoOo = o00oo.o00oOOo0(new byte[]{-37, -127, -22, -55, -64, -27, 118, 104, -61, -99, -5, -62}, new byte[]{-81, -8, -102, -84, -97, -121, Ascii.EM, 7});

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static o0O00 f15679o00oOo0O = null;

    /* loaded from: classes3.dex */
    public final class o00oOOoO implements SharedPreferences.Editor {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public ContentValues f15688o00oOOo0;

        public o00oOOoO() {
            this.f15688o00oOOo0 = new ContentValues();
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            o0O00.this.f15686o00oOOo0.getContentResolver().update(o0O00.this.f15687o00oOOoO, this.f15688o00oOOo0, null, null);
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.f15688o00oOOo0.clear();
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            return o0O00.this.f15686o00oOOo0.getContentResolver().update(o0O00.this.f15687o00oOOoO, this.f15688o00oOOo0, null, null) != -1;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            this.f15688o00oOOo0.put(str, Boolean.valueOf(z));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f) {
            this.f15688o00oOOo0.put(str, Float.valueOf(f));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i) {
            this.f15688o00oOOo0.put(str, Integer.valueOf(i));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j) {
            this.f15688o00oOOo0.put(str, Long.valueOf(j));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, @o0OO00OO String str2) {
            this.f15688o00oOOo0.put(str, str2);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, @o0OO00OO Set<String> set) {
            throw new UnsupportedOperationException();
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            this.f15688o00oOOo0.remove(str);
            return this;
        }
    }

    static {
        String str = App.o00oOOoO().getPackageName() + o00oo.o00oOOo0(new byte[]{-40, 102, -100, 71, Ascii.DLE, -18, -94, -123, -97, 113, -119, Ascii.ESC}, new byte[]{-10, Ascii.NAK, -20, 105, 96, -100, -51, -13});
        f15678o00oOo00 = str;
        f15685o00oOooO = Uri.parse(o00oo.o00oOOo0(new byte[]{-2, -31, 37, -59, 73, 46, -109, 38, -78, -95}, new byte[]{-99, -114, 75, -79, 44, SignedBytes.MAX_POWER_OF_TWO, -25, Ascii.FS}) + str + o00oo.o00oOOo0(new byte[]{-124, -97, Byte.MAX_VALUE, 93, -119, -77, -127, -30, -39, -119, 113, 89, -119, -77, -117, -47, -50, -97}, new byte[]{-85, -20, Ascii.ETB, 60, -5, -42, -27, -78}));
    }

    public o0O00(Context context) {
        this.f15686o00oOOo0 = context;
        this.f15687o00oOOoO = f15685o00oOooO;
    }

    public o0O00(Context context, Uri uri) {
        this.f15686o00oOOo0 = context;
        this.f15687o00oOOoO = uri;
    }

    public static o0O00 o00oOo00() {
        if (f15679o00oOo0O == null) {
            synchronized (o0O00.class) {
                if (f15679o00oOo0O == null) {
                    f15679o00oOo0O = new o0O00(App.o00oOOoO(), f15685o00oOooO);
                }
            }
        }
        return f15679o00oOo0O;
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        throw new RuntimeException(o00oo.o00oOOo0(new byte[]{-47, -18, -100, 95, -89, 114, -51, 47, -48, -13, -100}, new byte[]{-65, -127, -24, Byte.MAX_VALUE, -44, 7, -67, 95}));
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new o00oOOoO();
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        throw new RuntimeException(o00oo.o00oOOo0(new byte[]{-24, -21, 125, 125, -71, 48, 99, -114, -23, -10, 125}, new byte[]{-122, -124, 9, 93, -54, 69, 19, -2}));
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        return ((Boolean) o00oOooO(str, f15684o00oOoOo, Boolean.valueOf(z))).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f) {
        return ((Float) o00oOooO(str, f15683o00oOoOO, Float.valueOf(f))).floatValue();
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        return ((Integer) o00oOooO(str, f15682o00oOoO0, Integer.valueOf(i))).intValue();
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        return ((Long) o00oOooO(str, f15681o00oOoO, Long.valueOf(j))).longValue();
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, @o0OO00OO String str2) {
        return (String) o00oOooO(str, f15680o00oOo0o, str2);
    }

    @Override // android.content.SharedPreferences
    @o0OO00OO
    public Set<String> getStringSet(String str, @o0OO00OO Set<String> set) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.CharSequence, T, java.lang.String] */
    public <T> T o00oOooO(String str, String str2, T t) {
        ?? r2;
        boolean z = false;
        Cursor query = this.f15686o00oOOo0.getContentResolver().query(this.f15687o00oOOoO, new String[]{str, str2}, null, null, null);
        try {
            if (query != null) {
                try {
                    query.moveToFirst();
                    r2 = (T) query.getString(0);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (TextUtils.isEmpty(r2)) {
                    try {
                        query.close();
                    } catch (Exception unused) {
                    }
                    return t;
                }
                switch (str2.hashCode()) {
                    case -1092271849:
                        if (str2.equals(f15683o00oOoOO)) {
                            z = true;
                            break;
                        }
                        z = true;
                        break;
                    case -870070237:
                        if (str2.equals(f15684o00oOoOo)) {
                            z = true;
                            break;
                        }
                        z = true;
                        break;
                    case -675993238:
                        if (str2.equals(f15682o00oOoO0)) {
                            z = true;
                            break;
                        }
                        z = true;
                        break;
                    case 519136353:
                        if (str2.equals(f15681o00oOoO)) {
                            z = true;
                            break;
                        }
                        z = true;
                        break;
                    case 878975158:
                        if (str2.equals(f15680o00oOo0o)) {
                            break;
                        }
                        z = true;
                        break;
                    default:
                        z = true;
                        break;
                }
                if (!z) {
                    try {
                        query.close();
                    } catch (Exception unused2) {
                    }
                    return r2;
                } else if (z) {
                    T t2 = (T) Integer.valueOf((String) r2);
                    try {
                        query.close();
                    } catch (Exception unused3) {
                    }
                    return t2;
                } else if (z) {
                    T t3 = (T) Long.valueOf((String) r2);
                    try {
                        query.close();
                    } catch (Exception unused4) {
                    }
                    return t3;
                } else if (z) {
                    T t4 = (T) Float.valueOf((String) r2);
                    try {
                        query.close();
                    } catch (Exception unused5) {
                    }
                    return t4;
                } else {
                    if (z) {
                        T t5 = (T) Boolean.valueOf((String) r2);
                        try {
                            query.close();
                        } catch (Exception unused6) {
                        }
                        return t5;
                    }
                    try {
                        query.close();
                    } catch (Exception unused7) {
                    }
                }
            }
            return t;
        } catch (Throwable th) {
            try {
                query.close();
            } catch (Exception unused8) {
            }
            throw th;
        }
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException();
    }
}
