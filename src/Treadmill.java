public class Treadmill implements Crossable {
    private int length;
    private Type type;

    public enum Type {
        SHORT, MEDIUM, LONG
    }

    public Treadmill(int length, Type type) {
        this.length = length;
        this.type = type;
    }

    @Override
    public boolean cross(Athletics athlete) {
        if (athlete.run(length)) {
            return true;
        } else {
            System.out.println("Не удалось пробежать дистанцию.");
            return false;
        }
    }

    public Type getType() {
        return type;
    }
}
