package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Comparator;
import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public final class GeneralRange<T> implements Serializable {
    private final Comparator<? super T> comparator;
    private final boolean hasLowerBound;
    private final boolean hasUpperBound;
    private final BoundType lowerBoundType;
    @CheckForNull
    private final T lowerEndpoint;
    @CheckForNull
    private transient GeneralRange<T> reverse;
    private final BoundType upperBoundType;
    @CheckForNull
    private final T upperEndpoint;

    private GeneralRange(Comparator<? super T> comparator, boolean z, @CheckForNull T t, BoundType boundType, boolean z2, @CheckForNull T t2, BoundType boundType2) {
        this.comparator = (Comparator) Preconditions.checkNotNull(comparator);
        this.hasLowerBound = z;
        this.hasUpperBound = z2;
        this.lowerEndpoint = t;
        this.lowerBoundType = (BoundType) Preconditions.checkNotNull(boundType);
        this.upperEndpoint = t2;
        this.upperBoundType = (BoundType) Preconditions.checkNotNull(boundType2);
        if (z) {
            comparator.compare((Object) NullnessCasts.uncheckedCastNullableTToT(t), (Object) NullnessCasts.uncheckedCastNullableTToT(t));
        }
        if (z2) {
            comparator.compare((Object) NullnessCasts.uncheckedCastNullableTToT(t2), (Object) NullnessCasts.uncheckedCastNullableTToT(t2));
        }
        if (z && z2) {
            int compare = comparator.compare((Object) NullnessCasts.uncheckedCastNullableTToT(t), (Object) NullnessCasts.uncheckedCastNullableTToT(t2));
            Preconditions.checkArgument(compare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", t, t2);
            if (compare == 0) {
                BoundType boundType3 = BoundType.OPEN;
                Preconditions.checkArgument((boundType != boundType3) | (boundType2 != boundType3));
            }
        }
    }

    public static <T> GeneralRange<T> all(Comparator<? super T> comparator) {
        BoundType boundType = BoundType.OPEN;
        return new GeneralRange<>(comparator, false, null, boundType, false, null, boundType);
    }

    public static <T> GeneralRange<T> downTo(Comparator<? super T> comparator, @ParametricNullness T t, BoundType boundType) {
        return new GeneralRange<>(comparator, true, t, boundType, false, null, BoundType.OPEN);
    }

    public static <T extends Comparable> GeneralRange<T> from(Range<T> range) {
        return new GeneralRange<>(Ordering.natural(), range.hasLowerBound(), range.hasLowerBound() ? range.lowerEndpoint() : null, range.hasLowerBound() ? range.lowerBoundType() : BoundType.OPEN, range.hasUpperBound(), range.hasUpperBound() ? range.upperEndpoint() : null, range.hasUpperBound() ? range.upperBoundType() : BoundType.OPEN);
    }

    public static <T> GeneralRange<T> range(Comparator<? super T> comparator, @ParametricNullness T t, BoundType boundType, @ParametricNullness T t2, BoundType boundType2) {
        return new GeneralRange<>(comparator, true, t, boundType, true, t2, boundType2);
    }

    public static <T> GeneralRange<T> upTo(Comparator<? super T> comparator, @ParametricNullness T t, BoundType boundType) {
        return new GeneralRange<>(comparator, false, null, BoundType.OPEN, true, t, boundType);
    }

    public Comparator<? super T> comparator() {
        return this.comparator;
    }

    public boolean contains(@ParametricNullness T t) {
        return (tooLow(t) || tooHigh(t)) ? false : true;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj instanceof GeneralRange) {
            GeneralRange generalRange = (GeneralRange) obj;
            return this.comparator.equals(generalRange.comparator) && this.hasLowerBound == generalRange.hasLowerBound && this.hasUpperBound == generalRange.hasUpperBound && getLowerBoundType().equals(generalRange.getLowerBoundType()) && getUpperBoundType().equals(generalRange.getUpperBoundType()) && Objects.equal(getLowerEndpoint(), generalRange.getLowerEndpoint()) && Objects.equal(getUpperEndpoint(), generalRange.getUpperEndpoint());
        }
        return false;
    }

    public BoundType getLowerBoundType() {
        return this.lowerBoundType;
    }

    @CheckForNull
    public T getLowerEndpoint() {
        return this.lowerEndpoint;
    }

    public BoundType getUpperBoundType() {
        return this.upperBoundType;
    }

    @CheckForNull
    public T getUpperEndpoint() {
        return this.upperEndpoint;
    }

    public boolean hasLowerBound() {
        return this.hasLowerBound;
    }

    public boolean hasUpperBound() {
        return this.hasUpperBound;
    }

    public int hashCode() {
        return Objects.hashCode(this.comparator, getLowerEndpoint(), getLowerBoundType(), getUpperEndpoint(), getUpperBoundType());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
        if (r12.getLowerBoundType() == com.google.common.collect.BoundType.OPEN) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0084, code lost:
        if (r12.getUpperBoundType() == com.google.common.collect.BoundType.OPEN) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.common.collect.GeneralRange<T> intersect(com.google.common.collect.GeneralRange<T> r12) {
        /*
            r11 = this;
            com.google.common.base.Preconditions.checkNotNull(r12)
            java.util.Comparator<? super T> r0 = r11.comparator
            java.util.Comparator<? super T> r1 = r12.comparator
            boolean r0 = r0.equals(r1)
            com.google.common.base.Preconditions.checkArgument(r0)
            boolean r0 = r11.hasLowerBound
            java.lang.Object r1 = r11.getLowerEndpoint()
            com.google.common.collect.BoundType r2 = r11.getLowerBoundType()
            boolean r3 = r11.hasLowerBound()
            if (r3 != 0) goto L29
            boolean r0 = r12.hasLowerBound
        L20:
            java.lang.Object r1 = r12.getLowerEndpoint()
            com.google.common.collect.BoundType r2 = r12.getLowerBoundType()
            goto L4a
        L29:
            boolean r3 = r12.hasLowerBound()
            if (r3 == 0) goto L4a
            java.util.Comparator<? super T> r3 = r11.comparator
            java.lang.Object r4 = r11.getLowerEndpoint()
            java.lang.Object r5 = r12.getLowerEndpoint()
            int r3 = r3.compare(r4, r5)
            if (r3 < 0) goto L20
            if (r3 != 0) goto L4a
            com.google.common.collect.BoundType r3 = r12.getLowerBoundType()
            com.google.common.collect.BoundType r4 = com.google.common.collect.BoundType.OPEN
            if (r3 != r4) goto L4a
            goto L20
        L4a:
            r5 = r0
            boolean r0 = r11.hasUpperBound
            java.lang.Object r3 = r11.getUpperEndpoint()
            com.google.common.collect.BoundType r4 = r11.getUpperBoundType()
            boolean r6 = r11.hasUpperBound()
            if (r6 != 0) goto L66
            boolean r0 = r12.hasUpperBound
        L5d:
            java.lang.Object r3 = r12.getUpperEndpoint()
            com.google.common.collect.BoundType r4 = r12.getUpperBoundType()
            goto L87
        L66:
            boolean r6 = r12.hasUpperBound()
            if (r6 == 0) goto L87
            java.util.Comparator<? super T> r6 = r11.comparator
            java.lang.Object r7 = r11.getUpperEndpoint()
            java.lang.Object r8 = r12.getUpperEndpoint()
            int r6 = r6.compare(r7, r8)
            if (r6 > 0) goto L5d
            if (r6 != 0) goto L87
            com.google.common.collect.BoundType r6 = r12.getUpperBoundType()
            com.google.common.collect.BoundType r7 = com.google.common.collect.BoundType.OPEN
            if (r6 != r7) goto L87
            goto L5d
        L87:
            r8 = r0
            r9 = r3
            if (r5 == 0) goto La5
            if (r8 == 0) goto La5
            java.util.Comparator<? super T> r12 = r11.comparator
            int r12 = r12.compare(r1, r9)
            if (r12 > 0) goto L9d
            if (r12 != 0) goto La5
            com.google.common.collect.BoundType r12 = com.google.common.collect.BoundType.OPEN
            if (r2 != r12) goto La5
            if (r4 != r12) goto La5
        L9d:
            com.google.common.collect.BoundType r12 = com.google.common.collect.BoundType.OPEN
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.CLOSED
            r7 = r12
            r10 = r0
            r6 = r9
            goto La8
        La5:
            r6 = r1
            r7 = r2
            r10 = r4
        La8:
            com.google.common.collect.GeneralRange r12 = new com.google.common.collect.GeneralRange
            java.util.Comparator<? super T> r4 = r11.comparator
            r3 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.GeneralRange.intersect(com.google.common.collect.GeneralRange):com.google.common.collect.GeneralRange");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean isEmpty() {
        return (hasUpperBound() && tooLow(NullnessCasts.uncheckedCastNullableTToT(getUpperEndpoint()))) || (hasLowerBound() && tooHigh(NullnessCasts.uncheckedCastNullableTToT(getLowerEndpoint())));
    }

    public GeneralRange<T> reverse() {
        GeneralRange<T> generalRange = this.reverse;
        if (generalRange == null) {
            GeneralRange<T> generalRange2 = new GeneralRange<>(Ordering.from(this.comparator).reverse(), this.hasUpperBound, getUpperEndpoint(), getUpperBoundType(), this.hasLowerBound, getLowerEndpoint(), getLowerBoundType());
            generalRange2.reverse = this;
            this.reverse = generalRange2;
            return generalRange2;
        }
        return generalRange;
    }

    public String toString() {
        String valueOf = String.valueOf(this.comparator);
        BoundType boundType = this.lowerBoundType;
        BoundType boundType2 = BoundType.CLOSED;
        char c = boundType == boundType2 ? '[' : '(';
        String valueOf2 = String.valueOf(this.hasLowerBound ? this.lowerEndpoint : "-∞");
        String valueOf3 = String.valueOf(this.hasUpperBound ? this.upperEndpoint : "∞");
        char c2 = this.upperBoundType == boundType2 ? ']' : ')';
        StringBuilder sb = new StringBuilder(valueOf3.length() + valueOf2.length() + valueOf.length() + 4);
        sb.append(valueOf);
        sb.append(":");
        sb.append(c);
        sb.append(valueOf2);
        sb.append(',');
        sb.append(valueOf3);
        sb.append(c2);
        return sb.toString();
    }

    public boolean tooHigh(@ParametricNullness T t) {
        if (hasUpperBound()) {
            int compare = this.comparator.compare(t, NullnessCasts.uncheckedCastNullableTToT(getUpperEndpoint()));
            return ((compare == 0) & (getUpperBoundType() == BoundType.OPEN)) | (compare > 0);
        }
        return false;
    }

    public boolean tooLow(@ParametricNullness T t) {
        if (hasLowerBound()) {
            int compare = this.comparator.compare(t, NullnessCasts.uncheckedCastNullableTToT(getLowerEndpoint()));
            return ((compare == 0) & (getLowerBoundType() == BoundType.OPEN)) | (compare < 0);
        }
        return false;
    }
}
