package schu0527;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.Random;
import java.util.concurrent.*;

public class Arrow extends JPanel implements ActionListener {

    Timer tm = new Timer(10, this);
    private boolean quick = false;
    private int x = 0;
    public int n = 0;
    private int resolutionX = 3440;
    private int resolutionY = 1440;
    private int yyy;
    private int countdown = 1000;
    private int sine;
    private double velC = Math.sin(44.5);

    private int startposX = 400;
    private int startposY = 255;

    String[] orientation = {"N", "E", "S", "W"};

    int lengthA = 4, lengthB = 6, lengthC = 8;
    int a, b;

    double x_dim = 0, y_dim = 0;

    int chaos;

    int width;
    Random r1 = new Random();
    int ran = r1.nextInt(300)+50;

    //double val for line drawing
    double p1, p2, p3, p4;

    double left = 1000;
    double right = 1000;
    double left1 = 1000;
    double right1 = 1000;
    double angle = 1;
    double angleN = 1;

    double lineX1, lineX2, lineY1, lineY2;

    double ovalX, ovalY;
    double oX, oY;
    double oX2, oY2;

    int w = 120;
    int h = 120;

    int w2 = 120;
    int h2 = 120;

    int rectX, rectY;

    double sinex, siney;

    //random number generator
    Random r = new Random();
    int random1;

    boolean flip = false;
    boolean flip2 = false;
    boolean backtrack = false;
    boolean draw = false;
    boolean placed = false;

    boolean size = false;

    boolean put = false;
    int x1, y1, a1;

    int score;

    @Override
    public void paintComponent(Graphics g){

        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;

        String label = Integer.toString(x);
        Font font = new Font("Serif", Font.PLAIN, 96);
        g2D.setFont(font);

        ///old arrows

        //g2D.setColor(Color.black);
        //g2D.drawLine(320*lengthA, 50*lengthA, 320*lengthA, 100*lengthA); ///instigator
        //g2D.drawLine(300*lengthA, 50*lengthA, 320*lengthA, 50*lengthA);
        //g2D.drawLine(300*lengthA, 50*lengthA, 330*lengthA, 20*lengthA);
        //g2D.drawLine(360*lengthA, 50*lengthA, 330*lengthA, 20*lengthA);
        //g2D.drawLine(360*lengthA, 50*lengthA, 340*lengthA, 50*lengthA); ///receiver

        //g2D.drawLine(340*lengthA, 50*lengthA, 340*lengthA, 100*lengthA);
        //g2D.drawLine(320*lengthA, 100*lengthA, 340*lengthA, 100*lengthA);

        /////second arrow
        //g2D.setColor(Color.black);
        //g2D.drawLine(320*lengthB, 50*lengthB, 320*lengthB, 100*lengthB); ///instigator
        //g2D.drawLine(300*lengthB, 50*lengthB, 320*lengthB, 50*lengthB);
        //g2D.drawLine(300*lengthB, 50*lengthB, 330*lengthB, 20*lengthB);
        //g2D.drawLine(360*lengthB, 50*lengthB, 330*lengthB, 20*lengthB);
        //g2D.drawLine(360*lengthB, 50*lengthB, 340*lengthB, 50*lengthB); ///receiver

        //g2D.drawLine(340*lengthB, 50*lengthB, 340*lengthB, 100*lengthB);
        //g2D.drawLine(320*lengthB, 100*lengthB, 340*lengthB, 100*lengthB);

        /////third arrow
        //g2D.setColor(Color.black);
        //g2D.drawLine(320*lengthB, 50*lengthB, 320*lengthB, 100*lengthB); ///instigator
        //g2D.drawLine(300*lengthB, 50*lengthB, 320*lengthB, 50*lengthB);
        //g2D.drawLine(300*lengthB, 50*lengthB, 330*lengthB, 20*lengthB);
        //g2D.drawLine(360*lengthB, 50*lengthB, 330*lengthB, 20*lengthB);
        //g2D.drawLine(360*lengthB, 50*lengthB, 340*lengthB, 50*lengthB); ///receiver

        //g2D.drawLine(340*lengthB, 50*lengthB, 340*lengthB, 100*lengthB);
        //g2D.drawLine(320*lengthB, 100*lengthB, 340*lengthB, 100*lengthB);

        ///draw the shapes
        if(x % 2 == 0){
            g2D.setColor(Color.red);
        }else{
            g2D.setColor(Color.blue);
        }
        //g2D.drawOval((int) x_dim, (int) y_dim,width, width);
        //g2D.drawOval((int) x_dim/2, (int) y_dim,width, width);
        if(x % 3 == 0){
            g2D.setColor(Color.green);
        }else{
            g2D.setColor(Color.yellow);
        }
        //g2D.drawOval((int) x_dim/4, (int) y_dim*2,width, width);

        if(x % 10 == 0){
            g2D.setColor(Color.orange);
        }else {
            g2D.setColor(Color.pink);
        }

        //g2D.drawOval((int) x_dim/8, (int) y_dim/4,width, width);

        if(x % 2 == 0){
            g2D.setColor(Color.green);
        }else{
            g2D.setColor(Color.cyan);
        }
        //g2D.drawOval((int) x_dim/6, (int) y_dim/4,width, width);

        ///slinkys that go the other way!!

        //g2D.drawOval(1000, 120, width/2, width/2);
        if(x % 2 == 0){
            g2D.setColor(Color.red);
        }else{
            g2D.setColor(Color.blue);
        }
        g2D.drawOval(1800 + (int) -x_dim, 1400 + (int) -y_dim, width/2, width/2);
        g2D.drawOval(1900 + (int) -x_dim, 1000 + (int) -y_dim, width/2, width/2);
        g2D.drawOval(2900 + (int) -x_dim, 1000 + (int) -y_dim, width/2, width/2);


        if(x % 2 == 0){
            g2D.setColor(Color.red);
        }else{
            g2D.setColor(Color.blue);
        }

        g2D.drawLine((int) p1,(int) p2,(int) p3,(int) p4);

        tm.start();
        ///headings
        g2D.drawString(label, 800, 200);
        g2D.drawString(String.valueOf(draw), 800, 280);
        g2D.drawString("newland", resolutionX/2 - 300, resolutionY-(resolutionY-200));
        g2D.drawString("click here", resolutionX-550, resolutionY-100);
        g2D.drawString(String.valueOf(score), 30, 1300);

        ///g2D.drawOval((int) ovalX, (int) ovalY, 90, 90);

        //switch for colours
        switch (chaos) {
            case 0 -> g2D.setColor(Color.red);
            case 1 -> g2D.setColor(Color.blue);
            case 2 -> g2D.setColor(Color.yellow);
            case 3 -> g2D.setColor(Color.orange);
            case 4 -> g2D.setColor(Color.cyan);
            default -> g2D.setColor(Color.pink);
        }
        //g2D.drawOval((int) oX+1000, (int) oY, w, h+h+h);

            //fancy globes
            //g2D.drawOval(resolutionX / 2, (int) oY + resolutionY / 2, w, h);
            //g2D.drawOval((int) oX2 + resolutionX / 2, (int) oY2 + resolutionY / 2, w2, h2);
            g2D.drawOval(resolutionX / 2, (int) oY + resolutionY / 3, w, h);
            g2D.drawOval((int) oX2 + resolutionX / 2, (int) oY2 + resolutionY / 3, w2, h2);

            ///Condition to draw all objects
        if(draw) {
            //random circle
            g2D.drawOval(resolutionX / 3, (int) oY2 + random1 / 100, w * 3, h * 3);
            g2D.draw3DRect((int) oX2 + resolutionX / 2, (int) oY2 + resolutionY / 3, w * 2, h, true);
            //leftmost rectangle
            g2D.draw3DRect((int) oX2 + resolutionX / 4, (int) oY2 + resolutionY / 4, w * 2, h * 4, true);


            //g2D.drawLine((int) lineX1, (int) lineY1, (int) lineX2, (int) lineY2);
            //g2D.drawLine(resolutionX / 2 + h, resolutionY / 2, (3400 / 2) * 2, w2 * h);
            //g2D.drawLine((480), h2, 1, w2 * h);



            //player
            g2D.fillRect(startposX + rectX, startposY + rectY, 15, 15);

            //grid
            for (int i = 100; i > 0; i = i - 20) {
                //vertical
                g2D.drawLine(200 + 6 * i, 800, 200 + 6 * i, 800);

                //horizontal
                g2D.drawLine(800, 200 + 6 * i, 800, 200 + 6 * i);

                for (int j = 0; j < 200; j++) {
                    g2D.drawLine(resolutionY, 8 * j, resolutionY, 8 * j);
                }
            }
            for (int i = 100; i > 0; i = i - 10) {
                g2D.drawLine(200 + 8 * i, 200, 200 + 8 * i, 1000);
                g2D.drawLine(200, 200 + 8 * i, 1000, 200 + 8 * i);
            }

            g2D.setColor(Color.green);
            //obstacles
            g2D.fillRect(200 + 8 * 20, 280, 80, 480);
            g2D.fillRect(200 + 8 * 40, 280, 80, 320);
            g2D.fillRect(200 + 8 * 40, 280, 320, 80 + h*2);
            g2D.fillRect(280, 200 + 8 * 40, 80, 320);
            g2D.fillRect(200 + 8 * 20, 680, 480, 80);
            //bounds
            g2D.fillRect(120, 240, 80, 680);
            g2D.fillRect(120, 120, 720, 80);
            g2D.fillRect(920, 320, 80, 640);
            g2D.fillRect(120, 920, 880, 80);
        }
        ///end condition

        //sine wave
        g2D.drawOval((int) sinex, (int) siney + 500, 50, 50);

        //buildings
        int start = 200;
        int[] addY = {43, 40, 410, 670, 200, 210, 290, 45, 67, 16};
        int[] addX = {12, 2, 4, 33, 20, 7, 21, 11, 23, 4};
        for(int i = 0; i < 10; i=i+1){
            g2D.drawRect((start+i*100)+addX[i], (1300-i*10)-addY[i], 50+addX[i], i+ran*ran);
        }

        //orbiting circle
        g2D.drawOval((int) left+2200, (int) right+600, 50, 50);
        //g2D.drawOval((int) left+1050+(int)left1, (int) right+1050+(int)right1, 20, 20);
        g2D.fillOval(2200, 600, 10, 10);

        //funky
        g2D.setColor(Color.green);
        drawFunky(g);
        drawBox(g);
        drawCube(g);
        drawCube1(g);

        //////////////////////////////////////////////////////////////////////

        if(draw){
        }
        if(put){
            //drawSquare(g);
        }
        if(placed){
            drawBall(g, 50, 50);
        }
        if(size){
            a1 = a;
        }
        repaint();
    }


    /*
    TIMER
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        PointerInfo mouse = MouseInfo.getPointerInfo();
        Point m = mouse.getLocation();
        a = (int) m.getX();
        b = (int) m.getY();

        angle = angle + 1/100.0;
        angleN = angleN + Math.PI/10;
        left = 300 * Math.sin(angle);
        right = 100 * Math.cos(angle);

        right1 = 30 * Math.sin(angle);
        left1 =  30 * Math.cos(angle);

        random1 = r.nextInt(500);
        sine = sine + 10;
        x = x + 1;
        n = n + 1;
        countdown = countdown - 1;

        p1 = 800;
        p2 = 400;

        //top line
        if(x % 2 == 0){
            p3 = p3+x/100.0;
        }else{
            p3 = p3+x/10.0;
        }
        if(x > 300){
            //x = -x;
            p3 = p3 + x/10.0;
        }

        ovalX = ovalX + Math.sin(45);
        ovalY = ovalY + Math.cos(45);

        if(ovalY > 440){
            ovalY = ovalY + Math.sin(-45);
        }
        if(ovalX > 2000){
            ovalY = ovalY + 3;
        }

        //set bounds
        if(oY > resolutionY || oY < 0){
            oY = 0;
            w = w + 50;
            h = h + 50;
        }
        if(oX > 3400 || oX < 0){
            oX = 0;
        }



        //first ball
        if(h >= 0 && !flip){
            h = h - 5;
            oY = oY + 2.5;
        }
        if(h == 0){
            flip = true;
        }
        if(h < 120 && flip){
            h = h + 5;
            oY = oY - 2.5;
        }
        if(h == 120 && w2 == 120){
            flip = false;
        }

        //second ball
        if(w2 >= 0 && !flip2){
            w2 = w2 - 5;
            oX2 = oX2 + 2.5;
        }
        if(w2 == 0){
            flip2 = true;
        }
        if(w2 < 120 && flip2){
            w2 = w2 + 5;
            oX2 = oX2 - 2.5;
        }
        if(w2 == 120){
            flip2 = false;
        }


        chaos = random1 % 5;

        lineX1 = 600;
        lineX2 = 1800;

        lineY1 = 280;
        lineY2 = 280;

        //oX = oX + (x/1000.0) * (random1*Math.sin(random1));
        //oY = oY + (x/1000.0) * (random1*Math.sin(random1));


        //condition to reverse movement
        if(sinex >= 0 && !backtrack){
            sinex = sinex + 1;
        }
        if(sinex == resolutionX/4 + w/4 - 50){
            backtrack = true;
        }
        if(backtrack){
            sinex = sinex - 1;
        }
        if(sinex == 0){
            backtrack = false;
        }

        siney = 100*Math.sin(sinex/100);

        System.out.println((int) (Math.sin(angle)*10));


        //slinky calc
        sine = sine + x*sine;
        velC = velC*Math.sin(sine);
        boolean check = false;

        if(x % 5 == 0){
            y_dim = y_dim * 5/x;
        }
        if(x % 2 != 0){
            x_dim = x_dim + velC;
        }else{
            x_dim = x_dim + x;
            y_dim = y_dim + x;
        }

        //make the slinky's come forward
        if(x > 800){
            if(width % 2 == 0){
                width = width + x/1000;
            }else{
                width = width + x/1000 + x/100;
            }

        }else{
            width = 50;
        }


        if(x_dim > 800){
            x_dim = 0;
            y_dim = y_dim + x;
        }
        if(y_dim > 1000){
            y_dim = 0;
            check = true;
        }
        if(x_dim < 20 && check){
            x_dim = 1001 + x;
            y_dim = 300 + velC;
        }

        //reset
        if(x > 2000 && x < 2100){
            x_dim = 0;
            y_dim = 0;
            width = 0;
        }else{
            x_dim = x_dim;
            y_dim = y_dim;
            width = width;
        }

        //calculate score
        if(rectX >= oX2+(resolutionX/4) - startposX && rectX <= oX2+(resolutionX/4) - startposX + w*2
                && rectY >= oY2+(resolutionY/4) - startposY && rectY <= oY2+(resolutionY/4) - startposY + h*4){
            score = score + 1;
        }


        repaint();
    }

    public void drawBall(Graphics g, int width, int height){

        yyy = y1 + 4*n*n - 20;
        g.drawOval(x1, yyy, width, height);


        repaint();


        //g.drawOval(x1, y1, 50+(a1), 50+(a1));

    }
    public void drawSquare(Graphics g){
        g.draw3DRect(x1, y1, 100, 100, false);
    }

    public void drawCube(Graphics g){
        double rotX1, rotX2, rotX3, rotX4, rotY1, rotY2, rotY3, rotY4;
        double interval = 11.25*5;
        //1 3 4 2
        rotX1 = interval * Math.cos(angle+90);
        rotX2 = interval * Math.cos(angle+360);
        rotX3 = interval * Math.cos(angle+180);
        rotX4 = interval * Math.cos(angle+270);
        rotY1 = interval * Math.sin(angle+90);
        rotY2 = interval * Math.sin(angle+360);
        rotY3 = interval * Math.sin(angle+180);
        rotY4 = interval * Math.sin(angle+270);
        int[] x = {100+(int)rotX1, 140+(int)rotX2, 180+(int)rotX3, 140+(int)rotX4};
        int[] y = {300+(int)rotY1, 280+(int)rotY2, 300+(int)rotY3, 320+(int)rotY4};
        g.drawPolygon(x, y, 4);
        int[] d = {100+(int)rotX1, 140+(int)rotX2, 180+(int)rotX3, 140+(int)rotX4};
        int[] c = {300+45+(int)rotY1, 280+45+(int)rotY2, 300+45+(int)rotY3, 320+45+(int)rotY4};
        g.drawPolygon(d, c, 4);
        g.drawLine(100+(int)rotX1, 300+(int)rotY1, 100+(int)rotX1, 345+(int)rotY1);
        g.drawLine(180+(int)rotX3, 300+(int)rotY3, 180+(int)rotX3, 345+(int)rotY3);

        g.drawLine(140+(int)rotX4, 320+(int)rotY4, 140+(int)rotX4, 365+(int)rotY4);
        g.drawLine(140+(int)rotX2, 280+(int)rotY2, 140+(int)rotX2, 325+(int)rotY2);
    }
    public void drawCube1(Graphics g){
        int n = (int) (90*Math.cos(angle));
        int z = (int) (90*Math.sin(angle)*2);
        int f = (int) (-90*Math.cos(angle));
        int s = (int) (-90*Math.sin(angle)*2);
        int[] x = {800+n, 850+z, 900+f, 860+s};
        int[] y = {455, 450, 455, 475};

        int[] d = {800+n, 850+z, 900+f, 860+s};
        int[] c = {505, 500, 505, 525};
        g.drawPolygon(x, y, 4);
        g.drawPolygon(d, c, 4);

        g.drawLine(800+n, 455, 800+n, 505);
        g.drawLine(850+z, 450, 850+z, 500);
        g.drawLine(900+f, 455, 900+f, 505);
        g.drawLine(860+s, 475, 860+s, 525);

    }

    public void drawTriangle(Graphics g){
        int[] x = {100, 200, 300};
        int[] y = {200, 100, 400};
        g.drawPolygon(x, y, 3);
    }
    public void drawFunky(Graphics g){
        int n = (int) (90*Math.cos(angle));
        int z = (int) (90*Math.sin(angle)*2);
        int f = (int) (-90*Math.cos(angle));
        int s = (int) (-90*Math.sin(angle)*2);

        int[] x = {2200+n, 2300+z, 2400+f, 2300+s};
        int[] y = {1200-n, 1100, 1200-n, 1300};

        g.drawPolygon(x, y, 4);
    }
    public void drawBox(Graphics g){
        int n = (int) (90*Math.cos(angle));
        int z = (int) (90*Math.sin(angle));
        int f = (int) (-90*Math.cos(angle));
        int s = (int) (-90*Math.sin(angle));

        int[] x = {2000+n, 2400+z, 2400+f, 2000+s};
        int[] y = {900, 900, 800, 800};

        g.drawPolygon(x, y, 4);
    }

}
