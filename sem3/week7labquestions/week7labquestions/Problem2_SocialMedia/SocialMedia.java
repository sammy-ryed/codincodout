public class SocialMedia {
    public static void main(String[] args) {
        Post[] posts = new Post[] {
            new InstagramPost("Alice", "Sunset vibes!", "6pm", 120),
            new TwitterPost("Bob", "Java > Python?", "9am", 45),
            new LinkedInPost("Charlie", "Promoted to Manager!", "12pm", 300)
        };
        for (Post p : posts) {
            p.display();
            System.out.println();
        }
    }
}

class Post {
    String author, content, time;
    Post(String a, String c, String t){ author=a; content=c; time=t; }
    void display(){
        System.out.println("Post by " + author + " at " + time + ": " + content);
    }
}

class InstagramPost extends Post {
    int likes;
    InstagramPost(String a, String c, String t, int l){ super(a,c,t); likes=l; }
    @Override void display(){
        System.out.println("Instagram: " + content + " #" + author + " | Likes: " + likes);
    }
}

class TwitterPost extends Post {
    int retweets;
    TwitterPost(String a,String c,String t,int r){ super(a,c,t); retweets=r; }
    @Override void display(){
        System.out.println("Twitter: (" + content.length() + " chars) " + content + " | Retweets: " + retweets);
    }
}

class LinkedInPost extends Post {
    int connections;
    LinkedInPost(String a,String c,String t,int con){ super(a,c,t); connections=con; }
    @Override void display(){
        System.out.println("LinkedIn: " + content + " - by " + author + " | Connections: " + connections);
    }
}