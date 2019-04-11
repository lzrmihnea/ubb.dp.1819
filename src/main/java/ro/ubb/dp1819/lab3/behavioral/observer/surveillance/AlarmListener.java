package ro.ubb.dp1819.lab3.behavioral.observer.surveillance;


interface AlarmListener {
  void alarm();
}

class Lighting implements AlarmListener {
  public void alarm() {
    System.out.println("lights up");
  }
}

class Gates implements AlarmListener {
  public void alarm() {
    System.out.println("gates close");
  }
}
