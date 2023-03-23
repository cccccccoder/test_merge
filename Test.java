
public class Test {

  public void add(List<String> list, String newElement) {
      list.add(newElement);
  }


  public static void main(String[] args) {
  
      Test test = new Test();
      test.add(null, "ddd");
  }
}
