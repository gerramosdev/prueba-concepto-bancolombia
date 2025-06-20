package co.com.choucair.ejemplo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
public class SerenityData {
  private @Getter String username;
  private @Getter String password;
  private @Getter String unit_business;
}
