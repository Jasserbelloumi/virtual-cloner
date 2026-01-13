package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.PlaybackException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzfd extends zzfa {
    private final ContentResolver zza;
    @o0OO00OO
    private Uri zzb;
    @o0OO00OO
    private AssetFileDescriptor zzc;
    @o0OO00OO
    private FileInputStream zzd;
    private long zze;
    private boolean zzf;

    public zzfd(Context context) {
        super(false);
        this.zza = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.zzr
    public final int zza(byte[] bArr, int i, int i2) throws zzfc {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zze;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new zzfc(e, 2000);
                }
            }
            FileInputStream fileInputStream = this.zzd;
            int i3 = zzew.zza;
            int read = fileInputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            long j2 = this.zze;
            if (j2 != -1) {
                this.zze = j2 - read;
            }
            zzg(read);
            return read;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public final long zzb(zzfl zzflVar) throws zzfc {
        int i;
        AssetFileDescriptor openAssetFileDescriptor;
        long j;
        try {
            try {
                Uri uri = zzflVar.zza;
                this.zzb = uri;
                zzi(zzflVar);
                if ("content".equals(zzflVar.zza.getScheme())) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = this.zza.openTypedAssetFileDescriptor(uri, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = this.zza.openAssetFileDescriptor(uri, "r");
                }
                this.zzc = openAssetFileDescriptor;
                if (openAssetFileDescriptor == null) {
                    i = 2000;
                    try {
                        throw new zzfc(new IOException("Could not open file descriptor for: " + String.valueOf(uri)), 2000);
                    } catch (IOException e) {
                        e = e;
                        if (true == (e instanceof FileNotFoundException)) {
                            i = PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND;
                        }
                        throw new zzfc(e, i);
                    }
                }
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.zzd = fileInputStream;
                int i2 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                if (i2 != 0 && zzflVar.zzf > length) {
                    throw new zzfc(null, 2008);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(zzflVar.zzf + startOffset) - startOffset;
                if (skip == zzflVar.zzf) {
                    if (i2 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.zze = -1L;
                            j = -1;
                        } else {
                            j = size - channel.position();
                            this.zze = j;
                            if (j < 0) {
                                throw new zzfc(null, 2008);
                            }
                        }
                    } else {
                        j = length - skip;
                        this.zze = j;
                        if (j < 0) {
                            throw new zzfc(null, 2008);
                        }
                    }
                    long j2 = zzflVar.zzg;
                    if (j2 != -1) {
                        if (j != -1) {
                            j2 = Math.min(j, j2);
                        }
                        this.zze = j2;
                    }
                    this.zzf = true;
                    zzj(zzflVar);
                    long j3 = zzflVar.zzg;
                    return j3 != -1 ? j3 : this.zze;
                }
                throw new zzfc(null, 2008);
            } catch (zzfc e2) {
                throw e2;
            }
        } catch (IOException e3) {
            e = e3;
            i = 2000;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    @o0OO00OO
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public final void zzd() throws zzfc {
        this.zzb = null;
        try {
            try {
                FileInputStream fileInputStream = this.zzd;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.zzd = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.zzc;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.zzc = null;
                        if (this.zzf) {
                            this.zzf = false;
                            zzh();
                        }
                    }
                } catch (IOException e) {
                    throw new zzfc(e, 2000);
                }
            } catch (IOException e2) {
                throw new zzfc(e2, 2000);
            }
        } catch (Throwable th) {
            this.zzd = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.zzc;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.zzc = null;
                    if (this.zzf) {
                        this.zzf = false;
                        zzh();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new zzfc(e3, 2000);
                }
            } catch (Throwable th2) {
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzh();
                }
                throw th2;
            }
        }
    }
}
