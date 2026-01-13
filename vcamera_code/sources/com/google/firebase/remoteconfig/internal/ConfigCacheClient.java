package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o00oOooO.o0O000O;
import o00oOooO.o0O0OOOo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
@o0O000O
/* loaded from: classes2.dex */
public class ConfigCacheClient {
    public static final long DISK_READ_TIMEOUT_IN_SECONDS = 5;
    @o0O0OOOo("this")
    @o0OO00OO
    private Task<ConfigContainer> cachedContainerTask = null;
    private final Executor executor;
    private final ConfigStorageClient storageClient;
    @o0O0OOOo("ConfigCacheClient.class")
    private static final Map<String, ConfigCacheClient> clientInstances = new HashMap();
    private static final Executor DIRECT_EXECUTOR = new o0O0OO0.o00oo00O();

    /* loaded from: classes2.dex */
    public static class AwaitListener<TResult> implements OnSuccessListener<TResult>, OnFailureListener, OnCanceledListener {
        private final CountDownLatch latch;

        private AwaitListener() {
            this.latch = new CountDownLatch(1);
        }

        public void await() throws InterruptedException {
            this.latch.await();
        }

        public boolean await(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.latch.await(j, timeUnit);
        }

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public void onCanceled() {
            this.latch.countDown();
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public void onFailure(@oo0oO0 Exception exc) {
            this.latch.countDown();
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public void onSuccess(TResult tresult) {
            this.latch.countDown();
        }
    }

    private ConfigCacheClient(Executor executor, ConfigStorageClient configStorageClient) {
        this.executor = executor;
        this.storageClient = configStorageClient;
    }

    private static <TResult> TResult await(Task<TResult> task, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        AwaitListener awaitListener = new AwaitListener();
        Executor executor = DIRECT_EXECUTOR;
        task.addOnSuccessListener(executor, awaitListener);
        task.addOnFailureListener(executor, awaitListener);
        task.addOnCanceledListener(executor, awaitListener);
        if (awaitListener.await(j, timeUnit)) {
            if (task.isSuccessful()) {
                return task.getResult();
            }
            throw new ExecutionException(task.getException());
        }
        throw new TimeoutException("Task await timed out.");
    }

    @o0o0000
    public static synchronized void clearInstancesForTest() {
        synchronized (ConfigCacheClient.class) {
            clientInstances.clear();
        }
    }

    public static synchronized ConfigCacheClient getInstance(Executor executor, ConfigStorageClient configStorageClient) {
        ConfigCacheClient configCacheClient;
        synchronized (ConfigCacheClient.class) {
            String fileName = configStorageClient.getFileName();
            Map<String, ConfigCacheClient> map = clientInstances;
            if (!map.containsKey(fileName)) {
                map.put(fileName, new ConfigCacheClient(executor, configStorageClient));
            }
            configCacheClient = map.get(fileName);
        }
        return configCacheClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void lambda$put$0(ConfigContainer configContainer) throws Exception {
        return this.storageClient.write(configContainer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$put$1(boolean z, ConfigContainer configContainer, Void r3) throws Exception {
        if (z) {
            updateInMemoryConfigContainer(configContainer);
        }
        return Tasks.forResult(configContainer);
    }

    private synchronized void updateInMemoryConfigContainer(ConfigContainer configContainer) {
        this.cachedContainerTask = Tasks.forResult(configContainer);
    }

    public void clear() {
        synchronized (this) {
            this.cachedContainerTask = Tasks.forResult(null);
        }
        this.storageClient.clear();
    }

    public synchronized Task<ConfigContainer> get() {
        Task<ConfigContainer> task = this.cachedContainerTask;
        if (task == null || (task.isComplete() && !this.cachedContainerTask.isSuccessful())) {
            Executor executor = this.executor;
            final ConfigStorageClient configStorageClient = this.storageClient;
            Objects.requireNonNull(configStorageClient);
            this.cachedContainerTask = Tasks.call(executor, new Callable() { // from class: com.google.firebase.remoteconfig.internal.o00oOOo0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return ConfigStorageClient.this.read();
                }
            });
        }
        return this.cachedContainerTask;
    }

    @o0OO00OO
    public ConfigContainer getBlocking() {
        return getBlocking(5L);
    }

    @o0OO00OO
    @o0o0000
    public ConfigContainer getBlocking(long j) {
        synchronized (this) {
            Task<ConfigContainer> task = this.cachedContainerTask;
            if (task == null || !task.isSuccessful()) {
                try {
                    return (ConfigContainer) await(get(), j, TimeUnit.SECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                    return null;
                }
            }
            return this.cachedContainerTask.getResult();
        }
    }

    @o0OO00OO
    @o0o0000
    public synchronized Task<ConfigContainer> getCachedContainerTask() {
        return this.cachedContainerTask;
    }

    public Task<ConfigContainer> put(ConfigContainer configContainer) {
        return put(configContainer, true);
    }

    public Task<ConfigContainer> put(final ConfigContainer configContainer, final boolean z) {
        return Tasks.call(this.executor, new Callable() { // from class: com.google.firebase.remoteconfig.internal.o00oOOoO
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void lambda$put$0;
                lambda$put$0 = ConfigCacheClient.this.lambda$put$0(configContainer);
                return lambda$put$0;
            }
        }).onSuccessTask(this.executor, new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.internal.o00oOo00
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task lambda$put$1;
                lambda$put$1 = ConfigCacheClient.this.lambda$put$1(z, configContainer, (Void) obj);
                return lambda$put$1;
            }
        });
    }
}
