class Fish extends AbstractAnimal{
    @Override
    public void move() {
            System.out.println("fish swims on water");

    }
    public static void main(String[] args) {
        Fish f1=new Fish();
        f1.eat();
        f1.sleep();
        f1.move();
    }
}