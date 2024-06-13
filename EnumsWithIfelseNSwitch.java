enum Stat{
    Running,Success,Failed,Pending;  // these are named constants 
}
public class EnumsWithIfelseNSwitch {
    public static void main(String[] args) {
        Stat s=Stat.Success;


        // enums with if elese
        if(s==Stat.Success)
        System.out.println("Ya Work Done");
        else if(s==Stat.Failed)
        System.out.println("Ohoo oops");
        else if(s==Stat.Running)
        System.out.println("Its Running");
        else
          System.out.println("Still Processing ");


          // enums with Switch
            Stat sw=Stat.Failed;
          switch (sw) {
            case Success:
            System.out.println("Done");
                break;
                case Running:
            System.out.println("Running");
                break;
                case Pending:
            System.out.println("Pending");
                break;
          
            default:
             System.out.println("Falied");
                break;
          }

    }
}
