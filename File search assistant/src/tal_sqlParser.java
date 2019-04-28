// $ANTLR 3.x /home/donghao/LO17/TD7/tal_sql.g 2019-01-09 14:30:35

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ANNEE", "APRES", "ARTICLE", "AVANT", 
		"BULLETIN", "COMBIEN", "CONJ", "DATANT", "DATE", "ENTRE", "INT", "JOURMOI", 
		"JOURMOIANNEE", "MOI", "MOIANNEE", "PARLER", "POINT", "QUI", "RUBRIQUE", 
		"RUBRIQUES", "SELECT", "TITRE", "VAR", "WS"
	};
	public static final int EOF=-1;
	public static final int ANNEE=4;
	public static final int APRES=5;
	public static final int ARTICLE=6;
	public static final int AVANT=7;
	public static final int BULLETIN=8;
	public static final int COMBIEN=9;
	public static final int CONJ=10;
	public static final int DATANT=11;
	public static final int DATE=12;
	public static final int ENTRE=13;
	public static final int INT=14;
	public static final int JOURMOI=15;
	public static final int JOURMOIANNEE=16;
	public static final int MOI=17;
	public static final int MOIANNEE=18;
	public static final int PARLER=19;
	public static final int POINT=20;
	public static final int QUI=21;
	public static final int RUBRIQUE=22;
	public static final int RUBRIQUES=23;
	public static final int SELECT=24;
	public static final int TITRE=25;
	public static final int VAR=26;
	public static final int WS=27;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public tal_sqlParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public tal_sqlParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return tal_sqlParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/donghao/LO17/TD7/tal_sql.g"; }



	// $ANTLR start "listerequetes"
	// /home/donghao/LO17/TD7/tal_sql.g:115:1: listerequetes returns [String sql = \"\"] : r= requete POINT ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// /home/donghao/LO17/TD7/tal_sql.g:116:39: (r= requete POINT )
			// /home/donghao/LO17/TD7/tal_sql.g:117:17: r= requete POINT
			{
			pushFollow(FOLLOW_requete_in_listerequetes1737);
			r=requete();
			state._fsp--;

			match(input,POINT,FOLLOW_POINT_in_listerequetes1739); 

			                                lr_arbre = r;
			                                sql = lr_arbre.sortArbre();
			                        
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return sql;
	}
	// $ANTLR end "listerequetes"



	// $ANTLR start "requete"
	// /home/donghao/LO17/TD7/tal_sql.g:124:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( ( ( SELECT | COMBIEN ) ( ARTICLE | BULLETIN ) ( RUBRIQUE | BULLETIN | DATE )? ) | QUI ) (joinarbre= join ) ;
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		ParserRuleReturnScope joinarbre =null;

		Arbre join_arbre; String modele_avant = ""; String modele_apres= "";String modele_second_sujet= "titretexte";String sujet2= "";
		try {
			// /home/donghao/LO17/TD7/tal_sql.g:125:145: ( ( ( ( SELECT | COMBIEN ) ( ARTICLE | BULLETIN ) ( RUBRIQUE | BULLETIN | DATE )? ) | QUI ) (joinarbre= join ) )
			// /home/donghao/LO17/TD7/tal_sql.g:126:17: ( ( ( SELECT | COMBIEN ) ( ARTICLE | BULLETIN ) ( RUBRIQUE | BULLETIN | DATE )? ) | QUI ) (joinarbre= join )
			{
			// /home/donghao/LO17/TD7/tal_sql.g:126:17: ( ( ( SELECT | COMBIEN ) ( ARTICLE | BULLETIN ) ( RUBRIQUE | BULLETIN | DATE )? ) | QUI )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==COMBIEN||LA4_0==SELECT) ) {
				alt4=1;
			}
			else if ( (LA4_0==QUI) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// /home/donghao/LO17/TD7/tal_sql.g:126:18: ( ( SELECT | COMBIEN ) ( ARTICLE | BULLETIN ) ( RUBRIQUE | BULLETIN | DATE )? )
					{
					// /home/donghao/LO17/TD7/tal_sql.g:126:18: ( ( SELECT | COMBIEN ) ( ARTICLE | BULLETIN ) ( RUBRIQUE | BULLETIN | DATE )? )
					// /home/donghao/LO17/TD7/tal_sql.g:126:19: ( SELECT | COMBIEN ) ( ARTICLE | BULLETIN ) ( RUBRIQUE | BULLETIN | DATE )?
					{
					// /home/donghao/LO17/TD7/tal_sql.g:126:19: ( SELECT | COMBIEN )
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==SELECT) ) {
						alt1=1;
					}
					else if ( (LA1_0==COMBIEN) ) {
						alt1=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 1, 0, input);
						throw nvae;
					}

					switch (alt1) {
						case 1 :
							// /home/donghao/LO17/TD7/tal_sql.g:126:20: SELECT
							{
							match(input,SELECT,FOLLOW_SELECT_in_requete1810); 

							                                req_arbre.ajouteFils(new Arbre("select distinct"));
							                        
							}
							break;
						case 2 :
							// /home/donghao/LO17/TD7/tal_sql.g:130:18: COMBIEN
							{
							match(input,COMBIEN,FOLLOW_COMBIEN_in_requete1855); 

							                                req_arbre.ajouteFils(new Arbre("select"));
							                                modele_avant = "count[  distinct ";
							                                modele_apres = "] as Somme";
							                        
							}
							break;

					}

					// /home/donghao/LO17/TD7/tal_sql.g:135:17: ( ARTICLE | BULLETIN )
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==ARTICLE) ) {
						alt2=1;
					}
					else if ( (LA2_0==BULLETIN) ) {
						alt2=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						throw nvae;
					}

					switch (alt2) {
						case 1 :
							// /home/donghao/LO17/TD7/tal_sql.g:135:18: ARTICLE
							{
							match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1876); 

							                                req_arbre.ajouteFils(new Arbre(modele_avant));
							                                req_arbre.ajouteFils(new Arbre("but.fichier"));
							                                req_arbre.ajouteFils(new Arbre(modele_apres));
							                        
							}
							break;
						case 2 :
							// /home/donghao/LO17/TD7/tal_sql.g:141:20: BULLETIN
							{
							match(input,BULLETIN,FOLLOW_BULLETIN_in_requete1923); 

							                                req_arbre.ajouteFils(new Arbre(modele_avant));
							                                req_arbre.ajouteFils(new Arbre("but.numero"));
							                                req_arbre.ajouteFils(new Arbre(modele_apres));
							                        
							}
							break;

					}

					// /home/donghao/LO17/TD7/tal_sql.g:148:18: ( RUBRIQUE | BULLETIN | DATE )?
					int alt3=4;
					switch ( input.LA(1) ) {
						case RUBRIQUE:
							{
							int LA3_1 = input.LA(2);
							if ( ((LA3_1 >= ANNEE && LA3_1 <= APRES)||(LA3_1 >= AVANT && LA3_1 <= BULLETIN)||(LA3_1 >= CONJ && LA3_1 <= DATANT)||LA3_1==ENTRE||(LA3_1 >= JOURMOI && LA3_1 <= JOURMOIANNEE)||(LA3_1 >= MOIANNEE && LA3_1 <= PARLER)||LA3_1==RUBRIQUE||(LA3_1 >= TITRE && LA3_1 <= VAR)) ) {
								alt3=1;
							}
							}
							break;
						case BULLETIN:
							{
							int LA3_2 = input.LA(2);
							if ( ((LA3_2 >= ANNEE && LA3_2 <= APRES)||(LA3_2 >= AVANT && LA3_2 <= BULLETIN)||(LA3_2 >= CONJ && LA3_2 <= DATANT)||LA3_2==ENTRE||(LA3_2 >= JOURMOI && LA3_2 <= JOURMOIANNEE)||(LA3_2 >= MOIANNEE && LA3_2 <= PARLER)||LA3_2==RUBRIQUE||(LA3_2 >= TITRE && LA3_2 <= VAR)) ) {
								alt3=2;
							}
							}
							break;
						case DATE:
							{
							alt3=3;
							}
							break;
					}
					switch (alt3) {
						case 1 :
							// /home/donghao/LO17/TD7/tal_sql.g:149:5: RUBRIQUE
							{
							match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete1993); 

							             modele_second_sujet="rubrique";
							             req_arbre.ajouteFils(new Arbre(",but.rubrique"));
							    
							}
							break;
						case 2 :
							// /home/donghao/LO17/TD7/tal_sql.g:154:6: BULLETIN
							{
							match(input,BULLETIN,FOLLOW_BULLETIN_in_requete2006); 

							             modele_second_sujet="titretexte";
							             req_arbre.ajouteFils(new Arbre(",but.numero"));
							    
							}
							break;
						case 3 :
							// /home/donghao/LO17/TD7/tal_sql.g:159:6: DATE
							{
							match(input,DATE,FOLLOW_DATE_in_requete2019); 

							             modele_second_sujet="date";
							             req_arbre.ajouteFils(new Arbre(",but.annee,but.mois,but.jour"));
							    
							}
							break;

					}

					}

					}
					break;
				case 2 :
					// /home/donghao/LO17/TD7/tal_sql.g:167:19: QUI
					{
					match(input,QUI,FOLLOW_QUI_in_requete2110); 

					                                 req_arbre.ajouteFils(new Arbre("select distinct but.email, but.fichier"));
					                                 modele_second_sujet="email";
					                        
					}
					break;

			}

			// /home/donghao/LO17/TD7/tal_sql.g:173:17: (joinarbre= join )
			// /home/donghao/LO17/TD7/tal_sql.g:173:18: joinarbre= join
			{
			pushFollow(FOLLOW_join_in_requete2896);
			joinarbre=join();
			state._fsp--;


			                                req_arbre.ajouteFils(new Arbre("FROM "+modele_second_sujet+" as but JOIN"));
			                                join_arbre = (joinarbre!=null?((tal_sqlParser.join_return)joinarbre).lepar_arbre:null);
			                                if((joinarbre!=null?((tal_sqlParser.join_return)joinarbre).condition:null) == ""){req_arbre.ajouteFils(new Arbre("["));}
			                                req_arbre.ajouteFils(join_arbre);
			                                if((joinarbre!=null?((tal_sqlParser.join_return)joinarbre).condition:null) == ""){req_arbre.ajouteFils(new Arbre("]"));}
			                                req_arbre.ajouteFils(new Arbre(" ON but.fichier = "+(joinarbre!=null?((tal_sqlParser.join_return)joinarbre).type:null)+".fichier"));
			                                req_arbre.ajouteFils(new Arbre("AND but.numero=", (joinarbre!=null?((tal_sqlParser.join_return)joinarbre).type:null)+".numero "));
			                                 if((joinarbre!=null?((tal_sqlParser.join_return)joinarbre).condition:null) != ""){req_arbre.ajouteFils(new Arbre("AND "+(joinarbre!=null?((tal_sqlParser.join_return)joinarbre).condition:null)));}
			                        
			}


			                                req_arbre.ajouteFils(new Arbre(";"));
			                        
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return req_arbre;
	}
	// $ANTLR end "requete"


	public static class join_return extends ParserRuleReturnScope {
		public Arbre lepar_arbre = new Arbre("");
		public String type;
		public String condition = "";
	};


	// $ANTLR start "join"
	// /home/donghao/LO17/TD7/tal_sql.g:190:1: join returns [Arbre lepar_arbre = new Arbre(\"\"), String type, String condition = \"\"] : (dateArbre= joindate |rubriqueArbre= joinrubrique |bulletinArbre= joinbulletin |motArbre= joinmot );
	public final tal_sqlParser.join_return join() throws RecognitionException {
		tal_sqlParser.join_return retval = new tal_sqlParser.join_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope dateArbre =null;
		ParserRuleReturnScope rubriqueArbre =null;
		ParserRuleReturnScope bulletinArbre =null;
		ParserRuleReturnScope motArbre =null;

		Arbre arbre;
		try {
			// /home/donghao/LO17/TD7/tal_sql.g:191:37: (dateArbre= joindate |rubriqueArbre= joinrubrique |bulletinArbre= joinbulletin |motArbre= joinmot )
			int alt5=4;
			switch ( input.LA(1) ) {
			case PARLER:
				{
				int LA5_1 = input.LA(2);
				if ( (LA5_1==ANNEE||(LA5_1 >= JOURMOI && LA5_1 <= JOURMOIANNEE)||LA5_1==MOIANNEE) ) {
					alt5=1;
				}
				else if ( (LA5_1==VAR) ) {
					alt5=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ANNEE:
			case APRES:
			case AVANT:
			case DATANT:
			case ENTRE:
			case JOURMOI:
			case JOURMOIANNEE:
			case MOIANNEE:
				{
				alt5=1;
				}
				break;
			case RUBRIQUE:
				{
				alt5=2;
				}
				break;
			case BULLETIN:
				{
				alt5=3;
				}
				break;
			case CONJ:
			case TITRE:
			case VAR:
				{
				alt5=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// /home/donghao/LO17/TD7/tal_sql.g:192:9: dateArbre= joindate
					{
					pushFollow(FOLLOW_joindate_in_join2995);
					dateArbre=joindate();
					state._fsp--;


					                        retval.condition = (dateArbre!=null?((tal_sqlParser.joindate_return)dateArbre).condition:null);
					                        retval.type = (dateArbre!=null?((tal_sqlParser.joindate_return)dateArbre).type:null);
					                        arbre = (dateArbre!=null?((tal_sqlParser.joindate_return)dateArbre).lepar_arbre:null);
					                        retval.lepar_arbre.ajouteFils(arbre);
					                
					}
					break;
				case 2 :
					// /home/donghao/LO17/TD7/tal_sql.g:200:9: rubriqueArbre= joinrubrique
					{
					pushFollow(FOLLOW_joinrubrique_in_join3037);
					rubriqueArbre=joinrubrique();
					state._fsp--;


					                        retval.condition = (rubriqueArbre!=null?((tal_sqlParser.joinrubrique_return)rubriqueArbre).condition:null);
					                        retval.type = (rubriqueArbre!=null?((tal_sqlParser.joinrubrique_return)rubriqueArbre).type:null);
					                        arbre = (rubriqueArbre!=null?((tal_sqlParser.joinrubrique_return)rubriqueArbre).lepar_arbre:null);
					                        retval.lepar_arbre.ajouteFils(arbre);
					                
					}
					break;
				case 3 :
					// /home/donghao/LO17/TD7/tal_sql.g:208:9: bulletinArbre= joinbulletin
					{
					pushFollow(FOLLOW_joinbulletin_in_join3079);
					bulletinArbre=joinbulletin();
					state._fsp--;


					                        retval.condition = (bulletinArbre!=null?((tal_sqlParser.joinbulletin_return)bulletinArbre).condition:null);
					                        retval.type = (bulletinArbre!=null?((tal_sqlParser.joinbulletin_return)bulletinArbre).type:null);
					                        arbre = (bulletinArbre!=null?((tal_sqlParser.joinbulletin_return)bulletinArbre).lepar_arbre:null);
					                        retval.lepar_arbre.ajouteFils(arbre);
					                
					}
					break;
				case 4 :
					// /home/donghao/LO17/TD7/tal_sql.g:216:10: motArbre= joinmot
					{
					pushFollow(FOLLOW_joinmot_in_join3123);
					motArbre=joinmot();
					state._fsp--;


					                        retval.condition = (motArbre!=null?((tal_sqlParser.joinmot_return)motArbre).condition:null);
					                        retval.type = (motArbre!=null?((tal_sqlParser.joinmot_return)motArbre).type:null);
					                        arbre = (motArbre!=null?((tal_sqlParser.joinmot_return)motArbre).lepar_arbre:null);
					                        retval.lepar_arbre.ajouteFils(arbre);
					                
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "join"


	public static class joindate_return extends ParserRuleReturnScope {
		public Arbre lepar_arbre = new Arbre("");
		public String type;
		public String condition = "";
	};


	// $ANTLR start "joindate"
	// /home/donghao/LO17/TD7/tal_sql.g:225:1: joindate returns [Arbre lepar_arbre = new Arbre(\"\"), String type, String condition = \"\"] : ( ( PARLER | DATANT )? (annee= ANNEE |date= MOIANNEE |date= JOURMOIANNEE |date= JOURMOI ) | ( ENTRE ) | (avantapres= AVANT (annee= ANNEE |moi= MOI ) |avantapres= APRES (annee= ANNEE |moi= MOI ) ) ) (joinarbre= join )? ;
	public final tal_sqlParser.joindate_return joindate() throws RecognitionException {
		tal_sqlParser.joindate_return retval = new tal_sqlParser.joindate_return();
		retval.start = input.LT(1);

		Token annee=null;
		Token date=null;
		Token avantapres=null;
		Token moi=null;
		ParserRuleReturnScope joinarbre =null;

		Arbre join_arbre = new Arbre(""); String[] dateTable; Boolean fin = true; String dateCondition = "";
		try {
			// /home/donghao/LO17/TD7/tal_sql.g:226:117: ( ( ( PARLER | DATANT )? (annee= ANNEE |date= MOIANNEE |date= JOURMOIANNEE |date= JOURMOI ) | ( ENTRE ) | (avantapres= AVANT (annee= ANNEE |moi= MOI ) |avantapres= APRES (annee= ANNEE |moi= MOI ) ) ) (joinarbre= join )? )
			// /home/donghao/LO17/TD7/tal_sql.g:227:9: ( ( PARLER | DATANT )? (annee= ANNEE |date= MOIANNEE |date= JOURMOIANNEE |date= JOURMOI ) | ( ENTRE ) | (avantapres= AVANT (annee= ANNEE |moi= MOI ) |avantapres= APRES (annee= ANNEE |moi= MOI ) ) ) (joinarbre= join )?
			{
			// /home/donghao/LO17/TD7/tal_sql.g:227:9: ( ( PARLER | DATANT )? (annee= ANNEE |date= MOIANNEE |date= JOURMOIANNEE |date= JOURMOI ) | ( ENTRE ) | (avantapres= AVANT (annee= ANNEE |moi= MOI ) |avantapres= APRES (annee= ANNEE |moi= MOI ) ) )
			int alt11=3;
			switch ( input.LA(1) ) {
			case ANNEE:
			case DATANT:
			case JOURMOI:
			case JOURMOIANNEE:
			case MOIANNEE:
			case PARLER:
				{
				alt11=1;
				}
				break;
			case ENTRE:
				{
				alt11=2;
				}
				break;
			case APRES:
			case AVANT:
				{
				alt11=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// /home/donghao/LO17/TD7/tal_sql.g:227:10: ( PARLER | DATANT )? (annee= ANNEE |date= MOIANNEE |date= JOURMOIANNEE |date= JOURMOI )
					{
					// /home/donghao/LO17/TD7/tal_sql.g:227:10: ( PARLER | DATANT )?
					int alt6=3;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==PARLER) ) {
						alt6=1;
					}
					else if ( (LA6_0==DATANT) ) {
						alt6=2;
					}
					switch (alt6) {
						case 1 :
							// /home/donghao/LO17/TD7/tal_sql.g:228:9: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_joindate3185); 

							}
							break;
						case 2 :
							// /home/donghao/LO17/TD7/tal_sql.g:230:9: DATANT
							{
							match(input,DATANT,FOLLOW_DATANT_in_joindate3206); 
							}
							break;

					}

					// /home/donghao/LO17/TD7/tal_sql.g:232:9: (annee= ANNEE |date= MOIANNEE |date= JOURMOIANNEE |date= JOURMOI )
					int alt7=4;
					switch ( input.LA(1) ) {
					case ANNEE:
						{
						alt7=1;
						}
						break;
					case MOIANNEE:
						{
						alt7=2;
						}
						break;
					case JOURMOIANNEE:
						{
						alt7=3;
						}
						break;
					case JOURMOI:
						{
						alt7=4;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 7, 0, input);
						throw nvae;
					}
					switch (alt7) {
						case 1 :
							// /home/donghao/LO17/TD7/tal_sql.g:232:10: annee= ANNEE
							{
							annee=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_joindate3232); 

							                         dateCondition = "date.annee='"+annee.getText()+"' ";
							                
							}
							break;
						case 2 :
							// /home/donghao/LO17/TD7/tal_sql.g:236:16: date= MOIANNEE
							{
							date=(Token)match(input,MOIANNEE,FOLLOW_MOIANNEE_in_joindate3272); 

							                        dateTable = date.getText().split(" ");
							                        dateCondition = "date.moi='"+dateTable[0]+"' AND date.annee='"+dateTable[1]+"'";
							                
							}
							break;
						case 3 :
							// /home/donghao/LO17/TD7/tal_sql.g:241:16: date= JOURMOIANNEE
							{
							date=(Token)match(input,JOURMOIANNEE,FOLLOW_JOURMOIANNEE_in_joindate3312); 

							                        dateTable = date.getText().split(" ");
							                        dateCondition = "date.jour='"+dateTable[0]+" date.moi='"+dateTable[1]+"' AND date.annee='"+dateTable[2]+"'";
							                
							}
							break;
						case 4 :
							// /home/donghao/LO17/TD7/tal_sql.g:246:16: date= JOURMOI
							{
							date=(Token)match(input,JOURMOI,FOLLOW_JOURMOI_in_joindate3352); 

							                        dateTable = date.getText().split(" ");
							                        dateCondition = "date.jour='"+dateTable[0]+" date.moi='"+dateTable[1];
							                
							}
							break;

					}

					}
					break;
				case 2 :
					// /home/donghao/LO17/TD7/tal_sql.g:252:9: ( ENTRE )
					{
					// /home/donghao/LO17/TD7/tal_sql.g:252:9: ( ENTRE )
					// /home/donghao/LO17/TD7/tal_sql.g:252:10: ENTRE
					{
					match(input,ENTRE,FOLLOW_ENTRE_in_joindate3392); 

					                          	dateTable = date.getText().split(" ");
					                                 dateCondition = "date.annee>'"+dateTable[0]+"' AND date.annee< '"+dateTable[2]+"'";
					                        
					}

					}
					break;
				case 3 :
					// /home/donghao/LO17/TD7/tal_sql.g:258:17: (avantapres= AVANT (annee= ANNEE |moi= MOI ) |avantapres= APRES (annee= ANNEE |moi= MOI ) )
					{
					// /home/donghao/LO17/TD7/tal_sql.g:258:17: (avantapres= AVANT (annee= ANNEE |moi= MOI ) |avantapres= APRES (annee= ANNEE |moi= MOI ) )
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==AVANT) ) {
						alt10=1;
					}
					else if ( (LA10_0==APRES) ) {
						alt10=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 10, 0, input);
						throw nvae;
					}

					switch (alt10) {
						case 1 :
							// /home/donghao/LO17/TD7/tal_sql.g:258:18: avantapres= AVANT (annee= ANNEE |moi= MOI )
							{
							avantapres=(Token)match(input,AVANT,FOLLOW_AVANT_in_joindate3450); 
							// /home/donghao/LO17/TD7/tal_sql.g:259:33: (annee= ANNEE |moi= MOI )
							int alt8=2;
							int LA8_0 = input.LA(1);
							if ( (LA8_0==ANNEE) ) {
								alt8=1;
							}
							else if ( (LA8_0==MOI) ) {
								alt8=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 8, 0, input);
								throw nvae;
							}

							switch (alt8) {
								case 1 :
									// /home/donghao/LO17/TD7/tal_sql.g:259:34: annee= ANNEE
									{
									annee=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_joindate3489); 

									                    	dateCondition = "date.annee < '"+annee.getText()+"'";
									                    
									}
									break;
								case 2 :
									// /home/donghao/LO17/TD7/tal_sql.g:264:17: moi= MOI
									{
									moi=(Token)match(input,MOI,FOLLOW_MOI_in_joindate3551); 

									                    dateCondition = "datemoi < '"+annee.getText()+"'";
									                    
									}
									break;

							}

							}
							break;
						case 2 :
							// /home/donghao/LO17/TD7/tal_sql.g:270:17: avantapres= APRES (annee= ANNEE |moi= MOI )
							{
							avantapres=(Token)match(input,APRES,FOLLOW_APRES_in_joindate3645); 
							// /home/donghao/LO17/TD7/tal_sql.g:271:33: (annee= ANNEE |moi= MOI )
							int alt9=2;
							int LA9_0 = input.LA(1);
							if ( (LA9_0==ANNEE) ) {
								alt9=1;
							}
							else if ( (LA9_0==MOI) ) {
								alt9=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 9, 0, input);
								throw nvae;
							}

							switch (alt9) {
								case 1 :
									// /home/donghao/LO17/TD7/tal_sql.g:271:34: annee= ANNEE
									{
									annee=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_joindate3684); 

									                    	dateCondition = "date.annee > '"+annee.getText()+"'";
									                    
									}
									break;
								case 2 :
									// /home/donghao/LO17/TD7/tal_sql.g:276:17: moi= MOI
									{
									moi=(Token)match(input,MOI,FOLLOW_MOI_in_joindate3746); 

									                   	dateCondition = "date.annee < '"+annee.getText()+"'";
									                    
									}
									break;

							}

							}
							break;

					}

					}
					break;

			}

			// /home/donghao/LO17/TD7/tal_sql.g:283:9: (joinarbre= join )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( ((LA12_0 >= ANNEE && LA12_0 <= APRES)||(LA12_0 >= AVANT && LA12_0 <= BULLETIN)||(LA12_0 >= CONJ && LA12_0 <= DATANT)||LA12_0==ENTRE||(LA12_0 >= JOURMOI && LA12_0 <= JOURMOIANNEE)||(LA12_0 >= MOIANNEE && LA12_0 <= PARLER)||LA12_0==RUBRIQUE||(LA12_0 >= TITRE && LA12_0 <= VAR)) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// /home/donghao/LO17/TD7/tal_sql.g:283:10: joinarbre= join
					{
					pushFollow(FOLLOW_join_in_joindate3846);
					joinarbre=join();
					state._fsp--;


					                        fin = false;
					                        join_arbre = (joinarbre!=null?((tal_sqlParser.join_return)joinarbre).lepar_arbre:null);
					                
					}
					break;

			}


			                        retval.type = "date";
			                        if(!fin){
			                                retval.lepar_arbre.ajouteFils(new Arbre(" date JOIN "));
			                                if((joinarbre!=null?((tal_sqlParser.join_return)joinarbre).condition:null) == ""){retval.lepar_arbre.ajouteFils(new Arbre("["));}
			                                retval.lepar_arbre.ajouteFils(join_arbre);
			                                if((joinarbre!=null?((tal_sqlParser.join_return)joinarbre).condition:null) == ""){retval.lepar_arbre.ajouteFils(new Arbre("]"));}
			                                retval.lepar_arbre.ajouteFils(new Arbre(" ON "+dateCondition));
			                                       retval.lepar_arbre.ajouteFils(new Arbre("AND date.fichier=", (joinarbre!=null?((tal_sqlParser.join_return)joinarbre).type:null)+".fichier "));
			                                       retval.lepar_arbre.ajouteFils(new Arbre("AND date.numero=", (joinarbre!=null?((tal_sqlParser.join_return)joinarbre).type:null)+".numero "));
			                                       if((joinarbre!=null?((tal_sqlParser.join_return)joinarbre).condition:null) != ""){retval.lepar_arbre.ajouteFils(new Arbre("AND "+(joinarbre!=null?((tal_sqlParser.join_return)joinarbre).condition:null)));}
			                        }else{
			                                retval.lepar_arbre.ajouteFils(new Arbre("date"));
			                                retval.condition = dateCondition;
			                        }
			                
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "joindate"


	public static class joinbulletin_return extends ParserRuleReturnScope {
		public Arbre lepar_arbre = new Arbre("");
		public String type;
		public String condition = "";
	};


	// $ANTLR start "joinbulletin"
	// /home/donghao/LO17/TD7/tal_sql.g:307:1: joinbulletin returns [Arbre lepar_arbre = new Arbre(\"\"), String type, String condition = \"\"] : bulletin= BULLETIN where= INT (joinarbre= join )? ;
	public final tal_sqlParser.joinbulletin_return joinbulletin() throws RecognitionException {
		tal_sqlParser.joinbulletin_return retval = new tal_sqlParser.joinbulletin_return();
		retval.start = input.LT(1);

		Token bulletin=null;
		Token where=null;
		ParserRuleReturnScope joinarbre =null;

		Arbre join_arbre = new Arbre(""); Boolean fin = true;
		try {
			// /home/donghao/LO17/TD7/tal_sql.g:308:70: (bulletin= BULLETIN where= INT (joinarbre= join )? )
			// /home/donghao/LO17/TD7/tal_sql.g:309:9: bulletin= BULLETIN where= INT (joinarbre= join )?
			{
			bulletin=(Token)match(input,BULLETIN,FOLLOW_BULLETIN_in_joinbulletin3930); 
			where=(Token)match(input,INT,FOLLOW_INT_in_joinbulletin3944); 
			// /home/donghao/LO17/TD7/tal_sql.g:312:17: (joinarbre= join )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( ((LA13_0 >= ANNEE && LA13_0 <= APRES)||(LA13_0 >= AVANT && LA13_0 <= BULLETIN)||(LA13_0 >= CONJ && LA13_0 <= DATANT)||LA13_0==ENTRE||(LA13_0 >= JOURMOI && LA13_0 <= JOURMOIANNEE)||(LA13_0 >= MOIANNEE && LA13_0 <= PARLER)||LA13_0==RUBRIQUE||(LA13_0 >= TITRE && LA13_0 <= VAR)) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// /home/donghao/LO17/TD7/tal_sql.g:312:18: joinarbre= join
					{
					pushFollow(FOLLOW_join_in_joinbulletin3976);
					joinarbre=join();
					state._fsp--;


					                        fin = false;
					                        join_arbre = (joinarbre!=null?((tal_sqlParser.join_return)joinarbre).lepar_arbre:null);
					                
					}
					break;

			}


			                        retval.type = "numero";
			                        if(!fin){
			                                retval.lepar_arbre.ajouteFils(new Arbre(" numero JOIN "));
			                                if((joinarbre!=null?((tal_sqlParser.join_return)joinarbre).condition:null) == ""){retval.lepar_arbre.ajouteFils(new Arbre("["));}
			                                retval.lepar_arbre.ajouteFils(join_arbre);
			                                if((joinarbre!=null?((tal_sqlParser.join_return)joinarbre).condition:null) == ""){retval.lepar_arbre.ajouteFils(new Arbre("]"));}
			                                retval.lepar_arbre.ajouteFils(new Arbre(" ON numero.numero=", "'"+where.getText()+"' "));
			                                retval.lepar_arbre.ajouteFils(new Arbre("AND numero.fichier=", (joinarbre!=null?((tal_sqlParser.join_return)joinarbre).type:null)+".fichier "));
			                                retval.lepar_arbre.ajouteFils(new Arbre("AND numero.numero=", (joinarbre!=null?((tal_sqlParser.join_return)joinarbre).type:null)+".numero "));
			                                if((joinarbre!=null?((tal_sqlParser.join_return)joinarbre).condition:null) != ""){retval.lepar_arbre.ajouteFils(new Arbre("AND "+(joinarbre!=null?((tal_sqlParser.join_return)joinarbre).condition:null)));}
			                        }else{
			                                retval.lepar_arbre.ajouteFils(new Arbre("numero"));
			                                retval.condition = "numero.numero = '"+where.getText()+"' ";
			                        }
			                
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "joinbulletin"


	public static class joinrubrique_return extends ParserRuleReturnScope {
		public Arbre lepar_arbre = new Arbre("");
		public String type;
		public String condition = "";
	};


	// $ANTLR start "joinrubrique"
	// /home/donghao/LO17/TD7/tal_sql.g:335:1: joinrubrique returns [Arbre lepar_arbre = new Arbre(\"\"), String type, String condition = \"\"] : rubrique= RUBRIQUE where= RUBRIQUES (joinarbre= join )? ;
	public final tal_sqlParser.joinrubrique_return joinrubrique() throws RecognitionException {
		tal_sqlParser.joinrubrique_return retval = new tal_sqlParser.joinrubrique_return();
		retval.start = input.LT(1);

		Token rubrique=null;
		Token where=null;
		ParserRuleReturnScope joinarbre =null;

		Arbre join_arbre = new Arbre(""); Boolean fin = true;
		try {
			// /home/donghao/LO17/TD7/tal_sql.g:336:70: (rubrique= RUBRIQUE where= RUBRIQUES (joinarbre= join )? )
			// /home/donghao/LO17/TD7/tal_sql.g:337:9: rubrique= RUBRIQUE where= RUBRIQUES (joinarbre= join )?
			{
			rubrique=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_joinrubrique4067); 
			where=(Token)match(input,RUBRIQUES,FOLLOW_RUBRIQUES_in_joinrubrique4081); 
			// /home/donghao/LO17/TD7/tal_sql.g:340:17: (joinarbre= join )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( ((LA14_0 >= ANNEE && LA14_0 <= APRES)||(LA14_0 >= AVANT && LA14_0 <= BULLETIN)||(LA14_0 >= CONJ && LA14_0 <= DATANT)||LA14_0==ENTRE||(LA14_0 >= JOURMOI && LA14_0 <= JOURMOIANNEE)||(LA14_0 >= MOIANNEE && LA14_0 <= PARLER)||LA14_0==RUBRIQUE||(LA14_0 >= TITRE && LA14_0 <= VAR)) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// /home/donghao/LO17/TD7/tal_sql.g:340:18: joinarbre= join
					{
					pushFollow(FOLLOW_join_in_joinrubrique4113);
					joinarbre=join();
					state._fsp--;


					                        fin = false;
					                        join_arbre = (joinarbre!=null?((tal_sqlParser.join_return)joinarbre).lepar_arbre:null);
					 
					                
					}
					break;

			}


			                        retval.type = "titretexte";
			                        if(!fin){
			                                retval.lepar_arbre.ajouteFils(new Arbre(" titretexte JOIN "));
			                                if((joinarbre!=null?((tal_sqlParser.join_return)joinarbre).condition:null) == ""){retval.lepar_arbre.ajouteFils(new Arbre("["));}
			                                retval.lepar_arbre.ajouteFils(join_arbre);
			                                if((joinarbre!=null?((tal_sqlParser.join_return)joinarbre).condition:null) == ""){retval.lepar_arbre.ajouteFils(new Arbre("]"));}
			                                retval.lepar_arbre.ajouteFils(new Arbre(" ON titretexte.rubrique =", "'"+where.getText()+"' "));
			                                retval.lepar_arbre.ajouteFils(new Arbre("AND titretexte.fichier =", (joinarbre!=null?((tal_sqlParser.join_return)joinarbre).type:null)+".fichier "));
			                                retval.lepar_arbre.ajouteFils(new Arbre("AND titretexte.numero=", (joinarbre!=null?((tal_sqlParser.join_return)joinarbre).type:null)+".numero "));
			                                if((joinarbre!=null?((tal_sqlParser.join_return)joinarbre).condition:null) != ""){retval.lepar_arbre.ajouteFils(new Arbre("AND "+(joinarbre!=null?((tal_sqlParser.join_return)joinarbre).condition:null)));}
			                        }else{
			                                retval.lepar_arbre.ajouteFils(new Arbre("titretexte"));
			                                retval.condition = "titretexte.rubrique = '"+where.getText()+"' ";
			                        }
			                
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "joinrubrique"


	public static class joinmot_return extends ParserRuleReturnScope {
		public Arbre lepar_arbre = new Arbre("");
		public String type;
		public String condition = "";
	};


	// $ANTLR start "joinmot"
	// /home/donghao/LO17/TD7/tal_sql.g:364:1: joinmot returns [Arbre lepar_arbre = new Arbre(\"\"), String type, String condition = \"\"] : parler= ( PARLER | CONJ | ( TITRE )? ) where= VAR (joinarbre= join )? ;
	public final tal_sqlParser.joinmot_return joinmot() throws RecognitionException {
		tal_sqlParser.joinmot_return retval = new tal_sqlParser.joinmot_return();
		retval.start = input.LT(1);

		Token parler=null;
		Token where=null;
		ParserRuleReturnScope joinarbre =null;

		Arbre join_arbre  = new Arbre("");  Boolean fin = true;
		try {
			// /home/donghao/LO17/TD7/tal_sql.g:365:72: (parler= ( PARLER | CONJ | ( TITRE )? ) where= VAR (joinarbre= join )? )
			// /home/donghao/LO17/TD7/tal_sql.g:366:8: parler= ( PARLER | CONJ | ( TITRE )? ) where= VAR (joinarbre= join )?
			{
			// /home/donghao/LO17/TD7/tal_sql.g:366:10: ( PARLER | CONJ | ( TITRE )? )
			int alt16=3;
			switch ( input.LA(1) ) {
			case PARLER:
				{
				alt16=1;
				}
				break;
			case CONJ:
				{
				alt16=2;
				}
				break;
			case TITRE:
			case VAR:
				{
				alt16=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// /home/donghao/LO17/TD7/tal_sql.g:366:11: PARLER
					{
					parler=(Token)match(input,PARLER,FOLLOW_PARLER_in_joinmot4181); 
					}
					break;
				case 2 :
					// /home/donghao/LO17/TD7/tal_sql.g:366:18: CONJ
					{
					parler=(Token)match(input,CONJ,FOLLOW_CONJ_in_joinmot4183); 
					}
					break;
				case 3 :
					// /home/donghao/LO17/TD7/tal_sql.g:366:23: ( TITRE )?
					{
					// /home/donghao/LO17/TD7/tal_sql.g:366:23: ( TITRE )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==TITRE) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// /home/donghao/LO17/TD7/tal_sql.g:366:23: TITRE
							{
							parler=(Token)match(input,TITRE,FOLLOW_TITRE_in_joinmot4185); 
							}
							break;

					}

					}
					break;

			}

			where=(Token)match(input,VAR,FOLLOW_VAR_in_joinmot4201); 
			// /home/donghao/LO17/TD7/tal_sql.g:369:17: (joinarbre= join )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( ((LA17_0 >= ANNEE && LA17_0 <= APRES)||(LA17_0 >= AVANT && LA17_0 <= BULLETIN)||(LA17_0 >= CONJ && LA17_0 <= DATANT)||LA17_0==ENTRE||(LA17_0 >= JOURMOI && LA17_0 <= JOURMOIANNEE)||(LA17_0 >= MOIANNEE && LA17_0 <= PARLER)||LA17_0==RUBRIQUE||(LA17_0 >= TITRE && LA17_0 <= VAR)) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// /home/donghao/LO17/TD7/tal_sql.g:369:18: joinarbre= join
					{
					pushFollow(FOLLOW_join_in_joinmot4233);
					joinarbre=join();
					state._fsp--;


					                                fin = false;
					                                join_arbre = (joinarbre!=null?((tal_sqlParser.join_return)joinarbre).lepar_arbre:null);
					                
					}
					break;

			}


			                        retval.type = "texte"+where.getText();
			                        if(!fin){
			                                retval.lepar_arbre.ajouteFils(new Arbre("texte as "+retval.type+" JOIN "));
			                                if((joinarbre!=null?((tal_sqlParser.join_return)joinarbre).condition:null) == ""){retval.lepar_arbre.ajouteFils(new Arbre("["));}
			                                retval.lepar_arbre.ajouteFils(join_arbre);
			                                if((joinarbre!=null?((tal_sqlParser.join_return)joinarbre).condition:null) == ""){retval.lepar_arbre.ajouteFils(new Arbre("]"));}
			                                retval.lepar_arbre.ajouteFils(new Arbre(" ON "+retval.type+".mot =", "'"+where.getText()+"' "));
			                                retval.lepar_arbre.ajouteFils(new Arbre("AND "+retval.type+".fichier =", (joinarbre!=null?((tal_sqlParser.join_return)joinarbre).type:null)+".fichier "));
			                                retval.lepar_arbre.ajouteFils(new Arbre("AND "+retval.type+".numero=", (joinarbre!=null?((tal_sqlParser.join_return)joinarbre).type:null)+".numero "));
			                                if((joinarbre!=null?((tal_sqlParser.join_return)joinarbre).condition:null) != ""){retval.lepar_arbre.ajouteFils(new Arbre("AND "+(joinarbre!=null?((tal_sqlParser.join_return)joinarbre).condition:null)));}
			                        }else{
			                                retval.lepar_arbre.ajouteFils(new Arbre("texte as "+retval.type));
			                                retval.condition = retval.type+".mot = '"+where.getText()+"' ";
			                        }
			                
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "joinmot"

	// Delegated rules



	public static final BitSet FOLLOW_requete_in_listerequetes1737 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_POINT_in_listerequetes1739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1810 = new BitSet(new long[]{0x0000000000000140L});
	public static final BitSet FOLLOW_COMBIEN_in_requete1855 = new BitSet(new long[]{0x0000000000000140L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1876 = new BitSet(new long[]{0x00000000064DBDB0L});
	public static final BitSet FOLLOW_BULLETIN_in_requete1923 = new BitSet(new long[]{0x00000000064DBDB0L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete1993 = new BitSet(new long[]{0x00000000064DADB0L});
	public static final BitSet FOLLOW_BULLETIN_in_requete2006 = new BitSet(new long[]{0x00000000064DADB0L});
	public static final BitSet FOLLOW_DATE_in_requete2019 = new BitSet(new long[]{0x00000000064DADB0L});
	public static final BitSet FOLLOW_QUI_in_requete2110 = new BitSet(new long[]{0x00000000064DADB0L});
	public static final BitSet FOLLOW_join_in_requete2896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_joindate_in_join2995 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_joinrubrique_in_join3037 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_joinbulletin_in_join3079 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_joinmot_in_join3123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARLER_in_joindate3185 = new BitSet(new long[]{0x0000000000058010L});
	public static final BitSet FOLLOW_DATANT_in_joindate3206 = new BitSet(new long[]{0x0000000000058010L});
	public static final BitSet FOLLOW_ANNEE_in_joindate3232 = new BitSet(new long[]{0x00000000064DADB2L});
	public static final BitSet FOLLOW_MOIANNEE_in_joindate3272 = new BitSet(new long[]{0x00000000064DADB2L});
	public static final BitSet FOLLOW_JOURMOIANNEE_in_joindate3312 = new BitSet(new long[]{0x00000000064DADB2L});
	public static final BitSet FOLLOW_JOURMOI_in_joindate3352 = new BitSet(new long[]{0x00000000064DADB2L});
	public static final BitSet FOLLOW_ENTRE_in_joindate3392 = new BitSet(new long[]{0x00000000064DADB2L});
	public static final BitSet FOLLOW_AVANT_in_joindate3450 = new BitSet(new long[]{0x0000000000020010L});
	public static final BitSet FOLLOW_ANNEE_in_joindate3489 = new BitSet(new long[]{0x00000000064DADB2L});
	public static final BitSet FOLLOW_MOI_in_joindate3551 = new BitSet(new long[]{0x00000000064DADB2L});
	public static final BitSet FOLLOW_APRES_in_joindate3645 = new BitSet(new long[]{0x0000000000020010L});
	public static final BitSet FOLLOW_ANNEE_in_joindate3684 = new BitSet(new long[]{0x00000000064DADB2L});
	public static final BitSet FOLLOW_MOI_in_joindate3746 = new BitSet(new long[]{0x00000000064DADB2L});
	public static final BitSet FOLLOW_join_in_joindate3846 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BULLETIN_in_joinbulletin3930 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_INT_in_joinbulletin3944 = new BitSet(new long[]{0x00000000064DADB2L});
	public static final BitSet FOLLOW_join_in_joinbulletin3976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RUBRIQUE_in_joinrubrique4067 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_RUBRIQUES_in_joinrubrique4081 = new BitSet(new long[]{0x00000000064DADB2L});
	public static final BitSet FOLLOW_join_in_joinrubrique4113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARLER_in_joinmot4181 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_CONJ_in_joinmot4183 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_TITRE_in_joinmot4185 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_VAR_in_joinmot4201 = new BitSet(new long[]{0x00000000064DADB2L});
	public static final BitSet FOLLOW_join_in_joinmot4233 = new BitSet(new long[]{0x0000000000000002L});
}
