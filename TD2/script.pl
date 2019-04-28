# init dfi.txt et tf.txt par UNIX command

# fichier tf
system("cat corpus.xml | perl segmente.pl -f | sort | uniq -c | more > tf.txt");
# fichier idf
system("cat corpus.xml | perl segmente.pl -f | sort | uniq | cut -f 1 | sort | uniq -c | more > dfi.txt");

# lire input
open my $in_corpus, '<', 'corpus_P17_ss_balise.xml' or die "Error opening corpus.xml";
open my $in_dfi, '<', 'dfi.txt' or die "Error opening dfi.txt";
open my $in_tf, '<', 'tf.txt' or die "Error opening tf.txt";

# afficher output
open my $out_idf, '>', 'idf.txt' or die "Error writing idf.txt";
open my $out_tfidf, '>', 'tfidf.txt' or die "Error writing tfidf.txt";

# calcule N (N = 326) 
$N = 0;
while ($ligne = <$in_corpus>) {
    if ($ligne =~ m/\<bulletin\>/g) {
        $N++;
    }
}


# dictionaire{'mot'} = idfi de ce mot
my %dictionaire;

# calcule idf
while ($ligne = <$in_dfi>) {
    # trim leading white spaces
    $ligne =~ s/^\s+//;
    # regex sous forme : nb_occur <space> mot
    if ($ligne =~ /(\d+)\s(.+)/) {
        # calcule idfi
        $idfi = log($N / $1) / log(10);
        $dictionaire{$2} = $idfi;
        # afficher dans idf.txt
        print $out_idf "$2\t$idfi\n";
    }
}


# calcule tfidf
while ($ligne = <$in_tf>) {
    # trim leading white spaces
    $ligne =~ s/^\s+//;
    if ($ligne =~ /(\d+)\s(.+)\t(.+)/) {
        $tf_idf_val = $1 * $dictionaire{$2};
        print $out_tfidf "$3\t$2\t$tf_idf_val\n"
    }
}
