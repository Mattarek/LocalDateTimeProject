package AndretStreamExercieses;

import java.util.List;

public record Employee(String firstName, String lastName, Gender gender, List<Role> roles, double salary) {
}
