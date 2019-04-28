// $ANTLR 3.x /home/donghao/LO17/TD7/tal_sql.g 2018-12-11 21:51:08

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ANNEE", "APRES", "ARTICLE", "AVANT", 
		"BULLETIN", "COMBIEN", "CONJ", "DATE", "ENTRE", "INT", "JOURMOI", "JOURMOIANNEE", 
		"MOI", "MOIANNEE", "PARLER", "POINT", "QUI", "RUBRIQUE", "SELECT", "TITRE", 
		"VAR", "WS"
	};
	public static final int EOF=-1;
	public static final int ANNEE=4;
	public static final int APRES=5;
	public static final int ARTICLE=6;
	public static final int AVANT=7;
	public static final int BULLETIN=8;
	public static final int COMBIEN=9;
	public static final int CONJ=10;
	public static final int DATE=11;
	public static final int ENTRE=12;
	public static final int INT=13;
	public static final int JOURMOI=14;
	public static final int JOURMOIANNEE=15;
	public static final int MOI=16;
	public static final int MOIANNEE=17;
	public static final int PARLER=18;
	public static final int POINT=19;
	public static final int QUI=20;
	public static final int RUBRIQUE=21;
	public static final int SELECT=22;
	public static final int TITRE=23;
	public static final int VAR=24;
	public static final int WS=25;

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
	// /home/donghao/LO17/TD7/tal_sql.g:92:1: listerequetes returns [String sql = \"\"] : r= requete POINT ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// /home/donghao/LO17/TD7/tal_sql.g:93:39: (r= requete POINT )
			// /home/donghao/LO17/TD7/tal_sql.g:94:17: r= requete POINT
			{
			pushFollow(FOLLOW_requete_in_listerequetes1079);
			r=requete();
			state._fsp--;

			match(input,POINT,FOLLOW_POINT_in_listerequetes1081); 

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
	// /home/donghao/LO17/TD7/tal_sql.g:101:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( ( SELECT | COMBIEN ) ( ARTICLE | BULLETIN ) | QUI ) (joinarbre= join )? ;
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		ParserRuleReturnScope joinarbre =null;

		Arbre join_arbre; String modele_avant = ""; String modele_apres= "";String modele_group= "";
		try {
			// /home/donghao/LO17/TD7/tal_sql.g:102:110: ( ( ( SELECT | COMBIEN ) ( ARTICLE | BULLETIN ) | QUI ) (joinarbre= join )? )
			// /home/donghao/LO17/TD7/tal_sql.g:103:17: ( ( SELECT | COMBIEN ) ( ARTICLE | BULLETIN ) | QUI ) (joinarbre= join )?
			{
			// /home/donghao/LO17/TD7/tal_sql.g:103:17: ( ( SELECT | COMBIEN ) ( ARTICLE | BULLETIN ) | QUI )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==COMBIEN||LA3_0==SELECT) ) {
				alt3=1;
			}
			else if ( (LA3_0==QUI) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /home/donghao/LO17/TD7/tal_sql.g:103:18: ( SELECT | COMBIEN ) ( ARTICLE | BULLETIN )
					{
					// /home/donghao/LO17/TD7/tal_sql.g:103:18: ( SELECT | COMBIEN )
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
							// /home/donghao/LO17/TD7/tal_sql.g:103:19: SELECT
							{
							match(input,SELECT,FOLLOW_SELECT_in_requete1152); 

							                                req_arbre.ajouteFils(new Arbre("select distinct"));
							                        
							}
							break;
						case 2 :
							// /home/donghao/LO17/TD7/tal_sql.g:107:18: COMBIEN
							{
							match(input,COMBIEN,FOLLOW_COMBIEN_in_requete1198); 

							                                req_arbre.ajouteFils(new Arbre("select distinct"));
							                                modele_avant = "count[";
							                                modele_apres = "]";
							                                modele_group= "GROUP BY ";
							                        
							}
							break;

					}

					// /home/donghao/LO17/TD7/tal_sql.g:113:17: ( ARTICLE | BULLETIN )
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
							// /home/donghao/LO17/TD7/tal_sql.g:113:18: ARTICLE
							{
							match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1220); 

							                                req_arbre.ajouteFils(new Arbre(modele_avant));
							                                req_arbre.ajouteFils(new Arbre("but.fichier"));
							                                req_arbre.ajouteFils(new Arbre(modele_apres));
							                                req_arbre.ajouteFils(new Arbre("FROM titretexte as but JOIN"));
							                        
							}
							break;
						case 2 :
							// /home/donghao/LO17/TD7/tal_sql.g:120:20: BULLETIN
							{
							match(input,BULLETIN,FOLLOW_BULLETIN_in_requete1267); 

							                                req_arbre.ajouteFils(new Arbre(modele_avant));
							                                req_arbre.ajouteFils(new Arbre("but.numero"));
							                                req_arbre.ajouteFils(new Arbre(modele_apres));
							                                req_arbre.ajouteFils(new Arbre("FROM titretexte as but JOIN"));
							                        
							}
							break;

					}

					}
					break;
				case 2 :
					// /home/donghao/LO17/TD7/tal_sql.g:128:19: QUI
					{
					match(input,QUI,FOLLOW_QUI_in_requete1332); 

					                                 req_arbre.ajouteFils(new Arbre("select distinct email FROM email as but JOIN"));
					                         
					}
					break;

			}

			// /home/donghao/LO17/TD7/tal_sql.g:133:17: (joinarbre= join )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= ANNEE && LA4_0 <= APRES)||(LA4_0 >= AVANT && LA4_0 <= BULLETIN)||LA4_0==CONJ||LA4_0==ENTRE||(LA4_0 >= JOURMOI && LA4_0 <= JOURMOIANNEE)||(LA4_0 >= MOIANNEE && LA4_0 <= PARLER)||LA4_0==RUBRIQUE||(LA4_0 >= TITRE && LA4_0 <= VAR)) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /home/donghao/LO17/TD7/tal_sql.g:133:18: joinarbre= join
					{
					pushFollow(FOLLOW_join_in_requete2119);
					joinarbre=join();
					state._fsp--;


					                                join_arbre = (joinarbre!=null?((tal_sqlParser.join_return)joinarbre).lepar_arbre:null);
					                                if((joinarbre!=null?((tal_sqlParser.join_return)joinarbre).condition:null) == ""){req_arbre.ajouteFils(new Arbre("["));}
					                                req_arbre.ajouteFils(join_arbre);
					                                if((joinarbre!=null?((tal_sqlParser.join_return)joinarbre).condition:null) == ""){req_arbre.ajouteFils(new Arbre("]"));}
					                                req_arbre.ajouteFils(new Arbre(" ON but.fichier = "+(joinarbre!=null?((tal_sqlParser.join_return)joinarbre).type:null)+".fichier"));
					                                req_arbre.ajouteFils(new Arbre("AND but.numero=", (joinarbre!=null?((tal_sqlParser.join_return)joinarbre).type:null)+".numero "));
					                                 if((joinarbre!=null?((tal_sqlParser.join_return)joinarbre).condition:null) != ""){req_arbre.ajouteFils(new Arbre("AND "+(joinarbre!=null?((tal_sqlParser.join_return)joinarbre).condition:null)));}
					                        
					}
					break;

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
	// /home/donghao/LO17/TD7/tal_sql.g:149:1: join returns [Arbre lepar_arbre = new Arbre(\"\"), String type, String condition = \"\"] : (dateArbre= joindate |rubriqueArbre= joinrubrique |bulletinArbre= joinbulletin |motArbre= joinmot );
	public final tal_sqlParser.join_return join() throws RecognitionException {
		tal_sqlParser.join_return retval = new tal_sqlParser.join_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope dateArbre =null;
		ParserRuleReturnScope rubriqueArbre =null;
		ParserRuleReturnScope bulletinArbre =null;
		ParserRuleReturnScope motArbre =null;

		Arbre arbre;
		try {
			// /home/donghao/LO17/TD7/tal_sql.g:150:37: (dateArbre= joindate |rubriqueArbre= joinrubrique |bulletinArbre= joinbulletin |motArbre= joinmot )
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
					// /home/donghao/LO17/TD7/tal_sql.g:151:9: dateArbre= joindate
					{
					pushFollow(FOLLOW_joindate_in_join2221);
					dateArbre=joindate();
					state._fsp--;


					                        retval.condition = (dateArbre!=null?((tal_sqlParser.joindate_return)dateArbre).condition:null);
					                        retval.type = (dateArbre!=null?((tal_sqlParser.joindate_return)dateArbre).type:null);
					                        arbre = (dateArbre!=null?((tal_sqlParser.joindate_return)dateArbre).lepar_arbre:null);
					                        retval.lepar_arbre.ajouteFils(arbre);
					                
					}
					break;
				case 2 :
					// /home/donghao/LO17/TD7/tal_sql.g:159:9: rubriqueArbre= joinrubrique
					{
					pushFollow(FOLLOW_joinrubrique_in_join2263);
					rubriqueArbre=joinrubrique();
					state._fsp--;


					                        retval.condition = (rubriqueArbre!=null?((tal_sqlParser.joinrubrique_return)rubriqueArbre).condition:null);
					                        retval.type = (rubriqueArbre!=null?((tal_sqlParser.joinrubrique_return)rubriqueArbre).type:null);
					                        arbre = (rubriqueArbre!=null?((tal_sqlParser.joinrubrique_return)rubriqueArbre).lepar_arbre:null);
					                        retval.lepar_arbre.ajouteFils(arbre);
					                
					}
					break;
				case 3 :
					// /home/donghao/LO17/TD7/tal_sql.g:167:9: bulletinArbre= joinbulletin
					{
					pushFollow(FOLLOW_joinbulletin_in_join2305);
					bulletinArbre=joinbulletin();
					state._fsp--;


					                        retval.condition = (bulletinArbre!=null?((tal_sqlParser.joinbulletin_return)bulletinArbre).condition:null);
					                        retval.type = (bulletinArbre!=null?((tal_sqlParser.joinbulletin_return)bulletinArbre).type:null);
					                        arbre = (bulletinArbre!=null?((tal_sqlParser.joinbulletin_return)bulletinArbre).lepar_arbre:null);
					                        retval.lepar_arbre.ajouteFils(arbre);
					                
					}
					break;
				case 4 :
					// /home/donghao/LO17/TD7/tal_sql.g:175:10: motArbre= joinmot
					{
					pushFollow(FOLLOW_joinmot_in_join2349);
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
	// /home/donghao/LO17/TD7/tal_sql.g:184:1: joindate returns [Arbre lepar_arbre = new Arbre(\"\"), String type, String condition = \"\"] : ( ( PARLER )? (annee= ANNEE |date= MOIANNEE |date= JOURMOIANNEE |date= JOURMOI ) | ( ENTRE ( (annee1= ANNEE CONJ annee2= ANNEE ) | (moi1= MOI CONJ moi2= MOI ) ) ) | ( (avantapres= AVANT |avantapres= APRES ) (annee= ANNEE |moi= MOI ) ) ) (joinarbre= join )? ;
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
			// /home/donghao/LO17/TD7/tal_sql.g:185:117: ( ( ( PARLER )? (annee= ANNEE |date= MOIANNEE |date= JOURMOIANNEE |date= JOURMOI ) | ( ENTRE ( (annee1= ANNEE CONJ annee2= ANNEE ) | (moi1= MOI CONJ moi2= MOI ) ) ) | ( (avantapres= AVANT |avantapres= APRES ) (annee= ANNEE |moi= MOI ) ) ) (joinarbre= join )? )
			// /home/donghao/LO17/TD7/tal_sql.g:186:9: ( ( PARLER )? (annee= ANNEE |date= MOIANNEE |date= JOURMOIANNEE |date= JOURMOI ) | ( ENTRE ( (annee1= ANNEE CONJ annee2= ANNEE ) | (moi1= MOI CONJ moi2= MOI ) ) ) | ( (avantapres= AVANT |avantapres= APRES ) (annee= ANNEE |moi= MOI ) ) ) (joinarbre= join )?
			{
			// /home/donghao/LO17/TD7/tal_sql.g:186:9: ( ( PARLER )? (annee= ANNEE |date= MOIANNEE |date= JOURMOIANNEE |date= JOURMOI ) | ( ENTRE ( (annee1= ANNEE CONJ annee2= ANNEE ) | (moi1= MOI CONJ moi2= MOI ) ) ) | ( (avantapres= AVANT |avantapres= APRES ) (annee= ANNEE |moi= MOI ) ) )
			int alt11=3;
			switch ( input.LA(1) ) {
			case ANNEE:
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
					// /home/donghao/LO17/TD7/tal_sql.g:186:10: ( PARLER )? (annee= ANNEE |date= MOIANNEE |date= JOURMOIANNEE |date= JOURMOI )
					{
					// /home/donghao/LO17/TD7/tal_sql.g:186:10: ( PARLER )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==PARLER) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /home/donghao/LO17/TD7/tal_sql.g:187:9: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_joindate2411); 
							}
							break;

					}

					// /home/donghao/LO17/TD7/tal_sql.g:189:9: (annee= ANNEE |date= MOIANNEE |date= JOURMOIANNEE |date= JOURMOI )
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
							// /home/donghao/LO17/TD7/tal_sql.g:189:10: annee= ANNEE
							{
							annee=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_joindate2437); 

							                         dateCondition = "date.annee='"+annee.getText()+"' ";
							                
							}
							break;
						case 2 :
							// /home/donghao/LO17/TD7/tal_sql.g:193:16: date= MOIANNEE
							{
							date=(Token)match(input,MOIANNEE,FOLLOW_MOIANNEE_in_joindate2477); 

							                        dateTable = date.getText().split(" ");
							                        dateCondition = "date.moi='"+dateTable[0]+"' AND date.annee='"+dateTable[1]+"'";
							                
							}
							break;
						case 3 :
							// /home/donghao/LO17/TD7/tal_sql.g:198:16: date= JOURMOIANNEE
							{
							date=(Token)match(input,JOURMOIANNEE,FOLLOW_JOURMOIANNEE_in_joindate2517); 

							                        dateTable = date.getText().split(" ");
							                        dateCondition = "date.jour='"+dateTable[0]+" date.moi='"+dateTable[1]+"' AND date.annee='"+dateTable[2]+"'";
							                
							}
							break;
						case 4 :
							// /home/donghao/LO17/TD7/tal_sql.g:203:16: date= JOURMOI
							{
							date=(Token)match(input,JOURMOI,FOLLOW_JOURMOI_in_joindate2557); 

							                        dateTable = date.getText().split(" ");
							                        dateCondition = "date.jour='"+dateTable[0]+" date.moi='"+dateTable[1];
							                
							}
							break;

					}

					}
					break;
				case 2 :
					// /home/donghao/LO17/TD7/tal_sql.g:209:9: ( ENTRE ( (annee1= ANNEE CONJ annee2= ANNEE ) | (moi1= MOI CONJ moi2= MOI ) ) )
					{
					// /home/donghao/LO17/TD7/tal_sql.g:209:9: ( ENTRE ( (annee1= ANNEE CONJ annee2= ANNEE ) | (moi1= MOI CONJ moi2= MOI ) ) )
					// /home/donghao/LO17/TD7/tal_sql.g:209:10: ENTRE ( (annee1= ANNEE CONJ annee2= ANNEE ) | (moi1= MOI CONJ moi2= MOI ) )
					{
					match(input,ENTRE,FOLLOW_ENTRE_in_joindate2597); 
					// /home/donghao/LO17/TD7/tal_sql.g:210:17: ( (annee1= ANNEE CONJ annee2= ANNEE ) | (moi1= MOI CONJ moi2= MOI ) )
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
							// /home/donghao/LO17/TD7/tal_sql.g:210:18: (annee1= ANNEE CONJ annee2= ANNEE )
							{
							// /home/donghao/LO17/TD7/tal_sql.g:210:18: (annee1= ANNEE CONJ annee2= ANNEE )
							// /home/donghao/LO17/TD7/tal_sql.g:210:19: annee1= ANNEE CONJ annee2= ANNEE
							{
							annee1=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_joindate2621); 
							match(input,CONJ,FOLLOW_CONJ_in_joindate2639); 
							annee2=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_joindate2661); 

							                                 dateCondition = "date.annee>'"+annee1.getText()+"' AND date.annee< '"+annee2.getText()+"'";
							                        
							}

							}
							break;
						case 2 :
							// /home/donghao/LO17/TD7/tal_sql.g:216:19: (moi1= MOI CONJ moi2= MOI )
							{
							// /home/donghao/LO17/TD7/tal_sql.g:216:19: (moi1= MOI CONJ moi2= MOI )
							// /home/donghao/LO17/TD7/tal_sql.g:216:20: moi1= MOI CONJ moi2= MOI
							{
							moi1=(Token)match(input,MOI,FOLLOW_MOI_in_joindate2712); 
							match(input,CONJ,FOLLOW_CONJ_in_joindate2716); 
							moi2=(Token)match(input,MOI,FOLLOW_MOI_in_joindate2738); 

							                                 dateCondition = "date.moi>'"+moi1.getText()+"' AND date.moi< "+moi2.getText()+"'";
							                        
							}

							}
							break;

					}

					}

					}
					break;
				case 3 :
					// /home/donghao/LO17/TD7/tal_sql.g:224:11: ( (avantapres= AVANT |avantapres= APRES ) (annee= ANNEE |moi= MOI ) )
					{
					// /home/donghao/LO17/TD7/tal_sql.g:224:11: ( (avantapres= AVANT |avantapres= APRES ) (annee= ANNEE |moi= MOI ) )
					// /home/donghao/LO17/TD7/tal_sql.g:225:17: (avantapres= AVANT |avantapres= APRES ) (annee= ANNEE |moi= MOI )
					{
					// /home/donghao/LO17/TD7/tal_sql.g:225:17: (avantapres= AVANT |avantapres= APRES )
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
							// /home/donghao/LO17/TD7/tal_sql.g:225:18: avantapres= AVANT
							{
							avantapres=(Token)match(input,AVANT,FOLLOW_AVANT_in_joindate2833); 
							}
							break;
						case 2 :
							// /home/donghao/LO17/TD7/tal_sql.g:227:17: avantapres= APRES
							{
							avantapres=(Token)match(input,APRES,FOLLOW_APRES_in_joindate2871); 
							}
							break;

					}

					// /home/donghao/LO17/TD7/tal_sql.g:229:17: (annee= ANNEE |moi= MOI )
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
							// /home/donghao/LO17/TD7/tal_sql.g:229:18: annee= ANNEE
							{
							annee=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_joindate2904); 

							                dateCondition = "date.annee"+avantapres.getText()+"'"+annee1.getText()+"' AND date.annee"+avantapres.getText()+"' "+annee2.getText()+"'";
							                
							}
							break;
						case 2 :
							// /home/donghao/LO17/TD7/tal_sql.g:234:17: moi= MOI
							{
							moi=(Token)match(input,MOI,FOLLOW_MOI_in_joindate2962); 
							}
							break;

					}

					}

					}
					break;

			}

			// /home/donghao/LO17/TD7/tal_sql.g:238:9: (joinarbre= join )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( ((LA12_0 >= ANNEE && LA12_0 <= APRES)||(LA12_0 >= AVANT && LA12_0 <= BULLETIN)||LA12_0==CONJ||LA12_0==ENTRE||(LA12_0 >= JOURMOI && LA12_0 <= JOURMOIANNEE)||(LA12_0 >= MOIANNEE && LA12_0 <= PARLER)||LA12_0==RUBRIQUE||(LA12_0 >= TITRE && LA12_0 <= VAR)) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// /home/donghao/LO17/TD7/tal_sql.g:238:10: joinarbre= join
					{
					pushFollow(FOLLOW_join_in_joindate3015);
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
	// /home/donghao/LO17/TD7/tal_sql.g:262:1: joinbulletin returns [Arbre lepar_arbre = new Arbre(\"\"), String type, String condition = \"\"] : bulletin= BULLETIN where= INT (joinarbre= join )? ;
	public final tal_sqlParser.joinbulletin_return joinbulletin() throws RecognitionException {
		tal_sqlParser.joinbulletin_return retval = new tal_sqlParser.joinbulletin_return();
		retval.start = input.LT(1);

		Token bulletin=null;
		Token where=null;
		ParserRuleReturnScope joinarbre =null;

		Arbre join_arbre = new Arbre(""); Boolean fin = true;
		try {
			// /home/donghao/LO17/TD7/tal_sql.g:263:70: (bulletin= BULLETIN where= INT (joinarbre= join )? )
			// /home/donghao/LO17/TD7/tal_sql.g:264:9: bulletin= BULLETIN where= INT (joinarbre= join )?
			{
			bulletin=(Token)match(input,BULLETIN,FOLLOW_BULLETIN_in_joinbulletin3099); 
			where=(Token)match(input,INT,FOLLOW_INT_in_joinbulletin3113); 
			// /home/donghao/LO17/TD7/tal_sql.g:267:17: (joinarbre= join )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( ((LA13_0 >= ANNEE && LA13_0 <= APRES)||(LA13_0 >= AVANT && LA13_0 <= BULLETIN)||LA13_0==CONJ||LA13_0==ENTRE||(LA13_0 >= JOURMOI && LA13_0 <= JOURMOIANNEE)||(LA13_0 >= MOIANNEE && LA13_0 <= PARLER)||LA13_0==RUBRIQUE||(LA13_0 >= TITRE && LA13_0 <= VAR)) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// /home/donghao/LO17/TD7/tal_sql.g:267:18: joinarbre= join
					{
					pushFollow(FOLLOW_join_in_joinbulletin3145);
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
	// /home/donghao/LO17/TD7/tal_sql.g:290:1: joinrubrique returns [Arbre lepar_arbre = new Arbre(\"\"), String type, String condition = \"\"] : rubrique= RUBRIQUE where= VAR (joinarbre= join )? ;
	public final tal_sqlParser.joinrubrique_return joinrubrique() throws RecognitionException {
		tal_sqlParser.joinrubrique_return retval = new tal_sqlParser.joinrubrique_return();
		retval.start = input.LT(1);

		Token rubrique=null;
		Token where=null;
		ParserRuleReturnScope joinarbre =null;

		Arbre join_arbre = new Arbre(""); Boolean fin = true;
		try {
			// /home/donghao/LO17/TD7/tal_sql.g:291:70: (rubrique= RUBRIQUE where= VAR (joinarbre= join )? )
			// /home/donghao/LO17/TD7/tal_sql.g:292:9: rubrique= RUBRIQUE where= VAR (joinarbre= join )?
			{
			rubrique=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_joinrubrique3236); 
			where=(Token)match(input,VAR,FOLLOW_VAR_in_joinrubrique3250); 
			// /home/donghao/LO17/TD7/tal_sql.g:295:17: (joinarbre= join )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( ((LA14_0 >= ANNEE && LA14_0 <= APRES)||(LA14_0 >= AVANT && LA14_0 <= BULLETIN)||LA14_0==CONJ||LA14_0==ENTRE||(LA14_0 >= JOURMOI && LA14_0 <= JOURMOIANNEE)||(LA14_0 >= MOIANNEE && LA14_0 <= PARLER)||LA14_0==RUBRIQUE||(LA14_0 >= TITRE && LA14_0 <= VAR)) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// /home/donghao/LO17/TD7/tal_sql.g:295:18: joinarbre= join
					{
					pushFollow(FOLLOW_join_in_joinrubrique3282);
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
	// /home/donghao/LO17/TD7/tal_sql.g:319:1: joinmot returns [Arbre lepar_arbre = new Arbre(\"\"), String type, String condition = \"\"] : parler= ( PARLER | CONJ | ( TITRE )? ) where= VAR (joinarbre= join )? ;
	public final tal_sqlParser.joinmot_return joinmot() throws RecognitionException {
		tal_sqlParser.joinmot_return retval = new tal_sqlParser.joinmot_return();
		retval.start = input.LT(1);

		Token parler=null;
		Token where=null;
		ParserRuleReturnScope joinarbre =null;

		Arbre join_arbre  = new Arbre("");  Boolean fin = true;
		try {
			// /home/donghao/LO17/TD7/tal_sql.g:320:72: (parler= ( PARLER | CONJ | ( TITRE )? ) where= VAR (joinarbre= join )? )
			// /home/donghao/LO17/TD7/tal_sql.g:321:8: parler= ( PARLER | CONJ | ( TITRE )? ) where= VAR (joinarbre= join )?
			{
			// /home/donghao/LO17/TD7/tal_sql.g:321:10: ( PARLER | CONJ | ( TITRE )? )
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
					// /home/donghao/LO17/TD7/tal_sql.g:321:11: PARLER
					{
					parler=(Token)match(input,PARLER,FOLLOW_PARLER_in_joinmot3350); 
					}
					break;
				case 2 :
					// /home/donghao/LO17/TD7/tal_sql.g:321:18: CONJ
					{
					parler=(Token)match(input,CONJ,FOLLOW_CONJ_in_joinmot3352); 
					}
					break;
				case 3 :
					// /home/donghao/LO17/TD7/tal_sql.g:321:23: ( TITRE )?
					{
					// /home/donghao/LO17/TD7/tal_sql.g:321:23: ( TITRE )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==TITRE) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// /home/donghao/LO17/TD7/tal_sql.g:321:23: TITRE
							{
							parler=(Token)match(input,TITRE,FOLLOW_TITRE_in_joinmot3354); 
							}
							break;

					}

					}
					break;

			}

			where=(Token)match(input,VAR,FOLLOW_VAR_in_joinmot3370); 
			// /home/donghao/LO17/TD7/tal_sql.g:324:17: (joinarbre= join )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( ((LA17_0 >= ANNEE && LA17_0 <= APRES)||(LA17_0 >= AVANT && LA17_0 <= BULLETIN)||LA17_0==CONJ||LA17_0==ENTRE||(LA17_0 >= JOURMOI && LA17_0 <= JOURMOIANNEE)||(LA17_0 >= MOIANNEE && LA17_0 <= PARLER)||LA17_0==RUBRIQUE||(LA17_0 >= TITRE && LA17_0 <= VAR)) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// /home/donghao/LO17/TD7/tal_sql.g:324:18: joinarbre= join
					{
					pushFollow(FOLLOW_join_in_joinmot3402);
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



	public static final BitSet FOLLOW_requete_in_listerequetes1079 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_POINT_in_listerequetes1081 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1152 = new BitSet(new long[]{0x0000000000000140L});
	public static final BitSet FOLLOW_COMBIEN_in_requete1198 = new BitSet(new long[]{0x0000000000000140L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1220 = new BitSet(new long[]{0x0000000001A6D5B2L});
	public static final BitSet FOLLOW_BULLETIN_in_requete1267 = new BitSet(new long[]{0x0000000001A6D5B2L});
	public static final BitSet FOLLOW_QUI_in_requete1332 = new BitSet(new long[]{0x0000000001A6D5B2L});
	public static final BitSet FOLLOW_join_in_requete2119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_joindate_in_join2221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_joinrubrique_in_join2263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_joinbulletin_in_join2305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_joinmot_in_join2349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARLER_in_joindate2411 = new BitSet(new long[]{0x000000000002C010L});
	public static final BitSet FOLLOW_ANNEE_in_joindate2437 = new BitSet(new long[]{0x0000000001A6D5B2L});
	public static final BitSet FOLLOW_MOIANNEE_in_joindate2477 = new BitSet(new long[]{0x0000000001A6D5B2L});
	public static final BitSet FOLLOW_JOURMOIANNEE_in_joindate2517 = new BitSet(new long[]{0x0000000001A6D5B2L});
	public static final BitSet FOLLOW_JOURMOI_in_joindate2557 = new BitSet(new long[]{0x0000000001A6D5B2L});
	public static final BitSet FOLLOW_ENTRE_in_joindate2597 = new BitSet(new long[]{0x0000000000010010L});
	public static final BitSet FOLLOW_ANNEE_in_joindate2621 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_CONJ_in_joindate2639 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_joindate2661 = new BitSet(new long[]{0x0000000001A6D5B2L});
	public static final BitSet FOLLOW_MOI_in_joindate2712 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_CONJ_in_joindate2716 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_MOI_in_joindate2738 = new BitSet(new long[]{0x0000000001A6D5B2L});
	public static final BitSet FOLLOW_AVANT_in_joindate2833 = new BitSet(new long[]{0x0000000000010010L});
	public static final BitSet FOLLOW_APRES_in_joindate2871 = new BitSet(new long[]{0x0000000000010010L});
	public static final BitSet FOLLOW_ANNEE_in_joindate2904 = new BitSet(new long[]{0x0000000001A6D5B2L});
	public static final BitSet FOLLOW_MOI_in_joindate2962 = new BitSet(new long[]{0x0000000001A6D5B2L});
	public static final BitSet FOLLOW_join_in_joindate3015 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BULLETIN_in_joinbulletin3099 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_INT_in_joinbulletin3113 = new BitSet(new long[]{0x0000000001A6D5B2L});
	public static final BitSet FOLLOW_join_in_joinbulletin3145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RUBRIQUE_in_joinrubrique3236 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_VAR_in_joinrubrique3250 = new BitSet(new long[]{0x0000000001A6D5B2L});
	public static final BitSet FOLLOW_join_in_joinrubrique3282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARLER_in_joinmot3350 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_CONJ_in_joinmot3352 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_TITRE_in_joinmot3354 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_VAR_in_joinmot3370 = new BitSet(new long[]{0x0000000001A6D5B2L});
	public static final BitSet FOLLOW_join_in_joinmot3402 = new BitSet(new long[]{0x0000000000000002L});
}
