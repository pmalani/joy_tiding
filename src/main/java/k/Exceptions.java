package k;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.TimeoutException;

@SuppressWarnings("unused")
public class Exceptions {

    @SuppressWarnings("CallToPrintStackTrace")
    void collapseExceptionClauses() {
        try {
            methodThrowsMultipleException();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }  catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    void useTryWithResource() {
        BufferedReader reader = null;
        try {
            reader = Files.newBufferedReader(Path.of("/"));
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                // ignored
            }
        }
    }

    void methodThrowsMultipleException() throws InterruptedException, TimeoutException {

    }

}
