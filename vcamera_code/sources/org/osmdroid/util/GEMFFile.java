package org.osmdroid.util;

import android.support.v4.media.o00oOOo0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
/* loaded from: classes3.dex */
public class GEMFFile {
    private static final int FILE_COPY_BUFFER_SIZE = 1024;
    private static final long FILE_SIZE_LIMIT = 1073741824;
    private static final int TILE_SIZE = 256;
    private static final int U32_SIZE = 4;
    private static final int U64_SIZE = 8;
    private static final int VERSION = 4;
    private int mCurrentSource;
    private final List<String> mFileNames;
    private final List<Long> mFileSizes;
    private final List<RandomAccessFile> mFiles;
    private final String mLocation;
    private final List<GEMFRange> mRangeData;
    private boolean mSourceLimited;
    private final LinkedHashMap<Integer, String> mSources;

    /* loaded from: classes3.dex */
    public class GEMFInputStream extends InputStream {
        public RandomAccessFile raf;
        public int remainingBytes;

        public GEMFInputStream(String str, long j, int i) throws IOException {
            RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
            this.raf = randomAccessFile;
            randomAccessFile.seek(j);
            this.remainingBytes = i;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.remainingBytes;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.raf.close();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return false;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            int i = this.remainingBytes;
            if (i > 0) {
                this.remainingBytes = i - 1;
                return this.raf.read();
            }
            throw new IOException("End of stream");
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            RandomAccessFile randomAccessFile = this.raf;
            int i3 = this.remainingBytes;
            if (i2 > i3) {
                i2 = i3;
            }
            int read = randomAccessFile.read(bArr, i, i2);
            this.remainingBytes -= read;
            return read;
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            return 0L;
        }
    }

    /* loaded from: classes3.dex */
    public class GEMFRange {
        public Long offset;
        public Integer sourceIndex;
        public Integer xMax;
        public Integer xMin;
        public Integer yMax;
        public Integer yMin;
        public Integer zoom;

        private GEMFRange() {
        }

        public String toString() {
            return String.format("GEMF Range: source=%d, zoom=%d, x=%d-%d, y=%d-%d, offset=0x%08X", this.sourceIndex, this.zoom, this.xMin, this.xMax, this.yMin, this.yMax, this.offset);
        }
    }

    public GEMFFile(File file) throws FileNotFoundException, IOException {
        this(file.getAbsolutePath());
    }

    public GEMFFile(String str) throws FileNotFoundException, IOException {
        this.mFiles = new ArrayList();
        this.mFileNames = new ArrayList();
        this.mRangeData = new ArrayList();
        this.mFileSizes = new ArrayList();
        this.mSources = new LinkedHashMap<>();
        this.mSourceLimited = false;
        this.mCurrentSource = 0;
        this.mLocation = str;
        openFiles();
        readHeader();
    }

    public GEMFFile(String str, List<File> list) throws FileNotFoundException, IOException {
        Iterator it;
        Iterator<File> it2;
        File[] fileArr;
        int i;
        Iterator<File> it3;
        File[] fileArr2;
        int i2;
        File[] fileArr3;
        int i3;
        File[] fileArr4;
        int i4;
        this.mFiles = new ArrayList();
        this.mFileNames = new ArrayList();
        this.mRangeData = new ArrayList();
        this.mFileSizes = new ArrayList();
        this.mSources = new LinkedHashMap<>();
        int i5 = 0;
        this.mSourceLimited = false;
        this.mCurrentSource = 0;
        this.mLocation = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<File> it4 = list.iterator();
        while (it4.hasNext()) {
            File next = it4.next();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            File[] listFiles = next.listFiles();
            int length = listFiles.length;
            int i6 = i5;
            while (i6 < length) {
                File file = listFiles[i6];
                try {
                    Integer.parseInt(file.getName());
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    File[] listFiles2 = file.listFiles();
                    int length2 = listFiles2.length;
                    int i7 = i5;
                    while (i7 < length2) {
                        File file2 = listFiles2[i7];
                        try {
                            Integer.parseInt(file2.getName());
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                            it3 = it4;
                            File[] listFiles3 = file2.listFiles();
                            fileArr2 = listFiles;
                            int length3 = listFiles3.length;
                            i2 = length;
                            int i8 = 0;
                            while (i8 < length3) {
                                int i9 = length3;
                                File file3 = listFiles3[i8];
                                File[] fileArr5 = listFiles3;
                                try {
                                    fileArr4 = listFiles2;
                                    try {
                                        i4 = length2;
                                        try {
                                            Integer.parseInt(file3.getName().substring(0, file3.getName().indexOf(46)));
                                            linkedHashMap4.put(Integer.valueOf(Integer.parseInt(file3.getName().substring(0, file3.getName().indexOf(46)))), file3);
                                        } catch (NumberFormatException unused) {
                                        }
                                    } catch (NumberFormatException unused2) {
                                        i4 = length2;
                                        i8++;
                                        length3 = i9;
                                        listFiles3 = fileArr5;
                                        listFiles2 = fileArr4;
                                        length2 = i4;
                                    }
                                } catch (NumberFormatException unused3) {
                                    fileArr4 = listFiles2;
                                }
                                i8++;
                                length3 = i9;
                                listFiles3 = fileArr5;
                                listFiles2 = fileArr4;
                                length2 = i4;
                            }
                            fileArr3 = listFiles2;
                            i3 = length2;
                            linkedHashMap3.put(new Integer(file2.getName()), linkedHashMap4);
                        } catch (NumberFormatException unused4) {
                            it3 = it4;
                            fileArr2 = listFiles;
                            i2 = length;
                            fileArr3 = listFiles2;
                            i3 = length2;
                        }
                        i7++;
                        it4 = it3;
                        listFiles = fileArr2;
                        length = i2;
                        listFiles2 = fileArr3;
                        length2 = i3;
                    }
                    it2 = it4;
                    fileArr = listFiles;
                    i = length;
                    linkedHashMap2.put(Integer.valueOf(Integer.parseInt(file.getName())), linkedHashMap3);
                } catch (NumberFormatException unused5) {
                    it2 = it4;
                    fileArr = listFiles;
                    i = length;
                }
                i6++;
                it4 = it2;
                listFiles = fileArr;
                length = i;
                i5 = 0;
            }
            linkedHashMap.put(next.getName(), linkedHashMap2);
            i5 = 0;
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        int i10 = 0;
        for (String str2 : linkedHashMap.keySet()) {
            linkedHashMap5.put(str2, new Integer(i10));
            linkedHashMap6.put(new Integer(i10), str2);
            i10++;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it5 = linkedHashMap.keySet().iterator();
        while (it5.hasNext()) {
            String str3 = (String) it5.next();
            for (Integer num : ((LinkedHashMap) linkedHashMap.get(str3)).keySet()) {
                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                Iterator it6 = new TreeSet(((LinkedHashMap) ((LinkedHashMap) linkedHashMap.get(str3)).get(num)).keySet()).iterator();
                while (it6.hasNext()) {
                    Integer num2 = (Integer) it6.next();
                    ArrayList arrayList2 = new ArrayList();
                    for (Integer num3 : ((LinkedHashMap) ((LinkedHashMap) ((LinkedHashMap) linkedHashMap.get(str3)).get(num)).get(num2)).keySet()) {
                        arrayList2.add(num3);
                    }
                    if (arrayList2.size() != 0) {
                        Collections.sort(arrayList2);
                        if (!linkedHashMap7.containsKey(arrayList2)) {
                            linkedHashMap7.put(arrayList2, new ArrayList());
                        }
                        ((List) linkedHashMap7.get(arrayList2)).add(num2);
                    }
                }
                LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                for (List list2 : linkedHashMap7.keySet()) {
                    TreeSet treeSet = new TreeSet((Collection) linkedHashMap7.get(list2));
                    ArrayList arrayList3 = new ArrayList();
                    int intValue = ((Integer) treeSet.first()).intValue();
                    while (true) {
                        it = it5;
                        if (intValue >= ((Integer) treeSet.last()).intValue() + 1) {
                            break;
                        }
                        if (treeSet.contains(new Integer(intValue))) {
                            arrayList3.add(new Integer(intValue));
                        } else if (arrayList3.size() > 0) {
                            linkedHashMap8.put(list2, arrayList3);
                            arrayList3 = new ArrayList();
                        }
                        intValue++;
                        it5 = it;
                    }
                    if (arrayList3.size() > 0) {
                        linkedHashMap8.put(list2, arrayList3);
                    }
                    it5 = it;
                }
                Iterator it7 = it5;
                for (List list3 : linkedHashMap8.keySet()) {
                    TreeSet treeSet2 = new TreeSet(list3);
                    TreeSet treeSet3 = new TreeSet((Collection) linkedHashMap7.get(list3));
                    GEMFRange gEMFRange = new GEMFRange();
                    gEMFRange.zoom = num;
                    gEMFRange.sourceIndex = (Integer) linkedHashMap5.get(str3);
                    gEMFRange.xMin = (Integer) treeSet3.first();
                    gEMFRange.xMax = (Integer) treeSet3.last();
                    for (int intValue2 = ((Integer) treeSet2.first()).intValue(); intValue2 < ((Integer) treeSet2.last()).intValue() + 1; intValue2++) {
                        if (treeSet2.contains(new Integer(intValue2))) {
                            if (gEMFRange.yMin == null) {
                                gEMFRange.yMin = Integer.valueOf(intValue2);
                            }
                            gEMFRange.yMax = Integer.valueOf(intValue2);
                        } else if (gEMFRange.yMin != null) {
                            arrayList.add(gEMFRange);
                            gEMFRange = new GEMFRange();
                            gEMFRange.zoom = num;
                            gEMFRange.sourceIndex = (Integer) linkedHashMap5.get(str3);
                            gEMFRange.xMin = (Integer) treeSet3.first();
                            gEMFRange.xMax = (Integer) treeSet3.last();
                        }
                    }
                    if (gEMFRange.yMin != null) {
                        arrayList.add(gEMFRange);
                    }
                }
                it5 = it7;
            }
        }
        int i11 = 0;
        for (String str4 : linkedHashMap5.keySet()) {
            i11 += str4.length() + 8;
        }
        long size = (arrayList.size() * 32) + i11 + 12 + 4;
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            GEMFRange gEMFRange2 = (GEMFRange) it8.next();
            gEMFRange2.offset = Long.valueOf(size);
            for (int intValue3 = gEMFRange2.xMin.intValue(); intValue3 < gEMFRange2.xMax.intValue() + 1; intValue3++) {
                for (int intValue4 = gEMFRange2.yMin.intValue(); intValue4 < gEMFRange2.yMax.intValue() + 1; intValue4++) {
                    size += 12;
                }
            }
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "rw");
        randomAccessFile.writeInt(4);
        randomAccessFile.writeInt(256);
        randomAccessFile.writeInt(linkedHashMap5.size());
        for (String str5 : linkedHashMap5.keySet()) {
            randomAccessFile.writeInt(((Integer) linkedHashMap5.get(str5)).intValue());
            randomAccessFile.writeInt(str5.length());
            randomAccessFile.write(str5.getBytes());
        }
        randomAccessFile.writeInt(arrayList.size());
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            GEMFRange gEMFRange3 = (GEMFRange) it9.next();
            randomAccessFile.writeInt(gEMFRange3.zoom.intValue());
            randomAccessFile.writeInt(gEMFRange3.xMin.intValue());
            randomAccessFile.writeInt(gEMFRange3.xMax.intValue());
            randomAccessFile.writeInt(gEMFRange3.yMin.intValue());
            randomAccessFile.writeInt(gEMFRange3.yMax.intValue());
            randomAccessFile.writeInt(gEMFRange3.sourceIndex.intValue());
            randomAccessFile.writeLong(gEMFRange3.offset.longValue());
        }
        Iterator it10 = arrayList.iterator();
        long j = size;
        while (it10.hasNext()) {
            GEMFRange gEMFRange4 = (GEMFRange) it10.next();
            for (int intValue5 = gEMFRange4.xMin.intValue(); intValue5 < gEMFRange4.xMax.intValue() + 1; intValue5++) {
                int intValue6 = gEMFRange4.yMin.intValue();
                while (intValue6 < gEMFRange4.yMax.intValue() + 1) {
                    randomAccessFile.writeLong(j);
                    long length4 = ((File) ((LinkedHashMap) ((LinkedHashMap) ((LinkedHashMap) linkedHashMap.get(linkedHashMap6.get(gEMFRange4.sourceIndex))).get(gEMFRange4.zoom)).get(Integer.valueOf(intValue5))).get(Integer.valueOf(intValue6))).length();
                    randomAccessFile.writeInt((int) length4);
                    j += length4;
                    intValue6++;
                    it10 = it10;
                }
            }
        }
        byte[] bArr = new byte[1024];
        Iterator it11 = arrayList.iterator();
        int i12 = 0;
        while (it11.hasNext()) {
            GEMFRange gEMFRange5 = (GEMFRange) it11.next();
            for (int intValue7 = gEMFRange5.xMin.intValue(); intValue7 < gEMFRange5.xMax.intValue() + 1; intValue7++) {
                int intValue8 = gEMFRange5.yMin.intValue();
                while (intValue8 < gEMFRange5.yMax.intValue() + 1) {
                    long length5 = ((File) ((LinkedHashMap) ((LinkedHashMap) ((LinkedHashMap) linkedHashMap.get(linkedHashMap6.get(gEMFRange5.sourceIndex))).get(gEMFRange5.zoom)).get(Integer.valueOf(intValue7))).get(Integer.valueOf(intValue8))).length() + size;
                    if (length5 > FILE_SIZE_LIMIT) {
                        randomAccessFile.close();
                        i12++;
                        randomAccessFile = new RandomAccessFile(str + "-" + i12, "rw");
                        size = 0;
                    } else {
                        size = length5;
                    }
                    FileInputStream fileInputStream = new FileInputStream((File) ((LinkedHashMap) ((LinkedHashMap) ((LinkedHashMap) linkedHashMap.get(linkedHashMap6.get(gEMFRange5.sourceIndex))).get(gEMFRange5.zoom)).get(Integer.valueOf(intValue7))).get(Integer.valueOf(intValue8)));
                    LinkedHashMap linkedHashMap9 = linkedHashMap6;
                    for (int read = fileInputStream.read(bArr, 0, 1024); read != -1; read = fileInputStream.read(bArr, 0, 1024)) {
                        randomAccessFile.write(bArr, 0, read);
                    }
                    fileInputStream.close();
                    intValue8++;
                    linkedHashMap6 = linkedHashMap9;
                }
            }
        }
        randomAccessFile.close();
        openFiles();
        readHeader();
    }

    private void openFiles() throws FileNotFoundException {
        File file = new File(this.mLocation);
        this.mFiles.add(new RandomAccessFile(file, "r"));
        this.mFileNames.add(file.getPath());
        int i = 0;
        while (true) {
            i++;
            File file2 = new File(this.mLocation + "-" + i);
            if (!file2.exists()) {
                return;
            }
            this.mFiles.add(new RandomAccessFile(file2, "r"));
            this.mFileNames.add(file2.getPath());
        }
    }

    private void readHeader() throws IOException {
        RandomAccessFile randomAccessFile = this.mFiles.get(0);
        for (RandomAccessFile randomAccessFile2 : this.mFiles) {
            this.mFileSizes.add(Long.valueOf(randomAccessFile2.length()));
        }
        int readInt = randomAccessFile.readInt();
        if (readInt != 4) {
            throw new IOException(o00oOOo0.o00oOOo0("Bad file version: ", readInt));
        }
        int readInt2 = randomAccessFile.readInt();
        if (readInt2 != 256) {
            throw new IOException(o00oOOo0.o00oOOo0("Bad tile size: ", readInt2));
        }
        int readInt3 = randomAccessFile.readInt();
        for (int i = 0; i < readInt3; i++) {
            int readInt4 = randomAccessFile.readInt();
            int readInt5 = randomAccessFile.readInt();
            byte[] bArr = new byte[readInt5];
            randomAccessFile.read(bArr, 0, readInt5);
            this.mSources.put(new Integer(readInt4), new String(bArr));
        }
        int readInt6 = randomAccessFile.readInt();
        for (int i2 = 0; i2 < readInt6; i2++) {
            GEMFRange gEMFRange = new GEMFRange();
            gEMFRange.zoom = Integer.valueOf(randomAccessFile.readInt());
            gEMFRange.xMin = Integer.valueOf(randomAccessFile.readInt());
            gEMFRange.xMax = Integer.valueOf(randomAccessFile.readInt());
            gEMFRange.yMin = Integer.valueOf(randomAccessFile.readInt());
            gEMFRange.yMax = Integer.valueOf(randomAccessFile.readInt());
            gEMFRange.sourceIndex = Integer.valueOf(randomAccessFile.readInt());
            gEMFRange.offset = Long.valueOf(randomAccessFile.readLong());
            this.mRangeData.add(gEMFRange);
        }
    }

    public void acceptAnySource() {
        this.mSourceLimited = false;
    }

    public void close() throws IOException {
        for (RandomAccessFile randomAccessFile : this.mFiles) {
            randomAccessFile.close();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x015a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.InputStream getInputStream(int r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.osmdroid.util.GEMFFile.getInputStream(int, int, int):java.io.InputStream");
    }

    public String getName() {
        return this.mLocation;
    }

    public LinkedHashMap<Integer, String> getSources() {
        return this.mSources;
    }

    public Set<Integer> getZoomLevels() {
        TreeSet treeSet = new TreeSet();
        for (GEMFRange gEMFRange : this.mRangeData) {
            treeSet.add(gEMFRange.zoom);
        }
        return treeSet;
    }

    public void selectSource(int i) {
        if (this.mSources.containsKey(new Integer(i))) {
            this.mSourceLimited = true;
            this.mCurrentSource = i;
        }
    }
}
