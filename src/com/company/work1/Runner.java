package com.company.work1;

public class Runner {
    public void run(){

     Device dev1 = new Device("AA555","Samsung",25000.50);
        System.out.println(dev1);
        Monitor mon1 = new Monitor("DFdcg", "Dell", 5000.15, 150, 160);
        System.out.println(mon1);
        EthernetAdapter adap1 = new EthernetAdapter("DD344", "Samsung", 136.65, 500, "Sgfc445");
        System.out.println(adap1);
    }
}
