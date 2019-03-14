package ro.ubb.dp1819.lab2.structural.facade.computer;

class Client {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }
}