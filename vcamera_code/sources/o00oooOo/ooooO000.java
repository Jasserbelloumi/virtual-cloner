package o00oooOo;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import o00oOooO.o0OOooO0;
import o0OO0o.oO0Ooooo;
import o0OOOO.o0O0000O;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aU\u0010\f\u001a\u00020\u000b*\u00020\u00002C\b\u0004\u0010\n\u001a=\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\u0002\b\tH\u0087\bø\u0001\u0000\u001aU\u0010\u000e\u001a\u00020\r*\u00020\u00002C\b\u0004\u0010\n\u001a=\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\u0002\b\tH\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"Landroid/graphics/ImageDecoder$Source;", "Lkotlin/Function3;", "Landroid/graphics/ImageDecoder;", "Landroid/graphics/ImageDecoder$ImageInfo;", "Lo0OO0o/o0O0o00O;", "name", "info", FirebaseAnalytics.Param.SOURCE, "Lo0OO0o/oO0Ooooo;", "Lo0OO0o/o0O000Oo;", "action", "Landroid/graphics/Bitmap;", "o00oOOo0", "Landroid/graphics/drawable/Drawable;", o0OO000o.o00oOOoO.f12961o00oOo00, "core-ktx_release"}, k = 2, mv = {1, 7, 1})
@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class ooooO000 {

    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroid/graphics/ImageDecoder;", "decoder", "Landroid/graphics/ImageDecoder$ImageInfo;", "info", "Landroid/graphics/ImageDecoder$Source;", FirebaseAnalytics.Param.SOURCE, "Lo0OO0o/oO0Ooooo;", "onHeaderDecoded", "(Landroid/graphics/ImageDecoder;Landroid/graphics/ImageDecoder$ImageInfo;Landroid/graphics/ImageDecoder$Source;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 implements ImageDecoder.OnHeaderDecodedListener {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ o0O0000O<ImageDecoder, ImageDecoder.ImageInfo, ImageDecoder.Source, oO0Ooooo> f9876o00oOOo0;

        /* JADX WARN: Multi-variable type inference failed */
        public o00oOOo0(o0O0000O<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, oO0Ooooo> o0o0000o) {
            this.f9876o00oOOo0 = o0o0000o;
        }

        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
        public final void onHeaderDecoded(@NotNull ImageDecoder imageDecoder, @NotNull ImageDecoder.ImageInfo imageInfo, @NotNull ImageDecoder.Source source) {
            o0ooO.o00oo0O0(imageDecoder, "decoder");
            o0ooO.o00oo0O0(imageInfo, "info");
            o0ooO.o00oo0O0(source, FirebaseAnalytics.Param.SOURCE);
            this.f9876o00oOOo0.invoke(imageDecoder, imageInfo, source);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroid/graphics/ImageDecoder;", "decoder", "Landroid/graphics/ImageDecoder$ImageInfo;", "info", "Landroid/graphics/ImageDecoder$Source;", FirebaseAnalytics.Param.SOURCE, "Lo0OO0o/oO0Ooooo;", "onHeaderDecoded", "(Landroid/graphics/ImageDecoder;Landroid/graphics/ImageDecoder$ImageInfo;Landroid/graphics/ImageDecoder$Source;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class o00oOOoO implements ImageDecoder.OnHeaderDecodedListener {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ o0O0000O<ImageDecoder, ImageDecoder.ImageInfo, ImageDecoder.Source, oO0Ooooo> f9877o00oOOo0;

        /* JADX WARN: Multi-variable type inference failed */
        public o00oOOoO(o0O0000O<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, oO0Ooooo> o0o0000o) {
            this.f9877o00oOOo0 = o0o0000o;
        }

        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
        public final void onHeaderDecoded(@NotNull ImageDecoder imageDecoder, @NotNull ImageDecoder.ImageInfo imageInfo, @NotNull ImageDecoder.Source source) {
            o0ooO.o00oo0O0(imageDecoder, "decoder");
            o0ooO.o00oo0O0(imageInfo, "info");
            o0ooO.o00oo0O0(source, FirebaseAnalytics.Param.SOURCE);
            this.f9877o00oOOo0.invoke(imageDecoder, imageInfo, source);
        }
    }

    @o0OOooO0(28)
    @NotNull
    public static final Bitmap o00oOOo0(@NotNull ImageDecoder.Source source, @NotNull o0O0000O<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, oO0Ooooo> o0o0000o) {
        o0ooO.o00oo0O0(source, "<this>");
        o0ooO.o00oo0O0(o0o0000o, "action");
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, new o00oOOo0(o0o0000o));
        o0ooO.o00oo0OO(decodeBitmap, "crossinline action: Imag…ction(info, source)\n    }");
        return decodeBitmap;
    }

    @o0OOooO0(28)
    @NotNull
    public static final Drawable o00oOOoO(@NotNull ImageDecoder.Source source, @NotNull o0O0000O<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, oO0Ooooo> o0o0000o) {
        o0ooO.o00oo0O0(source, "<this>");
        o0ooO.o00oo0O0(o0o0000o, "action");
        Drawable decodeDrawable = ImageDecoder.decodeDrawable(source, new o00oOOoO(o0o0000o));
        o0ooO.o00oo0OO(decodeDrawable, "crossinline action: Imag…ction(info, source)\n    }");
        return decodeDrawable;
    }
}
