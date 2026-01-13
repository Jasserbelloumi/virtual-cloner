package com.google.android.datatransport.runtime.dagger.internal;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import o0OO0o0o.o0O0o;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class AbstractMapFactory<K, V, V2> implements Factory<Map<K, V2>> {
    private final Map<K, o0O0o<V>> contributingMap;

    /* loaded from: classes.dex */
    public static abstract class Builder<K, V, V2> {
        public final LinkedHashMap<K, o0O0o<V>> map;

        public Builder(int i) {
            this.map = DaggerCollections.newLinkedHashMapWithExpectedSize(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder<K, V, V2> put(K k, o0O0o<V> o0o0o) {
            this.map.put(Preconditions.checkNotNull(k, "key"), Preconditions.checkNotNull(o0o0o, DatabaseFileArchive.COLUMN_PROVIDER));
            return this;
        }

        public Builder<K, V, V2> putAll(o0O0o<Map<K, V2>> o0o0o) {
            if (o0o0o instanceof DelegateFactory) {
                return putAll(((DelegateFactory) o0o0o).getDelegate());
            }
            this.map.putAll(((AbstractMapFactory) o0o0o).contributingMap);
            return this;
        }
    }

    public AbstractMapFactory(Map<K, o0O0o<V>> map) {
        this.contributingMap = Collections.unmodifiableMap(map);
    }

    public final Map<K, o0O0o<V>> contributingMap() {
        return this.contributingMap;
    }
}
