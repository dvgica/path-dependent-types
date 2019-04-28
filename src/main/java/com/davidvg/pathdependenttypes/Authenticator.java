import java.util.*;

public class Authenticator {
  private Integer requiredKeyLength;

  public Authenticator(Integer requiredKeyLength) {
    this.requiredKeyLength = requiredKeyLength;
  }

  public Set knownKeys = new HashSet();

  public class ApiKey {
    public ApiKey(String key) {
      if (key.length() < requiredKeyLength)
        throw new RuntimeException("Key too short");
    }
  }
}

