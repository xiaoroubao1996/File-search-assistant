// $ANTLR 3.5.1 /volsme/users/lo17a007/Téléchargements/tal_sql.g 2018-12-20 10:43:21

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public tal_sqlLexer() {} 
	public tal_sqlLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public tal_sqlLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/volsme/users/lo17a007/Téléchargements/tal_sql.g"; }

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:3:15: ( 'vouloir' ( 'tous' )? | 'tous' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='v') ) {
				alt2=1;
			}
			else if ( (LA2_0=='t') ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:4:9: 'vouloir' ( 'tous' )?
					{
					match("vouloir"); 

					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:4:19: ( 'tous' )?
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0=='t') ) {
						alt1=1;
					}
					switch (alt1) {
						case 1 :
							// /volsme/users/lo17a007/Téléchargements/tal_sql.g:4:20: 'tous'
							{
							match("tous"); 

							}
							break;

					}

					}
					break;
				case 2 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:4:31: 'tous'
					{
					match("tous"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SELECT"

	// $ANTLR start "COMBIEN"
	public final void mCOMBIEN() throws RecognitionException {
		try {
			int _type = COMBIEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:7:16: ( 'combien' | 'quel nombre' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='c') ) {
				alt3=1;
			}
			else if ( (LA3_0=='q') ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:8:9: 'combien'
					{
					match("combien"); 

					}
					break;
				case 2 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:8:21: 'quel nombre'
					{
					match("quel nombre"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMBIEN"

	// $ANTLR start "QUI"
	public final void mQUI() throws RecognitionException {
		try {
			int _type = QUI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:11:12: ( 'qui ��crit article' | 'quel auteur ��crit article' )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='q') ) {
				int LA4_1 = input.LA(2);
				if ( (LA4_1=='u') ) {
					int LA4_2 = input.LA(3);
					if ( (LA4_2=='i') ) {
						alt4=1;
					}
					else if ( (LA4_2=='e') ) {
						alt4=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:12:9: 'qui ��crit article'
					{
					match("qui ��crit article"); 

					}
					break;
				case 2 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:12:32: 'quel auteur ��crit article'
					{
					match("quel auteur ��crit article"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUI"

	// $ANTLR start "ARTICLE"
	public final void mARTICLE() throws RecognitionException {
		try {
			int _type = ARTICLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:15:9: ( 'article' ( 's' )? | 'etude' | 'recherche' )
			int alt6=3;
			switch ( input.LA(1) ) {
			case 'a':
				{
				alt6=1;
				}
				break;
			case 'e':
				{
				alt6=2;
				}
				break;
			case 'r':
				{
				alt6=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:16:9: 'article' ( 's' )?
					{
					match("article"); 

					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:16:18: ( 's' )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='s') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// /volsme/users/lo17a007/Téléchargements/tal_sql.g:16:19: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:16:27: 'etude'
					{
					match("etude"); 

					}
					break;
				case 3 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:16:37: 'recherche'
					{
					match("recherche"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARTICLE"

	// $ANTLR start "BULLETIN"
	public final void mBULLETIN() throws RecognitionException {
		try {
			int _type = BULLETIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:19:10: ( 'bulletin' )
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:20:9: 'bulletin'
			{
			match("bulletin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BULLETIN"

	// $ANTLR start "CONJ"
	public final void mCONJ() throws RecognitionException {
		try {
			int _type = CONJ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:23:14: ( 'et' | 'ou' )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='e') ) {
				alt7=1;
			}
			else if ( (LA7_0=='o') ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:24:9: 'et'
					{
					match("et"); 

					}
					break;
				case 2 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:24:16: 'ou'
					{
					match("ou"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONJ"

	// $ANTLR start "POINT"
	public final void mPOINT() throws RecognitionException {
		try {
			int _type = POINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:27:15: ( '.' )
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:28:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POINT"

	// $ANTLR start "PARLER"
	public final void mPARLER() throws RecognitionException {
		try {
			int _type = PARLER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:32:15: ( 'publier' | 'parler' | 'concerner' | 'sur' | 'contenir' | 'font r��f��rence' | 'parus bulletins' )
			int alt8=7;
			switch ( input.LA(1) ) {
			case 'p':
				{
				int LA8_1 = input.LA(2);
				if ( (LA8_1=='u') ) {
					alt8=1;
				}
				else if ( (LA8_1=='a') ) {
					int LA8_6 = input.LA(3);
					if ( (LA8_6=='r') ) {
						int LA8_8 = input.LA(4);
						if ( (LA8_8=='l') ) {
							alt8=2;
						}
						else if ( (LA8_8=='u') ) {
							alt8=7;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 8, 8, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 8, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'c':
				{
				int LA8_2 = input.LA(2);
				if ( (LA8_2=='o') ) {
					int LA8_7 = input.LA(3);
					if ( (LA8_7=='n') ) {
						int LA8_9 = input.LA(4);
						if ( (LA8_9=='c') ) {
							alt8=3;
						}
						else if ( (LA8_9=='t') ) {
							alt8=5;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 8, 9, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 8, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 's':
				{
				alt8=4;
				}
				break;
			case 'f':
				{
				alt8=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:33:9: 'publier'
					{
					match("publier"); 

					}
					break;
				case 2 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:33:19: 'parler'
					{
					match("parler"); 

					}
					break;
				case 3 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:33:28: 'concerner'
					{
					match("concerner"); 

					}
					break;
				case 4 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:33:41: 'sur'
					{
					match("sur"); 

					}
					break;
				case 5 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:33:48: 'contenir'
					{
					match("contenir"); 

					}
					break;
				case 6 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:33:61: 'font r��f��rence'
					{
					match("font r��f��rence"); 

					}
					break;
				case 7 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:33:82: 'parus bulletins'
					{
					match("parus bulletins"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PARLER"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:36:13: ( ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' | 'd\\'' | 'l\\'' ) | '\\n' )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='\t'||LA10_0=='\r'||LA10_0==' '||LA10_0=='d'||LA10_0=='j'||LA10_0=='l'||LA10_0=='q') ) {
				alt10=1;
			}
			else if ( (LA10_0=='\n') ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:37:9: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' | 'd\\'' | 'l\\'' )
					{
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:37:9: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' | 'd\\'' | 'l\\'' )
					int alt9=8;
					switch ( input.LA(1) ) {
					case ' ':
						{
						alt9=1;
						}
						break;
					case '\t':
						{
						alt9=2;
						}
						break;
					case '\r':
						{
						alt9=3;
						}
						break;
					case 'j':
						{
						alt9=4;
						}
						break;
					case 'q':
						{
						alt9=5;
						}
						break;
					case 'd':
						{
						int LA9_6 = input.LA(2);
						if ( (LA9_6=='o') ) {
							alt9=6;
						}
						else if ( (LA9_6=='\'') ) {
							alt9=7;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 9, 6, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 'l':
						{
						alt9=8;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 9, 0, input);
						throw nvae;
					}
					switch (alt9) {
						case 1 :
							// /volsme/users/lo17a007/Téléchargements/tal_sql.g:37:10: ' '
							{
							match(' '); 
							}
							break;
						case 2 :
							// /volsme/users/lo17a007/Téléchargements/tal_sql.g:37:15: '\\t'
							{
							match('\t'); 
							}
							break;
						case 3 :
							// /volsme/users/lo17a007/Téléchargements/tal_sql.g:37:22: '\\r'
							{
							match('\r'); 
							}
							break;
						case 4 :
							// /volsme/users/lo17a007/Téléchargements/tal_sql.g:37:29: 'je'
							{
							match("je"); 

							}
							break;
						case 5 :
							// /volsme/users/lo17a007/Téléchargements/tal_sql.g:37:36: 'qui'
							{
							match("qui"); 

							}
							break;
						case 6 :
							// /volsme/users/lo17a007/Téléchargements/tal_sql.g:37:44: 'dont'
							{
							match("dont"); 

							}
							break;
						case 7 :
							// /volsme/users/lo17a007/Téléchargements/tal_sql.g:37:53: 'd\\''
							{
							match("d'"); 

							}
							break;
						case 8 :
							// /volsme/users/lo17a007/Téléchargements/tal_sql.g:37:60: 'l\\''
							{
							match("l'"); 

							}
							break;

					}

					skip();
					}
					break;
				case 2 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:37:79: '\\n'
					{
					match('\n'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "DATE"
	public final void mDATE() throws RecognitionException {
		try {
			int _type = DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:41:13: ( 'date' )
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:42:9: 'date'
			{
			match("date"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE"

	// $ANTLR start "ENTRE"
	public final void mENTRE() throws RecognitionException {
		try {
			int _type = ENTRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:45:14: ( 'entre' )
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:46:9: 'entre'
			{
			match("entre"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENTRE"

	// $ANTLR start "APRES"
	public final void mAPRES() throws RecognitionException {
		try {
			int _type = APRES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:49:14: ( 'apr��s' )
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:50:9: 'apr��s'
			{
			match("apr��s"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "APRES"

	// $ANTLR start "AVANT"
	public final void mAVANT() throws RecognitionException {
		try {
			int _type = AVANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:53:14: ( 'avant' )
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:54:9: 'avant'
			{
			match("avant"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AVANT"

	// $ANTLR start "DATANT"
	public final void mDATANT() throws RecognitionException {
		try {
			int _type = DATANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:57:13: ( 'datant' )
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:58:2: 'datant'
			{
			match("datant"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATANT"

	// $ANTLR start "JOURMOIANNEE"
	public final void mJOURMOIANNEE() throws RecognitionException {
		try {
			int _type = JOURMOIANNEE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:61:21: ( ( '0' .. '9' ) ( '0' .. '9' ) ' ' ( '0' .. '9' ) ( '0' .. '9' ) ' ' ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:62:9: ( '0' .. '9' ) ( '0' .. '9' ) ' ' ( '0' .. '9' ) ( '0' .. '9' ) ' ' ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			match(' '); 
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			match(' '); 
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JOURMOIANNEE"

	// $ANTLR start "JOURMOI"
	public final void mJOURMOI() throws RecognitionException {
		try {
			int _type = JOURMOI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:65:16: ( ( '0' .. '9' ) ( '0' .. '9' ) ' ' ( '0' .. '9' ) ( '0' .. '9' ) )
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:66:9: ( '0' .. '9' ) ( '0' .. '9' ) ' ' ( '0' .. '9' ) ( '0' .. '9' )
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			match(' '); 
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JOURMOI"

	// $ANTLR start "MOIANNEE"
	public final void mMOIANNEE() throws RecognitionException {
		try {
			int _type = MOIANNEE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:69:17: ( ( '0' .. '9' ) ( '0' .. '9' ) ' ' ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:70:9: ( '0' .. '9' ) ( '0' .. '9' ) ' ' ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			match(' '); 
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOIANNEE"

	// $ANTLR start "MOI"
	public final void mMOI() throws RecognitionException {
		try {
			int _type = MOI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:73:12: ( ( '0' .. '9' ) ( '0' .. '9' ) )
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:74:9: ( '0' .. '9' ) ( '0' .. '9' )
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOI"

	// $ANTLR start "ANNEE"
	public final void mANNEE() throws RecognitionException {
		try {
			int _type = ANNEE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:77:14: ( ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:78:9: ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ANNEE"

	// $ANTLR start "RUBRIQUE"
	public final void mRUBRIQUE() throws RecognitionException {
		try {
			int _type = RUBRIQUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:81:9: ( 'rubrique' )
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:82:9: 'rubrique'
			{
			match("rubrique"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RUBRIQUE"

	// $ANTLR start "RUBRIQUES"
	public final void mRUBRIQUES() throws RecognitionException {
		try {
			int _type = RUBRIQUES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:85:11: ( 'Horizons Formation Enseignement' | 'Actualités Innovations' | 'Actualité Innovation' | 'Actualité-Innovation' | 'A lire' | 'Focus' | 'En direct des Laboratoires' | 'Horizons Enseignement' | 'Horizon Enseignement' | 'Horizon enseignement' | 'Horizon formation' | 'Du côté des Pôles' | 'Au coeur des régions' | 'Evénement' | 'En direct des laboratoires' | 'Du côté des pôles' | 'En direct des labos' | 'Actualités Innovation' )
			int alt11=18;
			alt11 = dfa11.predict(input);
			switch (alt11) {
				case 1 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:86:1: 'Horizons Formation Enseignement'
					{
					match("Horizons Formation Enseignement"); 

					}
					break;
				case 2 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:87:3: 'Actualités Innovations'
					{
					match("Actualités Innovations"); 

					}
					break;
				case 3 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:88:3: 'Actualité Innovation'
					{
					match("Actualité Innovation"); 

					}
					break;
				case 4 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:89:3: 'Actualité-Innovation'
					{
					match("Actualité-Innovation"); 

					}
					break;
				case 5 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:90:3: 'A lire'
					{
					match("A lire"); 

					}
					break;
				case 6 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:91:3: 'Focus'
					{
					match("Focus"); 

					}
					break;
				case 7 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:92:3: 'En direct des Laboratoires'
					{
					match("En direct des Laboratoires"); 

					}
					break;
				case 8 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:93:3: 'Horizons Enseignement'
					{
					match("Horizons Enseignement"); 

					}
					break;
				case 9 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:94:3: 'Horizon Enseignement'
					{
					match("Horizon Enseignement"); 

					}
					break;
				case 10 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:95:3: 'Horizon enseignement'
					{
					match("Horizon enseignement"); 

					}
					break;
				case 11 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:96:3: 'Horizon formation'
					{
					match("Horizon formation"); 

					}
					break;
				case 12 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:97:3: 'Du côté des Pôles'
					{
					match("Du côté des Pôles"); 

					}
					break;
				case 13 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:98:3: 'Au coeur des régions'
					{
					match("Au coeur des régions"); 

					}
					break;
				case 14 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:99:3: 'Evénement'
					{
					match("Evénement"); 

					}
					break;
				case 15 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:100:3: 'En direct des laboratoires'
					{
					match("En direct des laboratoires"); 

					}
					break;
				case 16 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:101:3: 'Du côté des pôles'
					{
					match("Du côté des pôles"); 

					}
					break;
				case 17 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:102:3: 'En direct des labos'
					{
					match("En direct des labos"); 

					}
					break;
				case 18 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:103:3: 'Actualités Innovation'
					{
					match("Actualités Innovation"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RUBRIQUES"

	// $ANTLR start "TITRE"
	public final void mTITRE() throws RecognitionException {
		try {
			int _type = TITRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:106:7: ( 'titre' )
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:107:2: 'titre'
			{
			match("titre"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TITRE"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:109:12: ( ( '0' .. '9' )+ )
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:110:9: ( '0' .. '9' )+
			{
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:110:9: ( '0' .. '9' )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:113:13: ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00a0' .. '\\u00ff' ) ( ( 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+ )
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:114:9: ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00a0' .. '\\u00ff' ) ( ( 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00A0' && input.LA(1) <= '\u00FF') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /volsme/users/lo17a007/Téléchargements/tal_sql.g:114:49: ( ( 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0=='-'||(LA13_0 >= '0' && LA13_0 <= '9')||(LA13_0 >= 'a' && LA13_0 <= 'z')||(LA13_0 >= '\u00A0' && LA13_0 <= '\u00FF')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// /volsme/users/lo17a007/Téléchargements/tal_sql.g:
					{
					if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00A0' && input.LA(1) <= '\u00FF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	@Override
	public void mTokens() throws RecognitionException {
		// /volsme/users/lo17a007/Téléchargements/tal_sql.g:1:8: ( SELECT | COMBIEN | QUI | ARTICLE | BULLETIN | CONJ | POINT | PARLER | WS | DATE | ENTRE | APRES | AVANT | DATANT | JOURMOIANNEE | JOURMOI | MOIANNEE | MOI | ANNEE | RUBRIQUE | RUBRIQUES | TITRE | INT | VAR )
		int alt14=24;
		alt14 = dfa14.predict(input);
		switch (alt14) {
			case 1 :
				// /volsme/users/lo17a007/Téléchargements/tal_sql.g:1:10: SELECT
				{
				mSELECT(); 

				}
				break;
			case 2 :
				// /volsme/users/lo17a007/Téléchargements/tal_sql.g:1:17: COMBIEN
				{
				mCOMBIEN(); 

				}
				break;
			case 3 :
				// /volsme/users/lo17a007/Téléchargements/tal_sql.g:1:25: QUI
				{
				mQUI(); 

				}
				break;
			case 4 :
				// /volsme/users/lo17a007/Téléchargements/tal_sql.g:1:29: ARTICLE
				{
				mARTICLE(); 

				}
				break;
			case 5 :
				// /volsme/users/lo17a007/Téléchargements/tal_sql.g:1:37: BULLETIN
				{
				mBULLETIN(); 

				}
				break;
			case 6 :
				// /volsme/users/lo17a007/Téléchargements/tal_sql.g:1:46: CONJ
				{
				mCONJ(); 

				}
				break;
			case 7 :
				// /volsme/users/lo17a007/Téléchargements/tal_sql.g:1:51: POINT
				{
				mPOINT(); 

				}
				break;
			case 8 :
				// /volsme/users/lo17a007/Téléchargements/tal_sql.g:1:57: PARLER
				{
				mPARLER(); 

				}
				break;
			case 9 :
				// /volsme/users/lo17a007/Téléchargements/tal_sql.g:1:64: WS
				{
				mWS(); 

				}
				break;
			case 10 :
				// /volsme/users/lo17a007/Téléchargements/tal_sql.g:1:67: DATE
				{
				mDATE(); 

				}
				break;
			case 11 :
				// /volsme/users/lo17a007/Téléchargements/tal_sql.g:1:72: ENTRE
				{
				mENTRE(); 

				}
				break;
			case 12 :
				// /volsme/users/lo17a007/Téléchargements/tal_sql.g:1:78: APRES
				{
				mAPRES(); 

				}
				break;
			case 13 :
				// /volsme/users/lo17a007/Téléchargements/tal_sql.g:1:84: AVANT
				{
				mAVANT(); 

				}
				break;
			case 14 :
				// /volsme/users/lo17a007/Téléchargements/tal_sql.g:1:90: DATANT
				{
				mDATANT(); 

				}
				break;
			case 15 :
				// /volsme/users/lo17a007/Téléchargements/tal_sql.g:1:97: JOURMOIANNEE
				{
				mJOURMOIANNEE(); 

				}
				break;
			case 16 :
				// /volsme/users/lo17a007/Téléchargements/tal_sql.g:1:110: JOURMOI
				{
				mJOURMOI(); 

				}
				break;
			case 17 :
				// /volsme/users/lo17a007/Téléchargements/tal_sql.g:1:118: MOIANNEE
				{
				mMOIANNEE(); 

				}
				break;
			case 18 :
				// /volsme/users/lo17a007/Téléchargements/tal_sql.g:1:127: MOI
				{
				mMOI(); 

				}
				break;
			case 19 :
				// /volsme/users/lo17a007/Téléchargements/tal_sql.g:1:131: ANNEE
				{
				mANNEE(); 

				}
				break;
			case 20 :
				// /volsme/users/lo17a007/Téléchargements/tal_sql.g:1:137: RUBRIQUE
				{
				mRUBRIQUE(); 

				}
				break;
			case 21 :
				// /volsme/users/lo17a007/Téléchargements/tal_sql.g:1:146: RUBRIQUES
				{
				mRUBRIQUES(); 

				}
				break;
			case 22 :
				// /volsme/users/lo17a007/Téléchargements/tal_sql.g:1:156: TITRE
				{
				mTITRE(); 

				}
				break;
			case 23 :
				// /volsme/users/lo17a007/Téléchargements/tal_sql.g:1:162: INT
				{
				mINT(); 

				}
				break;
			case 24 :
				// /volsme/users/lo17a007/Téléchargements/tal_sql.g:1:166: VAR
				{
				mVAR(); 

				}
				break;

		}
	}


	protected DFA11 dfa11 = new DFA11(this);
	protected DFA14 dfa14 = new DFA14(this);
	static final String DFA11_eotS =
		"\115\uffff\1\117\2\uffff";
	static final String DFA11_eofS =
		"\120\uffff";
	static final String DFA11_minS =
		"\1\101\1\157\1\40\1\uffff\1\156\1\165\1\162\1\164\2\uffff\1\40\1\uffff"+
		"\1\40\1\151\1\165\1\144\1\143\1\172\1\141\1\151\1\u00f4\1\157\1\154\1"+
		"\162\1\164\1\156\1\151\1\145\1\u00e9\1\40\1\164\1\143\2\40\1\105\1\u00e9"+
		"\1\164\1\144\1\105\3\uffff\2\40\1\145\2\uffff\1\40\2\uffff\1\144\1\163"+
		"\1\111\1\145\1\40\1\156\1\163\1\120\1\156\1\40\2\uffff\1\157\1\114\1\166"+
		"\1\uffff\2\141\1\142\1\164\1\157\1\151\1\162\1\157\2\uffff\1\156\1\163"+
		"\2\uffff";
	static final String DFA11_maxS =
		"\1\110\1\157\1\165\1\uffff\1\166\1\165\1\162\1\164\2\uffff\1\40\1\uffff"+
		"\1\40\1\151\1\165\1\144\1\143\1\172\1\141\1\151\1\u00f4\1\157\1\154\1"+
		"\162\1\164\1\156\1\151\1\145\1\u00e9\1\163\1\164\1\143\2\40\1\146\1\u00e9"+
		"\1\164\1\144\1\106\3\uffff\1\163\1\40\1\145\2\uffff\1\40\2\uffff\1\144"+
		"\1\163\1\111\1\145\1\40\1\156\1\163\1\160\1\156\1\40\2\uffff\1\157\1\154"+
		"\1\166\1\uffff\2\141\1\142\1\164\1\157\1\151\1\163\1\157\2\uffff\1\156"+
		"\1\163\2\uffff";
	static final String DFA11_acceptS =
		"\3\uffff\1\6\4\uffff\1\5\1\15\1\uffff\1\16\33\uffff\1\11\1\12\1\13\3\uffff"+
		"\1\1\1\10\1\uffff\1\3\1\4\12\uffff\1\14\1\20\3\uffff\1\7\10\uffff\1\17"+
		"\1\21\2\uffff\1\2\1\22";
	static final String DFA11_specialS =
		"\120\uffff}>";
	static final String[] DFA11_transitionS = {
			"\1\2\2\uffff\1\5\1\4\1\3\1\uffff\1\1",
			"\1\6",
			"\1\10\102\uffff\1\7\21\uffff\1\11",
			"",
			"\1\12\7\uffff\1\13",
			"\1\14",
			"\1\15",
			"\1\16",
			"",
			"",
			"\1\17",
			"",
			"\1\20",
			"\1\21",
			"\1\22",
			"\1\23",
			"\1\24",
			"\1\25",
			"\1\26",
			"\1\27",
			"\1\30",
			"\1\31",
			"\1\32",
			"\1\33",
			"\1\34",
			"\1\35",
			"\1\36",
			"\1\37",
			"\1\40",
			"\1\42\122\uffff\1\41",
			"\1\43",
			"\1\44",
			"\1\45",
			"\1\46",
			"\1\47\37\uffff\1\50\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\56\1\55",
			"",
			"",
			"",
			"\1\60\14\uffff\1\61\105\uffff\1\57",
			"\1\62",
			"\1\63",
			"",
			"",
			"\1\64",
			"",
			"",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74\37\uffff\1\75",
			"\1\76",
			"\1\77",
			"",
			"",
			"\1\100",
			"\1\101\37\uffff\1\102",
			"\1\103",
			"",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112\1\113",
			"\1\114",
			"",
			"",
			"\1\115",
			"\1\116",
			"",
			""
	};

	static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
	static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
	static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
	static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
	static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
	static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
	static final short[][] DFA11_transition;

	static {
		int numStates = DFA11_transitionS.length;
		DFA11_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
		}
	}

	protected class DFA11 extends DFA {

		public DFA11(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 11;
			this.eot = DFA11_eot;
			this.eof = DFA11_eof;
			this.min = DFA11_min;
			this.max = DFA11_max;
			this.accept = DFA11_accept;
			this.special = DFA11_special;
			this.transition = DFA11_transition;
		}
		@Override
		public String getDescription() {
			return "85:1: RUBRIQUES : ( 'Horizons Formation Enseignement' | 'Actualités Innovations' | 'Actualité Innovation' | 'Actualité-Innovation' | 'A lire' | 'Focus' | 'En direct des Laboratoires' | 'Horizons Enseignement' | 'Horizon Enseignement' | 'Horizon enseignement' | 'Horizon formation' | 'Du côté des Pôles' | 'Au coeur des régions' | 'Evénement' | 'En direct des laboratoires' | 'Du côté des pôles' | 'En direct des labos' | 'Actualités Innovation' );";
		}
	}

	static final String DFA14_eotS =
		"\22\uffff\1\57\6\uffff\10\30\1\103\4\30\1\103\4\30\1\16\2\30\1\120\1\uffff"+
		"\2\30\1\uffff\13\30\1\16\4\30\1\uffff\6\30\1\150\3\30\1\uffff\1\57\1\uffff"+
		"\5\30\1\164\5\30\1\uffff\1\30\1\uffff\11\30\1\uffff\1\30\1\16\1\u0084"+
		"\1\30\1\uffff\1\u0087\5\30\1\uffff\1\u008d\3\30\1\uffff\1\30\1\u0093\1"+
		"\u0094\1\u0095\6\30\1\uffff\1\30\1\u009e\1\uffff\2\30\1\62\2\30\1\uffff"+
		"\3\30\1\uffff\1\30\3\uffff\4\30\1\150\1\u00ab\3\uffff\3\30\1\164\1\u0091"+
		"\2\30\1\u0094\3\30\1\150\1\uffff\5\30\1\150\1\u0094\1\30\1\u00bc\1\u00bd"+
		"\4\30\1\150\1\u0094\2\uffff\1\30\1\62\3\30\1\164";
	static final String DFA14_eofS =
		"\u00c4\uffff";
	static final String DFA14_minS =
		"\1\11\11\55\1\uffff\3\55\1\uffff\1\55\2\47\1\60\1\55\1\40\3\55\1\uffff"+
		"\2\165\1\164\1\155\1\145\1\164\1\162\1\141\1\55\1\164\1\143\1\142\1\154"+
		"\1\55\1\142\2\162\1\156\1\55\1\156\1\164\1\40\1\uffff\1\162\1\164\1\uffff"+
		"\1\40\1\143\1\40\1\u00e9\1\40\1\154\1\163\1\162\1\142\1\143\1\154\1\40"+
		"\1\151\1\ufffd\1\156\1\144\1\uffff\1\162\1\150\1\162\3\154\1\55\2\164"+
		"\1\141\2\60\1\uffff\1\151\2\165\1\156\1\157\1\55\1\145\1\151\2\145\1\40"+
		"\1\uffff\1\143\1\uffff\1\164\3\145\1\151\1\145\1\151\1\145\1\163\1\uffff"+
		"\1\40\2\55\1\156\2\60\1\172\1\141\1\163\1\145\1\151\1\uffff\1\55\1\145"+
		"\1\162\1\156\1\141\1\154\3\55\1\162\1\161\1\164\1\145\1\162\1\40\1\uffff"+
		"\1\164\1\40\1\uffff\1\157\1\154\1\55\1\155\1\162\1\uffff\2\156\1\151\1"+
		"\uffff\1\145\3\uffff\1\143\1\165\1\151\1\162\2\55\3\uffff\1\156\1\151"+
		"\1\145\2\55\1\145\1\162\1\55\1\150\1\145\1\156\1\55\1\uffff\1\40\1\164"+
		"\1\156\1\157\1\162\2\55\1\145\2\55\1\40\1\u00e9\1\164\1\165\2\55\2\uffff"+
		"\1\40\1\55\1\163\1\40\1\111\1\55";
	static final String DFA14_maxS =
		"\12\u00ff\1\uffff\3\u00ff\1\uffff\3\u00ff\1\71\5\u00ff\1\uffff\2\165\1"+
		"\164\1\156\1\151\1\164\1\162\1\141\1\u00ff\1\164\1\143\1\142\1\154\1\u00ff"+
		"\1\142\2\162\1\156\1\u00ff\1\156\1\164\1\71\1\uffff\1\162\1\164\1\uffff"+
		"\1\40\1\143\1\40\1\u00e9\1\40\1\154\1\163\1\162\1\142\1\164\1\154\1\u00ff"+
		"\1\151\1\ufffd\1\156\1\144\1\uffff\1\162\1\150\1\162\2\154\1\165\1\u00ff"+
		"\2\164\1\145\2\71\1\uffff\1\151\2\165\1\156\1\157\1\u00ff\1\145\1\151"+
		"\2\145\1\40\1\uffff\1\143\1\uffff\1\164\3\145\1\151\1\145\1\151\1\145"+
		"\1\163\1\uffff\1\40\2\u00ff\1\156\2\71\1\172\1\141\1\163\1\145\1\151\1"+
		"\uffff\1\u00ff\1\145\1\162\2\156\1\154\3\u00ff\1\162\1\161\1\164\1\145"+
		"\1\162\1\40\1\uffff\1\164\1\71\1\uffff\1\157\1\154\1\u00ff\1\155\1\162"+
		"\1\uffff\2\156\1\151\1\uffff\1\145\3\uffff\1\143\1\165\1\151\1\162\2\u00ff"+
		"\3\uffff\1\156\1\151\1\145\2\u00ff\1\145\1\162\1\u00ff\1\150\1\145\1\156"+
		"\1\u00ff\1\uffff\1\163\1\164\1\156\1\157\1\162\2\u00ff\1\145\2\u00ff\1"+
		"\40\1\u00e9\1\164\1\165\2\u00ff\2\uffff\1\163\1\u00ff\1\163\1\40\1\111"+
		"\1\u00ff";
	static final String DFA14_acceptS =
		"\12\uffff\1\7\3\uffff\1\11\11\uffff\1\30\26\uffff\1\27\2\uffff\1\25\20"+
		"\uffff\1\6\14\uffff\1\22\13\uffff\1\3\1\uffff\1\14\11\uffff\1\10\13\uffff"+
		"\1\1\17\uffff\1\12\2\uffff\1\23\5\uffff\1\26\3\uffff\1\2\1\uffff\1\15"+
		"\1\4\1\13\6\uffff\1\17\1\21\1\20\14\uffff\1\16\20\uffff\1\24\1\5\6\uffff";
	static final String DFA14_specialS =
		"\u00c4\uffff}>";
	static final String[] DFA14_transitionS = {
			"\2\16\2\uffff\1\16\22\uffff\1\16\15\uffff\1\12\1\uffff\12\22\7\uffff"+
			"\1\24\2\30\1\27\1\26\1\25\1\30\1\23\22\30\6\uffff\1\5\1\10\1\3\1\20\1"+
			"\6\1\15\3\30\1\17\1\30\1\21\2\30\1\11\1\13\1\4\1\7\1\14\1\2\1\30\1\1"+
			"\4\30\45\uffff\140\30",
			"\1\30\2\uffff\12\30\47\uffff\16\30\1\31\13\30\45\uffff\140\30",
			"\1\30\2\uffff\12\30\47\uffff\10\30\1\33\5\30\1\32\13\30\45\uffff\140"+
			"\30",
			"\1\30\2\uffff\12\30\47\uffff\16\30\1\34\13\30\45\uffff\140\30",
			"\1\30\2\uffff\12\30\47\uffff\24\30\1\35\5\30\45\uffff\140\30",
			"\1\30\2\uffff\12\30\47\uffff\17\30\1\37\1\30\1\36\3\30\1\40\4\30\45"+
			"\uffff\140\30",
			"\1\30\2\uffff\12\30\47\uffff\15\30\1\42\5\30\1\41\6\30\45\uffff\140"+
			"\30",
			"\1\30\2\uffff\12\30\47\uffff\4\30\1\43\17\30\1\44\5\30\45\uffff\140"+
			"\30",
			"\1\30\2\uffff\12\30\47\uffff\24\30\1\45\5\30\45\uffff\140\30",
			"\1\30\2\uffff\12\30\47\uffff\24\30\1\46\5\30\45\uffff\140\30",
			"",
			"\1\30\2\uffff\12\30\47\uffff\1\50\23\30\1\47\5\30\45\uffff\140\30",
			"\1\30\2\uffff\12\30\47\uffff\24\30\1\51\5\30\45\uffff\140\30",
			"\1\30\2\uffff\12\30\47\uffff\16\30\1\52\13\30\45\uffff\140\30",
			"",
			"\1\30\2\uffff\12\30\47\uffff\4\30\1\53\25\30\45\uffff\140\30",
			"\1\16\5\uffff\1\30\2\uffff\12\30\47\uffff\1\55\15\30\1\54\13\30\45\uffff"+
			"\140\30",
			"\1\16\5\uffff\1\30\2\uffff\12\30\47\uffff\32\30\45\uffff\140\30",
			"\12\56",
			"\1\30\2\uffff\12\30\47\uffff\16\30\1\60\13\30\45\uffff\140\30",
			"\1\62\14\uffff\1\30\2\uffff\12\30\47\uffff\2\30\1\61\21\30\1\63\5\30"+
			"\45\uffff\140\30",
			"\1\30\2\uffff\12\30\47\uffff\16\30\1\64\13\30\45\uffff\140\30",
			"\1\30\2\uffff\12\30\47\uffff\15\30\1\65\7\30\1\66\4\30\45\uffff\140"+
			"\30",
			"\1\30\2\uffff\12\30\47\uffff\24\30\1\67\5\30\45\uffff\140\30",
			"",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73\1\74",
			"\1\75\3\uffff\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\30\2\uffff\12\30\47\uffff\24\30\1\102\5\30\45\uffff\140\30",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\30\2\uffff\12\30\47\uffff\32\30\45\uffff\140\30",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\30\2\uffff\12\30\47\uffff\32\30\45\uffff\140\30",
			"\1\114",
			"\1\115",
			"\1\116\17\uffff\12\117",
			"",
			"\1\121",
			"\1\122",
			"",
			"\1\62",
			"\1\123",
			"\1\62",
			"\1\124",
			"\1\62",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131\20\uffff\1\132",
			"\1\133",
			"\1\134\14\uffff\1\30\2\uffff\12\30\47\uffff\32\30\45\uffff\140\30",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146\10\uffff\1\147",
			"\1\30\2\uffff\12\30\47\uffff\32\30\45\uffff\140\30",
			"\1\151",
			"\1\152",
			"\1\154\3\uffff\1\153",
			"\12\155",
			"\12\156",
			"",
			"\1\157",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\30\2\uffff\12\30\47\uffff\32\30\45\uffff\140\30",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\170",
			"\1\171",
			"",
			"\1\172",
			"",
			"\1\173",
			"\1\174",
			"\1\175",
			"\1\176",
			"\1\177",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"",
			"\1\150",
			"\1\30\2\uffff\12\30\47\uffff\32\30\45\uffff\140\30",
			"\1\30\2\uffff\12\30\47\uffff\32\30\45\uffff\140\30",
			"\1\u0085",
			"\12\u0086",
			"\12\57",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a",
			"\1\u008b",
			"\1\u008c",
			"",
			"\1\30\2\uffff\12\30\47\uffff\32\30\45\uffff\140\30",
			"\1\u008e",
			"\1\u008f",
			"\1\u0090",
			"\1\134\14\uffff\1\u0091",
			"\1\u0092",
			"\1\30\2\uffff\12\30\47\uffff\32\30\45\uffff\140\30",
			"\1\30\2\uffff\12\30\47\uffff\32\30\45\uffff\140\30",
			"\1\30\2\uffff\12\30\47\uffff\32\30\45\uffff\140\30",
			"\1\u0096",
			"\1\u0097",
			"\1\u0098",
			"\1\u0099",
			"\1\u009a",
			"\1\150",
			"",
			"\1\u009b",
			"\1\u009c\17\uffff\12\u009d",
			"",
			"\1\u009f",
			"\1\u00a0",
			"\1\30\2\uffff\12\30\47\uffff\32\30\45\uffff\140\30",
			"\1\u00a1",
			"\1\u00a2",
			"",
			"\1\u00a3",
			"\1\u00a4",
			"\1\u00a5",
			"",
			"\1\u00a6",
			"",
			"",
			"",
			"\1\u00a7",
			"\1\u00a8",
			"\1\u00a9",
			"\1\u00aa",
			"\1\30\2\uffff\12\30\47\uffff\32\30\45\uffff\140\30",
			"\1\30\2\uffff\12\30\47\uffff\32\30\45\uffff\140\30",
			"",
			"",
			"",
			"\1\u00ac",
			"\1\u00ad",
			"\1\u00ae",
			"\1\30\2\uffff\12\30\47\uffff\23\30\1\u00af\6\30\45\uffff\140\30",
			"\1\30\2\uffff\12\30\47\uffff\32\30\45\uffff\140\30",
			"\1\u00b0",
			"\1\u00b1",
			"\1\30\2\uffff\12\30\47\uffff\22\30\1\u00b2\7\30\45\uffff\140\30",
			"\1\u00b3",
			"\1\u00b4",
			"\1\u00b5",
			"\1\30\2\uffff\12\30\47\uffff\32\30\45\uffff\140\30",
			"",
			"\1\62\122\uffff\1\u00b6",
			"\1\u00b7",
			"\1\u00b8",
			"\1\u00b9",
			"\1\u00ba",
			"\1\30\2\uffff\12\30\47\uffff\32\30\45\uffff\140\30",
			"\1\30\2\uffff\12\30\47\uffff\32\30\45\uffff\140\30",
			"\1\u00bb",
			"\1\30\2\uffff\12\30\47\uffff\32\30\45\uffff\140\30",
			"\1\30\2\uffff\12\30\47\uffff\32\30\45\uffff\140\30",
			"\1\62",
			"\1\u00be",
			"\1\u00bf",
			"\1\u00c0",
			"\1\30\2\uffff\12\30\47\uffff\32\30\45\uffff\140\30",
			"\1\30\2\uffff\12\30\47\uffff\32\30\45\uffff\140\30",
			"",
			"",
			"\1\62\14\uffff\1\u00c2\105\uffff\1\u00c1",
			"\1\30\2\uffff\12\30\47\uffff\32\30\45\uffff\140\30",
			"\1\u00c3",
			"\1\62",
			"\1\62",
			"\1\30\2\uffff\12\30\47\uffff\32\30\45\uffff\140\30"
	};

	static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
	static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
	static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
	static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
	static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
	static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
	static final short[][] DFA14_transition;

	static {
		int numStates = DFA14_transitionS.length;
		DFA14_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
		}
	}

	protected class DFA14 extends DFA {

		public DFA14(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 14;
			this.eot = DFA14_eot;
			this.eof = DFA14_eof;
			this.min = DFA14_min;
			this.max = DFA14_max;
			this.accept = DFA14_accept;
			this.special = DFA14_special;
			this.transition = DFA14_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( SELECT | COMBIEN | QUI | ARTICLE | BULLETIN | CONJ | POINT | PARLER | WS | DATE | ENTRE | APRES | AVANT | DATANT | JOURMOIANNEE | JOURMOI | MOIANNEE | MOI | ANNEE | RUBRIQUE | RUBRIQUES | TITRE | INT | VAR );";
		}
	}

}
