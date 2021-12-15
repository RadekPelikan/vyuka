package cz.spsmb.vyuka.zaklady.nase_animace;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SpaceShip implements KeyListener {

    private double dx;
    private double dy;
    private int x = 40;
    private int y = 60;
    private int w;
    private int h;
    private int xMax;
    private int yMax;
    private int c = 0;

    public SpaceShip(int xMax, int yMax) {
        ImageIcon ii = new ImageIcon("src/resources/craft.png");
        this.image = ii.getImage();
        this.w = image.getWidth(null);
        this.h = image.getHeight(null);
        this.xMax = xMax;
        this.yMax = yMax;
    }

    private Image image;

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = -2;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 2;
        }

        if (key == KeyEvent.VK_UP) {
            dy = -2;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 2;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        return image;
    }

    public void move() {
//        System.out.println(this.y);
        this.x += this.dx;
        this.y += this.dy;
        if (this.x + this.w > this.xMax + c) {
            this.x = 0;
        } else if (this.y + this.h > this.yMax + c) {
            this.y = 0;
        } else if (this.x < 0 - c) {
            this.x = this.xMax;
        } else if (this.y < 0 - c) {
            this.y = this.yMax;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }
}
