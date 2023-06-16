import java.util.*;

class Trainer{

    List<Pokemon> pokemons=new ArrayList<>();
    String name="";
    int badgesCount=0;


    public Trainer(String name){
        this.name=name;
    }


    public void addPokemon(String name, String element, int health){
        pokemons.add(new Pokemon(name, element, health));
    }

    public int getBadges(){
        return this.badgesCount;
    }

    public void battle(String element){
        if(pokemons.size()==0)
            return;


        boolean getBadge=false;
        
        for(int i=0; i<pokemons.size(); i++){
            if(pokemons.get(i).isElement(element)){
                getBadge=true;
                break;
            }
        }


        if(getBadge){
            badgesCount++;
        }else{

            for(int i=0; i<pokemons.size(); i++){
                if(!pokemons.get(i).removeHealth()){
                    pokemons.remove(i);
                    i--;
                }
            }
        }
    }


    @Override
    public String toString(){
        return name+" "+badgesCount+" "+pokemons.size();
    }


}
