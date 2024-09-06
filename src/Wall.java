public class Wall implements Crossable {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean cross(Athletics athlete) {
        if (athlete.jump(height) || athlete.superJump()) {
            return true;
        } else {
            System.out.println("Не удалось перепрыгнуть барьер.");
            return false;
        }
    }
}
