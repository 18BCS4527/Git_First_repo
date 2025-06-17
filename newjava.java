import java.util.List;
import java.util.Map;

public class PreferenceResponse {
    private String personId;
    private List<Preference> preferences;
    private String timestamp;

    // Getters and Setters
    public String getPersonId() {
        return personId;
    }
    public void setPersonId(String personId) {
        this.personId = personId;
    }
    public List<Preference> getPreferences() {
        return preferences;
    }
    public void setPreferences(List<Preference> preferences) {
        this.preferences = preferences;
    }
    public String getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}

class Preference {
    private List<Map<String, Map<String, String>>> service_interruptions;
    private List<Map<String, Map<String, String>>> account_identity;
    private List<Map<String, Map<String, String>>> billing;
    private List<Map<String, Map<String, String>>> appointments;
    private List<Map<String, Map<String, String>>> customer_support;
    private List<Map<String, Map<String, String>>> survey;

    // Getters and Setters
    public List<Map<String, Map<String, String>>> getService_interruptions() {
        return service_interruptions;
    }
    public void setService_interruptions(List<Map<String, Map<String, String>>> service_interruptions) {
        this.service_interruptions = service_interruptions;
    }
    public List<Map<String, Map<String, String>>> getAccount_identity() {
        return account_identity;
    }
    public void setAccount_identity(List<Map<String, Map<String, String>>> account_identity) {
        this.account_identity = account_identity;
    }
    public List<Map<String, Map<String, String>>> getBilling() {
        return billing;
    }
    public void setBilling(List<Map<String, Map<String, String>>> billing) {
        this.billing = billing;
    }
    public List<Map<String, Map<String, String>>> getAppointments() {
        return appointments;
    }
    public void setAppointments(List<Map<String, Map<String, String>>> appointments) {
        this.appointments = appointments;
    }
    public List<Map<String, Map<String, String>>> getCustomer_support() {
        return customer_support;
    }
    public void setCustomer_support(List<Map<String, Map<String, String>>> customer_support) {
        this.customer_support = customer_support;
    }
    public List<Map<String, Map<String, String>>> getSurvey() {
        return survey;
    }
    public void setSurvey(List<Map<String, Map<String, String>>> survey) {
        this.survey = survey;
    }
}
