public class TrioDriver {

  public static void main(String[] args) {
    QQKachoo<String> queue = new QQKachoo<String>();

    queue.add("Duck");
    queue.add("Cat");
    queue.add("Dog");

    System.out.println(queue.peekFirst());
    System.out.println(queue.peekLast());

    System.out.println(queue.remove());
    System.out.println(queue.removeLast());
    System.out.println(queue.removeFirst());
    try {System.out.println(queue.removeLast());}
    catch (Exception e) {System.out.println("Error caught");}
  }

}
