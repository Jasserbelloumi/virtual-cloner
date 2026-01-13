package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* renamed from: o0O00o0o  reason: collision with root package name */
    public static final String f3753o0O00o0o = "SeekBarPreference";

    /* renamed from: o0O00O  reason: collision with root package name */
    public int f3754o0O00O;

    /* renamed from: o0O00O0  reason: collision with root package name */
    public int f3755o0O00O0;

    /* renamed from: o0O00O0o  reason: collision with root package name */
    public int f3756o0O00O0o;

    /* renamed from: o0O00OO  reason: collision with root package name */
    public boolean f3757o0O00OO;

    /* renamed from: o0O00OOO  reason: collision with root package name */
    public SeekBar f3758o0O00OOO;

    /* renamed from: o0O00Oo  reason: collision with root package name */
    public TextView f3759o0O00Oo;

    /* renamed from: o0O00OoO  reason: collision with root package name */
    public boolean f3760o0O00OoO;

    /* renamed from: o0O00Ooo  reason: collision with root package name */
    public boolean f3761o0O00Ooo;

    /* renamed from: o0O00o00  reason: collision with root package name */
    public final SeekBar.OnSeekBarChangeListener f3762o0O00o00;

    /* renamed from: o0O00o0O  reason: collision with root package name */
    public final View.OnKeyListener f3763o0O00o0O;

    /* renamed from: o0OoO00O  reason: collision with root package name */
    public int f3764o0OoO00O;

    /* renamed from: o0oO0Ooo  reason: collision with root package name */
    public boolean f3765o0oO0Ooo;

    /* loaded from: classes.dex */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new o00oOOo0();

        /* renamed from: o00oo0O  reason: collision with root package name */
        public int f3766o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public int f3767o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public int f3768o00oo0Oo;

        /* loaded from: classes.dex */
        public class o00oOOo0 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: o00oOOo0 */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: o00oOOoO */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f3767o00oo0O0 = parcel.readInt();
            this.f3766o00oo0O = parcel.readInt();
            this.f3768o00oo0Oo = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3767o00oo0O0);
            parcel.writeInt(this.f3766o00oo0O);
            parcel.writeInt(this.f3768o00oo0Oo);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOo0 implements SeekBar.OnSeekBarChangeListener {
        public o00oOOo0() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.f3761o0O00Ooo || !seekBarPreference.f3757o0O00OO) {
                    seekBarPreference.o0O0oOo(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.o0O0oOoO(i + seekBarPreference2.f3764o0OoO00O);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f3757o0O00OO = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f3757o0O00OO = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.f3764o0OoO00O != seekBarPreference.f3755o0O00O0) {
                seekBarPreference.o0O0oOo(seekBar);
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements View.OnKeyListener {
        public o00oOOoO() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SeekBar seekBar;
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.f3765o0oO0Ooo && (i == 21 || i == 22)) || i == 23 || i == 66 || (seekBar = seekBarPreference.f3758o0O00OOO) == null) {
                return false;
            }
            return seekBar.onKeyDown(i, keyEvent);
        }
    }

    public SeekBarPreference(@oo0oO0 Context context) {
        this(context, null);
    }

    public SeekBarPreference(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarPreferenceStyle, 0);
    }

    public SeekBarPreference(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SeekBarPreference(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3762o0O00o00 = new o00oOOo0();
        this.f3763o0O00o0O = new o00oOOoO();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SeekBarPreference, i, i2);
        this.f3764o0OoO00O = obtainStyledAttributes.getInt(R.styleable.SeekBarPreference_min, 0);
        o0O0oO(obtainStyledAttributes.getInt(R.styleable.SeekBarPreference_android_max, 100));
        o0O0oOO(obtainStyledAttributes.getInt(R.styleable.SeekBarPreference_seekBarIncrement, 0));
        this.f3765o0oO0Ooo = obtainStyledAttributes.getBoolean(R.styleable.SeekBarPreference_adjustable, true);
        this.f3760o0O00OoO = obtainStyledAttributes.getBoolean(R.styleable.SeekBarPreference_showSeekBarValue, false);
        this.f3761o0O00Ooo = obtainStyledAttributes.getBoolean(R.styleable.SeekBarPreference_updatesContinuously, false);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    @o0OO00OO
    public Object o0O00(@oo0oO0 TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    @Override // androidx.preference.Preference
    public void o0O000o0(@oo0oO0 o0O000Oo o0o000oo) {
        super.o0O000o0(o0o000oo);
        o0o000oo.itemView.setOnKeyListener(this.f3763o0O00o0O);
        this.f3758o0O00OOO = (SeekBar) o0o000oo.o00oOOoO(R.id.seekbar);
        TextView textView = (TextView) o0o000oo.o00oOOoO(R.id.seekbar_value);
        this.f3759o0O00Oo = textView;
        if (this.f3760o0O00OoO) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.f3759o0O00Oo = null;
        }
        SeekBar seekBar = this.f3758o0O00OOO;
        if (seekBar == null) {
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.f3762o0O00o00);
        this.f3758o0O00OOO.setMax(this.f3756o0O00O0o - this.f3764o0OoO00O);
        int i = this.f3754o0O00O;
        if (i != 0) {
            this.f3758o0O00OOO.setKeyProgressIncrement(i);
        } else {
            this.f3754o0O00O = this.f3758o0O00OOO.getKeyProgressIncrement();
        }
        this.f3758o0O00OOO.setProgress(this.f3755o0O00O0 - this.f3764o0OoO00O);
        o0O0oOoO(this.f3755o0O00O0);
        this.f3758o0O00OOO.setEnabled(o00oooo0());
    }

    @Override // androidx.preference.Preference
    public void o0O00O(@o0OO00OO Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.o0O00O(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.o0O00O(savedState.getSuperState());
        this.f3755o0O00O0 = savedState.f3767o00oo0O0;
        this.f3764o0OoO00O = savedState.f3766o00oo0O;
        this.f3756o0O00O0o = savedState.f3768o00oo0Oo;
        o0O0000o();
    }

    @Override // androidx.preference.Preference
    @o0OO00OO
    public Parcelable o0O00OO() {
        this.f3735o0OoOoOO = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (o00ooooO()) {
            return absSavedState;
        }
        SavedState savedState = new SavedState(absSavedState);
        savedState.f3767o00oo0O0 = this.f3755o0O00O0;
        savedState.f3766o00oo0O = this.f3764o0OoO00O;
        savedState.f3768o00oo0Oo = this.f3756o0O00O0o;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public void o0O00OOO(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        o0O0oOo0(o00ooOO0(((Integer) obj).intValue()));
    }

    public int o0O0o0oO() {
        return this.f3764o0OoO00O;
    }

    public final int o0O0o0oo() {
        return this.f3754o0O00O;
    }

    public final void o0O0oO(int i) {
        int i2 = this.f3764o0OoO00O;
        if (i < i2) {
            i = i2;
        }
        if (i != this.f3756o0O00O0o) {
            this.f3756o0O00O0o = i;
            o0O0000o();
        }
    }

    public int o0O0oO0() {
        return this.f3755o0O00O0;
    }

    public boolean o0O0oO0O() {
        return this.f3765o0oO0Ooo;
    }

    public void o0O0oO0o(boolean z) {
        this.f3765o0oO0Ooo = z;
    }

    public final void o0O0oOO(int i) {
        if (i != this.f3754o0O00O) {
            this.f3754o0O00O = Math.min(this.f3756o0O00O0o - this.f3764o0OoO00O, Math.abs(i));
            o0O0000o();
        }
    }

    public void o0O0oOO0(int i) {
        int i2 = this.f3756o0O00O0o;
        if (i > i2) {
            i = i2;
        }
        if (i != this.f3764o0OoO00O) {
            this.f3764o0OoO00O = i;
            o0O0000o();
        }
    }

    public void o0O0oOOO(boolean z) {
        this.f3761o0O00Ooo = z;
    }

    public void o0O0oOo(@oo0oO0 SeekBar seekBar) {
        int progress = seekBar.getProgress() + this.f3764o0OoO00O;
        if (progress != this.f3755o0O00O0) {
            if (o00oOooO(Integer.valueOf(progress))) {
                oo0oOOo(progress, false);
                return;
            }
            seekBar.setProgress(this.f3755o0O00O0 - this.f3764o0OoO00O);
            o0O0oOoO(this.f3755o0O00O0);
        }
    }

    public void o0O0oOo0(int i) {
        oo0oOOo(i, true);
    }

    public void o0O0oOoO(int i) {
        TextView textView = this.f3759o0O00Oo;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }

    public void o0O0oo00(boolean z) {
        this.f3760o0O00OoO = z;
        o0O0000o();
    }

    public boolean o0O0oo0O() {
        return this.f3760o0O00OoO;
    }

    public int o0oOo0O0() {
        return this.f3756o0O00O0o;
    }

    public final void oo0oOOo(int i, boolean z) {
        int i2 = this.f3764o0OoO00O;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.f3756o0O00O0o;
        if (i > i3) {
            i = i3;
        }
        if (i != this.f3755o0O00O0) {
            this.f3755o0O00O0 = i;
            o0O0oOoO(i);
            o0O00o0o(i);
            if (z) {
                o0O0000o();
            }
        }
    }

    public boolean oooOO0() {
        return this.f3761o0O00Ooo;
    }
}
