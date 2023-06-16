import java.util.Comparator;

class AgeComparator implements Comparator<Individual>{
    @Override
    public int compare(Individual p1, Individual p2) {
        return Integer.compare(p1.getAge(), p2.getAge());
    }
}
