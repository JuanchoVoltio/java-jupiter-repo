public class RaceTrack {

    private String name;
    private Bonus bonus;

    public RaceTrack(String name, Bonus bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bonus getBonus() {
        return bonus;
    }

    public void setBonus(Bonus bonus) {
        this.bonus = bonus;
    }
}