import smartphone.device.IPhone;

public class App {
    public static void main(String[] args) throws Exception {
        IPhone iphone = new IPhone();

        iphone.ligar("51 984681985");
        iphone.atender();
        iphone.iniciarCorreioVoz();
    }
}
