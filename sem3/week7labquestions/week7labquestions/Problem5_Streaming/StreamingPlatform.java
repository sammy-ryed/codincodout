public class StreamingPlatform {
    public static void main(String[] args) {
        Content[] list = new Content[] {
            new Movie("Inception", "PG-13", 148),
            new TVSeries("Friends", 10, 236),
            new Documentary("Our Planet", "Nature")
        };
        for (Content c : list) {
            c.show();
            if (c instanceof Movie) {
                ((Movie)c).movieDetails();
            } else if (c instanceof TVSeries) {
                ((TVSeries)c).seriesDetails();
            } else if (c instanceof Documentary) {
                ((Documentary)c).docDetails();
            }
            System.out.println();
        }
    }
}

class Content {
    String title;
    Content(String t){ title=t; }
    void show(){ System.out.println("Now playing: " + title); }
}

class Movie extends Content {
    String rating; int duration;
    Movie(String t,String r,int d){ super(t); rating=r; duration=d; }
    void movieDetails(){ System.out.println("Movie - Rating: " + rating + " | Duration: " + duration + "min"); }
}

class TVSeries extends Content {
    int seasons, episodes;
    TVSeries(String t,int s,int e){ super(t); seasons=s; episodes=e; }
    void seriesDetails(){ System.out.println("Series - Seasons: " + seasons + " | Episodes: " + episodes); }
}

class Documentary extends Content {
    String tag;
    Documentary(String t,String tag){ super(t); this.tag=tag; }
    void docDetails(){ System.out.println("Documentary - Tag: " + tag); }
}