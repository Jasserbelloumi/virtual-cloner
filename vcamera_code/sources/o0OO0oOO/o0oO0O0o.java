package o0OO0oOO;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import o0OO0oO.oo0oO0;
import o0OO0oO.oo0ooO;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o0oO0O0o implements Externalizable {
    @NotNull
    public static final o00oOOo0 Companion = new o00oOOo0(null);
    private static final long serialVersionUID = 0;
    @NotNull
    private Map<?, ?> map;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }
    }

    public o0oO0O0o() {
        this(oo0ooO.o00ooO0O());
    }

    public o0oO0O0o(@NotNull Map<?, ?> map) {
        o0ooO.o00oo0O0(map, "map");
        this.map = map;
    }

    private final Object readResolve() {
        return this.map;
    }

    @Override // java.io.Externalizable
    public void readExternal(@NotNull ObjectInput objectInput) {
        o0ooO.o00oo0O0(objectInput, "input");
        byte readByte = objectInput.readByte();
        if (readByte != 0) {
            throw new InvalidObjectException(android.support.v4.media.o00oOOo0.o00oOOo0("Unsupported flags value: ", readByte));
        }
        int readInt = objectInput.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        o0O00OOO o0o00ooo = new o0O00OOO(readInt);
        for (int i = 0; i < readInt; i++) {
            o0o00ooo.put(objectInput.readObject(), objectInput.readObject());
        }
        this.map = oo0oO0.o00oOooO(o0o00ooo);
    }

    @Override // java.io.Externalizable
    public void writeExternal(@NotNull ObjectOutput objectOutput) {
        o0ooO.o00oo0O0(objectOutput, "output");
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.map.size());
        for (Map.Entry<?, ?> entry : this.map.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }
}
