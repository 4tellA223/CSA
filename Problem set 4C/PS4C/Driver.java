public class Driver{

    public static void main(String []arg){
        //total sentiment
        System.out.println(Review.totalSentiment("SimpleReview.txt"));
        //star Rating
        System.out.println(Review.starRating("SimpleReview.txt"));
        //fake review
        System.out.println(Review.fakeReview("SimpleReview.txt"));
    }
}