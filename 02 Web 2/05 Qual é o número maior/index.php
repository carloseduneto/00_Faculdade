<body>
		<h1 align="center"> Atividade 2!<h1>
		
		<?php
		$var1=2;
		$var2=5;
		
		if ($var1 > $var2) {
			echo "{$var1} é maior que {$var2}";
			
		} else if ($var2 > $var1) {
			echo "{$var2} é maior que {$var1}";
			
		}else{
			echo "Conflito";
		}
		?>