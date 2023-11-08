import java.util.ArrayList;
import java.util.List;

public class ReservationManager {
    private static ReservationManager instance;
    private List<Table> availableTables = new ArrayList<>();

    private ReservationManager() {
        // Initialize available tables
        availableTables.add(new StandardTable());
        availableTables.add(new VipTable());
    }

    public static ReservationManager getInstance() {
        if (instance == null) {
            instance = new ReservationManager();
        }
        return instance;
    }

    public Table reserveTable(String type) {
        for (Table table : availableTables) {
            if (table.getClass().getSimpleName().toLowerCase().contains(type.toLowerCase())) {
                availableTables.remove(table);
                return table;
            }
        }
        System.out.println("No available tables of type: " + type);
        return null;
    }
}