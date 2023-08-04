class prac extends thread{
    public void run(){
        int i=0;
    while(i<2000){
        System.out.println("GOODD MORNNING");
        i++;   
    }
    }
}

class prac2 extends thread{
    public void run(){
        int i=0;
        while(i<20000)
        {
            System.out.println("WELCOME");
            i++;
        }
    }
}



public class threadprac {
    public static void main(String[] args) {
        prac2 p  = new prac2();
        p.run();
        prac pp = new prac();
        pp.run();
        
    }
    
}
