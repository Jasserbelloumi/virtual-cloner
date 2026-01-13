package org.osmdroid.util;

import org.osmdroid.tileprovider.modules.SqlTileWriter;
/* loaded from: classes3.dex */
public class DuringSplashScreen implements SplashScreenable {
    @Override // org.osmdroid.util.SplashScreenable
    public void runDuringSplashScreen() {
        new SqlTileWriter().runDuringSplashScreen();
    }
}
