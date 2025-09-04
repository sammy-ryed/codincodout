public class SmartDevice {
private String deviceName;
private String location;
private boolean isOnline;
private double powerConsumption;
private String[] connectedDevices;
private int connectionCount;
public SmartDevice(String deviceName, String location, boolean isOnline, double powerConsumption) {
this.deviceName = deviceName;
this.location = location;
this.isOnline = isOnline;
this.powerConsumption = powerConsumption;
this.connectedDevices = new String[5];
this.connectionCount = 0;
}
public void updateLocation(String location) {
this.location = location;
System.out.println(this.deviceName + " moved to " + this.location);
}
public void updatePowerConsumption(double powerConsumption) {
this.powerConsumption = powerConsumption;
System.out.println("Power consumption updated for " + this.deviceName);
}
public SmartDevice setOnline(boolean isOnline) {
this.isOnline = isOnline;
return this;
}
public SmartDevice connectToDevice(String deviceName) {
if (this.connectionCount < this.connectedDevices.length) {
this.connectedDevices[this.connectionCount] = deviceName;
this.connectionCount++;
System.out.println(this.deviceName + " connected to " + deviceName);
}
return this;
}
public SmartDevice rename(String deviceName) {
String oldName = this.deviceName;
this.deviceName = deviceName;
System.out.println("Device renamed from " + oldName + " to " + this.deviceName);
return this;
}
public void displayDeviceInfo() {
System.out.println("\n=== " + this.deviceName + " INFO ===");
System.out.println("Location: " + this.location);
System.out.println("Status: " + (this.isOnline ? "Online" : "Offline"));
System.out.println("Power: " + this.powerConsumption + "W");
System.out.println("Connections: " + this.connectionCount);
for (int x = 0; x < this.connectionCount; x++) {
System.out.println(" -> " + this.connectedDevices[x]);
}
}
public void performInitialSetup() {
this.setOnline(true);
System.out.println(this.deviceName + " initial setup completed");
}
public static void main(String[] args) {
System.out.println("=== SMART HOME DEVICE NETWORK ===");
SmartDevice d1 = new SmartDevice("Light", "Living Room", false, 15.5);
SmartDevice d2 = new SmartDevice("Fan", "Bedroom", true, 40.0);
d1.setOnline(true).connectToDevice("Alexa").rename("Smart Light");
d2.connectToDevice("Hub");
d1.displayDeviceInfo();
d2.displayDeviceInfo();
d1.performInitialSetup();
}
}