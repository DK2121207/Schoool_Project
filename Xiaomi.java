package Handphone;

public class Xiaomi implements Phone {

    private int volume;
    private boolean isPowerOn;

    public Xiaomi() {
        // set volume awal
        this.volume = 50;
    }

    @Override
    public void powerOn() {
        if (isPowerOn == false) {
            isPowerOn = true;
            System.out.println("Handphone menyala...");
            System.out.println("Selamat datang di XIAOMI");
            System.out.println("Android version 29");
        } else {
            System.out.println("Handphone sudah menyala");
        }
    }

    @Override
    public void powerOff() {
        if (isPowerOn == true) {
            isPowerOn = false;
            System.out.println("Handphone dimatikan");
        } else {
            System.out.println("Handphone sudah dimatikan");
        }
    }

    @Override
    public void volumeUp() {
        if (isPowerOn == true) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume FULL!!");
                System.out.println("sudah " + this.getVolume() + "%");
            } else {
                this.volume += 10;
                System.out.println("Volume sekarang: " + this.getVolume() + "%");
            }
        } else {
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (this.volume == MIN_VOLUME) {
                System.out.println("Volume = 0%");
            } else {
                this.volume -= 10;
                System.out.println("Volume sekarang: " + this.getVolume() + "%");
            }
        } else {
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }

    public int getVolume() {
        return this.volume;
    }

}