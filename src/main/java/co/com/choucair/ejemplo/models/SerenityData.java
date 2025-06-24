package co.com.choucair.ejemplo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
public class SerenityData {
  private @Getter String username;
  private @Getter String password;
  private @Getter String unit_business_name;
  private @Getter String meeting_name;
  private @Getter String meeting_type;
  private @Getter String meeting_number;
  private @Getter String start_date;
  private @Getter String end_date;
  private @Getter String location;
  private @Getter String organized_by;
  private @Getter String reporter;
  private @Getter String attendee_list;
}
