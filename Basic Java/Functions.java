public class Functions{

  /**
   * See who has entered the room.
   * @param name  The person who enters
   */
  public static void enterTheRoom(String name){
    System.out.println(name+" has entered the room.");
  }

  /**
   * Detect who enters the room.
   * @return    The person who enters
   */
  public static String detectPerson(){
    String person = "Horace Mann"; // hardcoded-name
    return person;
  }

  /**
   * Say hi to the person who enters
   * Be super nice to a specific person
   * @param name  The person who enters
   */
  public static void sayHi(String name){
    if (name.equals("Horace Mann")){
      System.out.println("Hi "+name+"!");
    }else{
      System.out.println("Hi.");
    }
  }

  /**
   * Detect who enters the room,
   * and then say hi to them!
   */
  public static void main(String[] args){
    String person = detectPerson();
    enterTheRoom(person);
    sayHi(person);
    sayHi("Someone else");
  }
}