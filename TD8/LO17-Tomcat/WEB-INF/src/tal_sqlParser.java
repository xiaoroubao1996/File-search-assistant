// $ANTLR 3.5.1 /volsme/users/lo17a007/Téléchargements/tal_sql.g 2018-12-20 10:43:21

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
	@Override public String getGrammarFileName() { return "/volsme/users/lo17a007/Téléchargements/tal_sql.g"; }



	// $ANTLR start "listerequetes"
	// /volsme/users/lo17a007/Téléchargements/tal_sql.g:118:1: listerequetes returns [String sql = \"\"] : r= requete POINT ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:119:39: (r= requete POINT )
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:120:17: r= requete POINT
			{
			pushFollow(FOLLOW_requete_in_listerequetes1712);
			r=requete();
			state._fsp--;

			match(input,POINT,FOLLOW_POINT_in_listerequetes1714); 

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
	// /volsme/users/lo17a007/Téléchargements/tal_sql.g:127:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( ( ( SELECT | COMBIEN ) ( ARTICLE | BULLETIN ) ( RUBRIQUE | BULLETIN | DATE )? ) | QUI ) (joinarbre= join ) ;
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		ParserRuleReturnScope joinarbre =null;

		Arbre join_arbre; String modele_avant = ""; String modele_apres= "";String modele_group= "titretexte";String sujet2= "";
		try {
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:128:138: ( ( ( ( SELECT | COMBIEN ) ( ARTICLE | BULLETIN ) ( RUBRIQUE | BULLETIN | DATE )? ) | QUI ) (joinarbre= join ) )
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:129:17: ( ( ( SELECT | COMBIEN ) ( ARTICLE | BULLETIN ) ( RUBRIQUE | BULLETIN | DATE )? ) | QUI ) (joinarbre= join )
			{
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:129:17: ( ( ( SELECT | COMBIEN ) ( ARTICLE | BULLETIN ) ( RUBRIQUE | BULLETIN | DATE )? ) | QUI )
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
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:129:18: ( ( SELECT | COMBIEN ) ( ARTICLE | BULLETIN ) ( RUBRIQUE | BULLETIN | DATE )? )
					{
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:129:18: ( ( SELECT | COMBIEN ) ( ARTICLE | BULLETIN ) ( RUBRIQUE | BULLETIN | DATE )? )
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:129:19: ( SELECT | COMBIEN ) ( ARTICLE | BULLETIN ) ( RUBRIQUE | BULLETIN | DATE )?
					{
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:129:19: ( SELECT | COMBIEN )
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
							// /volsme/users/lo17a007/Téléchargements/tal_sql.g:129:20: SELECT
							{
							match(input,SELECT,FOLLOW_SELECT_in_requete1786); 

							                                req_arbre.ajouteFils(new Arbre("select distinct"));
							                        
							}
							break;
						case 2 :
							// /volsme/users/lo17a007/Téléchargements/tal_sql.g:133:18: COMBIEN
							{
							match(input,COMBIEN,FOLLOW_COMBIEN_in_requete1832); 

							                                req_arbre.ajouteFils(new Arbre("select distinct"));
							                                modele_avant = "count[";
							                                modele_apres = "]";
							                                modele_group= "GROUP BY ";
							                        
							}
							break;

					}

					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:139:17: ( ARTICLE | BULLETIN )
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
							// /volsme/users/lo17a007/Téléchargements/tal_sql.g:139:18: ARTICLE
							{
							match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1854); 

							                                req_arbre.ajouteFils(new Arbre(modele_avant));
							                                req_arbre.ajouteFils(new Arbre("but.fichier"));
							                                req_arbre.ajouteFils(new Arbre(modele_apres));
							                        
							}
							break;
						case 2 :
							// /volsme/users/lo17a007/Téléchargements/tal_sql.g:145:20: BULLETIN
							{
							match(input,BULLETIN,FOLLOW_BULLETIN_in_requete1901); 

							                                req_arbre.ajouteFils(new Arbre(modele_avant));
							                                req_arbre.ajouteFils(new Arbre("but.numero"));
							                                req_arbre.ajouteFils(new Arbre(modele_apres));
							                        
							}
							break;

					}

					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:152:18: ( RUBRIQUE | BULLETIN | DATE )?
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
							// /volsme/users/lo17a007/Téléchargements/tal_sql.g:153:2: RUBRIQUE
							{
							match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete1968); 

								         modele_group="rubrique";
								         req_arbre.ajouteFils(new Arbre(",but.rubrique"));
								
							}
							break;
						case 2 :
							// /volsme/users/lo17a007/Téléchargements/tal_sql.g:158:3: BULLETIN
							{
							match(input,BULLETIN,FOLLOW_BULLETIN_in_requete1975); 

								         modele_group="titretexte";
								         req_arbre.ajouteFils(new Arbre(",but.numero"));
								
							}
							break;
						case 3 :
							// /volsme/users/lo17a007/Téléchargements/tal_sql.g:163:3: DATE
							{
							match(input,DATE,FOLLOW_DATE_in_requete1982); 

								         modele_group="date";
								         req_arbre.ajouteFils(new Arbre(",but.annee,but.mois,but.jour"));
								
							}
							break;

					}

					}

					}
					break;
				case 2 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:171:19: QUI
					{
					match(input,QUI,FOLLOW_QUI_in_requete2064); 

					                                 req_arbre.ajouteFils(new Arbre("select distinct but.email"));
					                                 modele_group="email";
					                        
					}
					break;

			}

			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:177:17: (joinarbre= join )
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:177:18: joinarbre= join
			{
			pushFollow(FOLLOW_join_in_requete2850);
			joinarbre=join();
			state._fsp--;


			                                req_arbre.ajouteFils(new Arbre("FROM "+modele_group+" as but JOIN"));
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
	// /volsme/users/lo17a007/Téléchargements/tal_sql.g:194:1: join returns [Arbre lepar_arbre = new Arbre(\"\"), String type, String condition = \"\"] : (dateArbre= joindate |rubriqueArbre= joinrubrique |bulletinArbre= joinbulletin |motArbre= joinmot );
	public final tal_sqlParser.join_return join() throws RecognitionException {
		tal_sqlParser.join_return retval = new tal_sqlParser.join_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope dateArbre =null;
		ParserRuleReturnScope rubriqueArbre =null;
		ParserRuleReturnScope bulletinArbre =null;
		ParserRuleReturnScope motArbre =null;

		Arbre arbre;
		try {
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:195:37: (dateArbre= joindate |rubriqueArbre= joinrubrique |bulletinArbre= joinbulletin |motArbre= joinmot )
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
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:196:9: dateArbre= joindate
					{
					pushFollow(FOLLOW_joindate_in_join2951);
					dateArbre=joindate();
					state._fsp--;


					                        retval.condition = (dateArbre!=null?((tal_sqlParser.joindate_return)dateArbre).condition:null);
					                        retval.type = (dateArbre!=null?((tal_sqlParser.joindate_return)dateArbre).type:null);
					                        arbre = (dateArbre!=null?((tal_sqlParser.joindate_return)dateArbre).lepar_arbre:null);
					                        retval.lepar_arbre.ajouteFils(arbre);
					                
					}
					break;
				case 2 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:204:9: rubriqueArbre= joinrubrique
					{
					pushFollow(FOLLOW_joinrubrique_in_join2993);
					rubriqueArbre=joinrubrique();
					state._fsp--;


					                        retval.condition = (rubriqueArbre!=null?((tal_sqlParser.joinrubrique_return)rubriqueArbre).condition:null);
					                        retval.type = (rubriqueArbre!=null?((tal_sqlParser.joinrubrique_return)rubriqueArbre).type:null);
					                        arbre = (rubriqueArbre!=null?((tal_sqlParser.joinrubrique_return)rubriqueArbre).lepar_arbre:null);
					                        retval.lepar_arbre.ajouteFils(arbre);
					                
					}
					break;
				case 3 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:212:9: bulletinArbre= joinbulletin
					{
					pushFollow(FOLLOW_joinbulletin_in_join3035);
					bulletinArbre=joinbulletin();
					state._fsp--;


					                        retval.condition = (bulletinArbre!=null?((tal_sqlParser.joinbulletin_return)bulletinArbre).condition:null);
					                        retval.type = (bulletinArbre!=null?((tal_sqlParser.joinbulletin_return)bulletinArbre).type:null);
					                        arbre = (bulletinArbre!=null?((tal_sqlParser.joinbulletin_return)bulletinArbre).lepar_arbre:null);
					                        retval.lepar_arbre.ajouteFils(arbre);
					                
					}
					break;
				case 4 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:220:10: motArbre= joinmot
					{
					pushFollow(FOLLOW_joinmot_in_join3079);
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
	// /volsme/users/lo17a007/Téléchargements/tal_sql.g:229:1: joindate returns [Arbre lepar_arbre = new Arbre(\"\"), String type, String condition = \"\"] : ( ( PARLER | DATANT )? (annee= ANNEE |date= MOIANNEE |date= JOURMOIANNEE |date= JOURMOI ) | ( ENTRE ( (annee1= ANNEE CONJ annee2= ANNEE ) | (moi1= MOI CONJ moi2= MOI ) ) ) | ( (avantapres= AVANT |avantapres= APRES ) (annee= ANNEE |moi= MOI ) ) ) (joinarbre= join )? ;
	public final tal_sqlParser.joindate_return joindate() throws RecognitionException {
		tal_sqlParser.joindate_return retval = new tal_sqlParser.joindate_return();
		retval.start = input.LT(1);

		Token annee=null;
		Token date=null;
		Token annee1=null;
		Token annee2=null;
		Token moi1=null;
		Token moi2=null;
		Token avantapres=null;
		Token moi=null;
		ParserRuleReturnScope joinarbre =null;

		Arbre join_arbre = new Arbre(""); String[] dateTable; Boolean fin = true; String dateCondition = "";
		try {
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:230:117: ( ( ( PARLER | DATANT )? (annee= ANNEE |date= MOIANNEE |date= JOURMOIANNEE |date= JOURMOI ) | ( ENTRE ( (annee1= ANNEE CONJ annee2= ANNEE ) | (moi1= MOI CONJ moi2= MOI ) ) ) | ( (avantapres= AVANT |avantapres= APRES ) (annee= ANNEE |moi= MOI ) ) ) (joinarbre= join )? )
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:231:9: ( ( PARLER | DATANT )? (annee= ANNEE |date= MOIANNEE |date= JOURMOIANNEE |date= JOURMOI ) | ( ENTRE ( (annee1= ANNEE CONJ annee2= ANNEE ) | (moi1= MOI CONJ moi2= MOI ) ) ) | ( (avantapres= AVANT |avantapres= APRES ) (annee= ANNEE |moi= MOI ) ) ) (joinarbre= join )?
			{
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:231:9: ( ( PARLER | DATANT )? (annee= ANNEE |date= MOIANNEE |date= JOURMOIANNEE |date= JOURMOI ) | ( ENTRE ( (annee1= ANNEE CONJ annee2= ANNEE ) | (moi1= MOI CONJ moi2= MOI ) ) ) | ( (avantapres= AVANT |avantapres= APRES ) (annee= ANNEE |moi= MOI ) ) )
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
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:231:10: ( PARLER | DATANT )? (annee= ANNEE |date= MOIANNEE |date= JOURMOIANNEE |date= JOURMOI )
					{
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:231:10: ( PARLER | DATANT )?
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
							// /volsme/users/lo17a007/Téléchargements/tal_sql.g:232:9: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_joindate3141); 

							}
							break;
						case 2 :
							// /volsme/users/lo17a007/Téléchargements/tal_sql.g:234:9: DATANT
							{
							match(input,DATANT,FOLLOW_DATANT_in_joindate3164); 
							}
							break;

					}

					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:236:9: (annee= ANNEE |date= MOIANNEE |date= JOURMOIANNEE |date= JOURMOI )
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
							// /volsme/users/lo17a007/Téléchargements/tal_sql.g:236:10: annee= ANNEE
							{
							annee=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_joindate3190); 

							                         dateCondition = "date.annee='"+annee.getText()+"' ";
							                
							}
							break;
						case 2 :
							// /volsme/users/lo17a007/Téléchargements/tal_sql.g:240:16: date= MOIANNEE
							{
							date=(Token)match(input,MOIANNEE,FOLLOW_MOIANNEE_in_joindate3230); 

							                        dateTable = date.getText().split(" ");
							                        dateCondition = "date.moi='"+dateTable[0]+"' AND date.annee='"+dateTable[1]+"'";
							                
							}
							break;
						case 3 :
							// /volsme/users/lo17a007/Téléchargements/tal_sql.g:245:16: date= JOURMOIANNEE
							{
							date=(Token)match(input,JOURMOIANNEE,FOLLOW_JOURMOIANNEE_in_joindate3270); 

							                        dateTable = date.getText().split(" ");
							                        dateCondition = "date.jour='"+dateTable[0]+" date.moi='"+dateTable[1]+"' AND date.annee='"+dateTable[2]+"'";
							                
							}
							break;
						case 4 :
							// /volsme/users/lo17a007/Téléchargements/tal_sql.g:250:16: date= JOURMOI
							{
							date=(Token)match(input,JOURMOI,FOLLOW_JOURMOI_in_joindate3310); 

							                        dateTable = date.getText().split(" ");
							                        dateCondition = "date.jour='"+dateTable[0]+" date.moi='"+dateTable[1];
							                
							}
							break;

					}

					}
					break;
				case 2 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:256:9: ( ENTRE ( (annee1= ANNEE CONJ annee2= ANNEE ) | (moi1= MOI CONJ moi2= MOI ) ) )
					{
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:256:9: ( ENTRE ( (annee1= ANNEE CONJ annee2= ANNEE ) | (moi1= MOI CONJ moi2= MOI ) ) )
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:256:10: ENTRE ( (annee1= ANNEE CONJ annee2= ANNEE ) | (moi1= MOI CONJ moi2= MOI ) )
					{
					match(input,ENTRE,FOLLOW_ENTRE_in_joindate3350); 
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:257:17: ( (annee1= ANNEE CONJ annee2= ANNEE ) | (moi1= MOI CONJ moi2= MOI ) )
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
							// /volsme/users/lo17a007/Téléchargements/tal_sql.g:257:18: (annee1= ANNEE CONJ annee2= ANNEE )
							{
							// /volsme/users/lo17a007/Téléchargements/tal_sql.g:257:18: (annee1= ANNEE CONJ annee2= ANNEE )
							// /volsme/users/lo17a007/Téléchargements/tal_sql.g:257:19: annee1= ANNEE CONJ annee2= ANNEE
							{
							annee1=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_joindate3374); 
							match(input,CONJ,FOLLOW_CONJ_in_joindate3392); 
							annee2=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_joindate3414); 

							                                 dateCondition = "date.annee>'"+annee1.getText()+"' AND date.annee< '"+annee2.getText()+"'";
							                        
							}

							}
							break;
						case 2 :
							// /volsme/users/lo17a007/Téléchargements/tal_sql.g:263:19: (moi1= MOI CONJ moi2= MOI )
							{
							// /volsme/users/lo17a007/Téléchargements/tal_sql.g:263:19: (moi1= MOI CONJ moi2= MOI )
							// /volsme/users/lo17a007/Téléchargements/tal_sql.g:263:20: moi1= MOI CONJ moi2= MOI
							{
							moi1=(Token)match(input,MOI,FOLLOW_MOI_in_joindate3465); 
							match(input,CONJ,FOLLOW_CONJ_in_joindate3469); 
							moi2=(Token)match(input,MOI,FOLLOW_MOI_in_joindate3491); 

							                                 dateCondition = "date.moi>'"+moi1.getText()+"' AND date.moi< "+moi2.getText()+"'";
							                        
							}

							}
							break;

					}

					}

					}
					break;
				case 3 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:271:11: ( (avantapres= AVANT |avantapres= APRES ) (annee= ANNEE |moi= MOI ) )
					{
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:271:11: ( (avantapres= AVANT |avantapres= APRES ) (annee= ANNEE |moi= MOI ) )
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:272:17: (avantapres= AVANT |avantapres= APRES ) (annee= ANNEE |moi= MOI )
					{
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:272:17: (avantapres= AVANT |avantapres= APRES )
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==AVANT) ) {
						alt9=1;
					}
					else if ( (LA9_0==APRES) ) {
						alt9=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 9, 0, input);
						throw nvae;
					}

					switch (alt9) {
						case 1 :
							// /volsme/users/lo17a007/Téléchargements/tal_sql.g:272:18: avantapres= AVANT
							{
							avantapres=(Token)match(input,AVANT,FOLLOW_AVANT_in_joindate3586); 
							}
							break;
						case 2 :
							// /volsme/users/lo17a007/Téléchargements/tal_sql.g:274:17: avantapres= APRES
							{
							avantapres=(Token)match(input,APRES,FOLLOW_APRES_in_joindate3624); 
							}
							break;

					}

					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:276:17: (annee= ANNEE |moi= MOI )
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==ANNEE) ) {
						alt10=1;
					}
					else if ( (LA10_0==MOI) ) {
						alt10=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 10, 0, input);
						throw nvae;
					}

					switch (alt10) {
						case 1 :
							// /volsme/users/lo17a007/Téléchargements/tal_sql.g:276:18: annee= ANNEE
							{
							annee=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_joindate3657); 

							                dateCondition = "date.annee"+avantapres.getText()+"'"+annee1.getText()+"' AND date.annee"+avantapres.getText()+"' "+annee2.getText()+"'";
							                
							}
							break;
						case 2 :
							// /volsme/users/lo17a007/Téléchargements/tal_sql.g:281:17: moi= MOI
							{
							moi=(Token)match(input,MOI,FOLLOW_MOI_in_joindate3715); 
							}
							break;

					}

					}

					}
					break;

			}

			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:285:9: (joinarbre= join )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( ((LA12_0 >= ANNEE && LA12_0 <= APRES)||(LA12_0 >= AVANT && LA12_0 <= BULLETIN)||(LA12_0 >= CONJ && LA12_0 <= DATANT)||LA12_0==ENTRE||(LA12_0 >= JOURMOI && LA12_0 <= JOURMOIANNEE)||(LA12_0 >= MOIANNEE && LA12_0 <= PARLER)||LA12_0==RUBRIQUE||(LA12_0 >= TITRE && LA12_0 <= VAR)) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:285:10: joinarbre= join
					{
					pushFollow(FOLLOW_join_in_joindate3768);
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
	// /volsme/users/lo17a007/Téléchargements/tal_sql.g:309:1: joinbulletin returns [Arbre lepar_arbre = new Arbre(\"\"), String type, String condition = \"\"] : bulletin= BULLETIN where= INT (joinarbre= join )? ;
	public final tal_sqlParser.joinbulletin_return joinbulletin() throws RecognitionException {
		tal_sqlParser.joinbulletin_return retval = new tal_sqlParser.joinbulletin_return();
		retval.start = input.LT(1);

		Token bulletin=null;
		Token where=null;
		ParserRuleReturnScope joinarbre =null;

		Arbre join_arbre = new Arbre(""); Boolean fin = true;
		try {
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:310:70: (bulletin= BULLETIN where= INT (joinarbre= join )? )
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:311:9: bulletin= BULLETIN where= INT (joinarbre= join )?
			{
			bulletin=(Token)match(input,BULLETIN,FOLLOW_BULLETIN_in_joinbulletin3852); 
			where=(Token)match(input,INT,FOLLOW_INT_in_joinbulletin3866); 
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:314:17: (joinarbre= join )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( ((LA13_0 >= ANNEE && LA13_0 <= APRES)||(LA13_0 >= AVANT && LA13_0 <= BULLETIN)||(LA13_0 >= CONJ && LA13_0 <= DATANT)||LA13_0==ENTRE||(LA13_0 >= JOURMOI && LA13_0 <= JOURMOIANNEE)||(LA13_0 >= MOIANNEE && LA13_0 <= PARLER)||LA13_0==RUBRIQUE||(LA13_0 >= TITRE && LA13_0 <= VAR)) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:314:18: joinarbre= join
					{
					pushFollow(FOLLOW_join_in_joinbulletin3898);
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
	// /volsme/users/lo17a007/Téléchargements/tal_sql.g:337:1: joinrubrique returns [Arbre lepar_arbre = new Arbre(\"\"), String type, String condition = \"\"] : rubrique= RUBRIQUE where= RUBRIQUES (joinarbre= join )? ;
	public final tal_sqlParser.joinrubrique_return joinrubrique() throws RecognitionException {
		tal_sqlParser.joinrubrique_return retval = new tal_sqlParser.joinrubrique_return();
		retval.start = input.LT(1);

		Token rubrique=null;
		Token where=null;
		ParserRuleReturnScope joinarbre =null;

		Arbre join_arbre = new Arbre(""); Boolean fin = true;
		try {
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:338:70: (rubrique= RUBRIQUE where= RUBRIQUES (joinarbre= join )? )
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:339:9: rubrique= RUBRIQUE where= RUBRIQUES (joinarbre= join )?
			{
			rubrique=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_joinrubrique3989); 
			where=(Token)match(input,RUBRIQUES,FOLLOW_RUBRIQUES_in_joinrubrique4003); 
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:342:17: (joinarbre= join )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( ((LA14_0 >= ANNEE && LA14_0 <= APRES)||(LA14_0 >= AVANT && LA14_0 <= BULLETIN)||(LA14_0 >= CONJ && LA14_0 <= DATANT)||LA14_0==ENTRE||(LA14_0 >= JOURMOI && LA14_0 <= JOURMOIANNEE)||(LA14_0 >= MOIANNEE && LA14_0 <= PARLER)||LA14_0==RUBRIQUE||(LA14_0 >= TITRE && LA14_0 <= VAR)) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:342:18: joinarbre= join
					{
					pushFollow(FOLLOW_join_in_joinrubrique4035);
					joinarbre=join();
					state._fsp--;


					                        fin = false;
					                        join_arbre = (joinarbre!=null?((tal_sqlParser.join_return)joinarbre).lepar_arbre:null);
					 
					                
					}
					break;

			}


			                        retval.type = "rubrique";
			                        if(!fin){
			                                retval.lepar_arbre.ajouteFils(new Arbre(" rubrique JOIN "));
			                                if((joinarbre!=null?((tal_sqlParser.join_return)joinarbre).condition:null) == ""){retval.lepar_arbre.ajouteFils(new Arbre("["));}
			                                retval.lepar_arbre.ajouteFils(join_arbre);
			                                if((joinarbre!=null?((tal_sqlParser.join_return)joinarbre).condition:null) == ""){retval.lepar_arbre.ajouteFils(new Arbre("]"));}
			                                retval.lepar_arbre.ajouteFils(new Arbre(" ON rubrique.rubrique =", "'"+where.getText()+"' "));
			                                retval.lepar_arbre.ajouteFils(new Arbre("AND rubrique.fichier =", (joinarbre!=null?((tal_sqlParser.join_return)joinarbre).type:null)+".fichier "));
			                                retval.lepar_arbre.ajouteFils(new Arbre("AND rubrique.numero=", (joinarbre!=null?((tal_sqlParser.join_return)joinarbre).type:null)+".numero "));
			                                if((joinarbre!=null?((tal_sqlParser.join_return)joinarbre).condition:null) != ""){retval.lepar_arbre.ajouteFils(new Arbre("AND "+(joinarbre!=null?((tal_sqlParser.join_return)joinarbre).condition:null)));}
			                        }else{
			                                retval.lepar_arbre.ajouteFils(new Arbre("rubrique"));
			                                retval.condition = "rubrique.rubrique = '"+where.getText()+"' ";
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
	// /volsme/users/lo17a007/Téléchargements/tal_sql.g:366:1: joinmot returns [Arbre lepar_arbre = new Arbre(\"\"), String type, String condition = \"\"] : parler= ( PARLER | CONJ | ( TITRE )? ) where= VAR (joinarbre= join )? ;
	public final tal_sqlParser.joinmot_return joinmot() throws RecognitionException {
		tal_sqlParser.joinmot_return retval = new tal_sqlParser.joinmot_return();
		retval.start = input.LT(1);

		Token parler=null;
		Token where=null;
		ParserRuleReturnScope joinarbre =null;

		Arbre join_arbre  = new Arbre("");  Boolean fin = true;
		try {
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:367:72: (parler= ( PARLER | CONJ | ( TITRE )? ) where= VAR (joinarbre= join )? )
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:368:8: parler= ( PARLER | CONJ | ( TITRE )? ) where= VAR (joinarbre= join )?
			{
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:368:10: ( PARLER | CONJ | ( TITRE )? )
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
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:368:11: PARLER
					{
					parler=(Token)match(input,PARLER,FOLLOW_PARLER_in_joinmot4103); 
					}
					break;
				case 2 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:368:18: CONJ
					{
					parler=(Token)match(input,CONJ,FOLLOW_CONJ_in_joinmot4105); 
					}
					break;
				case 3 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:368:23: ( TITRE )?
					{
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:368:23: ( TITRE )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==TITRE) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// /volsme/users/lo17a007/Téléchargements/tal_sql.g:368:23: TITRE
							{
							parler=(Token)match(input,TITRE,FOLLOW_TITRE_in_joinmot4107); 
							}
							break;

					}

					}
					break;

			}

			where=(Token)match(input,VAR,FOLLOW_VAR_in_joinmot4123); 
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:371:17: (joinarbre= join )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( ((LA17_0 >= ANNEE && LA17_0 <= APRES)||(LA17_0 >= AVANT && LA17_0 <= BULLETIN)||(LA17_0 >= CONJ && LA17_0 <= DATANT)||LA17_0==ENTRE||(LA17_0 >= JOURMOI && LA17_0 <= JOURMOIANNEE)||(LA17_0 >= MOIANNEE && LA17_0 <= PARLER)||LA17_0==RUBRIQUE||(LA17_0 >= TITRE && LA17_0 <= VAR)) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:371:18: joinarbre= join
					{
					pushFollow(FOLLOW_join_in_joinmot4155);
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



	public static final BitSet FOLLOW_requete_in_listerequetes1712 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_POINT_in_listerequetes1714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1786 = new BitSet(new long[]{0x0000000000000140L});
	public static final BitSet FOLLOW_COMBIEN_in_requete1832 = new BitSet(new long[]{0x0000000000000140L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1854 = new BitSet(new long[]{0x00000000064DBDB0L});
	public static final BitSet FOLLOW_BULLETIN_in_requete1901 = new BitSet(new long[]{0x00000000064DBDB0L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete1968 = new BitSet(new long[]{0x00000000064DADB0L});
	public static final BitSet FOLLOW_BULLETIN_in_requete1975 = new BitSet(new long[]{0x00000000064DADB0L});
	public static final BitSet FOLLOW_DATE_in_requete1982 = new BitSet(new long[]{0x00000000064DADB0L});
	public static final BitSet FOLLOW_QUI_in_requete2064 = new BitSet(new long[]{0x00000000064DADB0L});
	public static final BitSet FOLLOW_join_in_requete2850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_joindate_in_join2951 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_joinrubrique_in_join2993 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_joinbulletin_in_join3035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_joinmot_in_join3079 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARLER_in_joindate3141 = new BitSet(new long[]{0x0000000000058010L});
	public static final BitSet FOLLOW_DATANT_in_joindate3164 = new BitSet(new long[]{0x0000000000058010L});
	public static final BitSet FOLLOW_ANNEE_in_joindate3190 = new BitSet(new long[]{0x00000000064DADB2L});
	public static final BitSet FOLLOW_MOIANNEE_in_joindate3230 = new BitSet(new long[]{0x00000000064DADB2L});
	public static final BitSet FOLLOW_JOURMOIANNEE_in_joindate3270 = new BitSet(new long[]{0x00000000064DADB2L});
	public static final BitSet FOLLOW_JOURMOI_in_joindate3310 = new BitSet(new long[]{0x00000000064DADB2L});
	public static final BitSet FOLLOW_ENTRE_in_joindate3350 = new BitSet(new long[]{0x0000000000020010L});
	public static final BitSet FOLLOW_ANNEE_in_joindate3374 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_CONJ_in_joindate3392 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_joindate3414 = new BitSet(new long[]{0x00000000064DADB2L});
	public static final BitSet FOLLOW_MOI_in_joindate3465 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_CONJ_in_joindate3469 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_MOI_in_joindate3491 = new BitSet(new long[]{0x00000000064DADB2L});
	public static final BitSet FOLLOW_AVANT_in_joindate3586 = new BitSet(new long[]{0x0000000000020010L});
	public static final BitSet FOLLOW_APRES_in_joindate3624 = new BitSet(new long[]{0x0000000000020010L});
	public static final BitSet FOLLOW_ANNEE_in_joindate3657 = new BitSet(new long[]{0x00000000064DADB2L});
	public static final BitSet FOLLOW_MOI_in_joindate3715 = new BitSet(new long[]{0x00000000064DADB2L});
	public static final BitSet FOLLOW_join_in_joindate3768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BULLETIN_in_joinbulletin3852 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_INT_in_joinbulletin3866 = new BitSet(new long[]{0x00000000064DADB2L});
	public static final BitSet FOLLOW_join_in_joinbulletin3898 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RUBRIQUE_in_joinrubrique3989 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_RUBRIQUES_in_joinrubrique4003 = new BitSet(new long[]{0x00000000064DADB2L});
	public static final BitSet FOLLOW_join_in_joinrubrique4035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARLER_in_joinmot4103 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_CONJ_in_joinmot4105 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_TITRE_in_joinmot4107 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_VAR_in_joinmot4123 = new BitSet(new long[]{0x00000000064DADB2L});
	public static final BitSet FOLLOW_join_in_joinmot4155 = new BitSet(new long[]{0x0000000000000002L});
}
