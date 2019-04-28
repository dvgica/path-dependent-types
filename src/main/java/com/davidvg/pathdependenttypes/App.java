public class App {
  public static void main(String[] args) {
    Authenticator weakAuth = new Authenticator(4);
    Authenticator strongAuth = new Authenticator(16);

    Authenticator.ApiKey weakApiKey = 
      weakAuth.new ApiKey("abcd");
    Authenticator.ApiKey strongApiKey = 
      strongAuth.new ApiKey("abcdefghijklmnop"); 
    // same as Authenticator#ApiKey in Scala

    strongAuth.knownKeys.add(weakApiKey); // compiles!
  }
}
