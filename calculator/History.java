package calculator;

import java.util.ArrayList;

public class History {
    private ArrayList<String> historyList = new ArrayList<>();

    public void addRecord(String record) {
        historyList.add(record);
    }

    public void showHistory() {
        if(historyList.isEmpty()) {
            System.out.println("No history available.");
        } else {
            System.out.println("\n--- Calculation History ---");
            for(String record : historyList) {
                System.out.println(record);
            }
        }
    }
}
