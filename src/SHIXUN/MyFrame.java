package SHIXUN;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by DELL on 2018/7/12.
 */
public class MyFrame extends JFrame{
   /*
    public static void main(String [] args){
        //创建窗体
       JFrame frame=new JFrame();
        frame.setSize(600,800);
        frame.setTitle("first");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        */
      public MyFrame(){
          this.setSize(400,600);
          this.setTitle("Day1");
          this.setVisible(true);
         // FlowLayout flowLayout=new FlowLayout();
         //GridLayout gridLayout=new GridLayout();
         // this.setLayout(flowLayout);
          JButton BtnNorth=new JButton("北方");
          JButton BtnSouth=new JButton("南方");
          JButton BtnEast=new JButton("东方");
          JButton BtnWest=new JButton("西方");
          JButton BtnCenter=new JButton("中间");






          this.add( BtnNorth, BorderLayout.NORTH);
          this.add(BtnSouth,BorderLayout.SOUTH);
          this.add(BtnEast,BorderLayout.EAST);
          this.add(BtnWest,BorderLayout.WEST);
          this.add(BtnCenter,BorderLayout.CENTER);



                  //设置动作命名标记
          BtnNorth.setActionCommand("North");
          BtnSouth.setActionCommand("South");
          BtnEast.setActionCommand("East");
          BtnWest.setActionCommand("West");
          BtnCenter.setActionCommand("Center");
      }
    }
