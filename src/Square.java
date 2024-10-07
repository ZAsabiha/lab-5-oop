class Square extends Shape {
    private double side;

    public Square(int x, int y, double side) {
        super(x, y);
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing  a Square");
    }
}

