package models;

import play.data.validation.Constraints.Required;

public class LegacyContactForm {

    @Required(message="name")
    private String name;

    @Required(message="email")
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
