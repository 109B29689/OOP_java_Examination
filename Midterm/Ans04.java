class A{
  double w;
  double h;
  public A(double W){
    w=W;
    System.out.println("方形邊長="+w);
    System.out.println("方形面積價格="+w*w*3000);
  }
  public A(double W,double H){
    w=W;
    h=H;
    System.out.println("長="+w+"寬="+h);
    System.out.println("矩形面積價格="+w*h*3000);
  }
}
class Main {  
  public static void main(String args[]) { 
    A a=new A(5.1);
    A A=new A(5.1,7.2);
  } 
}

/*output------------------
方形邊長=5.1
方形面積價格=78030.0
長=5.1寬=7.2
矩形面積價格=110160.0
-------------------------*/
