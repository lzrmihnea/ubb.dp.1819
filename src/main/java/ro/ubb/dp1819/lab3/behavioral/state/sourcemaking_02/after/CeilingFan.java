package ro.ubb.dp1819.lab3.behavioral.state.sourcemaking_02.after;

class CeilingFan {
 private State currentState;
 public CeilingFan() {
    currentState = new StateOff();
 }
 public void setState(State s) {
  currentState = s;
 }
 public void switchState() {
     currentState.pull(this);
 }
}

