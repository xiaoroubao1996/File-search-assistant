import java.io.*;
import java.util.*;

class AnalyseSyntaxique {
    private static HashMap<String, String> Dictionnaire = new HashMap<>();
    private static HashMap<String, String> Lemme = new HashMap<>();
    private static Set<String> Stoplist = new HashSet<>();

    public static String Result;
    // longueur minimum d'un mot
    private static int seuilMin  = 3;
    // longueur maximum des lettres différentes
    private static int seuilMax = 5;
    // pourcentage de proximité minimum entre deux mots
    private static int proxMin = 75; // > 50
    // nombre de lettre à changer par Levenshtein
    private static int DistanceMax = 2;

    // Constructor
    public AnalyseSyntaxique(String Requete) {
        BufferedReader br;
        String chaine;
        try {
            // Lexiques
            br = new BufferedReader(new FileReader("/volsme/users/lo17a007/workspace/LO17-Tomcat/WEB-INF/src/lexique.txt"));
            while ((chaine = br.readLine()) != null) {
                String[] MotLemme = chaine.split(" ");
                Dictionnaire.put(MotLemme[0], MotLemme[1]);
            }
            br.close();
            // Stop lists
            br = new BufferedReader(new FileReader("/volsme/users/lo17a007/workspace/LO17-Tomcat/WEB-INF/src/stoplist.txt"));
            while ((chaine = br.readLine()) != null)
                Stoplist.add(chaine);
            br.close();
            // Lemmes
            br = new BufferedReader(new FileReader("/volsme/users/lo17a007/workspace/LO17-Tomcat/WEB-INF/src/filtronc.txt"));
            while ((chaine = br.readLine()) != null) {
                String[] MotLemme = chaine.split(" \t");
                Lemme.put(MotLemme[0], MotLemme[1]);
            }
            br.close();
        }
        catch(EOFException e) {
            System.out.println("EOF Exception");
        }
        catch(FileNotFoundException e) {
            System.out.println("Can't read files");
        }
        catch(IOException e) {
            System.out.println("IO Exception");
        }

        Result = "";
        StringTokenizer st = new StringTokenizer(Requete, " ", false);
        String currentMot, trouveDictMot;
        // Filtre 1
        ArrayList<String> prefixMots = new ArrayList<String>();
        ArrayList<String> levensMots = new ArrayList<String>();
        // Filtre 2
        ArrayList<String> lemmePrefix = new ArrayList<String>();
        ArrayList<String> lemmeLevens = new ArrayList<String>();

        while(st.hasMoreElements()) {
            currentMot = Minuscule(st.nextToken());
            trouveDictMot = Dictionnaire.get(currentMot);

            if (Stoplist.contains(currentMot)) continue;
            if(trouveDictMot != null) {
//                System.out.println("Dictionnaire de "+ currentMot + " : " + trouveDictMot);
                Result += trouveDictMot + " ";
            } else {
                prefixMots = Prefix(currentMot, Dictionnaire);
                if(!prefixMots.isEmpty()){
//                    affichier("Prefix", currentMot, prefixMots);
                    Result += prefixMots.get(0) + " ";
                //    Result += MeilleurLemme(prefixMots, currentMot) + " ";
                } else {
                    levensMots = Levenshtein(currentMot, Dictionnaire);
                    if(!levensMots.isEmpty()) {
//                        affichier("Levenshtein", currentMot, levensMots);
                        Result += levensMots.get(0) + " ";
//                        Result += MeilleurLemme(levensMots, currentMot) + " ";
                    } else {
                        lemmePrefix = Prefix(currentMot, Lemme);
                        if(!lemmePrefix.isEmpty()) {
                            Result += lemmePrefix.get(0) + " ";
//                            Result += MeilleurLemme(lemmePrefix, currentMot) + " ";
                        } else {
                            lemmeLevens = Levenshtein(currentMot, Lemme);
                            if(!lemmeLevens.isEmpty()) {
                                Result += lemmeLevens.get(0) + " ";
//                                Result += MeilleurLemme(lemmeLevens, currentMot) + " ";
                            } else Result += currentMot + " ";
                        }
                    }
                }
            }
        }
        Result = Result.trim();
        if (!Result.endsWith(".")) Result += ".";
    }

    public static String MeilleurLemme(ArrayList<String> List, String currMot) {
        String s;
        Scanner scanner = new Scanner(System.in);
        if (List.size() == 1) return List.get(0);
        for(int i = 0; i < List.size(); i++) {
            System.out.println(currMot + "->" + List.get(i) + "? (y/n)");
            s = scanner.nextLine();
            while(s.charAt(0) != 'y' && s.charAt(0) != 'n') {
                System.out.println("Juste y/n");
                s = scanner.nextLine();
            }
            if (s.charAt(0) == 'y') return List.get(i);
        }
        return currMot;
    }

    public static String Minuscule(String MotOrigin) {
        return MotOrigin.toLowerCase();
    }

    public static ArrayList<String> Prefix(String MotOrigin, HashMap<String, String> MonDictionnaire) {
        int MotOriginLength = MotOrigin.length();
        int prox = 0;
        int proxFinal = 0;
        ArrayList<String> MotFinal = new ArrayList<String>();
        String MotDic;
        if (MotOriginLength < seuilMin) { return MotFinal; }
        else {
            for (Map.Entry<String, String> entry : MonDictionnaire.entrySet()) {
                MotDic = entry.getKey();
                prox = Prox(MotOrigin,MotDic);
                if(prox > proxMin && prox >= proxFinal) {
                    if(prox > proxFinal){
                        proxFinal = prox;
                        MotFinal.clear();
                        MotFinal.add(entry.getValue());
                    } else {
                        MotFinal.add(entry.getValue());
                    }
                }
            }
        }
        return MotFinal;
    }

    private static int Prox(String MotOrigin,String MotDic) {
        int MotOriginLength = MotOrigin.length();
        int MotDicLength = MotDic.length();
        int i;
        if (MotDicLength < seuilMin || Math.abs(MotDicLength - MotOriginLength) > seuilMax)
            return 0;
        else {
            i = 0;
            while(i < Math.min(MotOriginLength, MotDicLength) && MotOrigin.charAt(i) == MotDic.charAt(i))
                i++;
            return (i * 100) / Math.max(MotOriginLength, MotDicLength);
        }
    }

    private static int Minimum (int x, int y, int z) {
        int min = x;
        if (y < min) { min = y; }
        if (z < min) { min = z; }
        return min;
    }

    private static int TestLevenshtein(String MotOrigin, String MotDic) {
        int d[][];
        int n = MotOrigin.length();
        int m = MotDic.length();
        int i, j;
        Character mot_org_i, mot_dic_j;
        int cost;
        if (n == 0) { return m; }
        if (m == 0) { return n; }
        d = new int[n+1][m+1];
        for (i = 0; i <= n; i++) d[i][0] = i;
        for (j = 0; j <= m; j++) d[0][j] = j;

        for (i = 1; i <= n; i++) {
            mot_org_i = MotOrigin.charAt(i - 1);
            for (j = 1; j <= m; j++) {
                mot_dic_j = MotDic.charAt(j - 1);
                if (mot_org_i == mot_dic_j) cost = 0;
                else cost = 1;
                d[i][j] = Minimum(d[i-1][j] + 1, d[i][j-1] + 1, d[i-1][j-1] + cost);
            }
        }
        return d[n][m];
    }

    public static ArrayList<String> Levenshtein(String MotOrigin, HashMap<String, String> MonDictionnaire) {
        int Distance,DistanceMin = 100;
        ArrayList<String> MotFinal = new ArrayList<String>();
        String MotDic;
        for (Map.Entry<String, String> entry : MonDictionnaire.entrySet()) {
            MotDic = entry.getKey();
            Distance = TestLevenshtein(MotOrigin,MotDic);
            if(Distance <= DistanceMax && Distance < DistanceMin) {
                DistanceMin = Distance;
                MotFinal.clear();
                MotFinal.add(entry.getValue());
            }else if(Distance == DistanceMin){
                MotFinal.add(entry.getValue());
            }
        }
        return MotFinal;
    }

    public static void affichier(String type, String CurrentMot, ArrayList<String> array){
        Iterator ite = array.iterator();
        while(ite.hasNext()) {
            System.out.println(type+ " de "+ CurrentMot + " : " + ite.next());
        }
    }
}