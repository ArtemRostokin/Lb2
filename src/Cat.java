public class Cat implements Athletics {
    private int runLimit;
    private int jumpLimit;
    private boolean superRunUsed = false;

    public Cat(int runLimit, int jumpLimit) {
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public boolean run(int distance) {
        if (distance <= runLimit) {
            System.out.println("Cat успешно пробежал " + distance + " метров.");
            return true;
        } else if (!superRunUsed) {
            System.out.println("Cat преодолел дистанцию " + distance +  " метров с помощью супер бега!");
            superRunUsed = true;
            return true;
        } else {
            System.out.println("Cat не смог пробежать " + distance + " метров.");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= jumpLimit) {
            System.out.println("Cat успешно перепрыгнул " + height + " метров.");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean superJump() {
        if (!SuperJumpTracker.isSuperJumpUsed()) {
            System.out.println("Стена слишком высокая, Cat использовал супер прыжок!");
            SuperJumpTracker.useSuperJump();
            return true;
        } else {
            System.out.println("Cat не преодолел стену, супер прыжок уже использован.");
            return false;
        }
    }
}
