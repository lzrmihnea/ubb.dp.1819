using System;

namespace ChessGame.Observers
{
    public class KillCounterObserver : IObserver
    {
        private int counter;
        private IObservable observable;

        public KillCounterObserver(IObservable observable)
        {
            counter = 0;
            this.observable = observable;
        }

        public void Subscribe()
        {
            observable.Attach(this);

        }

        public void Unsubscribe()
        {
            observable.Dettach(this);
        }

        public void Update()
        {
            counter++;
            Console.WriteLine("This is the attack number "+counter);
        }
    }
}
