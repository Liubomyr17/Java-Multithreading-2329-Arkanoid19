package com.company;

public class Stand extends BaseObject {
    private double speed = 1;
    private double direction = 0;
    public Stand(double x, double y) {
        super(x, y, 3);
    }

    void move() {
        double dx = speed*direction;
        x=x+dx;
    }
    void moveLeft() {
        direction = -1;
    }
    void moveRight() {
        direction = 1;
    }
    public double getSpeed() {
        return speed;
    }
    public double getDirection() {
        return direction;
    }
    @Override
    void draw(Canvas canvas) {}
}
