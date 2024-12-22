package tacos;

import lombok.*;
import lombok.experimental.Accessors;

@Data
public class Ingredient {

  public Ingredient(String id, String name, Type type) {
    this.id = id;
    this.name = name;
    this.type = type;
  }

  private String id;
  private String name;
  private Type type;
  
  public enum Type {
    WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
  }

  @Override
  public String toString() {
    return "Ingredient{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", type=" + type +
            '}';
  }
}
