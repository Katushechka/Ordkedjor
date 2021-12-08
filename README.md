# Ordkedjor

Den här uppgiften går ut på att hitta vägar mellan ord med fem bokstäver. Det är ett grafproblem som ska lösas med bredden-först-sökning.

Indata består av ord på fem bokstäver, och kopplingar definieras så att det går att komma från ord *x* till ord *y* i ett steg om och endast om alla de fyra sista bokstäverna i *x* finns med i ord *y*. Man kan till exempel gå från *”väska”* till *”säkra”* därför att ä, s, k och a alla finns med i *”säkra”*, men inte tvärtom eftersom *”väska”* inte innehåller något r. Däremot kan man gå åt båda hållen mellan *”skola”* och *”kloka”*.

