package lab3.task1;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Iphone8 oldIphone = new Iphone8("iPhone 8", 85, "Space Gray");
        Iphone15Promax newIphone = new Iphone15Promax("iPhone 15 Pro Max", 100, "eSim", 6);

        List<Iphone> phones = new ArrayList<>();
        phones.add(oldIphone);
        phones.add(newIphone);

        for (Iphone phone : phones) {
            System.out.println("Model: " + phone.model + " (Battery: " + phone.battery + "%)");
            phone.showAppleLogo();
            phone.unlock();
            
            if (phone instanceof WirelessChargable) {
                ((WirelessChargable) phone).chargeWireless();
            }
            
            if (phone instanceof WaterResistant) {
                if (phone instanceof Iphone15Promax) {
                    ((WaterResistant) phone).submergedInWater(((Iphone15Promax) phone).depth);
                }
            }
            System.out.println();
        }

        System.out.println("iPhone 8 color: " + oldIphone.getColor());
        System.out.println("iPhone 15 Pro Max SIM type: " + newIphone.gettypeOfSim());
    }
}