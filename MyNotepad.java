package test;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
public class MyNotepad implements ActionListener{
private JFrame frame=new JFrame("�¼��±�");
private JTextArea jta=new JTextArea();
private String result="";
private boolean flag=true;
private File f;
private JButton jb=new JButton("��ʼ");
private JTextField jtf=new JTextField(15);
private JTextField jt=new JTextField(15);
private JButton jbt=new JButton("�滻Ϊ");
private JButton jba=new JButton("ȫ���滻");
private Icon ic=new ImageIcon("D:\\java���ñʼ�\\GUI\\11.gif");
private String value;
private int start=0;
private JFrame jf=new JFrame("����");
private JFrame jfc=new JFrame("�滻");
@Override
public void actionPerformed(ActionEvent e) {
String comm=e.getActionCommand();
if("�½�".equals(comm)){
if(!(frame.getTitle().equals("�¼��±�"))){
if(!flag){
write();
newNew();
}else{
JFileChooser jfc=new JFileChooser("D:\\java���ñʼ�");
int returnVal = jfc.showDialog(null,"����Ϊ");
if(returnVal == JFileChooser.APPROVE_OPTION) {//ѡ���ļ�����ִ���������䣬��֤�˳���Ľ�׳��
f=jfc.getSelectedFile();
flag=false;
write();
}
}
}else if(!(jta.getText().isEmpty())){
JFileChooser jfc=new JFileChooser("D:\\java���ñʼ�");
int returnVal = jfc.showDialog(null,"����Ϊ");
if(returnVal == JFileChooser.APPROVE_OPTION) {//ѡ���ļ�����ִ���������䣬��֤�˳���Ľ�׳��
f=jfc.getSelectedFile();
flag=false;
write();
newNew();
}
}else{
newNew();
}
}else if("��".equals(comm)){
JFileChooser jfc=new JFileChooser("D:\\java���ñʼ�");
jfc.setDialogType(JFileChooser.OPEN_DIALOG);
int returnVal = jfc.showOpenDialog(null);
if(returnVal == JFileChooser.APPROVE_OPTION) {//ѡ���ļ�����ִ���������䣬��֤�˳���Ľ�׳��
f=jfc.getSelectedFile();
frame.setTitle(f.getName());
result=read();
flag=false;
value=result;
jta.setText(result);
}
}else if("����".equals(comm)){
JFileChooser jfc=new JFileChooser("D:\\java���ñʼ�");
if(flag){
int returnVal = jfc.showDialog(null,"����Ϊ");
if(returnVal == JFileChooser.APPROVE_OPTION) {//ѡ���ļ�����ִ���������䣬��֤�˳���Ľ�׳��
f=jfc.getSelectedFile();
flag=false;
write();
}
}else{
write();
}
}else if("���".equals(comm)){
JFileChooser jfc=new JFileChooser("D:\\java���ñʼ�");
int returnVal = jfc.showDialog(null,"���");
if(returnVal == JFileChooser.APPROVE_OPTION) {//ѡ���ļ�����ִ���������䣬��֤�˳���Ľ�׳��
f=jfc.getSelectedFile();
write();
}
}else if("�˳�".equals(comm)){
System.exit(0);
}else if("����".equals(comm)){
jta.setText(value);
}else if("����".equals(comm)){
value=jta.getText();
jta.cut();
}else if("����".equals(comm)){
jta.copy();
}else if("ճ��".equals(comm)){
value=jta.getText();
jta.paste();
}else if("ɾ��".equals(comm)){
value=jta.getText();
jta.replaceSelection(null);
}else if("ȫѡ".equals(comm)){
jta.selectAll();
}else if("����".equals(comm)){
value=jta.getText();
jf.add(jtf,BorderLayout.CENTER);
jf.add(jb,BorderLayout.SOUTH);
jf.setLocation(300,300);
jf.pack();
jf.setVisible(true);
jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}else if("�滻".equals(comm)){
value=jta.getText();
GridLayout gl=new GridLayout(3,3);
JLabel jl1=new JLabel("��������:");
JLabel jl2=new JLabel("�滻Ϊ:");
jfc.setLayout(gl);
jfc.add(jl1);
jfc.add(jtf);
jfc.add(jb);
jfc.add(jl2);
jfc.add(jt);
jfc.add(jbt);
JLabel jl3=new JLabel();
JLabel jl4=new JLabel();
jfc.add(jl3);
jfc.add(jl4);
jfc.add(jba);
jfc.setLocation(300,300);
jfc.pack();
jfc.setVisible(true);
jfc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}else if("�汾".equals(comm)){
JDialog jd=new JDialog(frame,"���ڶԻ���");
jd.setSize(200,200);
JLabel l=new JLabel("С��");
jd.add(l,BorderLayout.CENTER);
jd.setLocation(100,200);
jd.setSize(300,300);
jd.setVisible(true);
// jd.pack();
jd.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
}else if("��ʼ".equals(comm)||"��һ��".equals(comm)){
String temp=jtf.getText();
int s=value.indexOf(temp,start);
if(value.indexOf(temp,start)!=-1){
jta.setSelectionStart(s);
jta.setSelectionEnd(s+temp.length());
jta.setSelectedTextColor(Color.GREEN);
start=s+1;
jb.setText("��һ��");
// value=value.substring(s+temp.length());//���ܽ�ȡ�ִ�
}else {
JOptionPane.showMessageDialog(jf, "�������!", "��ʾ", 0, ic);
jf.dispose();
}
}else if("�滻Ϊ".equals(comm)){
String temp=jtf.getText();
int s=value.indexOf(temp,start);
if(value.indexOf(temp,start)!=-1){
jta.setSelectionStart(s);
jta.setSelectionEnd(s+temp.length());
jta.setSelectedTextColor(Color.GREEN);
start=s+1;
jta.replaceSelection(jt.getText());
}else {
JOptionPane.showMessageDialog(jf, "�������!", "��ʾ", 0, ic);
jf.dispose();
}
}else if("ȫ���滻".equals(comm)){
String temp=jta.getText();
temp=temp.replaceAll(jtf.getText(), jt.getText());
jta.setText(temp);
}
}
public String read(){
String temp="";
try {
FileInputStream fis = new FileInputStream(f.getAbsolutePath());
byte[] b=new byte[1024];
while(true){
int num=fis.read(b);
if(num==-1)break;
temp=temp+new String(b,0,num);
}
fis.close();
} catch (Exception e1) {
e1.printStackTrace();
}
return temp;
}
public void write(){
try {
FileOutputStream fos=new FileOutputStream(f);
fos.write(jta.getText().getBytes());
fos.close();
} catch (Exception e) {
e.printStackTrace();
}
}
public void newNew(){
frame.dispose();
new MyNotepad();
flag=true;
}
public MyNotepad(){
JMenuBar jmb=new JMenuBar();
String[] menuLab={"�ļ�","�༭","����"};
String[][] menuItemLab={{"�½�","��","����","���","�˳�"},
{"����","����","����","ճ��","ɾ��","ȫѡ","����","�滻"},
{"�汾"}};
for(int i=0;i<menuLab.length;i++){
JMenu menu=new JMenu(menuLab[i]);
jmb.add(menu);
for(int j=0;j<menuItemLab[i].length;j++){
JMenuItem jmi=new JMenuItem(menuItemLab[i][j]);
menu.add(jmi);
jmi.addActionListener(this);
}
}
frame.setJMenuBar(jmb);
jta.setLineWrap(true);//�Զ�����
JScrollPane jsp=new JScrollPane(jta);//�����������
frame.add(jsp);
jb.addActionListener(this);
jbt.addActionListener(this);
jba.addActionListener(this);
frame.setLocation(200,50);
frame.setSize(620,660);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[] args) {
new MyNotepad();
}
}
