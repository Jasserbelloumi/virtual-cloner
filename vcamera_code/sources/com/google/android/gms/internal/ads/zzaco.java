package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.io.StringReader;
import o00oOooO.o0OO00OO;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
/* loaded from: classes2.dex */
final class zzaco {
    private static final String[] zza = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] zzb = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] zzc = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    @o0OO00OO
    public static zzack zza(String str) throws IOException {
        long j;
        String str2;
        String str3;
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(new StringReader(str));
            newPullParser.next();
            if (zzex.zzc(newPullParser, "x:xmpmeta")) {
                zzfqk zzo = zzfqk.zzo();
                long j2 = -9223372036854775807L;
                do {
                    newPullParser.next();
                    if (zzex.zzc(newPullParser, "rdf:Description")) {
                        String[] strArr = zza;
                        int i = 0;
                        for (int i2 = 0; i2 < 4; i2++) {
                            String zza2 = zzex.zza(newPullParser, strArr[i2]);
                            if (zza2 != null) {
                                if (Integer.parseInt(zza2) != 1) {
                                    return null;
                                } else {
                                    String[] strArr2 = zzb;
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 >= 4) {
                                            break;
                                        }
                                        String zza3 = zzex.zza(newPullParser, strArr2[i3]);
                                        if (zza3 != null) {
                                            j = Long.parseLong(zza3);
                                            if (j == -1) {
                                            }
                                        } else {
                                            i3++;
                                        }
                                    }
                                    j = -9223372036854775807L;
                                    String[] strArr3 = zzc;
                                    while (true) {
                                        if (i >= 2) {
                                            zzo = zzfqk.zzo();
                                            break;
                                        }
                                        String zza4 = zzex.zza(newPullParser, strArr3[i]);
                                        if (zza4 != null) {
                                            zzo = zzfqk.zzq(new zzacj(MimeTypes.IMAGE_JPEG, "Primary", 0L, 0L), new zzacj(MimeTypes.VIDEO_MP4, "MotionPhoto", Long.parseLong(zza4), 0L));
                                            break;
                                        }
                                        i++;
                                    }
                                    j2 = j;
                                }
                            }
                        }
                        return null;
                    }
                    if (zzex.zzc(newPullParser, "Container:Directory")) {
                        str2 = "Container";
                        str3 = "Item";
                    } else if (zzex.zzc(newPullParser, "GContainer:Directory")) {
                        str2 = "GContainer";
                        str3 = "GContainerItem";
                    }
                    zzo = zzb(newPullParser, str2, str3);
                } while (!zzex.zzb(newPullParser, "x:xmpmeta"));
                if (zzo.isEmpty()) {
                    return null;
                }
                return new zzack(j2, zzo);
            }
            throw zzbu.zza("Couldn't find xmp metadata", null);
        } catch (zzbu | NumberFormatException | XmlPullParserException unused) {
            zzee.zze("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static zzfqk zzb(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        zzfqh zzi = zzfqk.zzi();
        do {
            String concat = str.concat(":Item");
            xmlPullParser.next();
            if (zzex.zzc(xmlPullParser, concat)) {
                String concat2 = str2.concat(":Mime");
                String concat3 = str2.concat(":Semantic");
                String concat4 = str2.concat(":Length");
                String concat5 = str2.concat(":Padding");
                String zza2 = zzex.zza(xmlPullParser, concat2);
                String zza3 = zzex.zza(xmlPullParser, concat3);
                String zza4 = zzex.zza(xmlPullParser, concat4);
                String zza5 = zzex.zza(xmlPullParser, concat5);
                if (zza2 == null || zza3 == null) {
                    return zzfqk.zzo();
                }
                zzi.zzf(new zzacj(zza2, zza3, zza4 != null ? Long.parseLong(zza4) : 0L, zza5 != null ? Long.parseLong(zza5) : 0L));
            }
        } while (!zzex.zzb(xmlPullParser, str.concat(":Directory")));
        return zzi.zzi();
    }
}
