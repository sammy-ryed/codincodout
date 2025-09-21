
// 🧪 HW PROBLEM 6: Weather System Hierarchy
class Weather {
    protected String description;

    public Weather(String description) {
        this.description = description;
        System.out.println("Weather constructor");
    }

    public void show() {
        System.out.println("Weather: " + description);
    }
}

class Storm extends Weather {
    protected int windSpeed;

    public Storm(String description, int windSpeed) {
        super(description);
        this.windSpeed = windSpeed;
        System.out.println("Storm constructor");
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Wind speed: " + windSpeed + " km/h");
    }
}

class Thunderstorm extends Storm {
    private boolean lightning;

    public Thunderstorm(String description, int windSpeed, boolean lightning) {
        super(description, windSpeed);
        this.lightning = lightning;
        System.out.println("Thunderstorm constructor");
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Lightning: " + lightning);
    }
}

class Sunshine extends Weather {
    private int temperature;

    public Sunshine(String description, int temperature) {
        super(description);
        this.temperature = temperature;
        System.out.println("Sunshine constructor");
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Temperature: " + temperature + "°C");
    }
}

class WeatherTest {
    public static void main(String[] args) {
        Weather[] forecasts = {
            new Thunderstorm("Heavy thunderstorm", 100, true),
            new Sunshine("Clear sky", 30)
        };

        for (Weather x : forecasts) {
            x.show();
            System.out.println("----");
        }
    }
}
