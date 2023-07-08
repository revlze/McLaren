import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

public class Main {
  public static void main(String[] args) {
    JFrame jFrame = getJFrame();
    jFrame.add(new MyComponent());
  }

  static class MyComponent extends JComponent {
    @Override
    protected void paintComponent(Graphics g1) {
      Graphics2D g = (Graphics2D) g1;
      g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON); //сглаживание
      g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      g.setColor(Color.white);
      g.fillRect(-1,-1,2099,2999);
      g.setColor(Color.black);
      g.setStroke(new BasicStroke(3));
      //roof
      Path2D.Double roof = new Path2D.Double();
      roof.moveTo(450,313);
      roof.curveTo(620, 240,710,245,900,329);
      roof.moveTo(730,270);
      roof.curveTo(790,300,810,310,860,334);
      g.draw(roof);
      g.setStroke(new BasicStroke(2));
      Path2D.Double hoodLine = new Path2D.Double();
      hoodLine.moveTo(902,329);
      hoodLine.lineTo(898,368);
      g.draw(hoodLine);
      g.setStroke(new BasicStroke(3));
      g.drawArc(200,313,450,200,60,75);
      //hood
      g.drawArc(650,330,550,350,46,60);
      g.drawArc(1090,377,30,15,35,-45);
      g.drawLine(1118,388,1100,440);

      g.drawArc(922,432, 200,30,35,-127);
      g.drawArc(1070,432,30,15,0,-85);
      g.drawLine(1085,446,1020,447);
      //wheel
      g.drawArc(860,358,160,170,-12,205);
      //footrest
      g.drawLine(860,462,458,462);
      //wheel2
      g.drawArc(300,359,160,170,-12,205);
      Path2D.Double path = new Path2D.Double();
      path.moveTo(289,461);
      path.curveTo(250,443,250,383,254,378);

      path.moveTo(300,444);
      path.curveTo(295,444,290,444,265,435);
      g.draw(path);

      g.drawLine(300,463,290,461);

      g.drawArc(185,339,100,40,-66,117);
      g.drawArc(195,355,80,25,-30,77);
      g.drawArc(260,340,30,25,130,70);


      //headlight
      headlight(g);
      //
      //lines
      lines(g);
      //wheel1
      g.drawOval(873,367,135,135);
      g.drawOval(882,376,117,117);
      g.drawOval(920,415,38,38);
      wheel1(g);
      //wheel2
      g.drawOval(313,367,135,135);
      g.drawOval(322,376,117,117);
      g.drawOval(360,415,38,38);
      wheel2(g);

      lineHUI(g);
      lines2(g);
      window(g);
      ear(g);
    }
    static void wheel1(Graphics2D g){
      g.setStroke(new BasicStroke(2));
      g.drawLine(935,376,937,415);
      g.drawLine(943,376,942,415);

      g.drawLine(990,405,955,421);
      g.drawLine(992,413,958,425);

      g.drawLine(989,466,956,443);
      g.drawLine(984,473,955,449);

      g.drawLine(935,492,937,453);
      g.drawLine(943,492,942,453);

      g.drawLine(892,466,923,443);
      g.drawLine(897,473,923,449);

      g.drawLine(891,405,923,421);
      g.drawLine(887,413,923,425);
      g.setStroke(new BasicStroke(3));
    }
    static void wheel2(Graphics2D g){
      g.setStroke(new BasicStroke(2));
      g.drawLine(935-560,376,937-560,415);
      g.drawLine(943-560,376,942-560,415);

      g.drawLine(990-560,405,955-560,421);
      g.drawLine(992-560,413,958-560,425);

      g.drawLine(989-560,466,956-560,443);
      g.drawLine(984-560,473,955-560,449);

      g.drawLine(935-560,492,937-560,453);
      g.drawLine(943-560,492,942-560,453);

      g.drawLine(892-560,466,923-560,443);
      g.drawLine(897-560,473,923-560,449);

      g.drawLine(891-560,405,923-560,421);
      g.drawLine(887-560,413,923-560,425);
      g.setStroke(new BasicStroke(3));
    }

    static void lines(Graphics2D g){
      Path2D.Double path = new Path2D.Double();
      path.moveTo(536,326);
      path.curveTo(620,340,700,350,848,336);

      path.moveTo(860,450);
      path.lineTo(838,447);
      path.lineTo(836,454);
      path.lineTo(459,454);
      //
      path.moveTo(873,392);
      path.lineTo(850,388);
      path.curveTo(700,360,500,330,433,380);

      path.moveTo(870,400);
      path.lineTo(850,396);
      path.curveTo(820,460,600,440,500,358);

      g.draw(path);
    }
    static void lines2(Graphics2D g){
      //я хотел нарисовать линию двери с тонким стержнем
      g.setStroke(new BasicStroke(2));
      Path2D.Double path = new Path2D.Double();
      path.moveTo(600,268);
      path.lineTo(573,325);
      path.moveTo(570,332);
      path.curveTo(550,370,650,400,650,453);
      g.draw(path);
    }
    static void window(Graphics2D g){
      Path2D.Double p = new Path2D.Double();
      g.setStroke(new BasicStroke(3));
      p.moveTo(520,300);
      p.curveTo(620,260,710,260,820,330);
      p.curveTo(710,335,620,335,520,300);


      g.draw(p);
      Path2D.Double p2 = new Path2D.Double();
      g.setStroke(new BasicStroke(2));
      p2.moveTo(620,275);
      p2.curveTo(610,285,610,285,630,325);

      p2.moveTo(740,290);
      p2.lineTo(755,330);

      p2.moveTo(744,293);
      p2.lineTo(758,330);
      g.draw(p2);


    }
    static void ear(Graphics2D g){
      Path2D.Double p = new Path2D.Double();
      g.setStroke(new BasicStroke(3));
      p.moveTo(770,357);
      p.lineTo(790,330);
      p.moveTo(760,350);//793,330,780,310,770,310,793,330
      p.curveTo(768,340,768,340,769,335);

      p.moveTo(780,333);
      p.lineTo(790,330);

      g.setColor(Color.white);
      g.fillOval(750,310,46,26);
      g.fillArc(750,310,45,25,-5,250);
      g.setColor(Color.black);
      g.draw(p);
      g.drawArc(750,310,45,25,-50,310);

      g.setColor(Color.white);
      Path2D.Double fillarea = new Path2D.Double();
      fillarea.moveTo(770,340);
      fillarea.lineTo(781,340);
      fillarea.lineTo(778,345);
      fillarea.lineTo(768,345);
      g.fill(fillarea);
    }
    static void headlight(Graphics2D g){
      Path2D.Double path = new Path2D.Double();
      path.moveTo(1060,390);
      path.curveTo(1000,340,1020,340,1090,370);
      path.moveTo(1060,390);
      path.curveTo(1100,419,1100,440,1100,440);
      path.moveTo(1090,370);
      path.curveTo(1055,372,1050,370,1070,398);

      g.draw(path);
    }
    static void lineHUI(Graphics2D g){
      Path2D.Double path = new Path2D.Double();
      g.setStroke(new BasicStroke(2));
      path.moveTo(1113,400);
      path.curveTo(1110,390,1090,385,1060,380);

      g.draw(path);
    }

  }
    static JFrame getJFrame(){
      JFrame f = new JFrame();
      f.setVisible(true);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setTitle("McLaren");
      Toolkit t = Toolkit.getDefaultToolkit();
      Dimension dimension = t.getScreenSize();
      f.setBounds(dimension.width / 2 - 625, dimension.height / 2 - 400, 1250, 800);
      return f;
    }
}