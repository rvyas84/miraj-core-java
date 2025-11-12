import java.util.*;

public class IdentifyUser {

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

            // Add action to the user's list
            userActions.computeIfAbsent(userId, k -> new ArrayList<>()).add(action);
        }

        return userActions;
    }

    public static void main(String[] args) {
        // Create input logs (list of maps)
        List<Map<String, Object>> logs = new ArrayList<>();

        logs.add(Map.of("action", "A", "userId", 1));
        logs.add(Map.of("action", "A", "userId", 1));
        logs.add(Map.of("action", "B", "userId", 2));
        logs.add(Map.of("action", "A", "userId", 1));
        logs.add(Map.of("action", "C", "userId", 2));

        // Run IdentifyUser
        IdentifyUser identifyUser = new IdentifyUser();
        Map<Integer, List<String>> result = identifyUser.identifyUsers(logs);

        // Print the result
        System.out.println(result);
    }
}
