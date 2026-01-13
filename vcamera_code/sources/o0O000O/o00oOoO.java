package o0O000O;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import o00oOoOo.o00oo;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
import o00ooo0o.o0O0O0o0;
import o0O000O.o00oo0OO;
/* loaded from: classes.dex */
public class o00oOoO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final Comparator<byte[]> f10288o00oOOo0 = new Comparator() { // from class: o0O000O.o00oOo0O
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int o00oOoO02;
            o00oOoO02 = o00oOoO.o00oOoO0((byte[]) obj, (byte[]) obj2);
            return o00oOoO02;
        }
    };

    @o0OOooO0(16)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static Cursor o00oOOo0(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    public static List<byte[]> o00oOOoO(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    public static boolean o00oOo00(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    @oo0oO0
    public static o00oo0OO.o00oOOoO o00oOo0O(@oo0oO0 Context context, @oo0oO0 o00oo00O o00oo00o, @o0OO00OO CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo o00oOo0o2 = o00oOo0o(context.getPackageManager(), o00oo00o, context.getResources());
        return o00oOo0o2 == null ? new o00oo0OO.o00oOOoO(1, null) : new o00oo0OO.o00oOOoO(0, o00oOoO(context, o00oo00o, o00oOo0o2.authority, cancellationSignal));
    }

    @o0OO00OO
    @o0o0000
    public static ProviderInfo o00oOo0o(@oo0oO0 PackageManager packageManager, @oo0oO0 o00oo00O o00oo00o, @o0OO00OO Resources resources) throws PackageManager.NameNotFoundException {
        String str = o00oo00o.f10305o00oOOo0;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider != null) {
            if (!resolveContentProvider.packageName.equals(o00oo00o.f10306o00oOOoO)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + o00oo00o.f10306o00oOOoO);
            }
            List<byte[]> o00oOOoO2 = o00oOOoO(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(o00oOOoO2, f10288o00oOOo0);
            List<List<byte[]>> o00oOooO2 = o00oOooO(o00oo00o, resources);
            for (int i = 0; i < o00oOooO2.size(); i++) {
                ArrayList arrayList = new ArrayList(o00oOooO2.get(i));
                Collections.sort(arrayList, f10288o00oOOo0);
                if (o00oOo00(o00oOOoO2, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        }
        throw new PackageManager.NameNotFoundException(o00oo.o00oOOo0("No package found for authority: ", str));
    }

    @oo0oO0
    @o0o0000
    public static o00oo0OO.o00oOo00[] o00oOoO(Context context, o00oo00O o00oo00o, String str, CancellationSignal cancellationSignal) {
        int i;
        boolean z;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursor = null;
        try {
            int i2 = 0;
            cursor = o00oOOo0.o00oOOo0(context.getContentResolver(), build, new String[]{"_id", o00oo0OO.o00oOOo0.f10347o00oOOo0, o00oo0OO.o00oOOo0.f10348o00oOOoO, o00oo0OO.o00oOOo0.f10349o00oOo00, o00oo0OO.o00oOOo0.f10356o00oOooO, o00oo0OO.o00oOOo0.f10350o00oOo0O, o00oo0OO.o00oOOo0.f10351o00oOo0o}, "query = ?", new String[]{o00oo00o.f10307o00oOo00}, null, cancellationSignal);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex(o00oo0OO.o00oOOo0.f10351o00oOo0o);
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex(o00oo0OO.o00oOOo0.f10347o00oOOo0);
                int columnIndex4 = cursor.getColumnIndex(o00oo0OO.o00oOOo0.f10348o00oOOoO);
                int columnIndex5 = cursor.getColumnIndex(o00oo0OO.o00oOOo0.f10356o00oOooO);
                int columnIndex6 = cursor.getColumnIndex(o00oo0OO.o00oOOo0.f10350o00oOo0O);
                while (cursor.moveToNext()) {
                    int i3 = columnIndex != -1 ? cursor.getInt(columnIndex) : i2;
                    int i4 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : i2;
                    int i5 = i3;
                    Uri withAppendedId = columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    int i6 = columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400;
                    if (columnIndex6 == -1 || cursor.getInt(columnIndex6) != 1) {
                        i = i5;
                        z = false;
                    } else {
                        i = i5;
                        z = true;
                    }
                    arrayList2.add(o00oo0OO.o00oOo00.o00oOOo0(withAppendedId, i4, i6, z, i));
                    i2 = 0;
                }
                arrayList = arrayList2;
            }
            return (o00oo0OO.o00oOo00[]) arrayList.toArray(new o00oo0OO.o00oOo00[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public static /* synthetic */ int o00oOoO0(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }

    public static List<List<byte[]>> o00oOooO(o00oo00O o00oo00o, Resources resources) {
        List<List<byte[]>> list = o00oo00o.f10310o00oOooO;
        return list != null ? list : o0O0O0o0.o00oOo00(resources, o00oo00o.f10308o00oOo0O);
    }
}
