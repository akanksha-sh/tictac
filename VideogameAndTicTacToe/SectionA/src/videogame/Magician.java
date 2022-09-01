package videogame;

public class Magician extends Entity implements SpellCaster {

  public Magician(String name, int lifePoints) {
    super(name, lifePoints);
  }

  @Override
  protected int propagateDamage(int damageAmount) {
    assert damageAmount >= 0;
    lifePoints =- damageAmount;
    return damageAmount;
  }

  @Override
  public int minimumStrikeToDestroy() {
    return lifePoints;
  }

  @Override
  public int getStrength() {
    return 2*lifePoints;
  }

  @Override
  public String toString() {
    return this.name + "(" + this.lifePoints + ")";
  }
}
