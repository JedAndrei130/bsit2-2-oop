import java.util.*;

public class main {
    public static void main(String[] args) {
        PostManager pm = new PostManager();


        String postTitle = "Java Programming Tips";
        int engagement = pm.calculateEngagement(150, 75, 25); // likes, comments, shares

        pm.displayPostStats(postTitle, engagement);
        String category = pm.getCategoryRating(engagement);
        pm.displayPostStats(postTitle, engagement, category);


        String[] hashtags = {"#java", "#coding", "#programming", "#java", "#tips"};
        ArrayList<String> uniqueHashtags = pm.manageHashtags(hashtags);
        System.out.println("\nUnique Hashtags: " + uniqueHashtags);

        ArrayList<String> posts = new ArrayList<>(Arrays.asList(
                "Java Programming Tips",
                "Advanced Java Tutorial",
                "Spring Boot Guide"
        ));

        HashMap<String, Integer> postEngagement = new HashMap<>();
        postEngagement.put("Java Programming Tips", engagement);
        postEngagement.put("Advanced Java Tutorial", 700);
        postEngagement.put("Spring Boot Guide", 800);

        LinkedList<String> trending = pm.findTrendingPosts(posts, postEngagement);
        System.out.println("Trending Posts: " + trending);

        HashSet<String> authors = pm.getUniqueAuthors("Alice", "Bob", "Alice", "Charlie", "Bob");
        System.out.println("Unique Authors: " + authors);
    }
}
