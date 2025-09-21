
// 🧪 LAB PROBLEM 6: Box and Gift Box Enhancement
class Box {
    public void pack() {
        System.out.println("Box is being packed");
    }

    public void unpack() {
        System.out.println("Box is being unpacked");
    }
}

class GiftBox extends Box {
    @Override
    public void pack() {
        super.pack();
        System.out.println("Adding ribbon and gift wrap");
    }

    @Override
    public void unpack() {
        super.unpack();
        System.out.println("Opening ribbon and gift wrap");
    }
}

class GiftBoxTest {
    public static void main(String[] args) {
        GiftBox gb = new GiftBox();
        gb.pack();
        gb.unpack();
    }
}
