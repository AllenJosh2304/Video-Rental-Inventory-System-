import java.util.ArrayList;

public class VideoStore
{
    ArrayList<Video> store = new ArrayList<>();
    int videos = 0;

    void addVideo(String name)
    {
        store.add(new Video(name));
        System.out.println("Video \"" + name + "\" added successfully");
        videos++;
    }
    void doCheckout(String name)
    {
        for(int i  =0;i<store.size();i++){
            Video v = store.get(i);
            String s = v.getName();
            if (s.equalsIgnoreCase(name))
            {
                v.doCheckout();
                return;
            }
        }
        System.out.println("Sorry Video Not Found");
    }
    void doReturn(String name)
    {
        for(int i  =0;i<store.size();i++){
            Video v = store.get(i);
            String s = v.getName();
            if (s.equalsIgnoreCase(name))
            {
                v.doReturn();
                return;
            }
        }
        System.out.println("Sorry Video Not Found");
    }
    void receiveRating(String name, int rating)
    {
        for(int i  =0;i<store.size();i++){
            Video v = store.get(i);
            String s = v.getName();
            if (s.equalsIgnoreCase(name))
            {
                v.receiveRating(rating);
                return;
            }
        }
        System.out.println("Sorry Video Not Found");
    }
    void listInventory() {
        if(videos == 0){
            System.out.println("Sorry there are no videos in the inventory currently ");
            return;
        }

        System.out.println("--------------------------------------------------------");
        System.out.println("Video Name          Checkout Status       Rating");
        for (int i = 0; i < store.size(); i++) {
            Video v = store.get(i);
            System.out.printf("%-20s %-20s %-10s\n", v.getName(), v.getCheckout(), v.getRating());
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("End of list");
    }
}
