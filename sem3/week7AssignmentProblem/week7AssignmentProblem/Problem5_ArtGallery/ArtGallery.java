public class ArtGallery {
    public static void main(String[] args) {
        ArtPiece[] collection = new ArtPiece[] {
            new Painting("Sunset", "Oil", "Warm palette", "Ornate"),
            new Sculpture("The Thinker", "Bronze", "2m x 1m x 1m"),
            new DigitalArt("Glitch", "1920x1080", "PNG"),
            new Photography("Street", "f/1.8, 1/500s", "Color grading")
        };
        for (ArtPiece a : collection) {
            a.basicInfo();
            if (a instanceof Painting) {
                Painting p = (Painting)a;
                p.paintingDetails();
            } else if (a instanceof Sculpture) {
                Sculpture s = (Sculpture)a;
                s.sculptureDetails();
            } else if (a instanceof DigitalArt) {
                DigitalArt d = (DigitalArt)a;
                d.digitalDetails();
            } else if (a instanceof Photography) {
                Photography p2 = (Photography)a;
                p2.photoDetails();
            }
            System.out.println();
        }
    }
}

class ArtPiece {
    String title;
    ArtPiece(String t){ title=t; }
    void basicInfo(){ System.out.println("Art: " + title); }
}

class Painting extends ArtPiece {
    String technique, palette, frame;
    Painting(String t,String tech,String pal,String f){ super(t); technique=tech; palette=pal; frame=f; }
    void paintingDetails(){ System.out.println("Painting - Technique: " + technique + " | Palette: " + palette + " | Frame: " + frame); }
}

class Sculpture extends ArtPiece {
    String material, dims;
    Sculpture(String t,String m,String d){ super(t); material=m; dims=d; }
    void sculptureDetails(){ System.out.println("Sculpture - Material: " + material + " | Dimensions: " + dims); }
}

class DigitalArt extends ArtPiece {
    String resolution, format;
    DigitalArt(String t,String r,String f){ super(t); resolution=r; format=f; }
    void digitalDetails(){ System.out.println("Digital - Resolution: " + resolution + " | Format: " + format); }
}

class Photography extends ArtPiece {
    String cameraSettings, editing;
    Photography(String t,String cs,String ed){ super(t); cameraSettings=cs; editing=ed; }
    void photoDetails(){ System.out.println("Photography - Camera: " + cameraSettings + " | Editing: " + editing); }
}