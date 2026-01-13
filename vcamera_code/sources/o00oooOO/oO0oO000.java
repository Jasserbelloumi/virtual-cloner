package o00oooOO;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import o0OOOO.o00oo;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a@\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\b\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroid/database/sqlite/SQLiteDatabase;", "", "exclusive", "Lkotlin/Function1;", "Lo0OO0o/o0O000Oo;", "body", "o00oOOo0", "(Landroid/database/sqlite/SQLiteDatabase;ZLo0OOOO/o00oo;)Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class oO0oO000 {
    public static final <T> T o00oOOo0(@NotNull SQLiteDatabase sQLiteDatabase, boolean z, @NotNull o00oo<? super SQLiteDatabase, ? extends T> o00ooVar) {
        o0ooO.o00oo0O0(sQLiteDatabase, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "body");
        if (z) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            T invoke = o00ooVar.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return invoke;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public static Object o00oOOoO(SQLiteDatabase sQLiteDatabase, boolean z, o00oo o00ooVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        o0ooO.o00oo0O0(sQLiteDatabase, "<this>");
        o0ooO.o00oo0O0(o00ooVar, "body");
        if (z) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            Object invoke = o00ooVar.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return invoke;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }
}
