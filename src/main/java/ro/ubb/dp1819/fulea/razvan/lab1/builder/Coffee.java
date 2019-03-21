package ro.ubb.dp1819.fulea.razvan.lab1.builder;

class Coffee {
    private Integer waterCups;
    private Double beanCups;
    private Integer milk;
    private Integer whiskey;

    private Coffee(CoffeeBuilder builder){
        this.waterCups = builder.waterCups;
        this.beanCups = builder.beanCups;
        this.milk = builder.milk;
        this.whiskey = builder.whiskey;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "waterCups=" + waterCups +
                ", beanCups=" + beanCups +
                ", milk=" + milk +
                ", whiskey=" + whiskey +
                '}';
    }

    static class CoffeeBuilder{
        private Integer waterCups;
        private Double beanCups;
        private Integer milk;
        private Integer whiskey;

        CoffeeBuilder(){

        }

        public CoffeeBuilder waterCups(Integer waterCups){
            this.waterCups = waterCups;
            return this;
        }

        public CoffeeBuilder beanCups(Double beanCups){
            this.beanCups = beanCups;
            return this;
        }

        public CoffeeBuilder milk(Integer milk){
            this.milk = milk;
            return this;
        }

        public CoffeeBuilder whiskey(Integer whiskey){
            this.whiskey = whiskey;
            return this;
        }

        Coffee build(){
            return new Coffee(this);
        }
    }

}
