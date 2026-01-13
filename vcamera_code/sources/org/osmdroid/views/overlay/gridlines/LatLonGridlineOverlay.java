package org.osmdroid.views.overlay.gridlines;

import android.content.Context;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import org.osmdroid.util.BoundingBox;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.FolderOverlay;
import org.osmdroid.views.overlay.Marker;
import org.osmdroid.views.overlay.Polyline;
@Deprecated
/* loaded from: classes3.dex */
public class LatLonGridlineOverlay {
    public static final DecimalFormat df = new DecimalFormat("#.#####");
    public static int lineColor = -16777216;
    public static int fontColor = -1;
    public static short fontSizeDp = 24;
    public static int backgroundColor = -16777216;
    public static float lineWidth = 1.0f;
    public static boolean DEBUG = false;
    public static boolean DEBUG2 = false;
    private static float multiplier = 1.0f;

    private static void applyMarkerAttributes(Marker marker) {
        marker.setTextLabelBackgroundColor(backgroundColor);
        marker.setTextLabelFontSize(fontSizeDp);
        marker.setTextLabelForegroundColor(fontColor);
    }

    private static double getIncrementor(int i) {
        double d;
        switch (i) {
            case 0:
            case 1:
                d = 30.0d;
                break;
            case 2:
                d = 15.0d;
                break;
            case 3:
                d = 9.0d;
                break;
            case 4:
                d = 6.0d;
                break;
            case 5:
                d = 3.0d;
                break;
            case 6:
                d = 2.0d;
                break;
            case 7:
                d = 1.0d;
                break;
            case 8:
                d = 0.5d;
                break;
            case 9:
                d = 0.25d;
                break;
            case 10:
                d = 0.1d;
                break;
            case 11:
                d = 0.05d;
                break;
            case 12:
                d = 0.025d;
                break;
            case 13:
                d = 0.0125d;
                break;
            case 14:
                d = 0.00625d;
                break;
            case 15:
                d = 0.003125d;
                break;
            case 16:
                d = 0.0015625d;
                break;
            case 17:
                d = 7.8125E-4d;
                break;
            case 18:
                d = 3.90625E-4d;
                break;
            case 19:
                d = 1.953125E-4d;
                break;
            case 20:
                d = 9.765625E-5d;
                break;
            case 21:
                d = 4.8828125E-5d;
                break;
            default:
                d = 2.44140625E-5d;
                break;
        }
        return multiplier * d;
    }

    public static FolderOverlay getLatLonGrid(Context context, MapView mapView) {
        boolean z;
        double d;
        double d2;
        double d3;
        double d4;
        String str;
        MapView mapView2 = mapView;
        BoundingBox boundingBox = mapView.getBoundingBox();
        int zoomLevel = mapView.getZoomLevel();
        if (DEBUG) {
            System.out.println("######### getLatLonGrid ");
        }
        FolderOverlay folderOverlay = new FolderOverlay();
        if (zoomLevel >= 2) {
            double latNorth = boundingBox.getLatNorth();
            double latSouth = boundingBox.getLatSouth();
            double lonEast = boundingBox.getLonEast();
            double lonWest = boundingBox.getLonWest();
            if (latNorth < latSouth) {
                return folderOverlay;
            }
            if (DEBUG) {
                PrintStream printStream = System.out;
                printStream.println("N " + latNorth + " S " + latSouth + ", 0.0");
            }
            boolean z2 = lonEast < 0.0d && lonWest > 0.0d;
            if (DEBUG) {
                System.out.println("delta 0.0");
            }
            double incrementor = getIncrementor(zoomLevel);
            double[] startEndPointsNS = getStartEndPointsNS(latNorth, latSouth, zoomLevel);
            double d5 = startEndPointsNS[0];
            double d6 = startEndPointsNS[1];
            double d7 = d5;
            while (true) {
                z = z2;
                d = latSouth;
                d2 = latNorth;
                if (d7 > d6) {
                    break;
                }
                Polyline polyline = new Polyline();
                double d8 = incrementor;
                polyline.getOutlinePaint().setStrokeWidth(lineWidth);
                polyline.getOutlinePaint().setColor(lineColor);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new GeoPoint(d7, lonEast));
                arrayList.add(new GeoPoint(d7, lonWest));
                if (DEBUG) {
                    PrintStream printStream2 = System.out;
                    printStream2.println("drawing NS " + d7 + "," + lonEast + " to " + d7 + "," + lonWest + ", zoom " + zoomLevel);
                }
                polyline.setPoints(arrayList);
                folderOverlay.add(polyline);
                Marker marker = new Marker(mapView);
                applyMarkerAttributes(marker);
                StringBuilder sb = new StringBuilder();
                sb.append(df.format(d7));
                sb.append(d7 > 0.0d ? "N" : "S");
                String sb2 = sb.toString();
                marker.setTitle(sb2);
                marker.setTextIcon(sb2);
                marker.setPosition(new GeoPoint(d7, lonWest + d8));
                folderOverlay.add(marker);
                d7 += d8;
                mapView2 = mapView;
                z2 = z;
                latSouth = d;
                latNorth = d2;
                incrementor = d8;
            }
            double d9 = incrementor;
            MapView mapView3 = mapView2;
            double[] startEndPointsWE = getStartEndPointsWE(lonWest, lonEast, zoomLevel);
            double d10 = startEndPointsWE[1];
            double d11 = startEndPointsWE[0];
            double d12 = d10;
            while (d12 <= d11) {
                Polyline polyline2 = new Polyline();
                polyline2.getOutlinePaint().setStrokeWidth(lineWidth);
                polyline2.getOutlinePaint().setColor(lineColor);
                ArrayList arrayList2 = new ArrayList();
                double d13 = d11;
                double d14 = d2;
                arrayList2.add(new GeoPoint(d14, d12));
                double d15 = d10;
                double d16 = d;
                arrayList2.add(new GeoPoint(d16, d12));
                polyline2.setPoints(arrayList2);
                if (DEBUG) {
                    PrintStream printStream3 = System.err;
                    StringBuilder sb3 = new StringBuilder();
                    str = "W";
                    sb3.append("drawing EW ");
                    sb3.append(d16);
                    sb3.append(",");
                    sb3.append(d12);
                    sb3.append(" to ");
                    sb3.append(d14);
                    sb3.append(",");
                    sb3.append(d12);
                    sb3.append(", zoom ");
                    sb3.append(zoomLevel);
                    printStream3.println(sb3.toString());
                } else {
                    str = "W";
                }
                folderOverlay.add(polyline2);
                Marker marker2 = new Marker(mapView3);
                applyMarkerAttributes(marker2);
                marker2.setRotation(-90.0f);
                StringBuilder sb4 = new StringBuilder();
                sb4.append(df.format(d12));
                sb4.append(d12 > 0.0d ? "E" : str);
                String sb5 = sb4.toString();
                marker2.setTitle(sb5);
                marker2.setTextIcon(sb5);
                marker2.setPosition(new GeoPoint(d16 + d9, d12));
                folderOverlay.add(marker2);
                d12 += d9;
                d = d16;
                d10 = d15;
                d2 = d14;
                d11 = d13;
            }
            double d17 = d11;
            double d18 = d2;
            double d19 = d10;
            double d20 = d;
            if (z) {
                if (DEBUG) {
                    PrintStream printStream4 = System.out;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("DATELINE zoom ");
                    sb6.append(zoomLevel);
                    sb6.append(" ");
                    sb6.append(d19);
                    sb6.append(" ");
                    d3 = d17;
                    sb6.append(d3);
                    printStream4.println(sb6.toString());
                } else {
                    d3 = d17;
                }
                double d21 = d19;
                while (d21 <= 180.0d) {
                    Polyline polyline3 = new Polyline();
                    polyline3.getOutlinePaint().setStrokeWidth(lineWidth);
                    polyline3.getOutlinePaint().setColor(lineColor);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(new GeoPoint(d18, d21));
                    arrayList3.add(new GeoPoint(d20, d21));
                    polyline3.setPoints(arrayList3);
                    if (DEBUG2) {
                        PrintStream printStream5 = System.out;
                        StringBuilder sb7 = new StringBuilder();
                        d4 = d3;
                        sb7.append("DATELINE drawing NS");
                        sb7.append(d20);
                        sb7.append(",");
                        sb7.append(d21);
                        sb7.append(" to ");
                        sb7.append(d18);
                        sb7.append(",");
                        sb7.append(d21);
                        sb7.append(", zoom ");
                        sb7.append(zoomLevel);
                        printStream5.println(sb7.toString());
                    } else {
                        d4 = d3;
                    }
                    folderOverlay.add(polyline3);
                    d21 += d9;
                    d3 = d4;
                }
                double d22 = d3;
                double d23 = -180.0d;
                while (d23 <= d22) {
                    Polyline polyline4 = new Polyline();
                    polyline4.getOutlinePaint().setStrokeWidth(lineWidth);
                    polyline4.getOutlinePaint().setColor(lineColor);
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new GeoPoint(d18, d23));
                    arrayList4.add(new GeoPoint(d20, d23));
                    polyline4.setPoints(arrayList4);
                    if (DEBUG2) {
                        PrintStream printStream6 = System.out;
                        printStream6.println("DATELINE drawing EW" + d20 + "," + d23 + " to " + d18 + "," + d23 + ", zoom " + zoomLevel);
                    }
                    folderOverlay.add(polyline4);
                    Marker marker3 = new Marker(mapView);
                    applyMarkerAttributes(marker3);
                    marker3.setRotation(-90.0f);
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(df.format(d23));
                    sb8.append(d23 > 0.0d ? "E" : "W");
                    String sb9 = sb8.toString();
                    marker3.setTitle(sb9);
                    marker3.setTextIcon(sb9);
                    marker3.setPosition(new GeoPoint(d20 + d9, d23));
                    folderOverlay.add(marker3);
                    d23 += d9;
                }
                double d24 = d19;
                while (d24 < 180.0d) {
                    Marker marker4 = new Marker(mapView);
                    applyMarkerAttributes(marker4);
                    marker4.setRotation(-90.0f);
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append(df.format(d24));
                    sb10.append(d24 > 0.0d ? "E" : "W");
                    String sb11 = sb10.toString();
                    marker4.setTitle(sb11);
                    marker4.setTextIcon(sb11);
                    marker4.setPosition(new GeoPoint(d20 + d9, d24));
                    folderOverlay.add(marker4);
                    d24 += d9;
                }
            }
        }
        return folderOverlay;
    }

    private static double[] getStartEndPointsNS(double d, double d2, int i) {
        if (i < 10) {
            double floor = Math.floor(d2);
            double incrementor = getIncrementor(i);
            double d3 = -90.0d;
            while (d3 < floor) {
                d3 += incrementor;
            }
            double d4 = 90.0d;
            while (d4 > Math.ceil(d)) {
                d4 -= incrementor;
            }
            return new double[]{d3 >= -90.0d ? d3 : -90.0d, d4 <= 90.0d ? d4 : 90.0d};
        }
        double d5 = d2 > 0.0d ? 0.0d : -90.0d;
        double d6 = d < 0.0d ? 0.0d : 90.0d;
        for (int i2 = 2; i2 <= i; i2++) {
            double incrementor2 = getIncrementor(i2);
            while (d5 < d2 - incrementor2) {
                d5 += incrementor2;
                if (DEBUG) {
                    System.out.println("south " + d5);
                }
            }
            while (d6 > d + incrementor2) {
                d6 -= incrementor2;
                if (DEBUG) {
                    System.out.println("north " + d6);
                }
            }
        }
        return new double[]{d5, d6};
    }

    private static double[] getStartEndPointsWE(double d, double d2, int i) {
        double incrementor = getIncrementor(i);
        if (i < 10) {
            double d3 = 180.0d;
            while (d3 > Math.floor(d)) {
                d3 -= incrementor;
            }
            double ceil = Math.ceil(d2);
            for (double d4 = -180.0d; d4 < ceil; d4 += incrementor) {
            }
            return new double[]{ceil <= 180.0d ? ceil : 180.0d, d3 >= -180.0d ? d3 : -180.0d};
        }
        double d5 = d > 0.0d ? 0.0d : -180.0d;
        double d6 = d2 < 0.0d ? 0.0d : 180.0d;
        for (int i2 = 2; i2 <= i; i2++) {
            double incrementor2 = getIncrementor(i2);
            while (d6 > d2 + incrementor2) {
                d6 -= incrementor2;
            }
            while (d5 < d - incrementor2) {
                d5 += incrementor2;
                if (DEBUG) {
                    System.out.println("west " + d5);
                }
            }
        }
        if (DEBUG) {
            System.out.println("return EW set as " + d5 + " " + d6);
        }
        return new double[]{d6, d5};
    }

    public static void setDefaults() {
        lineColor = -16777216;
        fontColor = -1;
        backgroundColor = -16777216;
        lineWidth = 1.0f;
        fontSizeDp = (short) 32;
        DEBUG = false;
        DEBUG2 = false;
    }
}
