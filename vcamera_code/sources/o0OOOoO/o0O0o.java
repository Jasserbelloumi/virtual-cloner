package o0OOOoO;

import java.util.Iterator;
import java.util.List;
import java.util.PrimitiveIterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import o0OO0o.o0OO00o0;
import o0OO0oO.o0O00000;
import o0OOOO0o.o00oo0OO;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import o0OOOoO0.oO000;
import org.jetbrains.annotations.NotNull;
@o00oo0OO(name = "StreamsKt")
/* loaded from: classes3.dex */
public final class o0O0o {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @o0OOO00({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,680:1\n31#2:681\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0<T> implements oO000<T> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ Stream f13763o00oOOo0;

        public o00oOOo0(Stream stream) {
            this.f13763o00oOOo0 = stream;
        }

        @Override // o0OOOoO0.oO000
        @NotNull
        public Iterator<T> iterator() {
            Iterator<T> it = this.f13763o00oOOo0.iterator();
            o0ooO.o00oo0OO(it, "iterator()");
            return it;
        }
    }

    @o0OOO00({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,680:1\n39#2:681\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO implements oO000<Integer> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ IntStream f13764o00oOOo0;

        public o00oOOoO(IntStream intStream) {
            this.f13764o00oOOo0 = intStream;
        }

        @Override // o0OOOoO0.oO000
        @NotNull
        public Iterator<Integer> iterator() {
            PrimitiveIterator.OfInt it = this.f13764o00oOOo0.iterator();
            o0ooO.o00oo0OO(it, "iterator()");
            return it;
        }
    }

    @o0OOO00({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,680:1\n47#2:681\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOo00 implements oO000<Long> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ LongStream f13765o00oOOo0;

        public o00oOo00(LongStream longStream) {
            this.f13765o00oOOo0 = longStream;
        }

        @Override // o0OOOoO0.oO000
        @NotNull
        public Iterator<Long> iterator() {
            PrimitiveIterator.OfLong it = this.f13765o00oOOo0.iterator();
            o0ooO.o00oo0OO(it, "iterator()");
            return it;
        }
    }

    @o0OOO00({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,680:1\n55#2:681\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOo0O implements oO000<Double> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ DoubleStream f13766o00oOOo0;

        public o00oOo0O(DoubleStream doubleStream) {
            this.f13766o00oOOo0 = doubleStream;
        }

        @Override // o0OOOoO0.oO000
        @NotNull
        public Iterator<Double> iterator() {
            PrimitiveIterator.OfDouble it = this.f13766o00oOOo0.iterator();
            o0ooO.o00oo0OO(it, "iterator()");
            return it;
        }
    }

    @o0OO00o0(version = "1.2")
    @NotNull
    public static final oO000<Double> o00oOOoO(@NotNull DoubleStream doubleStream) {
        o0ooO.o00oo0O0(doubleStream, "<this>");
        return new o00oOo0O(doubleStream);
    }

    @o0OO00o0(version = "1.2")
    @NotNull
    public static final oO000<Integer> o00oOo00(@NotNull IntStream intStream) {
        o0ooO.o00oo0O0(intStream, "<this>");
        return new o00oOOoO(intStream);
    }

    @o0OO00o0(version = "1.2")
    @NotNull
    public static final <T> oO000<T> o00oOo0O(@NotNull Stream<T> stream) {
        o0ooO.o00oo0O0(stream, "<this>");
        return new o00oOOo0(stream);
    }

    @o0OO00o0(version = "1.2")
    @NotNull
    public static final <T> Stream<T> o00oOo0o(@NotNull final oO000<? extends T> oo000) {
        o0ooO.o00oo0O0(oo000, "<this>");
        Stream<T> stream = StreamSupport.stream(new Supplier() { // from class: o0OOOoO.o00oo0O
            @Override // java.util.function.Supplier
            public final Object get() {
                return o0O0o.o00oOoO0(oO000.this);
            }
        }, 16, false);
        o0ooO.o00oo0OO(stream, "stream({ Spliterators.sp…literator.ORDERED, false)");
        return stream;
    }

    @o0OO00o0(version = "1.2")
    @NotNull
    public static final List<Double> o00oOoO(@NotNull DoubleStream doubleStream) {
        o0ooO.o00oo0O0(doubleStream, "<this>");
        double[] array = doubleStream.toArray();
        o0ooO.o00oo0OO(array, "toArray()");
        return o0O00000.o00oo0O0(array);
    }

    public static final Spliterator o00oOoO0(oO000 oo000) {
        o0ooO.o00oo0O0(oo000, "$this_asStream");
        return Spliterators.spliteratorUnknownSize(oo000.iterator(), 16);
    }

    @o0OO00o0(version = "1.2")
    @NotNull
    public static final List<Integer> o00oOoOO(@NotNull IntStream intStream) {
        o0ooO.o00oo0O0(intStream, "<this>");
        int[] array = intStream.toArray();
        o0ooO.o00oo0OO(array, "toArray()");
        return o0O00000.o00oo0Oo(array);
    }

    @o0OO00o0(version = "1.2")
    @NotNull
    public static final List<Long> o00oOoOo(@NotNull LongStream longStream) {
        o0ooO.o00oo0O0(longStream, "<this>");
        long[] array = longStream.toArray();
        o0ooO.o00oo0OO(array, "toArray()");
        return o0O00000.o00oo0o0(array);
    }

    @o0OO00o0(version = "1.2")
    @NotNull
    public static final <T> List<T> o00oOoo0(@NotNull Stream<T> stream) {
        o0ooO.o00oo0O0(stream, "<this>");
        Object collect = stream.collect(Collectors.toList());
        o0ooO.o00oo0OO(collect, "collect(Collectors.toList<T>())");
        return (List) collect;
    }

    @o0OO00o0(version = "1.2")
    @NotNull
    public static final oO000<Long> o00oOooO(@NotNull LongStream longStream) {
        o0ooO.o00oo0O0(longStream, "<this>");
        return new o00oOo00(longStream);
    }
}
