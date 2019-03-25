package ro.ubb.dp1819.lab2.structural.decorator.window;

public class DecoratedWindowRunner {
 public static void main(String[] args) {
  Window decoratedWindow =
   new HorizontalScrollBarDecorator(
    new VerticalScrollBarDecorator(
     new SimpleWindow()));

  System.out.println(decoratedWindow
          .getDescription());
  }
}
