class Television {
    public void on() {
        System.out.println("Turning on TV");
    }

    public void off() {
        System.out.println("Turning off TV");
    }
}

class SoundSystem {
    public void on() {
        System.out.println("Turning on SoundSystem");
    }

    public void off() {
        System.out.println("Turning off SoundSystem");
    }
}

class DVDPlayer {
    public void on() {
        System.out.println("Turning on DVDPlayer");
    }

    public void off() {
        System.out.println("Turning off DVDPlayer");
    }

    public void play() {
        System.out.println("Playing DVD");
    }
}

class HomeTheatreFacade {
    private Television tv;
    private SoundSystem soundSystem;
    private DVDPlayer dvdPlayer;

    public HomeTheatreFacade(Television tv, SoundSystem soundSystem, DVDPlayer dvdPlayer) {
        this.tv = tv;
        this.soundSystem = soundSystem;
        this.dvdPlayer = dvdPlayer;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        tv.on();
        soundSystem.on();
        dvdPlayer.on();
        dvdPlayer.play();
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        tv.off();
        soundSystem.off();
        dvdPlayer.off();
    }
}

public class Facade {
    public static void main(String[] args) {
        Television tv = new Television();
        SoundSystem soundSystem = new SoundSystem();
        DVDPlayer dvdPlayer = new DVDPlayer();

        HomeTheatreFacade homeTheater = new HomeTheatreFacade(tv, soundSystem, dvdPlayer);

        homeTheater.watchMovie("Inception");
        System.out.println("\nMovie ends, shutting down the home theater...");
        homeTheater.endMovie();
    }
}