import java.io.*;
import java.util.*;

class TD5 {
	private static HashMap<String, String> Dic= new HashMap<>();
	private static int seuilMin  = 3;
	private static int seuilMax = 7;
	private static int proxMin = 40;
	public TD5() {
		BufferedReader br=null;
		String chaine;
		try {
			try {
				br = new BufferedReader(new FileReader("filtronc_v.txt"));
				while ((chaine=br.readLine())!=null) {
					//StringTokenizer st = new StringTokenizer("www.baidu.com", ".");
					chaine=chaine.replace(" ", "");
					String[] MotLemme = chaine.split("\t");
					//System.out.println(MotLemme[0] + "test" + MotLemme[1] + "test");
					Dic.put(MotLemme[0], MotLemme[1]);
				}
			}
			catch(EOFException e) {
				br.close();
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("fichier inconnu : filtronc_v.txt");
		}
		catch(IOException e) {
			System.out.println("IO Exception");
		}
	}
	public static void main(String[] args) {
		TD5 My_TD5 = new TD5();
		BufferedReader br=null;
		String chaine;
		try {
			try {
				br = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("saisie : ");
				chaine=br.readLine();
				StringTokenizer st = new StringTokenizer(chaine, " ", false);
				String CurrentMot;
				String LexiqueMot;
				String PrefixMot;
				while(st.hasMoreElements()) {
					CurrentMot = st.nextToken();
					CurrentMot = Minuscule(CurrentMot);
					//System.out.println(CurrentMot);
					LexiqueMot = Lexique(CurrentMot);
					System.out.println(LexiqueMot);
					if(LexiqueMot == null) {
						PrefixMot = Prefix(CurrentMot);
						System.out.println(PrefixMot);
						//
					}
				}
			}
			catch(EOFException e) {
				br.close();
			}
		}
		catch(IOException e) {
			System.out.println("IO Exception");
		}
		//String[] test = {"test.txt", "World"};
		//Cat(test);
	}
	public static String Minuscule(String MotOrigin) {
		return MotOrigin.toLowerCase();
	}
	public static String Lexique(String MotOrigin) {
		return Dic.get(MotOrigin);
	}

	public static String Prefix(String MotOrigin) {
		int MotOriginLength = MotOrigin.length();
		int prox = 0;
		int proxFinal = 0;
		String MotFinal = "";
		String MotDic;
		if (MotOriginLength < seuilMin) { return null; }
		else {
			for (Map.Entry<String, String> entry : Dic.entrySet()) {
				MotDic = entry.getKey();
				prox = Prox(MotOrigin,MotDic);
				if(prox > proxMin && prox > proxFinal) {
					proxFinal = prox;
					MotFinal = entry.getValue();
				}
			}
			if (proxFinal != 0) return MotFinal;
		}
		return null;
	}

	private static int Prox(String MotOrigin,String MotDic) {
		int i ;
		int MotOriginLength = MotOrigin.length();
		int MotDicLength = MotDic.length();
		if(MotDicLength < seuilMin || Math.abs(MotDicLength - MotOriginLength) > seuilMax) { return 0; }
		else {
			i = 0;
			//System.out.println("mot: "+MotDic);
			while( i < Math.min(MotOriginLength, MotDicLength) && MotOrigin.charAt(i) == MotDic.charAt(i) ) {
				i++;
			}
			//System.out.println("i: "+i);
			return i*100/Math.max(MotOriginLength, MotDicLength);
		}
	}

	private static int Minimum (int a, int b, int c) {
		int mi;
		mi = a;
		if (b < mi) { mi = b; }
		if (c < mi) { mi = c; }
		return mi;
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
		for (i = 0; i <= n; i++) {
			d[i][0] = i;
		}
		for (j = 0; j <= m; j++) {
			d[0][j] = j;
		}
		for (i = 1; i <= n; i++) {
			mot_org_i = MotOrigin.charAt(i - 1);
			for (j = 1; j <= m; j++) {
				mot_dic_j = MotDic.charAt(j - 1);
				if (mot_org_i == mot_dic_j) { cost = 0; }
				else { cost = 1; }
				d[i][j] = Minimum(d[i-1][j]+1, d[i][j-1]+1, d[i-1][j-1] + cost);
			}
		}
		return d[n][m];
	}

	private static void Noname() {
		int i;
	}
}