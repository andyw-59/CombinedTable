public class CombinedTable {
    private SingleTable t1;
    private SingleTable t2;

    public CombinedTable(SingleTable table1, SingleTable table2) {
        t1 = table1;
        t2 = table2;
    }

    public boolean canSeat(int seats) {
        int available = t1.getNumSeats() + t2.getNumSeats() - 2;
        if (seats <= available) return true;
        return false;
    }

    public double getDesirability() {
        double desirability = 0;
        if (t1.getHeight() == t2.getHeight()) {
            desirability = (t1.getViewQuality() + t2.getViewQuality()) / 2.0;
        }
        if (t1.getHeight() != t2.getHeight()) {
            desirability = ((t1.getViewQuality() + t2.getViewQuality()) / 2.0) - 10.0;
        }
        return desirability;
    }
    
}