class NewPrinter extends Thread {
    public NewPrinter(String name){super(name);}

    @Override
    public void run() {
        System.out.println("running " + getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("finished " + getName());
    }


}