import java.util.*;

public class IdentifySequence {

    // Method to group user actions by userId
    public Map<Integer, List<String>> identifyUsers(List<Map<String, Object>> logs) {
        Map<Integer, List<String>> userActions = new HashMap<>();

        for (Map<String, Object> log : logs) {
            Object userIdObj = log.get("userId");
            Object actionObj = log.get("action");

            if (userIdObj == null || actionObj == null) {
                continue; // skip invalid entries
            }

            int userId = (int) userIdObj;
            String action = actionObj.toString();

            userActions.computeIfAbsent(userId, k -> new ArrayList<>()).add(action);
        }

        return userActions;
    }

    // Method to create a pattern sequence per user
    public Map<String, Integer> identifySequence(List<Map<String, Object>> logs) {
        Map<Integer, List<String>> userActions = identifyUsers(logs);
        Map<String, Integer> patternMap = new HashMap<>();

        for (Map.Entry<Integer, List<String>> entry : userActions.entrySet()) {
            int userId = entry.getKey();
            List<String> actions = entry.getValue();
            StringBuilder pattern = new StringBuilder();

            for (String action : actions) {
                pattern.append(action);
            }

            patternMap.put(pattern.toString(), userId);
        }

        return patternMap;
    }

    // Main method to run the example
    public static void main(String[] args) {
        List<Map<String, Object>> logs = new ArrayList<>();

        logs.add(Map.of("action", "A", "userId", 1));
        logs.add(Map.of("action", "A", "userId", 1));
        logs.add(Map.of("action", "B", "userId", 2));
        logs.add(Map.of("action", "A", "userId", 1));
        logs.add(Map.of("action", "C", "userId", 2));

        IdentifySequence identifySequence = new IdentifySequence();
        Map<String, Integer> result = identifySequence.identifySequence(logs);

        System.out.println(result);
    }
}
