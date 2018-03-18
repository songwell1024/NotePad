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
        //ͨ����ȡϵͳ��Ļ�ķֱ������ô����Сλ��  
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        this.setSize(screenWidth/2, screenHeight/2);
        //this.setSize(640,480);  
        this.setLocationRelativeTo(null);  
        //�������Ի�����Ա��ر� 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        //����ͼ��  
        Image img = new ImageIcon("image/logo.jpg").getImage();  
        this.setIconImage(img);  
        //���ñ�������  
        this.setTitle("���±�  by Wilson");  
    }//��ʼ���������  
	
	public void initMenu() {
		JMenuBar menuBar = new JMenuBar();  //����һ���˵���
		setJMenuBar(menuBar);  //���˵�����ӵ������

		//�����ļ��˵�
		fileMenu = new JMenu("�ļ�(F)");
		fileMenu.setMnemonic('F');  //���ÿ�ݼ�Alt+F
		menuBar.add(fileMenu);
		
		JMenuItem fileNewItem = new JMenuItem("�½�(N)");  //�½��˵���
		//���ÿ�ݼ�
		fileNewItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
		fileNewItem.addActionListener(this);  //����¼�����
		fileMenu.add(fileNewItem);   //��Ӳ˵���
		
		JMenuItem fileOpenItem = new JMenuItem("��(O)");
		fileOpenItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
		fileOpenItem.addActionListener(this);
		fileMenu.add(fileOpenItem);
		
		JMenuItem fileSaveItem = new JMenuItem("����(S)");
		fileSaveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		fileSaveItem.addActionListener(this);
		fileMenu.add(fileSaveItem);
		
		JMenuItem fileSaveAsItem = new JMenuItem("���Ϊ(A)...");
		fileSaveAsItem.addActionListener(this);
		fileMenu.add(fileSaveAsItem);
		
		JMenuItem filePageSet = new JMenuItem("ҳ������(U)...");
		filePageSet.addActionListener(this);
		fileMenu.add(filePageSet);
		
		JMenuItem filePrint = new JMenuItem("��ӡ(P)");
		filePrint.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
		filePrint.addActionListener(this);
		fileMenu.add(filePrint);
		
		JMenuItem fileExitItem = new JMenuItem("�˳���X");
		fileExitItem.addActionListener(this);
		fileMenu.add(fileExitItem);
		
		//�����༭�˵�
		JMenu editMenu = new JMenu("�༭(E)");
		editMenu.setMnemonic('E');
		menuBar.add(editMenu);
		
		//��ѡ��༭�˵�ʱ�����ü��С����ơ�ճ����ɾ���ȹ��ܵĿ�����  
		editMenu.addMenuListener(new MenuListener(){
			public void menuCanceled(MenuEvent e) {  //��ȡ���˵���ʱ�����
				checkMenuItemEnabled();   //���ù��ܵĿ�����    
			}
			public void menuDeselected(MenuEvent e) { //��ȡ��ѡ��ĳ���˵�ʱѡ��ʹ��
				checkMenuItemEnabled();
			}
			public void menuSelected(MenuEvent e) {  //��ѡ��ĳ���˵�ʱ����
				checkMenuItemEnabled();
			}
		});
		
		JMenuItem editUndo = new JMenuItem("����(U)");
		editUndo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, ActionEvent.CTRL_MASK));
		editUndo.addActionListener(this);
		editUndo.setEnabled(false);  //����û�н����ı�֮ǰ�ǲ����õ�
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
