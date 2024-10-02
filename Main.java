public class Main {
    public static void main(String[] args){
        ProviderTelecom provider = new ProviderTelecom();

        provider.addmobileBalance(25000);
        provider.getInfo();

        provider.minmobileBalance(2000);
        provider.getInfo();
        
        provider.addmobileData(10);
        provider.getInfo();

        provider.minmobileData(5);
        provider.getInfo();
    
    }
}