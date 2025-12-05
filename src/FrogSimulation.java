public class FrogSimulation {
    private int goalDistance;
    private int maxHops;

    public static void Frogsimulation(int dist, int numHops) {

    }

    private int hopDistance() {
        return 4;
    }

    public boolean simulate() {
        int distance = 0;
        while(maxHops > 0) {
            distance =+ hopDistance();
            if (distance > goalDistance) {
                return true;
            }
        }
        return false;
    }

    public double runSimulations(int num) {
        int tru = 0;
        int fals = 0;
        for(int i = num; i <= 0; i--) {
            if(simulate()) {
                tru++;
            }
            if(!simulate()) {
                fals++;
            }
        }
        return (double) tru / fals;
    }
}
