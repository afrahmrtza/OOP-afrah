import java.time.LocalDateTime;

public class ProviderTelecom {
    String name;
    int mobileBalance;
    int mobileData;
    LocalDateTime expiredMobileBalance;
    LocalDateTime expiredMobileData;

    public ProviderTelecom(){
        this.name = "Telkomsel";
        this.mobileBalance = 10000;
        this.mobileData = 30;
    }

    public void getInfo() {
        System.out.println("Ini adalah informasi kartumu" + " Provider " + name + " Pulsa " + mobileBalance + " Data " + mobileData + " Gb");
    }
    public void addmobileBalance(int a) {
        mobileBalance = mobileBalance + a;
    }
    public void minmobileBalance(int a) {
        mobileBalance = mobileBalance - a;
    }
    public void addmobileData(int a) {
        mobileData = mobileData + a;
    }
    public void minmobileData(int a) {
        mobileData = mobileData - a;
    }

}
