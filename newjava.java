class Preference {
    private List<ServiceInterruption> service_interruptions;
    private List<AccountIdentity> account_identity;
    private List<Billing> billing;
    private List<Appointment> appointments;
    private List<CustomerSupport> customer_support;
    private List<Survey> survey;

    // Getters and Setters
    public List<ServiceInterruption> getService_interruptions() {
        return service_interruptions;
    }
    public void setService_interruptions(List<ServiceInterruption> service_interruptions) {
        this.service_interruptions = service_interruptions;
    }

    public List<AccountIdentity> getAccount_identity() {
        return account_identity;
    }
    public void setAccount_identity(List<AccountIdentity> account_identity) {
        this.account_identity = account_identity;
    }

    public List<Billing> getBilling() {
        return billing;
    }
    public void setBilling(List<Billing> billing) {
        this.billing = billing;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }
    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }

    public List<CustomerSupport> getCustomer_support() {
        return customer_support;
    }
    public void setCustomer_support(List<CustomerSupport> customer_support) {
        this.customer_support = customer_support;
    }

    public List<Survey> getSurvey() {
        return survey;
    }
    public void setSurvey(List<Survey> survey) {
        this.survey = survey;
    }
}
