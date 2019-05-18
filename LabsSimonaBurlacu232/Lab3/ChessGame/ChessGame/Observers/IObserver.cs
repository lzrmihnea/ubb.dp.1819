namespace ChessGame.Observers
{
    public interface IObserver
    {
        void Update();
        void Subscribe();
        void Unsubscribe();
    }
}
