import java.util.Comparator;

class NameComparator implements Comparator<Individual>{

    @Override
    public int compare(Individual p1, Individual p2){
        if(p1.getName().length()!=p2.getName().length()){
            return Integer.compare(p1.getName().length(), p2.getName().length());
        }

        return Character.compare(
            p1.getName().toUpperCase().charAt(0),
            p2.getName().toUpperCase().charAt(0)
        );

        
    }
}
