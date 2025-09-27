package intro_pt2.DataVisualisation.LineGraphs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main
{
    public static void main(String[] args) {
//        Application.launch(RPK.class);

        Map<String, Map<String, Integer>> teamGameData = new HashMap<>();
        teamGameData.put("Charlton", new HashMap<>());
        teamGameData.put("Forest", new HashMap<>());

        teamGameData.keySet().forEach(team -> {
            Map<String, Integer> gameStats = teamGameData.get(team);
            gameStats.put("Goals: ", 10);
        });

        Set<String> dataCheck = teamGameData.keySet();
        for (String data : dataCheck) {
            System.out.println(data);
        }

        System.out.println(teamGameData.entrySet());


        System.out.println();
        System.out.println(dataCheck);
        System.out.println();

        System.out.println(teamGameData.get("Charlton").entrySet());
        teamGameData.get("Charlton").entrySet().stream().forEach(data -> {

        });
    }
}
