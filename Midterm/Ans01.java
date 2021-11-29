class Personel{
  protected String name;
  protected int bornIn;
}
class Student extends Personel{
  private String id;
  private int grade;
  private String c1;
  private String c2;
  public Student(String n,int b,String ID,int g,String C1,String C2){
    name=n;
    bornIn=b;
    id=ID;
    grade=g;
    c1=C1;
    c2=C2;
    System.out.println("name:"+name);
    System.out.println("Date of Born:"+bornIn);
    System.out.println("id:"+id);
    System.out.println("grade:"+grade);
    System.out.println("course1:"+c1);
    System.out.println("course2:"+c2);
    System.out.println("----------------");
  }
}
class Teacher extends Personel{
  private String course;
  public Teacher(String n,int b,String c){
    name=n;
    bornIn=b;
    course=c;
    System.out.println("name:"+name);
    System.out.println("Date of Born:"+bornIn);
    System.out.println("course:"+course);
    System.out.println("----------------");
  }
}
class Ans01 {  
  public static void main(String args[]) { 
    Personel[] persons=new Personel[4];
    persons[0]=new Student("張三",88,"940001",1,"國文","英文");
    persons[1]=new Student("王五",87,"930001",2,"數學","英文");
    persons[2]=new Teacher("張九",60,"英文");
    persons[3]=new Teacher("蕭十",62,"國文");
  } 
}

/*output------------
name:張三
Date of Born:88
id:940001
grade:1
course1:國文
course2:英文
----------------
name:王五
Date of Born:87
id:930001
grade:2
course1:數學
course2:英文
----------------
name:張九
Date of Born:60
course:英文
----------------
name:蕭十
Date of Born:62
course:國文
----------------
-------------------*/
