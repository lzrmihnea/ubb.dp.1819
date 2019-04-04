package ro.ubb.dp1819.lab1.creational.factory.abstr;

class AbstractFactoryDemo {

    public static void main(final String[] arguments)
            throws Exception {
        IGUIFactory factory = null;
        final String appearance = randomAppearance();    // Current operating system

        if (appearance.equals("OSX")) {
            factory = new OSXFactory();
        } else if (appearance.equals("Windows")) {
            factory = new WinFactory();
        } else {
            throw new Exception("No such operating system");
        }

        final IButton button = factory.createButton();
        button.paint();
    }

    public static String randomAppearance() {
        final String[] appearanceArray = new String[3];

        appearanceArray[0] = "OSX";
        appearanceArray[1] = "Windows";
        appearanceArray[2] = "error";
        final java.util.Random random = new java.util.Random();
        final int randomNumber = random.nextInt(3);
        return appearanceArray[randomNumber];
    }
}