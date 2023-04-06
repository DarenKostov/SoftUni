import java.util.*;

class LegendaryFarming{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        LinkedHashMap<String, Integer> materials = new LinkedHashMap<>();
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);
        String created="";

        Outer:
        while(true){
            String[] input=scanner.nextLine().split(" ");
            for(int i=0; i<input.length; i+=2){
                int amount=Integer.parseInt(input[i]);
                String material=input[i+1].toLowerCase();
            
                materials.putIfAbsent(material, 0);
                materials.put(material, materials.get(material)+amount);
            
                if(materials.get("shards")>=250){
                    created="Shadowmourne";
                    materials.put("shards", materials.get("shards")-250);
                    break Outer;
                }else if(materials.get("fragments")>=250){
                    created="Valanyr";
                    materials.put("fragments", materials.get("fragments")-250);
                    break Outer;
                }else if(materials.get("motes")>=250){
                    created="Dragonwrath";
                    materials.put("motes", materials.get("motes")-250);
                    break Outer;
                }
            
            }
        }
        
        System.out.printf("%s obtained!\n", created);
        for(Map.Entry<String, Integer> material: materials.entrySet())
            System.out.printf("%s: %d\n", material.getKey(), material.getValue());

    }
}
