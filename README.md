# 实验二
## 实验目的
1.掌握类的设计  
2.写出程序并初步学会调试  
3.利用GitHub平台写实验报告  
## 实验过程
1.首先创建package：*****。  
2.再创建两个class：CPU，HardDisk， PC 和 Test。  
3.CPU类中：
在CPU类中创建一个属性：speed表示cpu的速度。    
(b)并定义一组方法（set-get）。   
(c)创建一个默认构造方法（用来显示原来看不见的默认构造方法）。和一个新的构造方法用以调用speed属性的set方法。  
4.HardDisk类中：
在HardDisk类中创建一属性：amount表示硬盘的容量。    
为属性定义一组方法（set-get）。   
创建一个默认构造方法（用来显示原来看不见的默认构造方法）。和一个新的构造方法用以调用一个属性的set方法。   
5.PC中：PC类中调用CPU类和HardDisk类，并分别建立新的属性cpu和HD。    
然后创建show（）函数来展示所获取的信息。*    
6.最后在Test 创建主方法来为CPU和HardDisk中两个属性赋值，并调用PC类中show（）函数来输出信息。    
## 核心方法

void setName
public String getName
void setCPU
void setHardDIsk
void show
void setSpeed
int getSpeed
HardDisk(int amount,float speed,boolean typeG)
void setAmount(int m)
int getAmount()
void gettype()
public Teacher
String getSex(String sex)
public static void showname()
void setPc(PC pc)
## 实验结果
！(运行结果.png)[运行结果.png]
## 实验感想  
通过本次实验，我学会并熟悉了如何创建类、方法和构造方法。除此以外，我还学会如何简单使用GitHub和markdown。尝试用markdown编辑。在Java中学习中对构造方法的使用更加灵活：通过定义构造方法可以直接对某些属性初始化或者进行一些操作。
