package o00oooOo;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.ColorSpace;
import com.google.android.exoplayer2.text.CueDecoder;
import kotlin.Metadata;
import o00oOooO.o0O00O;
import o00oOooO.o0OOooO0;
import o00ooO00.o00oo0;
import o0OO000o.o00oOOoO;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\b\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087\n\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0087\n\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0087\n\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0087\n\u001a\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\u0002\u001a\r\u0010\t\u001a\u00020\b*\u00020\bH\u0086\n\u001a\r\u0010\n\u001a\u00020\b*\u00020\bH\u0086\n\u001a\r\u0010\u000b\u001a\u00020\b*\u00020\bH\u0086\n\u001a\r\u0010\f\u001a\u00020\b*\u00020\bH\u0086\n\u001a\r\u0010\r\u001a\u00020\u0000*\u00020\bH\u0087\b\u001a\r\u0010\u000f\u001a\u00020\u000e*\u00020\bH\u0087\b\u001a\r\u0010\u0010\u001a\u00020\u0001*\u00020\u000eH\u0087\n\u001a\r\u0010\u0011\u001a\u00020\u0001*\u00020\u000eH\u0087\n\u001a\r\u0010\u0012\u001a\u00020\u0001*\u00020\u000eH\u0087\n\u001a\r\u0010\u0013\u001a\u00020\u0001*\u00020\u000eH\u0087\n\u001a\r\u0010\u0014\u001a\u00020\u0000*\u00020\u000eH\u0087\b\u001a\r\u0010\u0015\u001a\u00020\b*\u00020\u000eH\u0087\b\u001a\u0015\u0010\u0018\u001a\u00020\u000e*\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0087\f\u001a\u0015\u0010\u001a\u001a\u00020\u000e*\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0019H\u0087\f\u001a\u0015\u0010\u001b\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0087\f\u001a\u0015\u0010\u001c\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0019H\u0087\f\u001a\u0015\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0087\f\u001a\u0015\u0010\u001e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0019H\u0087\f\u001a\r\u0010 \u001a\u00020\b*\u00020\u001fH\u0087\b\"\u0016\u0010#\u001a\u00020\b*\u00020\b8Æ\u0002¢\u0006\u0006\u001a\u0004\b!\u0010\"\"\u0016\u0010%\u001a\u00020\b*\u00020\b8Æ\u0002¢\u0006\u0006\u001a\u0004\b$\u0010\"\"\u0016\u0010'\u001a\u00020\b*\u00020\b8Æ\u0002¢\u0006\u0006\u001a\u0004\b&\u0010\"\"\u0016\u0010)\u001a\u00020\b*\u00020\b8Æ\u0002¢\u0006\u0006\u001a\u0004\b(\u0010\"\"\u0016\u0010,\u001a\u00020\u0001*\u00020\b8Ç\u0002¢\u0006\u0006\u001a\u0004\b*\u0010+\"\u0016\u0010#\u001a\u00020\u0001*\u00020\u000e8Ç\u0002¢\u0006\u0006\u001a\u0004\b-\u0010.\"\u0016\u0010%\u001a\u00020\u0001*\u00020\u000e8Ç\u0002¢\u0006\u0006\u001a\u0004\b/\u0010.\"\u0016\u0010'\u001a\u00020\u0001*\u00020\u000e8Ç\u0002¢\u0006\u0006\u001a\u0004\b0\u0010.\"\u0016\u0010)\u001a\u00020\u0001*\u00020\u000e8Ç\u0002¢\u0006\u0006\u001a\u0004\b1\u0010.\"\u0016\u0010,\u001a\u00020\u0001*\u00020\u000e8Ç\u0002¢\u0006\u0006\u001a\u0004\b2\u0010.\"\u0016\u00106\u001a\u000203*\u00020\u000e8Ç\u0002¢\u0006\u0006\u001a\u0004\b4\u00105\"\u0016\u00108\u001a\u000203*\u00020\u000e8Ç\u0002¢\u0006\u0006\u001a\u0004\b7\u00105\"\u0016\u0010\u0017\u001a\u00020\u0019*\u00020\u000e8Ç\u0002¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006;"}, d2 = {"Landroid/graphics/Color;", "", o00oOOoO.f12961o00oOo00, "o00oOo0O", "o00oOoO", "o00oOoo0", CueDecoder.BUNDLED_CUES, "o00ooOo0", "", "o00oOo00", "o00oOo0o", "o00oOoOO", "o00oOooo", "o00ooOo", "", "o00ooo0", "o00oOOo0", "o00oOooO", "o00oOoO0", "o00oOoOo", "o00ooOoO", "o00ooOoo", "Landroid/graphics/ColorSpace$Named;", "colorSpace", "o00oo00O", "Landroid/graphics/ColorSpace;", "o00oo0", "o00oo0OO", "o00oo0O0", "o00oo0O", "o00oo0Oo", "", "o00ooo00", "o00oo0o", "(I)I", o00oo0.f8113o00oOoO0, "o00ooOO0", "red", "o00ooO0", "green", "o0O0o", "blue", "o00ooO0O", "(I)F", "luminance", "o00oo0o0", "(J)F", "o00ooO", "o00ooO00", "o00oo0oO", "o00ooO0o", "", "o00ooOO", "(J)Z", "isSrgb", "o00ooOOo", "isWideGamut", "o00oo", "(J)Landroid/graphics/ColorSpace;", "core-ktx_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class oOO00O0 {
    @o0OOooO0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float o00oOOo0(long j) {
        return Color.red(j);
    }

    @o0OOooO0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float o00oOOoO(@NotNull Color color) {
        o0ooO.o00oo0O0(color, "<this>");
        return color.getComponent(0);
    }

    public static final int o00oOo00(@o0O00O int i) {
        return (i >> 24) & 255;
    }

    @o0OOooO0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float o00oOo0O(@NotNull Color color) {
        o0ooO.o00oo0O0(color, "<this>");
        return color.getComponent(1);
    }

    public static final int o00oOo0o(@o0O00O int i) {
        return (i >> 16) & 255;
    }

    @o0OOooO0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float o00oOoO(@NotNull Color color) {
        o0ooO.o00oo0O0(color, "<this>");
        return color.getComponent(2);
    }

    @o0OOooO0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float o00oOoO0(long j) {
        return Color.blue(j);
    }

    public static final int o00oOoOO(@o0O00O int i) {
        return (i >> 8) & 255;
    }

    @o0OOooO0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float o00oOoOo(long j) {
        return Color.alpha(j);
    }

    @o0OOooO0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float o00oOoo0(@NotNull Color color) {
        o0ooO.o00oo0O0(color, "<this>");
        return color.getComponent(3);
    }

    @o0OOooO0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float o00oOooO(long j) {
        return Color.green(j);
    }

    public static final int o00oOooo(@o0O00O int i) {
        return i & 255;
    }

    @o0OOooO0(26)
    @SuppressLint({"ClassVerificationFailure"})
    @NotNull
    public static final ColorSpace o00oo(long j) {
        ColorSpace colorSpace = Color.colorSpace(j);
        o0ooO.o00oo0OO(colorSpace, "colorSpace(this)");
        return colorSpace;
    }

    @o0OOooO0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long o00oo0(@o0O00O int i, @NotNull ColorSpace colorSpace) {
        o0ooO.o00oo0O0(colorSpace, "colorSpace");
        return Color.convert(i, colorSpace);
    }

    @o0OOooO0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long o00oo00O(@o0O00O int i, @NotNull ColorSpace.Named named) {
        o0ooO.o00oo0O0(named, "colorSpace");
        return Color.convert(i, ColorSpace.get(named));
    }

    @o0OOooO0(26)
    @SuppressLint({"ClassVerificationFailure"})
    @NotNull
    public static final Color o00oo0O(@NotNull Color color, @NotNull ColorSpace.Named named) {
        o0ooO.o00oo0O0(color, "<this>");
        o0ooO.o00oo0O0(named, "colorSpace");
        Color convert = color.convert(ColorSpace.get(named));
        o0ooO.o00oo0OO(convert, "convert(ColorSpace.get(colorSpace))");
        return convert;
    }

    @o0OOooO0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long o00oo0O0(long j, @NotNull ColorSpace colorSpace) {
        o0ooO.o00oo0O0(colorSpace, "colorSpace");
        return Color.convert(j, colorSpace);
    }

    @o0OOooO0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long o00oo0OO(long j, @NotNull ColorSpace.Named named) {
        o0ooO.o00oo0O0(named, "colorSpace");
        return Color.convert(j, ColorSpace.get(named));
    }

    @o0OOooO0(26)
    @SuppressLint({"ClassVerificationFailure"})
    @NotNull
    public static final Color o00oo0Oo(@NotNull Color color, @NotNull ColorSpace colorSpace) {
        o0ooO.o00oo0O0(color, "<this>");
        o0ooO.o00oo0O0(colorSpace, "colorSpace");
        Color convert = color.convert(colorSpace);
        o0ooO.o00oo0OO(convert, "convert(colorSpace)");
        return convert;
    }

    public static final int o00oo0o(@o0O00O int i) {
        return (i >> 24) & 255;
    }

    @o0OOooO0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float o00oo0o0(long j) {
        return Color.alpha(j);
    }

    @o0OOooO0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float o00oo0oO(long j) {
        return Color.blue(j);
    }

    @o0OOooO0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float o00ooO(long j) {
        return Color.red(j);
    }

    public static final int o00ooO0(@o0O00O int i) {
        return (i >> 8) & 255;
    }

    @o0OOooO0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float o00ooO00(long j) {
        return Color.green(j);
    }

    @o0OOooO0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float o00ooO0O(@o0O00O int i) {
        return Color.luminance(i);
    }

    @o0OOooO0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float o00ooO0o(long j) {
        return Color.luminance(j);
    }

    @o0OOooO0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean o00ooOO(long j) {
        return Color.isSrgb(j);
    }

    public static final int o00ooOO0(@o0O00O int i) {
        return (i >> 16) & 255;
    }

    @o0OOooO0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean o00ooOOo(long j) {
        return Color.isWideGamut(j);
    }

    @o0OOooO0(26)
    @SuppressLint({"ClassVerificationFailure"})
    @NotNull
    public static final Color o00ooOo(@o0O00O int i) {
        Color valueOf = Color.valueOf(i);
        o0ooO.o00oo0OO(valueOf, "valueOf(this)");
        return valueOf;
    }

    @o0OOooO0(26)
    @SuppressLint({"ClassVerificationFailure"})
    @NotNull
    public static final Color o00ooOo0(@NotNull Color color, @NotNull Color color2) {
        o0ooO.o00oo0O0(color, "<this>");
        o0ooO.o00oo0O0(color2, CueDecoder.BUNDLED_CUES);
        Color o00oo0oO2 = oOO00OO.o00oo0oO(color2, color);
        o0ooO.o00oo0OO(o00oo0oO2, "compositeColors(c, this)");
        return o00oo0oO2;
    }

    @o0OOooO0(26)
    @SuppressLint({"ClassVerificationFailure"})
    @NotNull
    public static final Color o00ooOoO(long j) {
        Color valueOf = Color.valueOf(j);
        o0ooO.o00oo0OO(valueOf, "valueOf(this)");
        return valueOf;
    }

    @o0O00O
    @o0OOooO0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final int o00ooOoo(long j) {
        return Color.toArgb(j);
    }

    @o0OOooO0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long o00ooo0(@o0O00O int i) {
        return Color.pack(i);
    }

    @o0O00O
    public static final int o00ooo00(@NotNull String str) {
        o0ooO.o00oo0O0(str, "<this>");
        return Color.parseColor(str);
    }

    public static final int o0O0o(@o0O00O int i) {
        return i & 255;
    }
}
