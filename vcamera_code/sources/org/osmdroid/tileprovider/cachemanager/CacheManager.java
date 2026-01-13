package org.osmdroid.tileprovider.cachemanager;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.support.v4.media.o00oOo00;
import android.widget.Toast;
import androidx.recyclerview.widget.o00oo0O0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.osmdroid.config.Configuration;
import org.osmdroid.tileprovider.MapTileProviderBase;
import org.osmdroid.tileprovider.constants.OpenStreetMapTileProviderConstants;
import org.osmdroid.tileprovider.modules.CantContinueException;
import org.osmdroid.tileprovider.modules.IFilesystemCache;
import org.osmdroid.tileprovider.modules.TileDownloader;
import org.osmdroid.tileprovider.tilesource.ITileSource;
import org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase;
import org.osmdroid.tileprovider.tilesource.TileSourcePolicyException;
import org.osmdroid.util.BoundingBox;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.util.IterableWithSize;
import org.osmdroid.util.MapTileArea;
import org.osmdroid.util.MapTileAreaList;
import org.osmdroid.util.MapTileIndex;
import org.osmdroid.util.MyMath;
import org.osmdroid.util.TileSystem;
import org.osmdroid.views.MapView;
/* loaded from: classes3.dex */
public class CacheManager {
    public final int mMaxZoomLevel;
    public final int mMinZoomLevel;
    public Set<CacheManagerTask> mPendingTasks;
    private TileDownloader mTileDownloader;
    public final ITileSource mTileSource;
    public final IFilesystemCache mTileWriter;
    public boolean verifyCancel;

    /* loaded from: classes3.dex */
    public interface CacheManagerAction {
        int getProgressModulo();

        boolean preCheck();

        boolean tileAction(long j);
    }

    /* loaded from: classes3.dex */
    public interface CacheManagerCallback {
        void downloadStarted();

        void onTaskComplete();

        void onTaskFailed(int i);

        void setPossibleTilesInArea(int i);

        void updateProgress(int i, int i2, int i3, int i4);
    }

    /* loaded from: classes3.dex */
    public static abstract class CacheManagerDialog implements CacheManagerCallback {
        private final ProgressDialog mProgressDialog;
        private final CacheManagerTask mTask;

        public CacheManagerDialog(final Context context, CacheManagerTask cacheManagerTask) {
            this.mTask = cacheManagerTask;
            ProgressDialog progressDialog = new ProgressDialog(context);
            this.mProgressDialog = progressDialog;
            progressDialog.setProgressStyle(1);
            progressDialog.setCancelable(true);
            if (cacheManagerTask.mManager.getVerifyCancel()) {
                progressDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.osmdroid.tileprovider.cachemanager.CacheManager.CacheManagerDialog.1
                    @Override // android.content.DialogInterface.OnCancelListener
                    public void onCancel(DialogInterface dialogInterface) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(context);
                        builder.setTitle("Cancel map download");
                        builder.setMessage("Do you want to cancel the map download?");
                        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() { // from class: org.osmdroid.tileprovider.cachemanager.CacheManager.CacheManagerDialog.1.1
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface2, int i) {
                                CacheManagerDialog.this.mTask.cancel(true);
                            }
                        });
                        builder.setNegativeButton("No", new DialogInterface.OnClickListener() { // from class: org.osmdroid.tileprovider.cachemanager.CacheManager.CacheManagerDialog.1.2
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface2, int i) {
                                dialogInterface2.dismiss();
                                CacheManagerDialog.this.mProgressDialog.show();
                            }
                        });
                        builder.show();
                    }
                });
            } else {
                progressDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.osmdroid.tileprovider.cachemanager.CacheManager.CacheManagerDialog.2
                    @Override // android.content.DialogInterface.OnCancelListener
                    public void onCancel(DialogInterface dialogInterface) {
                        CacheManagerDialog.this.mTask.cancel(true);
                    }
                });
            }
        }

        private void dismiss() {
            if (this.mProgressDialog.isShowing()) {
                this.mProgressDialog.dismiss();
            }
        }

        @Override // org.osmdroid.tileprovider.cachemanager.CacheManager.CacheManagerCallback
        public void downloadStarted() {
            this.mProgressDialog.setTitle(getUITitle());
            this.mProgressDialog.show();
        }

        public abstract String getUITitle();

        @Override // org.osmdroid.tileprovider.cachemanager.CacheManager.CacheManagerCallback
        public void onTaskComplete() {
            dismiss();
        }

        @Override // org.osmdroid.tileprovider.cachemanager.CacheManager.CacheManagerCallback
        public void onTaskFailed(int i) {
            dismiss();
        }

        @Override // org.osmdroid.tileprovider.cachemanager.CacheManager.CacheManagerCallback
        public void setPossibleTilesInArea(int i) {
            this.mProgressDialog.setMax(i);
        }

        @Override // org.osmdroid.tileprovider.cachemanager.CacheManager.CacheManagerCallback
        public void updateProgress(int i, int i2, int i3, int i4) {
            this.mProgressDialog.setProgress(i);
            this.mProgressDialog.setMessage(zoomMessage(i2, i3, i4));
        }

        public String zoomMessage(int i, int i2, int i3) {
            return o00oOo00.o00oOOo0(o00oo0O0.o00oOOo0("Handling zoom level: ", i, " (from ", i2, " to "), i3, ")");
        }
    }

    /* loaded from: classes3.dex */
    public static class CacheManagerTask extends AsyncTask<Object, Integer, Integer> {
        private final CacheManagerAction mAction;
        private final ArrayList<CacheManagerCallback> mCallbacks;
        private final CacheManager mManager;
        private final IterableWithSize<Long> mTiles;
        private final int mZoomMax;
        private final int mZoomMin;

        public CacheManagerTask(CacheManager cacheManager, CacheManagerAction cacheManagerAction, ArrayList<GeoPoint> arrayList, int i, int i2) {
            this(cacheManager, cacheManagerAction, CacheManager.getTilesCoverage(arrayList, i, i2), i, i2);
        }

        public CacheManagerTask(CacheManager cacheManager, CacheManagerAction cacheManagerAction, List<Long> list, int i, int i2) {
            this(cacheManager, cacheManagerAction, new ListWrapper(list), i, i2);
        }

        public CacheManagerTask(CacheManager cacheManager, CacheManagerAction cacheManagerAction, BoundingBox boundingBox, int i, int i2) {
            this(cacheManager, cacheManagerAction, CacheManager.getTilesCoverageIterable(boundingBox, i, i2), i, i2);
        }

        private CacheManagerTask(CacheManager cacheManager, CacheManagerAction cacheManagerAction, IterableWithSize<Long> iterableWithSize, int i, int i2) {
            this.mCallbacks = new ArrayList<>();
            this.mManager = cacheManager;
            this.mAction = cacheManagerAction;
            this.mTiles = iterableWithSize;
            this.mZoomMin = Math.max(i, cacheManager.mMinZoomLevel);
            this.mZoomMax = Math.min(i2, cacheManager.mMaxZoomLevel);
        }

        private void logFaultyCallback(Throwable th) {
        }

        public void addCallback(CacheManagerCallback cacheManagerCallback) {
            if (cacheManagerCallback != null) {
                this.mCallbacks.add(cacheManagerCallback);
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.AsyncTask
        public Integer doInBackground(Object... objArr) {
            if (this.mAction.preCheck()) {
                int i = 0;
                int i2 = 0;
                for (Long l : this.mTiles) {
                    long longValue = l.longValue();
                    int zoom = MapTileIndex.getZoom(longValue);
                    if (zoom >= this.mZoomMin && zoom <= this.mZoomMax && this.mAction.tileAction(longValue)) {
                        i++;
                    }
                    i2++;
                    if (i2 % this.mAction.getProgressModulo() == 0) {
                        if (isCancelled()) {
                            return Integer.valueOf(i);
                        }
                        publishProgress(Integer.valueOf(i2), Integer.valueOf(MapTileIndex.getZoom(longValue)));
                    }
                }
                return Integer.valueOf(i);
            }
            return 0;
        }

        @Override // android.os.AsyncTask
        public void onCancelled() {
            this.mManager.mPendingTasks.remove(this);
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Integer num) {
            this.mManager.mPendingTasks.remove(this);
            Iterator<CacheManagerCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                CacheManagerCallback next = it.next();
                try {
                    if (num.intValue() == 0) {
                        next.onTaskComplete();
                    } else {
                        next.onTaskFailed(num.intValue());
                    }
                } catch (Throwable th) {
                    logFaultyCallback(th);
                }
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            int size = this.mTiles.size();
            Iterator<CacheManagerCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                CacheManagerCallback next = it.next();
                try {
                    next.setPossibleTilesInArea(size);
                    next.downloadStarted();
                    int i = this.mZoomMin;
                    next.updateProgress(0, i, i, this.mZoomMax);
                } catch (Throwable th) {
                    logFaultyCallback(th);
                }
            }
        }

        @Override // android.os.AsyncTask
        public void onProgressUpdate(Integer... numArr) {
            Iterator<CacheManagerCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                try {
                    it.next().updateProgress(numArr[0].intValue(), numArr[1].intValue(), this.mZoomMin, this.mZoomMax);
                } catch (Throwable th) {
                    logFaultyCallback(th);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class ListWrapper<T> implements IterableWithSize<T> {
        private final List<T> list;

        private ListWrapper(List<T> list) {
            this.list = list;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.list.iterator();
        }

        @Override // org.osmdroid.util.IterableWithSize
        public int size() {
            return this.list.size();
        }
    }

    public CacheManager(MapTileProviderBase mapTileProviderBase, IFilesystemCache iFilesystemCache, int i, int i2) throws TileSourcePolicyException {
        this(mapTileProviderBase.getTileSource(), iFilesystemCache, i, i2);
    }

    public CacheManager(ITileSource iTileSource, IFilesystemCache iFilesystemCache, int i, int i2) throws TileSourcePolicyException {
        this.mTileDownloader = new TileDownloader();
        this.mPendingTasks = new HashSet();
        this.verifyCancel = true;
        this.mTileSource = iTileSource;
        this.mTileWriter = iFilesystemCache;
        this.mMinZoomLevel = i;
        this.mMaxZoomLevel = i2;
    }

    public CacheManager(MapView mapView) throws TileSourcePolicyException {
        this(mapView, mapView.getTileProvider().getTileWriter());
    }

    public CacheManager(MapView mapView, IFilesystemCache iFilesystemCache) throws TileSourcePolicyException {
        this(mapView.getTileProvider(), iFilesystemCache, (int) mapView.getMinZoomLevel(), (int) mapView.getMaxZoomLevel());
    }

    @Deprecated
    public static GeoPoint getCoordinatesFromMapTile(int i, int i2, int i3) {
        return new GeoPoint(MapView.getTileSystem().getLatitudeFromTileY(i2, i3), MapView.getTileSystem().getLongitudeFromTileX(i, i3));
    }

    public static File getFileName(ITileSource iTileSource, long j) {
        File osmdroidTileCache = Configuration.getInstance().getOsmdroidTileCache();
        return new File(osmdroidTileCache, iTileSource.getTileRelativeFilenameString(j) + OpenStreetMapTileProviderConstants.TILE_PATH_EXTENSION);
    }

    @Deprecated
    public static Point getMapTileFromCoordinates(double d, double d2, int i) {
        return new Point(MapView.getTileSystem().getTileXFromLongitude(d2, i), MapView.getTileSystem().getTileYFromLatitude(d, i));
    }

    public static Collection<Long> getTilesCoverage(ArrayList<GeoPoint> arrayList, int i) {
        int i2;
        Iterator<GeoPoint> it;
        boolean z;
        int i3;
        int i4;
        HashSet hashSet = new HashSet();
        boolean z2 = true;
        int i5 = 1 << i;
        Iterator<GeoPoint> it2 = arrayList.iterator();
        GeoPoint geoPoint = null;
        Point point = null;
        while (it2.hasNext()) {
            GeoPoint next = it2.next();
            double GroundResolution = TileSystem.GroundResolution(next.getLatitude(), i);
            if (hashSet.size() == 0) {
                i2 = i5;
                it = it2;
                Point point2 = new Point(MapView.getTileSystem().getTileXFromLongitude(next.getLongitude(), i), MapView.getTileSystem().getTileYFromLatitude(next.getLatitude(), i));
                int i6 = point2.x;
                int i7 = i6 >= 0 ? 0 : -i6;
                int i8 = point2.y;
                int i9 = i8 >= 0 ? 0 : -i8;
                int i10 = i6 + i7;
                while (true) {
                    z = true;
                    if (i10 > point2.x + 1 + i7) {
                        break;
                    }
                    for (int i11 = point2.y + i9; i11 <= point2.y + 1 + i9; i11++) {
                        hashSet.add(Long.valueOf(MapTileIndex.getTileIndex(i, MyMath.mod(i10, i2), MyMath.mod(i11, i2))));
                    }
                    i10++;
                }
                point = point2;
            } else if (geoPoint != null) {
                double atan = (next.getLongitude() > geoPoint.getLongitude() ? 1.5707963267948966d : 4.71238898038469d) - Math.atan((next.getLatitude() - geoPoint.getLatitude()) / (next.getLongitude() - geoPoint.getLongitude()));
                int i12 = i5;
                GeoPoint geoPoint2 = new GeoPoint(geoPoint.getLatitude(), geoPoint.getLongitude());
                while (true) {
                    if (((next.getLatitude() <= geoPoint.getLatitude() || geoPoint2.getLatitude() >= next.getLatitude()) && (next.getLatitude() >= geoPoint.getLatitude() || geoPoint2.getLatitude() <= next.getLatitude())) || ((next.getLongitude() <= geoPoint.getLongitude() || geoPoint2.getLongitude() >= next.getLongitude()) && (next.getLongitude() >= geoPoint.getLongitude() || geoPoint2.getLongitude() <= next.getLongitude()))) {
                        break;
                    }
                    double latitude = (geoPoint2.getLatitude() * 3.141592653589793d) / 180.0d;
                    double d = GroundResolution / 6378137.0d;
                    double asin = Math.asin((Math.cos(atan) * Math.sin(d) * Math.cos(latitude)) + (Math.cos(d) * Math.sin(latitude)));
                    double atan2 = Math.atan2(Math.cos(latitude) * Math.sin(d) * Math.sin(atan), Math.cos(d) - (Math.sin(asin) * Math.sin(latitude))) + ((geoPoint2.getLongitude() * 3.141592653589793d) / 180.0d);
                    Iterator<GeoPoint> it3 = it2;
                    GeoPoint geoPoint3 = geoPoint;
                    geoPoint2.setLatitude((asin * 180.0d) / 3.141592653589793d);
                    geoPoint2.setLongitude((atan2 * 180.0d) / 3.141592653589793d);
                    Point point3 = new Point(MapView.getTileSystem().getTileXFromLongitude(geoPoint2.getLongitude(), i), MapView.getTileSystem().getTileYFromLatitude(geoPoint2.getLatitude(), i));
                    if (point3.equals(point)) {
                        i3 = i12;
                    } else {
                        int i13 = point3.x;
                        int i14 = i13 >= 0 ? 0 : -i13;
                        int i15 = point3.y;
                        int i16 = i15 >= 0 ? 0 : -i15;
                        int i17 = i13 + i14;
                        while (true) {
                            int i18 = 1;
                            if (i17 > point3.x + 1 + i14) {
                                break;
                            }
                            int i19 = point3.y + i16;
                            while (true) {
                                int i20 = point3.y + i18 + i16;
                                i4 = i12;
                                if (i19 <= i20) {
                                    hashSet.add(Long.valueOf(MapTileIndex.getTileIndex(i, MyMath.mod(i17, i4), MyMath.mod(i19, i4))));
                                    i19++;
                                    point3 = point3;
                                    i12 = i4;
                                    i18 = 1;
                                }
                            }
                            i17++;
                            i12 = i4;
                        }
                        i3 = i12;
                        point = point3;
                    }
                    i12 = i3;
                    it2 = it3;
                    geoPoint = geoPoint3;
                }
                it = it2;
                i2 = i12;
                z = true;
            } else {
                i2 = i5;
                it = it2;
                z = z2;
            }
            geoPoint = next;
            z2 = z;
            i5 = i2;
            it2 = it;
        }
        return hashSet;
    }

    public static Collection<Long> getTilesCoverage(BoundingBox boundingBox, int i) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Long l : getTilesCoverageIterable(boundingBox, i, i)) {
            linkedHashSet.add(l);
        }
        return linkedHashSet;
    }

    public static List<Long> getTilesCoverage(ArrayList<GeoPoint> arrayList, int i, int i2) {
        ArrayList arrayList2 = new ArrayList();
        while (i <= i2) {
            arrayList2.addAll(getTilesCoverage(arrayList, i));
            i++;
        }
        return arrayList2;
    }

    public static List<Long> getTilesCoverage(BoundingBox boundingBox, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        while (i <= i2) {
            arrayList.addAll(getTilesCoverage(boundingBox, i));
            i++;
        }
        return arrayList;
    }

    public static IterableWithSize<Long> getTilesCoverageIterable(BoundingBox boundingBox, int i, int i2) {
        MapTileAreaList mapTileAreaList = new MapTileAreaList();
        while (i <= i2) {
            mapTileAreaList.getList().add(new MapTileArea().set(i, getTilesRect(boundingBox, i)));
            i++;
        }
        return mapTileAreaList;
    }

    public static Rect getTilesRect(BoundingBox boundingBox, int i) {
        int i2 = 1 << i;
        int tileXFromLongitude = MapView.getTileSystem().getTileXFromLongitude(boundingBox.getLonEast(), i);
        int tileYFromLatitude = MapView.getTileSystem().getTileYFromLatitude(boundingBox.getLatSouth(), i);
        int tileXFromLongitude2 = MapView.getTileSystem().getTileXFromLongitude(boundingBox.getLonWest(), i);
        int tileYFromLatitude2 = MapView.getTileSystem().getTileYFromLatitude(boundingBox.getLatNorth(), i);
        int i3 = (tileXFromLongitude - tileXFromLongitude2) + 1;
        if (i3 <= 0) {
            i3 += i2;
        }
        int i4 = (tileYFromLatitude - tileYFromLatitude2) + 1;
        if (i4 <= 0) {
            i4 += i2;
        }
        return new Rect(tileXFromLongitude2, tileYFromLatitude2, (i3 + tileXFromLongitude2) - 1, (i4 + tileYFromLatitude2) - 1);
    }

    public long cacheCapacity() {
        return Configuration.getInstance().getTileFileSystemCacheMaxBytes();
    }

    public void cancelAllJobs() {
        for (CacheManagerTask cacheManagerTask : this.mPendingTasks) {
            cacheManagerTask.cancel(true);
        }
        this.mPendingTasks.clear();
    }

    public boolean checkTile(long j) {
        return this.mTileWriter.exists(this.mTileSource, j);
    }

    public CacheManagerTask cleanAreaAsync(Context context, ArrayList<GeoPoint> arrayList, int i, int i2) {
        return cleanAreaAsync(context, extendedBoundsFromGeoPoints(arrayList, i), i, i2);
    }

    public CacheManagerTask cleanAreaAsync(Context context, List<Long> list, int i, int i2) {
        CacheManagerTask cacheManagerTask = new CacheManagerTask(this, getCleaningAction(), list, i, i2);
        cacheManagerTask.addCallback(getCleaningDialog(context, cacheManagerTask));
        return execute(cacheManagerTask);
    }

    public CacheManagerTask cleanAreaAsync(Context context, BoundingBox boundingBox, int i, int i2) {
        CacheManagerTask cacheManagerTask = new CacheManagerTask(this, getCleaningAction(), boundingBox, i, i2);
        cacheManagerTask.addCallback(getCleaningDialog(context, cacheManagerTask));
        return execute(cacheManagerTask);
    }

    public long currentCacheUsage() {
        return directorySize(Configuration.getInstance().getOsmdroidTileCache());
    }

    public boolean deleteTile(long j) {
        return this.mTileWriter.exists(this.mTileSource, j) && this.mTileWriter.remove(this.mTileSource, j);
    }

    public long directorySize(File file) {
        long directorySize;
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    directorySize = file2.length();
                } else if (file2.isDirectory()) {
                    directorySize = directorySize(file2);
                }
                j += directorySize;
            }
        }
        return j;
    }

    public CacheManagerTask downloadAreaAsync(Context context, ArrayList<GeoPoint> arrayList, int i, int i2) {
        CacheManagerTask cacheManagerTask = new CacheManagerTask(this, getDownloadingAction(), arrayList, i, i2);
        cacheManagerTask.addCallback(getDownloadingDialog(context, cacheManagerTask));
        return execute(cacheManagerTask);
    }

    public CacheManagerTask downloadAreaAsync(Context context, ArrayList<GeoPoint> arrayList, int i, int i2, CacheManagerCallback cacheManagerCallback) {
        CacheManagerTask cacheManagerTask = new CacheManagerTask(this, getDownloadingAction(), arrayList, i, i2);
        cacheManagerTask.addCallback(cacheManagerCallback);
        cacheManagerTask.addCallback(getDownloadingDialog(context, cacheManagerTask));
        return execute(cacheManagerTask);
    }

    public CacheManagerTask downloadAreaAsync(Context context, List<Long> list, int i, int i2) {
        CacheManagerTask cacheManagerTask = new CacheManagerTask(this, getDownloadingAction(), list, i, i2);
        cacheManagerTask.addCallback(getDownloadingDialog(context, cacheManagerTask));
        return execute(cacheManagerTask);
    }

    public CacheManagerTask downloadAreaAsync(Context context, BoundingBox boundingBox, int i, int i2) {
        CacheManagerTask cacheManagerTask = new CacheManagerTask(this, getDownloadingAction(), boundingBox, i, i2);
        cacheManagerTask.addCallback(getDownloadingDialog(context, cacheManagerTask));
        return execute(cacheManagerTask);
    }

    public CacheManagerTask downloadAreaAsync(Context context, BoundingBox boundingBox, int i, int i2, CacheManagerCallback cacheManagerCallback) {
        CacheManagerTask cacheManagerTask = new CacheManagerTask(this, getDownloadingAction(), boundingBox, i, i2);
        cacheManagerTask.addCallback(cacheManagerCallback);
        cacheManagerTask.addCallback(getDownloadingDialog(context, cacheManagerTask));
        return execute(cacheManagerTask);
    }

    public CacheManagerTask downloadAreaAsyncNoUI(Context context, ArrayList<GeoPoint> arrayList, int i, int i2, CacheManagerCallback cacheManagerCallback) {
        CacheManagerTask cacheManagerTask = new CacheManagerTask(this, getDownloadingAction(), arrayList, i, i2);
        cacheManagerTask.addCallback(cacheManagerCallback);
        return execute(cacheManagerTask);
    }

    public CacheManagerTask downloadAreaAsyncNoUI(Context context, BoundingBox boundingBox, int i, int i2, CacheManagerCallback cacheManagerCallback) {
        CacheManagerTask cacheManagerTask = new CacheManagerTask(this, getDownloadingAction(), boundingBox, i, i2);
        cacheManagerTask.addCallback(cacheManagerCallback);
        execute(cacheManagerTask);
        return cacheManagerTask;
    }

    public CacheManagerTask execute(CacheManagerTask cacheManagerTask) {
        cacheManagerTask.execute(new Object[0]);
        this.mPendingTasks.add(cacheManagerTask);
        return cacheManagerTask;
    }

    public BoundingBox extendedBoundsFromGeoPoints(ArrayList<GeoPoint> arrayList, int i) {
        BoundingBox fromGeoPoints = BoundingBox.fromGeoPoints(arrayList);
        int tileXFromLongitude = MapView.getTileSystem().getTileXFromLongitude(fromGeoPoints.getLonEast(), i);
        int tileYFromLatitude = MapView.getTileSystem().getTileYFromLatitude(fromGeoPoints.getLatSouth(), i);
        int tileXFromLongitude2 = MapView.getTileSystem().getTileXFromLongitude(fromGeoPoints.getLonWest(), i);
        return new BoundingBox(MapView.getTileSystem().getLatitudeFromTileY(MapView.getTileSystem().getTileYFromLatitude(fromGeoPoints.getLatNorth(), i) - 1, i), MapView.getTileSystem().getLongitudeFromTileX(tileXFromLongitude + 1, i), MapView.getTileSystem().getLatitudeFromTileY(tileYFromLatitude + 1, i), MapView.getTileSystem().getLongitudeFromTileX(tileXFromLongitude2 - 1, i));
    }

    public boolean forceLoadTile(OnlineTileSourceBase onlineTileSourceBase, long j) {
        try {
            return this.mTileDownloader.downloadTile(j, this.mTileWriter, onlineTileSourceBase) != null;
        } catch (CantContinueException unused) {
            return false;
        }
    }

    public CacheManagerAction getCleaningAction() {
        return new CacheManagerAction() { // from class: org.osmdroid.tileprovider.cachemanager.CacheManager.4
            @Override // org.osmdroid.tileprovider.cachemanager.CacheManager.CacheManagerAction
            public int getProgressModulo() {
                return 1000;
            }

            @Override // org.osmdroid.tileprovider.cachemanager.CacheManager.CacheManagerAction
            public boolean preCheck() {
                return true;
            }

            @Override // org.osmdroid.tileprovider.cachemanager.CacheManager.CacheManagerAction
            public boolean tileAction(long j) {
                return CacheManager.this.deleteTile(j);
            }
        };
    }

    public CacheManagerDialog getCleaningDialog(final Context context, CacheManagerTask cacheManagerTask) {
        return new CacheManagerDialog(context, cacheManagerTask) { // from class: org.osmdroid.tileprovider.cachemanager.CacheManager.2
            @Override // org.osmdroid.tileprovider.cachemanager.CacheManager.CacheManagerDialog
            public String getUITitle() {
                return "Cleaning tiles";
            }

            @Override // org.osmdroid.tileprovider.cachemanager.CacheManager.CacheManagerDialog, org.osmdroid.tileprovider.cachemanager.CacheManager.CacheManagerCallback
            public void onTaskFailed(int i) {
                super.onTaskFailed(i);
                Context context2 = context;
                Toast.makeText(context2, "Cleaning completed, " + i + " tiles deleted.", 0).show();
            }
        };
    }

    public CacheManagerAction getDownloadingAction() {
        return new CacheManagerAction() { // from class: org.osmdroid.tileprovider.cachemanager.CacheManager.3
            @Override // org.osmdroid.tileprovider.cachemanager.CacheManager.CacheManagerAction
            public int getProgressModulo() {
                return 10;
            }

            @Override // org.osmdroid.tileprovider.cachemanager.CacheManager.CacheManagerAction
            public boolean preCheck() {
                ITileSource iTileSource = CacheManager.this.mTileSource;
                if (iTileSource instanceof OnlineTileSourceBase) {
                    if (((OnlineTileSourceBase) iTileSource).getTileSourcePolicy().acceptsBulkDownload()) {
                        return true;
                    }
                    throw new TileSourcePolicyException("This online tile source doesn't support bulk download");
                }
                return false;
            }

            @Override // org.osmdroid.tileprovider.cachemanager.CacheManager.CacheManagerAction
            public boolean tileAction(long j) {
                CacheManager cacheManager = CacheManager.this;
                return !cacheManager.loadTile((OnlineTileSourceBase) cacheManager.mTileSource, j);
            }
        };
    }

    public CacheManagerDialog getDownloadingDialog(final Context context, CacheManagerTask cacheManagerTask) {
        return new CacheManagerDialog(context, cacheManagerTask) { // from class: org.osmdroid.tileprovider.cachemanager.CacheManager.1
            @Override // org.osmdroid.tileprovider.cachemanager.CacheManager.CacheManagerDialog
            public String getUITitle() {
                return "Downloading tiles";
            }

            @Override // org.osmdroid.tileprovider.cachemanager.CacheManager.CacheManagerDialog, org.osmdroid.tileprovider.cachemanager.CacheManager.CacheManagerCallback
            public void onTaskFailed(int i) {
                super.onTaskFailed(i);
                Context context2 = context;
                Toast.makeText(context2, "Loading completed with " + i + " errors.", 0).show();
            }
        };
    }

    public int getPendingJobs() {
        return this.mPendingTasks.size();
    }

    public boolean getVerifyCancel() {
        return this.verifyCancel;
    }

    public boolean isTileToBeDownloaded(ITileSource iTileSource, long j) {
        Long expirationTimestamp = this.mTileWriter.getExpirationTimestamp(iTileSource, j);
        return expirationTimestamp == null || System.currentTimeMillis() > expirationTimestamp.longValue();
    }

    public boolean loadTile(OnlineTileSourceBase onlineTileSourceBase, long j) {
        if (getFileName(onlineTileSourceBase, j).exists() || this.mTileWriter.exists(onlineTileSourceBase, j)) {
            return true;
        }
        return forceLoadTile(onlineTileSourceBase, j);
    }

    public int possibleTilesCovered(ArrayList<GeoPoint> arrayList, int i, int i2) {
        return getTilesCoverage(arrayList, i, i2).size();
    }

    public int possibleTilesInArea(BoundingBox boundingBox, int i, int i2) {
        return getTilesCoverageIterable(boundingBox, i, i2).size();
    }

    public void setTileDownloader(TileDownloader tileDownloader) {
        this.mTileDownloader = tileDownloader;
    }

    public void setVerifyCancel(boolean z) {
        this.verifyCancel = z;
    }
}
