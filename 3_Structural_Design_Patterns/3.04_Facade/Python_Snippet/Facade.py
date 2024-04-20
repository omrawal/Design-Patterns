class Television:
    def on(self):
        print("Turning on TV")

    def off(self):
        print("Turning off TV")


class SoundSystem:
    def on(self):
        print("Turning on SoundSystem")

    def off(self):
        print("Turning off SoundSystem")


class DVDPlayer:
    def on(self):
        print("Turning on DVDPlayer")

    def off(self):
        print("Turning off DVDPlayer")

    def play(self):
        print("Playing DVD")


class HomeTheatreFacade:
    def __init__(self, tv, sound_system, dvd_player):
        self.tv = tv
        self.sound_system = sound_system
        self.dvd_player = dvd_player

    def watch_movie(self, movie):
        print("Get ready to watch a movie...")
        self.tv.on()
        self.sound_system.on()
        self.dvd_player.on()
        self.dvd_player.play()

    def end_movie(self):
        print("Shutting down the home theater...")
        self.tv.off()
        self.sound_system.off()
        self.dvd_player.off()


if __name__ == "__main__":
    tv = Television()
    sound_system = SoundSystem()
    dvd_player = DVDPlayer()

    home_theater = HomeTheatreFacade(tv, sound_system, dvd_player)

    home_theater.watch_movie("Inception")
    print("\nMovie ends, shutting down the home theater...")
    home_theater.end_movie()