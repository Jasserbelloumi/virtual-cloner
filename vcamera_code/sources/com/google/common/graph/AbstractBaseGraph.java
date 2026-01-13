package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public abstract class AbstractBaseGraph<N> implements BaseGraph<N> {
    @Override // com.google.common.graph.BaseGraph
    public int degree(N n) {
        int i;
        int size;
        if (isDirected()) {
            size = predecessors((AbstractBaseGraph<N>) n).size();
            i = successors((AbstractBaseGraph<N>) n).size();
        } else {
            Set<N> adjacentNodes = adjacentNodes(n);
            i = (allowsSelfLoops() && adjacentNodes.contains(n)) ? 1 : 0;
            size = adjacentNodes.size();
        }
        return IntMath.saturatedAdd(size, i);
    }

    public long edgeCount() {
        Iterator<N> it;
        long j = 0;
        while (nodes().iterator().hasNext()) {
            j += degree(it.next());
        }
        Preconditions.checkState((1 & j) == 0);
        return j >>> 1;
    }

    @Override // com.google.common.graph.BaseGraph
    public Set<EndpointPair<N>> edges() {
        return new AbstractSet<EndpointPair<N>>() { // from class: com.google.common.graph.AbstractBaseGraph.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object obj) {
                if (obj instanceof EndpointPair) {
                    EndpointPair<?> endpointPair = (EndpointPair) obj;
                    return AbstractBaseGraph.this.isOrderingCompatible(endpointPair) && AbstractBaseGraph.this.nodes().contains(endpointPair.nodeU()) && AbstractBaseGraph.this.successors((AbstractBaseGraph) endpointPair.nodeU()).contains(endpointPair.nodeV());
                }
                return false;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<EndpointPair<N>> iterator() {
                return EndpointPairIterator.of(AbstractBaseGraph.this);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@CheckForNull Object obj) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return Ints.saturatedCast(AbstractBaseGraph.this.edgeCount());
            }
        };
    }

    @Override // com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
        Preconditions.checkNotNull(endpointPair);
        if (isOrderingCompatible(endpointPair)) {
            N nodeU = endpointPair.nodeU();
            return nodes().contains(nodeU) && successors((AbstractBaseGraph<N>) nodeU).contains(endpointPair.nodeV());
        }
        return false;
    }

    @Override // com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(N n, N n2) {
        Preconditions.checkNotNull(n);
        Preconditions.checkNotNull(n2);
        return nodes().contains(n) && successors((AbstractBaseGraph<N>) n).contains(n2);
    }

    @Override // com.google.common.graph.BaseGraph
    public int inDegree(N n) {
        return isDirected() ? predecessors((AbstractBaseGraph<N>) n).size() : degree(n);
    }

    @Override // com.google.common.graph.BaseGraph
    public ElementOrder<N> incidentEdgeOrder() {
        return ElementOrder.unordered();
    }

    @Override // com.google.common.graph.BaseGraph
    public Set<EndpointPair<N>> incidentEdges(N n) {
        Preconditions.checkNotNull(n);
        Preconditions.checkArgument(nodes().contains(n), GraphConstants.NODE_NOT_IN_GRAPH, n);
        return new IncidentEdgeSet<N>(this, this, n) { // from class: com.google.common.graph.AbstractBaseGraph.2
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<EndpointPair<N>> iterator() {
                return Iterators.unmodifiableIterator(this.graph.isDirected() ? Iterators.concat(Iterators.transform(this.graph.predecessors((BaseGraph<N>) this.node).iterator(), new Function<N, EndpointPair<N>>() { // from class: com.google.common.graph.AbstractBaseGraph.2.1
                    @Override // com.google.common.base.Function
                    public EndpointPair<N> apply(N n2) {
                        return EndpointPair.ordered(n2, AnonymousClass2.this.node);
                    }

                    @Override // com.google.common.base.Function
                    public /* bridge */ /* synthetic */ Object apply(Object obj) {
                        return apply((AnonymousClass1) obj);
                    }
                }), Iterators.transform(Sets.difference(this.graph.successors((BaseGraph<N>) this.node), ImmutableSet.of(this.node)).iterator(), new Function<N, EndpointPair<N>>() { // from class: com.google.common.graph.AbstractBaseGraph.2.2
                    @Override // com.google.common.base.Function
                    public EndpointPair<N> apply(N n2) {
                        return EndpointPair.ordered(AnonymousClass2.this.node, n2);
                    }

                    @Override // com.google.common.base.Function
                    public /* bridge */ /* synthetic */ Object apply(Object obj) {
                        return apply((C00852) obj);
                    }
                })) : Iterators.transform(this.graph.adjacentNodes(this.node).iterator(), new Function<N, EndpointPair<N>>() { // from class: com.google.common.graph.AbstractBaseGraph.2.3
                    @Override // com.google.common.base.Function
                    public EndpointPair<N> apply(N n2) {
                        return EndpointPair.unordered(AnonymousClass2.this.node, n2);
                    }

                    @Override // com.google.common.base.Function
                    public /* bridge */ /* synthetic */ Object apply(Object obj) {
                        return apply((AnonymousClass3) obj);
                    }
                }));
            }
        };
    }

    public final boolean isOrderingCompatible(EndpointPair<?> endpointPair) {
        return endpointPair.isOrdered() || !isDirected();
    }

    @Override // com.google.common.graph.BaseGraph
    public int outDegree(N n) {
        return isDirected() ? successors((AbstractBaseGraph<N>) n).size() : degree(n);
    }

    public final void validateEndpoints(EndpointPair<?> endpointPair) {
        Preconditions.checkNotNull(endpointPair);
        Preconditions.checkArgument(isOrderingCompatible(endpointPair), GraphConstants.ENDPOINTS_MISMATCH);
    }
}
