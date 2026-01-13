package com.google.android.gms.common.moduleinstall;

import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class ModuleInstallRequest {
    private final List zaa;
    @o0OO00OO
    private final InstallStatusListener zab;
    @o0OO00OO
    private final Executor zac;
    private final boolean zad;

    /* loaded from: classes.dex */
    public static class Builder {
        private final List zaa = new ArrayList();
        private boolean zab = true;
        @o0OO00OO
        private InstallStatusListener zac;
        @o0OO00OO
        private Executor zad;

        @CanIgnoreReturnValue
        @oo0oO0
        public Builder addApi(@oo0oO0 OptionalModuleApi optionalModuleApi) {
            this.zaa.add(optionalModuleApi);
            return this;
        }

        @oo0oO0
        public ModuleInstallRequest build() {
            return new ModuleInstallRequest(this.zaa, this.zac, this.zad, this.zab, null);
        }

        @oo0oO0
        public Builder setListener(@oo0oO0 InstallStatusListener installStatusListener) {
            return setListener(installStatusListener, null);
        }

        @CanIgnoreReturnValue
        @oo0oO0
        public Builder setListener(@oo0oO0 InstallStatusListener installStatusListener, @o0OO00OO Executor executor) {
            this.zac = installStatusListener;
            this.zad = executor;
            return this;
        }
    }

    public /* synthetic */ ModuleInstallRequest(List list, InstallStatusListener installStatusListener, Executor executor, boolean z, zac zacVar) {
        Preconditions.checkNotNull(list, "APIs must not be null.");
        Preconditions.checkArgument(!list.isEmpty(), "APIs must not be empty.");
        if (executor != null) {
            Preconditions.checkNotNull(installStatusListener, "Listener must not be null when listener executor is set.");
        }
        this.zaa = list;
        this.zab = installStatusListener;
        this.zac = executor;
        this.zad = z;
    }

    @oo0oO0
    public static Builder newBuilder() {
        return new Builder();
    }

    @oo0oO0
    public List<OptionalModuleApi> getApis() {
        return this.zaa;
    }

    @o0OO00OO
    public InstallStatusListener getListener() {
        return this.zab;
    }

    @o0OO00OO
    public Executor getListenerExecutor() {
        return this.zac;
    }

    @ShowFirstParty
    public final boolean zaa() {
        return this.zad;
    }
}
