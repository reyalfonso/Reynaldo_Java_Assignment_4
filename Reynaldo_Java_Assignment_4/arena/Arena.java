package arena;

public abstract class Arena {
    private int arenaAmount;
    private int dexterityCost;
    private String arenaType;

    public Arena(String arenaType) {
        this.arenaType = arenaType;
      } // constructor

      public int getArenaAmount() {
        return this.arenaAmount;
      }
      public int getDexterityCost() {
        return this.dexterityCost;
      }
      public String getArenaType() {
        return this.arenaType;
      }
      
      public abstract int getExtraDamage(int effect);
    
      public void setArenaAmount(int arenaAmount) {
        this.arenaAmount = arenaAmount;
      }
      public void setDexterityCost(int dexterityCost) {
        this.dexterityCost = dexterityCost;
      }
      public void setArenaType(String arenaType) {
        this.arenaType = arenaType;
      }
} // class
