<?php 
$a="kxyz-mm-dd";
$ano=substr($a, 0, 4);
$mes=substr($a, 5, 2);
$dia=substr($a, 8, 9);

echo $dia."/".$mes."/".$ano;
?>