package com.google.android.material.transition.platform;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.transition.Transition;
import android.view.View;
import android.view.Window;
import com.google.android.material.R;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o00oooOo.oOO000;
import o00oooOo.oOO0000;
@o0OOooO0(21)
/* loaded from: classes2.dex */
public class MaterialContainerTransformSharedElementCallback extends SharedElementCallback {
    @o0OO00OO
    private static WeakReference<View> capturedSharedElement;
    @o0OO00OO
    private Rect returnEndBounds;
    private boolean entering = true;
    private boolean transparentWindowBackgroundEnabled = true;
    private boolean sharedElementReenterTransitionEnabled = false;
    @o0OO00OO
    private ShapeProvider shapeProvider = new ShapeableViewShapeProvider();

    /* loaded from: classes2.dex */
    public interface ShapeProvider {
        @o0OO00OO
        ShapeAppearanceModel provideShape(@oo0oO0 View view);
    }

    /* loaded from: classes2.dex */
    public static class ShapeableViewShapeProvider implements ShapeProvider {
        @Override // com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.ShapeProvider
        @o0OO00OO
        public ShapeAppearanceModel provideShape(@oo0oO0 View view) {
            if (view instanceof Shapeable) {
                return ((Shapeable) view).getShapeAppearanceModel();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void removeWindowBackground(Window window) {
        window.getDecorView().getBackground().mutate().setColorFilter(oOO0000.o00oOOo0(0, oOO000.CLEAR));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void restoreWindowBackground(Window window) {
        window.getDecorView().getBackground().mutate().clearColorFilter();
    }

    private void setUpEnterTransform(final Window window) {
        Transition sharedElementEnterTransition = window.getSharedElementEnterTransition();
        if (sharedElementEnterTransition instanceof MaterialContainerTransform) {
            MaterialContainerTransform materialContainerTransform = (MaterialContainerTransform) sharedElementEnterTransition;
            if (!this.sharedElementReenterTransitionEnabled) {
                window.setSharedElementReenterTransition(null);
            }
            if (this.transparentWindowBackgroundEnabled) {
                updateBackgroundFadeDuration(window, materialContainerTransform);
                materialContainerTransform.addListener(new TransitionListenerAdapter() { // from class: com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.1
                    @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
                    public void onTransitionEnd(Transition transition) {
                        MaterialContainerTransformSharedElementCallback.restoreWindowBackground(window);
                    }

                    @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
                    public void onTransitionStart(Transition transition) {
                        MaterialContainerTransformSharedElementCallback.removeWindowBackground(window);
                    }
                });
            }
        }
    }

    private void setUpReturnTransform(final Activity activity, final Window window) {
        Transition sharedElementReturnTransition = window.getSharedElementReturnTransition();
        if (sharedElementReturnTransition instanceof MaterialContainerTransform) {
            MaterialContainerTransform materialContainerTransform = (MaterialContainerTransform) sharedElementReturnTransition;
            materialContainerTransform.setHoldAtEndEnabled(true);
            materialContainerTransform.addListener(new TransitionListenerAdapter() { // from class: com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.2
                @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
                public void onTransitionEnd(Transition transition) {
                    View view;
                    if (MaterialContainerTransformSharedElementCallback.capturedSharedElement != null && (view = (View) MaterialContainerTransformSharedElementCallback.capturedSharedElement.get()) != null) {
                        view.setAlpha(1.0f);
                        WeakReference unused = MaterialContainerTransformSharedElementCallback.capturedSharedElement = null;
                    }
                    activity.finish();
                    activity.overridePendingTransition(0, 0);
                }
            });
            if (this.transparentWindowBackgroundEnabled) {
                updateBackgroundFadeDuration(window, materialContainerTransform);
                materialContainerTransform.addListener(new TransitionListenerAdapter() { // from class: com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.3
                    @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
                    public void onTransitionStart(Transition transition) {
                        MaterialContainerTransformSharedElementCallback.removeWindowBackground(window);
                    }
                });
            }
        }
    }

    private static void updateBackgroundFadeDuration(Window window, MaterialContainerTransform materialContainerTransform) {
        window.setTransitionBackgroundFadeDuration(materialContainerTransform.getDuration());
    }

    @o0OO00OO
    public ShapeProvider getShapeProvider() {
        return this.shapeProvider;
    }

    public boolean isSharedElementReenterTransitionEnabled() {
        return this.sharedElementReenterTransitionEnabled;
    }

    public boolean isTransparentWindowBackgroundEnabled() {
        return this.transparentWindowBackgroundEnabled;
    }

    @Override // android.app.SharedElementCallback
    @o0OO00OO
    public Parcelable onCaptureSharedElementSnapshot(@oo0oO0 View view, @oo0oO0 Matrix matrix, @oo0oO0 RectF rectF) {
        capturedSharedElement = new WeakReference<>(view);
        return super.onCaptureSharedElementSnapshot(view, matrix, rectF);
    }

    @Override // android.app.SharedElementCallback
    @o0OO00OO
    public View onCreateSnapshotView(@oo0oO0 Context context, @o0OO00OO Parcelable parcelable) {
        WeakReference<View> weakReference;
        View view;
        ShapeAppearanceModel provideShape;
        View onCreateSnapshotView = super.onCreateSnapshotView(context, parcelable);
        if (onCreateSnapshotView != null && (weakReference = capturedSharedElement) != null && this.shapeProvider != null && (view = weakReference.get()) != null && (provideShape = this.shapeProvider.provideShape(view)) != null) {
            onCreateSnapshotView.setTag(R.id.mtrl_motion_snapshot_view, provideShape);
        }
        return onCreateSnapshotView;
    }

    @Override // android.app.SharedElementCallback
    public void onMapSharedElements(@oo0oO0 List<String> list, @oo0oO0 Map<String, View> map) {
        View view;
        Activity activity;
        if (list.isEmpty() || map.isEmpty() || (view = map.get(list.get(0))) == null || (activity = ContextUtils.getActivity(view.getContext())) == null) {
            return;
        }
        Window window = activity.getWindow();
        if (this.entering) {
            setUpEnterTransform(window);
        } else {
            setUpReturnTransform(activity, window);
        }
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementEnd(@oo0oO0 List<String> list, @oo0oO0 List<View> list2, @oo0oO0 List<View> list3) {
        if (!list2.isEmpty()) {
            int i = R.id.mtrl_motion_snapshot_view;
            if (list2.get(0).getTag(i) instanceof View) {
                list2.get(0).setTag(i, null);
            }
        }
        if (!this.entering && !list2.isEmpty()) {
            this.returnEndBounds = TransitionUtils.getRelativeBoundsRect(list2.get(0));
        }
        this.entering = false;
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementStart(@oo0oO0 List<String> list, @oo0oO0 List<View> list2, @oo0oO0 List<View> list3) {
        if (!list2.isEmpty() && !list3.isEmpty()) {
            list2.get(0).setTag(R.id.mtrl_motion_snapshot_view, list3.get(0));
        }
        if (this.entering || list2.isEmpty() || this.returnEndBounds == null) {
            return;
        }
        View view = list2.get(0);
        view.measure(View.MeasureSpec.makeMeasureSpec(this.returnEndBounds.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.returnEndBounds.height(), 1073741824));
        Rect rect = this.returnEndBounds;
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void setShapeProvider(@o0OO00OO ShapeProvider shapeProvider) {
        this.shapeProvider = shapeProvider;
    }

    public void setSharedElementReenterTransitionEnabled(boolean z) {
        this.sharedElementReenterTransitionEnabled = z;
    }

    public void setTransparentWindowBackgroundEnabled(boolean z) {
        this.transparentWindowBackgroundEnabled = z;
    }
}
