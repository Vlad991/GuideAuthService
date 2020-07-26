package com.guide.entity.subscription;

public enum SubscriptionPaymentType {
    DAILY("DAILY"),
    MONTHLY("MONTHLY"),
    YEARLY("YEARLY");

    private String type;

    SubscriptionPaymentType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
