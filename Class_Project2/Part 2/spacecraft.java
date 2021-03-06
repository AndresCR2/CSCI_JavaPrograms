/*
* spacecraft.java
* Description: This programs draws and colors the polygons, alos holds all operations for movement.  
*Author: Roy Andres Corrales Ramirez
*Creation Date:4/22/2019
*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class spacecraft extends JPanel{
  int currentx=0, currenty=0, currentxt1=500, currentyt1=500, currentxt2=0, currentyt2=0, counter=0; //Instantiates all the values uesed
  int speed = 2;
  int speed2 = 4;
  Polygon landingG;
  boolean landing = true;
 
  public spacecraft(){      
    PolygonPanel listener = new PolygonPanel();  
    addMouseListener(listener);  
    addMouseMotionListener(listener);  
    setBackground(Color.black); 
    setPreferredSize(new Dimension(1920,1080));} //Sets resolution 
     
  public void paintComponent(Graphics panel){
    super.paintComponent(panel);
                   
                   panel.setColor(Color.yellow); //Holds all coordinates to draw the polygon 
int[] xloc_Tie1 = {currentxt1+331,currentxt1+331,currentxt1+462,currentxt1+479,currentxt1+445,currentxt1+315,
                   currentxt1+304,currentxt1+292,currentxt1+276,currentxt1+243,currentxt1+233,currentxt1+227,
                   currentxt1+206,currentxt1+193,currentxt1+183,currentxt1+154,currentxt1+157,currentxt1+128,
                   currentxt1+116,currentxt1+22,currentxt1+0,currentxt1+28,currentxt1+142,currentxt1+149,currentxt1+178,
                   currentxt1+187,currentxt1+197,currentxt1+207,currentxt1+222,currentxt1+235,currentxt1+247,currentxt1+264,currentxt1+275,
                   currentxt1+280,currentxt1+288,currentxt1+300,currentxt1+295,currentxt1+330};
int[] yloc_Tie1 = {currentyt1+545,currentyt1+545,currentyt1+493,currentyt1+244,currentyt1+47,currentyt1+123,
                   currentyt1+259,currentyt1+251,currentyt1+232,currentyt1+215,currentyt1+215,currentyt1+216,
                   currentyt1+222,currentyt1+231,currentyt1+246,currentyt1+244,currentyt1+206,currentyt1+1,
                   currentyt1+0,currentyt1+87,currentyt1+320,currentyt1+526,currentyt1+464,currentyt1+303,currentyt1+320,
                   currentyt1+332,currentyt1+342,currentyt1+349,currentyt1+350,currentyt1+352,currentyt1+352,currentyt1+348,
                   currentyt1+341,currentyt1+330,currentyt1+319,currentyt1+322,currentyt1+347,currentyt1+546};
                   panel.fillPolygon(xloc_Tie1,yloc_Tie1, xloc_Tie1.length); //Fills in the coordinates to become a solid
                   
                     panel.setColor(Color.black);
int[] xloc_Circle1 = {currentxt1+226,currentxt1+225,currentxt1+221,currentxt1+220,currentxt1+219,currentxt1+219,
                     currentxt1+219,currentxt1+221,currentxt1+224,currentxt1+226,currentxt1+229,currentxt1+232,
                     currentxt1+237,currentxt1+242,currentxt1+249,currentxt1+255,currentxt1+262,currentxt1+272,
                     currentxt1+279,currentxt1+283,currentxt1+289,currentxt1+295,currentxt1+297,currentxt1+297,
                     currentxt1+297,currentxt1+297,currentxt1+296,currentxt1+294,currentxt1+291,currentxt1+285,
                     currentxt1+283,currentxt1+279,currentxt1+276,currentxt1+272,currentxt1+267,currentxt1+260,
                     currentxt1+250,currentxt1+249,currentxt1+245,currentxt1+240,currentxt1+240,currentxt1+239,
                     currentxt1+238,currentxt1+228,currentxt1+228,currentxt1+226,currentxt1+225,currentxt1+223,
                     currentxt1+222};
int[] yloc_Circle1 = {currentyt1+246,currentyt1+251,currentyt1+257,currentyt1+265,currentyt1+272,currentyt1+277,currentyt1+282,
                     currentyt1+288,currentyt1+294,currentyt1+299,currentyt1+302,currentyt1+306,currentyt1+309,currentyt1+311,
                     currentyt1+312,currentyt1+315,currentyt1+315,currentyt1+315,currentyt1+312,currentyt1+310,currentyt1+302,
                     currentyt1+294,currentyt1+287,currentyt1+278,currentyt1+270,currentyt1+262,currentyt1+257,currentyt1+251,
                     currentyt1+248,currentyt1+244,currentyt1+242,currentyt1+240,currentyt1+239,currentyt1+239,currentyt1+237,
                     currentyt1+235,currentyt1+234,currentyt1+234,currentyt1+234,currentyt1+235,currentyt1+235,currentyt1+237,
                     currentyt1+237,currentyt1+241,currentyt1+241,currentyt1+244,currentyt1+244,currentyt1+246,currentyt1+251};
                     panel.fillPolygon(xloc_Circle1,yloc_Circle1, xloc_Circle1.length);
                 if(currentxt1 > 1920) //Allows the polygon to stay within the window frame
                 {
                   currentxt1 = 0;
                 }
                 if(currentyt1 > 1080)
                 {
                   currentyt1 = 0;
                 }
                 currentxt1 = currentxt1+speed;//Increases the speed using a random number, which gives it a random starting point as well
                 currentyt1 = currentyt1+speed;
                   
                   panel.setColor(Color.red);
int[] xloc_Tie2 = {currentxt2+331,currentxt2+331,currentxt2+462,currentxt2+479,currentxt2+445,currentxt2+315,
                   currentxt2+304,currentxt2+292,currentxt2+276,currentxt2+243,currentxt2+233,currentxt2+227,
                   currentxt2+206,currentxt2+193,currentxt2+183,currentxt2+154,currentxt2+157,currentxt2+128,
                   currentxt2+116,currentxt2+22,currentxt2+0,currentxt2+28,currentxt2+142,currentxt2+149,currentxt2+178,
                   currentxt2+187,currentxt2+197,currentxt2+207,currentxt2+222,currentxt2+235,currentxt2+247,currentxt2+264,currentxt2+275,
                   currentxt2+280,currentxt2+288,currentxt2+300,currentxt2+295,currentxt2+330};
int[] yloc_Tie2 = {currentyt2+545,currentyt2+545,currentyt2+493,currentyt2+244,currentyt2+47,currentyt2+123,
                   currentyt2+259,currentyt2+251,currentyt2+232,currentyt2+215,currentyt2+215,currentyt2+216,
                   currentyt2+222,currentyt2+231,currentyt2+246,currentyt2+244,currentyt2+206,currentyt2+1,
                   currentyt2+0,currentyt2+87,currentyt2+320,currentyt2+526,currentyt2+464,currentyt2+303,currentyt2+320,
                   currentyt2+332,currentyt2+342,currentyt2+349,currentyt2+350,currentyt2+352,currentyt2+352,currentyt2+348,
                   currentyt2+341,currentyt2+330,currentyt2+319,currentyt2+322,currentyt2+347,currentyt2+546};
                   panel.fillPolygon(xloc_Tie2,yloc_Tie2, xloc_Tie2.length);
                   
                     panel.setColor(Color.black);
int[] xloc_Circle2 = {currentxt2+226,currentxt2+225,currentxt2+221,currentxt2+220,currentxt2+219,currentxt2+219,
                     currentxt2+219,currentxt2+221,currentxt2+224,currentxt2+226,currentxt2+229,currentxt2+232,
                     currentxt2+237,currentxt2+242,currentxt2+249,currentxt2+255,currentxt2+262,currentxt2+272,
                     currentxt2+279,currentxt2+283,currentxt2+289,currentxt2+295,currentxt2+297,currentxt2+297,
                     currentxt2+297,currentxt2+297,currentxt2+296,currentxt2+294,currentxt2+291,currentxt2+285,
                     currentxt2+283,currentxt2+279,currentxt2+276,currentxt2+272,currentxt2+267,currentxt2+260,
                     currentxt2+250,currentxt2+249,currentxt2+245,currentxt2+240,currentxt2+240,currentxt2+239,
                     currentxt2+238,currentxt2+228,currentxt2+228,currentxt2+226,currentxt2+225,currentxt2+223,
                     currentxt2+222};
int[] yloc_Circle2 = {currentyt2+246,currentyt2+251,currentyt2+257,currentyt2+265,currentyt2+272,currentyt2+277,currentyt2+282,
                     currentyt2+288,currentyt2+294,currentyt2+299,currentyt2+302,currentyt2+306,currentyt2+309,currentyt2+311,
                     currentyt2+312,currentyt2+315,currentyt2+315,currentyt2+315,currentyt2+312,currentyt2+310,currentyt2+302,
                     currentyt2+294,currentyt2+287,currentyt2+278,currentyt2+270,currentyt2+262,currentyt2+257,currentyt2+251,
                     currentyt2+248,currentyt2+244,currentyt2+242,currentyt2+240,currentyt2+239,currentyt2+239,currentyt2+237,
                     currentyt2+235,currentyt2+234,currentyt2+234,currentyt2+234,currentyt2+235,currentyt2+235,currentyt2+237,
                     currentyt2+237,currentyt2+241,currentyt2+241,currentyt2+244,currentyt2+244,currentyt2+246,currentyt2+251};
                     panel.fillPolygon(xloc_Circle2,yloc_Circle2, xloc_Circle2.length);
                 if(currentxt2 > 1920)
                 {
                   currentxt2 = 0;
                 }
                 if(currentyt2 > 1080)
                 {
                   currentyt2 = 0;
                 }
                 currentxt2 = currentxt2+speed2;
                 currentyt2 = currentyt2+speed2;
                 
 
                     panel.setColor(Color.gray);    
int[] xloc_Falcon = {currentx+364,currentx+364,currentx+230,currentx+226,currentx+214,currentx+210,
                     currentx+174,currentx+171,currentx+168,currentx+165,currentx+154,currentx+151,
                     currentx+138,currentx+136,currentx+126,currentx+119,currentx+93,currentx+89,
                     currentx+66,currentx+34,currentx+36,currentx+31,currentx+40,currentx+84,currentx+118,
                     currentx+146,currentx+168,currentx+215,currentx+237,currentx+243,currentx+275,
                     currentx+304,currentx+331,currentx+469,currentx+449,currentx+353,currentx+341,
                     currentx+363,currentx+338,currentx+376,currentx+392,currentx+389,currentx+383,
                     currentx+367,currentx+359};
int[] yloc_Falcon = {currenty+311,currenty+311,currenty+271,currenty+280,currenty+279,currenty+264,
                     currenty+259,currenty+263,currenty+266,currenty+270,currenty+271,currenty+269,
                     currenty+264,currenty+264,currenty+265,currenty+258,currenty+236,currenty+229,
                     currenty+221,currenty+170,currenty+135,currenty+130,currenty+115,currenty+94,
                     currenty+87,currenty+82,currenty+80,currenty+74,currenty+79,currenty+86,currenty+85,
                     currenty+85,currenty+103,currenty+251,currenty+267,currenty+216,currenty+219,currenty+233,
                     currenty+248,currenty+273,currenty+290,currenty+299,currenty+304,currenty+312,currenty+310};                     
                     panel.fillPolygon(xloc_Falcon,yloc_Falcon,xloc_Falcon.length);

                     panel.setColor(Color.white);
int[] xloc_Bridge = {currentx+158,currentx+158,currentx+155,currentx+147,currentx+142,currentx+136,
                     currentx+131,currentx+127,currentx+122,currentx+120,currentx+110,currentx+93,
                     currentx+91,currentx+91,currentx+94,currentx+95,currentx+98,currentx+100,
                     currentx+103,currentx+106,currentx+107,currentx+172,currentx+190,currentx+196,
                     currentx+152,currentx+158,currentx+160,currentx+161,currentx+163,currentx+165,
                     currentx+168,currentx+171,currentx+174,currentx+174,currentx+174,currentx+173,
                     currentx+173,currentx+170,currentx+170,currentx+163,currentx+163,currentx+161,
                     currentx+159,currentx+156};
int[] yloc_Bridge = {currenty+271,currenty+271,currenty+269,currenty+268,currenty+267,currenty+265,
                     currenty+264,currenty+264,currenty+262,currenty+258,currenty+252,currenty+236,
                     currenty+231,currenty+226,currenty+219,currenty+212,currenty+208,currenty+208,
                     currenty+205,currenty+202,currenty+200,currenty+146,currenty+149,currenty+160,
                     currenty+216,currenty+223,currenty+228,currenty+236,currenty+240,currenty+242,
                     currenty+244,currenty+246,currenty+252,currenty+253,currenty+258,currenty+264,
                     currenty+264,currenty+268,currenty+268,currenty+270,currenty+270,currenty+270,
                     currenty+270,currenty+269};
panel.fillPolygon(xloc_Bridge,yloc_Bridge, xloc_Bridge.length);
                                                   
                           panel.setColor(Color.white);
int[] xloc_LandingGear1 = {currentx+77,currentx+76,currentx+76,currentx+76,currentx+93,currentx+91};
int[] yloc_LandingGear1 = {currenty+224,currenty+225,currenty+244,currenty+260,currenty+261,currenty+231};
landingG = new Polygon(xloc_LandingGear1, yloc_LandingGear1, xloc_LandingGear1.length);

if(landing)
{
  panel.setColor(Color.white);
  panel.fillPolygon(landingG);
}
if(!landing)
{
  panel.setColor(Color.black);
  panel.fillPolygon(landingG);
}

repaint();
  }

private class PolygonPanel implements MouseListener, MouseMotionListener{//Holds all listeners, even if they are not being used
  
   //A boolean statament which makes the landing gear appear and re-apprear
    public void mousePressed(MouseEvent event){}   
    public void mouseDragged(MouseEvent event){}
    public void mouseReleased(MouseEvent event){} 
    public void mouseEntered(MouseEvent event){}  
    public void mouseExited(MouseEvent event){}    
    public void mouseClicked(MouseEvent event)
    {
      if (event.getButton() == MouseEvent.BUTTON1)
      {
        if(!landing)
        {
          landing = true;
        }
        if(landing)
        {
          landing = false;
        }
        repaint();
      }
    }
 
 public void mouseMoved(MouseEvent event){ //Makes the Falcon follow the mouse
       currentx = event.getPoint().x - 500;
       currenty = event.getPoint().y - 400;
       repaint();    
 }
}
}


  
  