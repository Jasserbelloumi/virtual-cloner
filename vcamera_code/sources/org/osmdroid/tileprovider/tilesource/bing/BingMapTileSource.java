package org.osmdroid.tileprovider.tilesource.bing;

import android.content.Context;
import java.util.Locale;
import org.osmdroid.tileprovider.tilesource.IStyledTileSource;
import org.osmdroid.tileprovider.tilesource.QuadTreeTileSource;
import org.osmdroid.tileprovider.util.ManifestUtil;
/* loaded from: classes3.dex */
public class BingMapTileSource extends QuadTreeTileSource implements IStyledTileSource<String> {
    private static final String BASE_URL_PATTERN = "https://dev.virtualearth.net/REST/V1/Imagery/Metadata/%s?mapVersion=v1&output=json&uriScheme=https&key=%s";
    private static final String BING_KEY = "BING_KEY";
    private static final String FILENAME_ENDING = ".jpeg";
    public static final String IMAGERYSET_AERIAL = "Aerial";
    public static final String IMAGERYSET_AERIALWITHLABELS = "AerialWithLabels";
    public static final String IMAGERYSET_ROAD = "Road";
    private static String mBingMapKey = "";
    private String mBaseUrl;
    private ImageryMetaDataResource mImageryData;
    private String mLocale;
    private String mStyle;
    private String mUrl;

    public BingMapTileSource(String str) {
        super("BingMaps", 0, 19, 256, FILENAME_ENDING, null);
        this.mStyle = IMAGERYSET_ROAD;
        this.mImageryData = ImageryMetaDataResource.getDefaultInstance();
        this.mLocale = str;
        if (str == null) {
            this.mLocale = Locale.getDefault().getLanguage() + "-" + Locale.getDefault().getCountry();
        }
    }

    public static String getBingKey() {
        return mBingMapKey;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0103 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.osmdroid.tileprovider.tilesource.bing.ImageryMetaDataResource getMetaData() {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.osmdroid.tileprovider.tilesource.bing.BingMapTileSource.getMetaData():org.osmdroid.tileprovider.tilesource.bing.ImageryMetaDataResource");
    }

    public static void retrieveBingKey(Context context) {
        mBingMapKey = ManifestUtil.retrieveKey(context, BING_KEY);
    }

    public static void setBingKey(String str) {
        mBingMapKey = str;
    }

    @Override // org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase
    public String getBaseUrl() {
        if (!this.mImageryData.m_isInitialised) {
            initMetaData();
        }
        return this.mBaseUrl;
    }

    @Override // org.osmdroid.tileprovider.tilesource.BitmapTileSourceBase, org.osmdroid.tileprovider.tilesource.ITileSource
    public String getCopyrightNotice() {
        return this.mImageryData.copyright;
    }

    @Override // org.osmdroid.tileprovider.tilesource.BitmapTileSourceBase, org.osmdroid.tileprovider.tilesource.ITileSource
    public int getMaximumZoomLevel() {
        return this.mImageryData.m_zoomMax;
    }

    @Override // org.osmdroid.tileprovider.tilesource.BitmapTileSourceBase, org.osmdroid.tileprovider.tilesource.ITileSource
    public int getMinimumZoomLevel() {
        return this.mImageryData.m_zoomMin;
    }

    @Override // org.osmdroid.tileprovider.tilesource.IStyledTileSource
    public String getStyle() {
        return this.mStyle;
    }

    @Override // org.osmdroid.tileprovider.tilesource.BitmapTileSourceBase, org.osmdroid.tileprovider.tilesource.ITileSource
    public int getTileSizePixels() {
        return this.mImageryData.m_imageHeight;
    }

    @Override // org.osmdroid.tileprovider.tilesource.QuadTreeTileSource, org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase
    public String getTileURLString(long j) {
        if (!this.mImageryData.m_isInitialised) {
            initMetaData();
        }
        return String.format(this.mUrl, quadTree(j));
    }

    public ImageryMetaDataResource initMetaData() {
        ImageryMetaDataResource metaData;
        if (!this.mImageryData.m_isInitialised) {
            synchronized (this) {
                if (!this.mImageryData.m_isInitialised && (metaData = getMetaData()) != null) {
                    this.mImageryData = metaData;
                    updateBaseUrl();
                }
            }
        }
        return this.mImageryData;
    }

    @Override // org.osmdroid.tileprovider.tilesource.BitmapTileSourceBase
    public String pathBase() {
        return this.mName + this.mStyle;
    }

    @Override // org.osmdroid.tileprovider.tilesource.IStyledTileSource
    public void setStyle(String str) {
        if (!str.equals(this.mStyle)) {
            synchronized (this.mStyle) {
                this.mUrl = null;
                this.mBaseUrl = null;
                this.mImageryData.m_isInitialised = false;
            }
        }
        this.mStyle = str;
        this.mName = pathBase();
    }

    public void updateBaseUrl() {
        String subDomain = this.mImageryData.getSubDomain();
        int lastIndexOf = this.mImageryData.m_imageUrl.lastIndexOf("/");
        this.mBaseUrl = lastIndexOf > 0 ? this.mImageryData.m_imageUrl.substring(0, lastIndexOf) : this.mImageryData.m_imageUrl;
        this.mUrl = this.mImageryData.m_imageUrl;
        if (subDomain != null) {
            this.mBaseUrl = String.format(this.mBaseUrl, subDomain);
            this.mUrl = String.format(this.mUrl, subDomain, "%s", this.mLocale);
        }
    }
}
