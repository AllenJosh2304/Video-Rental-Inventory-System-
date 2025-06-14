import java.util.ArrayList;

public class VideoStore {
    ArrayList<Video> store = new ArrayList<>();
    int videos = 0;

    void addVideo(String name) {
        store.add(new Video(name));
        System.out.println("Video \"" + name + "\" added successfully");
        videos++;
    }

    void doCheckout(String name) {
        for (int i = 0; i < store.size(); i++) {
            Video v = store.get(i);
            String s = v.getName();
            if (s.equalsIgnoreCase(name)) {
                v.doCheckout();
                System.out.println("Video \"" + name + "\" checked out successfully.");
                return;
            }
        }
        System.out.println("Sorry, video not found.");
    }

    void doReturn(String name) {
        for (int i = 0; i < store.size(); i++) {
            Video v = store.get(i);
            String s = v.getName();
            if (s.equalsIgnoreCase(name)) {
                v.doReturn();
                System.out.println("Video \"" + name + "\" returned successfully.");
                return;
            }
        }
        System.out.println("Sorry, video not found.");
    }

    void receiveRating(int vidNo, int rating) {
        try {
            if (vidNo <= store.size() && vidNo >= 1) {
                Video v = store.get(vidNo - 1);
                v.receiveRating(rating);
                System.out.println("Rating received successfully.");
            } else {
                System.out.println("Sorry, invalid video number.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Sorry, invalid video number.");
        }
    }

    void listInventory() {
        if (videos == 0) {
            System.out.println("Sorry, there are no videos in the inventory currently.");
            return;
        }

        System.out.println("--------------------------------------------------------");
        System.out.printf("%-20s %-20s %-10s\n", "Video Name", "Checkout Status", "Rating");
        for (int i = 0; i < store.size(); i++) {
            Video v = store.get(i);
            System.out.printf("%-20s %-20s %-10s\n", v.getName(), v.getCheckout(), v.getRating());
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("End of list");
    }
}
