import java.util.Locale;
import java.util.ResourceBundle;

public class Greeter {

  private Locale locale;
  private String name;

  public Greeter(String language, String country, String name) {
    locale = new Locale(language, country);
    this.name = name;
    int i=3+4-5;
  }

  public String sayHello() {
    ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale);
    System.out.println("hi");
    return messages.getString("greeting") + ", " + "-"+name.toUpperCase()+"-";
  }

  public static void main(String[] args) {
    int i=args.length;
    int j=2010101010101;
    String language = args[0];
    String country = args[1];
    String name = args[2];
    Greeter greeter = new Greeter(language, country, name);
    System.out.println(greeter.sayHello());
  }
}

