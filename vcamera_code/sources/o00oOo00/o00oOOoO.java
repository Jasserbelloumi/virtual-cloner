package o00oOo00;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import o00oOo00.o00oOOo0;
import o00oOooO.o0O00O0;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OOooO0;
import o0OO0o.o0O0o00;
import o0OO0o.o0OO000;
import o0OO0oO.o0O000O;
import o0OO0oO.o0O0oo0o;
import o0OO0oO.oo0oO0;
import o0OO0oO.oo0ooO;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\u0018\u00002\u00020\u0001:\u0012\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0016"}, d2 = {"Lo00oOo00/o00oOOoO;", "", "<init>", "()V", "o00oOOo0", o0OO000o.o00oOOoO.f12961o00oOo00, "o00oOo00", "o00oOo0O", "o00oOoO", "o00oo00O", "o00oo0", "o00oo0OO", "o00oo0O0", "o00oo0O", "o0O0o", "o00oo", "o00ooO0", "o00ooO", "o0", "o0O00000", "o0O0000O", "o0O000", "activity_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class o00oOOoO {

    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001a\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0010"}, d2 = {"Lo00oOo00/o00oOOoO$o0;", "Lo00oOo00/o00oOOo0;", "Landroidx/activity/result/IntentSenderRequest;", "Landroidx/activity/result/ActivityResult;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "o00oOooO", "", "resultCode", "intent", "o00oOo0O", "<init>", "()V", "o00oOOo0", "activity_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class o0 extends o00oOo00.o00oOOo0<IntentSenderRequest, ActivityResult> {
        @NotNull

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final o00oOOo0 f6879o00oOOo0 = new o00oOOo0(null);
        @NotNull

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final String f6880o00oOOoO = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST";
        @NotNull

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final String f6881o00oOo00 = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST";
        @NotNull

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final String f6882o00oOooO = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION";

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lo00oOo00/o00oOOoO$o0$o00oOOo0;", "", "", "ACTION_INTENT_SENDER_REQUEST", "Ljava/lang/String;", "EXTRA_INTENT_SENDER_REQUEST", "EXTRA_SEND_INTENT_EXCEPTION", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class o00oOOo0 {
            public o00oOOo0() {
            }

            public o00oOOo0(o0O00 o0o00) {
            }
        }

        @Override // o00oOo00.o00oOOo0
        public ActivityResult o00oOo00(int i, Intent intent) {
            return new ActivityResult(i, intent);
        }

        @NotNull
        public ActivityResult o00oOo0O(int i, @Nullable Intent intent) {
            return new ActivityResult(i, intent);
        }

        @Override // o00oOo00.o00oOOo0
        @NotNull
        /* renamed from: o00oOooO */
        public Intent o00oOOo0(@NotNull Context context, @NotNull IntentSenderRequest intentSenderRequest) {
            o0ooO.o00oo0O0(context, "context");
            o0ooO.o00oo0O0(intentSenderRequest, "input");
            Intent putExtra = new Intent(f6880o00oOOoO).putExtra(f6881o00oOo00, intentSenderRequest);
            o0ooO.o00oo0OO(putExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
            return putExtra;
        }
    }

    @o0OOooO0(33)
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lo00oOo00/o00oOOoO$o00oOOo0;", "", "", "o00oOOo0", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 {
        @NotNull

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final o00oOOo0 f6883o00oOOo0 = new o00oOOo0();

        @o0O0O0Oo
        public final int o00oOOo0() {
            return MediaStore.getPickImagesMaxLimit();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0017J\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lo00oOo00/o00oOOoO$o00oOOoO;", "Lo00oOo00/o00oOOo0;", "Landroid/net/Uri;", "", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "o00oOooO", "Lo00oOo00/o00oOOo0$o00oOOo0;", "o00oOo0O", "", "resultCode", "intent", "o00oOo0o", "(ILandroid/content/Intent;)Ljava/lang/Boolean;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: o00oOo00.o00oOOoO$o00oOOoO  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0097o00oOOoO extends o00oOo00.o00oOOo0<Uri, Boolean> {
        @Override // o00oOo00.o00oOOo0
        @Nullable
        /* renamed from: o00oOo0O */
        public final o00oOOo0.C0096o00oOOo0<Boolean> o00oOOoO(@NotNull Context context, @NotNull Uri uri) {
            o0ooO.o00oo0O0(context, "context");
            o0ooO.o00oo0O0(uri, "input");
            return null;
        }

        @Override // o00oOo00.o00oOOo0
        @NotNull
        /* renamed from: o00oOo0o */
        public final Boolean o00oOo00(int i, @Nullable Intent intent) {
            return Boolean.valueOf(i == -1);
        }

        @Override // o00oOo00.o00oOOo0
        @o0O00O0
        @NotNull
        /* renamed from: o00oOooO */
        public Intent o00oOOo0(@NotNull Context context, @NotNull Uri uri) {
            o0ooO.o00oo0O0(context, "context");
            o0ooO.o00oo0O0(uri, "input");
            Intent putExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", uri);
            o0ooO.o00oo0OO(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return putExtra;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0017\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013B\t\b\u0017¢\u0006\u0004\b\u0012\u0010\u0014J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0017J \u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0007R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lo00oOo00/o00oOOoO$o00oOo00;", "Lo00oOo00/o00oOOo0;", "", "Landroid/net/Uri;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "o00oOooO", "Lo00oOo00/o00oOOo0$o00oOOo0;", "o00oOo0O", "", "resultCode", "intent", "o00oOo0o", "o00oOOo0", "Ljava/lang/String;", "mimeType", "<init>", "(Ljava/lang/String;)V", "()V", "activity_release"}, k = 1, mv = {1, 7, 1})
    @o0OOooO0(19)
    /* loaded from: classes.dex */
    public static class o00oOo00 extends o00oOo00.o00oOOo0<String, Uri> {
        @NotNull

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final String f6884o00oOOo0;

        @o0OO0o.o0O0o(message = "Using a wildcard mime type with CreateDocument is not recommended as it breaks the automatic handling of file extensions. Instead, specify the mime type by using the constructor that takes an concrete mime type (e.g.., CreateDocument(\"image/png\")).", replaceWith = @o0OO000(expression = "CreateDocument(\"todo/todo\")", imports = {}))
        public o00oOo00() {
            this("*/*");
        }

        public o00oOo00(@NotNull String str) {
            o0ooO.o00oo0O0(str, "mimeType");
            this.f6884o00oOOo0 = str;
        }

        @Override // o00oOo00.o00oOOo0
        @Nullable
        /* renamed from: o00oOo0O */
        public final o00oOOo0.C0096o00oOOo0<Uri> o00oOOoO(@NotNull Context context, @NotNull String str) {
            o0ooO.o00oo0O0(context, "context");
            o0ooO.o00oo0O0(str, "input");
            return null;
        }

        @Override // o00oOo00.o00oOOo0
        @Nullable
        /* renamed from: o00oOo0o */
        public final Uri o00oOo00(int i, @Nullable Intent intent) {
            if (!(i == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        @Override // o00oOo00.o00oOOo0
        @o0O00O0
        @NotNull
        /* renamed from: o00oOooO */
        public Intent o00oOOo0(@NotNull Context context, @NotNull String str) {
            o0ooO.o00oo0O0(context, "context");
            o0ooO.o00oo0O0(str, "input");
            Intent putExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.f6884o00oOOo0).putExtra("android.intent.extra.TITLE", str);
            o0ooO.o00oo0OO(putExtra, "Intent(Intent.ACTION_CRE…ntent.EXTRA_TITLE, input)");
            return putExtra;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0017J \u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0007¨\u0006\u0011"}, d2 = {"Lo00oOo00/o00oOOoO$o00oOo0O;", "Lo00oOo00/o00oOOo0;", "", "Landroid/net/Uri;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "o00oOooO", "Lo00oOo00/o00oOOo0$o00oOOo0;", "o00oOo0O", "", "resultCode", "intent", "o00oOo0o", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static class o00oOo0O extends o00oOo00.o00oOOo0<String, Uri> {
        @Override // o00oOo00.o00oOOo0
        @Nullable
        /* renamed from: o00oOo0O */
        public final o00oOOo0.C0096o00oOOo0<Uri> o00oOOoO(@NotNull Context context, @NotNull String str) {
            o0ooO.o00oo0O0(context, "context");
            o0ooO.o00oo0O0(str, "input");
            return null;
        }

        @Override // o00oOo00.o00oOOo0
        @Nullable
        /* renamed from: o00oOo0o */
        public final Uri o00oOo00(int i, @Nullable Intent intent) {
            if (!(i == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        @Override // o00oOo00.o00oOOo0
        @o0O00O0
        @NotNull
        /* renamed from: o00oOooO */
        public Intent o00oOOo0(@NotNull Context context, @NotNull String str) {
            o0ooO.o00oo0O0(context, "context");
            o0ooO.o00oo0O0(str, "input");
            Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str);
            o0ooO.o00oo0OO(type, "Intent(Intent.ACTION_GET…          .setType(input)");
            return type;
        }
    }

    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0017\u0018\u0000 \u00132\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u00030\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0017J$\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\t¨\u0006\u0014"}, d2 = {"Lo00oOo00/o00oOOoO$o00oOoO;", "Lo00oOo00/o00oOOo0;", "", "", "Landroid/net/Uri;", "Lo0OOOO0o/o00ooO;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "o00oOooO", "Lo00oOo00/o00oOOo0$o00oOOo0;", "o00oOo0O", "", "resultCode", "intent", "o00oOo0o", "<init>", "()V", "o00oOOo0", "activity_release"}, k = 1, mv = {1, 7, 1})
    @o0OOooO0(18)
    /* loaded from: classes.dex */
    public static class o00oOoO extends o00oOo00.o00oOOo0<String, List<Uri>> {
        @NotNull

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final o00oOOo0 f6885o00oOOo0 = new o00oOOo0(null);

        @o0OOooO0(18)
        @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lo00oOo00/o00oOOoO$o00oOoO$o00oOOo0;", "", "Landroid/content/Intent;", "", "Landroid/net/Uri;", "o00oOOo0", "(Landroid/content/Intent;)Ljava/util/List;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class o00oOOo0 {
            public o00oOOo0() {
            }

            public o00oOOo0(o0O00 o0o00) {
            }

            @NotNull
            public final List<Uri> o00oOOo0(@NotNull Intent intent) {
                o0ooO.o00oo0O0(intent, "<this>");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data = intent.getData();
                if (data != null) {
                    linkedHashSet.add(data);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    return o0OO0oO.o0ooO.INSTANCE;
                }
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i = 0; i < itemCount; i++) {
                        Uri uri = clipData.getItemAt(i).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                return new ArrayList(linkedHashSet);
            }
        }

        @Override // o00oOo00.o00oOOo0
        @Nullable
        /* renamed from: o00oOo0O */
        public final o00oOOo0.C0096o00oOOo0<List<Uri>> o00oOOoO(@NotNull Context context, @NotNull String str) {
            o0ooO.o00oo0O0(context, "context");
            o0ooO.o00oo0O0(str, "input");
            return null;
        }

        @Override // o00oOo00.o00oOOo0
        @NotNull
        /* renamed from: o00oOo0o */
        public final List<Uri> o00oOo00(int i, @Nullable Intent intent) {
            List<Uri> o00oOOo02;
            if (!(i == -1)) {
                intent = null;
            }
            return (intent == null || (o00oOOo02 = f6885o00oOOo0.o00oOOo0(intent)) == null) ? o0OO0oO.o0ooO.INSTANCE : o00oOOo02;
        }

        @Override // o00oOo00.o00oOOo0
        @o0O00O0
        @NotNull
        /* renamed from: o00oOooO */
        public Intent o00oOOo0(@NotNull Context context, @NotNull String str) {
            o0ooO.o00oo0O0(context, "context");
            o0ooO.o00oo0O0(str, "input");
            Intent putExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            o0ooO.o00oo0OO(putExtra, "Intent(Intent.ACTION_GET…TRA_ALLOW_MULTIPLE, true)");
            return putExtra;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00162%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u00040\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ9\u0010\u000e\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u0017"}, d2 = {"Lo00oOo00/o00oOOoO$o00oo;", "Lo00oOo00/o00oOOo0;", "", "", "", "", "Lo0OOOO0o/o00ooO;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "o00oOooO", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "Lo00oOo00/o00oOOo0$o00oOOo0;", "o00oOo0O", "(Landroid/content/Context;[Ljava/lang/String;)Lo00oOo00/o00oOOo0$o00oOOo0;", "", "resultCode", "intent", "o00oOo0o", "<init>", "()V", "o00oOOo0", "activity_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class o00oo extends o00oOo00.o00oOOo0<String[], Map<String, Boolean>> {
        @NotNull

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final o00oOOo0 f6886o00oOOo0 = new o00oOOo0(null);
        @NotNull

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final String f6887o00oOOoO = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS";
        @NotNull

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final String f6888o00oOo00 = "androidx.activity.result.contract.extra.PERMISSIONS";
        @NotNull

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final String f6889o00oOooO = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";

        @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u000e"}, d2 = {"Lo00oOo00/o00oOOoO$o00oo$o00oOOo0;", "", "", "", "input", "Landroid/content/Intent;", "o00oOOo0", "([Ljava/lang/String;)Landroid/content/Intent;", "ACTION_REQUEST_PERMISSIONS", "Ljava/lang/String;", "EXTRA_PERMISSIONS", "EXTRA_PERMISSION_GRANT_RESULTS", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class o00oOOo0 {
            public o00oOOo0() {
            }

            public o00oOOo0(o0O00 o0o00) {
            }

            @NotNull
            public final Intent o00oOOo0(@NotNull String[] strArr) {
                o0ooO.o00oo0O0(strArr, "input");
                Intent putExtra = new Intent(o00oo.f6887o00oOOoO).putExtra(o00oo.f6888o00oOo00, strArr);
                o0ooO.o00oo0OO(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra;
            }
        }

        @Override // o00oOo00.o00oOOo0
        @Nullable
        /* renamed from: o00oOo0O */
        public o00oOOo0.C0096o00oOOo0<Map<String, Boolean>> o00oOOoO(@NotNull Context context, @NotNull String[] strArr) {
            o0ooO.o00oo0O0(context, "context");
            o0ooO.o00oo0O0(strArr, "input");
            boolean z = true;
            if (strArr.length == 0) {
                return new o00oOOo0.C0096o00oOOo0<>(oo0ooO.o00ooO0O());
            }
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (!(o00ooo0.o0.checkSelfPermission(context, strArr[i]) == 0)) {
                    z = false;
                    break;
                }
                i++;
            }
            if (z) {
                int o00oOoOo2 = oo0oO0.o00oOoOo(strArr.length);
                if (o00oOoOo2 < 16) {
                    o00oOoOo2 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(o00oOoOo2);
                for (String str : strArr) {
                    o0O0o00 o0o0o00 = new o0O0o00(str, Boolean.TRUE);
                    linkedHashMap.put(o0o0o00.getFirst(), o0o0o00.getSecond());
                }
                return new o00oOOo0.C0096o00oOOo0<>(linkedHashMap);
            }
            return null;
        }

        @Override // o00oOo00.o00oOOo0
        @NotNull
        /* renamed from: o00oOo0o */
        public Map<String, Boolean> o00oOo00(int i, @Nullable Intent intent) {
            if (i == -1 && intent != null) {
                String[] stringArrayExtra = intent.getStringArrayExtra(f6888o00oOo00);
                int[] intArrayExtra = intent.getIntArrayExtra(f6889o00oOooO);
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return oo0ooO.o00ooO0O();
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i2 == 0));
                }
                return oo0ooO.o0O0O0o0(o0O0oo0o.o0o0O0(o0O000O.oOo000Oo(stringArrayExtra), arrayList));
            }
            return oo0ooO.o00ooO0O();
        }

        @Override // o00oOo00.o00oOOo0
        @NotNull
        /* renamed from: o00oOooO */
        public Intent o00oOOo0(@NotNull Context context, @NotNull String[] strArr) {
            o0ooO.o00oo0O0(context, "context");
            o0ooO.o00oo0O0(strArr, "input");
            return f6886o00oOOo0.o00oOOo0(strArr);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0017\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0017J\"\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002J\u001a\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0006¨\u0006\u0010"}, d2 = {"Lo00oOo00/o00oOOoO$o00oo0;", "Lo00oOo00/o00oOOo0;", "Landroid/net/Uri;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "o00oOooO", "Lo00oOo00/o00oOOo0$o00oOOo0;", "o00oOo0O", "", "resultCode", "intent", "o00oOo0o", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 7, 1})
    @o0OOooO0(21)
    /* loaded from: classes.dex */
    public static class o00oo0 extends o00oOo00.o00oOOo0<Uri, Uri> {
        @Override // o00oOo00.o00oOOo0
        @Nullable
        /* renamed from: o00oOo0O */
        public final o00oOOo0.C0096o00oOOo0<Uri> o00oOOoO(@NotNull Context context, @Nullable Uri uri) {
            o0ooO.o00oo0O0(context, "context");
            return null;
        }

        @Override // o00oOo00.o00oOOo0
        @Nullable
        /* renamed from: o00oOo0o */
        public final Uri o00oOo00(int i, @Nullable Intent intent) {
            if (!(i == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        @Override // o00oOo00.o00oOOo0
        @o0O00O0
        @NotNull
        /* renamed from: o00oOooO */
        public Intent o00oOOo0(@NotNull Context context, @Nullable Uri uri) {
            o0ooO.o00oo0O0(context, "context");
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            if (uri != null) {
                intent.putExtra("android.provider.extra.INITIAL_URI", uri);
            }
            return intent;
        }
    }

    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0017\u0018\u00002\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0017¢\u0006\u0004\b\t\u0010\nJ-\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\b¨\u0006\u0014"}, d2 = {"Lo00oOo00/o00oOOoO$o00oo00O;", "Lo00oOo00/o00oOOo0;", "", "", "Landroid/net/Uri;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "o00oOooO", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "Lo00oOo00/o00oOOo0$o00oOOo0;", "o00oOo0O", "(Landroid/content/Context;[Ljava/lang/String;)Lo00oOo00/o00oOOo0$o00oOOo0;", "", "resultCode", "intent", "o00oOo0o", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 7, 1})
    @o0OOooO0(19)
    /* loaded from: classes.dex */
    public static class o00oo00O extends o00oOo00.o00oOOo0<String[], Uri> {
        @Override // o00oOo00.o00oOOo0
        @Nullable
        /* renamed from: o00oOo0O */
        public final o00oOOo0.C0096o00oOOo0<Uri> o00oOOoO(@NotNull Context context, @NotNull String[] strArr) {
            o0ooO.o00oo0O0(context, "context");
            o0ooO.o00oo0O0(strArr, "input");
            return null;
        }

        @Override // o00oOo00.o00oOOo0
        @Nullable
        /* renamed from: o00oOo0o */
        public final Uri o00oOo00(int i, @Nullable Intent intent) {
            if (!(i == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        @Override // o00oOo00.o00oOOo0
        @o0O00O0
        @NotNull
        /* renamed from: o00oOooO */
        public Intent o00oOOo0(@NotNull Context context, @NotNull String[] strArr) {
            o0ooO.o00oo0O0(context, "context");
            o0ooO.o00oo0O0(strArr, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
            o0ooO.o00oo0OO(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }
    }

    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0017\u0018\u0000 \u00162\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u00030\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0017J)\u0010\f\u001a\u0015\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u0003\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\tR\u0014\u0010\u0013\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lo00oOo00/o00oOOoO$o00oo0O;", "Lo00oOo00/o00oOOo0;", "Landroidx/activity/result/o0O0o;", "", "Landroid/net/Uri;", "Lo0OOOO0o/o00ooO;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "o00oOooO", "Lo00oOo00/o00oOOo0$o00oOOo0;", "o00oOo0O", "", "resultCode", "intent", "o00oOo0o", "o00oOOo0", "I", "maxItems", "<init>", "(I)V", o0OO000o.o00oOOoO.f12961o00oOo00, "activity_release"}, k = 1, mv = {1, 7, 1})
    @o0OOooO0(19)
    /* loaded from: classes.dex */
    public static class o00oo0O extends o00oOo00.o00oOOo0<androidx.activity.result.o0O0o, List<Uri>> {
        @NotNull

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final o00oOOo0 f6890o00oOOoO = new o00oOOo0(null);

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final int f6891o00oOOo0;

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lo00oOo00/o00oOOoO$o00oo0O$o00oOOo0;", "", "", "o00oOOo0", "()I", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class o00oOOo0 {
            public o00oOOo0() {
            }

            public o00oOOo0(o0O00 o0o00) {
            }

            public final int o00oOOo0() {
                if (!o0O0o.f6894o00oOOo0.o00oOOoO() || Build.VERSION.SDK_INT < 33) {
                    return Integer.MAX_VALUE;
                }
                return o00oOOo0.f6883o00oOOo0.o00oOOo0();
            }
        }

        public o00oo0O() {
            this(0, 1, null);
        }

        public o00oo0O(int i) {
            this.f6891o00oOOo0 = i;
            if (!(i > 1)) {
                throw new IllegalArgumentException("Max items must be higher than 1".toString());
            }
        }

        public /* synthetic */ o00oo0O(int i, int i2, o0O00 o0o00) {
            this((i2 & 1) != 0 ? f6890o00oOOoO.o00oOOo0() : i);
        }

        @Override // o00oOo00.o00oOOo0
        @Nullable
        /* renamed from: o00oOo0O */
        public final o00oOOo0.C0096o00oOOo0<List<Uri>> o00oOOoO(@NotNull Context context, @NotNull androidx.activity.result.o0O0o o0o0o) {
            o0ooO.o00oo0O0(context, "context");
            o0ooO.o00oo0O0(o0o0o, "input");
            return null;
        }

        @Override // o00oOo00.o00oOOo0
        @NotNull
        /* renamed from: o00oOo0o */
        public final List<Uri> o00oOo00(int i, @Nullable Intent intent) {
            List<Uri> o00oOOo02;
            if (!(i == -1)) {
                intent = null;
            }
            return (intent == null || (o00oOOo02 = o00oOoO.f6885o00oOOo0.o00oOOo0(intent)) == null) ? o0OO0oO.o0ooO.INSTANCE : o00oOOo02;
        }

        @Override // o00oOo00.o00oOOo0
        @o0O00O0
        @NotNull
        /* renamed from: o00oOooO */
        public Intent o00oOOo0(@NotNull Context context, @NotNull androidx.activity.result.o0O0o o0o0o) {
            Intent intent;
            o0ooO.o00oo0O0(context, "context");
            o0ooO.o00oo0O0(o0o0o, "input");
            o0O0o.o00oOOo0 o00oooo02 = o0O0o.f6894o00oOOo0;
            if (o00oooo02.o00oOOoO()) {
                intent = new Intent("android.provider.action.PICK_IMAGES");
                intent.setType(o00oooo02.o00oOOo0(o0o0o.f119o00oOOo0));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (!(this.f6891o00oOOo0 <= o00oOOo0.f6883o00oOOo0.o00oOOo0())) {
                        throw new IllegalArgumentException("Max items must be less or equals MediaStore.getPickImagesMaxLimit()".toString());
                    }
                }
                intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", this.f6891o00oOOo0);
            } else {
                intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent.setType(o00oooo02.o00oOOo0(o0o0o.f119o00oOOo0));
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                if (intent.getType() == null) {
                    intent.setType("*/*");
                    intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                }
            }
            return intent;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000f"}, d2 = {"Lo00oOo00/o00oOOoO$o00oo0O0;", "Lo00oOo00/o00oOOo0;", "Ljava/lang/Void;", "Landroid/net/Uri;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "o00oOooO", "", "resultCode", "intent", "o00oOo0O", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class o00oo0O0 extends o00oOo00.o00oOOo0<Void, Uri> {
        @Override // o00oOo00.o00oOOo0
        @Nullable
        /* renamed from: o00oOo0O */
        public Uri o00oOo00(int i, @Nullable Intent intent) {
            if (!(i == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        @Override // o00oOo00.o00oOOo0
        @NotNull
        /* renamed from: o00oOooO */
        public Intent o00oOOo0(@NotNull Context context, @Nullable Void r2) {
            o0ooO.o00oo0O0(context, "context");
            Intent type = new Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/contact");
            o0ooO.o00oo0OO(type, "Intent(Intent.ACTION_PIC…ct.Contacts.CONTENT_TYPE)");
            return type;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0017\u0018\u00002\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u00040\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\n¨\u0006\u0016"}, d2 = {"Lo00oOo00/o00oOOoO$o00oo0OO;", "Lo00oOo00/o00oOOo0;", "", "", "", "Landroid/net/Uri;", "Lo0OOOO0o/o00ooO;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "o00oOooO", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "Lo00oOo00/o00oOOo0$o00oOOo0;", "o00oOo0O", "(Landroid/content/Context;[Ljava/lang/String;)Lo00oOo00/o00oOOo0$o00oOOo0;", "", "resultCode", "intent", "o00oOo0o", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 7, 1})
    @o0OOooO0(19)
    /* loaded from: classes.dex */
    public static class o00oo0OO extends o00oOo00.o00oOOo0<String[], List<Uri>> {
        @Override // o00oOo00.o00oOOo0
        @Nullable
        /* renamed from: o00oOo0O */
        public final o00oOOo0.C0096o00oOOo0<List<Uri>> o00oOOoO(@NotNull Context context, @NotNull String[] strArr) {
            o0ooO.o00oo0O0(context, "context");
            o0ooO.o00oo0O0(strArr, "input");
            return null;
        }

        @Override // o00oOo00.o00oOOo0
        @NotNull
        /* renamed from: o00oOo0o */
        public final List<Uri> o00oOo00(int i, @Nullable Intent intent) {
            List<Uri> o00oOOo02;
            if (!(i == -1)) {
                intent = null;
            }
            return (intent == null || (o00oOOo02 = o00oOoO.f6885o00oOOo0.o00oOOo0(intent)) == null) ? o0OO0oO.o0ooO.INSTANCE : o00oOOo02;
        }

        @Override // o00oOo00.o00oOOo0
        @o0O00O0
        @NotNull
        /* renamed from: o00oOooO */
        public Intent o00oOOo0(@NotNull Context context, @NotNull String[] strArr) {
            o0ooO.o00oo0O0(context, "context");
            o0ooO.o00oo0O0(strArr, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
            o0ooO.o00oo0OO(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000f"}, d2 = {"Lo00oOo00/o00oOOoO$o00ooO;", "Lo00oOo00/o00oOOo0;", "Landroid/content/Intent;", "Landroidx/activity/result/ActivityResult;", "Landroid/content/Context;", "context", "input", "o00oOooO", "", "resultCode", "intent", "o00oOo0O", "<init>", "()V", "o00oOOo0", "activity_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class o00ooO extends o00oOo00.o00oOOo0<Intent, ActivityResult> {
        @NotNull

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final o00oOOo0 f6892o00oOOo0 = new o00oOOo0(null);
        @NotNull

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final String f6893o00oOOoO = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lo00oOo00/o00oOOoO$o00ooO$o00oOOo0;", "", "", "EXTRA_ACTIVITY_OPTIONS_BUNDLE", "Ljava/lang/String;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class o00oOOo0 {
            public o00oOOo0() {
            }

            public o00oOOo0(o0O00 o0o00) {
            }
        }

        @Override // o00oOo00.o00oOOo0
        public ActivityResult o00oOo00(int i, Intent intent) {
            return new ActivityResult(i, intent);
        }

        @NotNull
        public ActivityResult o00oOo0O(int i, @Nullable Intent intent) {
            return new ActivityResult(i, intent);
        }

        @Override // o00oOo00.o00oOOo0
        @NotNull
        /* renamed from: o00oOooO */
        public Intent o00oOOo0(@NotNull Context context, @NotNull Intent intent) {
            o0ooO.o00oo0O0(context, "context");
            o0ooO.o00oo0O0(intent, "input");
            return intent;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J!\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ \u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0012"}, d2 = {"Lo00oOo00/o00oOOoO$o00ooO0;", "Lo00oOo00/o00oOOo0;", "", "", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "o00oOooO", "", "resultCode", "intent", "o00oOo0o", "(ILandroid/content/Intent;)Ljava/lang/Boolean;", "Lo00oOo00/o00oOOo0$o00oOOo0;", "o00oOo0O", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class o00ooO0 extends o00oOo00.o00oOOo0<String, Boolean> {
        @Override // o00oOo00.o00oOOo0
        @Nullable
        /* renamed from: o00oOo0O */
        public o00oOOo0.C0096o00oOOo0<Boolean> o00oOOoO(@NotNull Context context, @NotNull String str) {
            o0ooO.o00oo0O0(context, "context");
            o0ooO.o00oo0O0(str, "input");
            if (o00ooo0.o0.checkSelfPermission(context, str) == 0) {
                return new o00oOOo0.C0096o00oOOo0<>(Boolean.TRUE);
            }
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0023, code lost:
            if (r5 == true) goto L16;
         */
        @Override // o00oOo00.o00oOOo0
        @org.jetbrains.annotations.NotNull
        /* renamed from: o00oOo0o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Boolean o00oOo00(int r5, @org.jetbrains.annotations.Nullable android.content.Intent r6) {
            /*
                r4 = this;
                if (r6 == 0) goto L2c
                r0 = -1
                if (r5 == r0) goto L6
                goto L2c
            L6:
                java.lang.String r5 = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"
                int[] r5 = r6.getIntArrayExtra(r5)
                r6 = 1
                r0 = 0
                if (r5 == 0) goto L26
                int r1 = r5.length
                r2 = r0
            L12:
                if (r2 >= r1) goto L22
                r3 = r5[r2]
                if (r3 != 0) goto L1a
                r3 = r6
                goto L1b
            L1a:
                r3 = r0
            L1b:
                if (r3 == 0) goto L1f
                r5 = r6
                goto L23
            L1f:
                int r2 = r2 + 1
                goto L12
            L22:
                r5 = r0
            L23:
                if (r5 != r6) goto L26
                goto L27
            L26:
                r6 = r0
            L27:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
                return r5
            L2c:
                java.lang.Boolean r5 = java.lang.Boolean.FALSE
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o00oOo00.o00oOOoO.o00ooO0.o00oOo00(int, android.content.Intent):java.lang.Boolean");
        }

        @Override // o00oOo00.o00oOOo0
        @NotNull
        /* renamed from: o00oOooO */
        public Intent o00oOOo0(@NotNull Context context, @NotNull String str) {
            o0ooO.o00oo0O0(context, "context");
            o0ooO.o00oo0O0(str, "input");
            return o00oo.f6886o00oOOo0.o00oOOo0(new String[]{str});
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0017\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0017J \u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0007¨\u0006\u0011"}, d2 = {"Lo00oOo00/o00oOOoO$o0O000;", "Lo00oOo00/o00oOOo0;", "Landroid/net/Uri;", "Landroid/graphics/Bitmap;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "o00oOooO", "Lo00oOo00/o00oOOo0$o00oOOo0;", "o00oOo0O", "", "resultCode", "intent", "o00oOo0o", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 7, 1})
    @o0OO0o.o0O0o(message = "The thumbnail bitmap is rarely returned and is not a good signal to determine\n      whether the video was actually successfully captured. Use {@link CaptureVideo} instead.")
    /* loaded from: classes.dex */
    public static class o0O000 extends o00oOo00.o00oOOo0<Uri, Bitmap> {
        @Override // o00oOo00.o00oOOo0
        @Nullable
        /* renamed from: o00oOo0O */
        public final o00oOOo0.C0096o00oOOo0<Bitmap> o00oOOoO(@NotNull Context context, @NotNull Uri uri) {
            o0ooO.o00oo0O0(context, "context");
            o0ooO.o00oo0O0(uri, "input");
            return null;
        }

        @Override // o00oOo00.o00oOOo0
        @Nullable
        /* renamed from: o00oOo0o */
        public final Bitmap o00oOo00(int i, @Nullable Intent intent) {
            if (!(i == -1)) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }

        @Override // o00oOo00.o00oOOo0
        @o0O00O0
        @NotNull
        /* renamed from: o00oOooO */
        public Intent o00oOOo0(@NotNull Context context, @NotNull Uri uri) {
            o0ooO.o00oo0O0(context, "context");
            o0ooO.o00oo0O0(uri, "input");
            Intent putExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", uri);
            o0ooO.o00oo0OO(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return putExtra;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0017J\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lo00oOo00/o00oOOoO$o0O00000;", "Lo00oOo00/o00oOOo0;", "Landroid/net/Uri;", "", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "o00oOooO", "Lo00oOo00/o00oOOo0$o00oOOo0;", "o00oOo0O", "", "resultCode", "intent", "o00oOo0o", "(ILandroid/content/Intent;)Ljava/lang/Boolean;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static class o0O00000 extends o00oOo00.o00oOOo0<Uri, Boolean> {
        @Override // o00oOo00.o00oOOo0
        @Nullable
        /* renamed from: o00oOo0O */
        public final o00oOOo0.C0096o00oOOo0<Boolean> o00oOOoO(@NotNull Context context, @NotNull Uri uri) {
            o0ooO.o00oo0O0(context, "context");
            o0ooO.o00oo0O0(uri, "input");
            return null;
        }

        @Override // o00oOo00.o00oOOo0
        @NotNull
        /* renamed from: o00oOo0o */
        public final Boolean o00oOo00(int i, @Nullable Intent intent) {
            return Boolean.valueOf(i == -1);
        }

        @Override // o00oOo00.o00oOOo0
        @o0O00O0
        @NotNull
        /* renamed from: o00oOooO */
        public Intent o00oOOo0(@NotNull Context context, @NotNull Uri uri) {
            o0ooO.o00oo0O0(context, "context");
            o0ooO.o00oo0O0(uri, "input");
            Intent putExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uri);
            o0ooO.o00oo0OO(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return putExtra;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0017J\"\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0007¨\u0006\u0011"}, d2 = {"Lo00oOo00/o00oOOoO$o0O0000O;", "Lo00oOo00/o00oOOo0;", "Ljava/lang/Void;", "Landroid/graphics/Bitmap;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "o00oOooO", "Lo00oOo00/o00oOOo0$o00oOOo0;", "o00oOo0O", "", "resultCode", "intent", "o00oOo0o", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static class o0O0000O extends o00oOo00.o00oOOo0<Void, Bitmap> {
        @Override // o00oOo00.o00oOOo0
        @Nullable
        /* renamed from: o00oOo0O */
        public final o00oOOo0.C0096o00oOOo0<Bitmap> o00oOOoO(@NotNull Context context, @Nullable Void r2) {
            o0ooO.o00oo0O0(context, "context");
            return null;
        }

        @Override // o00oOo00.o00oOOo0
        @Nullable
        /* renamed from: o00oOo0o */
        public final Bitmap o00oOo00(int i, @Nullable Intent intent) {
            if (!(i == -1)) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }

        @Override // o00oOo00.o00oOOo0
        @o0O00O0
        @NotNull
        /* renamed from: o00oOooO */
        public Intent o00oOOo0(@NotNull Context context, @Nullable Void r2) {
            o0ooO.o00oo0O0(context, "context");
            return new Intent("android.media.action.IMAGE_CAPTURE");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0016\u0018\u0000 \u00112\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0006\u0011\u0012\u0013\n\u0014\u0015B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0017J \u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0007¨\u0006\u0016"}, d2 = {"Lo00oOo00/o00oOOoO$o0O0o;", "Lo00oOo00/o00oOOo0;", "Landroidx/activity/result/o0O0o;", "Landroid/net/Uri;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "o00oOooO", "Lo00oOo00/o00oOOo0$o00oOOo0;", "o00oOo0O", "", "resultCode", "intent", "o00oOoO0", "<init>", "()V", "o00oOOo0", o0OO000o.o00oOOoO.f12961o00oOo00, "o00oOo00", "o00oOoO", "o00oo00O", "activity_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static class o0O0o extends o00oOo00.o00oOOo0<androidx.activity.result.o0O0o, Uri> {
        @NotNull

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final o00oOOo0 f6894o00oOOo0 = new o00oOOo0(null);

        @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lo00oOo00/o00oOOoO$o0O0o$o00oOOo0;", "", "", o0OO000o.o00oOOoO.f12961o00oOo00, "Lo00oOo00/o00oOOoO$o0O0o$o00oo00O;", "input", "", "o00oOOo0", "(Lo00oOo00/o00oOOoO$o0O0o$o00oo00O;)Ljava/lang/String;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class o00oOOo0 {
            public o00oOOo0() {
            }

            public o00oOOo0(o0O00 o0o00) {
            }

            @Nullable
            public final String o00oOOo0(@NotNull o00oo00O o00oo00o) {
                o0ooO.o00oo0O0(o00oo00o, "input");
                if (o00oo00o instanceof o00oOo00) {
                    return "image/*";
                }
                if (o00oo00o instanceof o00oOoO) {
                    return "video/*";
                }
                if (o00oo00o instanceof o00oOo0O) {
                    return ((o00oOo0O) o00oo00o).f6897o00oOOo0;
                }
                if (o00oo00o instanceof C0098o00oOOoO) {
                    return null;
                }
                throw new o0OO0o.o0O0O0Oo();
            }

            @o0OOOO0o.o00ooO0
            @SuppressLint({"ClassVerificationFailure", "NewApi"})
            public final boolean o00oOOoO() {
                int i = Build.VERSION.SDK_INT;
                return i >= 33 || (i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo00oOo00/o00oOOoO$o0O0o$o00oOOoO;", "Lo00oOo00/o00oOOoO$o0O0o$o00oo00O;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: o00oOo00.o00oOOoO$o0O0o$o00oOOoO  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0098o00oOOoO implements o00oo00O {
            @NotNull

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public static final C0098o00oOOoO f6895o00oOOo0 = new C0098o00oOOoO();
        }

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo00oOo00/o00oOOoO$o0O0o$o00oOo00;", "Lo00oOo00/o00oOOoO$o0O0o$o00oo00O;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class o00oOo00 implements o00oo00O {
            @NotNull

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public static final o00oOo00 f6896o00oOOo0 = new o00oOo00();
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lo00oOo00/o00oOOoO$o0O0o$o00oOo0O;", "Lo00oOo00/o00oOOoO$o0O0o$o00oo00O;", "", "o00oOOo0", "Ljava/lang/String;", "()Ljava/lang/String;", "mimeType", "<init>", "(Ljava/lang/String;)V", "activity_release"}, k = 1, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class o00oOo0O implements o00oo00O {
            @NotNull

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public final String f6897o00oOOo0;

            public o00oOo0O(@NotNull String str) {
                o0ooO.o00oo0O0(str, "mimeType");
                this.f6897o00oOOo0 = str;
            }

            @NotNull
            public final String o00oOOo0() {
                return this.f6897o00oOOo0;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo00oOo00/o00oOOoO$o0O0o$o00oOoO;", "Lo00oOo00/o00oOOoO$o0O0o$o00oo00O;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class o00oOoO implements o00oo00O {
            @NotNull

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public static final o00oOoO f6898o00oOOo0 = new o00oOoO();
        }

        @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lo00oOo00/o00oOOoO$o0O0o$o00oo00O;", "", "Lo00oOo00/o00oOOoO$o0O0o$o00oOOoO;", "Lo00oOo00/o00oOOoO$o0O0o$o00oOo00;", "Lo00oOo00/o00oOOoO$o0O0o$o00oOo0O;", "Lo00oOo00/o00oOOoO$o0O0o$o00oOoO;", "activity_release"}, k = 1, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public interface o00oo00O {
        }

        @o0OOOO0o.o00ooO0
        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        public static final boolean o00oOo0o() {
            return f6894o00oOOo0.o00oOOoO();
        }

        @Override // o00oOo00.o00oOOo0
        @Nullable
        /* renamed from: o00oOo0O */
        public final o00oOOo0.C0096o00oOOo0<Uri> o00oOOoO(@NotNull Context context, @NotNull androidx.activity.result.o0O0o o0o0o) {
            o0ooO.o00oo0O0(context, "context");
            o0ooO.o00oo0O0(o0o0o, "input");
            return null;
        }

        @Override // o00oOo00.o00oOOo0
        @Nullable
        /* renamed from: o00oOoO0 */
        public final Uri o00oOo00(int i, @Nullable Intent intent) {
            if (!(i == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        @Override // o00oOo00.o00oOOo0
        @o0O00O0
        @NotNull
        /* renamed from: o00oOooO */
        public Intent o00oOOo0(@NotNull Context context, @NotNull androidx.activity.result.o0O0o o0o0o) {
            o0ooO.o00oo0O0(context, "context");
            o0ooO.o00oo0O0(o0o0o, "input");
            o00oOOo0 o00oooo02 = f6894o00oOOo0;
            if (o00oooo02.o00oOOoO()) {
                Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                intent.setType(o00oooo02.o00oOOo0(o0o0o.f119o00oOOo0));
                return intent;
            }
            Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent2.setType(o00oooo02.o00oOOo0(o0o0o.f119o00oOOo0));
            if (intent2.getType() == null) {
                intent2.setType("*/*");
                intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                return intent2;
            }
            return intent2;
        }
    }
}
