public class Bottle {
    private int volume;

    public Bottle(int volume) {
        this.volume = volume;
    }

    public int volume() {
        return this.volume;
    }

    public int drink() {
        return this.volume -= 10;
    }

    public int empty() {
        return this.volume = 0;
    }

    public int fillBottle() {
        return this.volume = 100;
    }

}
