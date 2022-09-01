package videogame;

import java.util.HashSet;
import java.util.Set;

public class TransportUnit extends Entity {

  private Set<Entity> transporting = new HashSet<>();

  public TransportUnit(String name, int lifePoints) {
    super(name, lifePoints);
    assert transporting.isEmpty();
  }

  public void add(Entity e) {
    transporting.add(e);
  }

  @Override
  protected int propagateDamage(int damageAmount) {
    assert damageAmount >= 0;
    return 0;
  }

  @Override
  public int minimumStrikeToDestroy() {
    return 0;
  }

  @Override
  public String toString() {
    StringBuilder s = new StringBuilder();
    String e = "[" + this.name + "(" + this.lifePoints + ") ";
    s.append(e);
    for (Entity ent : transporting) {




  }
    return s.toString();

  }
}
