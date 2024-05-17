package weapon;

public class Mace extends Weapon {
    private int damageAmount = 220; 
    private int dexterityCost = 170;
    private int baseHitChance = 70; 

    public Mace(String weaponType) {
        super(weaponType);
        super.setDamageAmount(damageAmount);
        super.setDexterityCost(dexterityCost);
    }

    public int strike(int attackType, int dexterity, int strength) {
        int damage = 0;
        int roll = super.randNum.nextInt(100) + 1;

        if ((roll - attackType * 2) + (dexterity / 5 - this.dexterityCost)
                <= baseHitChance) { 
            damage = this.damageAmount + (strength / 10) + (attackType * 5);
        } 
        else { // miss
            damage = 0;
        }
        return damage;
    }
}
