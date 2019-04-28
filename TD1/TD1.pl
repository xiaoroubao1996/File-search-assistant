#!/usr/bin/perl
#$dirname = './OLD_BULLETINS_LO17';
my $file = "corpus.xml";
open(my $fh, '>', $file) or die "Could not open $file\n";

$dirname = '.';
print $fh "<corpus>\n";
opendir(DIR, $dirname) or die "Could not open $dirname\n";

foreach(sort grep(/^.*\.htm$/,readdir(DIR))){
	open(DATA,"<$_");
	$numligne = 1;
	$text = "";
	$nom = $_;
	$paragraph = 0;
	## la ou les images avec leur(s) URL(s) et leur(s) légende(s) respective(s)
    	$nb_img = 0;
    	@url_img = ();
    	@legende_img = ();
	while (defined($ligne=<DATA>)) {		# on utilise l'operateur diamant
#	while (defined($ligne=<>)) {
		if($ligne=~/<span class="style32">BE France (\d+)/){
			$numero=$1;
		}
		if($ligne=~/<span class="style42">(.*?)</g){
			$rubrique=$1;
		}
		if($ligne=~/<span class="style15">.*?([0-9]+\/[0-9]+\/[0-9]+)/g){
			$date=$1;
		}
	    	# url
	    	if ($ligne =~ /<div style="text-align: center">.*<img src\=\"(.*?)\"/g) {
			$url_img[$nb_img] = $1;
	    	}
	    	# legende
	    	if ($ligne =~ /\<span class\=\"style21\"\>\<strong\>(.*?)\<\/strong\>/g) {
			$legende_img[$nb_img] = $1;
			$nb_img++;
	    	}
		if($paragraph == 1){
			if($ligne=~/<\/span><\/p>/g){
				$text .= "\n";		
				$paragraph = 0;
			}else{
				$text .= $ligne;
			}
		}
		if($ligne=~/<p class="style96"><span class="style95">(.*)/g){
			
			#until(/<\/span><\/p>/){
			#	$_ = (<>);
			#	$text .= $_;
			#};


$temptext = $ligne;
			$text .= $1;
			$paragraph = 1;

			if($temptext=~/<span class="style95">.*<\/span><\/p>/g){
				$text .= "test\n";			
				$paragraph = 0;
			}
		}	
	    	## les informations de contact
	    	if ($ligne =~ m/\<p class\=\"style44\"\>\<span class\=\"style85\"\>(.*?)\<\/span\>/g) {
			$contact = $1;
	    	}
	}	





	$text =~ s/<.*?>/ /g;
	$contact =~ s/<.*?>/ /g;
	$text =~ s/<div style="text-align: center">.*alt="">/ /g;
	$docu=<<"EOF";
<bulletin>
<fichier>$nom</fichier>
<numero>$numero</numero>
<date>$date</date>
<rubrique>$rubrique</rubrique>
<contact>$contact</contact>
<text>$text</text>
EOF
	print $fh "$docu<images>\n";
	##images
	for($num=0;$num<$nb_img;$num++){
		print $fh "<img>\n<urlImage>\n$url_img[$num]\n</urlImage>\n<legendeImage>\n$legende_img[$num]\n</legendeImage>\n</img>\n";
	}
	print $fh "</images>\n</bulletin>\n";
close (DATA);
}

closedir(DIR);
print $fh "</corpus>\n";
