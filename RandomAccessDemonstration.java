import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessDemonstration {
    public static void main(String[] args) throws IOException {

        RandomAccessFile raf =
                new RandomAccessFile("/media/kunal/500GB/adv_java/data.dat", "rw");

        // Write data
        raf.writeInt(250);          // 4 bytes
        raf.writeFloat(3.1415f);    // 4 bytes
        raf.writeChars("Kunal");    // 10 bytes (2 bytes per char)
        raf.writeBoolean(true);     // 1 byte

        System.out.println("Current index = " + raf.getFilePointer());

        // Move pointer to beginning
        raf.seek(0);

        // Read data
        System.out.println(raf.readInt());
        System.out.println(raf.readFloat());
        System.out.println(raf.readChar());
        System.out.println(raf.readChar());
        System.out.println(raf.readChar());
        System.out.println(raf.readChar());
        System.out.println(raf.readChar());
        System.out.println(raf.readBoolean());
        System.out.println(raf.readLine());
        raf.close();
    }
}
