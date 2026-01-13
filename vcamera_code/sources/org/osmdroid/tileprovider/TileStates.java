package org.osmdroid.tileprovider;

import android.graphics.drawable.Drawable;
import android.support.v4.media.o00oOOo0;
import android.support.v4.media.o00oOo00;
import android.support.v4.media.o00oOo0O;
import java.util.Collection;
import java.util.LinkedHashSet;
/* loaded from: classes3.dex */
public class TileStates {
    private boolean mDone;
    private int mExpired;
    private int mNotFound;
    private Collection<Runnable> mRunAfters = new LinkedHashSet();
    private int mScaled;
    private int mTotal;
    private int mUpToDate;

    public void finaliseLoop() {
        this.mDone = true;
        for (Runnable runnable : this.mRunAfters) {
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public int getExpired() {
        return this.mExpired;
    }

    public int getNotFound() {
        return this.mNotFound;
    }

    public Collection<Runnable> getRunAfters() {
        return this.mRunAfters;
    }

    public int getScaled() {
        return this.mScaled;
    }

    public int getTotal() {
        return this.mTotal;
    }

    public int getUpToDate() {
        return this.mUpToDate;
    }

    public void handleTile(Drawable drawable) {
        int state;
        this.mTotal++;
        if (drawable == null || (state = ExpirableBitmapDrawable.getState(drawable)) == -4) {
            this.mNotFound++;
        } else if (state == -3) {
            this.mScaled++;
        } else if (state == -2) {
            this.mExpired++;
        } else if (state != -1) {
            throw new IllegalArgumentException(o00oOOo0.o00oOOo0("Unknown state: ", state));
        } else {
            this.mUpToDate++;
        }
    }

    public void initialiseLoop() {
        this.mDone = false;
        this.mTotal = 0;
        this.mUpToDate = 0;
        this.mExpired = 0;
        this.mScaled = 0;
        this.mNotFound = 0;
    }

    public boolean isDone() {
        return this.mDone;
    }

    public String toString() {
        if (this.mDone) {
            StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("TileStates: ");
            o00oOOo02.append(this.mTotal);
            o00oOOo02.append(" = ");
            o00oOOo02.append(this.mUpToDate);
            o00oOOo02.append("(U) + ");
            o00oOOo02.append(this.mExpired);
            o00oOOo02.append("(E) + ");
            o00oOOo02.append(this.mScaled);
            o00oOOo02.append("(S) + ");
            return o00oOo00.o00oOOo0(o00oOOo02, this.mNotFound, "(N)");
        }
        return "TileStates";
    }
}
