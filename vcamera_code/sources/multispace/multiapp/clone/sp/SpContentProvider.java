package multispace.multiapp.clone.sp;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.util.Set;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0OOO0oo.oo0OOoo;
import o0OOoO0.o00oo;
import o0Oo0oo0.o0OO0o00;
/* loaded from: classes3.dex */
public class SpContentProvider extends ContentProvider {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final String f6693o00oo0O = o00oo.o00oOOo0(new byte[]{99, -21, -17, 49, 75}, new byte[]{46, -110, -82, 65, 59, -90, 107, -111});

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static String f6694o00oo0Oo = o00oo.o00oOOo0(new byte[]{Ascii.VT, -44, Ascii.SYN, 58, 43, 8, -21, -84, 49, -41, 37, 45, oo0OOoo.f13516o00oOoO}, new byte[]{84, -71, 70, 72, 78, 110, -114, -34});

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public SharedPreferences f6695o00oo0O0;

    @Override // android.content.ContentProvider
    public int delete(@oo0oO0 Uri uri, @o0OO00OO String str, @o0OO00OO String[] strArr) {
        throw new UnsupportedOperationException(o00oo.o00oOOo0(new byte[]{106, 69, -90, -97, -15, -17, -18, -74, Ascii.SI, Ascii.NAK, -124, -36, -125, -45, -123, -34, 51, 97}, new byte[]{-114, -3, 43, 121, 101, SignedBytes.MAX_POWER_OF_TWO, 8, 58}));
    }

    @Override // android.content.ContentProvider
    @o0OO00OO
    public String getType(@oo0oO0 Uri uri) {
        return o00oo.o00oOOo0(new byte[]{-36, 100, 36, -127, -99, 108, -69, -56, -59, 99, 36, -127, -97, 119, -83, -55, -59, 120, 110, -58, -120, 103, -78, -107, -39, 98, o0OO0o00.f16655o00oOoOO, -35, -103, 102, -113, -56, -49, 108, 37, -35, -103, 108, -68, -33, -39}, new byte[]{-86, 10, SignedBytes.MAX_POWER_OF_TWO, -81, -4, 2, -33, -70});
    }

    @Override // android.content.ContentProvider
    @o0OO00OO
    public Uri insert(@oo0oO0 Uri uri, @o0OO00OO ContentValues contentValues) {
        throw new UnsupportedOperationException(o00oo.o00oOOo0(new byte[]{-90, -78, Ascii.US, -85, -104, 49, -69, 112, -61, -30, oo0OOoo.f13516o00oOoO, -24, -22, Ascii.CR, -48, Ascii.CAN, -1, -106}, new byte[]{66, 10, -110, 77, Ascii.FF, -98, 93, -4}));
    }

    public final void o00oOOo0(SharedPreferences.Editor editor, String str, Object obj) {
        if (obj instanceof Integer) {
            editor.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof String) {
            editor.putString(str, (String) obj);
        } else if (obj instanceof Float) {
            editor.putFloat(str, ((Float) obj).floatValue());
        } else if (!(obj instanceof Long)) {
            throw new IllegalArgumentException(o00oo.o00oOOo0(new byte[]{-51, -112, 0, -117, -22, 68, -67, -6, -52, -115, 0}, new byte[]{-93, -1, 116, -85, -103, 49, -51, -118}));
        } else {
            editor.putLong(str, ((Long) obj).longValue());
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        this.f6695o00oo0O0 = context.getSharedPreferences(getContext().getPackageName() + f6694o00oo0Oo, 0);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.content.ContentProvider
    @o0OO00OO
    public Cursor query(@oo0oO0 Uri uri, @o0OO00OO String[] strArr, @o0OO00OO String str, @o0OO00OO String[] strArr2, @o0OO00OO String str2) {
        boolean z;
        if (strArr == null || strArr.length < 2) {
            return null;
        }
        Object[] objArr = new Object[1];
        String str3 = strArr[0];
        String str4 = strArr[1];
        if (this.f6695o00oo0O0.contains(str3)) {
            switch (str4.hashCode()) {
                case -1092271849:
                    if (str4.equals(o00oo.o00oOOo0(new byte[]{-50, -43, -91, 67, 42, -86, -104, -90, -37, -40}, new byte[]{-70, -84, -43, 38, 117, -52, -12, -55}))) {
                        z = true;
                        break;
                    }
                    z = true;
                    break;
                case -870070237:
                    if (str4.equals(o00oo.o00oOOo0(new byte[]{-10, 37, -105, 89, -34, Ascii.DLE, -41, 87, -18, 57, -122, 82}, new byte[]{-126, 92, -25, 60, -127, 114, -72, 56}))) {
                        z = true;
                        break;
                    }
                    z = true;
                    break;
                case -675993238:
                    if (str4.equals(o00oo.o00oOOo0(new byte[]{Ascii.DLE, Ascii.DC2, -44, -23, -78, -116, Ascii.CR, 79}, new byte[]{100, 107, -92, -116, -19, -27, 99, 59}))) {
                        z = true;
                        break;
                    }
                    z = true;
                    break;
                case 519136353:
                    if (str4.equals(o00oo.o00oOOo0(new byte[]{116, 66, -11, 122, 106, -90, 34, 6, 103}, new byte[]{0, 59, -123, Ascii.US, 53, -54, 77, 104}))) {
                        z = true;
                        break;
                    }
                    z = true;
                    break;
                case 878975158:
                    if (str4.equals(o00oo.o00oOOo0(new byte[]{38, Ascii.EM, 95, 96, Byte.MIN_VALUE, -6, 99, -27, 59, Ascii.SO, 72}, new byte[]{82, 96, 47, 5, -33, -119, Ascii.ETB, -105}))) {
                        z = false;
                        break;
                    }
                    z = true;
                    break;
                default:
                    z = true;
                    break;
            }
            if (!z) {
                objArr[0] = this.f6695o00oo0O0.getString(str3, "");
            } else if (z) {
                try {
                    objArr[0] = Integer.valueOf(this.f6695o00oo0O0.getInt(str3, -1));
                } catch (Throwable th) {
                    th.printStackTrace();
                    objArr[0] = -1;
                }
            } else if (z) {
                try {
                    objArr[0] = Long.valueOf(this.f6695o00oo0O0.getLong(str3, -1L));
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    objArr[0] = -1;
                }
            } else if (z) {
                try {
                    objArr[0] = Float.valueOf(this.f6695o00oo0O0.getFloat(str3, -1.0f));
                } catch (Throwable th3) {
                    th3.printStackTrace();
                    objArr[0] = -1;
                }
            } else if (z) {
                try {
                    objArr[0] = Boolean.valueOf(this.f6695o00oo0O0.getBoolean(str3, false));
                } catch (Throwable th4) {
                    th4.printStackTrace();
                    objArr[0] = Boolean.FALSE;
                }
            }
        } else {
            objArr[0] = "";
        }
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{str3});
        matrixCursor.addRow(objArr);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(@oo0oO0 Uri uri, @o0OO00OO ContentValues contentValues, @o0OO00OO String str, @o0OO00OO String[] strArr) {
        if (contentValues == null) {
            return -1;
        }
        Set<String> keySet = contentValues.keySet();
        SharedPreferences.Editor edit = this.f6695o00oo0O0.edit();
        for (String str2 : keySet) {
            o00oOOo0(edit, str2, contentValues.get(str2));
        }
        edit.apply();
        return keySet.size();
    }
}
