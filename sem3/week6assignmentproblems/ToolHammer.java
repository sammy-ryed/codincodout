
// 🧪 HW PROBLEM 2: Tool Access Levels
class Tool {
    private String id = "T123";
    protected String type = "Generic Tool";
    public String brand = "Universal";

    public String getId() {
        return id;
    }
}

class Hammer extends Tool {
    public void displayAccess() {
        // System.out.println(id); // ❌ private not accessible
        System.out.println("Protected type: " + type); // ✅ accessible
        System.out.println("Public brand: " + brand); // ✅ accessible
        System.out.println("Private id via getter: " + getId()); // ✅ through getter
    }
}

class ToolTest {
    public static void main(String[] args) {
        Hammer h = new Hammer();
        h.displayAccess();
    }
}
