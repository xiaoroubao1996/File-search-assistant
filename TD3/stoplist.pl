# lire input
open my $in_tfidf, '<', 'tfidf.txt' or die "Error opening tfidf.txt";

# afficher output
open my $out_stoplist, '>', 'stoplist.txt' or die "Error writing stoplist.txt";
#open my $out_testtest, '>', 'testtest.txt' or die "Error writing testtest.txt";

# dictionaire{'mot'} = moyen de tdfidf
my %dictionaire;
my %dictionaire_num;

# calcule le moyen de tfidf de chacun mot
while ($ligne = <$in_tfidf>) {
	if ($ligne =~ /(.+)\s([^\d]+)\t([\d.]+)/) {
		if(! exists $dictionaire_num{"$2"}){
			$dictionaire_num{"$2"} = 0;		
		}
		$dictionaire{"$2"} += $3;
		$dictionaire_num{"$2"} ++;	
    	}
}

foreach $key (keys %dictionaire){
	$moyen = $dictionaire{"$key"}/$dictionaire_num{"$key"};
	#$num = $dictionaire_num{"$key"};
	print $out_stoplist "$key\t$moyen\n";
}

