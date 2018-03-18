package MyFrame;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.ActionEvent;
import java.awt.color.*;
import java.awt.font.*;
import java.awt.image.*;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Properties;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;


/**
 * @version 1.0 2018-03-13
 * @author Wilson Song
 * @ The frame of MyNotePad
 */

public class MyFrame extends JFrame implements ActionListener, DocumentListener{
	
	private JMenu fileMenu, editMenu, formatMenu, viewMenu, helpMenu;
	//ptivate
	
	public MyFrame() {
		initFrame();
		initMenu();
	}
	
	public void initFrame(){  
        //Properties p = new Properties();  
        //通过获取系统屏幕的分辨率设置窗体大小位置  
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        this.setSize(screenWidth/2, screenHeight/2);
        //this.setSize(640,480);  
        this.setLocationRelativeTo(null);  
        //设置主对话框可以被关闭 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        //设置图标  
        Image img = new ImageIcon("image/logo.jpg").getImage();  
        this.setIconImage(img);  
        //设置标题名称  
        this.setTitle("记事本  by Wilson");  
    }//初始化窗体结束  
	
	public void initMenu() {
		JMenuBar menuBar = new JMenuBar();  //创建一个菜单栏
		setJMenuBar(menuBar);  //将菜单栏添加到框架上

		//创建文件菜单
		fileMenu = new JMenu("文件(F)");
		fileMenu.setMnemonic('F');  //设置快捷键Alt+F
		menuBar.add(fileMenu);
		
		JMenuItem fileNewItem = new JMenuItem("新建(N)");  //新建菜单项
		//设置快捷键
		fileNewItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
		fileNewItem.addActionListener(this);  //添加事件监听
		fileMenu.add(fileNewItem);   //添加菜单项
		
		JMenuItem fileOpenItem = new JMenuItem("打开(O)");
		fileOpenItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
		fileOpenItem.addActionListener(this);
		fileMenu.add(fileOpenItem);
		
		JMenuItem fileSaveItem = new JMenuItem("保存(S)");
		fileSaveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		fileSaveItem.addActionListener(this);
		fileMenu.add(fileSaveItem);
		
		JMenuItem fileSaveAsItem = new JMenuItem("另存为(A)...");
		fileSaveAsItem.addActionListener(this);
		fileMenu.add(fileSaveAsItem);
		
		JMenuItem filePageSet = new JMenuItem("页面设置(U)...");
		filePageSet.addActionListener(this);
		fileMenu.add(filePageSet);
		
		JMenuItem filePrint = new JMenuItem("打印(P)");
		filePrint.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
		filePrint.addActionListener(this);
		fileMenu.add(filePrint);
		
		JMenuItem fileExitItem = new JMenuItem("退出“X");
		fileExitItem.addActionListener(this);
		fileMenu.add(fileExitItem);
		
		//创建编辑菜单
		JMenu editMenu = new JMenu("编辑(E)");
		editMenu.setMnemonic('E');
		menuBar.add(editMenu);
		
		//当选择编辑菜单时，设置剪切、复制、粘贴、删除等功能的可用性  
		editMenu.addMenuListener(new MenuListener(){
			public void menuCanceled(MenuEvent e) {  //当取消菜单的时候调用
				checkMenuItemEnabled();   //设置功能的可用性    
			}
			public void menuDeselected(MenuEvent e) { //当取消选择某个菜单时选择使用
				checkMenuItemEnabled();
			}
			public void menuSelected(MenuEvent e) {  //当选择某个菜单时调用
				checkMenuItemEnabled();
			}
		});
		
		JMenuItem editUndo = new JMenuItem("撤销(U)");
		editUndo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, ActionEvent.CTRL_MASK));
		editUndo.addActionListener(this);
		editUndo.setEnabled(false);  //设置没有建立文本之前是不可用的
		editMenu.add(editUndo);
		
		
				
	}
	
	public void actionPerformed(ActionEvent e) {  
		
	}
	
	public void removeUpdate(DocumentEvent r) {
		
	}
	
	public void changedUpdate(DocumentEvent c) {
		
	}
	
	public void insertUpdate(DocumentEvent i) {
		
	}
	
	public void checkMenuItemEnabled() {
		
	}
}
