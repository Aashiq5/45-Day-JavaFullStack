class Bird extends AbstractAnimal{
    @Override
    public void move() {
        System.out.println("bird flies on wings");
    }

    public static void main(String[] args) {
        Bird b1=new Bird();
        b1.eat();
        b1.sleep();
        b1.move();
    }
}