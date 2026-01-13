package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public final class Suppliers {

    @VisibleForTesting
    /* loaded from: classes2.dex */
    public static class ExpiringMemoizingSupplier<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        public final Supplier<T> delegate;
        public final long durationNanos;
        public volatile transient long expirationNanos;
        @CheckForNull
        public volatile transient T value;

        public ExpiringMemoizingSupplier(Supplier<T> supplier, long j, TimeUnit timeUnit) {
            this.delegate = (Supplier) Preconditions.checkNotNull(supplier);
            this.durationNanos = timeUnit.toNanos(j);
            Preconditions.checkArgument(j > 0, "duration (%s %s) must be > 0", j, timeUnit);
        }

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
            long j = this.expirationNanos;
            long systemNanoTime = Platform.systemNanoTime();
            if (j == 0 || systemNanoTime - j >= 0) {
                synchronized (this) {
                    if (j == this.expirationNanos) {
                        T t = this.delegate.get();
                        this.value = t;
                        long j2 = systemNanoTime + this.durationNanos;
                        if (j2 == 0) {
                            j2 = 1;
                        }
                        this.expirationNanos = j2;
                        return t;
                    }
                }
            }
            return (T) NullnessCasts.uncheckedCastNullableTToT(this.value);
        }

        public String toString() {
            String valueOf = String.valueOf(this.delegate);
            long j = this.durationNanos;
            StringBuilder sb = new StringBuilder(valueOf.length() + 62);
            sb.append("Suppliers.memoizeWithExpiration(");
            sb.append(valueOf);
            sb.append(", ");
            return android.support.v4.media.session.o00oOo00.o00oOOo0(sb, j, ", NANOS)");
        }
    }

    @VisibleForTesting
    /* loaded from: classes2.dex */
    public static class MemoizingSupplier<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        public final Supplier<T> delegate;
        public volatile transient boolean initialized;
        @CheckForNull
        public transient T value;

        public MemoizingSupplier(Supplier<T> supplier) {
            this.delegate = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
            if (!this.initialized) {
                synchronized (this) {
                    if (!this.initialized) {
                        T t = this.delegate.get();
                        this.value = t;
                        this.initialized = true;
                        return t;
                    }
                }
            }
            return (T) NullnessCasts.uncheckedCastNullableTToT(this.value);
        }

        public String toString() {
            Object obj;
            if (this.initialized) {
                String valueOf = String.valueOf(this.value);
                obj = com.google.android.gms.internal.ads.o00oOOoO.o00oOOo0(valueOf.length() + 25, "<supplier that returned ", valueOf, ">");
            } else {
                obj = this.delegate;
            }
            String valueOf2 = String.valueOf(obj);
            return com.google.android.gms.internal.ads.o00oOOoO.o00oOOo0(valueOf2.length() + 19, "Suppliers.memoize(", valueOf2, ")");
        }
    }

    @VisibleForTesting
    /* loaded from: classes2.dex */
    public static class NonSerializableMemoizingSupplier<T> implements Supplier<T> {
        @CheckForNull
        public volatile Supplier<T> delegate;
        public volatile boolean initialized;
        @CheckForNull
        public T value;

        public NonSerializableMemoizingSupplier(Supplier<T> supplier) {
            this.delegate = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
            if (!this.initialized) {
                synchronized (this) {
                    if (!this.initialized) {
                        Supplier<T> supplier = this.delegate;
                        java.util.Objects.requireNonNull(supplier);
                        T t = supplier.get();
                        this.value = t;
                        this.initialized = true;
                        this.delegate = null;
                        return t;
                    }
                }
            }
            return (T) NullnessCasts.uncheckedCastNullableTToT(this.value);
        }

        public String toString() {
            Object obj = this.delegate;
            if (obj == null) {
                String valueOf = String.valueOf(this.value);
                obj = com.google.android.gms.internal.ads.o00oOOoO.o00oOOo0(valueOf.length() + 25, "<supplier that returned ", valueOf, ">");
            }
            String valueOf2 = String.valueOf(obj);
            return com.google.android.gms.internal.ads.o00oOOoO.o00oOOo0(valueOf2.length() + 19, "Suppliers.memoize(", valueOf2, ")");
        }
    }

    /* loaded from: classes2.dex */
    public static class SupplierComposition<F, T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        public final Function<? super F, T> function;
        public final Supplier<F> supplier;

        public SupplierComposition(Function<? super F, T> function, Supplier<F> supplier) {
            this.function = (Function) Preconditions.checkNotNull(function);
            this.supplier = (Supplier) Preconditions.checkNotNull(supplier);
        }

        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof SupplierComposition) {
                SupplierComposition supplierComposition = (SupplierComposition) obj;
                return this.function.equals(supplierComposition.function) && this.supplier.equals(supplierComposition.supplier);
            }
            return false;
        }

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
            return this.function.apply((F) this.supplier.get());
        }

        public int hashCode() {
            return Objects.hashCode(this.function, this.supplier);
        }

        public String toString() {
            String valueOf = String.valueOf(this.function);
            String valueOf2 = String.valueOf(this.supplier);
            StringBuilder o00oOOo02 = o00oOOoO.o00oOOo0(valueOf2.length() + valueOf.length() + 21, "Suppliers.compose(", valueOf, ", ", valueOf2);
            o00oOOo02.append(")");
            return o00oOOo02.toString();
        }
    }

    /* loaded from: classes2.dex */
    public interface SupplierFunction<T> extends Function<Supplier<T>, T> {
    }

    /* loaded from: classes2.dex */
    public enum SupplierFunctionImpl implements SupplierFunction<Object> {
        INSTANCE;

        @Override // com.google.common.base.Function
        @CheckForNull
        public Object apply(Supplier<Object> supplier) {
            return supplier.get();
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Suppliers.supplierFunction()";
        }
    }

    /* loaded from: classes2.dex */
    public static class SupplierOfInstance<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        @ParametricNullness
        public final T instance;

        public SupplierOfInstance(@ParametricNullness T t) {
            this.instance = t;
        }

        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof SupplierOfInstance) {
                return Objects.equal(this.instance, ((SupplierOfInstance) obj).instance);
            }
            return false;
        }

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
            return this.instance;
        }

        public int hashCode() {
            return Objects.hashCode(this.instance);
        }

        public String toString() {
            String valueOf = String.valueOf(this.instance);
            return com.google.android.gms.internal.ads.o00oOOoO.o00oOOo0(valueOf.length() + 22, "Suppliers.ofInstance(", valueOf, ")");
        }
    }

    /* loaded from: classes2.dex */
    public static class ThreadSafeSupplier<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        public final Supplier<T> delegate;

        public ThreadSafeSupplier(Supplier<T> supplier) {
            this.delegate = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
            T t;
            synchronized (this.delegate) {
                t = this.delegate.get();
            }
            return t;
        }

        public String toString() {
            String valueOf = String.valueOf(this.delegate);
            return com.google.android.gms.internal.ads.o00oOOoO.o00oOOo0(valueOf.length() + 32, "Suppliers.synchronizedSupplier(", valueOf, ")");
        }
    }

    private Suppliers() {
    }

    public static <F, T> Supplier<T> compose(Function<? super F, T> function, Supplier<F> supplier) {
        return new SupplierComposition(function, supplier);
    }

    public static <T> Supplier<T> memoize(Supplier<T> supplier) {
        return ((supplier instanceof NonSerializableMemoizingSupplier) || (supplier instanceof MemoizingSupplier)) ? supplier : supplier instanceof Serializable ? new MemoizingSupplier(supplier) : new NonSerializableMemoizingSupplier(supplier);
    }

    public static <T> Supplier<T> memoizeWithExpiration(Supplier<T> supplier, long j, TimeUnit timeUnit) {
        return new ExpiringMemoizingSupplier(supplier, j, timeUnit);
    }

    public static <T> Supplier<T> ofInstance(@ParametricNullness T t) {
        return new SupplierOfInstance(t);
    }

    public static <T> Function<Supplier<T>, T> supplierFunction() {
        return SupplierFunctionImpl.INSTANCE;
    }

    public static <T> Supplier<T> synchronizedSupplier(Supplier<T> supplier) {
        return new ThreadSafeSupplier(supplier);
    }
}
