public class Main {
    public static void main(String[] args) {
        
        Athletics[] athletes = {
                new Cat(100, 200),
                new Human(100, 150),
                new Robot(500, 0),
                new Cat(100, 200)
        };

        Crossable[] equipments = {
                new Treadmill(100, Treadmill.Type.SHORT),
                new Treadmill(700, Treadmill.Type.LONG),
                new Wall(150),
                new Wall(1700),
                new Treadmill(500, Treadmill.Type.MEDIUM),
        };

        for (Athletics athlete : athletes) {
            boolean completedAll = true;
            for (Crossable equipment : equipments) {
                if (!equipment.cross(athlete)) {
                    completedAll = false;
                    break;
                }
            }
            if (!completedAll) {
                System.out.println(athlete.getClass().getSimpleName() + " выбыл из соревнования.");
            }
        }
    }
}
