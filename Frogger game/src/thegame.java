
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
/*import static java.lang.Math.abs;
import static java.lang.Math.sqrt;*/

public class thegame extends javax.swing.JFrame implements KeyListener {
    ///////////   Globals  !

    MyTimer timer = new MyTimer();

    BufferedImage bi;
    Graphics big;

    int frogX = 350;
    int frogY = 755;

    int car1X = -40;
    int car1Y = 695;

    int leftwheel1X = -30;
    int leftwheel1Y = 690;
    int rightwheel1X = -10;
    int rightwheel1Y = 710;
    
    int car11X = -210 ;
    int car11Y =  695  ;
    
    int leftwheel11X = -200;
    int leftwheel11Y = 690;
    int rightwheel11X = -180;
    int rightwheel11Y = 710;
    
    int car12X = -380 ;
    int car12Y =  695  ;
    
    int leftwheel12X = -370;
    int leftwheel12Y = 690;
    int rightwheel12X = -350;
    int rightwheel12Y = 710;
    
   
    /* int car2X = 800;
    int car2Y = 545;

    int leftwheel2X = 810;
    int leftwheel2Y = 540;
    int rightwheel2X = 830;
    int rightwheel2Y = 560;

    int car3X = 10;
    int car3Y = 400;
     */
    
    
    
    
    int log1X = -20;
    int log1Y = 365;
    int log11X = 140;
    int log11Y = 365;    
    int log12X = 300;
    int log12Y = 365;
    int log13X = 460;
    int log13Y = 365;
    int log14X = 620;
    int log14Y = 365;
    
    
    int log2X = -20;
    int log2Y = 310;
    int log21X = 180;
    int log21Y = 310;
    int log22X = 380;
    int log22Y = 310;
    int log23X = 580;
    int log23Y = 310;
    //int log24X = 620;
    //int log24Y = 310;
    
    
    int log3X = -80;
    int log3Y = 255;
    int log31X = 80;
    int log31Y = 255;
    int log32X = 240;
    int log32Y = 255;
    int log33X = 400;
    int log33Y = 255;
    int log34X = 560;
    int log34Y = 255;
    
    
    int log4X = -20;
    int log4Y = 200;
    int log41X = 140;
    int log41Y = 200;
    int log42X = 300;
    int log42Y = 200;
    int log43X = 460;
    int log43Y = 200;
    int log44X = 620;
    int log44Y = 200;
    
    int log5X = -20;
    int log5Y = 145;
    int log51X = 240;
    int log51Y = 145;
    int log52X = 500;
    int log52Y = 145;
    
    
    int log6X = -20;
    int log6Y = 90;
    int log61X = 140;
    int log61Y = 90;
    int log62X = 300;
    int log62Y = 90;
    int log63X = 460;
    int log63Y = 90;
    int log64X = 620;
    int log64Y = 90;
    
    
    public thegame() {
        initComponents();
        setSize(800, 800);
        addKeyListener(this);

        bi = (BufferedImage) createImage(800, 800);
        big = bi.createGraphics();

        timer.start();
    }

   
    public void paint(Graphics g) {

        //background
        big.setColor(Color.black);
        big.fillRect(0, 0, 800, 800);

        //startline
        Color purple = new Color(151, 0, 222);
        big.setColor(purple);
        big.fillRect(0, 740, 800, 60);
        
        //water
        Color myBlue = new Color(0,0,71);
        big.setColor(myBlue);
        big.fillRect(0,0, 800, 411);
        //center line
        big.setColor(purple);
        big.fillRect(0, 410, 800, 50);
        
        //endline
        big.setColor(Color.green);
        big.fillRect(0, 0, 800, 80);
        
        //BLUE LANDING SPACE
            big.setColor(myBlue);
            big.fillRect(50,35,70, 80);
            big.fillRect(260,35,70, 80);
            big.fillRect(470,35,70, 80);
            big.fillRect(680,35,70, 80);
            
        //Dividers    !!!!!!!!!!!
        Color grey = new Color(128, 128, 128);
        big.setColor(grey);
        big.drawLine(0,680,800,680);
        
       
        

            
                
            Color myYellow = new Color(216, 222, 0);
               //Car 1  
               
                big.setColor(myYellow);
                big.fillOval(car1X, car1Y, 50, 20);
                //wheels
                big.setColor(Color.red);
                big.fillOval(leftwheel1X, leftwheel1Y, 10, 10);
                big.fillOval(rightwheel1X, leftwheel1Y, 10, 10);
                big.fillOval(leftwheel1X, rightwheel1Y, 10, 10);
                big.fillOval(rightwheel1X, rightwheel1Y, 10, 10);

               

//  line 1 car 2
                big.setColor(myYellow);
                big.fillOval(car11X , car11Y, 50, 20);
//  wheels
                big.setColor(Color.red);
                big.fillOval(leftwheel11X , leftwheel11Y, 10, 10);
                big.fillOval(rightwheel11X , leftwheel11Y, 10, 10);
                big.fillOval(leftwheel11X , rightwheel11Y, 10, 10);
                big.fillOval(rightwheel11X , rightwheel11Y, 10, 10);
                
// line 1 car 2
                big.setColor(myYellow);
                big.fillOval(car12X , car12Y, 50, 20);
                //wheels
                big.setColor(Color.red);
                big.fillOval(leftwheel12X , leftwheel12Y, 10, 10);
                big.fillOval(rightwheel12X , leftwheel12Y, 10, 10);
                big.fillOval(leftwheel12X , rightwheel12Y, 10, 10);
                big.fillOval(rightwheel12X , rightwheel12Y, 10, 10);
                
                //big.setColor(Color.pink);
               // big.drawRect(car1X, car1Y, 50, 15);
/* 
//  Car 2
                big.setColor(Color.green);
                big.fillOval(car2X, car2Y, 50, 20);
//  wheels
                big.setColor(Color.white);
                big.fillOval(leftwheel2X, leftwheel2Y, 10, 10);
                big.fillOval(rightwheel2X, leftwheel2Y, 10, 10);
                big.fillOval(leftwheel2X, rightwheel2Y, 10, 10);
                big.fillOval(rightwheel2X, rightwheel2Y, 10, 10);
//   line 2 car 2
                big.setColor(Color.green);
                big.fillOval(car2X - 170, car2Y, 50, 20);

                big.setColor(Color.white);
                big.fillOval(leftwheel2X - 170, leftwheel2Y, 10, 10);
                big.fillOval(rightwheel2X - 170, leftwheel2Y, 10, 10);
                big.fillOval(leftwheel2X - 170, rightwheel2Y, 10, 10);
                big.fillOval(rightwheel2X - 170, rightwheel2Y, 10, 10);

                big.setColor(Color.green);
                big.fillOval(car2X - 300, car2Y, 50, 20);

                big.setColor(Color.white);
                big.fillOval(leftwheel2X - 300, leftwheel2Y, 10, 10);
                big.fillOval(rightwheel2X - 300, leftwheel2Y, 10, 10);
                big.fillOval(leftwheel2X - 300, rightwheel2Y, 10, 10);
                big.fillOval(rightwheel2X - 300, rightwheel2Y, 10, 10);

// car3
                big.setColor(Color.magenta);
                big.fillRect(car3X, car3Y, 20, 20);

                big.setColor(Color.cyan);
                big.fillOval(frogX, frogY, WIDTH, HEIGHT);*/



// Loggggggggg !!!
                Color brown = new Color(222, 104, 71);
                big.setColor(brown);
       //first log...from down       
                big.fillRect(log1X, log1Y, 100, 30);
                big.fillRect(log11X, log11Y, 100, 30);
                big.fillRect(log12X, log12Y, 100, 30);
                big.fillRect(log13X, log13Y, 100, 30);
                big.fillRect(log14X, log14Y, 100, 30);
       //second log          
                big.fillRect(log2X, log2Y, 150, 30);
                big.fillRect(log21X, log21Y, 150, 30);
                big.fillRect(log22X, log22Y, 150, 30);
                big.fillRect(log23X, log23Y, 150, 30);
                
        //third log      
                big.fillRect(log3X , log3Y, 100, 30);
                big.fillRect(log31X, log31Y, 100, 30);
                big.fillRect(log32X, log32Y, 100, 30);
                big.fillRect(log33X, log33Y, 100, 30);
                big.fillRect(log34X, log34Y, 100, 30);
        //fourth log           
                big.fillRect(log4X , log4Y, 100, 30);
                big.fillRect(log41X, log41Y, 100, 30);
                big.fillRect(log42X, log42Y, 100, 30);
                big.fillRect(log43X, log43Y, 100, 30);
                big.fillRect(log44X, log44Y, 100, 30);
                
        //fifth log           
                big.fillRect(log5X , log5Y , 190, 30);
                big.fillRect(log51X, log51Y, 190, 30);
                big.fillRect(log52X, log52Y, 190, 30);
                
        //sixth log           
                big.fillRect(log6X , log6Y, 100, 30);
                big.fillRect(log61X, log61Y, 100, 30);
                big.fillRect(log62X, log62Y, 100, 30);
                big.fillRect(log63X, log63Y, 100, 30);
                big.fillRect(log64X, log64Y, 100, 30);
                
                
                
            //THE FROGGGGGGGGG
            Color myGreen = new Color(21, 207, 0);
            big.setColor(Color.green);
            big.fillOval(frogX, frogY, 20, 20);    
                
                

        g.drawImage(bi, 0, 0, 800, 800, rootPane);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(thegame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(thegame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(thegame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(thegame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new thegame().setVisible(true);
        });
    }

    public void keyTyped(KeyEvent e) {
        System.out.println("TYPED !!");

    }

   
    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();
        System.out.println("Pressed !! " + key);
        if (key == 37) {
            frogX -= 55;
        }
        if (key == 39) {
            frogX += 55;
        }
        if (key == 38) {
            frogY -= 55;
        }
        if (key == 40) {
            frogY += 55;
        }

        repaint();
    }

  
    public void keyReleased(KeyEvent e) {
        System.out.println("TYPED !!");

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
   
    
   /* public boolean CircleCollide(int fx, int fy, int r1, int cx, int cy, int r2){
        
        int dx = abs(fx-cx);
        int dy = abs(fy-cx);
        int total = (dx*dx)+(dy*dy);
       double sq = sqrt(total);
       double radiusDist = r1+r2;
       if(radiusDist> total){
             return(true);
       }
               return(false);
    }*/
    
    
    
    public boolean DidCollide(double fx, double fy, double fw, double fh, double cx, double cy, double cw, double ch){

        if (fx + fw > cx) {//frog right > car left
            if (fx < cx + cw) {//frog left < car right 
                if (fy + fh > cy) {// frog bottom > car top
                    if (fy < cy + ch) {//frog  top < car bottom 
                        return (true);//we collided !!!!
                    }
                }
            }

        }

        return (false);


    }

    class MyTimer extends Thread {

       
        public void run() {

            while (true) {

                //car 1
                car1X += 5;
                leftwheel1X += 5;
                rightwheel1X += 5;
                //car 11
                car11X += 5;
                leftwheel11X += 5;
                rightwheel11X += 5;
                //car 12
                car12X += 5;
                leftwheel12X += 5;
                rightwheel12X += 5;

                /* //car2
                car2X -= 7;
                leftwheel2X -= 7;
                rightwheel2X -= 7;

                //car3\
                car3X += 9;  */
                
                //log
                
                log1X += 5;
                log11X += 5;
                log12X += 5;
                log13X += 5;
                log14X += 5;
                
                log3X += 5;
                log31X += 5;
                log32X += 5;
                log33X += 5;
                log34X += 5;
                
                log4X += 5;
                log41X += 5;
                log42X += 5;
                log43X += 5;
                log44X += 5;
                
               

                
                if (car1X >= 805) {car1X = -40;leftwheel1X = -30;rightwheel1X = -10;}
                 if (car11X >= 805) {car11X = -40;leftwheel11X = -30;rightwheel11X = -10;}
                 if (car12X >= 805) {car12X = -40;leftwheel12X = -30;rightwheel12X = -10;}
                /* if (car2X <= 10) {car2X = 740;leftwheel2X = 750;rightwheel2X = 770;}
                if (car3X > 780) {car3X = 10;}*/

                
                if(log1X > 800){log1X = -100;}
                if(log11X > 800){log11X = -100;}
                if(log12X > 800){log12X = -100;}
                if(log13X > 800){log13X = -100;}
                if(log14X > 800){log14X = -100;}
                
               /* if(log2X > 800){log2X = -100;}
                if(log21X > 800){log21X = -100;}
                if(log22X > 800){log22X = -100;}
                if(log23X > 800){log23X = -100;}
                if(log24X > 800){log24X = -100;}*/
                
                if(log3X > 800){log3X = -100;}
                if(log31X > 800){log31X = -100;}
                if(log32X > 800){log32X = -100;}
                if(log33X > 800){log33X = -100;}
                if(log34X > 800){log34X = -100;}
                
                if(log4X > 800){log4X = -100;}
                if(log41X > 800){log41X = -100;}
                if(log42X > 800){log42X = -100;}
                if(log43X > 800){log43X = -100;}
                if(log44X > 800){log44X = -100;}
                
                

                // CHECK COLLISION
                
                //car1
                boolean hit1 = DidCollide(frogX, frogY, 40, 40, car1X, car1Y, 50, 15);
                boolean hitWheels1 = DidCollide(frogX, frogY, 40, 40, car1X+5, car1Y-5, 10, 30);
                //car11
                boolean hit11 = DidCollide(frogX, frogY, 40, 40, car11X, car11Y, 50, 20);
                boolean hitWheels11 = DidCollide(frogX, frogY, 40, 40, car11X+5, car11Y-5, 20, 30);
                //car12
                boolean hit12 = DidCollide(frogX, frogY, 40, 40, car12X, car12Y, 50, 20);
                boolean hitWheels12 = DidCollide(frogX, frogY, 40, 40, car12X+5, car12Y-5,20, 30);
                //car112
                /*boolean hit11 = DidCollide(frogX, frogY, 40, 40, car13X, car13Y, 50, 20);
                boolean hitWheels11 = DidCollide(frogX, frogY, 40, 40, car13X+5, car13Y-5, 30, 30);*/
                
              
                if (hit1 == true || hitWheels1 ||  hit11 || hitWheels11 ||  hit12 || hitWheels12) {
                    frogX = 350;
                    frogY = 755;

                }

                repaint();
                try {
                    sleep(50);
                } catch (Exception e) {
                    System.out.println("sleeping");
                }

            }

        }

    }

}
