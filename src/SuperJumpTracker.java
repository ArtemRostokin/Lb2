public class SuperJumpTracker {
    private static boolean superJumpUsed = false;

    public static boolean isSuperJumpUsed() {
        return superJumpUsed;
    }

    public static void useSuperJump() {
        superJumpUsed = true;
    }
}
