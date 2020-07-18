/*
author : Khalid Faisal
*/
public class tournament {
  public int match(int over, String teamn1, String teamn2) {
    int sc1, sc2, n = 0;
    SelectTeam sl = new SelectTeam();
    String teamn = sl.select(teamn1, teamn2);
    String team1 = "", team2 = "";
    String[] t = new String[3];
    t = teamn.split("\\,");
    if (t[2].equals("w")) {
      team1 = t[0];
      team2 = t[1];
    } else {
      team1 = t[1];
      team2 = t[0];
    }
    SelectTeam p = new SelectTeam();
    if (over == 1 || over > 50) {
      sc1 = p.superover(team1, 37);
      sc2 = p.superover(team2, sc1);
    } else if (t[2].equals("w")) {
      sc1 = p.batting(team1, over, 100000);
      System.out.println("\n");
      sc2 = p.batting(team2, over, sc1);
    } else {
      sc1 = p.batting(team2, over, 100000);
      System.out.println("\n");
      sc2 = p.batting(team1, over, sc1);
    }
    System.out.println("--------------------------------------------------------------------------------");
    if (sc1 > sc2) {
      if (t[2].equals("w")) {
        System.out.println("\n\t\t* WINNER :" + team1 + "(YOU)");
        System.out.println("\t\t " + team1 + " Won by " + (sc1 - sc2) + " Runs.\n\n ");
        return 20;
      }
      System.out.println("\n\t\t* WINNER :" + team2 + "(OPPONENT)");
      System.out.println("\t\t " + team2 + " Won by " + (sc1 - sc2) + " Runs.\n\n ");
      return 0;
    }
    if (sc1 < sc2) {
      if (t[2].equals("l")) {
        System.out.println("\n\t\t* WINNER :" + team1 + "(YOU)");
        return 20;
      }
      System.out.println("\n\t\t* WINNER :" + team2 + "(OPPONENT)");
      return 0;
    }
    if (sc1 == sc2) {
      int sc11 = p.superover(team1, 37);
      int sc12 = p.superover(team2, sc11);
      if (sc11 > sc12) {
        System.out.print("\n\t\t* WINNER :" + team1 + "(YOU)");
        System.out.println("\t\t " + team1 + " Won by " + (sc11 - sc12) + " Runs.\n\n ");
        return 20;
      }
      System.out.print("\n\t\t* WINNER :" + team2 + "(OPPONENT)");
      return 0;
    }
    System.out.print("\n\t\t* WINNER :" + team2 + "(OPPONENT)\n\n");
    return 0;
  }
}
