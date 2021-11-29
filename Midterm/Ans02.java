class Dates{
  String[] weeks=new String[7];
  public Dates(){
    weeks[0]=new String("Mon");
    weeks[1]=new String("Thu");
    weeks[2]=new String("Wed");
    weeks[3]=new String("Tus");
    weeks[4]=new String("Fri");
    weeks[5]=new String("Sat");
    weeks[6]=new String("Sun");
  }
  public void askDate(){
    for(int i=0;i<weeks.length;i++)
      System.out.println(weeks[i]);
  }
}
class Ans02 {  
  public static void main(String args[]) { 
    Dates da=new Dates();
    da.askDate();
  } 
}

/*output---
Mon
Thu
Wed
Tus
Fri
Sat
Sun
----------*/
