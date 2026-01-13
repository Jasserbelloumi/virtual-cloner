package org.osmdroid.views.overlay;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import java.util.List;
import org.osmdroid.library.R;
import org.osmdroid.views.MapView;
import org.osmdroid.views.Projection;
import org.osmdroid.views.overlay.ItemizedIconOverlay;
import org.osmdroid.views.overlay.OverlayItem;
@Deprecated
/* loaded from: classes3.dex */
public class ItemizedOverlayWithFocus<Item extends OverlayItem> extends ItemizedIconOverlay<Item> {
    private final int DEFAULTMARKER_BACKGROUNDCOLOR;
    private int DESCRIPTION_BOX_CORNERWIDTH;
    private int DESCRIPTION_BOX_PADDING;
    private int DESCRIPTION_LINE_HEIGHT;
    private int DESCRIPTION_MAXWIDTH;
    private int DESCRIPTION_TITLE_EXTRA_LINE_HEIGHT;
    private int FONT_SIZE_DP;
    private String UNKNOWN;
    private int fontSizePixels;
    private Context mContext;
    public Paint mDescriptionPaint;
    public boolean mFocusItemsOnTap;
    public int mFocusedItemIndex;
    private final Point mFocusedScreenCoords;
    public Paint mMarkerBackgroundPaint;
    public int mMarkerFocusedBackgroundColor;
    public Drawable mMarkerFocusedBase;
    private final Rect mRect;
    public Paint mTitlePaint;

    public ItemizedOverlayWithFocus(Context context, List<Item> list, ItemizedIconOverlay.OnItemGestureListener<Item> onItemGestureListener) {
        this(list, onItemGestureListener, context);
    }

    public ItemizedOverlayWithFocus(List<Item> list, Drawable drawable, Drawable drawable2, int i, ItemizedIconOverlay.OnItemGestureListener<Item> onItemGestureListener, Context context) {
        super(list, drawable, onItemGestureListener, context);
        int rgb = Color.rgb(101, 185, 74);
        this.DEFAULTMARKER_BACKGROUNDCOLOR = rgb;
        this.DESCRIPTION_BOX_PADDING = 3;
        this.DESCRIPTION_BOX_CORNERWIDTH = 3;
        this.DESCRIPTION_TITLE_EXTRA_LINE_HEIGHT = 2;
        this.FONT_SIZE_DP = 14;
        this.DESCRIPTION_MAXWIDTH = 600;
        this.DESCRIPTION_LINE_HEIGHT = 30;
        this.mFocusedScreenCoords = new Point();
        this.mRect = new Rect();
        this.mContext = context;
        if (drawable2 == null) {
            this.mMarkerFocusedBase = boundToHotspot(context.getResources().getDrawable(R.drawable.marker_default_focused_base), OverlayItem.HotspotPlace.BOTTOM_CENTER);
        } else {
            this.mMarkerFocusedBase = drawable2;
        }
        this.mMarkerFocusedBackgroundColor = i == Integer.MIN_VALUE ? rgb : i;
        calculateDrawSettings();
        unSetFocusedItem();
    }

    public ItemizedOverlayWithFocus(List<Item> list, ItemizedIconOverlay.OnItemGestureListener<Item> onItemGestureListener, Context context) {
        this(list, context.getResources().getDrawable(R.drawable.marker_default), null, Integer.MIN_VALUE, onItemGestureListener, context);
    }

    private void calculateDrawSettings() {
        int applyDimension = (int) TypedValue.applyDimension(1, this.FONT_SIZE_DP, this.mContext.getResources().getDisplayMetrics());
        this.fontSizePixels = applyDimension;
        this.DESCRIPTION_LINE_HEIGHT = applyDimension + 5;
        this.DESCRIPTION_MAXWIDTH = (int) (this.mContext.getResources().getDisplayMetrics().widthPixels * 0.8d);
        this.UNKNOWN = this.mContext.getResources().getString(R.string.unknown);
        this.mMarkerBackgroundPaint = new Paint();
        Paint paint = new Paint();
        this.mDescriptionPaint = paint;
        paint.setAntiAlias(true);
        this.mDescriptionPaint.setTextSize(this.fontSizePixels);
        Paint paint2 = new Paint();
        this.mTitlePaint = paint2;
        paint2.setTextSize(this.fontSizePixels);
        this.mTitlePaint.setFakeBoldText(true);
        this.mTitlePaint.setAntiAlias(true);
    }

    @Override // org.osmdroid.views.overlay.ItemizedOverlay, org.osmdroid.views.overlay.Overlay
    public void draw(Canvas canvas, Projection projection) {
        List<Item> list;
        super.draw(canvas, projection);
        int i = this.mFocusedItemIndex;
        if (i == Integer.MIN_VALUE || (list = this.mItemList) == null) {
            return;
        }
        Item item = list.get(i);
        Drawable marker = item.getMarker(4);
        if (marker == null) {
            marker = this.mMarkerFocusedBase;
        }
        Drawable drawable = marker;
        projection.toPixels(item.getPoint(), this.mFocusedScreenCoords);
        drawable.copyBounds(this.mRect);
        Rect rect = this.mRect;
        Point point = this.mFocusedScreenCoords;
        rect.offset(point.x, point.y);
        String title = item.getTitle() == null ? this.UNKNOWN : item.getTitle();
        String snippet = item.getSnippet() == null ? this.UNKNOWN : item.getSnippet();
        int length = snippet.length();
        float[] fArr = new float[length];
        this.mDescriptionPaint.getTextWidths(snippet, fArr);
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i2 < length) {
            if (!Character.isLetter(snippet.charAt(i2))) {
                i6 = i2;
            }
            float f = fArr[i2];
            if (snippet.charAt(i2) == '\n') {
                int i7 = i2 + 1;
                sb.append(snippet.subSequence(i3, i7));
                i6 = i7;
                i4 = Math.max(i4, i5);
                i5 = 0;
                i3 = i6;
            } else {
                if (i5 + f > this.DESCRIPTION_MAXWIDTH) {
                    boolean z = i3 == i6;
                    if (!z) {
                        i2 = i6;
                    }
                    sb.append(snippet.subSequence(i3, i2));
                    sb.append('\n');
                    i4 = Math.max(i4, i5);
                    if (z) {
                        i3 = i2;
                        i6 = i3;
                        i5 = 0;
                        i2--;
                    } else {
                        i3 = i2;
                        i6 = i3;
                        i5 = 0;
                    }
                }
                i5 = (int) (i5 + f);
            }
            i2++;
        }
        if (i2 != i3) {
            String substring = snippet.substring(i3, i2);
            i4 = Math.max(i4, (int) this.mDescriptionPaint.measureText(substring));
            sb.append(substring);
        }
        String[] split = sb.toString().split("\n");
        int min = Math.min(Math.max(i4, (int) this.mDescriptionPaint.measureText(title)), this.DESCRIPTION_MAXWIDTH);
        Rect rect2 = this.mRect;
        int width = (rect2.width() / 2) + ((rect2.left - (min / 2)) - this.DESCRIPTION_BOX_PADDING);
        int i8 = this.DESCRIPTION_BOX_PADDING;
        int i9 = (i8 * 2) + min + width;
        int i10 = this.mRect.top;
        int length2 = ((i10 - this.DESCRIPTION_TITLE_EXTRA_LINE_HEIGHT) - ((split.length + 1) * this.DESCRIPTION_LINE_HEIGHT)) - (i8 * 2);
        if (projection.getOrientation() != 0.0f) {
            canvas.save();
            Point point2 = this.mFocusedScreenCoords;
            canvas.rotate(-projection.getOrientation(), point2.x, point2.y);
        }
        this.mMarkerBackgroundPaint.setColor(-16777216);
        RectF rectF = new RectF(width - 1, length2 - 1, i9 + 1, i10 + 1);
        int i11 = this.DESCRIPTION_BOX_CORNERWIDTH;
        canvas.drawRoundRect(rectF, i11, i11, this.mDescriptionPaint);
        this.mMarkerBackgroundPaint.setColor(this.mMarkerFocusedBackgroundColor);
        float f2 = width;
        float f3 = i9;
        RectF rectF2 = new RectF(f2, length2, f3, i10);
        int i12 = this.DESCRIPTION_BOX_CORNERWIDTH;
        canvas.drawRoundRect(rectF2, i12, i12, this.mMarkerBackgroundPaint);
        int i13 = this.DESCRIPTION_BOX_PADDING;
        int i14 = width + i13;
        int i15 = i10 - i13;
        for (int length3 = split.length - 1; length3 >= 0; length3--) {
            canvas.drawText(split[length3].trim(), i14, i15, this.mDescriptionPaint);
            i15 -= this.DESCRIPTION_LINE_HEIGHT;
        }
        canvas.drawText(title, i14, i15 - this.DESCRIPTION_TITLE_EXTRA_LINE_HEIGHT, this.mTitlePaint);
        float f4 = i15;
        canvas.drawLine(f2, f4, f3, f4, this.mDescriptionPaint);
        drawable.setBounds(this.mRect);
        drawable.draw(canvas);
        Rect rect3 = this.mRect;
        Point point3 = this.mFocusedScreenCoords;
        rect3.offset(-point3.x, -point3.y);
        drawable.setBounds(this.mRect);
        if (projection.getOrientation() != 0.0f) {
            canvas.restore();
        }
    }

    public Item getFocusedItem() {
        int i = this.mFocusedItemIndex;
        if (i == Integer.MIN_VALUE) {
            return null;
        }
        return this.mItemList.get(i);
    }

    @Override // org.osmdroid.views.overlay.ItemizedIconOverlay, org.osmdroid.views.overlay.ItemizedOverlay, org.osmdroid.views.overlay.Overlay
    public void onDetach(MapView mapView) {
        super.onDetach(mapView);
        this.mContext = null;
    }

    @Override // org.osmdroid.views.overlay.ItemizedIconOverlay
    public boolean onSingleTapUpHelper(int i, Item item, MapView mapView) {
        if (this.mFocusItemsOnTap) {
            this.mFocusedItemIndex = i;
            mapView.postInvalidate();
        }
        return this.mOnItemGestureListener.onItemSingleTapUp(i, item);
    }

    public void setDescriptionBoxCornerWidth(int i) {
        this.DESCRIPTION_BOX_CORNERWIDTH = i;
    }

    public void setDescriptionBoxPadding(int i) {
        this.DESCRIPTION_BOX_PADDING = i;
    }

    public void setDescriptionLineHeight(int i) {
        this.DESCRIPTION_LINE_HEIGHT = i;
        calculateDrawSettings();
    }

    public void setDescriptionMaxWidth(int i) {
        this.DESCRIPTION_MAXWIDTH = i;
        calculateDrawSettings();
    }

    public void setDescriptionTitleExtraLineHeight(int i) {
        this.DESCRIPTION_TITLE_EXTRA_LINE_HEIGHT = i;
    }

    public void setFocusItemsOnTap(boolean z) {
        this.mFocusItemsOnTap = z;
    }

    public void setFocusedItem(int i) {
        this.mFocusedItemIndex = i;
    }

    public void setFocusedItem(Item item) {
        int indexOf = this.mItemList.indexOf(item);
        if (indexOf < 0) {
            throw new IllegalArgumentException();
        }
        setFocusedItem(indexOf);
    }

    public void setFontSize(int i) {
        this.FONT_SIZE_DP = i;
        calculateDrawSettings();
    }

    public void setMarkerBackgroundColor(int i) {
        this.mMarkerFocusedBackgroundColor = i;
    }

    public void setMarkerDescriptionForegroundColor(int i) {
        this.mDescriptionPaint.setColor(i);
    }

    public void setMarkerTitleForegroundColor(int i) {
        this.mTitlePaint.setColor(i);
    }

    public void unSetFocusedItem() {
        this.mFocusedItemIndex = Integer.MIN_VALUE;
    }
}
