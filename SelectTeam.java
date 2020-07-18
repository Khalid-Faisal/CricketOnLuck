/*
author : Khalid Faisal
*/
import java.util.Random;
import java.util.Scanner;

class SelectTeam {
  Scanner s = new Scanner(System.in);

  boolean a = false, b = false, c = false, d = false, e = false, f = false, g = false, h = false, i = false, j = false, aw = false, bw = false, cw = false, dw = false, ew = false, fw = false, gw = false, hw = false, iw = false, jw = false;

  boolean ai = false, bi = false, ci = false, di = false, ei = false, fi = false, gi = false, hi = false, ii = false, ji = false, as = false, bs = false, cs = false, ds = false, es = false, fs = false, gs = false, hs = false, is = false, js = false;

  boolean ap = false, bp = false, cp = false, dp = false, ep = false, fp = false, gp = false, hp = false, ip = false, jp = false, ab = false, bb = false, cb = false, db = false, eb = false, fb = false, gb = false, hb = false, ib = false, jb = false;

  boolean aa = false, ba = false, ca = false, da = false, ea = false, fa = false, ga = false, ha = false, ia = false, ja = false, ae = false, be = false, ce = false, de = false, ee = false, fe = false, ge = false, he = false, ie = false, je = false;

  boolean an = false, bn = false, cn = false, dn = false, en = false, fn = false, gn = false, hn = false, in = false, jn = false;

  public int batting(String Teamn, int over, int sc) {
    System.out.println("--------------------------------------------------------------------------------");
    int w = 0, m = 0, p = 11, total = 0, k = 0, last = 0, run = 0;
    int[] irun = new int[10];
    String[] pname = new String[10];
    Random r = new Random();
    int i;
    for (i = 1; i <= over && w < 10 && total <= sc; i++) {
      System.out.print("\nOver " + i + " : \t\t");
      for (int j = 0; j < 5 && w < 10 && total <= sc; j++) {
        run = r.nextInt(6);
        if (run == 5) {
          System.out.print(" W ");
          p = w;
          w++;
          pname[m] = playern(Teamn);
          m++;
        } else {
          System.out.print(" " + run + " ");
          if (p == 0 || p != w)
            irun[m] = irun[m] + run;
        }
        if (run != 5)
          total += run;
      }
      System.out.print("\t\t" + Teamn + "'s Score :" + total + "/" + w);
    }
    System.out.println("\n\n" + Teamn + "'s Total Score :" + total + "/" + w + "\n");
    for (i = 0; i < w; i++) {
      System.out.println("Wicket no " + (i + 1) + " : \t" + pname[i] + "\t" + irun[i]);
      last = i;
    }
    if (run != 5) {
      pname[m] = playern(Teamn);
      if (w != 0) {
        System.out.println("Wicket no " + (last + 2) + " : \t" + pname[last + 1] + "*\t" + irun[last + 1]);
      } else {
        System.out.println("\nWicket no " + (last + 1) + " : \t" + pname[last] + "*\t" + irun[last]);
      }
    }
    return total;
  }

  public String select(String tname, String t1name) {
    Random r = new Random();
    System.out.println("\n--------------------------------------------------------------------------------");
    System.out.print("\n\t\t Choose ?(H/T) :");
    int re = r.nextInt(20);
    String name = "", name2 = "";
    if (re > 8) {
      System.out.print("\n\t\t **************\n");
      System.out.print("\t\t  **TOSS WON **\n");
      System.out.print("\t\t **************\n");
      System.out.print("\n\t\t *OPTIONS \t 1.Bat \t 2.Ball \n\t\t\t\t  CHOOSE ONE :  ");
      int ch = this.s.nextInt();
      if (ch == 1) {
        System.out.println("\t\t You (" + tname + ") Choose BAT First  !! \n");
        name = tname + "," + t1name + ",w";
      } else {
        System.out.println("\t\t You (" + tname + ") Choose BALL First  !! \n");
        name = t1name + "," + tname + ",l";
      }
      return name;
    }
    System.out.print("\n\t\t **************\n");
    System.out.print("\t\t **TOSS LOSS **\n");
    System.out.print("\t\t **************\n");
    Random choose = new Random();
    int opp_ch = choose.nextInt(1);
    if (opp_ch == 0) {
      System.out.println("\n\t\tOpponent(" + t1name + ") Choose BAT First  !! \n");
      name2 = t1name + "," + tname + ",l";
    } else {
      System.out.println("\n\t\tOpponent (" + t1name + ") Choose BALL First  !! \n");
      name2 = tname + "," + t1name + ",w";
    }
    return name2;
  }

  public String playern(String teamn) {
    Random rand = new Random();
    if (teamn.equals("IND")) {
      int pi = rand.nextInt(7);
      switch (pi + 1) {
        case 1:
          if (!this.ai) {
            this.ai = true;
            return "R Sharma ";
          }
        case 2:
          if (!this.bi) {
            this.bi = true;
            return "S Dhawan ";
          }
        case 3:
          if (!this.ci) {
            this.ci = true;
            return "S Raina  ";
          }
        case 4:
          if (!this.di) {
            this.di = true;
            return "Y Singh  ";
          }
        case 5:
          if (!this.ei) {
            this.ei = true;
            return "M S Dhoni";
          }
        case 6:
          if (!this.fi) {
            this.fi = true;
            return "H Pandya ";
          }
        case 7:
          if (!this.gi) {
            this.gi = true;
            return "R Jadeja ";
          }
        case 8:
          if (!this.hi) {
            this.hi = true;
            return "Z Khan   ";
          }
        case 9:
          if (!this.ii) {
            this.ii = true;
            return "M Shami  ";
          }
        case 10:
          if (!this.ji) {
            this.ji = true;
            return "U Yadav  ";
          }
          break;
      }
    } else if (teamn.equals("PAK")) {
      int pp = rand.nextInt(7);
      switch (pp + 1) {
        case 1:
          if (!this.ap) {
            this.ap = true;
            return "S Khan   ";
          }
        case 2:
          if (!this.bp) {
            this.bp = true;
            return "S Malik  ";
          }
        case 3:
          if (!this.cp) {
            this.cp = true;
            return "B Azem   ";
          }
        case 4:
          if (!this.dp) {
            this.dp = true;
            return "S Ahmed  ";
          }
        case 5:
          if (!this.ep) {
            this.ep = true;
            return "A Ale    ";
          }
        case 6:
          if (!this.fp) {
            this.fp = true;
            return "U Akmal  ";
          }
        case 7:
          if (!this.gp) {
            this.gp = true;
            return "W Riyaz  ";
          }
        case 8:
          if (!this.hp) {
            this.hp = true;
            return "Y Shah   ";
          }
        case 9:
          if (!this.ip) {
            this.ip = true;
            return "S Khan   ";
          }
        case 10:
          if (!this.jp) {
            this.jp = true;
            return "M Amir   ";
          }
          break;
      }
    } else if (teamn.equals("AUS")) {
      int pa = rand.nextInt(7);
      switch (pa + 1) {
        case 1:
          if (!this.aa) {
            this.aa = true;
            return "D Warnar  ";
          }
        case 2:
          if (!this.ba) {
            this.ba = true;
            return "A Finch   ";
          }
        case 3:
          if (!this.ca) {
            this.ca = true;
            return "C Lyen    ";
          }
        case 4:
          if (!this.da) {
            this.da = true;
            return "S Smith   ";
          }
        case 5:
          if (!this.ea) {
            this.ea = true;
            return "T Head    ";
          }
        case 6:
          if (!this.fa) {
            this.fa = true;
            return "G Maxwell ";
          }
        case 7:
          if (!this.ga) {
            this.ga = true;
            return "M Wade    ";
          }
        case 8:
          if (!this.ha) {
            this.ha = true;
            return "J Faulknar";
          }
        case 9:
          if (!this.ia) {
            this.ia = true;
            return "M Starc   ";
          }
        case 10:
          if (!this.ja) {
            this.ja = true;
            return "A Zampa   ";
          }
          break;
      }
    } else if (teamn.equals("NZL")) {
      int pn = rand.nextInt(7);
      switch (pn + 1) {
        case 1:
          if (!this.an) {
            this.an = true;
            return "M Guptil    ";
          }
        case 2:
          if (!this.bn) {
            this.bn = true;
            return "T Lathem    ";
          }
        case 3:
          if (!this.cn) {
            this.cn = true;
            return "K Williamson";
          }
        case 4:
          if (!this.dn) {
            this.dn = true;
            return "R Taylor    ";
          }
        case 5:
          if (!this.en) {
            this.en = true;
            return "C Anderson  ";
          }
        case 6:
          if (!this.fn) {
            this.fn = true;
            return "M Santinar  ";
          }
        case 7:
          if (!this.gn) {
            this.gn = true;
            return "BJ Wetling  ";
          }
        case 8:
          if (!this.hn) {
            this.hn = true;
            return "J Nesham    ";
          }
        case 9:
          if (!this.in) {
            this.in = true;
            return "T Boulte    ";
          }
        case 10:
          if (!this.jn) {
            this.jn = true;
            return "T Southi    ";
          }
          break;
      }
    } else if (teamn.equals("SA")) {
      int ps = rand.nextInt(7);
      switch (ps + 1) {
        case 1:
          if (!this.as) {
            this.as = true;
            return "H Amla     ";
          }
        case 2:
          if (!this.bs) {
            this.bs = true;
            return "Q Decock   ";
          }
        case 3:
          if (!this.cs) {
            this.cs = true;
            return "AB Devilars";
          }
        case 4:
          if (!this.ds) {
            this.ds = true;
            return "F Duplasis ";
          }
        case 5:
          if (!this.es) {
            this.es = true;
            return "JP Dumini  ";
          }
        case 6:
          if (!this.fs) {
            this.fs = true;
            return "D Millar   ";
          }
        case 7:
          if (!this.gs) {
            this.gs = true;
            return "K Rabada   ";
          }
        case 8:
          if (!this.hs) {
            this.hs = true;
            return "I Tahir    ";
          }
        case 9:
          if (!this.is) {
            this.is = true;
            return "D Styn     ";
          }
        case 10:
          if (!this.js) {
            this.js = true;
            return "M Morkel   ";
          }
          break;
      }
    } else if (teamn.equals("SL")) {
      int psl = rand.nextInt(7);
      switch (psl + 1) {
        case 1:
          if (!this.a) {
            this.a = true;
            return "D Desilva   ";
          }
        case 2:
          if (!this.b) {
            this.b = true;
            return "K Parera    ";
          }
        case 3:
          if (!this.c) {
            this.c = true;
            return "N Dickwala  ";
          }
        case 4:
          if (!this.d) {
            this.d = true;
            return "K Mandis    ";
          }
        case 5:
          if (!this.e) {
            this.e = true;
            return "T Parera    ";
          }
        case 6:
          if (!this.f) {
            this.f = true;
            return "A Methews   ";
          }
        case 7:
          if (!this.g) {
            this.g = true;
            return "D Chandimal ";
          }
        case 8:
          if (!this.h) {
            this.h = true;
            return "S Pathierena";
          }
        case 9:
          if (!this.i) {
            this.i = true;
            return "N Kulasekera";
          }
        case 10:
          if (!this.j) {
            this.j = true;
            return "S Lakmal    ";
          }
          break;
      }
    } else if (teamn.equals("BAN")) {
      int pb = rand.nextInt(7);
      switch (pb + 1) {
        case 1:
          if (!this.ab) {
            this.ab = true;
            return "T Iqbal        ";
          }
        case 2:
          if (!this.bb) {
            this.bb = true;
            return "I Kayas        ";
          }
        case 3:
          if (!this.cb) {
            this.cb = true;
            return "S Rahman       ";
          }
        case 4:
          if (!this.db) {
            this.db = true;
            return "M Rahim        ";
          }
        case 5:
          if (!this.eb) {
            this.eb = true;
            return "M Muhammadullah";
          }
        case 6:
          if (!this.fb) {
            this.fb = true;
            return "S Al-Hasan     ";
          }
        case 7:
          if (!this.gb) {
            this.gb = true;
            return "S Sarkar       ";
          }
        case 8:
          if (!this.hb) {
            this.hb = true;
            return "M Murtaza      ";
          }
        case 9:
          if (!this.ib) {
            this.ib = true;
            return "M Husain       ";
          }
        case 10:
          if (!this.jb) {
            this.jb = true;
            return "T Ahmad        ";
          }
          break;
      }
    } else if (teamn.equals("ENG")) {
      int pe = rand.nextInt(7);
      switch (pe + 1) {
        case 1:
          if (!this.ae) {
            this.ae = true;
            return "J Root     ";
          }
        case 2:
          if (!this.be) {
            this.be = true;
            return "A Hales    ";
          }
        case 3:
          if (!this.ce) {
            this.ce = true;
            return "J Roy      ";
          }
        case 4:
          if (!this.de) {
            this.de = true;
            return "E Morgan   ";
          }
        case 5:
          if (!this.ee) {
            this.ee = true;
            return "M Ali      ";
          }
        case 6:
          if (!this.fe) {
            this.fe = true;
            return "B Stokes   ";
          }
        case 7:
          if (!this.ge) {
            this.ge = true;
            return "J Buttler  ";
          }
        case 8:
          if (!this.he) {
            this.he = true;
            return "C Woaks    ";
          }
        case 9:
          if (!this.ie) {
            this.ie = true;
            return "A Rashid   ";
          }
        case 10:
          if (!this.je) {
            this.je = true;
            return "J Anderson ";
          }
          break;
      }
    } else if (teamn.equals("WI")) {
      int pw = rand.nextInt(7);
      switch (pw + 1) {
        case 1:
          if (!this.aw) {
            this.aw = true;
            return "K Brathweite";
          }
        case 2:
          if (!this.bw) {
            this.bw = true;
            return "E Lewis     ";
          }
        case 3:
          if (!this.cw) {
            this.cw = true;
            return "D Bravo     ";
          }
        case 4:
          if (!this.dw) {
            this.dw = true;
            return "M Sammuals  ";
          }
        case 5:
          if (!this.ew) {
            this.ew = true;
            return "K Polard    ";
          }
        case 6:
          if (!this.fw) {
            this.fw = true;
            return "D Ramdin    ";
          }
        case 7:
          if (!this.gw) {
            this.gw = true;
            return "S Gabrail   ";
          }
        case 8:
          if (!this.hw) {
            this.hw = true;
            return "J Holder    ";
          }
        case 9:
          if (!this.iw) {
            this.iw = true;
            return "S Narayan   ";
          }
        case 10:
          if (!this.jw) {
            this.jw = true;
            return "S Benn      ";
          }
          break;
      }
    }
    return "No Name  ";
  }

  public int superover(String teamn, int sc) {
    System.out.println("*---**---**---**----**-----**----**-----**-----**-----**-----**-----**-----**-----*");
    int w = 0, m = 0, p = 11, total = 0, k = 0, last = 0, run = 0;
    int[] irun = new int[3];
    String[] pname = new String[3];
    Random r = new Random();
    System.out.print("\nSuperOver : \t\t");
    for (int j = 0; j < 5 && w < 2 && total <= sc; j++) {
      run = r.nextInt(6);
      pname[m] = playern(teamn);
      if (run == 5) {
        System.out.print(" W ");
        p = w;
        w++;
        m++;
      } else {
        System.out.print(" " + run + " ");
        if (p != w)
          irun[m] = irun[m] + run;
      }
      if (run != 5)
        total += run;
    }
    System.out.println("\n\n\t" + teamn + "'s SuperOver's Score :" + total + "/" + w + "\n");
    for (int i = 0; i < w; i++) {
      System.out.println("Wicket no " + (i + 1) + " : \t" + pname[i] + "\t" + irun[i]);
      last = i;
    }
    if (run != 5) {
      pname[m] = playern(teamn);
      if (w != 0) {
        System.out.println("Wicket no " + (last + 2) + " : \t" + pname[last + 1] + "*\t" + irun[last + 1]);
      } else {
        System.out.println("\nWicket no " + (last + 1) + " : \t" + pname[last] + "*\t" + irun[last]);
      }
    }
    return total;
  }
}
