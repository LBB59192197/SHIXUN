package SHIXUN;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PrivateKey;

/**
 * Created by DELL on 2018/7/13.
 */
public class AccountFrame extends JFrame {
    private JPanel panelon=new JPanel();
    private JPanel panelcenter=new JPanel();
    private JPanel paneldown=new JPanel();
    private JPanel paneladd=new JPanel();
    //声明上部面板的变量
    private JTextField tfsearch=new JTextField();
    private Button btnsearch=new Button("Search");
    //声明中间面板的变量
    private JLabel lbcenter=new JLabel("结果");
    private JTextField tfcenter=new JTextField();
    //声明下部面板的变量
    private  Button btnadd=new Button("Add");
    private  Button btndelete=new Button("Delete");
    private  Button btnmodify=new Button("Modify");
    //声明添加面板的变量
    private  JLabel lbaccount=new JLabel("账号");
    private JLabel lbpassword=new JLabel("密码");
    private JLabel lbother=new JLabel("其他信息");

    private JTextField tfon=new JTextField();
    private JTextField tfpassword=new JTextField();
    private JTextField tfdown=new JTextField();
    public AccountFrame(){
        //设置界面
        this.setSize(800,700);
        this.setTitle("Day2");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置上部面板
        this.add(panelon, BorderLayout.NORTH);
        panelon.setLayout(new BorderLayout());
        panelon.add(tfsearch );
        panelon.add(btnsearch,BorderLayout.EAST);
        //设置中间面板
        this.add(panelcenter,BorderLayout.CENTER);
        panelcenter.setLayout(new BorderLayout());
        panelcenter.setVisible(true);
        //panelcenter.add(lbcenter);
        panelcenter.add(tfcenter);
       panelcenter.add(lbcenter,BorderLayout.WEST);
       panelcenter.setVisible(true);
        //设置下部面板
        this.add(paneldown,BorderLayout.SOUTH);
        paneldown.add(btnadd,new FlowLayout());
        paneldown.add(btndelete,new FlowLayout());
        paneldown.add(btnmodify,new FlowLayout());
        //设置添加面板
        this.add(paneladd,BorderLayout.CENTER);
        paneladd.setLayout(new GridLayout(3,2));
        paneladd.add(lbaccount);
        paneladd.add(tfon);
        paneladd.add(lbpassword);
        paneladd.add(tfpassword);
        paneladd.add(lbother);
        paneladd.add(tfdown);
        paneladd.setVisible(false);
        //监听触发事件
         this.btnadd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
            String textadd=btnadd.getLabel();
            if(textadd.equals("add")){
                textadd="save";
              paneladd.setVisible(true);
              panelcenter.setVisible(false);
              btndelete.setLabel("cancel");
              btnmodify.setVisible(false);
            }else{
                textadd="add";
               panelcenter.setVisible(true);
               paneladd.setVisible(false);
               btndelete.setLabel("delete");
               btnmodify.setVisible(true);
            }
            btnadd.setLabel(textadd);
            }
        });
         this.btndelete.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 String textdt=btndelete.getLabel();
                 if(textdt.equals("cancel")){
                     textdt="delete";
                     panelcenter.setVisible(true);
                     paneladd.setVisible(false);
                     btnadd.setLabel("add");
                     btnmodify.setVisible(true);
                 }else {
                     textdt="cancel";
                     panelcenter.setVisible(false);
                     paneladd.setVisible(true);
                     btnadd.setLabel("save");
                     btnmodify.setVisible(false);

                 }
                 btndelete.setLabel(textdt);
             }
         });
    }

    public static void main(String [] args){
        new AccountFrame();
    }
}
