// $ANTLR 3.x /home/donghao/LO17/TD7/tal_sql.g 2018-12-11 21:51:08

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
	@Override public String getGrammarFileName() { return "/home/donghao/LO17/TD7/tal_sql.g"; }

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/donghao/LO17/TD7/tal_sql.g:3:15: ( 'vouloir' ( 'tous' )? | 'tous' )
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
					// /home/donghao/LO17/TD7/tal_sql.g:4:9: 'vouloir' ( 'tous' )?
					{
					match("vouloir"); 

					// /home/donghao/LO17/TD7/tal_sql.g:4:19: ( 'tous' )?
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0=='t') ) {
						alt1=1;
					}
					switch (alt1) {
						case 1 :
							// /home/donghao/LO17/TD7/tal_sql.g:4:20: 'tous'
							{
							match("tous"); 

							}
							break;

					}

					}
					break;
				case 2 :
					// /home/donghao/LO17/TD7/tal_sql.g:4:31: 'tous'
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
			// /home/donghao/LO17/TD7/tal_sql.g:7:16: ( 'combien' | 'quel nombre' )
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
					// /home/donghao/LO17/TD7/tal_sql.g:8:9: 'combien'
					{
					match("combien"); 

					}
					break;
				case 2 :
					// /home/donghao/LO17/TD7/tal_sql.g:8:21: 'quel nombre'
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
			// /home/donghao/LO17/TD7/tal_sql.g:11:12: ( 'qui écrit article' | 'quel auteur écrit article' )
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
					// /home/donghao/LO17/TD7/tal_sql.g:12:9: 'qui écrit article'
					{
					match("qui écrit article"); 

					}
					break;
				case 2 :
					// /home/donghao/LO17/TD7/tal_sql.g:12:31: 'quel auteur écrit article'
					{
					match("quel auteur écrit article"); 

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
			// /home/donghao/LO17/TD7/tal_sql.g:15:9: ( 'article' ( 's' )? | 'etude' | 'recherche' )
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
					// /home/donghao/LO17/TD7/tal_sql.g:16:9: 'article' ( 's' )?
					{
					match("article"); 

					// /home/donghao/LO17/TD7/tal_sql.g:16:18: ( 's' )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='s') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// /home/donghao/LO17/TD7/tal_sql.g:16:19: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// /home/donghao/LO17/TD7/tal_sql.g:16:27: 'etude'
					{
					match("etude"); 

					}
					break;
				case 3 :
					// /home/donghao/LO17/TD7/tal_sql.g:16:37: 'recherche'
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
			// /home/donghao/LO17/TD7/tal_sql.g:19:10: ( 'bulletin' )
			// /home/donghao/LO17/TD7/tal_sql.g:20:9: 'bulletin'
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
			// /home/donghao/LO17/TD7/tal_sql.g:23:14: ( 'et' | 'ou' )
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
					// /home/donghao/LO17/TD7/tal_sql.g:24:9: 'et'
					{
					match("et"); 

					}
					break;
				case 2 :
					// /home/donghao/LO17/TD7/tal_sql.g:24:16: 'ou'
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
			// /home/donghao/LO17/TD7/tal_sql.g:27:15: ( '.' )
			// /home/donghao/LO17/TD7/tal_sql.g:28:9: '.'
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
			// /home/donghao/LO17/TD7/tal_sql.g:32:15: ( 'publier' | 'parler' | 'concerner' | 'sur' | 'contenir' | 'datant' | 'font référence' | 'parus bulletins' )
			int alt8=8;
			switch ( input.LA(1) ) {
			case 'p':
				{
				int LA8_1 = input.LA(2);
				if ( (LA8_1=='u') ) {
					alt8=1;
				}
				else if ( (LA8_1=='a') ) {
					int LA8_7 = input.LA(3);
					if ( (LA8_7=='r') ) {
						int LA8_9 = input.LA(4);
						if ( (LA8_9=='l') ) {
							alt8=2;
						}
						else if ( (LA8_9=='u') ) {
							alt8=8;
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
					int LA8_8 = input.LA(3);
					if ( (LA8_8=='n') ) {
						int LA8_10 = input.LA(4);
						if ( (LA8_10=='c') ) {
							alt8=3;
						}
						else if ( (LA8_10=='t') ) {
							alt8=5;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 8, 10, input);
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
			case 'd':
				{
				alt8=6;
				}
				break;
			case 'f':
				{
				alt8=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// /home/donghao/LO17/TD7/tal_sql.g:33:9: 'publier'
					{
					match("publier"); 

					}
					break;
				case 2 :
					// /home/donghao/LO17/TD7/tal_sql.g:33:19: 'parler'
					{
					match("parler"); 

					}
					break;
				case 3 :
					// /home/donghao/LO17/TD7/tal_sql.g:33:28: 'concerner'
					{
					match("concerner"); 

					}
					break;
				case 4 :
					// /home/donghao/LO17/TD7/tal_sql.g:33:41: 'sur'
					{
					match("sur"); 

					}
					break;
				case 5 :
					// /home/donghao/LO17/TD7/tal_sql.g:33:48: 'contenir'
					{
					match("contenir"); 

					}
					break;
				case 6 :
					// /home/donghao/LO17/TD7/tal_sql.g:33:61: 'datant'
					{
					match("datant"); 

					}
					break;
				case 7 :
					// /home/donghao/LO17/TD7/tal_sql.g:33:72: 'font référence'
					{
					match("font référence"); 

					}
					break;
				case 8 :
					// /home/donghao/LO17/TD7/tal_sql.g:33:91: 'parus bulletins'
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
			// /home/donghao/LO17/TD7/tal_sql.g:36:13: ( ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' | 'd\\'' | 'l\\'' ) | '\\n' )
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
					// /home/donghao/LO17/TD7/tal_sql.g:37:9: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' | 'd\\'' | 'l\\'' )
					{
					// /home/donghao/LO17/TD7/tal_sql.g:37:9: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' | 'd\\'' | 'l\\'' )
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
							// /home/donghao/LO17/TD7/tal_sql.g:37:10: ' '
							{
							match(' '); 
							}
							break;
						case 2 :
							// /home/donghao/LO17/TD7/tal_sql.g:37:15: '\\t'
							{
							match('\t'); 
							}
							break;
						case 3 :
							// /home/donghao/LO17/TD7/tal_sql.g:37:22: '\\r'
							{
							match('\r'); 
							}
							break;
						case 4 :
							// /home/donghao/LO17/TD7/tal_sql.g:37:29: 'je'
							{
							match("je"); 

							}
							break;
						case 5 :
							// /home/donghao/LO17/TD7/tal_sql.g:37:36: 'qui'
							{
							match("qui"); 

							}
							break;
						case 6 :
							// /home/donghao/LO17/TD7/tal_sql.g:37:44: 'dont'
							{
							match("dont"); 

							}
							break;
						case 7 :
							// /home/donghao/LO17/TD7/tal_sql.g:37:53: 'd\\''
							{
							match("d'"); 

							}
							break;
						case 8 :
							// /home/donghao/LO17/TD7/tal_sql.g:37:60: 'l\\''
							{
							match("l'"); 

							}
							break;

					}

					skip();
					}
					break;
				case 2 :
					// /home/donghao/LO17/TD7/tal_sql.g:37:79: '\\n'
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
			// /home/donghao/LO17/TD7/tal_sql.g:41:13: ( 'date' )
			// /home/donghao/LO17/TD7/tal_sql.g:42:9: 'date'
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
			// /home/donghao/LO17/TD7/tal_sql.g:45:14: ( 'entre' )
			// /home/donghao/LO17/TD7/tal_sql.g:46:9: 'entre'
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
			// /home/donghao/LO17/TD7/tal_sql.g:49:14: ( 'après' )
			// /home/donghao/LO17/TD7/tal_sql.g:50:9: 'après'
			{
			match("après"); 

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
			// /home/donghao/LO17/TD7/tal_sql.g:53:14: ( 'avant' )
			// /home/donghao/LO17/TD7/tal_sql.g:54:9: 'avant'
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

	// $ANTLR start "JOURMOIANNEE"
	public final void mJOURMOIANNEE() throws RecognitionException {
		try {
			int _type = JOURMOIANNEE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/donghao/LO17/TD7/tal_sql.g:57:21: ( ( '0' .. '9' ) ( '0' .. '9' ) ' ' ( '0' .. '9' ) ( '0' .. '9' ) ' ' ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
			// /home/donghao/LO17/TD7/tal_sql.g:58:9: ( '0' .. '9' ) ( '0' .. '9' ) ' ' ( '0' .. '9' ) ( '0' .. '9' ) ' ' ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )
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
			// /home/donghao/LO17/TD7/tal_sql.g:61:16: ( ( '0' .. '9' ) ( '0' .. '9' ) ' ' ( '0' .. '9' ) ( '0' .. '9' ) )
			// /home/donghao/LO17/TD7/tal_sql.g:62:9: ( '0' .. '9' ) ( '0' .. '9' ) ' ' ( '0' .. '9' ) ( '0' .. '9' )
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
			// /home/donghao/LO17/TD7/tal_sql.g:65:17: ( ( '0' .. '9' ) ( '0' .. '9' ) ' ' ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
			// /home/donghao/LO17/TD7/tal_sql.g:66:9: ( '0' .. '9' ) ( '0' .. '9' ) ' ' ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )
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
			// /home/donghao/LO17/TD7/tal_sql.g:69:12: ( ( '0' .. '9' ) ( '0' .. '9' ) )
			// /home/donghao/LO17/TD7/tal_sql.g:70:9: ( '0' .. '9' ) ( '0' .. '9' )
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
			// /home/donghao/LO17/TD7/tal_sql.g:73:14: ( ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
			// /home/donghao/LO17/TD7/tal_sql.g:74:9: ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )
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
			// /home/donghao/LO17/TD7/tal_sql.g:77:9: ( 'rubrique' )
			// /home/donghao/LO17/TD7/tal_sql.g:78:9: 'rubrique'
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

	// $ANTLR start "TITRE"
	public final void mTITRE() throws RecognitionException {
		try {
			int _type = TITRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/donghao/LO17/TD7/tal_sql.g:80:7: ( 'titre' )
			// /home/donghao/LO17/TD7/tal_sql.g:81:2: 'titre'
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
			// /home/donghao/LO17/TD7/tal_sql.g:83:12: ( ( '0' .. '9' )+ )
			// /home/donghao/LO17/TD7/tal_sql.g:84:9: ( '0' .. '9' )+
			{
			// /home/donghao/LO17/TD7/tal_sql.g:84:9: ( '0' .. '9' )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// /home/donghao/LO17/TD7/tal_sql.g:
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
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
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
			// /home/donghao/LO17/TD7/tal_sql.g:87:13: ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00a0' .. '\\u00ff' ) ( ( 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+ )
			// /home/donghao/LO17/TD7/tal_sql.g:88:9: ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00a0' .. '\\u00ff' ) ( ( 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00A0' && input.LA(1) <= '\u00FF') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/donghao/LO17/TD7/tal_sql.g:88:49: ( ( 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0=='-'||(LA12_0 >= '0' && LA12_0 <= '9')||(LA12_0 >= 'a' && LA12_0 <= 'z')||(LA12_0 >= '\u00A0' && LA12_0 <= '\u00FF')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// /home/donghao/LO17/TD7/tal_sql.g:
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
	// $ANTLR end "VAR"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/donghao/LO17/TD7/tal_sql.g:1:8: ( SELECT | COMBIEN | QUI | ARTICLE | BULLETIN | CONJ | POINT | PARLER | WS | DATE | ENTRE | APRES | AVANT | JOURMOIANNEE | JOURMOI | MOIANNEE | MOI | ANNEE | RUBRIQUE | TITRE | INT | VAR )
		int alt13=22;
		alt13 = dfa13.predict(input);
		switch (alt13) {
			case 1 :
				// /home/donghao/LO17/TD7/tal_sql.g:1:10: SELECT
				{
				mSELECT(); 

				}
				break;
			case 2 :
				// /home/donghao/LO17/TD7/tal_sql.g:1:17: COMBIEN
				{
				mCOMBIEN(); 

				}
				break;
			case 3 :
				// /home/donghao/LO17/TD7/tal_sql.g:1:25: QUI
				{
				mQUI(); 

				}
				break;
			case 4 :
				// /home/donghao/LO17/TD7/tal_sql.g:1:29: ARTICLE
				{
				mARTICLE(); 

				}
				break;
			case 5 :
				// /home/donghao/LO17/TD7/tal_sql.g:1:37: BULLETIN
				{
				mBULLETIN(); 

				}
				break;
			case 6 :
				// /home/donghao/LO17/TD7/tal_sql.g:1:46: CONJ
				{
				mCONJ(); 

				}
				break;
			case 7 :
				// /home/donghao/LO17/TD7/tal_sql.g:1:51: POINT
				{
				mPOINT(); 

				}
				break;
			case 8 :
				// /home/donghao/LO17/TD7/tal_sql.g:1:57: PARLER
				{
				mPARLER(); 

				}
				break;
			case 9 :
				// /home/donghao/LO17/TD7/tal_sql.g:1:64: WS
				{
				mWS(); 

				}
				break;
			case 10 :
				// /home/donghao/LO17/TD7/tal_sql.g:1:67: DATE
				{
				mDATE(); 

				}
				break;
			case 11 :
				// /home/donghao/LO17/TD7/tal_sql.g:1:72: ENTRE
				{
				mENTRE(); 

				}
				break;
			case 12 :
				// /home/donghao/LO17/TD7/tal_sql.g:1:78: APRES
				{
				mAPRES(); 

				}
				break;
			case 13 :
				// /home/donghao/LO17/TD7/tal_sql.g:1:84: AVANT
				{
				mAVANT(); 

				}
				break;
			case 14 :
				// /home/donghao/LO17/TD7/tal_sql.g:1:90: JOURMOIANNEE
				{
				mJOURMOIANNEE(); 

				}
				break;
			case 15 :
				// /home/donghao/LO17/TD7/tal_sql.g:1:103: JOURMOI
				{
				mJOURMOI(); 

				}
				break;
			case 16 :
				// /home/donghao/LO17/TD7/tal_sql.g:1:111: MOIANNEE
				{
				mMOIANNEE(); 

				}
				break;
			case 17 :
				// /home/donghao/LO17/TD7/tal_sql.g:1:120: MOI
				{
				mMOI(); 

				}
				break;
			case 18 :
				// /home/donghao/LO17/TD7/tal_sql.g:1:124: ANNEE
				{
				mANNEE(); 

				}
				break;
			case 19 :
				// /home/donghao/LO17/TD7/tal_sql.g:1:130: RUBRIQUE
				{
				mRUBRIQUE(); 

				}
				break;
			case 20 :
				// /home/donghao/LO17/TD7/tal_sql.g:1:139: TITRE
				{
				mTITRE(); 

				}
				break;
			case 21 :
				// /home/donghao/LO17/TD7/tal_sql.g:1:145: INT
				{
				mINT(); 

				}
				break;
			case 22 :
				// /home/donghao/LO17/TD7/tal_sql.g:1:149: VAR
				{
				mVAR(); 

				}
				break;

		}
	}


	protected DFA13 dfa13 = new DFA13(this);
	static final String DFA13_eotS =
		"\22\uffff\1\52\1\uffff\10\23\1\66\4\23\1\66\6\23\1\17\1\103\1\uffff\6"+
		"\23\1\17\4\23\1\uffff\6\23\1\127\3\23\1\uffff\1\52\1\uffff\1\23\1\137"+
		"\5\23\1\uffff\13\23\1\uffff\1\23\1\161\1\17\1\23\1\uffff\1\163\1\23\1"+
		"\uffff\1\165\3\23\1\uffff\1\23\1\173\1\174\1\175\1\176\7\23\1\uffff\1"+
		"\u0087\1\uffff\1\23\1\uffff\3\23\1\uffff\1\23\4\uffff\4\23\2\127\3\uffff"+
		"\1\137\1\171\2\23\1\175\3\23\1\127\2\23\1\127\1\175\1\23\1\u009b\1\u009c"+
		"\1\23\1\127\1\175\2\uffff\1\23\1\137";
	static final String DFA13_eofS =
		"\u009f\uffff";
	static final String DFA13_minS =
		"\1\11\11\55\1\uffff\2\55\1\47\1\55\1\uffff\1\55\1\47\1\60\1\uffff\2\165"+
		"\1\164\1\155\1\145\1\164\1\162\1\141\1\55\1\164\1\143\1\142\1\154\1\55"+
		"\1\142\2\162\1\164\2\156\1\55\1\40\1\uffff\1\154\1\163\1\162\1\142\1\143"+
		"\1\154\1\40\1\151\1\u00e8\1\156\1\144\1\uffff\1\162\1\150\1\162\3\154"+
		"\1\55\1\141\2\164\2\60\1\uffff\1\157\1\55\1\145\1\151\2\145\1\40\1\uffff"+
		"\1\143\1\163\1\164\3\145\1\151\1\145\1\151\1\145\1\163\1\uffff\1\156\2"+
		"\55\1\40\2\60\1\151\1\uffff\1\55\1\145\1\162\1\156\1\141\1\154\4\55\1"+
		"\162\1\161\1\164\1\145\1\162\1\40\1\164\1\uffff\1\40\1\uffff\1\162\1\uffff"+
		"\2\156\1\151\1\uffff\1\145\4\uffff\1\143\1\165\1\151\1\162\2\55\3\uffff"+
		"\2\55\1\145\1\162\1\55\1\150\1\145\1\156\1\55\1\157\1\162\2\55\1\145\2"+
		"\55\1\165\2\55\2\uffff\1\163\1\55";
	static final String DFA13_maxS =
		"\12\u00ff\1\uffff\4\u00ff\1\uffff\2\u00ff\1\71\1\uffff\2\165\1\164\1\156"+
		"\1\151\1\164\1\162\1\141\1\u00ff\1\164\1\143\1\142\1\154\1\u00ff\1\142"+
		"\2\162\1\164\2\156\1\u00ff\1\71\1\uffff\1\154\1\163\1\162\1\142\1\164"+
		"\1\154\1\u00ff\1\151\1\u00e8\1\156\1\144\1\uffff\1\162\1\150\1\162\2\154"+
		"\1\165\1\u00ff\1\145\2\164\2\71\1\uffff\1\157\1\u00ff\1\145\1\151\2\145"+
		"\1\40\1\uffff\1\143\1\163\1\164\3\145\1\151\1\145\1\151\1\145\1\163\1"+
		"\uffff\1\156\2\u00ff\1\40\2\71\1\151\1\uffff\1\u00ff\1\145\1\162\2\156"+
		"\1\154\4\u00ff\1\162\1\161\1\164\1\145\1\162\1\40\1\164\1\uffff\1\71\1"+
		"\uffff\1\162\1\uffff\2\156\1\151\1\uffff\1\145\4\uffff\1\143\1\165\1\151"+
		"\1\162\2\u00ff\3\uffff\2\u00ff\1\145\1\162\1\u00ff\1\150\1\145\1\156\1"+
		"\u00ff\1\157\1\162\2\u00ff\1\145\2\u00ff\1\165\2\u00ff\2\uffff\1\163\1"+
		"\u00ff";
	static final String DFA13_acceptS =
		"\12\uffff\1\7\4\uffff\1\11\3\uffff\1\26\26\uffff\1\25\13\uffff\1\6\14"+
		"\uffff\1\21\7\uffff\1\3\13\uffff\1\10\7\uffff\1\1\21\uffff\1\12\1\uffff"+
		"\1\22\1\uffff\1\24\3\uffff\1\2\1\uffff\1\14\1\15\1\4\1\13\6\uffff\1\16"+
		"\1\20\1\17\23\uffff\1\23\1\5\2\uffff";
	static final String DFA13_specialS =
		"\u009f\uffff}>";
	static final String[] DFA13_transitionS = {
			"\2\17\2\uffff\1\17\22\uffff\1\17\15\uffff\1\12\1\uffff\12\22\7\uffff"+
			"\32\23\6\uffff\1\5\1\10\1\3\1\15\1\6\1\16\3\23\1\20\1\23\1\21\2\23\1"+
			"\11\1\13\1\4\1\7\1\14\1\2\1\23\1\1\4\23\45\uffff\140\23",
			"\1\23\2\uffff\12\23\47\uffff\16\23\1\24\13\23\45\uffff\140\23",
			"\1\23\2\uffff\12\23\47\uffff\10\23\1\26\5\23\1\25\13\23\45\uffff\140"+
			"\23",
			"\1\23\2\uffff\12\23\47\uffff\16\23\1\27\13\23\45\uffff\140\23",
			"\1\23\2\uffff\12\23\47\uffff\24\23\1\30\5\23\45\uffff\140\23",
			"\1\23\2\uffff\12\23\47\uffff\17\23\1\32\1\23\1\31\3\23\1\33\4\23\45"+
			"\uffff\140\23",
			"\1\23\2\uffff\12\23\47\uffff\15\23\1\35\5\23\1\34\6\23\45\uffff\140"+
			"\23",
			"\1\23\2\uffff\12\23\47\uffff\4\23\1\36\17\23\1\37\5\23\45\uffff\140"+
			"\23",
			"\1\23\2\uffff\12\23\47\uffff\24\23\1\40\5\23\45\uffff\140\23",
			"\1\23\2\uffff\12\23\47\uffff\24\23\1\41\5\23\45\uffff\140\23",
			"",
			"\1\23\2\uffff\12\23\47\uffff\1\43\23\23\1\42\5\23\45\uffff\140\23",
			"\1\23\2\uffff\12\23\47\uffff\24\23\1\44\5\23\45\uffff\140\23",
			"\1\17\5\uffff\1\23\2\uffff\12\23\47\uffff\1\45\15\23\1\46\13\23\45\uffff"+
			"\140\23",
			"\1\23\2\uffff\12\23\47\uffff\16\23\1\47\13\23\45\uffff\140\23",
			"",
			"\1\23\2\uffff\12\23\47\uffff\4\23\1\50\25\23\45\uffff\140\23",
			"\1\17\5\uffff\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\12\51",
			"",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56\1\57",
			"\1\60\3\uffff\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\23\2\uffff\12\23\47\uffff\24\23\1\65\5\23\45\uffff\140\23",
			"\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\101\17\uffff\12\102",
			"",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110\20\uffff\1\111",
			"\1\112",
			"\1\113\14\uffff\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125\10\uffff\1\126",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\130\3\uffff\1\131",
			"\1\132",
			"\1\133",
			"\12\134",
			"\12\135",
			"",
			"\1\136",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"",
			"\1\145",
			"\1\146",
			"\1\147",
			"\1\150",
			"\1\151",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"\1\156",
			"\1\157",
			"",
			"\1\160",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\127",
			"\12\162",
			"\12\52",
			"\1\164",
			"",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\166",
			"\1\167",
			"\1\170",
			"\1\113\14\uffff\1\171",
			"\1\172",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\177",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"\1\127",
			"\1\u0084",
			"",
			"\1\u0085\17\uffff\12\u0086",
			"",
			"\1\u0088",
			"",
			"\1\u0089",
			"\1\u008a",
			"\1\u008b",
			"",
			"\1\u008c",
			"",
			"",
			"",
			"",
			"\1\u008d",
			"\1\u008e",
			"\1\u008f",
			"\1\u0090",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"",
			"",
			"",
			"\1\23\2\uffff\12\23\47\uffff\23\23\1\u0091\6\23\45\uffff\140\23",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\u0092",
			"\1\u0093",
			"\1\23\2\uffff\12\23\47\uffff\22\23\1\u0094\7\23\45\uffff\140\23",
			"\1\u0095",
			"\1\u0096",
			"\1\u0097",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\u0098",
			"\1\u0099",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\u009a",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\u009d",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23",
			"",
			"",
			"\1\u009e",
			"\1\23\2\uffff\12\23\47\uffff\32\23\45\uffff\140\23"
	};

	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;

	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	protected class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( SELECT | COMBIEN | QUI | ARTICLE | BULLETIN | CONJ | POINT | PARLER | WS | DATE | ENTRE | APRES | AVANT | JOURMOIANNEE | JOURMOI | MOIANNEE | MOI | ANNEE | RUBRIQUE | TITRE | INT | VAR );";
		}
	}

}
