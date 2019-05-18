using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ChessGame.Observers
{
    public class PrintObserver : IObserver
    {
        public void Update()
        {
            Console.WriteLine("There has been an attack!");
        }

        private IObservable observable;

        public PrintObserver(IObservable observable)
        {
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
    }
}
