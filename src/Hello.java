public class Hello {

  public void sayHello(String name) {
    String title = getTitle(name);
    System.out.println("Hello " + title + " " + name);
  }

  String getTitle(String name) {
    if (name.equals("namita")) {
      return "Mrs.";
    } else {
      return "Mr.";
    }
  }

  public Hello() {
  }
}
