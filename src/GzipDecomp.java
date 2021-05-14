import java.io.IOException;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.GZIPInputStream;

public class GzipDecomp {
    static Object _obj; 

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        GzipDecomp.unzip(Paths.get("sample.txt.gz"), Paths.get("sample.txt"));
    }
    public static void unzip(Path src, Path dst) {
        try (GZIPInputStream in = new GZIPInputStream(Files.newInputStream(src));
             OutputStream out = Files.newOutputStream(dst)) {
            int len;
            byte[] b = new byte[1024 * 4];
            while ((len = in.read(b)) != -1) {
                out.write(b, 0, len);
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}