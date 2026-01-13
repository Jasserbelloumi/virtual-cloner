package com.google.android.exoplayer2.extractor.jpeg;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.jpeg.MotionPhotoDescription;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.XmlPullParserUtil;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.io.StringReader;
import o00oOoOo.o00oo;
import o00oOooO.o0OO00OO;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
/* loaded from: classes.dex */
final class XmpMotionPhotoDescriptionParser {
    private static final String TAG = "MotionPhotoXmpParser";
    private static final String[] MOTION_PHOTO_ATTRIBUTE_NAMES = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] DESCRIPTION_MOTION_PHOTO_PRESENTATION_TIMESTAMP_ATTRIBUTE_NAMES = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] DESCRIPTION_MICRO_VIDEO_OFFSET_ATTRIBUTE_NAMES = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    private XmpMotionPhotoDescriptionParser() {
    }

    @o0OO00OO
    public static MotionPhotoDescription parse(String str) throws IOException {
        try {
            return parseInternal(str);
        } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
            Log.w(TAG, "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    @o0OO00OO
    private static MotionPhotoDescription parseInternal(String str) throws XmlPullParserException, IOException {
        String str2;
        String str3;
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (XmlPullParserUtil.isStartTag(newPullParser, "x:xmpmeta")) {
            long j = C.TIME_UNSET;
            ImmutableList<MotionPhotoDescription.ContainerItem> of = ImmutableList.of();
            do {
                newPullParser.next();
                if (!XmlPullParserUtil.isStartTag(newPullParser, "rdf:Description")) {
                    if (XmlPullParserUtil.isStartTag(newPullParser, "Container:Directory")) {
                        str2 = "Container";
                        str3 = "Item";
                    } else if (XmlPullParserUtil.isStartTag(newPullParser, "GContainer:Directory")) {
                        str2 = "GContainer";
                        str3 = "GContainerItem";
                    }
                    of = parseMotionPhotoV1Directory(newPullParser, str2, str3);
                } else if (!parseMotionPhotoFlagFromDescription(newPullParser)) {
                    return null;
                } else {
                    j = parseMotionPhotoPresentationTimestampUsFromDescription(newPullParser);
                    of = parseMicroVideoOffsetFromDescription(newPullParser);
                }
            } while (!XmlPullParserUtil.isEndTag(newPullParser, "x:xmpmeta"));
            if (of.isEmpty()) {
                return null;
            }
            return new MotionPhotoDescription(j, of);
        }
        throw ParserException.createForMalformedContainer("Couldn't find xmp metadata", null);
    }

    private static ImmutableList<MotionPhotoDescription.ContainerItem> parseMicroVideoOffsetFromDescription(XmlPullParser xmlPullParser) {
        for (String str : DESCRIPTION_MICRO_VIDEO_OFFSET_ATTRIBUTE_NAMES) {
            String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, str);
            if (attributeValue != null) {
                return ImmutableList.of(new MotionPhotoDescription.ContainerItem(MimeTypes.IMAGE_JPEG, "Primary", 0L, 0L), new MotionPhotoDescription.ContainerItem(MimeTypes.VIDEO_MP4, "MotionPhoto", Long.parseLong(attributeValue), 0L));
            }
        }
        return ImmutableList.of();
    }

    private static boolean parseMotionPhotoFlagFromDescription(XmlPullParser xmlPullParser) {
        for (String str : MOTION_PHOTO_ATTRIBUTE_NAMES) {
            String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, str);
            if (attributeValue != null) {
                return Integer.parseInt(attributeValue) == 1;
            }
        }
        return false;
    }

    private static long parseMotionPhotoPresentationTimestampUsFromDescription(XmlPullParser xmlPullParser) {
        for (String str : DESCRIPTION_MOTION_PHOTO_PRESENTATION_TIMESTAMP_ATTRIBUTE_NAMES) {
            String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, str);
            if (attributeValue != null) {
                long parseLong = Long.parseLong(attributeValue);
                return parseLong == -1 ? C.TIME_UNSET : parseLong;
            }
        }
        return C.TIME_UNSET;
    }

    private static ImmutableList<MotionPhotoDescription.ContainerItem> parseMotionPhotoV1Directory(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        ImmutableList.Builder builder = ImmutableList.builder();
        String o00oOOo02 = o00oo.o00oOOo0(str, ":Item");
        String o00oOOo03 = o00oo.o00oOOo0(str, ":Directory");
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, o00oOOo02)) {
                String o00oOOo04 = o00oo.o00oOOo0(str2, ":Mime");
                String o00oOOo05 = o00oo.o00oOOo0(str2, ":Semantic");
                String o00oOOo06 = o00oo.o00oOOo0(str2, ":Length");
                String o00oOOo07 = o00oo.o00oOOo0(str2, ":Padding");
                String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, o00oOOo04);
                String attributeValue2 = XmlPullParserUtil.getAttributeValue(xmlPullParser, o00oOOo05);
                String attributeValue3 = XmlPullParserUtil.getAttributeValue(xmlPullParser, o00oOOo06);
                String attributeValue4 = XmlPullParserUtil.getAttributeValue(xmlPullParser, o00oOOo07);
                if (attributeValue == null || attributeValue2 == null) {
                    return ImmutableList.of();
                }
                builder.add((ImmutableList.Builder) new MotionPhotoDescription.ContainerItem(attributeValue, attributeValue2, attributeValue3 != null ? Long.parseLong(attributeValue3) : 0L, attributeValue4 != null ? Long.parseLong(attributeValue4) : 0L));
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, o00oOOo03));
        return builder.build();
    }
}
