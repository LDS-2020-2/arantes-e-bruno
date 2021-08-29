package business.data;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;

public class FileManager {
  private File folder;

  protected FileManager(String folderName) {
    this.folder = new File(folderName);

    if (!folder.exists()) {
      folder.mkdirs();
    }

  }

  public void save(Storable storable) {
    final File file = new File(folder.getPath() + "/" + storable.getFileName());

    try (final RandomAccessFile raf = new RandomAccessFile(file, "rw")) {
      for (Map.Entry<String, String> entry : storable.getFields().entrySet()) {
        raf.writeUTF(entry.getKey() + "=" + entry.getValue());
        raf.writeUTF("\n");
      }
    } catch (IOException e) {
      System.out.println("Erro ao salvar o arquivo: " + storable.getFileName());
    }
  }

  protected void load(Storable storable) {
    final File file = new File(folder.getPath() + "/" + storable.getFileName());
    final Map<String, String> fields = new HashMap<String, String>();

    try (final RandomAccessFile raf = new RandomAccessFile(file, "r")) {
      String line;
      while ((line = raf.readLine()) != null) {
        String[] args = line.trim().split("=");
        if (args.length > 1) {
          fields.put(args[0], args[1]);
        }
      }
    } catch (IOException e) {
      System.out.println("Erro ao carregar o arquivo: " + storable.getFileName());
    }

    storable.loadFields(fields);
  }
}