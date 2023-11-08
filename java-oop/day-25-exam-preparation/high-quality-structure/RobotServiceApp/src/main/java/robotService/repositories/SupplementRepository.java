package robotService.repositories;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import robotService.entities.supplements.Supplement;

public class SupplementRepository implements Repository{

	
	private Collection<Supplement> supplements;
	
	
	
	
	public SupplementRepository() {
		supplements=new ArrayList<>();
	}

	@Override
	public void addSupplement(Supplement supplement) {
		this.supplements.add(supplement);
	}

	@Override
	public boolean removeSupplement(Supplement supplement) {
		return this.supplements.remove(supplement);
	}

	@Override
	public Supplement findFirst(String type) {
		// TODO Auto-generated method stub
		return this.supplements.stream().filter(s->type.equals(s.getClass().getSimpleName())).findFirst().orElse(null);
	}

}
