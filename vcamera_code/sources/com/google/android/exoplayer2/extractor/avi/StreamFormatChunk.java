package com.google.android.exoplayer2.extractor.avi;

import android.support.v4.media.o00oOo0O;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.o00oOOo0;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import o00oOooO.o0OO00OO;
/* loaded from: classes.dex */
final class StreamFormatChunk implements AviChunk {
    private static final String TAG = "StreamFormatChunk";
    public final Format format;

    public StreamFormatChunk(Format format) {
        this.format = format;
    }

    @o0OO00OO
    private static String getMimeTypeFromCompression(int i) {
        switch (i) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return MimeTypes.VIDEO_MP4V;
            case 826496577:
            case 828601953:
            case 875967048:
                return MimeTypes.VIDEO_H264;
            case 842289229:
                return MimeTypes.VIDEO_MP42;
            case 859066445:
                return MimeTypes.VIDEO_MP43;
            case 1196444237:
            case 1735420525:
                return MimeTypes.VIDEO_MJPEG;
            default:
                return null;
        }
    }

    @o0OO00OO
    private static String getMimeTypeFromTag(int i) {
        if (i != 1) {
            if (i != 85) {
                if (i != 255) {
                    if (i != 8192) {
                        if (i != 8193) {
                            return null;
                        }
                        return MimeTypes.AUDIO_DTS;
                    }
                    return MimeTypes.AUDIO_AC3;
                }
                return MimeTypes.AUDIO_AAC;
            }
            return MimeTypes.AUDIO_MPEG;
        }
        return MimeTypes.AUDIO_RAW;
    }

    @o0OO00OO
    private static AviChunk parseBitmapInfoHeader(ParsableByteArray parsableByteArray) {
        parsableByteArray.skipBytes(4);
        int readLittleEndianInt = parsableByteArray.readLittleEndianInt();
        int readLittleEndianInt2 = parsableByteArray.readLittleEndianInt();
        parsableByteArray.skipBytes(4);
        int readLittleEndianInt3 = parsableByteArray.readLittleEndianInt();
        String mimeTypeFromCompression = getMimeTypeFromCompression(readLittleEndianInt3);
        if (mimeTypeFromCompression == null) {
            o00oOOo0.o00oOOo0("Ignoring track with unsupported compression ", readLittleEndianInt3, TAG);
            return null;
        }
        Format.Builder builder = new Format.Builder();
        builder.setWidth(readLittleEndianInt).setHeight(readLittleEndianInt2).setSampleMimeType(mimeTypeFromCompression);
        return new StreamFormatChunk(builder.build());
    }

    @o0OO00OO
    public static AviChunk parseFrom(int i, ParsableByteArray parsableByteArray) {
        if (i == 2) {
            return parseBitmapInfoHeader(parsableByteArray);
        }
        if (i == 1) {
            return parseWaveFormatEx(parsableByteArray);
        }
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Ignoring strf box for unsupported track type: ");
        o00oOOo02.append(Util.getTrackTypeString(i));
        Log.w(TAG, o00oOOo02.toString());
        return null;
    }

    @o0OO00OO
    private static AviChunk parseWaveFormatEx(ParsableByteArray parsableByteArray) {
        int readLittleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
        String mimeTypeFromTag = getMimeTypeFromTag(readLittleEndianUnsignedShort);
        if (mimeTypeFromTag == null) {
            o00oOOo0.o00oOOo0("Ignoring track with unsupported format tag ", readLittleEndianUnsignedShort, TAG);
            return null;
        }
        int readLittleEndianUnsignedShort2 = parsableByteArray.readLittleEndianUnsignedShort();
        int readLittleEndianInt = parsableByteArray.readLittleEndianInt();
        parsableByteArray.skipBytes(6);
        int pcmEncoding = Util.getPcmEncoding(parsableByteArray.readUnsignedShort());
        int readLittleEndianUnsignedShort3 = parsableByteArray.readLittleEndianUnsignedShort();
        byte[] bArr = new byte[readLittleEndianUnsignedShort3];
        parsableByteArray.readBytes(bArr, 0, readLittleEndianUnsignedShort3);
        Format.Builder builder = new Format.Builder();
        builder.setSampleMimeType(mimeTypeFromTag).setChannelCount(readLittleEndianUnsignedShort2).setSampleRate(readLittleEndianInt);
        if (MimeTypes.AUDIO_RAW.equals(mimeTypeFromTag) && pcmEncoding != 0) {
            builder.setPcmEncoding(pcmEncoding);
        }
        if (MimeTypes.AUDIO_AAC.equals(mimeTypeFromTag) && readLittleEndianUnsignedShort3 > 0) {
            builder.setInitializationData(ImmutableList.of(bArr));
        }
        return new StreamFormatChunk(builder.build());
    }

    @Override // com.google.android.exoplayer2.extractor.avi.AviChunk
    public int getType() {
        return AviExtractor.FOURCC_strf;
    }
}
