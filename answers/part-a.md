# Del A: Regler för ett resekort

## Regler som borde gälla

1. Man får inte gå i negativ balans
2. Kortnummret måste vara unikt samt vara för en individ (man får inte dela kort med någon annan och man måste kunna visa upp id vid förfrågan.)
3. Laddning av kort måste göras med ett positivt tal.

## Varför skyddar inte dataclassen mot felen?
I koden är alla fält (som number och balance) helt öppna. Det innebär att extern kod har direkt åtkomst till variablerna och kan ändra deras värden utifrån utan någon kontroll. Dataclassen har ingen metod (som exempelvis en anpassad betala eller ladda funktion) som validerar indata och stoppar ogiltiga ändringar innan saldot uppdateras.