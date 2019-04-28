grammar tal_sql;

SELECT        :         
        'vouloir' ('tous')? | 'tous'
        ;

COMBIEN        :        
        'combien' | 'quel nombre'
        ;

QUI        :        
        'qui écrit article' | 'quel auteur écrit article'
        ;
        
ARTICLE : 
        'article'('s')? | 'etude' | 'recherche'
        ;

BULLETIN : 
        'bulletin'
        ;

CONJ         : 
        'et' | 'ou'
        ;

POINT         : 
        '.'
        ;


PARLER        :
        'publier'|'parler'|'concerner'| 'sur'| 'contenir' | 'datant' | 'font référence' | 'parus bulletins'
        ;
 
WS          : 
        (' ' |'\t' | '\r' | 'je' | 'qui' | 'dont' | 'd\''| 'l\'') {skip();} | '\n' 
        ;


DATE        :
        'date'
        ;

ENTRE        :
        'entre'
        ;

APRES        :        
        'après'
;

AVANT        :
        'avant'
        ;
        
JOURMOIANNEE        :        
        ('0'..'9')('0'..'9')' '('0'..'9')('0'..'9')' '('0'..'9')('0'..'9')('0'..'9') ('0'..'9')
        ;
        
JOURMOI        :        
        ('0'..'9')('0'..'9')' '('0'..'9')('0'..'9')
        ;
        
MOIANNEE        :        
        ('0'..'9')('0'..'9')' '('0'..'9')('0'..'9')('0'..'9') ('0'..'9')
        ;
        
MOI        :        
        ('0'..'9')('0'..'9')
        ;

ANNEE        :
        ('0'..'9')('0'..'9')('0'..'9') ('0'..'9')   
;

RUBRIQUE:
        'rubrique'
        ;
TITRE	:
	'titre'
	;
INT        :
        '0'..'9'+
        ;
        
VAR         : 
        ('A'..'Z' | 'a'..'z'|'\u00a0'..'\u00ff')(('a'..'z')|('0'..'9')|'-'|('\u00a0'..'\u00ff'))+
;        


listerequetes returns [String sql = ""]
        @init        {Arbre lr_arbre;}: 
                r = requete POINT
                        {
                                lr_arbre = $r.req_arbre;
                                sql = lr_arbre.sortArbre();
                        }
;

requete returns [Arbre req_arbre = new Arbre("")]
        @init {Arbre join_arbre; String modele_avant = ""; String modele_apres= "";String modele_group= "";} : 
                ((SELECT 
                        {
                                req_arbre.ajouteFils(new Arbre("select distinct"));
                        }
                |COMBIEN{
                                req_arbre.ajouteFils(new Arbre("select distinct"));
                                modele_avant = "count[";
                                modele_apres = "]";
                                modele_group= "GROUP BY ";
                        }) 
                (ARTICLE
                        {
                                req_arbre.ajouteFils(new Arbre(modele_avant));
                                req_arbre.ajouteFils(new Arbre("but.fichier"));
                                req_arbre.ajouteFils(new Arbre(modele_apres));
                                req_arbre.ajouteFils(new Arbre("FROM titretexte as but JOIN"));
                        }
                 | BULLETIN
                        {
                                req_arbre.ajouteFils(new Arbre(modele_avant));
                                req_arbre.ajouteFils(new Arbre("but.numero"));
                                req_arbre.ajouteFils(new Arbre(modele_apres));
                                req_arbre.ajouteFils(new Arbre("FROM titretexte as but JOIN"));
                        }
                 )
                 |QUI                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
                      {
                                 req_arbre.ajouteFils(new Arbre("select distinct email FROM email as but JOIN"));
                         }
                         )
                (joinarbre = join 
                        {
                                join_arbre = $joinarbre.lepar_arbre;
                                if($joinarbre.condition == ""){req_arbre.ajouteFils(new Arbre("["));}
                                req_arbre.ajouteFils(join_arbre);
                                if($joinarbre.condition == ""){req_arbre.ajouteFils(new Arbre("]"));}
                                req_arbre.ajouteFils(new Arbre(" ON but.fichier = "+$joinarbre.type+".fichier"));
                                req_arbre.ajouteFils(new Arbre("AND but.numero=", $joinarbre.type+".numero "));
                                 if($joinarbre.condition != ""){req_arbre.ajouteFils(new Arbre("AND "+$joinarbre.condition));}
                        })?
                        {
                                req_arbre.ajouteFils(new Arbre(";"));
                        }
;


join returns [Arbre lepar_arbre = new Arbre(""), String type, String condition = ""] 
        @init        {Arbre arbre;} :
        dateArbre = joindate
                {
                        retval.condition = $dateArbre.condition;
                        retval.type = $dateArbre.type;
                        arbre = $dateArbre.lepar_arbre;
                        retval.lepar_arbre.ajouteFils(arbre);
                }
        |
        rubriqueArbre = joinrubrique
                {
                        retval.condition = $rubriqueArbre.condition;
                        retval.type = $rubriqueArbre.type;
                        arbre = $rubriqueArbre.lepar_arbre;
                        retval.lepar_arbre.ajouteFils(arbre);
                }
        |
        bulletinArbre = joinbulletin
                {
                        retval.condition = $bulletinArbre.condition;
                        retval.type = $bulletinArbre.type;
                        arbre = $bulletinArbre.lepar_arbre;
                        retval.lepar_arbre.ajouteFils(arbre);
                }
         |
         motArbre = joinmot
                {
                        retval.condition = $motArbre.condition;
                        retval.type = $motArbre.type;
                        arbre = $motArbre.lepar_arbre;
                        retval.lepar_arbre.ajouteFils(arbre);
                }
;

joindate returns [Arbre lepar_arbre = new Arbre(""), String type, String condition = ""]
@init        {Arbre join_arbre = new Arbre(""); String[] dateTable; Boolean fin = true; String dateCondition = "";} :
        ((
        PARLER
        )?
        (annee = ANNEE
                {
                         dateCondition = "date.annee='"+annee.getText()+"' ";
                }|
               date = MOIANNEE
                {
                        dateTable = date.getText().split(" ");
                        dateCondition = "date.moi='"+dateTable[0]+"' AND date.annee='"+dateTable[1]+"'";
                }|
               date = JOURMOIANNEE
                {
                        dateTable = date.getText().split(" ");
                        dateCondition = "date.jour='"+dateTable[0]+" date.moi='"+dateTable[1]+"' AND date.annee='"+dateTable[2]+"'";
                }|
               date = JOURMOI
                {
                        dateTable = date.getText().split(" ");
                        dateCondition = "date.jour='"+dateTable[0]+" date.moi='"+dateTable[1];
                }
        )|
        (ENTRE
                ((annee1 = ANNEE
                CONJ
                annee2 = ANNEE
                        {
                                 dateCondition = "date.annee>'"+annee1.getText()+"' AND date.annee< '"+annee2.getText()+"'";
                        }
                )|(moi1 = MOI
		CONJ
                moi2 = MOI
                        {
                                 dateCondition = "date.moi>'"+moi1.getText()+"' AND date.moi< "+moi2.getText()+"'";
                        }
                
                ))
        )|(
                (avantapres=AVANT
                |
                avantapres=APRES
        )
                (annee = ANNEE
                {
                dateCondition = "date.annee"+avantapres.getText()+"'"+annee1.getText()+"' AND date.annee"+avantapres.getText()+"' "+annee2.getText()+"'";
                }
                |
                moi = MOI
                )
        )
        )
        (joinarbre = join
                {
                        fin = false;
                        join_arbre = $joinarbre.lepar_arbre;
                })?
                {
                        retval.type = "date";
                        if(!fin){
                                retval.lepar_arbre.ajouteFils(new Arbre(" date JOIN "));
                                if($joinarbre.condition == ""){retval.lepar_arbre.ajouteFils(new Arbre("["));}
                                retval.lepar_arbre.ajouteFils(join_arbre);
                                if($joinarbre.condition == ""){retval.lepar_arbre.ajouteFils(new Arbre("]"));}
                                retval.lepar_arbre.ajouteFils(new Arbre(" ON "+dateCondition));
                                       retval.lepar_arbre.ajouteFils(new Arbre("AND date.fichier=", $joinarbre.type+".fichier "));
                                       retval.lepar_arbre.ajouteFils(new Arbre("AND date.numero=", $joinarbre.type+".numero "));
                                       if($joinarbre.condition != ""){retval.lepar_arbre.ajouteFils(new Arbre("AND "+$joinarbre.condition));}
                        }else{
                                retval.lepar_arbre.ajouteFils(new Arbre("date"));
                                retval.condition = dateCondition;
                        }
                }
        ;


joinbulletin returns [Arbre lepar_arbre = new Arbre(""), String type, String condition = ""]
@init        {Arbre join_arbre = new Arbre(""); Boolean fin = true;} :
        bulletin = BULLETIN
        where = INT
        
                (joinarbre = join
                {
                        fin = false;
                        join_arbre = $joinarbre.lepar_arbre;
                })?
                {
                        retval.type = "numero";
                        if(!fin){
                                retval.lepar_arbre.ajouteFils(new Arbre(" numero JOIN "));
                                if($joinarbre.condition == ""){retval.lepar_arbre.ajouteFils(new Arbre("["));}
                                retval.lepar_arbre.ajouteFils(join_arbre);
                                if($joinarbre.condition == ""){retval.lepar_arbre.ajouteFils(new Arbre("]"));}
                                retval.lepar_arbre.ajouteFils(new Arbre(" ON numero.numero=", "'"+where.getText()+"' "));
                                retval.lepar_arbre.ajouteFils(new Arbre("AND numero.fichier=", $joinarbre.type+".fichier "));
                                retval.lepar_arbre.ajouteFils(new Arbre("AND numero.numero=", $joinarbre.type+".numero "));
                                if($joinarbre.condition != ""){retval.lepar_arbre.ajouteFils(new Arbre("AND "+$joinarbre.condition));}
                        }else{
                                retval.lepar_arbre.ajouteFils(new Arbre("numero"));
                                retval.condition = "numero.numero = '"+where.getText()+"' ";
                        }
                }
        ;
        
joinrubrique returns [Arbre lepar_arbre = new Arbre(""), String type, String condition = ""]
@init        {Arbre join_arbre = new Arbre(""); Boolean fin = true;} :
        rubrique = RUBRIQUE
        where = VAR
        
                (joinarbre = join
                {
                        fin = false;
                        join_arbre = $joinarbre.lepar_arbre;
 
                })?
                {
                        retval.type = "rubrique";
                        if(!fin){
                                retval.lepar_arbre.ajouteFils(new Arbre(" rubrique JOIN "));
                                if($joinarbre.condition == ""){retval.lepar_arbre.ajouteFils(new Arbre("["));}
                                retval.lepar_arbre.ajouteFils(join_arbre);
                                if($joinarbre.condition == ""){retval.lepar_arbre.ajouteFils(new Arbre("]"));}
                                retval.lepar_arbre.ajouteFils(new Arbre(" ON rubrique.rubrique =", "'"+where.getText()+"' "));
                                retval.lepar_arbre.ajouteFils(new Arbre("AND rubrique.fichier =", $joinarbre.type+".fichier "));
                                retval.lepar_arbre.ajouteFils(new Arbre("AND rubrique.numero=", $joinarbre.type+".numero "));
                                if($joinarbre.condition != ""){retval.lepar_arbre.ajouteFils(new Arbre("AND "+$joinarbre.condition));}
                        }else{
                                retval.lepar_arbre.ajouteFils(new Arbre("rubrique"));
                                retval.condition = "rubrique.rubrique = '"+where.getText()+"' ";
                        }
                }
;

joinmot returns [Arbre lepar_arbre = new Arbre(""), String type, String condition = ""]
@init        {Arbre join_arbre  = new Arbre("");  Boolean fin = true;} :
parler = (PARLER|CONJ|TITRE?)
        where = VAR
        
                (joinarbre = join
                {
                                fin = false;
                                join_arbre = $joinarbre.lepar_arbre;
                })?
                {
                        retval.type = "texte"+where.getText();
                        if(!fin){
                                retval.lepar_arbre.ajouteFils(new Arbre("texte as "+retval.type+" JOIN "));
                                if($joinarbre.condition == ""){retval.lepar_arbre.ajouteFils(new Arbre("["));}
                                retval.lepar_arbre.ajouteFils(join_arbre);
                                if($joinarbre.condition == ""){retval.lepar_arbre.ajouteFils(new Arbre("]"));}
                                retval.lepar_arbre.ajouteFils(new Arbre(" ON "+retval.type+".mot =", "'"+where.getText()+"' "));
                                retval.lepar_arbre.ajouteFils(new Arbre("AND "+retval.type+".fichier =", $joinarbre.type+".fichier "));
                                retval.lepar_arbre.ajouteFils(new Arbre("AND "+retval.type+".numero=", $joinarbre.type+".numero "));
                                if($joinarbre.condition != ""){retval.lepar_arbre.ajouteFils(new Arbre("AND "+$joinarbre.condition));}
                        }else{
                                retval.lepar_arbre.ajouteFils(new Arbre("texte as "+retval.type));
                                retval.condition = retval.type+".mot = '"+where.getText()+"' ";
                        }
                }
;