public class Human implements Athletics {
    private int runLimit;
    private int jumpLimit;


    public Human(int runLimit, int jumpLimit) {
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public boolean run(int distance) {
        if (distance <= runLimit) {
            System.out.println("Human успешно пробежал " + distance + " метров.");
            return true;
        }
        else {
            System.out.println("Human не смог пробежать " + distance + " метров.");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= jumpLimit) {
            System.out.println("Human успешно перепрыгнул " + height + " метров.");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean superJump() {
        if (!SuperJumpTracker.isSuperJumpUsed()) {
            System.out.println("Стена слишком высокая, Human использовал супер прыжок!");
            SuperJumpTracker.useSuperJump();
            return true;
        } else {
            System.out.println("Human не преодолел стену, супер прыжок уже использован.");
            return false;
        }
    }
}
