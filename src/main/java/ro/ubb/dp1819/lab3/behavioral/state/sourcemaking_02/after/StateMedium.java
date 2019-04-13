package ro.ubb.dp1819.lab3.behavioral.state.sourcemaking_02.after;

class StateMedium implements State {
    public void pull(CeilingFan wrapper) {
        wrapper.setState(new StateHigh());
        System.out.println("high speed");
    }
}

