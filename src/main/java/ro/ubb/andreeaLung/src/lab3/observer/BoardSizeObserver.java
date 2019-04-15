package lab3.observer;

public class BoardSizeObserver implements Observer {
    private Integer boardSize;

    public BoardSizeObserver(Integer boardSize) {
        this.boardSize = boardSize;
    }

    @Override
    public void update() {
        boardSize++;
        System.out.println("Board Size at the current moment: " + boardSize.toString());
    }
}
