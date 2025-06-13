import java.util.Scanner;

public class VideoLauncher
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        VideoStore vid = new VideoStore();
        while (true){
            System.out.println("MAIN MENU ");
            System.out.println("========= ");
            System.out.println("1.Add Videos");
            System.out.println("2. Check Out Video");
            System.out.println("3. Return Video ");
            System.out.println("4. Receive Rating");
            System.out.println("5. List Inventory ");
            System.out.println("6. Exit :");
            System.out.println("Enter the number(1-6) : ");
               int num = sc.nextInt();
               switch (num)
               {
                   case 1:
                       System.out.println("Enter the video name : ");
                       sc.nextLine();
                       String name  = sc.nextLine();
                       vid.addVideo(name);
                       break;
                   case 2:
                       System.out.println("Enter the video name : ");
                       sc.nextLine();
                       String check  = sc.nextLine();
                       vid.doCheckout(check);
                       break;
                   case 3:
                       System.out.println("Enter the video name : ");
                       sc.nextLine();
                       String ret  = sc.nextLine();
                       vid.doReturn(ret);
                       break;
                   case 4:
                       System.out.println("Enter the video name : ");
                       sc.nextLine();
                       String ratevid  = sc.nextLine();
                       System.out.println("Enter the rating (1-10) : ");
                       int rate  = sc.nextInt();
                       vid.receiveRating(ratevid,rate);
                       break;
                   case 5:
                       vid.listInventory();
                       break;
                   case 6:
                       System.out.println("Thank u for your interaction");
                       System.exit(0);
                       break;
                   default:
                       System.out.println("enter a valid no.");
               }

        }
        //sc.close();
    }
}
