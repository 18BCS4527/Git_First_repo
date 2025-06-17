class ServiceInterruption {
    private NetworkMaintenanceServiceImpacts network_maintenance_service_impacts;
    private Outages outages;

    // Getters and Setters
    public NetworkMaintenanceServiceImpacts getNetwork_maintenance_service_impacts() {
        return network_maintenance_service_impacts;
    }
    public void setNetwork_maintenance_service_impacts(NetworkMaintenanceServiceImpacts network_maintenance_service_impacts) {
        this.network_maintenance_service_impacts = network_maintenance_service_impacts;
    }

    public Outages getOutages() {
        return outages;
    }
    public void setOutages(Outages outages) {
        this.outages = outages;
    }
}

class NetworkMaintenanceServiceImpacts {
    private String email;
    private String sms;
    private String quiet_hours;

    // Getters and Setters
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSms() {
        return sms;
    }
    public void setSms(String sms) {
        this.sms = sms;
    }
    public String getQuiet_hours() {
        return quiet_hours;
    }
    public void setQuiet_hours(String quiet_hours) {
        this.quiet_hours = quiet_hours;
    }
}

class Outages {
    private String sms;
    private String quiet_hours;

    // Getters and Setters
    public String getSms() {
        return sms;
    }
    public void setSms(String sms) {
        this.sms = sms;
    }
    public String getQuiet_hours() {
        return quiet_hours;
    }
    public void setQuiet_hours(String quiet_hours) {
        this.quiet_hours = quiet_hours;
    }
}
