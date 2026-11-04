void main() {
    TravelCard card1 = new TravelCard();
    TravelCard card2 = new TravelCard();

    card1.topUp(50);
    IO.println(card1.toString());
    card2.topUp(50);
    IO.println(card2.toString());
    card2.pay(30);
    IO.println(card2.toString());
}