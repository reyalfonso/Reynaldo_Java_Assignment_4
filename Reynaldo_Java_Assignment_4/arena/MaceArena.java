
package arena;

public class MaceArena extends Arena {
    private int arenaAmount = 100;
    private int dexterityCost = 10;

    public MaceArena(String arenaType) {
        super(arenaType);
        super.setArenaAmount(arenaAmount);
        super.setDexterityCost(dexterityCost);
      } 
    
      public int getExtraDamage(int effect) {
        return effect + (this.arenaAmount / 20);
      }


} // class