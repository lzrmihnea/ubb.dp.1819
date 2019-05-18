namespace ChessGame.Observers
{
    public interface IObservable
    {
        void NotifyAllObservers();
        void Attach(IObserver observer);
        void Dettach(IObserver observer);
        
    }
}
