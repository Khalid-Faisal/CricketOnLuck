/* @@author : Khalid Faisal

	This is Main File, Compile All the remaining files then compile and run this file
	ENJOY !!
*/
import java.util.Scanner;

public class LuckCricket {
  public static void main(String[] args) {
    int[] series = new int[7];
    String wait = "";
    int a = 0, b = 0, a1 = 0, b1 = 0, f = 0;
    tournament rs = new tournament();
    Cricket2 c2 = new Cricket2();
    Scanner s = new Scanner(System.in);
    String[] teams = new String[2];
    do {
      int nm;
      String str, team1, team2;
      int i, nm1;
      String str1, team01, team02;
      int j;
      System.out.println("\n\t\t\t\t\t $$ M E N U $$\n\t\t 1.One Day Series(20 Overs) \t\t 2.T20 Series(10 Overs) \n\t\t 3.Tournament(15 Overs) \t\t 4.EXIT ");
      System.out.println("-------------------------------------------------------------------------------------------------------");
      System.out.print("Which Formate you want to Play?   : ");
      f = s.nextInt();
      switch (f) {
        case 1:
          System.out.println("1)1 \t 2)3 \t 3)5 \t 4)7");
          System.out.println("Select Number of Matches :");
          nm = s.nextInt();
          str = c2.selectTeam();
          teams = str.split("\\.");
          team1 = teams[0];
          team2 = teams[1];
          switch (nm) {
            case 1:
              series[0] = rs.match(20, team1, team2);
              System.out.print("\t\t");
              if (series[0] == 20) {
                System.out.print("  WON  ");
                a = 1;
                break;
              }
              System.out.print("  LOSE  ");
              b = 1;
              break;
            case 2:
              series[0] = rs.match(20, team1, team2);
              System.out.print("\n\t\t\t PRESS ENTER !!! ");
              wait = s.nextLine();
              series[1] = rs.match(20, team1, team2);
              System.out.print("\n\t\t\t PRESS ENTER !!! ");
              wait = s.nextLine();
              series[2] = rs.match(20, team1, team2);
              System.out.print("\n\t\t\t PRESS ENTER !!! ");
              wait = s.nextLine();
              System.out.print("\t\t");
              for (i = 0; i < 3; i++) {
                if (series[i] == 20) {
                  System.out.print("  WON  ");
                  a++;
                } else {
                  System.out.print("  LOSE  ");
                  b++;
                }
              }
              break;
            case 3:
              series[0] = rs.match(20, team1, team2);
              System.out.print("\n\t\t\t PRESS ENTER !!! ");
              wait = s.nextLine();
              series[1] = rs.match(20, team1, team2);
              System.out.print("\n\t\t\t PRESS ENTER !!! ");
              wait = s.nextLine();
              series[2] = rs.match(20, team1, team2);
              System.out.print("\n\t\t\t PRESS ENTER !!! ");
              wait = s.nextLine();
              series[3] = rs.match(20, team1, team2);
              System.out.print("\n\t\t\t PRESS ENTER !!! ");
              wait = s.nextLine();
              series[4] = rs.match(20, team1, team2);
              System.out.print("\n\t\t\t PRESS ENTER !!! ");
              wait = s.nextLine();
              System.out.print("\t\t");
              for (i = 0; i < 5; i++) {
                if (series[i] == 20) {
                  System.out.print("  WON  ");
                  a++;
                } else {
                  System.out.print("  LOSE  ");
                  b++;
                }
              }
              break;
            case 4:
              series[0] = rs.match(20, team1, team2);
              System.out.print("\n\t\t\t PRESS ENTER !!! ");
              wait = s.nextLine();
              series[1] = rs.match(20, team1, team2);
              System.out.print("\n\t\t\t PRESS ENTER !!! ");
              wait = s.nextLine();
              series[2] = rs.match(20, team1, team2);
              System.out.print("\n\t\t\t PRESS ENTER !!! ");
              wait = s.nextLine();
              series[3] = rs.match(20, team1, team2);
              System.out.print("\n\t\t\t PRESS ENTER !!! ");
              wait = s.nextLine();
              series[4] = rs.match(20, team1, team2);
              System.out.print("\n\t\t\t PRESS ENTER !!! ");
              wait = s.nextLine();
              series[5] = rs.match(20, team1, team2);
              System.out.print("\n\t\t\t PRESS ENTER !!! ");
              wait = s.nextLine();
              series[6] = rs.match(20, team1, team2);
              System.out.print("\n\t\t\t PRESS ENTER !!! ");
              wait = s.nextLine();
              System.out.print("\t\t");
              for (i = 0; i < 7; i++) {
                if (series[i] == 20) {
                  System.out.print("  WON  ");
                  a++;
                } else {
                  System.out.print("  LOSE  ");
                  b++;
                }
              }
              break;
            default:
              series[0] = rs.match(20, team1, team2);
              if (series[0] == 20) {
                System.out.print("  WON  ");
                a = 1;
                break;
              }
              System.out.print("  LOSE  ");
              b = 1;
              break;
          }
          System.out.println("\n\n\t\t\t Series Status : " + a + "/" + b);
          if (a > b) {
            System.out.println("\n\n\t\t\t CONGRATULATIONS !!!\n\t\t  YOU( " + team1 + ") WON THE \" ONE DAY SERIES \"....\n\n");
            break;
          }
          System.out.println("\n\n\t\t\t SORRY !!!\n\t\t  YOU( " + team1 + ") LOSE THE \" ONE DAY SERIES \"....\n\n");
          break;
        case 2:
          System.out.println("1)1 \t 2)3 \t 3)5 \t 4)7");
          System.out.println("Select Number of Matches :");
          nm1 = s.nextInt();
          str1 = c2.selectTeam();
          teams = str1.split("\\.");
          team01 = teams[0];
          team02 = teams[1];
          switch (nm1) {
            case 1:
              series[0] = rs.match(10, team01, team02);
              wait = s.nextLine();
              System.out.print("\t\t");
              if (series[0] == 20) {
                System.out.print("  WON  ");
                a1 = 1;
                break;
              }
              System.out.print("  LOSE  ");
              b1 = 1;
              break;
            case 2:
              series[0] = rs.match(10, team01, team02);
              System.out.print("\n\t\t\t PRESS ENTER !!! ");
              wait = s.nextLine();
              series[1] = rs.match(10, team01, team02);
              System.out.print("\n\t\t\t PRESS ENTER !!! ");
              wait = s.nextLine();
              series[2] = rs.match(10, team01, team02);
              System.out.print("\n\t\t\t PRESS ENTER !!! ");
              wait = s.nextLine();
              System.out.print("\t\t");
              for (j = 0; j < 3; j++) {
                if (series[j] == 20) {
                  System.out.print("  WON  ");
                  a1++;
                } else {
                  System.out.print("  LOSE  ");
                  b1++;
                }
              }
              break;
            case 3:
              series[0] = rs.match(10, team01, team02);
              System.out.print("\n\t\t\t PRESS ENTER !!! ");
              wait = s.nextLine();
              series[1] = rs.match(10, team01, team02);
              System.out.print("\n\t\t\t PRESS ENTER !!! ");
              wait = s.nextLine();
              series[2] = rs.match(10, team01, team02);
              System.out.print("\n\t\t\t PRESS ENTER !!! ");
              wait = s.nextLine();
              series[3] = rs.match(10, team01, team02);
              System.out.print("\n\t\t\t PRESS ENTER !!! ");
              wait = s.nextLine();
              series[4] = rs.match(10, team01, team02);
              System.out.print("\n\t\t\t PRESS ENTER !!! ");
              wait = s.nextLine();
              System.out.print("\t\t");
              for (j = 0; j < 5; j++) {
                if (series[j] == 20) {
                  System.out.print("  WON  ");
                  a1++;
                } else {
                  System.out.print("  LOSE  ");
                  b1++;
                }
              }
              break;
            case 4:
              series[0] = rs.match(10, team01, team02);
              System.out.print("\n\t\t\t PRESS ENTER !!! ");
              wait = s.nextLine();
              series[1] = rs.match(10, team01, team02);
              System.out.print("\n\t\t\t PRESS ENTER !!! ");
              wait = s.nextLine();
              series[2] = rs.match(10, team01, team02);
              System.out.print("\n\t\t\t PRESS ENTER !!! ");
              wait = s.nextLine();
              series[3] = rs.match(10, team01, team02);
              System.out.print("\n\t\t\t PRESS ENTER !!! ");
              wait = s.nextLine();
              series[4] = rs.match(10, team01, team02);
              System.out.print("\n\t\t\t PRESS ENTER !!! ");
              wait = s.nextLine();
              series[5] = rs.match(10, team01, team02);
              System.out.print("\n\t\t\t PRESS ENTER !!! ");
              wait = s.nextLine();
              series[6] = rs.match(10, team01, team02);
              System.out.print("\n\t\t\t PRESS ENTER !!! ");
              wait = s.nextLine();
              System.out.print("\t\t");
              for (j = 0; j < 7; j++) {
                if (series[j] == 20) {
                  System.out.print("  WON  ");
                  a1++;
                } else {
                  System.out.print("  LOSE  ");
                  b1++;
                }
              }
              break;
            default:
              series[0] = rs.match(10, team01, team02);
              System.out.print("\t\t");
              if (series[0] == 20) {
                System.out.print("  WON  ");
                a1 = 1;
                break;
              }
              System.out.print("  LOSE  ");
              b1 = 1;
              break;
          }
          System.out.println("\n\n\t\t\t Series Status : " + a1 + "/" + b1);
          if (a1 > b1) {
            System.out.println("\n\n\t\t\t CONGRATULATIONS !!!\n\t\t  YOU( " + team01 + ") WON THE \" T20 SERIES \"....\n\n");
            break;
          }
          System.out.println("\n\n\t\t\t SORRY !!!\n\t\t  YOU( " + team01 + ") LOSE THE \" T20 SERIES \"....\n\n");
          break;
        case 3:
          c2.main1();
          break;
        case 4:
          System.out.println("\n\n\t\t\t *$$ THANKS FRIENDS $$* \n");
          break;
        default:
          System.out.print("\n\n\t\t\t INVALID CHOICE..\n");
          break;
      }
    } while (f != 4);
  }
}
