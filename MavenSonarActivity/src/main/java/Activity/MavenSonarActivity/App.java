package Activity.MavenSonarActivity;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
    	SortedMap<String, String> marketProjects = new TreeMap<>();
        

        marketProjects.put("US", "ProjectA");
        marketProjects.put("Europe", "ProjectB");
        marketProjects.put("UAE", "ProjectC");

        
        for (String market : marketProjects.keySet()) {
            System.out.println("Market: " + market + ", Project: " + marketProjects.get(market));
        }
    }
  }

