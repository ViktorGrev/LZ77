package LZ77Folder;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class Main {
    public static void main(String[] args) throws IOException {
        File encoderInputFile = new File("src\\text.txt");
        File encoderOutputFile = new File("src\\textEncoded.txt");
        File decoderOutputFile = new File("src\\textDecoded.txt");

        try {
            encoderOutputFile.createNewFile();
            InputStream encoderInputStream = new BufferedInputStream(new FileInputStream(encoderInputFile));
            final OutputStream encoderOutputStream =
                    new BufferedOutputStream(new FileOutputStream(encoderOutputFile));
            LZ77Encoder encoder = new LZ77Encoder();
            encoderInputStream = new BufferedInputStream(new FileInputStream(encoderInputFile));
            encoder.encode(13, 5, encoderInputStream, encoderOutputStream);
            encoderOutputStream.flush();
            encoderOutputStream.close();

            decoderOutputFile.createNewFile();
            InputStream decoderInputStream = new BufferedInputStream(new FileInputStream(encoderOutputFile));
            OutputStream decoderOutputStream = new BufferedOutputStream(new FileOutputStream(decoderOutputFile));
            LZ77Decoder decoder = new LZ77Decoder();
            decoder.decode(decoderInputStream, decoderOutputStream);
            decoderOutputStream.flush();
            decoderOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
