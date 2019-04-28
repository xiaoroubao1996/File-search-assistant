# lire input
open my $in_corpus, '<', 'corpus_filtre.xml' or die "Error opening corpus_filtre.xml";

# afficher output
#open my $out_corpus_filtronc, '>', 'corpus_filtronc.xml' or die "Error writing corpus_filtronc.xml";

# pattern pour expression reguliere
$pattern = "a-zA-ZàâèéêëîïôöùûüçœæÀÂÈÉÊËÎÏÔÖÙÛÇŒÆ°";

while ($ligne = <$in_corpus>) {
	# lire input 
	open my $in_filtronc_v, '<', 'filtronc_v.txt' or die "Error opening filtronc_v.txt";
	$templigne = $ligne;
	#print $out_corpus_filtronc "$templigne\n";
	while ($filtrligne = <$in_filtronc_v>) {
		#lire les mots et leur successeur
		if($filtrligne =~ /([$pattern]+)[ ]?\t([$pattern]+)[ ]?/){
			$mot_origin = $1;			
			$mot_filtre = $2;
			#cherche quelque mot entier. ex on cherche "m". on ne va pas trouve m dans "mon" mais "m"
			if($templigne =~ /([^$pattern]?)$mot_origin([^$pattern])/){
				$mot_filtre = $1.$mot_filtre.$2;
				#replace 	
				$templigne =~ s/([^$pattern]?)$mot_origin([^$pattern])/$mot_filtre/;		
			}	
		}
	}
	close $in_filtronc_v;

	print "$templigne";
}

close $in_corpus;
#close $out_corpus_filtronc;



