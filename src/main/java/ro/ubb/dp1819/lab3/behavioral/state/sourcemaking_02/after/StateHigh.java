package ro.ubb.dp1819.lab3.behavioral.state.sourcemaking_02.after;

class StateHigh implements State {
    public void pull(CeilingFan wrapper) {
        wrapper.setState(new StateOff());
        System.out.println("turning off");
    }
}
