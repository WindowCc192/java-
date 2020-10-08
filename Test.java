package Run;

import Information.CPU;
import Information.HardDisk;

public class Test {

   public static void main(String args[]) {

       CPU cpu = new CPU(25,"AMD",4.2);

       HardDisk HD=new HardDisk(200,300);

       PC pc =new PC(cpu,HD);

       pc.show();

    }

}