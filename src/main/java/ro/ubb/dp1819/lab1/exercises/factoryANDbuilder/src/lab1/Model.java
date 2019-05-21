package lab1;

interface Coffee {
    String americano = "4 cups water + 0.25 cups coffee-beans roasted";
    String cappucino = "2 cups water + 0.25 cups coffee-beans roasted + 100ml foamed milk";
    String espresso = "2 cups water + 0.25 cups coffee-beans roasted";
    String latteMacchiato ="2 cups water + 0.25 cups coffee-beans roasted + 150ml foamed milk";
    void brew();
}

class Americano implements Coffee{

    @Override
    public void brew() {
        System.out.println("Americano");
    }
}

class Cappuccino implements Coffee{

    @Override
    public void brew() {
        System.out.println("Cappuccino");
    }
}

class Espresso implements Coffee{

    @Override
    public void brew() {
        System.out.println("Espresso");
    }
}

class LatteMacchiato implements Coffee{

    @Override
    public void brew() {
        System.out.println("Latte Macchiato");
    }
}

