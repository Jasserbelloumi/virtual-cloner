package o0OO0oOO;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import o0OO0oO.o0OO0oO0;
import o0OO0oO.o0OoO00O;
import o0OO0oO.o0ooO;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0OOO00;
import org.jetbrains.annotations.NotNull;
@o0OOO00({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/SerializedCollection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,429:1\n1#2:430\n*E\n"})
/* loaded from: classes3.dex */
public final class o0O0O0O implements Externalizable {
    @NotNull
    public static final o00oOOo0 Companion = new o00oOOo0(null);
    private static final long serialVersionUID = 0;
    public static final int tagList = 0;
    public static final int tagSet = 1;
    @NotNull
    private Collection<?> collection;
    private final int tag;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }
    }

    public o0O0O0O() {
        this(o0ooO.INSTANCE, 0);
    }

    public o0O0O0O(@NotNull Collection<?> collection, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(collection, "collection");
        this.collection = collection;
        this.tag = i;
    }

    private final Object readResolve() {
        return this.collection;
    }

    @Override // java.io.Externalizable
    public void readExternal(@NotNull ObjectInput objectInput) {
        Collection<?> o00oOOo02;
        o0OOOOO0.o0ooO.o00oo0O0(objectInput, "input");
        byte readByte = objectInput.readByte();
        int i = readByte & 1;
        if ((readByte & (-2)) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) readByte) + '.');
        }
        int readInt = objectInput.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        int i2 = 0;
        if (i == 0) {
            o0O00O o0o00o = new o0O00O(readInt);
            while (i2 < readInt) {
                o0o00o.add(objectInput.readObject());
                i2++;
            }
            o00oOOo02 = o0OoO00O.o00oOOo0(o0o00o);
        } else if (i != 1) {
            throw new InvalidObjectException("Unsupported collection type tag: " + i + '.');
        } else {
            o0O0oo0o o0o0oo0o = new o0O0oo0o(readInt);
            while (i2 < readInt) {
                o0o0oo0o.add(objectInput.readObject());
                i2++;
            }
            o00oOOo02 = o0OO0oO0.o00oOOo0(o0o0oo0o);
        }
        this.collection = o00oOOo02;
    }

    @Override // java.io.Externalizable
    public void writeExternal(@NotNull ObjectOutput objectOutput) {
        o0OOOOO0.o0ooO.o00oo0O0(objectOutput, "output");
        objectOutput.writeByte(this.tag);
        objectOutput.writeInt(this.collection.size());
        Iterator<?> it = this.collection.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }
}
