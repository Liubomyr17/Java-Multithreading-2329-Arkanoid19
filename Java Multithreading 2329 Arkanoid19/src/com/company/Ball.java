package com.company;

public class Ball extends BaseObject {
   private double speed;
   private double direction;
   private double dx;
   private double dy;
   private boolean isFrozen;

    public Ball(double x, double y, double radius, double speed, double direction, double dx, double dy) {
        super(x, y, 1);
        this.speed = speed;
        this.direction = direction;
        this.isFrozen = true;
        }
    public double getSpeed () {
        return speed;
    }

    public double getDirection() {
        return direction;
    }

    public double getDx() {
        return dx;
    }

    public double getDy() {
        return dy;
    }

    void setDirection(double direction) {
        this.direction = direction;
        double angel = Math.toRadians(direction);
        dx = Math.cos(angel)*speed;
        dy = -Math.sin(angel)*speed;
    }
    void checkRebound(int minx, int maxx, int miny, int maxy) {
        
    }


    @java.lang.Override
    void draw(Canvas canvas) {
        canvas.setPoint(x, y, 'O');

    }

    @java.lang.Override
    void move() {
        if (isFrozen) return;
        x+=dx;
        y+=dy;
    }
    void start() {
        this.isFrozen = false;
    }
}

