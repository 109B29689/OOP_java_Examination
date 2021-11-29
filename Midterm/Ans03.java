class Data{
  private String name;
  private Test score;
  class Test{
    private int english;
    private int math;
    public Test(int eng,int m){
      this.english=eng;
      this.math=m;
    }
    public double avg(){
      double avg=((english+math)/2.0);
      return avg;
    }
    public void show(){
          System.out.println("english score:"+english);
    System.out.println("math score:"+math);
    System.out.println("avg:"+avg());
    if(english>=60 && math>=60)System.out.println("You are all pass");
    else if(english<60 && math<60)System.out.println("all fail");
    else if(english<60)System.out.println("english is fail");
    else System.out.println("math is fail");
    }
  }
  public Data(String n,int eng,int m){
    score=new Test(eng,m);
    this.name=n;
  }
  public void show(){
    System.out.println("name:"+name);
    score.show();
  }
}
class Ans03 {  
  public static void main(String args[]) { 
    Data stu=new Data("Annie",85,56);
    Data stu1=new Data("James",85,96);
    stu.show();
    System.out.println("---------------------");
    stu1.show();
  } 
}

/*output----------------
name:Annie
english score:85
math score:56
avg:70.5
math is fail
---------------------
name:James
english score:85
math score:96
avg:90.5
You are all pass
-----------------------*/
