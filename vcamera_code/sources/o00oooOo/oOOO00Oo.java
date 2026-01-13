package o00oooOo;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.Typeface$CustomFallbackBuilder;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o00ooo0o.o0O0O0o0;
import o0O000O.o00oo0OO;
import org.videolan.libvlc.media.MediaPlayer;
@o0OOooO0(29)
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class oOOO00Oo extends oOOO00o0 {
    public static int o00oo0O0(@oo0oO0 FontStyle fontStyle, @oo0oO0 FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // o00oooOo.oOOO00o0
    @o0OO00OO
    public Typeface o00oOOoO(Context context, o0O0O0o0.o00oOo0O o00ooo0o2, Resources resources, int i) {
        o0O0O0o0.o00oOoO[] o00ooooArr;
        try {
            FontFamily.Builder builder = null;
            for (o0O0O0o0.o00oOoO o00oooo2 : o00ooo0o2.f9730o00oOOo0) {
                try {
                    Font build = new Font.Builder(resources, o00oooo2.f9735o00oOo0o).setWeight(o00oooo2.f9732o00oOOoO).setSlant(o00oooo2.f9733o00oOo00 ? 1 : 0).setTtcIndex(o00oooo2.f9734o00oOo0O).setFontVariationSettings(o00oooo2.f9736o00oOooO).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface$CustomFallbackBuilder(build2).setStyle(o00oo0OO(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // o00oooOo.oOOO00o0
    public Typeface o00oOo0O(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // o00oooOo.oOOO00o0
    @o0OO00OO
    public Typeface o00oOo0o(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface$CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // o00oooOo.oOOO00o0
    @oo0oO0
    public Typeface o00oOoO0(@oo0oO0 Context context, @oo0oO0 Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }

    @Override // o00oooOo.oOOO00o0
    @o0OO00OO
    public Typeface o00oOooO(Context context, @o0OO00OO CancellationSignal cancellationSignal, @oo0oO0 o00oo0OO.o00oOo00[] o00ooo00Arr, int i) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (o00oo0OO.o00oOo00 o00ooo002 : o00ooo00Arr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(o00ooo002.o00oOooO(), "r", cancellationSignal);
                } catch (IOException unused) {
                }
                if (openFileDescriptor != null) {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(o00ooo002.o00oOo0O()).setSlant(o00ooo002.o00oOo0o() ? 1 : 0).setTtcIndex(o00ooo002.o00oOo00()).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                        break;
                    }
                } else if (openFileDescriptor == null) {
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface$CustomFallbackBuilder(build2).setStyle(o00oo0OO(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // o00oooOo.oOOO00o0
    public o00oo0OO.o00oOo00 o00oOooo(o00oo0OO.o00oOo00[] o00ooo00Arr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    public final Font o00oo0OO(@oo0oO0 FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? MediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int o00oo0O02 = o00oo0O0(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int o00oo0O03 = o00oo0O0(fontStyle, font2.getStyle());
            if (o00oo0O03 < o00oo0O02) {
                font = font2;
                o00oo0O02 = o00oo0O03;
            }
        }
        return font;
    }
}
