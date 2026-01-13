package org.osmdroid.tileprovider.tilesource;

import android.content.Context;
import android.support.v4.media.o00oOo0O;
import androidx.browser.browseractions.BrowserServiceFileProvider;
import org.osmdroid.tileprovider.util.ManifestUtil;
import org.osmdroid.util.MapTileIndex;
/* loaded from: classes3.dex */
public class MapBoxTileSource extends OnlineTileSourceBase {
    private static final String ACCESS_TOKEN = "MAPBOX_ACCESS_TOKEN";
    private static final String MAPBOX_MAPID = "MAPBOX_MAPID";
    private static final String[] mapBoxBaseUrl = {"https://api.mapbox.com/v4/"};
    private String accessToken;
    private String mapBoxMapId;

    public MapBoxTileSource() {
        super("mapbox", 1, 19, 256, BrowserServiceFileProvider.f1595o00ooo0, mapBoxBaseUrl);
        this.mapBoxMapId = "";
    }

    public MapBoxTileSource(Context context) {
        super("mapbox", 1, 19, 256, BrowserServiceFileProvider.f1595o00ooo0, mapBoxBaseUrl);
        this.mapBoxMapId = "";
        retrieveAccessToken(context);
        retrieveMapBoxMapId(context);
        this.mName = "mapbox" + this.mapBoxMapId;
    }

    public MapBoxTileSource(String str, int i, int i2, int i3, String str2) {
        super(str, i, i2, i3, str2, mapBoxBaseUrl);
        this.mapBoxMapId = "";
    }

    public MapBoxTileSource(String str, int i, int i2, int i3, String str2, String str3, String str4) {
        super(str, i, i2, i3, str2, new String[]{str4});
        this.mapBoxMapId = "";
    }

    public MapBoxTileSource(String str, String str2) {
        super("mapbox", 1, 19, 256, BrowserServiceFileProvider.f1595o00ooo0, mapBoxBaseUrl);
        this.accessToken = str2;
        this.mapBoxMapId = str;
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("mapbox");
        o00oOOo02.append(this.mapBoxMapId);
        this.mName = o00oOOo02.toString();
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getMapBoxMapId() {
        return this.mapBoxMapId;
    }

    @Override // org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase
    public String getTileURLString(long j) {
        return getBaseUrl() + getMapBoxMapId() + "/" + MapTileIndex.getZoom(j) + "/" + MapTileIndex.getX(j) + "/" + MapTileIndex.getY(j) + BrowserServiceFileProvider.f1595o00ooo0 + "?access_token=" + getAccessToken();
    }

    public final void retrieveAccessToken(Context context) {
        this.accessToken = ManifestUtil.retrieveKey(context, ACCESS_TOKEN);
    }

    public final void retrieveMapBoxMapId(Context context) {
        this.mapBoxMapId = ManifestUtil.retrieveKey(context, MAPBOX_MAPID);
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public void setMapboxMapid(String str) {
        this.mapBoxMapId = str;
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("mapbox");
        o00oOOo02.append(this.mapBoxMapId);
        this.mName = o00oOOo02.toString();
    }
}
