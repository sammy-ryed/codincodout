class Vehicle {
    private static int counter=0, totalVehicles=0;
    private static double totalRevenue=0;
    private static String companyName;
    private String vehicleId, brand, model;
    private double rentPerDay;
    private boolean isAvailable=true;

    public Vehicle(String brand,String model,double rent){
        this.vehicleId="V"+(++counter); this.brand=brand; this.model=model; this.rentPerDay=rent;
        totalVehicles++;
    }
    public double rentVehicle(int days){
        if(isAvailable){ isAvailable=false; double rent=days*rentPerDay; totalRevenue+=rent; return rent; }
        return 0;
    }
    public void returnVehicle(){ isAvailable=true; }
    public void displayVehicleInfo(){ System.out.println(vehicleId+" "+brand+" "+model+" Rent:"+rentPerDay+" Available:"+isAvailable); }
    public static void setCompanyName(String name){ companyName=name; }
    public static void displayCompanyStats(){ System.out.println(companyName+" Total Revenue:"+totalRevenue+" Vehicles:"+totalVehicles); }

    public static void main(String[] args){
        Vehicle.setCompanyName("Fast Rentals");
        Vehicle v1=new Vehicle("Toyota","Corolla",1000);
        Vehicle v2=new Vehicle("Honda","Civic",1200);
        System.out.println("Rent v1:"+v1.rentVehicle(5));
        v1.displayVehicleInfo();
        v1.returnVehicle();
        v1.displayVehicleInfo();
        Vehicle.displayCompanyStats();
    }
}