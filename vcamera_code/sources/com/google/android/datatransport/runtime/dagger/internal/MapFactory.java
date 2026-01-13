package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import o0OO0o0o.o0O0o;
/* loaded from: classes.dex */
public final class MapFactory<K, V> extends AbstractMapFactory<K, V, V> {
    private static final o0O0o<Map<Object, Object>> EMPTY = InstanceFactory.create(Collections.emptyMap());

    /* loaded from: classes.dex */
    public static final class Builder<K, V> extends AbstractMapFactory.Builder<K, V, V> {
        private Builder(int i) {
            super(i);
        }

        public MapFactory<K, V> build() {
            return new MapFactory<>(this.map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory.Builder
        public /* bridge */ /* synthetic */ AbstractMapFactory.Builder put(Object obj, o0O0o o0o0o) {
            return put((Builder<K, V>) obj, o0o0o);
        }

        @Override // com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory.Builder
        public Builder<K, V> put(K k, o0O0o<V> o0o0o) {
            super.put((Builder<K, V>) k, (o0O0o) o0o0o);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory.Builder
        public Builder<K, V> putAll(o0O0o<Map<K, V>> o0o0o) {
            super.putAll((o0O0o) o0o0o);
            return this;
        }
    }

    private MapFactory(Map<K, o0O0o<V>> map) {
        super(map);
    }

    public static <K, V> Builder<K, V> builder(int i) {
        return new Builder<>(i);
    }

    public static <K, V> o0O0o<Map<K, V>> emptyMapProvider() {
        return (o0O0o<Map<K, V>>) EMPTY;
    }

    @Override // o0OO0o0o.o0O0o
    public Map<K, V> get() {
        LinkedHashMap newLinkedHashMapWithExpectedSize = DaggerCollections.newLinkedHashMapWithExpectedSize(contributingMap().size());
        for (Map.Entry<K, o0O0o<V>> entry : contributingMap().entrySet()) {
            newLinkedHashMapWithExpectedSize.put(entry.getKey(), entry.getValue().get());
        }
        return Collections.unmodifiableMap(newLinkedHashMapWithExpectedSize);
    }
}
