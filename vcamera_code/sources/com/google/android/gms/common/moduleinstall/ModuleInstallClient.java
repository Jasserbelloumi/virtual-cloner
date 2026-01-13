package com.google.android.gms.common.moduleinstall;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.tasks.Task;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public interface ModuleInstallClient extends HasApiKey<Api.ApiOptions.NoOptions> {
    @oo0oO0
    Task<ModuleAvailabilityResponse> areModulesAvailable(@oo0oO0 OptionalModuleApi... optionalModuleApiArr);

    @oo0oO0
    Task<Void> deferredInstall(@oo0oO0 OptionalModuleApi... optionalModuleApiArr);

    @oo0oO0
    Task<ModuleInstallIntentResponse> getInstallModulesIntent(@oo0oO0 OptionalModuleApi... optionalModuleApiArr);

    @oo0oO0
    Task<ModuleInstallResponse> installModules(@oo0oO0 ModuleInstallRequest moduleInstallRequest);

    @oo0oO0
    Task<Void> releaseModules(@oo0oO0 OptionalModuleApi... optionalModuleApiArr);

    @oo0oO0
    Task<Boolean> unregisterListener(@oo0oO0 InstallStatusListener installStatusListener);
}
