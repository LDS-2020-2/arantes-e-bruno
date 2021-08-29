package business.data;

import java.util.Map;

public interface Storable {
  String getFileName();

  Map<String, String> getFields();

  void loadFields(final Map<String, String> fields);
}