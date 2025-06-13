public class Video
{
    String name;
    boolean checkout;
    int rating ;
    Video(String name)
    {
        this.name = name;
        this.checkout = false;
        this.rating = 0;
    }
     String getName()
     {
         return name;
     }
    void doCheckout()
    {
        checkout = true;
        System.out.println("Video checked out Successfully");
    }
    void doReturn()
    {
        checkout = false;
        System.out.println("Video returned Successfully");
    }
    void receiveRating(int rating)
    {
        this.rating = rating;
        System.out.println("Video ratings received Successfully");
    }
    int getRating()
    {
        return rating;
    }
    boolean getCheckout()
    {
        return checkout;
    }
}
