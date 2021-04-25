package SS8;

public class WaterMonster extends Monster{
    public WaterMonster(String name) {
        super(name);
    }

    @Override
    public String Attack() {
        return "Attack with Water!";
    }
}
