class Main{
    public static void main(String[] args){
    
        System.out.println("Card Suits:");
        for(Suit suit : Suit.values()){
            System.out.printf("Ordinal value: %d; Name value: %s\n", suit.ordinal(), suit.name());
        }
        
    }
}
