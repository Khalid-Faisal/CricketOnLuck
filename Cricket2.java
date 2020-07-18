/*
author : Khalid Faisal
*/
import java.util.Random;
import java.util.Scanner;

class Cricket2 {
  public void main1() {
    tournament rs = new tournament();
    Scanner s = new Scanner(System.in);
    Random r = new Random();
    Cricket2 t = new Cricket2();
    String[] temp = new String[6];
    String str = t.select();
    String wait = "";
    temp = str.split("\\.");
    System.out.print("\n\t\t\t PRESS ENTER !!! ");
    wait = s.nextLine();
    int me = rs.match(15, temp[3], temp[4]);
    if (me == 20) {
      System.out.println("\n\n\n\t\t\t SEMI FINAL ");
      System.out.println("\t\t-------------------------------");
      System.out.println("\t\t\t " + temp[3] + " vs " + temp[1]);
      System.out.println("\t\t\t " + temp[0] + " vs " + temp[2]);
      System.out.println("\t\t-------------------------------");
      System.out.print("\n\t\t\t PRESS ENTER !!! ");
      wait = s.nextLine();
      int sf1 = rs.match(15, temp[3], temp[1]);
      int sf2 = r.nextInt(50);
      if (sf1 == 20) {
        int f;
        System.out.println("\n\t\t\t   FINAL ");
        System.out.println("\t\t-------------------------------");
        if (sf2 > 20) {
          System.out.println("\t\t\t " + temp[3] + " vs " + temp[0]);
        } else {
          System.out.println("\t\t\t " + temp[3] + " vs " + temp[2]);
        }
        System.out.println("\t\t----------------------------------- ");
        System.out.print("\n\t\t\t PRESS ENTER !!! ");
        wait = s.nextLine();
        if (sf2 > 20) {
          f = rs.match(15, temp[3], temp[0]);
        } else {
          f = rs.match(15, temp[3], temp[2]);
        }
        if (f == 20) {
          System.out.println("\n\n\t\t\t CONGRATULATIONS !!!\n\t\t  YOU( " + temp[3] + ") WON THE \" WORLD CUP \"....\n\n");
        } else {
          System.out.println("\n\n\t\tSORRY !!! YOU LOSE AT FINAL..\n\n");
        }
      } else {
        System.out.print("\n\t\t\t PRESS ENTER !!! ");
        wait = s.nextLine();
        System.out.println("\n\t\t\t   FINAL ");
        System.out.println("\t\t-------------------------------");
        if (sf2 > 20) {
          System.out.println("\t\t\t " + temp[1] + " vs " + temp[0]);
        } else {
          System.out.println("\t\t\t " + temp[1] + " vs " + temp[2]);
        }
        System.out.println("\t\t-------------------------------");
        System.out.println("\n\n\t\tSORRY !!! YOU LOSE \n\n");
      }
    } else {
      System.out.print("\n\t\t\t PRESS ENTER !!! ");
      wait = s.nextLine();
      System.out.println("\n\n\t\t\t SEMI FINAL ");
      System.out.println("\t\t-----------------------------------");
      System.out.println("\t\t\t " + temp[4] + " vs " + temp[1]);
      System.out.println("\t\t\t " + temp[0] + " vs " + temp[2]);
      System.out.println("\t\t----------------------------------- ");
      System.out.println("\n\n\t\tSORRY !!! YOU LOSE \n\n");
    }
  }

  public String select() {
    Scanner s = new Scanner(System.in);
    System.out.println("-------------------------------------------------------------------------------------------------------");
    System.out.println("\t\t\t\t\t\t $$ TEAMS $$\n\t\t1.AUS\t\t\t2.IND\t\t\t3.SL\t\t 7.ENG\n\t\t4.PAK\t\t\t5.SA\t\t\t6.BAN\t\t 8.NZL");
    System.out.println("-------------------------------------------------------------------------------------------------------");
    String my1 = "";
    System.out.print("\nEnter your choice :");
    int my = s.nextInt();
    switch (my) {
      case 1:
        my1 = "AUS";
        break;
      case 2:
        my1 = "IND";
        break;
      case 3:
        my1 = "SL";
        break;
      case 4:
        my1 = "PAK";
        break;
      case 5:
        my1 = "SA";
        break;
      case 6:
        my1 = "BAN";
        break;
      case 7:
        my1 = "ENG";
        break;
      case 8:
        my1 = "NZL";
        break;
      default:
        my1 = "WI";
        break;
    }
    System.out.println("-------------------------------------------------------------------------------------------------------");
    Random r = new Random();
    int[] semi = new int[8];
    String team2 = "", ret = "";
    String[] teams = { "AUS", "IND", "SL", "PAK", "SA", "BAN", "ENG", "NZL", "WI" };
    String[] team = new String[10];
    int op = r.nextInt(teams.length);
    do {
      switch (op + 1) {
        case 1:
          team2 = teams[0];
          break;
        case 2:
          team2 = teams[1];
          break;
        case 3:
          team2 = teams[2];
          break;
        case 4:
          team2 = teams[3];
          break;
        case 5:
          team2 = teams[4];
          break;
        case 6:
          team2 = teams[5];
          break;
        case 7:
          team2 = teams[6];
          break;
        case 8:
          team2 = teams[7];
          break;
        default:
          team2 = teams[8];
          break;
      }
    } while (team2.equals("") || team2.equals(my1));
    int i, j;
    for (i = 0, j = 0; i < teams.length; i++, j++) {
      if (teams[i].equals(my1) || teams[i].equals(team2))
        i++;
      team[j] = teams[i];
    }
    System.out.println("\n\n\t\t\t QUARTER FINAL ");
    System.out.print("\t\t-------------------------------");
    for (i = 0, j = 0; i < 3; i++, j++) {
      System.out.print("\n\t\t\t  " + team[i] + " vs " + team[i + 3]);
      int win = r.nextInt(50);
      if (win > 20) {
        semi[j] = i;
      } else {
        semi[j] = i + 3;
      }
      ret = ret + team[semi[j]] + ".";
    }
    System.out.println("\n\t\t\t  " + my1 + " vs " + team2);
    System.out.println("\t\t-------------------------------");
    System.out.println("\n\n");
    return ret + my1 + "." + team2;
  }

  public String selectTeam() {
    String tname = "", t1name = "";
    Scanner s = new Scanner(System.in);
    int op = 10, me = 0;
    System.out.println("-------------------------------------------------------------------------------------------------------");
    System.out.println("\n\t\t\t\t\t\t $$ TEAMS $$\n\t\t1.AUS\t\t\t2.IND\t\t\t3.SL\t\t 7.ENG\n\t\t4.PAK\t\t\t5.SA\t\t\t6.BAN\t\t 8.NZL");
    System.out.println("-------------------------------------------------------------------------------------------------------");
    do {
      System.out.print("Select Your Team:");
      me = s.nextInt();
      System.out.print("Select Opponent :");
      op = s.nextInt();
      if (op != me)
        continue;
      System.out.print("\t\t Can't Play with Same Team...\n");
      op = 0;
    } while (op == 0);
    System.out.println("--------------------------------------------------------------------------------");
    System.out.print("\t\t\t\t");
    switch (me) {
      case 1:
        System.out.print(" AUS ");
        tname = "AUS";
        break;
      case 2:
        System.out.print(" IND ");
        tname = "IND";
        break;
      case 3:
        System.out.print(" SL ");
        tname = "SL";
        break;
      case 4:
        System.out.print(" PAK ");
        tname = "PAK";
        break;
      case 5:
        System.out.print(" SA ");
        tname = "SA";
        break;
      case 6:
        System.out.print(" BAN ");
        tname = "BAN";
        break;
      case 7:
        System.out.print(" ENG ");
        tname = "ENG";
        break;
      case 8:
        System.out.print(" NZL ");
        tname = "NZL";
        break;
      default:
        System.out.print(" WI ");
        tname = "WI";
        break;
    }
    System.out.print("vs");
    switch (op) {
      case 1:
        System.out.print(" AUS ");
        t1name = "AUS";
        System.out.print("\n");
        return tname + "." + t1name;
      case 2:
        System.out.print(" IND ");
        t1name = "IND";
        System.out.print("\n");
        return tname + "." + t1name;
      case 3:
        System.out.print(" SL ");
        t1name = "SL";
        System.out.print("\n");
        return tname + "." + t1name;
      case 4:
        System.out.print(" PAK ");
        t1name = "PAK";
        System.out.print("\n");
        return tname + "." + t1name;
      case 5:
        System.out.print(" SA ");
        t1name = "SA";
        System.out.print("\n");
        return tname + "." + t1name;
      case 6:
        System.out.print(" BAN ");
        t1name = "BAN";
        System.out.print("\n");
        return tname + "." + t1name;
      case 7:
        System.out.print(" ENG ");
        t1name = "ENG";
        System.out.print("\n");
        return tname + "." + t1name;
      case 8:
        System.out.print(" NZL ");
        t1name = "NZL";
        System.out.print("\n");
        return tname + "." + t1name;
    }
    System.out.print(" WI ");
    t1name = "WI";
    System.out.print("\n");
    return tname + "." + t1name;
  }
}
