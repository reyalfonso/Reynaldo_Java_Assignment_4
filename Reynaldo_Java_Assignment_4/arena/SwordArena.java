
package arena;

public class SwordArena extends Arena {
    private int arenaAmount = 100;
    private int dexterityCost = 10;

    public SwordArena(String arenaType) {
        super(arenaType);
        super.setArenaAmount(arenaAmount);
        super.setDexterityCost(dexterityCost);
      } // contructor
    
      public int getExtraDamage(int effect) {
        return effect + (this.arenaAmount / 20);
      }

} // class
