package txet;

public class Bank{
	 private static int money = 500;
	    public int getMoney(){
	        return money;
	    }
	    public synchronized void saveMoney(int m){
	    	System.out.println(money+"&&");
            System.out.println("��Ǯ����ܽ�"+(money+=m));      
            System.out.println("");
	       
	    }
	    public synchronized void drawMoney(int m){
            Bank bank = new Bank();
            if (bank.getMoney()<=0) {
            	
                System.out.println("û��Ǯ��ȡ��pi");
                System.out.println("");
            }else {
            	System.out.println(bank.getMoney()+"***");
                System.out.println("ȡǮ��ʣ���ܽ�"+(money-=m));     
                System.out.println("");
            }
	        
	    }
	     
	    public static void main(String[] args) {
	        Man m1 = new Man();
	        Women w = new Women();
	        Thread t1 = new Thread(m1);
	        /*Thread t2 = new Thread(m1);
	        Thread t3 = new Thread(m1);*/
	        Thread t4 = new Thread(w);
	        /*Thread t5 = new Thread(w);
	        Thread t6 = new Thread(w);*/
	        t1.start();
	        /* t2.start();
	       	t3.start();*/
	        t4.start();
	        /* t5.start();
	        t6.start();*/
	        }
	 
	}
	 
	class Man implements Runnable{
	    private Bank bank = new Bank();
	 
	    public void run() {
	        int m = 100;
	        int i=0;
	        while (i<5) {
	                bank.saveMoney(m);
	                i++;
	                try {
	                    Thread.sleep(100);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }  
	        }
	    }
	}
	class Women implements Runnable{
	    private Bank bank = new Bank();
	 
	    public void run() {
	        int m = 100;
	        int i=0;
	        //bank.getMoney()>0
	        while (i<5) {
	                    bank.drawMoney(m);
	                try {
	                    Thread.sleep(100);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	        i++;
	        }
	    }
}
/*ȡǮ��ʣ���ܽ�0
	��Ǯ����ܽ�100
	û��Ǯ��ȡ��pi
	��Ǯ����ܽ�100
	ȡǮ��ʣ���ܽ�0
	��Ǯ����ܽ�100
	��Ǯ����ܽ�200
	ȡǮ��ʣ���ܽ�100
	ȡǮ��ʣ���ܽ�0
	û��Ǯ��ȡ��pi
	��Ǯ����ܽ�100
	��Ǯ����ܽ�200
	ȡǮ��ʣ���ܽ�100
	��Ǯ����ܽ�200
	ȡǮ��ʣ���ܽ�100
	��Ǯ����ܽ�200
	ȡǮ��ʣ���ܽ�100
	��Ǯ����ܽ�200
	ȡǮ��ʣ���ܽ�100
	��Ǯ����ܽ�300
	ȡǮ��ʣ���ܽ�200
	��Ǯ����ܽ�300
	ȡǮ��ʣ���ܽ�200
	��Ǯ����ܽ�300
	��Ǯ����ܽ�300
	ȡǮ��ʣ���ܽ�200
	ȡǮ��ʣ���ܽ�200
	��Ǯ����ܽ�300
	ȡǮ��ʣ���ܽ�200
	��Ǯ����ܽ�300*/