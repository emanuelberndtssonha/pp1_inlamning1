void main() {
    Zone zone1 = new Zone(1, "Mariehamn");
    Zone zone2 = new Zone(2, "Jomala");
    Zone zone3 = new Zone(3, "Godby");

    TravelCard card1 = new TravelCard();
    TravelCard card2 = new TravelCard();
    IO.println(card1.toString());
    IO.println(card2.toString());

    card1.topUp(150);
    card2.topUp(4);

    Trip trip1 = new Trip(zone1, zone2);
    Trip trip2 = new Trip(zone2, zone1);

    card1.travel(trip1);
    card1.travel(trip2);
    IO.println("Kort 2 hade råd med resan: " + (card2.travel(trip2)));

    IO.println(card1.toString());
    IO.println(card2.toString());

    IO.println("Ladda 500 euro: " + card1.topUp(500));
    IO.println("Betala -5 euro: " + card1.pay(-5));

    IO.println("Totalt utfärdade kort: " + TravelCard.getIssuedCount());
}