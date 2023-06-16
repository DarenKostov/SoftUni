import java.util.*;

class Person{



    private Company company;
    private List<Pokemon> pokemons;
    private List<Relative> parents;
    private List<Relative> children;
    private Car car;



    public Person(){
        company=null;
        pokemons=new ArrayList<>();
        parents=new ArrayList<>();
        children=new ArrayList<>();
        car=null;
    }

    public void addCompany(String name, String department, String salary){
        company=new Company(name, department, salary);
    }
    public void addPokemon(String name, String type){
        pokemons.add(new Pokemon(name, type));
    }
    public void addParent(String name, String date){
        parents.add(new Relative(name, date));
    }
    public void addChild(String name, String date){
        children.add(new Relative(name, date));
    }
    public void addCar(String model, String speed){
        car=new Car(model, speed);
    }

    
    @Override
    public String toString(){
        String output="";

        output+="Company: \n";
        if(this.company!=null){
            output+=(this.company+"\n");
        }
        
        output+="Car: \n";
        if(this.car!=null){
            output+=(this.car+"\n");
        }

        output+="Pokemon: \n";
        for(Pokemon pokemon : this.pokemons){
            output+=(pokemon+"\n");
        }

        output+="Parents: \n";
        for(Relative parent : this.parents){
            output+=(parent+"\n");
        }
        
        output+="Children: \n";
        for(Relative child: this.children){
            output+=(child+"\n");
        }
    
        return output;
    }


    private class Car{

        private String model;
        private String speed;

        public Car(String model, String speed) {
            this.model=model;
            this.speed=speed;
        }

        @Override
        public String toString(){
            return this.model+" "+this.speed;
        }

    };

    private class Relative{

        private String name;
        private String birthDay;

        public Relative(String name, String birthDay) {
            this.name=name;
            this.birthDay=birthDay;
        }

        @Override
        public String toString(){
            return this.name+" "+this.birthDay;
        }

    };

    private class Pokemon{

        private String name;
        private String type;

        public Pokemon(String name, String type) {
            this.name=name;
            this.type=type;
        }
    
        @Override
        public String toString(){
            return this.name+" "+this.type;
        }
    };

    private class Company{

        private String name;
        private String department;
        private String salary;

        public Company(String name, String department, String salary) {
            this.name=name;
            this.department=department;
            this.salary=salary;
        }

        @Override
        public String toString(){
            return this.name+" "+this.department+" "+String.format("%.2f", Double.parseDouble(this.salary));
        }
    };

}




