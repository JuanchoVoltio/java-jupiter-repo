public class Simulator {

    private Driver[] drivers;
    private RaceTrack[] tracks;

    public Simulator(Driver[] drivers, RaceTrack tracks[]) {
        this.drivers = drivers;
        this.tracks = tracks;
    }

    public void simulateQuali() {

    }

    public Driver[] getDrivers() {
        return drivers;
    }

    public void setDrivers(Driver[] drivers) {
        this.drivers = drivers;
    }

    public RaceTrack[] getTracks() {
        return tracks;
    }

    public void setTracks(RaceTrack[] tracks) {
        this.tracks = tracks;
    }
}