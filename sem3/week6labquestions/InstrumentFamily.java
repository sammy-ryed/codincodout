
// 🧪 LAB PROBLEM 5: Musical Instrument Family
class Instrument {
    protected String name;
    protected String material;

    public Instrument(String name, String material) {
        this.name = name;
        this.material = material;
    }
}

class Piano extends Instrument {
    private int keys;

    public Piano(String name, String material, int keys) {
        super(name, material);
        this.keys = keys;
    }

    public void play() {
        System.out.println(name + " with " + keys + " keys is playing.");
    }
}

class Guitar extends Instrument {
    private int strings;

    public Guitar(String name, String material, int strings) {
        super(name, material);
        this.strings = strings;
    }

    public void play() {
        System.out.println(name + " with " + strings + " strings is playing.");
    }
}

class Drum extends Instrument {
    private String type;

    public Drum(String name, String material, String type) {
        super(name, material);
        this.type = type;
    }

    public void play() {
        System.out.println(name + " (" + type + ") is playing.");
    }
}

class InstrumentTest {
    public static void main(String[] args) {
        Instrument[] instruments = {
            new Piano("Grand Piano", "Wood", 88),
            new Guitar("Acoustic Guitar", "Wood", 6),
            new Drum("Bass Drum", "Metal", "Percussion")
        };

        for (Instrument x : instruments) {
            if (x instanceof Piano) ((Piano)x).play();
            else if (x instanceof Guitar) ((Guitar)x).play();
            else if (x instanceof Drum) ((Drum)x).play();
        }
    }
}
