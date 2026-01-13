package com.google.android.exoplayer2.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.o00oOo0O;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.trackselection.TrackSelectionOverride;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOO0OO;
/* loaded from: classes.dex */
public final class TrackSelectionDialogBuilder {
    private boolean allowAdaptiveSelections;
    private boolean allowMultipleOverrides;
    private final DialogCallback callback;
    private final Context context;
    private boolean isDisabled;
    private Map<TrackGroup, TrackSelectionOverride> overrides;
    private boolean showDisableOption;
    @o0OOO0OO
    private int themeResId;
    private final CharSequence title;
    @o0OO00OO
    private Comparator<Format> trackFormatComparator;
    private final List<Tracks.Group> trackGroups;
    @o0OO00OO
    private TrackNameProvider trackNameProvider;

    /* loaded from: classes.dex */
    public interface DialogCallback {
        void onTracksSelected(boolean z, Map<TrackGroup, TrackSelectionOverride> map);
    }

    public TrackSelectionDialogBuilder(Context context, CharSequence charSequence, final Player player, final int i) {
        this.context = context;
        this.title = charSequence;
        ImmutableList<Tracks.Group> groups = player.getCurrentTracks().getGroups();
        this.trackGroups = new ArrayList();
        for (int i2 = 0; i2 < groups.size(); i2++) {
            Tracks.Group group = groups.get(i2);
            if (group.getType() == i) {
                this.trackGroups.add(group);
            }
        }
        this.overrides = Collections.emptyMap();
        this.callback = new DialogCallback() { // from class: com.google.android.exoplayer2.ui.o0O00oO0
            @Override // com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder.DialogCallback
            public final void onTracksSelected(boolean z, Map map) {
                TrackSelectionDialogBuilder.lambda$new$0(Player.this, i, z, map);
            }
        };
    }

    public TrackSelectionDialogBuilder(Context context, CharSequence charSequence, List<Tracks.Group> list, DialogCallback dialogCallback) {
        this.context = context;
        this.title = charSequence;
        this.trackGroups = ImmutableList.copyOf((Collection) list);
        this.callback = dialogCallback;
        this.overrides = Collections.emptyMap();
    }

    @o0OO00OO
    private Dialog buildForAndroidX() {
        try {
            Class cls = Integer.TYPE;
            Object newInstance = o00oOo0O.o00oOOo0.class.getConstructor(Context.class, cls).newInstance(this.context, Integer.valueOf(this.themeResId));
            View inflate = LayoutInflater.from((Context) o00oOo0O.o00oOOo0.class.getMethod("getContext", new Class[0]).invoke(newInstance, new Object[0])).inflate(R.layout.exo_track_selection_dialog, (ViewGroup) null);
            DialogInterface.OnClickListener upDialogView = setUpDialogView(inflate);
            o00oOo0O.o00oOOo0.class.getMethod("setTitle", CharSequence.class).invoke(newInstance, this.title);
            o00oOo0O.o00oOOo0.class.getMethod("setView", View.class).invoke(newInstance, inflate);
            o00oOo0O.o00oOOo0.class.getMethod("setPositiveButton", cls, DialogInterface.OnClickListener.class).invoke(newInstance, 17039370, upDialogView);
            o00oOo0O.o00oOOo0.class.getMethod("setNegativeButton", cls, DialogInterface.OnClickListener.class).invoke(newInstance, 17039360, null);
            return (Dialog) o00oOo0O.o00oOOo0.class.getMethod("create", new Class[0]).invoke(newInstance, new Object[0]);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    private Dialog buildForPlatform() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.context, this.themeResId);
        View inflate = LayoutInflater.from(builder.getContext()).inflate(R.layout.exo_track_selection_dialog, (ViewGroup) null);
        return builder.setTitle(this.title).setView(inflate).setPositiveButton(17039370, setUpDialogView(inflate)).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(Player player, int i, boolean z, Map map) {
        TrackSelectionParameters.Builder buildUpon = player.getTrackSelectionParameters().buildUpon();
        buildUpon.setTrackTypeDisabled(i, z);
        buildUpon.clearOverridesOfType(i);
        for (TrackSelectionOverride trackSelectionOverride : map.values()) {
            buildUpon.addOverride(trackSelectionOverride);
        }
        player.setTrackSelectionParameters(buildUpon.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setUpDialogView$1(TrackSelectionView trackSelectionView, DialogInterface dialogInterface, int i) {
        this.callback.onTracksSelected(trackSelectionView.getIsDisabled(), trackSelectionView.getOverrides());
    }

    private DialogInterface.OnClickListener setUpDialogView(View view) {
        final TrackSelectionView trackSelectionView = (TrackSelectionView) view.findViewById(R.id.exo_track_selection_view);
        trackSelectionView.setAllowMultipleOverrides(this.allowMultipleOverrides);
        trackSelectionView.setAllowAdaptiveSelections(this.allowAdaptiveSelections);
        trackSelectionView.setShowDisableOption(this.showDisableOption);
        TrackNameProvider trackNameProvider = this.trackNameProvider;
        if (trackNameProvider != null) {
            trackSelectionView.setTrackNameProvider(trackNameProvider);
        }
        trackSelectionView.init(this.trackGroups, this.isDisabled, this.overrides, this.trackFormatComparator, null);
        return new DialogInterface.OnClickListener() { // from class: com.google.android.exoplayer2.ui.o0O00o00
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                TrackSelectionDialogBuilder.this.lambda$setUpDialogView$1(trackSelectionView, dialogInterface, i);
            }
        };
    }

    public Dialog build() {
        Dialog buildForAndroidX = buildForAndroidX();
        return buildForAndroidX == null ? buildForPlatform() : buildForAndroidX;
    }

    public TrackSelectionDialogBuilder setAllowAdaptiveSelections(boolean z) {
        this.allowAdaptiveSelections = z;
        return this;
    }

    public TrackSelectionDialogBuilder setAllowMultipleOverrides(boolean z) {
        this.allowMultipleOverrides = z;
        return this;
    }

    public TrackSelectionDialogBuilder setIsDisabled(boolean z) {
        this.isDisabled = z;
        return this;
    }

    public TrackSelectionDialogBuilder setOverride(@o0OO00OO TrackSelectionOverride trackSelectionOverride) {
        return setOverrides(trackSelectionOverride == null ? Collections.emptyMap() : ImmutableMap.of(trackSelectionOverride.mediaTrackGroup, trackSelectionOverride));
    }

    public TrackSelectionDialogBuilder setOverrides(Map<TrackGroup, TrackSelectionOverride> map) {
        this.overrides = map;
        return this;
    }

    public TrackSelectionDialogBuilder setShowDisableOption(boolean z) {
        this.showDisableOption = z;
        return this;
    }

    public TrackSelectionDialogBuilder setTheme(@o0OOO0OO int i) {
        this.themeResId = i;
        return this;
    }

    public void setTrackFormatComparator(@o0OO00OO Comparator<Format> comparator) {
        this.trackFormatComparator = comparator;
    }

    public TrackSelectionDialogBuilder setTrackNameProvider(@o0OO00OO TrackNameProvider trackNameProvider) {
        this.trackNameProvider = trackNameProvider;
        return this;
    }
}
