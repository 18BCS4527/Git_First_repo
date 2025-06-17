class AccountIdentity {
    private ChangeToAccount change_to_account;
    private SecurityAlerts security_alerts;

    // Getters and Setters
    public ChangeToAccount getChange_to_account() {
        return change_to_account;
    }
    public void setChange_to_account(ChangeToAccount change_to_account) {
        this.change_to_account = change_to_account;
    }

    public SecurityAlerts getSecurity_alerts() {
        return security_alerts;
    }
    public void setSecurity_alerts(SecurityAlerts security_alerts) {
        this.security_alerts = security_alerts;
    }
}


class Billing {
    private AutopayReminder autopay_reminder;
    private PaymentConfirmation payment_confirmation;
    private BillReady bill_ready;
    private OnDemandPayPerViewPurchases on_demand_pay_per_view_purchases;
    private XfinityRewards xfinity_rewards;
}

class Appointment {
    private TechnicianStatusUpdate technician_status_update;
    private AppointmentReminderStatusSchedule appointment_reminder_status_schedule;
}


class CustomerSupport {
    private EquipmentNotifications equipment_notifications;
    private TransferService transfer_service;
    private ChangeOfPlan change_of_plan;
}

class Survey {
    private CustomerSatisfactionSurvey customer_satisfaction_survey;
}
